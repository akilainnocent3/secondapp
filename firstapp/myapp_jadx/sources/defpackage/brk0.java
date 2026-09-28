package defpackage;

import java.util.Arrays;
import java.util.Comparator;

/* JADX INFO: loaded from: classes4.dex */
public final class brk0 implements Comparator {
    public final /* synthetic */ jok0 a;
    public final /* synthetic */ g3l0 b;

    public brk0(jok0 jok0Var, g3l0 g3l0Var) {
        this.a = jok0Var;
        this.b = g3l0Var;
    }

    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        ipk0 ipk0Var = (ipk0) obj;
        ipk0 ipk0Var2 = (ipk0) obj2;
        if (ipk0Var instanceof bqk0) {
            return !(ipk0Var2 instanceof bqk0) ? 1 : 0;
        }
        if (ipk0Var2 instanceof bqk0) {
            return -1;
        }
        jok0 jok0Var = this.a;
        return jok0Var == null ? ipk0Var.zzc().compareTo(ipk0Var2.zzc()) : (int) r5l0.h(jok0Var.g(this.b, Arrays.asList(ipk0Var, ipk0Var2)).zzd().doubleValue());
    }
}
