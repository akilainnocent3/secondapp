package com.yandex.div.core.widget;

import android.view.View;
import ds.l;
import js.f;
import kotlin.jvm.internal.m0;
import ns.o;
import oy.m;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
final class AppearanceAffectingViewProperty<T> implements f<View, T> {

    @m
    private final l<T, T> modifier;
    private T propertyValue;

    /* JADX WARN: Multi-variable type inference failed */
    public AppearanceAffectingViewProperty(T t10, @m l<? super T, ? extends T> lVar) {
        this.propertyValue = t10;
        this.modifier = lVar;
    }

    @Override // js.f, js.e
    public /* bridge */ /* synthetic */ Object getValue(Object obj, o oVar) {
        return getValue((View) obj, (o<?>) oVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // js.f
    public /* bridge */ /* synthetic */ void setValue(View view, o oVar, Object obj) {
        setValue2(view, (o<?>) oVar, obj);
    }

    public T getValue(@oy.l View view, @oy.l o<?> oVar) {
        return this.propertyValue;
    }

    /* JADX INFO: renamed from: setValue, reason: avoid collision after fix types in other method */
    public void setValue2(@oy.l View view, @oy.l o<?> oVar, T t10) {
        T tInvoke;
        l<T, T> lVar = this.modifier;
        if (lVar != null && (tInvoke = lVar.invoke(t10)) != null) {
            t10 = tInvoke;
        }
        if (m0.g(this.propertyValue, t10)) {
            return;
        }
        this.propertyValue = t10;
        view.invalidate();
    }
}
