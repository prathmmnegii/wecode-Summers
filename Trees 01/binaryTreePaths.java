import java.util.*;
public class binaryTreePaths {

    List<String> paths(Node root){

        List<String> ans= new ArrayList<>();
        dfs(root, ans, "");
        return ans;
    }

    private void dfs(Node root, List<String> ans, String path){

        if(root==null){
            return;
        }

        if(path.length()==0){
            path=String.valueOf(root.val);
        }
        else {
            path+= "->" + root.val;
        }

        if(root.left==null && root.right== null){
            ans.add(path);
            return;
        }

        dfs(root.left, ans, path);
        dfs(root.right, ans, path);
    }
    
}
