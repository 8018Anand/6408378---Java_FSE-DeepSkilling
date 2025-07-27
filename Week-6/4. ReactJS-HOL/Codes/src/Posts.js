import React, { Component } from "react";
import "./Posts.css";

export default class Posts extends Component {
  constructor(props) {
    super(props);
    this.state = { posts: [] };
  }
  loadPost() {
    fetch("https://jsonplaceholder.typicode.com/posts")
      .then((res) => res.json())
      .then((data) => {
        // console.log(data);
        this.setState({ posts: data });
      });
  }
  componentDidMount() {
    this.loadPost();
  }

  componentDidCatch(error, info) {
    return <h1>Error while loading</h1>;
  }
  render() {
    return (
      <div className="container">
        <ul className="box">
          {this.state.posts.map((post) => {
            return (
              <li key={post.id} className="post">
                <strong>{post.title}</strong>
                <br />
                {post.body}
              </li>
            );
          })}
        </ul>
      </div>
    );
  }
}
