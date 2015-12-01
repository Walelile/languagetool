/* LanguageTool, a natural language style checker 
 * Copyright (C) 2015 Daniel Naber (http://www.danielnaber.de)
 * 
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 2.1 of the License, or (at your option) any later version.
 *
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this library; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin St, Fifth Floor, Boston, MA  02110-1301
 * USA
 */
package org.languagetool.rules.ngrams;

/**
 * Probability, but doesn't check for a range of 0 to 1.
 * @since 3.2
 */
public class Probability {

  private final double prob;
  private final float coverage;

  public Probability(double prob, float coverage) {
    if (prob < 0.0) {
      throw new RuntimeException("Probability must be >= 0: " + prob);
    }
    //if (prob > 1.0) {
    //  throw new RuntimeException("Probability must be 0.0 to 1.0: " + prob);
    //}
    this.prob = prob;
    this.coverage = coverage;
  }

  /**
   * A probability-like value, but can be filled with any float >= 0.
   */
  public double getProb() {
    return prob;
  }

  /**
   * The fraction of lookups that had occurrence counts > 0. This
   * might be used to ignore the whole probability for low coverage items.
   */
  public float getCoverage() {
    return coverage;
  }

  @Override
  public String toString() {
    return prob + ", coverage=" + coverage;
  }
}
