package defpackage;

import com.google.gson.reflect.TypeToken;
import com.sportybet.plugin.realsports.data.Event;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportybet.repository.factscenterRepo.FactsCenterRepoImpl$getTodayEvents$1", f = "FactsCenterRepoImpl.kt", l = {68, 82}, m = "invokeSuspend", v = 2)
public final class m8h extends tje0 implements Function2<myh<? super List<? extends Event>>, v1b<? super Unit>, Object> {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ g8h c;
    public final /* synthetic */ String d;

    @Metadata(d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001¨\u0006\u0004"}, d2 = {"m8h$a", "Lcom/google/gson/reflect/TypeToken;", "", "Lcom/sportybet/plugin/realsports/data/Event;", "africa-bet-android"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final class a extends TypeToken<List<? extends Event>> {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m8h(g8h g8hVar, String str, v1b v1bVar) {
        super(2, v1bVar);
        this.c = g8hVar;
        this.d = str;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        m8h m8hVar = new m8h(this.c, this.d, v1bVar);
        m8hVar.b = obj;
        return m8hVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(myh<? super List<? extends Event>> myhVar, v1b<? super Unit> v1bVar) {
        return ((m8h) create(myhVar, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x007c, code lost:
    
        if (r0.emit(r13, r12) == r1) goto L17;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.pz1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) throws java.io.IOException {
        /*
            r13 = this;
            java.lang.Object r0 = r13.b
            myh r0 = (defpackage.myh) r0
            y5b r1 = defpackage.y5b.a
            int r2 = r13.a
            g8h r3 = r13.c
            r4 = 2
            r5 = 1
            r6 = 0
            if (r2 == 0) goto L22
            if (r2 == r5) goto L1d
            if (r2 != r4) goto L17
            defpackage.uj50.b(r14)
            goto L7f
        L17:
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ib5.a(r13)
            return r6
        L1d:
            defpackage.uj50.b(r14)
            r12 = r13
            goto L3d
        L22:
            defpackage.uj50.b(r14)
            z7h r7 = r3.a
            uqm r14 = r3.c
            java.lang.String r9 = r14.getLastUserId()
            r13.b = r0
            r13.a = r5
            java.lang.String r8 = r13.d
            r10 = 1
            r11 = r10
            r12 = r13
            java.lang.Object r14 = r7.D(r8, r9, r10, r11, r12)
            if (r14 != r1) goto L3d
            goto L7e
        L3d:
            com.sporty.android.common.network.data.BaseResponse r14 = (com.sporty.android.common.network.data.BaseResponse) r14
            boolean r13 = r14.hasData()
            if (r13 == 0) goto L82
            T r13 = r14.data
            com.sportybet.plugin.realsports.data.MapArrayData r13 = (com.sportybet.plugin.realsports.data.MapArrayData) r13
            bcp r14 = r13.value
            java.util.HashMap<java.lang.String, java.lang.String> r13 = r13.keys
            bcp r13 = defpackage.p5p.a(r13, r14)
            mpe0 r14 = r3.f
            java.lang.Object r14 = r14.getValue()
            eal r14 = (defpackage.eal) r14
            m8h$a r2 = new m8h$a
            r2.<init>()
            java.lang.reflect.Type r2 = r2.getType()
            r14.getClass()
            com.google.gson.reflect.TypeToken r2 = com.google.gson.reflect.TypeToken.get(r2)
            yep r3 = new yep
            r3.<init>(r13)
            java.lang.Object r13 = r14.c(r3, r2)
            java.util.List r13 = (java.util.List) r13
            r12.b = r6
            r12.a = r4
            java.lang.Object r13 = r0.emit(r13, r12)
            if (r13 != r1) goto L7f
        L7e:
            return r1
        L7f:
            kotlin.Unit r13 = kotlin.Unit.a
            return r13
        L82:
            java.lang.String r13 = r14.message
            defpackage.i08.a(r13)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.m8h.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
