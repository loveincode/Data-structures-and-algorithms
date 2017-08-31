package data_structures.data06_tree.Binarytree;

public class BinaryTree {
	
	// 根节点
	private TreeNode root;
	public TreeNode getRoot() {
		return root;
	}

	/**
	 * 插入操作
	 * 
	 * @param value
	 */
	public void insert(int value) {
		TreeNode newNode = new TreeNode(value);
		if (root == null) {
			root = newNode;
			root.setLefTreeNode(null);
			root.setRightNode(null);
		} else {
			TreeNode currentNode = root;
			TreeNode parentNode;
			while (true) {
				parentNode = currentNode;
				// 往右放
				if (newNode.getValue() > currentNode.getValue()) {
					currentNode = currentNode.getRightNode();
					if (currentNode == null) {
						parentNode.setRightNode(newNode);
						return;
					}
				} else {
					// 往左放
					currentNode = currentNode.getLefTreeNode();
					if (currentNode == null) {
						parentNode.setLefTreeNode(newNode);
						return;
					}
				}
			}
		}
	}

	/**
	 * 查找
	 * 
	 * @param key
	 * @return
	 */
	public TreeNode find(int key) {
		TreeNode currentNode = root;
		if (currentNode != null) {
			while (currentNode.getValue() != key) {
				if (currentNode.getValue() > key) {
					currentNode = currentNode.getLefTreeNode();
				} else {
					currentNode = currentNode.getRightNode();
				}
				if (currentNode == null) {
					return null;
				}

			}
			if (currentNode.isDelete()) {
				return null;
			} else {
				return currentNode;
			}

		} else {
			return null;
		}

	}

	/**
	 * 中序遍历  左根右
	 * 
	 * @param treeNode
	 */
	public void inOrder(TreeNode treeNode) {
		if (treeNode != null && treeNode.isDelete() == false) {
			inOrder(treeNode.getLefTreeNode());
			System.out.print("-" + treeNode.getValue());
			inOrder(treeNode.getRightNode());
		}
	}
	
	/**
	 * 前序遍历 根左右
	 * 
	 * @param treeNode
	 */
	public void PreOrder(TreeNode treeNode) {
		if (treeNode != null && treeNode.isDelete() == false) {
			System.out.print("-" + treeNode.getValue());
			PreOrder(treeNode.getLefTreeNode());
			PreOrder(treeNode.getRightNode());
		}
	}
	
	/**
	 * 前序遍历 左右根
	 * 
	 * @param treeNode
	 */
	public void PostOrder(TreeNode treeNode) {
		if (treeNode != null && treeNode.isDelete() == false) {
			PostOrder(treeNode.getLefTreeNode());
			PostOrder(treeNode.getRightNode());
			System.out.print("-" + treeNode.getValue());
		}
	}

}
