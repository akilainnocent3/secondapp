package yads;

import android.net.Uri;
import android.view.View;
import com.ironsource.C4235d4;
import java.util.LinkedHashMap;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class zh0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final pu f158815a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public qu f158816b;

    public zh0(pu puVar) {
        this.f158815a = puVar;
    }

    public final void a(Uri uri, View view) {
        LinkedHashMap linkedHashMap;
        ui uiVar;
        View.OnClickListener onClickListener;
        String queryParameter = uri.getQueryParameter("assetName");
        if (queryParameter != null) {
            String queryParameter2 = uri.getQueryParameter(C4235d4.i.L);
            pu puVar = null;
            Integer numP1 = queryParameter2 != null ? cv.j0.p1(queryParameter2) : null;
            if (numP1 == null) {
                puVar = this.f158815a;
            } else {
                qu quVar = this.f158816b;
                if (quVar != null && (linkedHashMap = quVar.f154603b) != null) {
                    puVar = (pu) linkedHashMap.get(numP1);
                }
            }
            if (puVar == null || (uiVar = puVar.f154129b) == null || (onClickListener = (View.OnClickListener) uiVar.f156449a.get(queryParameter)) == null) {
                return;
            }
            onClickListener.onClick(view);
        }
    }
}
