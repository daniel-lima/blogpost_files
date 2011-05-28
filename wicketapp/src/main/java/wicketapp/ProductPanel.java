package wicketapp;

import org.apache.wicket.behavior.SimpleAttributeModifier;
import org.apache.wicket.markup.html.WebComponent;
import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.markup.html.panel.Panel;
import org.apache.wicket.model.IModel;

public class ProductPanel extends Panel {

	public ProductPanel(String id, Product product) {
		super(id);
		
		//Product product = model.getObject();
		
		WebComponent img = new WebComponent("image");
		String imgUrl = product.getName() + ".jpg";
		img.add(new SimpleAttributeModifier("src", imgUrl));
		add(img);
		
		Label nameLabel = new Label("productname", product.getName());
		add(nameLabel);
		
		Label priceLabel = new Label("price", "$" + product.getPrice().toString());
		add(priceLabel);
	}

}
