package defpackage;

import com.sporty.android.core.model.config.bo.enums.BOConfigParam;
import com.sportybet.plugin.realsports.data.ROrder;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import okhttp3.internal.http.HttpStatusCodesKt;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lsp20;", "Lihb0;", "africa-bet-android"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class sp20 extends ihb0 {
    public final h940 d;
    public final lq1 e;
    public jvd0 f;
    public final wwd0 i;
    public final v340 v;

    @c0d(c = "com.sportybet.plugin.realsports.viewmodel.PrevBetHistoryViewModel$combineFlow$1", f = "PrevBetHistoryViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class a extends tje0 implements gaj<lk50<? extends ROrder>, String, v1b<? super Pair<? extends lk50<? extends ROrder>, ? extends String>>, Object> {
        public /* synthetic */ lk50 a;
        public /* synthetic */ String b;

        @Override // defpackage.gaj
        public final Object invoke(lk50<? extends ROrder> lk50Var, String str, v1b<? super Pair<? extends lk50<? extends ROrder>, ? extends String>> v1bVar) {
            a aVar = new a(3, v1bVar);
            aVar.a = lk50Var;
            aVar.b = str;
            return aVar.invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            lk50 lk50Var = this.a;
            String str = this.b;
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            return new Pair(lk50Var, str);
        }
    }

    @c0d(c = "com.sportybet.plugin.realsports.viewmodel.PrevBetHistoryViewModel$olderHistoryMonthFlow$1", f = "PrevBetHistoryViewModel.kt", l = {HttpStatusCodesKt.HTTP_PROCESSING, 52}, m = "invokeSuspend", v = 2)
    public static final class b extends tje0 implements Function2<myh<? super String>, v1b<? super Unit>, Object> {
        public BOConfigParam a;
        public String b;
        public myh c;
        public int d;
        public /* synthetic */ Object e;

        public b(v1b<? super b> v1bVar) {
            super(2, v1bVar);
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            b bVar = sp20.this.new b(v1bVar);
            bVar.e = obj;
            return bVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(myh<? super String> myhVar, v1b<? super Unit> v1bVar) {
            return ((b) create(myhVar, v1bVar)).invokeSuspend(Unit.a);
        }

        /* JADX WARN: Code duplicated, block: B:26:0x006f  */
        /* JADX WARN: Code restructure failed: missing block: B:86:0x012a, code lost:
        
            if (r0.emit(r2, r8) == r1) goto L87;
         */
        @Override // defpackage.pz1
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r9) {
            /*
                Method dump skipped, instruction units count: 304
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: sp20.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sp20(h940 h940Var, lq1 lq1Var) {
        super(0);
        h940Var.getClass();
        lq1Var.getClass();
        this.d = h940Var;
        this.e = lq1Var;
        lk50.b bVar = lk50.b.a;
        wwd0 wwd0VarA = xwd0.a(bVar);
        this.i = wwd0VarA;
        this.v = e1i.e(new n1i(e1i.b(wwd0VarA), e1i.e(new or60(new b(null)), o8i0.d(this), new mwd0(0L, Long.MAX_VALUE), "12"), new a(3, null)), o8i0.d(this), new mwd0(0L, Long.MAX_VALUE), new Pair(bVar, "12"));
    }
}
