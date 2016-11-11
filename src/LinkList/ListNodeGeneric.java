/**
 * Created by Palko on 20/03/2016.
 */
package LinkList;
public class ListNodeGeneric<T> {

    public T data;
    public ListNodeGeneric next;

    public ListNodeGeneric(T data) {
        this.data = data;
    }

    public ListNodeGeneric(T data, ListNodeGeneric next) {
        this.data = data;
        this.next = next;
    }
}