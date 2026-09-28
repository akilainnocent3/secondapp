package defpackage;

import com.sporty.android.core.model.security.otp.OtpChannelsResponse;
import com.sporty.android.platform.features.newotp.model.OtpSelectionGroup;
import java.util.ArrayList;
import kotlin.Unit;

/* JADX INFO: loaded from: classes5.dex */
public final class a7z implements lyh<OtpSelectionGroup> {
    public final /* synthetic */ lyh a;
    public final /* synthetic */ c7z b;

    @c0d(c = "com.sporty.android.platform.features.newotp.otpselector.OtpSelectorViewModel$getOtpSelection$$inlined$map$1", f = "OtpSelectorViewModel.kt", l = {109}, m = "collect", v = 2)
    public static final class a extends x1b {
        public /* synthetic */ Object a;
        public int b;

        public a(v1b v1bVar) {
            super(v1bVar);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            this.a = obj;
            this.b |= Integer.MIN_VALUE;
            return a7z.this.collect(null, this);
        }
    }

    public static final class b<T> implements myh {
        public final /* synthetic */ myh a;
        public final /* synthetic */ c7z b;

        @c0d(c = "com.sporty.android.platform.features.newotp.otpselector.OtpSelectorViewModel$getOtpSelection$$inlined$map$1$2", f = "OtpSelectorViewModel.kt", l = {69, 50}, m = "emit", v = 2)
        public static final class a extends x1b {
            public /* synthetic */ Object a;
            public int b;
            public myh d;
            public OtpChannelsResponse e;
            public ArrayList f;

            public a(v1b v1bVar) {
                super(v1bVar);
            }

            @Override // defpackage.pz1
            public final Object invokeSuspend(Object obj) {
                this.a = obj;
                this.b |= Integer.MIN_VALUE;
                return b.this.emit(null, this);
            }
        }

        public b(myh myhVar, c7z c7zVar) {
            this.a = myhVar;
            this.b = c7zVar;
        }

        /* JADX WARN: Code duplicated, block: B:46:0x00c3  */
        /* JADX WARN: Code duplicated, block: B:49:0x00d5  */
        /* JADX WARN: Code duplicated, block: B:61:0x00ea A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:64:0x00bd A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:66:0x00e5 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        /* JADX WARN: Code restructure failed: missing block: B:57:0x0113, code lost:
        
            if (r2.emit(r4, r0) == r1) goto L58;
         */
        @Override // defpackage.myh
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object emit(java.lang.Object r12, defpackage.v1b r13) {
            /*
                Method dump skipped, instruction units count: 281
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: a7z.b.emit(java.lang.Object, v1b):java.lang.Object");
        }
    }

    public a7z(lyh lyhVar, c7z c7zVar) {
        this.a = lyhVar;
        this.b = c7zVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.lyh
    public final Object collect(myh<? super OtpSelectionGroup> myhVar, v1b v1bVar) {
        a aVar;
        if (v1bVar instanceof a) {
            aVar = (a) v1bVar;
            int i = aVar.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                aVar.b = i - Integer.MIN_VALUE;
            } else {
                aVar = new a(v1bVar);
            }
        } else {
            aVar = new a(v1bVar);
        }
        Object obj = aVar.a;
        y5b y5bVar = y5b.a;
        int i2 = aVar.b;
        if (i2 == 0) {
            uj50.b(obj);
            b bVar = new b(myhVar, this.b);
            aVar.b = 1;
            if (this.a.collect(bVar, aVar) == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i2 != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(obj);
        }
        return Unit.a;
    }
}
