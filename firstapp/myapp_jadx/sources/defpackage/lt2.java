package defpackage;

import com.sportygames.commons.models.PagingState;
import com.sportygames.commons.models.enums.PagingFetchType;
import com.sportygames.commons.remote.model.HTTPResponse;
import com.sportygames.commons.remote.model.LoadingState;
import com.sportygames.commons.remote.model.ResultWrapper;
import com.sportygames.sportyherov2.remote.models.BetHistoryItem;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Llt2;", "Lj8i0;", "<init>", "()V", "SGLibrary_sportybetRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class lt2 extends j8i0 {
    public final g5c0 a = g5c0.a;
    public final ssw<LoadingState<HTTPResponse<List<BetHistoryItem>>>> b = new ssw<>();
    public final ssw<LoadingState<HTTPResponse<List<BetHistoryItem>>>> c = new ssw<>();
    public final ssw<PagingState> d = new ssw<>();

    @c0d(c = "com.sportygames.sportyherov2.viewmodels.BetHistoryViewModel$getBetHistoryList$1", f = "BetHistoryViewModel.kt", l = {41, 47, 53, 62, 65, 68, 81, 84, 87}, m = "invokeSuspend", v = 1)
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
            return lt2.this.new a(this.e, this.f, this.i, this.v, v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((a) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        /* JADX WARN: Code duplicated, block: B:51:0x0164  */
        /* JADX WARN: Code duplicated, block: B:53:0x0175  */
        /* JADX WARN: Code duplicated, block: B:54:0x017a  */
        /* JADX WARN: Code duplicated, block: B:56:0x017d  */
        /* JADX WARN: Code duplicated, block: B:79:0x0200  */
        /* JADX WARN: Code duplicated, block: B:81:0x0210  */
        /* JADX WARN: Code duplicated, block: B:84:0x0225 A[ADDED_TO_REGION] */
        /* JADX WARN: Code duplicated, block: B:87:0x0259  */
        /* JADX WARN: Code duplicated, block: B:89:0x025d  */
        /* JADX WARN: Code duplicated, block: B:90:0x0286  */
        /* JADX WARN: Code duplicated, block: B:92:0x02be  */
        /* JADX WARN: Code duplicated, block: B:94:0x02c2  */
        /* JADX WARN: Code duplicated, block: B:95:0x02f2  */
        /* JADX WARN: Code restructure failed: missing block: B:20:0x00ab, code lost:
        
            if (r5 == r4) goto L74;
         */
        /* JADX WARN: Code restructure failed: missing block: B:26:0x00d1, code lost:
        
            if (r5 == r4) goto L74;
         */
        /* JADX WARN: Code restructure failed: missing block: B:30:0x00f1, code lost:
        
            if (r5 == r4) goto L74;
         */
        /* JADX WARN: Code restructure failed: missing block: B:36:0x0116, code lost:
        
            if (r5 == r4) goto L74;
         */
        /* JADX WARN: Code restructure failed: missing block: B:42:0x013b, code lost:
        
            if (r5 == r4) goto L74;
         */
        /* JADX WARN: Code restructure failed: missing block: B:46:0x015a, code lost:
        
            if (r5 == r4) goto L74;
         */
        @Override // defpackage.pz1
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r26) {
            /*
                Method dump skipped, instruction units count: 802
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: lt2.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public final void x1(int i, int i2, PagingFetchType pagingFetchType, String str) {
        pagingFetchType.getClass();
        ej5.c(o8i0.d(this), null, null, new a(pagingFetchType, str, i, i2, null), 3);
    }
}
