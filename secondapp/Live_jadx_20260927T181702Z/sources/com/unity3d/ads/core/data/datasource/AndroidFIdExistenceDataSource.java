package com.unity3d.ads.core.data.datasource;

import dr.i1;
import dr.j1;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s1;
import oy.l;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
@s1({"SMAP\nAndroidFIdExistenceDataSource.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidFIdExistenceDataSource.kt\ncom/unity3d/ads/core/data/datasource/AndroidFIdExistenceDataSource\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,8:1\n1#2:9\n*E\n"})
public final class AndroidFIdExistenceDataSource implements FIdExistenceDataSource {

    @l
    private final String className;

    public AndroidFIdExistenceDataSource(@l String className) {
        m0.p(className, "className");
        this.className = className;
    }

    @Override // com.unity3d.ads.core.data.datasource.FIdExistenceDataSource
    public boolean invoke() {
        Object objB;
        try {
            i1.a aVar = i1.f79460c;
            objB = i1.b(Class.forName(this.className));
        } catch (Throwable th2) {
            i1.a aVar2 = i1.f79460c;
            objB = i1.b(j1.a(th2));
        }
        return i1.j(objB);
    }
}
