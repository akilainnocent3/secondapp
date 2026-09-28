package defpackage;

import com.sporty.android.common_analytics.opentelemetry.TraceSamplingConfig;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public final class ts60 implements tqa0 {
    public final m4z a;
    public final TraceSamplingConfig b;

    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[xzd0.values().length];
            try {
                iArr[2] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[0] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            a = iArr;
        }
    }

    public ts60(m4z m4zVar, TraceSamplingConfig traceSamplingConfig) {
        traceSamplingConfig.getClass();
        this.a = m4zVar;
        this.b = traceSamplingConfig;
    }

    @Override // defpackage.tqa0
    public final rm8 k0(List list) {
        ArrayList arrayListA = kw5.a(list);
        for (Object obj : list) {
            xzd0 statusCode = ((rqa0) obj).getStatus().getStatusCode();
            int i = statusCode == null ? -1 : a.a[statusCode.ordinal()];
            TraceSamplingConfig traceSamplingConfig = this.b;
            if (i == 1) {
                lx30.INSTANCE.getClass();
                if (lx30.b.b() < Double.parseDouble(traceSamplingConfig.getError())) {
                    arrayListA.add(obj);
                }
            } else if (i != 2) {
                lx30.INSTANCE.getClass();
                if (lx30.b.b() < Double.parseDouble(traceSamplingConfig.getOk())) {
                    arrayListA.add(obj);
                }
            } else {
                lx30.INSTANCE.getClass();
                if (lx30.b.b() < Double.parseDouble(traceSamplingConfig.getUnset())) {
                    arrayListA.add(obj);
                }
            }
        }
        if (!arrayListA.isEmpty()) {
            return this.a.k0(arrayListA);
        }
        rm8 rm8Var = rm8.e;
        rm8Var.getClass();
        return rm8Var;
    }

    @Override // defpackage.tqa0
    public final rm8 shutdown() {
        rm8 rm8VarA = this.a.b.a();
        rm8VarA.getClass();
        return rm8VarA;
    }
}
