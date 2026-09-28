package defpackage;

import androidx.fragment.app.Fragment;
import com.sportygames.lobby.remote.models.BannerDetailResponse;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class hx1 extends yxi {
    public final List<BannerDetailResponse> y;
    public final cvj z;

    public hx1(List list, Fragment fragment, cvj cvjVar) {
        super(fragment);
        this.y = list;
        this.z = cvjVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.f
    public final int getItemCount() {
        return this.y.size();
    }

    @Override // defpackage.yxi
    public final Fragment k(int i) {
        List<BannerDetailResponse> list = this.y;
        BannerDetailResponse bannerDetailResponse = list.get(i);
        list.size();
        bannerDetailResponse.getClass();
        cvj cvjVar = this.z;
        cvjVar.getClass();
        px1 px1Var = new px1();
        px1Var.c = bannerDetailResponse;
        px1Var.d = cvjVar;
        px1Var.e = i;
        return px1Var;
    }
}
