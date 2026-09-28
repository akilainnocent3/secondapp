package defpackage;

import androidx.work.c;
import androidx.work.d;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.UUID;
import kotlin.collections.CollectionsKt;
import kotlin.text.StringsKt__StringsKt;

/* JADX INFO: loaded from: classes.dex */
public abstract class jwj0 {
    public final UUID a;
    public final owj0 b;
    public final LinkedHashSet c;

    public static abstract class a<B extends a<B, ?>, W extends jwj0> {
        public UUID a;
        public owj0 b;
        public final LinkedHashSet c;

        public a(Class<? extends d> cls) {
            UUID uuidRandomUUID = UUID.randomUUID();
            uuidRandomUUID.getClass();
            this.a = uuidRandomUUID;
            String string = this.a.toString();
            string.getClass();
            this.b = new owj0(string, (jvj0) null, cls.getName(), (String) null, (c) null, (c) null, 0L, 0L, 0L, (lxa) null, 0, (nt1) null, 0L, 0L, 0L, 0L, false, (x7z) null, 0, 0L, 0, 0, (String) null, 16777210);
            String[] strArr = {cls.getName()};
            LinkedHashSet linkedHashSet = new LinkedHashSet(jpu.a(1));
            ay0.M(strArr, linkedHashSet);
            this.c = linkedHashSet;
        }

        public final W a() {
            W w = (W) b();
            lxa lxaVar = this.b.j;
            boolean z = !lxaVar.i.isEmpty() || lxaVar.e || lxaVar.c || lxaVar.d;
            owj0 owj0Var = this.b;
            if (owj0Var.q) {
                if (z) {
                    hb5.a("Expedited jobs only support network and storage constraints");
                    return null;
                }
                if (owj0Var.g > 0) {
                    hb5.a("Expedited jobs cannot be delayed");
                    return null;
                }
            }
            if (owj0Var.x == null) {
                List listSplit$default = StringsKt__StringsKt.split$default(owj0Var.c, new String[]{"."}, false, 0, 6, null);
                String strK = listSplit$default.size() == 1 ? (String) listSplit$default.get(0) : (String) CollectionsKt.b0(listSplit$default);
                if (strK.length() > 127) {
                    strK = wae0.K(127, strK);
                }
                owj0Var.x = strK;
            }
            UUID uuidRandomUUID = UUID.randomUUID();
            uuidRandomUUID.getClass();
            this.a = uuidRandomUUID;
            String string = uuidRandomUUID.toString();
            string.getClass();
            owj0 owj0Var2 = this.b;
            this.b = new owj0(string, owj0Var2.b, owj0Var2.c, owj0Var2.d, new c(owj0Var2.e), new c(owj0Var2.f), owj0Var2.g, owj0Var2.h, owj0Var2.i, new lxa(owj0Var2.j), owj0Var2.k, owj0Var2.l, owj0Var2.m, owj0Var2.n, owj0Var2.o, owj0Var2.p, owj0Var2.q, owj0Var2.r, owj0Var2.s, owj0Var2.u, owj0Var2.v, owj0Var2.w, owj0Var2.x, 524288);
            return w;
        }

        public abstract W b();
    }

    public jwj0(UUID uuid, owj0 owj0Var, LinkedHashSet linkedHashSet) {
        uuid.getClass();
        this.a = uuid;
        this.b = owj0Var;
        this.c = linkedHashSet;
    }
}
