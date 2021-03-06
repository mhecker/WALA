package com.ibm.wala.analysis.arraybounds.hypergraph;

import java.util.HashSet;
import java.util.Set;

import com.ibm.wala.analysis.arraybounds.hypergraph.DirectedHyperGraph;
import com.ibm.wala.analysis.arraybounds.hypergraph.HyperNode;
import com.ibm.wala.analysis.arraybounds.hypergraph.weight.edgeweights.EdgeWeight;

/**
 * A DirectedHyperEdge is an edge of a {@link DirectedHyperGraph}.
 *
 * @author Stephan Gocht {@code <stephan@gobro.de>}
 *
 * @param <T>
 *            Type used in HyperNodes (HyperNode<T>)
 */
public class DirectedHyperEdge<T> {
	/** Contains all destinations of this HyperEdge */
	private final Set<HyperNode<T>> tail;
	/** Contains multiple sources of this HyperEdge */
	private final Set<HyperNode<T>> head;
	private EdgeWeight weight;

	public DirectedHyperEdge() {
		this.tail = new HashSet<HyperNode<T>>();
		this.head = new HashSet<HyperNode<T>>();
	}

	public Set<HyperNode<T>> getDestination() {
		return this.head;
	}

	public Set<HyperNode<T>> getSource() {
		return this.tail;
	}

	public EdgeWeight getWeight() {
		return this.weight;
	}

	public void setWeight(EdgeWeight weight) {
		this.weight = weight;
	}

}
