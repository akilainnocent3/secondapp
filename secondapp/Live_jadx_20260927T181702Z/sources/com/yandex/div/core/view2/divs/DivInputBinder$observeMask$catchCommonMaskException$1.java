package com.yandex.div.core.view2.divs;

import com.yandex.div.core.view2.errors.ErrorCollector;
import dr.w2;
import ds.p;
import java.util.regex.PatternSyntaxException;
import kotlin.jvm.internal.o0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public final class DivInputBinder$observeMask$catchCommonMaskException$1 extends o0 implements p<Exception, ds.a<? extends w2>, w2> {
    final /* synthetic */ ErrorCollector $errorCollector;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DivInputBinder$observeMask$catchCommonMaskException$1(ErrorCollector errorCollector) {
        super(2);
        this.$errorCollector = errorCollector;
    }

    @Override // ds.p
    public /* bridge */ /* synthetic */ w2 invoke(Exception exc, ds.a<? extends w2> aVar) {
        invoke2(exc, (ds.a<w2>) aVar);
        return w2.f79517a;
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(@oy.l Exception exc, @oy.l ds.a<w2> aVar) {
        if (!(exc instanceof PatternSyntaxException)) {
            aVar.invoke();
            return;
        }
        this.$errorCollector.logError(new IllegalArgumentException("Invalid regex pattern '" + ((PatternSyntaxException) exc).getPattern() + "'."));
    }
}
