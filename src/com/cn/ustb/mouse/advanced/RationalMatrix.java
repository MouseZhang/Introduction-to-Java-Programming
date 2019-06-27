package com.cn.ustb.mouse.advanced;
import com.cn.ustb.mouse.basic.Rational;

public class RationalMatrix extends GenericMatrix<Rational> {
	@Override
	protected Rational add(Rational r1, Rational r2) {
		return r1.add(r2);
	}
	
	@Override
	protected Rational multiply(Rational r1, Rational r2) {
		return r1.multiply(r2);
	}
	
	@Override
	protected Rational zero() {
		return new Rational(0, 1);
	}

}
