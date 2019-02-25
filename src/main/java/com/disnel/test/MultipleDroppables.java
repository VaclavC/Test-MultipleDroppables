package com.disnel.test;

import org.apache.wicket.request.mapper.parameter.PageParameters;

import com.googlecode.wicket.jquery.ui.interaction.draggable.DraggableAdapter;
import com.googlecode.wicket.jquery.ui.interaction.draggable.DraggableBehavior;
import com.googlecode.wicket.jquery.ui.interaction.droppable.DroppableAdapter;
import com.googlecode.wicket.jquery.ui.interaction.droppable.DroppableBehavior;
import org.apache.wicket.Component;
import org.apache.wicket.ajax.AjaxRequestTarget;
import org.apache.wicket.markup.html.WebMarkupContainer;
import org.apache.wicket.markup.html.WebPage;

public class MultipleDroppables extends WebPage
{
	private static final long serialVersionUID = 1L;

	public MultipleDroppables(final PageParameters parameters)
	{
		super(parameters);
		
		add(new WebMarkupContainer("DragSource")
				.add(new DraggableBehavior(new DraggableAdapter())));
		
		
		add(new WebMarkupContainer("Droppable1")
				.add(new DroppableBehavior("*", new DroppableAdapter()
				{
					private static final long serialVersionUID = 1L;

					@Override
					public void onDrop(AjaxRequestTarget target, Component component)
					{
						System.out.println("Drop 1");
					}
				})));
		
		add(new WebMarkupContainer("Droppable2")
				.add(new DroppableBehavior("*", new DroppableAdapter()
				{
					private static final long serialVersionUID = 1L;

					@Override
					public void onDrop(AjaxRequestTarget target, Component component)
					{
						System.out.println("Drop 2");
					}
				})));
		
	}
}
