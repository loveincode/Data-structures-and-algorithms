package data_structures.data06_tree.Binarytree;

public class TreeNode {
	// 左节点
	private TreeNode lefTreeNode;
	// 右节点
	private TreeNode rightNode;
	// 数据
	private int value;

	private boolean isDelete;

	public TreeNode getLefTreeNode() {
		return lefTreeNode;
	}

	public void setLefTreeNode(TreeNode lefTreeNode) {
		this.lefTreeNode = lefTreeNode;
	}

	public TreeNode getRightNode() {
		return rightNode;
	}

	public void setRightNode(TreeNode rightNode) {
		this.rightNode = rightNode;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public boolean isDelete() {
		return isDelete;
	}

	public void setDelete(boolean isDelete) {
		this.isDelete = isDelete;
	}

	public TreeNode() {
		super();
	}

	public TreeNode(int value) {
		this(null, null, value, false);
	}

	public TreeNode(TreeNode lefTreeNode, TreeNode rightNode, int value, boolean isDelete) {
		super();
		this.lefTreeNode = lefTreeNode;
		this.rightNode = rightNode;
		this.value = value;
		this.isDelete = isDelete;
	}

	@Override
	public String toString() {
		return "TreeNode [lefTreeNode=" + lefTreeNode + ", rightNode=" + rightNode + ", value=" + value + ", isDelete="
				+ isDelete + "]";
	}
}
