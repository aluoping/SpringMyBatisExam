package mode;

import java.util.Date;

public class Store {
	private int store_id;
	private int manager_staff_id;
	private Address address_id;
	private Date last_update;
	public int getStore_id() {
		return store_id;
	}
	public void setStore_id(int store_id) {
		this.store_id = store_id;
	}
	public int getManager_staff_id() {
		return manager_staff_id;
	}
	public void setManager_staff_id(int manager_staff_id) {
		this.manager_staff_id = manager_staff_id;
	}
	public Address getAddress_id() {
		return address_id;
	}
	public void setAddress_id(Address address_id) {
		this.address_id = address_id;
	}
	public Date getLast_update() {
		return last_update;
	}
	public void setLast_update(Date last_update) {
		this.last_update = last_update;
	}
	@Override
	public String toString() {
		return "Store [store_id=" + store_id + ", manager_staff_id=" + manager_staff_id + ", address_id=" + address_id
				+ ", last_update=" + last_update + "]";
	}
	
}
