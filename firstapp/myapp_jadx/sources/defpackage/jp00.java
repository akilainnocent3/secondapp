package defpackage;

import android.net.Uri;
import android.widget.Toast;
import com.sporty.android.permission.PermissionActivity;
import com.sportybet.android.gp.tz.R;
import com.sportybet.android.share.presentation.activity.ShareCodeActivity;
import com.sportygames.commons.remote.model.HTTPResponse;
import com.sportygames.commons.remote.model.LoadingState;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class jp00 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ jp00(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        List list;
        int i = this.a;
        int size = 0;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                kq00 kq00Var = (kq00) obj2;
                String str = (String) obj;
                wuw<bba0> wuwVar = kq00Var.F;
                str.getClass();
                uqm uqmVar = kq00Var.e;
                if (!uqmVar.isLogin()) {
                    bba0.b bVar = new bba0.b(new bba0.h(str, true));
                    wuwVar.getClass();
                    wuwVar.a.c(bVar);
                } else if (uqmVar.hasPersonalPage()) {
                    kq00Var.B.a(sbd0.a, k00.d);
                    kzh.d(new g1i(bm50.a(new tfa0(kq00Var.i.a.l(str))), new jq00(kq00Var, str, null)), o8i0.d(kq00Var));
                } else {
                    bba0.a aVar = new bba0.a(uqmVar.getLastNickName(), null);
                    wuwVar.getClass();
                    wuwVar.a.c(aVar);
                }
                return Unit.a;
            case 1:
                nn40 nn40Var = (nn40) obj2;
                LoadingState loadingState = (LoadingState) obj;
                if (nn40.a.a[loadingState.getStatus().ordinal()] == 1) {
                    HTTPResponse hTTPResponse = (HTTPResponse) loadingState.getData();
                    if (hTTPResponse != null && (list = (List) hTTPResponse.getData()) != null) {
                        size = list.size();
                    }
                    if (size > 0) {
                        HTTPResponse hTTPResponse2 = (HTTPResponse) loadingState.getData();
                        nn40Var.I = hTTPResponse2 != null ? (List) hTTPResponse2.getData() : null;
                    }
                }
                return Unit.a;
            default:
                ShareCodeActivity shareCodeActivity = (ShareCodeActivity) obj2;
                dha0 dha0Var = (dha0) obj;
                int i2 = ShareCodeActivity.j0;
                if (dha0Var instanceof dha0.e) {
                    wha0.d(shareCodeActivity, (dha0.e) dha0Var, new rz80(shareCodeActivity));
                } else if (dha0Var instanceof dha0.g) {
                    dha0.g gVar = (dha0.g) dha0Var;
                    shareCodeActivity.O = gVar.c;
                    wha0.b(shareCodeActivity, gVar, shareCodeActivity.i0);
                } else if (dha0Var instanceof dha0.a) {
                    wha0.a(shareCodeActivity, (dha0.a) dha0Var);
                } else if (dha0Var instanceof dha0.f) {
                    String strB = ((dha0.f) dha0Var).a;
                    if (StringsKt.U(strB)) {
                        strB = sn5.b(shareCodeActivity, R.string.common_feedback__sorry_something_went_wrong, new Object[0]);
                    }
                    if (!StringsKt.U(strB)) {
                        Toast.makeText(shareCodeActivity, strB, 0).show();
                    }
                    shareCodeActivity.finish();
                } else if (dha0Var instanceof dha0.d) {
                    Uri uri = shareCodeActivity.G;
                    if (uri != null || shareCodeActivity.H != null || shareCodeActivity.I != null) {
                        PermissionActivity.z1(shareCodeActivity, new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"}, new ebn(shareCodeActivity, ay0.v(new Uri[]{uri, shareCodeActivity.H, shareCodeActivity.I})));
                    }
                } else if (dha0Var instanceof dha0.b) {
                    yrh0.e(((dha0.b) dha0Var).a);
                } else {
                    if (!(dha0Var instanceof dha0.c)) {
                        uhc.a();
                        return null;
                    }
                    wha0.e(shareCodeActivity, (dha0.c) dha0Var);
                }
                return Unit.a;
        }
    }
}
