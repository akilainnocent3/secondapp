package defpackage;

import androidx.compose.ui.draw.ShadowGraphicsLayerElement;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class kx80 extends qlr implements Function1<a7l, Unit> {
    public final /* synthetic */ ShadowGraphicsLayerElement a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kx80(ShadowGraphicsLayerElement shadowGraphicsLayerElement) {
        super(1);
        this.a = shadowGraphicsLayerElement;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(a7l a7lVar) {
        a7l a7lVar2 = a7lVar;
        ShadowGraphicsLayerElement shadowGraphicsLayerElement = this.a;
        a7lVar2.t(a7lVar2.C1(shadowGraphicsLayerElement.b));
        a7lVar2.A1(shadowGraphicsLayerElement.c);
        a7lVar2.l(shadowGraphicsLayerElement.d);
        a7lVar2.h(shadowGraphicsLayerElement.e);
        a7lVar2.n(shadowGraphicsLayerElement.f);
        return Unit.a;
    }
}
