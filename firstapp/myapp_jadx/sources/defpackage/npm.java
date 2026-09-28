package defpackage;

import androidx.compose.runtime.m;
import java.util.UUID;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import okhttp3.MediaType;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class npm implements Function0 {
    public final /* synthetic */ int a;

    public /* synthetic */ npm(int i) {
        this.a = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.a) {
            case 0:
                return MediaType.INSTANCE.get("application/x-binary");
            case 1:
                return UUID.randomUUID();
            case 2:
                return m.b(Boolean.FALSE);
            default:
                return Unit.a;
        }
    }
}
