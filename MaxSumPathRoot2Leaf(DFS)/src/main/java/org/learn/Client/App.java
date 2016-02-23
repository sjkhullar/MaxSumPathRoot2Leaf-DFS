package org.learn.Client;

import org.learn.Question.MaxSumPathRoot2Leaf;
import org.learn.Question.Node;

public class App {
	public static void main(String[] args) {
		Node root = Node.createNode(50);
		root.left = Node.createNode(30);
		root.right = Node.createNode(30);
		// left sub tree
		root.left.left = Node.createNode(40);
		root.left.right = Node.createNode(10);

		// right subtree
		root.right.left = Node.createNode(30);
		root.right.right = Node.createNode(60);

		int[] path = new int[512];
		MaxSumPathRoot2Leaf.maxSumPath(root, path);
	}
}
