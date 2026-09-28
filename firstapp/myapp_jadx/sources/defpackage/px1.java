package defpackage;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.e;
import androidx.media3.exoplayer.ExoPlayer;
import androidx.media3.exoplayer.d;
import androidx.media3.ui.PlayerView;
import com.sportybet.android.gp.tz.R;
import com.sportygames.lobby.remote.models.BannerDetailResponse;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.collections.b;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lpx1;", "Ll12;", "Ljct;", "Lqx1;", "<init>", "()V", "SGLibrary_sportybetRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class px1 extends l12<jct, qx1> {
    public BannerDetailResponse c;
    public cvj d;
    public int e;
    public d f;

    public static final class a implements so10.c {
        public final /* synthetic */ qx1 a;
        public final /* synthetic */ Context b;

        public a(qx1 qx1Var, Context context) {
            this.a = qx1Var;
            this.b = context;
        }

        @Override // so10.c
        public final void q(int i) {
            qx1 qx1Var = this.a;
            if (i == 2) {
                if (qx1Var != null) {
                    qx1Var.c.setVisibility(0);
                }
                if (qx1Var != null) {
                    qx1Var.d.setVisibility(8);
                }
                if (qx1Var != null) {
                    qx1Var.c.startAnimation(AnimationUtils.loadAnimation(this.b, R.anim.rotate_progress));
                    return;
                }
                return;
            }
            if (i != 3) {
                return;
            }
            if (qx1Var != null) {
                qx1Var.c.clearAnimation();
            }
            if (qx1Var != null) {
                qx1Var.c.setVisibility(8);
            }
            if (qx1Var != null) {
                qx1Var.d.setVisibility(0);
            }
        }
    }

    @Override // defpackage.l12
    public final g6i0 o0() {
        View viewInflate = getLayoutInflater().inflate(R.layout.banner_image, (ViewGroup) null, false);
        int i = R.id.iv_image;
        AppCompatImageView appCompatImageView = (AppCompatImageView) h5e.a(R.id.iv_image, viewInflate);
        if (appCompatImageView != null) {
            i = R.id.pbLoading;
            ImageView imageView = (ImageView) h5e.a(R.id.pbLoading, viewInflate);
            if (imageView != null) {
                i = R.id.playerView;
                PlayerView playerView = (PlayerView) h5e.a(R.id.playerView, viewInflate);
                if (playerView != null) {
                    return new qx1((ConstraintLayout) viewInflate, appCompatImageView, imageView, playerView);
                }
            }
        }
        bmy.a("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
        return null;
    }

    @Override // defpackage.l12, androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        d dVar = this.f;
        if (dVar != null) {
            dVar.M0();
        }
        d dVar2 = this.f;
        if (dVar2 != null) {
            dVar2.i();
        }
        d dVar3 = this.f;
        if (dVar3 != null) {
            dVar3.release();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        d dVar = this.f;
        if (dVar == null || !dVar.B()) {
            return;
        }
        d dVar2 = this.f;
        if (dVar2 != null) {
            dVar2.n(false);
        }
        d dVar3 = this.f;
        if (dVar3 != null) {
            dVar3.a();
        }
        qx1 qx1Var = (qx1) this.b;
        if (qx1Var != null) {
            qx1Var.d.setVisibility(8);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        d dVar = this.f;
        if (dVar == null || dVar.B()) {
            return;
        }
        qx1 qx1Var = (qx1) this.b;
        if (qx1Var != null) {
            qx1Var.d.setVisibility(0);
        }
        d dVar2 = this.f;
        if (dVar2 != null) {
            dVar2.n(true);
        }
        d dVar3 = this.f;
        if (dVar3 != null) {
            dVar3.T();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String imageUrl;
        view.getClass();
        super.onViewCreated(view, bundle);
        try {
            e activity = getActivity();
            if (activity == null || !activity.hasWindowFocus()) {
                return;
            }
            BannerDetailResponse bannerDetailResponse = this.c;
            if (bannerDetailResponse == null || (imageUrl = bannerDetailResponse.getImageUrl()) == null || !StringsKt.M(imageUrl, ".mp4", false)) {
                qx1 qx1Var = (qx1) this.b;
                if (qx1Var != null) {
                    qx1Var.b.setVisibility(0);
                }
                qx1 qx1Var2 = (qx1) this.b;
                if (qx1Var2 != null) {
                    qx1Var2.c.setVisibility(8);
                }
                qx1 qx1Var3 = (qx1) this.b;
                if (qx1Var3 != null) {
                    qx1Var3.d.setVisibility(8);
                }
                BannerDetailResponse bannerDetailResponse2 = this.c;
                if (bannerDetailResponse2 != null) {
                    qx1 qx1Var4 = (qx1) this.b;
                    if (qx1Var4 != null) {
                        AppCompatImageView appCompatImageView = qx1Var4.b;
                        String name = bannerDetailResponse2.getName();
                        Context context = getContext();
                        appCompatImageView.setTag(name + (context != null ? context.getString(R.string.list_sg_lobby_banner) : null));
                    }
                    Context context2 = getContext();
                    if (context2 != null) {
                        op5 op5Var = op5.a;
                        qx1 qx1Var5 = (qx1) this.b;
                        ArrayList arrayListF = b.f(qx1Var5 != null ? qx1Var5.b : null);
                        ArrayList arrayListF2 = b.f(bannerDetailResponse2.getImageUrl());
                        ArrayList arrayList = new ArrayList();
                        op5Var.getClass();
                        op5.p(arrayListF, arrayListF2, arrayList, context2);
                    }
                }
            } else {
                BannerDetailResponse bannerDetailResponse3 = this.c;
                p0(bannerDetailResponse3 != null ? bannerDetailResponse3.getImageUrl() : null, (qx1) this.b);
                qx1 qx1Var6 = (qx1) this.b;
                if (qx1Var6 != null) {
                    qx1Var6.d.setOnClickListener(new View.OnClickListener() { // from class: nx1
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view2) {
                            px1 px1Var = this.a;
                            BannerDetailResponse bannerDetailResponse4 = px1Var.c;
                            if (bannerDetailResponse4 != null) {
                                cvj cvjVar = px1Var.d;
                                if (cvjVar != null) {
                                    cvjVar.invoke(bannerDetailResponse4, Integer.valueOf(px1Var.e));
                                } else {
                                    Intrinsics.n("callBack");
                                    throw null;
                                }
                            }
                        }
                    });
                }
            }
            qx1 qx1Var7 = (qx1) this.b;
            if (qx1Var7 != null) {
                qx1Var7.b.setOnClickListener(new View.OnClickListener() { // from class: ox1
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        px1 px1Var = this.a;
                        BannerDetailResponse bannerDetailResponse4 = px1Var.c;
                        if (bannerDetailResponse4 != null) {
                            cvj cvjVar = px1Var.d;
                            if (cvjVar != null) {
                                cvjVar.invoke(bannerDetailResponse4, Integer.valueOf(px1Var.e));
                            } else {
                                Intrinsics.n("callBack");
                                throw null;
                            }
                        }
                    }
                });
            }
        } catch (Exception unused) {
        }
    }

    public final void p0(String str, qx1 qx1Var) {
        Context context = getContext();
        if (context == null) {
            return;
        }
        d dVarA = new ExoPlayer.b(context).a();
        this.f = dVarA;
        dVarA.m.a(new a(qx1Var, context));
        if (qx1Var != null) {
            qx1Var.d.setPlayer(this.f);
        }
        d dVar = this.f;
        if (dVar != null) {
            dVar.n0(5, 0L);
        }
        d dVar2 = this.f;
        if (dVar2 != null) {
            dVar2.V(1);
        }
        d dVar3 = this.f;
        if (dVar3 != null) {
            dVar3.L(0.0f);
        }
        rbd.a aVar = new rbd.a(context);
        s430 s430Var = new s430(new mcd());
        udd uddVar = new udd();
        njv njvVarA = njv.a(Uri.parse(str));
        njvVarA.b.getClass();
        njvVarA.b.getClass();
        njvVarA.b.getClass();
        r430 r430Var = new r430(njvVarA, aVar, s430Var, nef.a, uddVar, 1048576, null);
        d dVar4 = this.f;
        if (dVar4 != null) {
            dVar4.I0(r430Var);
        }
        d dVar5 = this.f;
        if (dVar5 != null) {
            dVar5.d();
        }
    }
}
