package defpackage;

import com.google.gson.reflect.TypeToken;
import com.sporty.android.core.model.json.JsonSerializeService;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import okhttp3.internal.ws.WebSocketProtocol;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.instantwin.presentation.handler.gifthint.InstantWinGiftHintHandlerImpl$initGiftHint$3", f = "InstantWinGiftHintHandlerImpl.kt", l = {WebSocketProtocol.B0_FLAG_RSV1, 68}, m = "invokeSuspend", v = 2)
public final class kfo extends tje0 implements Function2<Unit, v1b<? super Unit>, Object> {
    public wm20 a;
    public JsonSerializeService b;
    public int c;
    public final /* synthetic */ lfo d;
    public final /* synthetic */ String e;

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\t\n\u0000*\u0001\u0000\b\n\u0018\u00002\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00020\u0001¨\u0006\u0005"}, d2 = {"kfo$a", "Lcom/google/gson/reflect/TypeToken;", "", "", "", "instantWin"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final class a extends TypeToken<Map<String, ? extends Long>> {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kfo(lfo lfoVar, String str, v1b<? super kfo> v1bVar) {
        super(2, v1bVar);
        this.d = lfoVar;
        this.e = str;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new kfo(this.d, this.e, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Unit unit, v1b<? super Unit> v1bVar) {
        return ((kfo) create(unit, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0085, code lost:
    
        if (r3.g(r8, r9) == r2) goto L19;
     */
    @Override // defpackage.pz1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            lfo r0 = r8.d
            com.sporty.android.core.model.json.JsonSerializeService r1 = r0.d
            y5b r2 = defpackage.y5b.a
            int r3 = r8.c
            r4 = 0
            r5 = 2
            r6 = 1
            if (r3 == 0) goto L27
            if (r3 == r6) goto L1f
            if (r3 != r5) goto L19
            com.sporty.android.core.model.json.JsonSerializeService r8 = r8.b
            java.util.Map r8 = (java.util.Map) r8
            defpackage.uj50.b(r9)
            goto L88
        L19:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ib5.a(r8)
            return r4
        L1f:
            com.sporty.android.core.model.json.JsonSerializeService r0 = r8.b
            wm20 r3 = r8.a
            defpackage.uj50.b(r9)
            goto L47
        L27:
            defpackage.uj50.b(r9)
            yho r9 = r0.c
            rkd r0 = r9.h
            ohp<java.lang.Object>[] r3 = defpackage.yho.o
            r7 = 6
            r3 = r3[r7]
            wm20 r3 = r0.a(r9, r3)
            r8.a = r3
            r8.b = r1
            r8.c = r6
            java.lang.String r9 = ""
            java.lang.Object r9 = r3.e(r8, r9)
            if (r9 != r2) goto L46
            goto L87
        L46:
            r0 = r1
        L47:
            java.lang.String r9 = (java.lang.String) r9
            kfo$a r6 = new kfo$a
            r6.<init>()
            java.lang.reflect.Type r6 = r6.getType()
            java.lang.Object r9 = r0.fromJson(r9, r6)
            java.util.Map r9 = (java.util.Map) r9
            if (r9 != 0) goto L5f
            o2g r9 = defpackage.o2g.a
            r9.getClass()
        L5f:
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>(r9)
            long r6 = java.lang.System.currentTimeMillis()
            java.lang.Long r9 = new java.lang.Long
            r9.<init>(r6)
            java.lang.String r6 = r8.e
            r0.put(r6, r9)
            kotlin.Unit r9 = kotlin.Unit.a
            java.lang.String r9 = r1.toJson(r0)
            r9.getClass()
            r8.a = r4
            r8.b = r4
            r8.c = r5
            java.lang.Object r8 = r3.g(r8, r9)
            if (r8 != r2) goto L88
        L87:
            return r2
        L88:
            kotlin.Unit r8 = kotlin.Unit.a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kfo.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
