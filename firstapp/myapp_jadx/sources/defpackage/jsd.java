package defpackage;

import android.view.View;
import com.sporty.android.core.model.pocket.common.AssetData;
import com.sportybet.plugin.myfavorite.widget.viewholder.MyTeamLeftViewHolder;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class jsd implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ jsd(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                tud tudVarS0 = ((usd) obj2).P0();
                AssetData.CardsBean cardsBean = ((kg6) obj).a;
                cardsBean.getClass();
                ej5.c(o8i0.d(tudVarS0), null, null, new fud(null, tudVarS0, cardsBean), 3);
                break;
            default:
                ((MyTeamLeftViewHolder) obj2).lambda$setData$0((j2x) obj, view);
                break;
        }
    }
}
