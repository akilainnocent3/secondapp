package defpackage;

import java.util.ArrayList;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
public final class dpk implements Function1<Integer, Object> {
    public final /* synthetic */ bpk a;
    public final /* synthetic */ ArrayList b;

    public dpk(bpk bpkVar, ArrayList arrayList) {
        this.a = bpkVar;
        this.b = arrayList;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Integer num) {
        return this.a.invoke(this.b.get(num.intValue()));
    }
}
