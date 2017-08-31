package data_structures.data06_tree.Binarytree;

public class Main {

	public static void main(String[] args) {

		BinaryTree tree = new BinaryTree();
		// 添加数据测试
		tree.insert(5); //G
		tree.insert(2); //D
		tree.insert(7); //M
		tree.insert(1); //A
		tree.insert(4); //F
		tree.insert(3); //E
		tree.insert(6); //H
		tree.insert(8); //Z
		/**
		 * 
		 * 				  G					5
		 * 				/  \			   /  \
		 *            D     M			  2	    7
		 *           / \   / \ 			 / \   / \ 
		 *          A   F H   Z	        1  4  6   8
		 * 			   /				  /	
		 * 			  E					 3
		 * 
		 * 前 根左右 GDAFEMHZ 52143768
		 * 中 左根右 ADEFGHMZ 12345678
		 * 后 左右根 AEFDHZMG 13426875
		 * 
		 */
		System.out.println("root=" + tree.getRoot().getValue());
		// 排序测试 中序排序
		System.out.print("中序排序:");
		tree.inOrder(tree.getRoot());
		System.out.println();
		// 排序测试 前序排序
		System.out.print("前序排序:");
		tree.PreOrder(tree.getRoot());
		System.out.println();
		// 排序测试 后序排序
		System.out.print("后序排序:");
		tree.PostOrder(tree.getRoot());
		System.out.println();
		
		// 查找测试
		if (tree.find(10) != null) {
			System.out.println("找到了");
		} else {
			System.out.println("没找到");
		}

	}
}