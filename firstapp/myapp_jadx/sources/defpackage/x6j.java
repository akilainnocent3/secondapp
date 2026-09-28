package defpackage;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.fragment.app.e;
import com.sportybet.android.gp.tz.R;
import com.sportybet.plugin.webcontainer.caipiao.jsplugin.JsPluginCommon;
import com.sportygames.commons.SportyGamesManager;
import com.sportygames.commons.models.GPSData;
import com.sportygames.commons.models.GiftItem;
import com.sportygames.commons.remote.model.LoadingState;
import com.sportygames.commons.remote.model.Status;
import com.sportygames.commons.utils.CasinoLogger;
import com.sportygames.commons.views.GameMainActivity;
import com.sportygames.fruithunt.network.models.FHPlaceBetRequest;
import com.sportygames.fruithunt.network.models.FruitItem;
import com.sportygames.fruithunt.utils.objects.FruitMap;
import com.sportygames.lobby.remote.models.GameDetails;
import java.util.ArrayList;
import java.util.Locale;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.ranges.f;
import okhttp3.internal.ws.WebSocketProtocol;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportygames.fruithunt.views.FruitHuntFragment$doOnFruitReceived$1$1", f = "FruitHuntFragment.kt", l = {834}, m = "invokeSuspend", v = 1)
public final class x6j extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public FruitItem.FruitRecord a;
    public u6j b;
    public int c;
    public final /* synthetic */ u6j d;
    public final /* synthetic */ FruitItem.FruitRecord e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x6j(u6j u6jVar, FruitItem.FruitRecord fruitRecord, v1b<? super x6j> v1bVar) {
        super(2, v1bVar);
        this.d = u6jVar;
        this.e = fruitRecord;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new x6j(this.d, this.e, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((x6j) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:108:0x020d  */
    /* JADX WARN: Code duplicated, block: B:113:0x0239  */
    /* JADX WARN: Code duplicated, block: B:116:0x023d  */
    /* JADX WARN: Code duplicated, block: B:119:0x026b  */
    /* JADX WARN: Code duplicated, block: B:83:0x0177  */
    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        FruitItem.FruitRecord fruitRecord;
        Object objD;
        final u6j u6jVar;
        e activity;
        ViewGroup.LayoutParams layoutParamsC;
        long j;
        long j2;
        long j3;
        Path path;
        Long fruitSeconds;
        y5b y5bVar = y5b.a;
        int i = this.c;
        ObjectAnimator objectAnimator = null;
        if (i == 0) {
            uj50.b(obj);
            u6j u6jVar2 = this.d;
            Context context = u6jVar2.getContext();
            if (context != null) {
                fruitRecord = this.e;
                this.a = fruitRecord;
                this.b = u6jVar2;
                this.c = 1;
                pfd pfdVar = fse.a;
                objD = ej5.d(odd.b, new f0j(fruitRecord, context, null), this);
                if (objD == y5bVar) {
                    return y5bVar;
                }
                u6jVar = u6jVar2;
            }
            return Unit.a;
        }
        if (i != 1) {
            ib5.a("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        u6jVar = this.b;
        FruitItem.FruitRecord fruitRecord2 = this.a;
        uj50.b(obj);
        fruitRecord = fruitRecord2;
        objD = obj;
        Bitmap bitmap = (Bitmap) objD;
        if (bitmap != null && (activity = u6jVar.getActivity()) != null) {
            BitmapDrawable bitmapDrawable = new BitmapDrawable(u6jVar.getResources(), bitmap);
            final ImageView imageView = new ImageView(activity);
            imageView.setId(View.generateViewId());
            imageView.setImageDrawable(bitmapDrawable);
            imageView.setScaleX(1.01f);
            imageView.setScaleY(1.01f);
            float f = u6jVar.i.e;
            String strValueOf = String.valueOf(fruitRecord != null ? fruitRecord.getFruitObj() : null);
            Locale locale = SportyGamesManager.locale;
            switch (gvf.a(locale, strValueOf, locale)) {
                case "banana":
                    layoutParamsC = m7i0.d(80, f);
                    break;
                case "orange":
                    layoutParamsC = m7i0.d(50, f);
                    break;
                case "papaya":
                    layoutParamsC = m7i0.d(52, f);
                    break;
                case "avocado":
                    layoutParamsC = m7i0.d(42, f);
                    break;
                case "pineapple":
                    layoutParamsC = m7i0.d(52, f);
                    break;
                case "dragon_fruit":
                    layoutParamsC = m7i0.d(50, f);
                    break;
                case "kiwi":
                    layoutParamsC = m7i0.d(58, f);
                    break;
                case "pear":
                    layoutParamsC = m7i0.d(48, f);
                    break;
                case "apple":
                    layoutParamsC = m7i0.d(54, f);
                    break;
                case "guava":
                    layoutParamsC = m7i0.d(50, f);
                    break;
                case "mango":
                    layoutParamsC = m7i0.d(48, f);
                    break;
                case "strawberry":
                    layoutParamsC = m7i0.d(42, f);
                    break;
                case "coconut":
                    layoutParamsC = m7i0.d(60, f);
                    break;
                case "pomegranate":
                    layoutParamsC = m7i0.d(56, f);
                    break;
                case "watermelon":
                    layoutParamsC = m7i0.d(60, f);
                    break;
                default:
                    layoutParamsC = m7i0.c(f, 50, 50);
                    break;
            }
            imageView.setLayoutParams(layoutParamsC);
            imageView.setAdjustViewBounds(true);
            imageView.setClipToOutline(true);
            imageView.setZ(1.0f);
            u6jVar.s0.add(imageView);
            final FruitMap fruitMap = new FruitMap(fruitRecord, 0, null, null, null, null, 0L, WebSocketProtocol.PAYLOAD_SHORT, null);
            int i2 = u6jVar.x0 + 1;
            u6jVar.x0 = i2;
            if (i2 > 3) {
                u6jVar.x0 = 0;
                i2 = 0;
            }
            fruitMap.setPath(i2);
            FruitItem.FruitRecord fruitItem = fruitMap.getFruitItem();
            long jLongValue = (fruitItem == null || (fruitSeconds = fruitItem.getFruitSeconds()) == null) ? 1L : fruitSeconds.longValue();
            int path2 = fruitMap.getPath();
            if (path2 == 0) {
                j = jLongValue * 1000;
                j2 = 3000;
            } else if (path2 == 1) {
                j = jLongValue * 1000;
                j2 = 2750;
            } else if (path2 != 2) {
                if (path2 != 3) {
                    j3 = jLongValue * 1000;
                } else {
                    j = jLongValue * 1000;
                    j2 = 2250;
                }
                fruitMap.setTime(j3);
                long time = fruitMap.getTime();
                Property property = View.ROTATION;
                IntRange intRange = new IntRange(720, 1080, 1);
                lx30.Companion companion = lx30.INSTANCE;
                ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(imageView, (Property<ImageView, Float>) property, 0.0f, f.k(intRange, companion) * (f.k(new IntRange(1, 2, 1), companion) % 2 != 0 ? -1.0f : 1.0f));
                objectAnimatorOfFloat.setStartDelay(0L);
                objectAnimatorOfFloat.setRepeatCount(0);
                objectAnimatorOfFloat.setDuration(time);
                fruitMap.setRotator(objectAnimatorOfFloat);
                path = u6jVar.y0[fruitMap.getPath()];
                if (path != null || path.isEmpty()) {
                    path = null;
                }
                if (path != null) {
                    long time2 = fruitMap.getTime();
                    ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(imageView, (Property<ImageView, Float>) View.X, (Property<ImageView, Float>) View.Y, path);
                    objectAnimatorOfFloat2.setDuration(time2);
                    objectAnimatorOfFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: c6j
                        /* JADX WARN: Code duplicated, block: B:10:0x0035  */
                        /* JADX WARN: Type inference failed for: r0v4, types: [a6b, kotlin.coroutines.CoroutineContext] */
                        /* JADX WARN: Type inference failed for: r0v6 */
                        /* JADX WARN: Type inference failed for: r0v7 */
                        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                            ImageView imageView2;
                            boolean z;
                            int i3;
                            boolean z2;
                            wwd0 wwd0Var;
                            wwd0 wwd0Var2;
                            ?? r0;
                            valueAnimator.getClass();
                            final u6j u6jVar3 = u6jVar;
                            Object value = u6jVar3.t0().N.getValue();
                            khp khpVar = khp.c;
                            if (value == khpVar) {
                                a6h a6hVar = u6jVar3.C0;
                                ajh ajhVarL1 = u6jVar3.l1();
                                AppCompatImageView appCompatImageView = ajhVarL1 != null ? ajhVarL1.e : null;
                                a6hVar.getClass();
                                ImageView imageView3 = imageView;
                                if (appCompatImageView != null) {
                                    o8j o8jVar = a6hVar.a;
                                    if (((o8jVar == null || (wwd0Var2 = o8jVar.N) == null) ? null : (khp) wwd0Var2.getValue()) == khpVar) {
                                        o8j o8jVar2 = a6hVar.a;
                                        Integer num = (o8jVar2 == null || (wwd0Var = o8jVar2.L) == null) ? null : (Integer) wwd0Var.getValue();
                                        Rect rect = (num != null && num.intValue() == 0) ? new Rect((int) appCompatImageView.getX(), (int) appCompatImageView.getY(), (int) (appCompatImageView.getX() + a6hVar.c), (int) (appCompatImageView.getY() + a6hVar.d)) : new Rect((int) appCompatImageView.getX(), (int) appCompatImageView.getY(), (int) (appCompatImageView.getX() + appCompatImageView.getWidth()), ((int) appCompatImageView.getY()) + ((int) (appCompatImageView.getHeight() * 0.58f)));
                                        Rect rect2 = new Rect((int) imageView3.getX(), (int) imageView3.getY(), (int) (imageView3.getX() + imageView3.getWidth()), (int) (imageView3.getY() + imageView3.getHeight()));
                                        if (Rect.intersects(rect, rect2)) {
                                            Drawable drawable = imageView3.getDrawable();
                                            drawable.getClass();
                                            Bitmap bitmapA = a6h.a(zdf.a(drawable), imageView3.getRotation());
                                            a6hVar.f = appCompatImageView;
                                            boolean z3 = num == null || num.intValue() != 0;
                                            int i4 = rect2.top;
                                            int iHeight = ((int) (((double) rect2.height()) * 0.5d)) + i4;
                                            Rect rect3 = rect;
                                            int i5 = rect2.bottom;
                                            int i6 = rect2.left;
                                            int iWidth = i6 + ((int) (((double) rect2.width()) * 0.1d));
                                            int iWidth2 = rect2.left + ((int) (((double) rect2.width()) * 0.25d));
                                            int iWidth3 = rect2.left + ((int) (((double) rect2.width()) * 0.5d));
                                            AppCompatImageView appCompatImageView2 = appCompatImageView;
                                            int iWidth4 = rect2.left + ((int) (((double) rect2.width()) * 0.75d));
                                            int iWidth5 = rect2.left + ((int) (((double) rect2.width()) * 0.9d));
                                            int i7 = rect2.right;
                                            Pair pair = new Pair(Float.valueOf(imageView3.getWidth()), Float.valueOf(imageView3.getHeight()));
                                            Pair pair2 = new Pair(Integer.valueOf((int) imageView3.getX()), Integer.valueOf((int) imageView3.getY()));
                                            int y = (int) appCompatImageView2.getY();
                                            yp40 yp40Var = new yp40();
                                            o8j o8jVar3 = a6hVar.a;
                                            if (o8jVar3 != null) {
                                                imageView2 = imageView3;
                                                z = false;
                                                i3 = 3;
                                                ej5.c(o8i0.d(o8jVar3), null, null, new z5h(yp40Var, a6hVar, rect3, iWidth2, iHeight, iWidth3, i5, bitmapA, z3, pair, pair2, y, iWidth4, iWidth5, i7, i6, iWidth, i4, null), 3);
                                            } else {
                                                imageView2 = imageView3;
                                                z = false;
                                                i3 = 3;
                                            }
                                            z2 = yp40Var.a;
                                            r0 = z;
                                        } else {
                                            i3 = 3;
                                            imageView2 = imageView3;
                                            z2 = false;
                                            r0 = 0;
                                        }
                                    } else {
                                        i3 = 3;
                                        imageView2 = imageView3;
                                        z2 = false;
                                        r0 = 0;
                                    }
                                } else {
                                    i3 = 3;
                                    imageView2 = imageView3;
                                    z2 = false;
                                    r0 = 0;
                                }
                                if (!z2 || imageView2.getX() >= ((double) u6jVar3.i.a) - (((double) imageView2.getWidth()) * 0.1d) || (((double) imageView2.getWidth()) * 0.9d) + ((double) imageView2.getX()) <= 0.0d) {
                                    return;
                                }
                                u6jVar3.t0 = true;
                                ArrayList arrayList = u6jVar3.s0;
                                int size = arrayList.size();
                                int i8 = 0;
                                while (i8 < size) {
                                    Object obj2 = arrayList.get(i8);
                                    i8++;
                                    ImageView imageView4 = (ImageView) obj2;
                                    ImageView imageView5 = imageView2;
                                    if (!Intrinsics.g(imageView4, imageView5)) {
                                        u6j.Z0(u6jVar3, imageView4, 0.2f);
                                    }
                                    imageView2 = imageView5;
                                }
                                ImageView imageView6 = imageView2;
                                final FruitMap fruitMap2 = fruitMap;
                                ObjectAnimator rotator = fruitMap2.getRotator();
                                if (rotator != null) {
                                    rotator.pause();
                                }
                                imageView6.setZ(3.0f);
                                u6jVar3.t0().D1(2);
                                u6jVar3.F0.pause();
                                ObjectAnimator pathMover = fruitMap2.getPathMover();
                                if (pathMover != null) {
                                    pathMover.pause();
                                }
                                u6jVar3.k0 = imageView6;
                                float y2 = imageView6.getY() - (imageView6.getLayoutParams().height / 4);
                                fruitMap2.setColX(Float.valueOf(imageView6.getX() + (imageView6.getLayoutParams().width / 2)));
                                if (y2 < u6jVar3.w0) {
                                    y2 = imageView6.getY();
                                }
                                fruitMap2.setColY(Float.valueOf(y2));
                                ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(imageView6, u6jVar3.r0, u6j.p1() + imageView6.getX(), imageView6.getX() - u6j.p1());
                                ObjectAnimator objectAnimatorOfFloat4 = ObjectAnimator.ofFloat(imageView6, u6jVar3.q0, u6j.p1() + imageView6.getY(), imageView6.getY() - u6j.p1());
                                objectAnimatorOfFloat3.setRepeatCount(-1);
                                objectAnimatorOfFloat4.setRepeatCount(-1);
                                objectAnimatorOfFloat3.setDuration(68L);
                                objectAnimatorOfFloat4.setDuration(68L);
                                AnimatorSet animatorSet = new AnimatorSet();
                                animatorSet.playTogether(objectAnimatorOfFloat3, objectAnimatorOfFloat4);
                                animatorSet.start();
                                ajh ajhVarL2 = u6jVar3.l1();
                                if (ajhVarL2 != null) {
                                    ajhVarL2.w.setZ(2.0f);
                                }
                                ypa0 ypa0VarV0 = u6jVar3.v0();
                                String string = u6jVar3.getString(R.string.sg_fruit_hunt_knife_hit_fruit);
                                if (string != null) {
                                    ej5.c(o8i0.d(ypa0VarV0), r0, r0, new t750(ypa0VarV0, string, 500L, null), i3);
                                }
                                r750.a(u6jVar3.t0(), new Function0() { // from class: m6j
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        zj60 bridge;
                                        u6j u6jVar4 = u6jVar3;
                                        o8j o8jVarT0 = u6jVar4.t0();
                                        Double d = (Double) u6jVar4.t0().I.a.getValue();
                                        boolean z4 = u6jVar4.m0;
                                        e activity2 = u6jVar4.getActivity();
                                        GameMainActivity gameMainActivity = activity2 instanceof GameMainActivity ? (GameMainActivity) activity2 : null;
                                        kej kejVar = gameMainActivity != null ? gameMainActivity.E : null;
                                        GPSData gPSDataA = kejVar != null ? kejVar.a() : null;
                                        wwd0 wwd0Var3 = o8jVarT0.M;
                                        khp khpVar2 = khp.d;
                                        wwd0Var3.getClass();
                                        wwd0Var3.k(null, khpVar2);
                                        wwd0 wwd0Var4 = o8jVarT0.P;
                                        wwd0Var4.getClass();
                                        FruitMap fruitMap3 = fruitMap2;
                                        wwd0Var4.k(null, fruitMap3);
                                        FruitItem.FruitRecord fruitItem2 = fruitMap3.getFruitItem();
                                        Long id = fruitItem2 != null ? fruitItem2.getId() : null;
                                        if (id != null) {
                                            GiftItem giftItem = o8jVarT0.a;
                                            if (giftItem != null) {
                                                d = o8jVarT0.b;
                                            }
                                            FHPlaceBetRequest fHPlaceBetRequest = new FHPlaceBetRequest(o8jVarT0.F, id, d, giftItem != null ? giftItem.getGiftId() : null, o8jVarT0.b, z4, gPSDataA);
                                            o8jVarT0.R.j(new LoadingState<>(Status.RUNNING, null, null, null, null, 30, null));
                                            ej5.c(o8i0.d(o8jVarT0), null, null, new p8j(o8jVarT0, fHPlaceBetRequest, null), 3);
                                        }
                                        if (u6jVar4.f != null) {
                                            double dDoubleValue = ((Number) u6jVar4.t0().I.a.getValue()).doubleValue();
                                            int iIntValue = ((Number) u6jVar4.t0().L.getValue()).intValue();
                                            SharedPreferences sharedPreferences = u6jVar4.J;
                                            boolean z5 = sharedPreferences != null ? sharedPreferences.getBoolean("FIXED_CO_EFF", false) : false;
                                            Bundle bundle = new Bundle();
                                            bundle.putString("chipvalue", String.valueOf(dDoubleValue));
                                            bundle.putString("aimPosition", String.valueOf(iIntValue));
                                            bundle.putString("fixedCoeffEnabled", String.valueOf(z5));
                                            SportyGamesManager sportyGamesManager = SportyGamesManager.getInstance();
                                            if (sportyGamesManager != null && (bridge = sportyGamesManager.getBridge()) != null) {
                                                ((bk60) bridge).a("BetPlaced", bundle);
                                            }
                                        }
                                        if (u6jVar4.f != null) {
                                            GameDetails gameDetails = u6jVar4.c;
                                            CasinoLogger.INSTANCE.logEventToCasino("BetPlaced", vj5.a(new Pair(JsPluginCommon.GAMES_BET_PLACED_GAME_NAME_ARGUMENT, gameDetails != null ? gameDetails.getName() : null)));
                                        }
                                        ObjectAnimator pathMover2 = fruitMap3.getPathMover();
                                        if (pathMover2 != null) {
                                            pathMover2.removeAllListeners();
                                        }
                                        return Unit.a;
                                    }
                                });
                            }
                        }
                    });
                    objectAnimatorOfFloat2.addListener(new w7j(imageView, u6jVar, objectAnimatorOfFloat2));
                    u6jVar.B0.add(objectAnimatorOfFloat2);
                    objectAnimator = objectAnimatorOfFloat2;
                }
                fruitMap.setPathMover(objectAnimator);
                if (fruitMap.getPathMover() != null) {
                    u6jVar.o0(new Function0() { // from class: e6j
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            u6j u6jVar3 = u6jVar;
                            ajh ajhVarL1 = u6jVar3.l1();
                            ImageView imageView2 = imageView;
                            if (ajhVarL1 != null) {
                                ajhVarL1.C.addView(imageView2);
                            }
                            FruitMap fruitMap2 = fruitMap;
                            ObjectAnimator rotator = fruitMap2.getRotator();
                            if (rotator != null) {
                                rotator.start();
                            }
                            ObjectAnimator pathMover = fruitMap2.getPathMover();
                            if (pathMover != null) {
                                pathMover.start();
                            }
                            if (u6jVar3.t0) {
                                u6j.Z0(u6jVar3, imageView2, 0.0f);
                            }
                            return Unit.a;
                        }
                    });
                }
            } else {
                j = jLongValue * 1000;
                j2 = 2500;
            }
            j3 = j + j2;
            fruitMap.setTime(j3);
            long time3 = fruitMap.getTime();
            Property property2 = View.ROTATION;
            IntRange intRange2 = new IntRange(720, 1080, 1);
            lx30.Companion companion2 = lx30.INSTANCE;
            ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(imageView, (Property<ImageView, Float>) property2, 0.0f, f.k(intRange2, companion2) * (f.k(new IntRange(1, 2, 1), companion2) % 2 != 0 ? -1.0f : 1.0f));
            objectAnimatorOfFloat3.setStartDelay(0L);
            objectAnimatorOfFloat3.setRepeatCount(0);
            objectAnimatorOfFloat3.setDuration(time3);
            fruitMap.setRotator(objectAnimatorOfFloat3);
            path = u6jVar.y0[fruitMap.getPath()];
            if (path != null) {
                path = null;
            } else {
                path = null;
            }
            if (path != null) {
                long time4 = fruitMap.getTime();
                ObjectAnimator objectAnimatorOfFloat4 = ObjectAnimator.ofFloat(imageView, (Property<ImageView, Float>) View.X, (Property<ImageView, Float>) View.Y, path);
                objectAnimatorOfFloat4.setDuration(time4);
                objectAnimatorOfFloat4.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: c6j
                    /* JADX WARN: Code duplicated, block: B:10:0x0035  */
                    /* JADX WARN: Type inference failed for: r0v4, types: [a6b, kotlin.coroutines.CoroutineContext] */
                    /* JADX WARN: Type inference failed for: r0v6 */
                    /* JADX WARN: Type inference failed for: r0v7 */
                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        ImageView imageView2;
                        boolean z;
                        int i3;
                        boolean z2;
                        wwd0 wwd0Var;
                        wwd0 wwd0Var2;
                        ?? r0;
                        valueAnimator.getClass();
                        final u6j u6jVar3 = u6jVar;
                        Object value = u6jVar3.t0().N.getValue();
                        khp khpVar = khp.c;
                        if (value == khpVar) {
                            a6h a6hVar = u6jVar3.C0;
                            ajh ajhVarL1 = u6jVar3.l1();
                            AppCompatImageView appCompatImageView = ajhVarL1 != null ? ajhVarL1.e : null;
                            a6hVar.getClass();
                            ImageView imageView3 = imageView;
                            if (appCompatImageView != null) {
                                o8j o8jVar = a6hVar.a;
                                if (((o8jVar == null || (wwd0Var2 = o8jVar.N) == null) ? null : (khp) wwd0Var2.getValue()) == khpVar) {
                                    o8j o8jVar2 = a6hVar.a;
                                    Integer num = (o8jVar2 == null || (wwd0Var = o8jVar2.L) == null) ? null : (Integer) wwd0Var.getValue();
                                    Rect rect = (num != null && num.intValue() == 0) ? new Rect((int) appCompatImageView.getX(), (int) appCompatImageView.getY(), (int) (appCompatImageView.getX() + a6hVar.c), (int) (appCompatImageView.getY() + a6hVar.d)) : new Rect((int) appCompatImageView.getX(), (int) appCompatImageView.getY(), (int) (appCompatImageView.getX() + appCompatImageView.getWidth()), ((int) appCompatImageView.getY()) + ((int) (appCompatImageView.getHeight() * 0.58f)));
                                    Rect rect2 = new Rect((int) imageView3.getX(), (int) imageView3.getY(), (int) (imageView3.getX() + imageView3.getWidth()), (int) (imageView3.getY() + imageView3.getHeight()));
                                    if (Rect.intersects(rect, rect2)) {
                                        Drawable drawable = imageView3.getDrawable();
                                        drawable.getClass();
                                        Bitmap bitmapA = a6h.a(zdf.a(drawable), imageView3.getRotation());
                                        a6hVar.f = appCompatImageView;
                                        boolean z3 = num == null || num.intValue() != 0;
                                        int i4 = rect2.top;
                                        int iHeight = ((int) (((double) rect2.height()) * 0.5d)) + i4;
                                        Rect rect3 = rect;
                                        int i5 = rect2.bottom;
                                        int i6 = rect2.left;
                                        int iWidth = i6 + ((int) (((double) rect2.width()) * 0.1d));
                                        int iWidth2 = rect2.left + ((int) (((double) rect2.width()) * 0.25d));
                                        int iWidth3 = rect2.left + ((int) (((double) rect2.width()) * 0.5d));
                                        AppCompatImageView appCompatImageView2 = appCompatImageView;
                                        int iWidth4 = rect2.left + ((int) (((double) rect2.width()) * 0.75d));
                                        int iWidth5 = rect2.left + ((int) (((double) rect2.width()) * 0.9d));
                                        int i7 = rect2.right;
                                        Pair pair = new Pair(Float.valueOf(imageView3.getWidth()), Float.valueOf(imageView3.getHeight()));
                                        Pair pair2 = new Pair(Integer.valueOf((int) imageView3.getX()), Integer.valueOf((int) imageView3.getY()));
                                        int y = (int) appCompatImageView2.getY();
                                        yp40 yp40Var = new yp40();
                                        o8j o8jVar3 = a6hVar.a;
                                        if (o8jVar3 != null) {
                                            imageView2 = imageView3;
                                            z = false;
                                            i3 = 3;
                                            ej5.c(o8i0.d(o8jVar3), null, null, new z5h(yp40Var, a6hVar, rect3, iWidth2, iHeight, iWidth3, i5, bitmapA, z3, pair, pair2, y, iWidth4, iWidth5, i7, i6, iWidth, i4, null), 3);
                                        } else {
                                            imageView2 = imageView3;
                                            z = false;
                                            i3 = 3;
                                        }
                                        z2 = yp40Var.a;
                                        r0 = z;
                                    } else {
                                        i3 = 3;
                                        imageView2 = imageView3;
                                        z2 = false;
                                        r0 = 0;
                                    }
                                } else {
                                    i3 = 3;
                                    imageView2 = imageView3;
                                    z2 = false;
                                    r0 = 0;
                                }
                            } else {
                                i3 = 3;
                                imageView2 = imageView3;
                                z2 = false;
                                r0 = 0;
                            }
                            if (!z2 || imageView2.getX() >= ((double) u6jVar3.i.a) - (((double) imageView2.getWidth()) * 0.1d) || (((double) imageView2.getWidth()) * 0.9d) + ((double) imageView2.getX()) <= 0.0d) {
                                return;
                            }
                            u6jVar3.t0 = true;
                            ArrayList arrayList = u6jVar3.s0;
                            int size = arrayList.size();
                            int i8 = 0;
                            while (i8 < size) {
                                Object obj2 = arrayList.get(i8);
                                i8++;
                                ImageView imageView4 = (ImageView) obj2;
                                ImageView imageView5 = imageView2;
                                if (!Intrinsics.g(imageView4, imageView5)) {
                                    u6j.Z0(u6jVar3, imageView4, 0.2f);
                                }
                                imageView2 = imageView5;
                            }
                            ImageView imageView6 = imageView2;
                            final FruitMap fruitMap2 = fruitMap;
                            ObjectAnimator rotator = fruitMap2.getRotator();
                            if (rotator != null) {
                                rotator.pause();
                            }
                            imageView6.setZ(3.0f);
                            u6jVar3.t0().D1(2);
                            u6jVar3.F0.pause();
                            ObjectAnimator pathMover = fruitMap2.getPathMover();
                            if (pathMover != null) {
                                pathMover.pause();
                            }
                            u6jVar3.k0 = imageView6;
                            float y2 = imageView6.getY() - (imageView6.getLayoutParams().height / 4);
                            fruitMap2.setColX(Float.valueOf(imageView6.getX() + (imageView6.getLayoutParams().width / 2)));
                            if (y2 < u6jVar3.w0) {
                                y2 = imageView6.getY();
                            }
                            fruitMap2.setColY(Float.valueOf(y2));
                            ObjectAnimator objectAnimatorOfFloat5 = ObjectAnimator.ofFloat(imageView6, u6jVar3.r0, u6j.p1() + imageView6.getX(), imageView6.getX() - u6j.p1());
                            ObjectAnimator objectAnimatorOfFloat6 = ObjectAnimator.ofFloat(imageView6, u6jVar3.q0, u6j.p1() + imageView6.getY(), imageView6.getY() - u6j.p1());
                            objectAnimatorOfFloat5.setRepeatCount(-1);
                            objectAnimatorOfFloat6.setRepeatCount(-1);
                            objectAnimatorOfFloat5.setDuration(68L);
                            objectAnimatorOfFloat6.setDuration(68L);
                            AnimatorSet animatorSet = new AnimatorSet();
                            animatorSet.playTogether(objectAnimatorOfFloat5, objectAnimatorOfFloat6);
                            animatorSet.start();
                            ajh ajhVarL2 = u6jVar3.l1();
                            if (ajhVarL2 != null) {
                                ajhVarL2.w.setZ(2.0f);
                            }
                            ypa0 ypa0VarV0 = u6jVar3.v0();
                            String string = u6jVar3.getString(R.string.sg_fruit_hunt_knife_hit_fruit);
                            if (string != null) {
                                ej5.c(o8i0.d(ypa0VarV0), r0, r0, new t750(ypa0VarV0, string, 500L, null), i3);
                            }
                            r750.a(u6jVar3.t0(), new Function0() { // from class: m6j
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    zj60 bridge;
                                    u6j u6jVar4 = u6jVar3;
                                    o8j o8jVarT0 = u6jVar4.t0();
                                    Double d = (Double) u6jVar4.t0().I.a.getValue();
                                    boolean z4 = u6jVar4.m0;
                                    e activity2 = u6jVar4.getActivity();
                                    GameMainActivity gameMainActivity = activity2 instanceof GameMainActivity ? (GameMainActivity) activity2 : null;
                                    kej kejVar = gameMainActivity != null ? gameMainActivity.E : null;
                                    GPSData gPSDataA = kejVar != null ? kejVar.a() : null;
                                    wwd0 wwd0Var3 = o8jVarT0.M;
                                    khp khpVar2 = khp.d;
                                    wwd0Var3.getClass();
                                    wwd0Var3.k(null, khpVar2);
                                    wwd0 wwd0Var4 = o8jVarT0.P;
                                    wwd0Var4.getClass();
                                    FruitMap fruitMap3 = fruitMap2;
                                    wwd0Var4.k(null, fruitMap3);
                                    FruitItem.FruitRecord fruitItem2 = fruitMap3.getFruitItem();
                                    Long id = fruitItem2 != null ? fruitItem2.getId() : null;
                                    if (id != null) {
                                        GiftItem giftItem = o8jVarT0.a;
                                        if (giftItem != null) {
                                            d = o8jVarT0.b;
                                        }
                                        FHPlaceBetRequest fHPlaceBetRequest = new FHPlaceBetRequest(o8jVarT0.F, id, d, giftItem != null ? giftItem.getGiftId() : null, o8jVarT0.b, z4, gPSDataA);
                                        o8jVarT0.R.j(new LoadingState<>(Status.RUNNING, null, null, null, null, 30, null));
                                        ej5.c(o8i0.d(o8jVarT0), null, null, new p8j(o8jVarT0, fHPlaceBetRequest, null), 3);
                                    }
                                    if (u6jVar4.f != null) {
                                        double dDoubleValue = ((Number) u6jVar4.t0().I.a.getValue()).doubleValue();
                                        int iIntValue = ((Number) u6jVar4.t0().L.getValue()).intValue();
                                        SharedPreferences sharedPreferences = u6jVar4.J;
                                        boolean z5 = sharedPreferences != null ? sharedPreferences.getBoolean("FIXED_CO_EFF", false) : false;
                                        Bundle bundle = new Bundle();
                                        bundle.putString("chipvalue", String.valueOf(dDoubleValue));
                                        bundle.putString("aimPosition", String.valueOf(iIntValue));
                                        bundle.putString("fixedCoeffEnabled", String.valueOf(z5));
                                        SportyGamesManager sportyGamesManager = SportyGamesManager.getInstance();
                                        if (sportyGamesManager != null && (bridge = sportyGamesManager.getBridge()) != null) {
                                            ((bk60) bridge).a("BetPlaced", bundle);
                                        }
                                    }
                                    if (u6jVar4.f != null) {
                                        GameDetails gameDetails = u6jVar4.c;
                                        CasinoLogger.INSTANCE.logEventToCasino("BetPlaced", vj5.a(new Pair(JsPluginCommon.GAMES_BET_PLACED_GAME_NAME_ARGUMENT, gameDetails != null ? gameDetails.getName() : null)));
                                    }
                                    ObjectAnimator pathMover2 = fruitMap3.getPathMover();
                                    if (pathMover2 != null) {
                                        pathMover2.removeAllListeners();
                                    }
                                    return Unit.a;
                                }
                            });
                        }
                    }
                });
                objectAnimatorOfFloat4.addListener(new w7j(imageView, u6jVar, objectAnimatorOfFloat4));
                u6jVar.B0.add(objectAnimatorOfFloat4);
                objectAnimator = objectAnimatorOfFloat4;
            }
            fruitMap.setPathMover(objectAnimator);
            if (fruitMap.getPathMover() != null) {
                u6jVar.o0(new Function0() { // from class: e6j
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        u6j u6jVar3 = u6jVar;
                        ajh ajhVarL1 = u6jVar3.l1();
                        ImageView imageView2 = imageView;
                        if (ajhVarL1 != null) {
                            ajhVarL1.C.addView(imageView2);
                        }
                        FruitMap fruitMap2 = fruitMap;
                        ObjectAnimator rotator = fruitMap2.getRotator();
                        if (rotator != null) {
                            rotator.start();
                        }
                        ObjectAnimator pathMover = fruitMap2.getPathMover();
                        if (pathMover != null) {
                            pathMover.start();
                        }
                        if (u6jVar3.t0) {
                            u6j.Z0(u6jVar3, imageView2, 0.0f);
                        }
                        return Unit.a;
                    }
                });
            }
        }
        return Unit.a;
    }
}
