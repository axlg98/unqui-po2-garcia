package ar.edu.unq.po2.composite;

import java.util.List;

public interface IShapeShifte{
	public IShapeShifte compose(IShapeShifte shapeShifter);
	public int deepest();
	public IShapeShifte flat();
	public List<Integer> values();
	
}
