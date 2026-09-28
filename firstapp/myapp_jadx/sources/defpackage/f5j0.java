package defpackage;

import com.google.gson.reflect.TypeToken;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sporty.android.platform.features.welcomereward.WelcomeRewardViewModel$handleAction$3", f = "WelcomeRewardViewModel.kt", l = {554, 615, 559}, m = "invokeSuspend", v = 2)
public final class f5j0 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public String a;
    public o2g b;
    public w4j0 c;
    public int d;
    public final /* synthetic */ w4j0 e;

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"com/sporty/android/platform/features/welcomereward/WelcomeRewardViewModel$parseCache$1$1", "Lcom/google/gson/reflect/TypeToken;", "y4j0", "sportyplatform"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final class a extends TypeToken<Map<String, ? extends Boolean>> {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f5j0(v1b v1bVar, w4j0 w4j0Var) {
        super(2, v1bVar);
        this.e = w4j0Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new f5j0(v1bVar, this.e);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((f5j0) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code duplicated, block: B:28:0x008b  */
    /* JADX WARN: Code duplicated, block: B:31:0x008f  */
    /* JADX WARN: Code duplicated, block: B:37:0x006b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00be, code lost:
    
        if (r10.g(r9, r1) == r0) goto L34;
     */
    @Override // defpackage.pz1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            r9 = this;
            y5b r0 = defpackage.y5b.a
            int r1 = r9.d
            r2 = 6
            r3 = 3
            r4 = 2
            r5 = 1
            w4j0 r6 = r9.e
            r7 = 0
            if (r1 == 0) goto L2c
            if (r1 == r5) goto L28
            if (r1 == r4) goto L1e
            if (r1 != r3) goto L18
            defpackage.uj50.b(r10)
            goto Lc1
        L18:
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ib5.a(r9)
            return r7
        L1e:
            w4j0 r1 = r9.c
            o2g r4 = r9.b
            java.lang.String r5 = r9.a
            defpackage.uj50.b(r10)
            goto L62
        L28:
            defpackage.uj50.b(r10)
            goto L3b
        L2c:
            defpackage.uj50.b(r10)
            mgb0 r10 = r6.c
            r9.d = r5
            java.lang.Object r10 = r10.getUserId(r9)
            if (r10 != r0) goto L3b
            goto Lc0
        L3b:
            r5 = r10
            java.lang.String r5 = (java.lang.String) r5
            w1j0 r10 = r6.b
            rkd r1 = r10.h
            ohp<java.lang.Object>[] r8 = defpackage.w1j0.i
            r8 = r8[r2]
            wm20 r10 = r1.a(r10, r8)
            o2g r1 = defpackage.o2g.a
            r1.getClass()
            r9.a = r5
            r9.b = r1
            r9.c = r6
            r9.d = r4
            java.lang.String r4 = ""
            java.lang.Object r10 = r10.e(r9, r4)
            if (r10 != r0) goto L60
            goto Lc0
        L60:
            r4 = r1
            r1 = r6
        L62:
            java.lang.String r10 = (java.lang.String) r10
            boolean r8 = kotlin.text.StringsKt.U(r10)
            if (r8 == 0) goto L6b
            goto L90
        L6b:
            zi50$a r8 = defpackage.zi50.b     // Catch: java.lang.Throwable -> L7d
            com.sporty.android.core.model.json.JsonSerializeService r1 = r1.d     // Catch: java.lang.Throwable -> L7d
            f5j0$a r8 = new f5j0$a     // Catch: java.lang.Throwable -> L7d
            r8.<init>()     // Catch: java.lang.Throwable -> L7d
            java.lang.reflect.Type r8 = r8.getType()     // Catch: java.lang.Throwable -> L7d
            java.lang.Object r10 = r1.fromJson(r10, r8)     // Catch: java.lang.Throwable -> L7d
            goto L86
        L7d:
            r10 = move-exception
            zi50$a r1 = defpackage.zi50.b
            zi50$b r1 = new zi50$b
            r1.<init>(r10)
            r10 = r1
        L86:
            boolean r1 = r10 instanceof zi50.b
            if (r1 == 0) goto L8c
            r10 = r7
        L8c:
            if (r10 != 0) goto L8f
            goto L90
        L8f:
            r4 = r10
        L90:
            java.util.Map r4 = (java.util.Map) r4
            w1j0 r10 = r6.b
            rkd r1 = r10.h
            ohp<java.lang.Object>[] r8 = defpackage.w1j0.i
            r2 = r8[r2]
            wm20 r10 = r1.a(r10, r2)
            java.util.LinkedHashMap r1 = defpackage.kpu.m(r4)
            java.lang.Boolean r2 = java.lang.Boolean.TRUE
            r1.put(r5, r2)
            kotlin.Unit r2 = kotlin.Unit.a
            r9.a = r7
            r9.b = r7
            r9.c = r7
            r9.d = r3
            com.sporty.android.core.model.json.JsonSerializeService r2 = r6.d
            java.lang.String r1 = r2.toJson(r1)
            r1.getClass()
            java.lang.Object r9 = r10.g(r9, r1)
            if (r9 != r0) goto Lc1
        Lc0:
            return r0
        Lc1:
            kotlin.Unit r9 = kotlin.Unit.a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.f5j0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
