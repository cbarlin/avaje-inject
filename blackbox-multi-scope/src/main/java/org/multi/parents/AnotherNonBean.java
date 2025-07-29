package org.multi.parents;

import io.avaje.inject.RequiresBean;
import jakarta.inject.Singleton;
import org.multi.scope.Mod3Scope;
import org.multi.scope.Mod4Scope;

@Singleton
@Mod3Scope
@RequiresBean({NotABean.class})
public class AnotherNonBean {
  private final NotABean notABean;
  public AnotherNonBean(final NotABean notABean) {
    this.notABean = notABean;
  }
}
