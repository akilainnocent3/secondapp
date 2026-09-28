package defpackage;

import android.net.Uri;
import android.os.Bundle;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import com.sporty.android.core.model.MyLog;
import com.sporty.android.permission.PermissionActivity;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b'\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Li12;", "Lpy1;", "<init>", "()V", "africa-bet-android"}, k = 1, mv = {2, 4, 0}, xi = 48)
public abstract class i12 extends py1 {
    public static final /* synthetic */ int f = 0;
    public ValueCallback<Uri[]> b;
    public ee<Uri> c;
    public ee<String[]> d;
    public final mpe0 a = hwr.b(new g12(this, 0));
    public final ArrayList e = new ArrayList();

    public abstract String[] A1();

    public final void B1(ValueCallback<Uri[]> valueCallback, WebChromeClient.FileChooserParams fileChooserParams) {
        ValueCallback<Uri[]> valueCallback2 = this.b;
        if (valueCallback2 != null) {
            valueCallback2.onReceiveValue(null);
        }
        this.b = valueCallback;
        if (fileChooserParams != null && fileChooserParams.isCaptureEnabled()) {
            PermissionActivity.z1(this, new String[]{"android.permission.CAMERA"}, new h12(this));
            return;
        }
        ee<String[]> eeVar = this.d;
        if (eeVar != null) {
            eeVar.b(A1());
        } else {
            Intrinsics.n("fileChooserLauncher");
            throw null;
        }
    }

    @Override // defpackage.py1, defpackage.r1k, defpackage.hrl, androidx.fragment.app.e, defpackage.rn8, defpackage.yn8, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.c = registerForActivityResult(new de(), new ud() { // from class: e12
            @Override // defpackage.ud
            public final void a(Object obj) {
                Uri[] uriArr;
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                int i = i12.f;
                itf0.a aVar = itf0.a;
                aVar.q(MyLog.TAG_FILE_PROVIDER);
                aVar.l("take picture result: " + zBooleanValue, new Object[0]);
                i12 i12Var = this.a;
                ValueCallback<Uri[]> valueCallback = i12Var.b;
                if (valueCallback != null) {
                    if (zBooleanValue) {
                        Object value = i12Var.a.getValue();
                        value.getClass();
                        uriArr = new Uri[]{(Uri) value};
                    } else {
                        uriArr = null;
                    }
                    valueCallback.onReceiveValue(uriArr);
                }
                i12Var.b = null;
            }
        });
        this.d = registerForActivityResult(new wd(), new ud() { // from class: f12
            @Override // defpackage.ud
            public final void a(Object obj) {
                Uri uri = (Uri) obj;
                int i = i12.f;
                itf0.a aVar = itf0.a;
                aVar.q(MyLog.TAG_FILE_PROVIDER);
                aVar.l("get file content result: " + uri, new Object[0]);
                i12 i12Var = this.a;
                if (uri != null) {
                    i12Var.e.add(new qlh0(uri));
                }
                ValueCallback<Uri[]> valueCallback = i12Var.b;
                if (valueCallback != null) {
                    valueCallback.onReceiveValue(uri != null ? new Uri[]{uri} : null);
                }
                i12Var.b = null;
            }
        });
    }

    @Override // defpackage.py1, defpackage.hrl, defpackage.fq0, androidx.fragment.app.e, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        this.b = null;
    }

    public abstract String z1();
}
