package defpackage;

import androidx.compose.runtime.m;
import com.sportybet.android.auth.AccountHelperEntryPointImpl;
import com.sportybet.integrity.DeviceIntegrityActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class s4a implements Function0 {
    public final /* synthetic */ int a;

    public /* synthetic */ s4a(int i) {
        this.a = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.a) {
            case 0:
                return Unit.a;
            case 1:
                int i = DeviceIntegrityActivity.b;
                AccountHelperEntryPointImpl accountHelperEntryPointImpl = yrh0.a;
                System.exit(0);
                return Unit.a;
            default:
                return m.b(Boolean.FALSE);
        }
    }
}
