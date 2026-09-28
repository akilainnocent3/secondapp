package defpackage;

import com.sporty.android.core.model.config.bo.BOConfigValueBundle;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;

/* JADX INFO: loaded from: classes6.dex */
public final class i200 implements lyh<HashMap<String, Integer>> {
    public final /* synthetic */ vl50 a;
    public final /* synthetic */ tag b;
    public final /* synthetic */ k200 c;
    public final /* synthetic */ log0 d;
    public final /* synthetic */ List e;

    @c0d(c = "com.sportybet.feature.payment.impl.common.data.repository.PayConfigRepositoryImpl$getTradeRemoteFlow$$inlined$map$1", f = "PayConfigRepositoryImpl.kt", l = {109}, m = "collect", v = 2)
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
            return i200.this.collect(null, this);
        }
    }

    public static final class b<T> implements myh {
        public final /* synthetic */ myh a;
        public final /* synthetic */ tag b;
        public final /* synthetic */ k200 c;
        public final /* synthetic */ log0 d;
        public final /* synthetic */ List e;

        @c0d(c = "com.sportybet.feature.payment.impl.common.data.repository.PayConfigRepositoryImpl$getTradeRemoteFlow$$inlined$map$1$2", f = "PayConfigRepositoryImpl.kt", l = {94, 50}, m = "emit", v = 2)
        public static final class a extends x1b {
            public /* synthetic */ Object a;
            public int b;
            public myh d;
            public BOConfigValueBundle e;
            public Collection f;
            public Iterator i;
            public Collection v;
            public Integer w;

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

        public b(myh myhVar, tag tagVar, k200 k200Var, log0 log0Var, List list) {
            this.a = myhVar;
            this.b = tagVar;
            this.c = k200Var;
            this.d = log0Var;
            this.e = list;
        }

        /* JADX WARN: Code duplicated, block: B:19:0x0069  */
        /* JADX WARN: Code duplicated, block: B:21:0x007a  */
        /* JADX WARN: Code duplicated, block: B:22:0x007f  */
        /* JADX WARN: Code duplicated, block: B:25:0x0092  */
        /* JADX WARN: Code duplicated, block: B:27:0x0096  */
        /* JADX WARN: Code duplicated, block: B:28:0x009a  */
        /* JADX WARN: Code duplicated, block: B:30:0x009e  */
        /* JADX WARN: Code duplicated, block: B:33:0x00a8  */
        /* JADX WARN: Code duplicated, block: B:34:0x00ab  */
        /* JADX WARN: Code duplicated, block: B:36:0x00b7  */
        /* JADX WARN: Code duplicated, block: B:38:0x00bb  */
        /* JADX WARN: Code duplicated, block: B:40:0x00bf  */
        /* JADX WARN: Code duplicated, block: B:42:0x00c4  */
        /* JADX WARN: Code duplicated, block: B:44:0x00c8  */
        /* JADX WARN: Code duplicated, block: B:45:0x00ce  */
        /* JADX WARN: Code duplicated, block: B:47:0x00da  */
        /* JADX WARN: Code duplicated, block: B:49:0x00de  */
        /* JADX WARN: Code duplicated, block: B:52:0x00e3  */
        /* JADX WARN: Code duplicated, block: B:54:0x00e7  */
        /* JADX WARN: Code duplicated, block: B:55:0x00ed  */
        /* JADX WARN: Code duplicated, block: B:57:0x00f9  */
        /* JADX WARN: Code duplicated, block: B:59:0x00fd  */
        /* JADX WARN: Code duplicated, block: B:62:0x0102  */
        /* JADX WARN: Code duplicated, block: B:64:0x0106  */
        /* JADX WARN: Code duplicated, block: B:65:0x010c  */
        /* JADX WARN: Code duplicated, block: B:67:0x0118  */
        /* JADX WARN: Code duplicated, block: B:69:0x011c  */
        /* JADX WARN: Code duplicated, block: B:72:0x0121  */
        /* JADX WARN: Code duplicated, block: B:74:0x0125  */
        /* JADX WARN: Code duplicated, block: B:75:0x012c  */
        /* JADX WARN: Code duplicated, block: B:77:0x0138 A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:78:0x013a  */
        /* JADX WARN: Code duplicated, block: B:79:0x0140  */
        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        /* JADX WARN: Code duplicated, block: B:80:0x0142  */
        /* JADX WARN: Code duplicated, block: B:86:0x016c  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:86:0x016c -> B:87:0x016e). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // defpackage.myh
        public final java.lang.Object emit(java.lang.Object r12, defpackage.v1b r13) {
            /*
                Method dump skipped, instruction units count: 439
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: i200.b.emit(java.lang.Object, v1b):java.lang.Object");
        }
    }

    public i200(vl50 vl50Var, uag uagVar, k200 k200Var, log0 log0Var, List list) {
        this.a = vl50Var;
        this.b = uagVar;
        this.c = k200Var;
        this.d = log0Var;
        this.e = list;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.lyh
    public final Object collect(myh<? super HashMap<String, Integer>> myhVar, v1b v1bVar) {
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
            b bVar = new b(myhVar, this.b, this.c, this.d, this.e);
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
