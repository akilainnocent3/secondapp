package defpackage;

import java.io.File;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public final class zqc extends qlr implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ zqc(Object obj, int i) {
        super(0);
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.a) {
            case 0:
                return ((l1e0) ((yqc) this.b).j.getValue()).e();
            default:
                Object obj = skh.e;
                File file = (File) this.b;
                synchronized (obj) {
                    skh.d.remove(file.getAbsolutePath());
                }
                return Unit.a;
        }
    }
}
