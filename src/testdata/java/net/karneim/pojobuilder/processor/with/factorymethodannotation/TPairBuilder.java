package net.karneim.pojobuilder.processor.with.factorymethodannotation;

import javax.annotation.Generated;

@Generated("PojoBuilder")
public class TPairBuilder<T>
    implements Cloneable {
  protected TPairBuilder<T> self;
  protected T value$left$T;
  protected boolean isSet$left$T;
  protected T value$right$T;
  protected boolean isSet$right$T;

  /**
   * Creates a new {@link TPairBuilder}.
   */
  public TPairBuilder() {
    self = (TPairBuilder<T>)this;
  }

  /**
   * Sets the default value for the {@link Pair#left} property.
   *
   * @param value the default value
   * @return this builder
   */
  public TPairBuilder<T> withLeft(T value) {
    this.value$left$T = value;
    this.isSet$left$T = true;
    return self;
  }

  /**
   * Sets the default value for the {@link Pair#right} property.
   *
   * @param value the default value
   * @return this builder
   */
  public TPairBuilder<T> withRight(T value) {
    this.value$right$T = value;
    this.isSet$right$T = true;
    return self;
  }

  /**
   * Returns a clone of this builder.
   *
   * @return the clone
   */
  @Override
  public Object clone() {
    try {
      @SuppressWarnings("unchecked")
      TPairBuilder<T> result = (TPairBuilder<T>)super.clone();
      result.self = result;
      return result;
    } catch (CloneNotSupportedException e) {
      throw new InternalError(e.getMessage());
    }
  }

  /**
   * Returns a clone of this builder.
   *
   * @return the clone
   */
  @SuppressWarnings("unchecked")
  public TPairBuilder<T> but() {
    return (TPairBuilder<T>)clone();
  }

  /**
   * Creates a new {@link Pair} based on this builder's settings.
   *
   * @return the created Pair
   */
  public Pair<T, T> build() {
    try {
      Pair<T, T> result = PairFactory.createStringPair(value$left$T, value$right$T);
      return result;
    } catch (RuntimeException ex) {
      throw ex;
    } catch (Exception ex) {
      throw new java.lang.reflect.UndeclaredThrowableException(ex);
    }
  }
}
