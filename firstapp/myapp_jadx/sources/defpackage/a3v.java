package defpackage;

import com.sportybet.android.instantwin.newtork.model.response.EventData;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class a3v extends pf implements jaj<hqc, String, gqn, Boolean, v1b<? super png>, Object> {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.jaj
    public final Object l(hqc hqcVar, String str, gqn gqnVar, Boolean bool, v1b<? super png> v1bVar) {
        hqc hqcVar2 = hqcVar;
        String str2 = str;
        gqn gqnVar2 = gqnVar;
        boolean zBooleanValue = bool.booleanValue();
        ((m3v) this.a).getClass();
        if (zBooleanValue) {
            return png.d.a;
        }
        if (hqcVar2 instanceof lqc) {
            return png.d.a;
        }
        if (hqcVar2 instanceof kqc) {
            return new png.b(((kqc) hqcVar2).c);
        }
        if (hqcVar2 instanceof jqc) {
            return png.a.a;
        }
        if (!(hqcVar2 instanceof nqc)) {
            return null;
        }
        T t = ((nqc) hqcVar2).a;
        if (!(t instanceof EventData)) {
            return new png.b(null);
        }
        gqn.a aVar = gqnVar2 instanceof gqn.a ? (gqn.a) gqnVar2 : null;
        return new png.c((EventData) t, str2, aVar != null ? aVar.a : aqn.a);
    }
}
