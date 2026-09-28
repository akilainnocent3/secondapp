package defpackage;

import com.google.protobuf.DescriptorProtos;
import com.sportygames.commons.models.PagingState;
import com.sportygames.commons.models.enums.PagingFetchType;
import com.sportygames.commons.remote.model.HTTPResponse;
import com.sportygames.commons.remote.model.LoadingState;
import com.sportygames.commons.remote.model.ResultWrapper;
import com.sportygames.evenodd.remote.models.BetHistoryItem;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lnt2;", "Lj8i0;", "<init>", "()V", "SGLibrary_sportybetRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class nt2 extends j8i0 {
    public final hhg a = hhg.a;
    public final ssw<LoadingState<HTTPResponse<List<BetHistoryItem>>>> b = new ssw<>();
    public final ssw<PagingState> c = new ssw<>();

    @c0d(c = "com.sportygames.evenodd.viewmodels.BetHistoryViewModel$getBetHistoryList$1", f = "BetHistoryViewModel.kt", l = {32, 35, DescriptorProtos.FileOptions.PHP_GENERIC_SERVICES_FIELD_NUMBER}, m = "invokeSuspend", v = 1)
    public static final class a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public ResultWrapper.Success a;
        public int b;
        public int c;
        public final /* synthetic */ PagingFetchType e;
        public final /* synthetic */ int f;
        public final /* synthetic */ int i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(PagingFetchType pagingFetchType, int i, int i2, v1b<? super a> v1bVar) {
            super(2, v1bVar);
            this.e = pagingFetchType;
            this.f = i;
            this.i = i2;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return nt2.this.new a(this.e, this.f, this.i, v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((a) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        /* JADX WARN: Code duplicated, block: B:37:0x00dd  */
        /* JADX WARN: Code duplicated, block: B:39:0x00ed  */
        /* JADX WARN: Code duplicated, block: B:40:0x00f3  */
        /* JADX WARN: Code duplicated, block: B:47:0x0116  */
        /* JADX WARN: Code duplicated, block: B:49:0x013e  */
        /* JADX WARN: Code duplicated, block: B:51:0x0142  */
        /* JADX WARN: Code duplicated, block: B:52:0x0156  */
        /* JADX WARN: Code restructure failed: missing block: B:15:0x0073, code lost:
        
            if (r5 == r4) goto L33;
         */
        /* JADX WARN: Code restructure failed: missing block: B:19:0x0090, code lost:
        
            if (r5 == r4) goto L33;
         */
        @Override // defpackage.pz1
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r23) {
            /*
                Method dump skipped, instruction units count: 447
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: nt2.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public final void x1(int i, int i2, PagingFetchType pagingFetchType) {
        pagingFetchType.getClass();
        ej5.c(o8i0.d(this), null, null, new a(pagingFetchType, i, i2, null), 3);
    }
}
