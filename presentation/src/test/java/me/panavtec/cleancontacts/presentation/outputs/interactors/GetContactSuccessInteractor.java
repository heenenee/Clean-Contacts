package me.panavtec.cleancontacts.presentation.outputs.interactors;

import me.panavtec.cleancontacts.presentation.outputs.entities.Contact;
import me.panavtec.cleancontacts.presentation.outputs.interactors.contacts.GetContactInteractor;
import me.panavtec.cleancontacts.presentation.outputs.interactors.contacts.exceptions.ObtainContactException;

public class GetContactSuccessInteractor extends GetContactInteractor {

  private String contactMd5;

  public GetContactSuccessInteractor() {
    super(null);
  }

  @Override public void setData(String contactMd5) {
    super.setData(contactMd5);
    this.contactMd5 = contactMd5;
  }

  @Override public Contact call() throws ObtainContactException {
    Contact contact = new Contact();
    contact.setMd5(contactMd5);
    return contact;
  }
}
