package defpackage;

import com.sportygames.commons.models.PagingState;
import com.sportygames.commons.models.enums.PagingFetchType;
import com.sportygames.commons.remote.model.HTTPResponse;
import com.sportygames.commons.remote.model.LoadingState;
import com.sportygames.commons.remote.model.ResultWrapper;
import com.sportygames.crash.remote.models.BetHistoryItem;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import okhttp3.internal.ws.WebSocketProtocol;

/* JADX INFO: loaded from: classes7.dex */
public final class vt2 extends j8i0 {
    public final rsm a;
    public final ssw<LoadingState<HTTPResponse<List<BetHistoryItem>>>> b;
    public final ssw<PagingState> c;
    public final ssw<LoadingState<HTTPResponse<List<BetHistoryItem>>>> d;

    @c0d(c = "com.sportygames.crash.viewmodel.BetHistoryViewModel$getBetHistoryList$1", f = "BetHistoryViewModel.kt", l = {40, 46, 52, 61, WebSocketProtocol.B0_FLAG_RSV1, 67, 78}, m = "invokeSuspend", v = 1)
    public static final class a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public ResultWrapper.Success a;
        public int b;
        public int c;
        public final /* synthetic */ PagingFetchType e;
        public final /* synthetic */ String f;
        public final /* synthetic */ int i;
        public final /* synthetic */ int v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(PagingFetchType pagingFetchType, String str, int i, int i2, v1b<? super a> v1bVar) {
            super(2, v1bVar);
            this.e = pagingFetchType;
            this.f = str;
            this.i = i;
            this.v = i2;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return vt2.this.new a(this.e, this.f, this.i, this.v, v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((a) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        /* JADX WARN: Code duplicated, block: B:49:0x00e0  */
        /* JADX WARN: Code duplicated, block: B:51:0x00f1  */
        /* JADX WARN: Code duplicated, block: B:52:0x00f6  */
        /* JADX WARN: Code duplicated, block: B:54:0x00f9  */
        /* JADX WARN: Code duplicated, block: B:62:0x0114  */
        /* JADX WARN: Code duplicated, block: B:64:0x0124  */
        /* JADX WARN: Code duplicated, block: B:70:0x016c  */
        /* JADX WARN: Code duplicated, block: B:72:0x0170  */
        /* JADX WARN: Code duplicated, block: B:73:0x0199  */
        /* JADX WARN: Code duplicated, block: B:75:0x01d1  */
        /* JADX WARN: Code duplicated, block: B:77:0x01d5  */
        /* JADX WARN: Code duplicated, block: B:78:0x01fd  */
        /* JADX WARN: Code restructure failed: missing block: B:18:0x0081, code lost:
        
            if (r5 == r4) goto L58;
         */
        /* JADX WARN: Code restructure failed: missing block: B:24:0x0095, code lost:
        
            if (r5 == r4) goto L58;
         */
        /* JADX WARN: Code restructure failed: missing block: B:28:0x00a3, code lost:
        
            if (r5 == r4) goto L58;
         */
        /* JADX WARN: Code restructure failed: missing block: B:34:0x00b7, code lost:
        
            if (r5 == r4) goto L58;
         */
        /* JADX WARN: Code restructure failed: missing block: B:40:0x00ca, code lost:
        
            if (r5 == r4) goto L58;
         */
        /* JADX WARN: Code restructure failed: missing block: B:44:0x00d7, code lost:
        
            if (r5 == r4) goto L58;
         */
        @Override // defpackage.pz1
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r22) {
            /*
                Method dump skipped, instruction units count: 554
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: vt2.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public vt2(rsm rsmVar) {
        rsmVar.getClass();
        this.a = rsmVar;
        this.b = new ssw<>();
        this.c = new ssw<>();
        this.d = new ssw<>();
    }

    public final void x1(int i, int i2, PagingFetchType pagingFetchType, String str) {
        pagingFetchType.getClass();
        ej5.c(o8i0.d(this), null, null, new a(pagingFetchType, str, i, i2, null), 3);
    }
}
