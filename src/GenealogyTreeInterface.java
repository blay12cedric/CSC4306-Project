import java.util.ArrayList;

public interface GenealogyTreeInterface {
    /**
     * @return a node after it has been
     * added to the right level according to
     * the parent name that was attributed
     */
    NodeInterface addChild(NodeInterface child, int level, String parentName);

    /**
     * @return a node after it insert it at a level according
     * to the parent's name
     */
    NodeInterface insertChild(NodeInterface child, int level, String parentName);

    /**
     * @return a collection of nodes
     * by searching the tree with $first_name
     * and $last_name attributes
     */
    ArrayList<NodeInterface> findIndividual(String firstName, String lastName);

    /**
     * @return a collection of all nodes direct
     * grand parent of selected node
     */
    ArrayList<NodeInterface> findAllGrandParents(NodeInterface child);

    /**
     * @return a collection of all nodes direct
     * grand father of selected node
     */
    ArrayList<NodeInterface> findAllGrandfathers(NodeInterface child);

    /**
     * @return a collection of all nodes direct
     * grand mother of selected node
     */
    ArrayList<NodeInterface> findAllGrandMothers(NodeInterface child);

    /**
     * @return a collection of all nodes
     * grand parent of selected node per tree level
     */
    ArrayList<NodeInterface> findAllGrandParentsPerLevel(NodeInterface child, int level);

    /**
     * @update the information of a specific individual
     * found per tree level and per full name
     */
    NodeInterface modifyInformation(String firstName, String lastName, int level);
    // Ideally there will be here a prompt to modify the specific information we need modified

    /**
     * @delete a specific individual from the tree
     */
    NodeInterface deleteIndividual(String firstName, String lastName, int level);

    /**
     * //TODO
     * @add node interactively by filling node until a condition is met
     * // METHODS
     *     public Node<T> interactiveNodeAdd(){
     *         System.out.println("Welcome to the Node creation program:");
     *         Scanner input = new Scanner(System.in);
     *         Person person = new Person();
     *         person = person.interactiveCreation();
     *         Node<T> node = new Node<T>();
     *         return node;
     *     }
     *
     */
}
