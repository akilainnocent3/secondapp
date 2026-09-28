package com.sportygames.newcms;

import defpackage.c0d;
import defpackage.tje0;
import defpackage.uj50;
import defpackage.v1b;
import defpackage.y5b;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportygames.newcms.CMSUseCase$downloadPage$2$1$1", f = "CMSUseCase.kt", l = {}, m = "invokeSuspend", v = 1)
public final class e extends tje0 implements Function2<d.b, v1b<? super Unit>, Object> {
    public /* synthetic */ Object a;
    public final /* synthetic */ String b;
    public final /* synthetic */ LinkedHashMap c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(String str, LinkedHashMap linkedHashMap, v1b v1bVar) {
        super(2, v1bVar);
        this.b = str;
        this.c = linkedHashMap;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        e eVar = new e(this.b, this.c, v1bVar);
        eVar.a = obj;
        return eVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(d.b bVar, v1b<? super Unit> v1bVar) {
        return ((e) create(bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        d.b bVar = (d.b) this.a;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        String strA0 = StringsKt.a0(bVar.a, this.b + "__");
        LinkedHashMap linkedHashMap = this.c;
        Set setKeySet = linkedHashMap.keySet();
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : setKeySet) {
            if (Intrinsics.g(((CMSRes.Data) obj2).d, strA0)) {
                arrayList.add(obj2);
            }
        }
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj3 = arrayList.get(i);
            i++;
            linkedHashMap.put((CMSRes.Data) obj3, bVar.b);
        }
        return Unit.a;
    }
}
