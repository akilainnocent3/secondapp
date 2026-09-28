package com.sportybet.plugin.myfavorite.widget.viewholder;

import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.sportybet.android.gp.tz.R;
import com.sportybet.plugin.myfavorite.util.MyFavoriteTypeEnum;
import com.sportybet.plugin.realsports.data.MyFavoriteTeam;
import defpackage.czw;
import defpackage.gr0;
import defpackage.izw;
import defpackage.lfb0;
import defpackage.mfb0;
import defpackage.rww;
import defpackage.sh8;
import defpackage.u1h;

/* JADX INFO: loaded from: classes6.dex */
public class MyFavoriteViewHolder extends BaseViewHolder {
    private final ImageView favoriteIcon;
    private final RelativeLayout favoriteItem;
    private final int iconColor;
    private final TextView message;
    private final TextView subTitle;
    private final TextView title;

    public class a implements View.OnClickListener {
        public final /* synthetic */ rww a;

        public a(rww rwwVar) {
            this.a = rwwVar;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            rww rwwVar = this.a;
            if (rwwVar.g != null) {
                boolean z = rwwVar.c;
                rwwVar.c = !z;
                MyFavoriteViewHolder myFavoriteViewHolder = MyFavoriteViewHolder.this;
                if (z) {
                    myFavoriteViewHolder.showToast(rwwVar.a, rwwVar.b);
                }
                rwwVar.g.z(myFavoriteViewHolder.getAdapterPosition(), rwwVar);
            }
        }
    }

    public MyFavoriteViewHolder(View view) {
        super(view);
        this.favoriteItem = (RelativeLayout) view.findViewById(R.id.favorite_item);
        this.favoriteIcon = (ImageView) view.findViewById(R.id.favorite_icon);
        this.title = (TextView) view.findViewById(R.id.title);
        this.subTitle = (TextView) view.findViewById(R.id.sub_title);
        this.message = (TextView) view.findViewById(R.id.message);
        this.iconColor = view.getContext().getColor(R.color.absolute_type2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void showToast(MyFavoriteTypeEnum myFavoriteTypeEnum, String str) {
        boolean zN;
        MyFavoriteTypeEnum myFavoriteTypeEnum2 = MyFavoriteTypeEnum.SPORT;
        if (myFavoriteTypeEnum == myFavoriteTypeEnum2) {
            zN = izw.a.a().q(str);
        } else {
            zN = myFavoriteTypeEnum == MyFavoriteTypeEnum.LEAGUE ? izw.a.a().n(str) : false;
        }
        if (zN) {
            czw.a(myFavoriteTypeEnum == myFavoriteTypeEnum2 ? R.string.my_favourites_settings__leagues_and_teams_removed : R.string.my_favourites_settings__teams_from_this_league_removed);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setData(rww rwwVar) {
        mfb0 mfb0VarE;
        String str = rwwVar.f;
        String str2 = rwwVar.e;
        String str3 = rwwVar.b;
        MyFavoriteTypeEnum myFavoriteTypeEnum = rwwVar.a;
        if (TextUtils.isEmpty(str)) {
            try {
                if (myFavoriteTypeEnum == MyFavoriteTypeEnum.TEAM || myFavoriteTypeEnum == MyFavoriteTypeEnum.SEARCH_TEAM) {
                    this.favoriteIcon.setImageDrawable(gr0.a(this.itemView.getContext(), R.drawable.ic_default_league_logo_home));
                } else if (myFavoriteTypeEnum == MyFavoriteTypeEnum.LEAGUE) {
                    this.favoriteIcon.setImageDrawable(gr0.a(this.itemView.getContext(), R.drawable.ic_default_league_logo_away));
                } else if (myFavoriteTypeEnum == MyFavoriteTypeEnum.SPORT) {
                    mfb0 mfb0VarE2 = lfb0.d().e(str3);
                    if (mfb0VarE2 instanceof u1h) {
                        sh8.a().a(((u1h) mfb0VarE2).b.iconUrl, this.favoriteIcon);
                    } else if (mfb0VarE2 != null) {
                        ImageView imageView = this.favoriteIcon;
                        imageView.getContext();
                        Drawable drawableD = mfb0VarE2.d();
                        int i = this.iconColor;
                        if (drawableD != null) {
                            try {
                                drawableD.mutate();
                                drawableD.setTint(i);
                            } catch (Exception unused) {
                                drawableD = null;
                            }
                        } else {
                            drawableD = null;
                        }
                        imageView.setImageDrawable(drawableD);
                    }
                }
            } catch (Exception unused2) {
                this.favoriteIcon.setImageDrawable(null);
            }
        } else {
            sh8.a().a(rwwVar.f, this.favoriteIcon);
        }
        this.favoriteItem.setSelected(rwwVar.c);
        this.title.setText(rwwVar.d);
        if (myFavoriteTypeEnum == MyFavoriteTypeEnum.SPORT && (mfb0VarE = lfb0.d().e(str3)) != null) {
            this.title.setText(mfb0VarE.c().e(this.itemView.getContext()));
        }
        this.message.setVisibility(8);
        if (myFavoriteTypeEnum == MyFavoriteTypeEnum.SEARCH_TEAM || myFavoriteTypeEnum == MyFavoriteTypeEnum.ACTION_BAR_SEARCH_TEAM) {
            T t = rwwVar.i;
            if (t instanceof MyFavoriteTeam) {
                mfb0 mfb0VarE3 = lfb0.d().e(((MyFavoriteTeam) t).sportId);
                if (mfb0VarE3 != null) {
                    this.message.setText(mfb0VarE3.c().e(this.itemView.getContext()));
                    this.message.setVisibility(0);
                }
            }
        }
        boolean zIsEmpty = TextUtils.isEmpty(str2);
        TextView textView = this.subTitle;
        if (zIsEmpty) {
            textView.setVisibility(8);
        } else {
            textView.setVisibility(0);
            this.subTitle.setText(str2);
        }
        this.favoriteIcon.setAlpha(rwwVar.c ? 1.0f : 0.5f);
        this.favoriteIcon.setVisibility(rwwVar.h ? 0 : 8);
        this.favoriteItem.setOnClickListener(new a(rwwVar));
    }
}
