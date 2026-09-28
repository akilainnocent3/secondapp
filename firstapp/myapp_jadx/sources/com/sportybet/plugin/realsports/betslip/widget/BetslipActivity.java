package com.sportybet.plugin.realsports.betslip.widget;

import android.accounts.Account;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.TransitionDrawable;
import android.os.Build;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.LinearInterpolator;
import android.view.animation.RotateAnimation;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.ToggleButton;
import androidx.camera.core.impl.utils.TP.sgwpmp;
import androidx.compose.runtime.a;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.google.android.gms.recaptchabase.WnDZ.CaxEybC;
import com.google.android.material.snackbar.BaseTransientBottomBar;
import com.google.android.material.snackbar.Snackbar;
import com.google.gson.reflect.TypeToken;
import com.sporty.android.book.data.entity.RelatedBetRequest;
import com.sporty.android.book.domain.entity.BetBuilderData;
import com.sporty.android.book.domain.entity.BetBuilderDataWSelections;
import com.sporty.android.book.domain.entity.BetTypeAnyWinConfig;
import com.sporty.android.book.domain.entity.BetTypeConfig;
import com.sporty.android.book.domain.entity.BetTypeFlexiBetConfig;
import com.sporty.android.book.domain.entity.EventStatus;
import com.sporty.android.book.domain.entity.MarketingServiceType;
import com.sporty.android.common.network.data.BaseResponse;
import com.sporty.android.common.network.data.SprThrowable;
import com.sporty.android.common_ui.uitext.ResourceUiText;
import com.sporty.android.common_ui.uitext.StringUiText;
import com.sporty.android.common_ui.uitext.UiText;
import com.sporty.android.core.model.MyLog;
import com.sporty.android.core.model.OrderBetType;
import com.sporty.android.core.model.assetsinfo.AssetsInfo;
import com.sporty.android.core.model.bet.edit.EditBetDlgType;
import com.sporty.android.core.model.bet.edit.ErrorDataInfo;
import com.sporty.android.core.model.config.bo.enums.BOConfigParam;
import com.sporty.android.core.model.config.tax.TaxConfig;
import com.sporty.android.core.model.config.tax.TaxConfigs;
import com.sporty.android.core.model.gift.GiftDetails;
import com.sporty.android.core.model.gift.GiftGroup;
import com.sporty.android.core.model.gift.GiftUtil;
import com.sporty.android.core.model.gift.SelectedGiftData;
import com.sporty.android.core.model.json.JsonSerializeService;
import com.sporty.android.core.model.realsports.EarlyPayoutConfig;
import com.sporty.android.core.model.realsports.EarlyPayoutConfigFeatures;
import com.sporty.android.core.model.sportysim.SimOneCutStatus;
import com.sporty.android.core.model.tracking.AnalyticsEvent;
import com.sporty.android.core.model.tracking.AnalyticsParam;
import com.sporty.android.permission.location.UserAddress;
import com.sportybet.android.account.Qr.QQWMbKFOuTf;
import com.sportybet.android.bookingcode.data.dto.BookingData;
import com.sportybet.android.bookingcode.presentation.widget.BookingCodePanel;
import com.sportybet.android.data.BOConfigSocket;
import com.sportybet.android.data.BannedItemSocket;
import com.sportybet.android.data.GetBonusResult;
import com.sportybet.android.data.GetInsureBetOddsData;
import com.sportybet.android.data.GetInsureBetResult;
import com.sportybet.android.gp.tz.R;
import com.sportybet.android.instantwin.presentation.buildandgo.sTE.siPCzPFw;
import com.sportybet.core.injection.opentelemetry.PageMeta;
import com.sportybet.ntespm.socket.GroupTopic;
import com.sportybet.ntespm.socket.SocketPushManager;
import com.sportybet.ntespm.socket.Subscriber;
import com.sportybet.ntespm.socket.Topic;
import com.sportybet.ntespm.socket.TopicType;
import com.sportybet.plugin.event.EventActivity;
import com.sportybet.plugin.realsports.activities.PreMatchEventActivity;
import com.sportybet.plugin.realsports.autobet.widget.AutoBetActivity;
import com.sportybet.plugin.realsports.betslip.Selection;
import com.sportybet.plugin.realsports.betslip.virtualkeyboard.EditTextWithKeyBoard;
import com.sportybet.plugin.realsports.betslip.widget.BetSlipFooter;
import com.sportybet.plugin.realsports.betslip.widget.BetslipActivity;
import com.sportybet.plugin.realsports.betslip.widget.f;
import com.sportybet.plugin.realsports.betslip.widget.header.BetSlipHeader;
import com.sportybet.plugin.realsports.betsucc.presentation.fragment.BetSuccessfulPageFragment;
import com.sportybet.plugin.realsports.data.AliasBookingCode;
import com.sportybet.plugin.realsports.data.BetSlipInfo;
import com.sportybet.plugin.realsports.data.BoreDrawConfig;
import com.sportybet.plugin.realsports.data.Category;
import com.sportybet.plugin.realsports.data.EarlyPayoutMarket;
import com.sportybet.plugin.realsports.data.Event;
import com.sportybet.plugin.realsports.data.FooterInfo;
import com.sportybet.plugin.realsports.data.Market;
import com.sportybet.plugin.realsports.data.OrderWithFailUpdate;
import com.sportybet.plugin.realsports.data.Outcome;
import com.sportybet.plugin.realsports.data.PreCannedBBOutcome;
import com.sportybet.plugin.realsports.data.SocketOutcomeMessage;
import com.sportybet.plugin.realsports.data.Tournament;
import com.sportybet.plugin.realsports.data.local.BetSlipDataStore;
import com.sportybet.plugin.realsports.data.sim.SimShareData;
import com.sportybet.plugin.realsports.data.sim.SimulateBetConsts;
import com.sportybet.plugin.realsports.data.sim.SimulateWinOnlineRes;
import com.sportybet.plugin.realsports.widget.GuideView;
import defpackage.a53;
import defpackage.a73;
import defpackage.a8b;
import defpackage.aak;
import defpackage.ade0;
import defpackage.ag3;
import defpackage.ai3;
import defpackage.aih0;
import defpackage.aj40;
import defpackage.aj90;
import defpackage.ajk;
import defpackage.apg;
import defpackage.aq3;
import defpackage.avy;
import defpackage.ay0;
import defpackage.azm;
import defpackage.azs;
import defpackage.b12;
import defpackage.b3;
import defpackage.b3i;
import defpackage.b63;
import defpackage.bb40;
import defpackage.bew;
import defpackage.bi30;
import defpackage.bih0;
import defpackage.bjb0;
import defpackage.bm50;
import defpackage.bpx;
import defpackage.bqe;
import defpackage.bqy;
import defpackage.br3;
import defpackage.bsy;
import defpackage.bt90;
import defpackage.c0d;
import defpackage.c73;
import defpackage.c8i0;
import defpackage.c980;
import defpackage.c9p;
import defpackage.cg3;
import defpackage.ci3;
import defpackage.cj3;
import defpackage.ck3;
import defpackage.ckf;
import defpackage.ckg;
import defpackage.cq3;
import defpackage.cqe0;
import defpackage.cqy;
import defpackage.cr0;
import defpackage.cs3;
import defpackage.ct90;
import defpackage.cwz;
import defpackage.cyb;
import defpackage.czk;
import defpackage.d3i;
import defpackage.d63;
import defpackage.d73;
import defpackage.d9d0;
import defpackage.dg3;
import defpackage.dgy;
import defpackage.dj3;
import defpackage.dj5;
import defpackage.dk3;
import defpackage.dkf;
import defpackage.dlc0;
import defpackage.do90;
import defpackage.dtk;
import defpackage.dvi;
import defpackage.dx4;
import defpackage.dzk;
import defpackage.e1i;
import defpackage.e73;
import defpackage.e9h;
import defpackage.ebe;
import defpackage.ebs;
import defpackage.eeh0;
import defpackage.ef3;
import defpackage.ej3;
import defpackage.ej5;
import defpackage.ej90;
import defpackage.eja0;
import defpackage.ek3;
import defpackage.el0;
import defpackage.ema;
import defpackage.erb;
import defpackage.ez4;
import defpackage.f00;
import defpackage.f1i;
import defpackage.f5k;
import defpackage.f5w;
import defpackage.f63;
import defpackage.f73;
import defpackage.f83;
import defpackage.f8a0;
import defpackage.f990;
import defpackage.f9d0;
import defpackage.fb1;
import defpackage.fd3;
import defpackage.fdt;
import defpackage.ff3;
import defpackage.fih0;
import defpackage.fj2;
import defpackage.fj3;
import defpackage.fk3;
import defpackage.fn90;
import defpackage.fu5;
import defpackage.fz4;
import defpackage.g08;
import defpackage.g1i;
import defpackage.g2k;
import defpackage.g73;
import defpackage.g880;
import defpackage.g950;
import defpackage.g9d0;
import defpackage.g9i0;
import defpackage.gaj;
import defpackage.gb1;
import defpackage.gbn;
import defpackage.gf3;
import defpackage.gi3;
import defpackage.gj3;
import defpackage.gky;
import defpackage.gl0;
import defpackage.gmf0;
import defpackage.gq;
import defpackage.gr0;
import defpackage.gt90;
import defpackage.gty;
import defpackage.guy;
import defpackage.gvh;
import defpackage.gvo;
import defpackage.gym;
import defpackage.gzz;
import defpackage.h3a0;
import defpackage.h3z;
import defpackage.h53;
import defpackage.h73;
import defpackage.h83;
import defpackage.h8s;
import defpackage.haj;
import defpackage.hc40;
import defpackage.hf3;
import defpackage.hj3;
import defpackage.hp0;
import defpackage.hu2;
import defpackage.huy;
import defpackage.hvh;
import defpackage.hvo;
import defpackage.hvy;
import defpackage.hwr;
import defpackage.hzz;
import defpackage.i0i;
import defpackage.i250;
import defpackage.i2i;
import defpackage.i53;
import defpackage.i6f;
import defpackage.i73;
import defpackage.i8s;
import defpackage.i990;
import defpackage.ib5;
import defpackage.if3;
import defpackage.ii3;
import defpackage.ii90;
import defpackage.iib0;
import defpackage.ij3;
import defpackage.ij40;
import defpackage.ijf;
import defpackage.imn;
import defpackage.ioy;
import defpackage.ipk;
import defpackage.it90;
import defpackage.itf0;
import defpackage.iu2;
import defpackage.ivh;
import defpackage.iw2;
import defpackage.iym;
import defpackage.izw;
import defpackage.j7g;
import defpackage.j8s;
import defpackage.j980;
import defpackage.j990;
import defpackage.jf3;
import defpackage.ji3;
import defpackage.jj3;
import defpackage.jj7;
import defpackage.jm3;
import defpackage.jpu;
import defpackage.jq40;
import defpackage.jqy;
import defpackage.jrm;
import defpackage.jvd0;
import defpackage.jvh;
import defpackage.k00;
import defpackage.k05;
import defpackage.k53;
import defpackage.k54;
import defpackage.k650;
import defpackage.k830;
import defpackage.k980;
import defpackage.k9j;
import defpackage.ke3;
import defpackage.kf3;
import defpackage.kg3;
import defpackage.kgf;
import defpackage.ki3;
import defpackage.kj3;
import defpackage.knh;
import defpackage.kni0;
import defpackage.kpu;
import defpackage.krm;
import defpackage.kvh;
import defpackage.kvo;
import defpackage.kzh;
import defpackage.l830;
import defpackage.ld80;
import defpackage.le3;
import defpackage.lf3;
import defpackage.lfy;
import defpackage.li3;
import defpackage.lj3;
import defpackage.lk50;
import defpackage.ln7;
import defpackage.lop;
import defpackage.lq1;
import defpackage.lrh0;
import defpackage.lrm;
import defpackage.lsm;
import defpackage.luo;
import defpackage.lw2;
import defpackage.lws;
import defpackage.lx20;
import defpackage.lx5;
import defpackage.lyh;
import defpackage.m290;
import defpackage.m73;
import defpackage.m8s;
import defpackage.mc40;
import defpackage.me3;
import defpackage.med;
import defpackage.mgd0;
import defpackage.mhh0;
import defpackage.mj3;
import defpackage.mjf;
import defpackage.mkf;
import defpackage.mmc;
import defpackage.mpe0;
import defpackage.mqc;
import defpackage.mta0;
import defpackage.muo;
import defpackage.mwo;
import defpackage.mz7;
import defpackage.n1i;
import defpackage.n73;
import defpackage.n780;
import defpackage.n8j0;
import defpackage.ne3;
import defpackage.nf3;
import defpackage.nfi;
import defpackage.ng10;
import defpackage.nh4;
import defpackage.nhh0;
import defpackage.ni7;
import defpackage.nj3;
import defpackage.nkf;
import defpackage.nl0;
import defpackage.nnf;
import defpackage.nt3;
import defpackage.nty;
import defpackage.nuo;
import defpackage.nzm;
import defpackage.o2g;
import defpackage.o3i;
import defpackage.o5p;
import defpackage.o63;
import defpackage.o7d;
import defpackage.o8i0;
import defpackage.o8s;
import defpackage.oaj0;
import defpackage.oe3;
import defpackage.ogd0;
import defpackage.oh3;
import defpackage.oj3;
import defpackage.ooy;
import defpackage.op8;
import defpackage.or60;
import defpackage.ou90;
import defpackage.ouo;
import defpackage.ozh;
import defpackage.p05;
import defpackage.p54;
import defpackage.p63;
import defpackage.p8k;
import defpackage.paj;
import defpackage.pdd0;
import defpackage.pf3;
import defpackage.pj3;
import defpackage.pjh0;
import defpackage.pk2;
import defpackage.pkf;
import defpackage.pmw;
import defpackage.pu0;
import defpackage.pya;
import defpackage.pyk;
import defpackage.q05;
import defpackage.q3i;
import defpackage.q43;
import defpackage.q53;
import defpackage.q73;
import defpackage.q8i0;
import defpackage.q8k;
import defpackage.qf3;
import defpackage.qi3;
import defpackage.qj3;
import defpackage.qlr;
import defpackage.qm70;
import defpackage.qoa0;
import defpackage.qoy;
import defpackage.qq1;
import defpackage.qt1;
import defpackage.qvy;
import defpackage.qz2;
import defpackage.qz3;
import defpackage.qzm;
import defpackage.r0i;
import defpackage.r1i;
import defpackage.r2i;
import defpackage.r53;
import defpackage.r6i0;
import defpackage.r73;
import defpackage.r8i0;
import defpackage.rdd0;
import defpackage.rf3;
import defpackage.rj3;
import defpackage.rjh0;
import defpackage.rl0;
import defpackage.rlc;
import defpackage.rlf;
import defpackage.rml;
import defpackage.ru90;
import defpackage.ruo;
import defpackage.ruy;
import defpackage.rws;
import defpackage.rya;
import defpackage.rzm;
import defpackage.s1p;
import defpackage.s2i;
import defpackage.s2k;
import defpackage.s53;
import defpackage.s63;
import defpackage.s9s;
import defpackage.sa90;
import defpackage.sch;
import defpackage.sf3;
import defpackage.sfy;
import defpackage.sg2;
import defpackage.sh8;
import defpackage.shh0;
import defpackage.sj3;
import defpackage.sjh0;
import defpackage.slr;
import defpackage.sn5;
import defpackage.so3;
import defpackage.ss90;
import defpackage.sty;
import defpackage.sw9;
import defpackage.t090;
import defpackage.t2k;
import defpackage.t3g;
import defpackage.t880;
import defpackage.taj;
import defpackage.tb00;
import defpackage.tce0;
import defpackage.tch;
import defpackage.tf3;
import defpackage.tg3;
import defpackage.tit;
import defpackage.tj3;
import defpackage.tje0;
import defpackage.tjf;
import defpackage.tjh0;
import defpackage.tlf;
import defpackage.to3;
import defpackage.tw2;
import defpackage.ty0;
import defpackage.u1k;
import defpackage.u53;
import defpackage.u5y;
import defpackage.u63;
import defpackage.u6i0;
import defpackage.u7d0;
import defpackage.ucy;
import defpackage.uf3;
import defpackage.uh3;
import defpackage.uh30;
import defpackage.uhc;
import defpackage.ui90;
import defpackage.uj3;
import defpackage.uj50;
import defpackage.ujf;
import defpackage.ulc;
import defpackage.up3;
import defpackage.uqe0;
import defpackage.uy0;
import defpackage.v03;
import defpackage.v150;
import defpackage.v1b;
import defpackage.v5b;
import defpackage.v63;
import defpackage.v73;
import defpackage.v8i0;
import defpackage.va0;
import defpackage.vch0;
import defpackage.vf3;
import defpackage.vg3;
import defpackage.vgb0;
import defpackage.vho;
import defpackage.vj3;
import defpackage.vjk;
import defpackage.vn20;
import defpackage.vnh;
import defpackage.vp3;
import defpackage.vuo;
import defpackage.vuy;
import defpackage.vwv;
import defpackage.vxk;
import defpackage.w63;
import defpackage.w73;
import defpackage.w950;
import defpackage.wae;
import defpackage.we3;
import defpackage.whs;
import defpackage.wj3;
import defpackage.wm70;
import defpackage.wnh;
import defpackage.wsm;
import defpackage.ww2;
import defpackage.wwd0;
import defpackage.wxm;
import defpackage.wzh;
import defpackage.x26;
import defpackage.x5a0;
import defpackage.x63;
import defpackage.x73;
import defpackage.x8z;
import defpackage.xa00;
import defpackage.xe3;
import defpackage.xf3;
import defpackage.xfd0;
import defpackage.xi3;
import defpackage.xj3;
import defpackage.xjg0;
import defpackage.xlc;
import defpackage.xm90;
import defpackage.xnh;
import defpackage.xry;
import defpackage.xz80;
import defpackage.y53;
import defpackage.y5b;
import defpackage.y63;
import defpackage.y8j;
import defpackage.y8k;
import defpackage.yay;
import defpackage.yby;
import defpackage.yf3;
import defpackage.yi3;
import defpackage.yj3;
import defpackage.ykc0;
import defpackage.ymy;
import defpackage.ynh;
import defpackage.yrh0;
import defpackage.yty;
import defpackage.yyk;
import defpackage.yzh;
import defpackage.z63;
import defpackage.z73;
import defpackage.zch0;
import defpackage.zd2;
import defpackage.zi3;
import defpackage.zi50;
import defpackage.zik;
import defpackage.zox;
import defpackage.zry;
import defpackage.zu7;
import defpackage.zuy;
import defpackage.zvo;
import defpackage.zz80;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.Stack;
import java.util.WeakHashMap;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import java.util.function.Predicate;
import java.util.stream.Stream;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.e;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsKt;
import okhttp3.internal.luBk.Chyeyik;
import okhttp3.internal.ws.WebSocketProtocol;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u00062\u00020\u00072\u00020\b2\u00020\t2\u00020\n2\u00020\u000b2\u00020\f2\u00020\r2\u00020\u000e:\u0003\u0016\u0017\u0018B\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0019"}, d2 = {"Lcom/sportybet/plugin/realsports/betslip/widget/BetslipActivity;", "Lez1;", "Landroid/view/View$OnClickListener;", "Ltit;", "Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout$f;", "Landroid/view/View$OnTouchListener;", "Li8;", "Loaj0$a;", "Liu2$a;", "Lto3;", "Lnzm$a;", "Lk9j;", "", "Lbb40;", "Lrlf;", "<init>", "()V", "Landroid/view/View;", "view", "", "onClick", "(Landroid/view/View;)V", "b", "a", "c", "africa-bet-android"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class BetslipActivity extends rml implements View.OnClickListener, tit, SwipeRefreshLayout.f, View.OnTouchListener, oaj0.a, iu2.a, to3, nzm.a, k9j, bb40, rlf {
    public static final Set<g08> X2 = ay0.V(new g08[]{g08.REBET_FROM_HISTORY, g08.REBET_FROM_OPEN_BETS, g08.REBET_ON_CASHOUT_SUCCESSFUL_POPUP, g08.REBET_SUCCESSFUL_SAME, g08.REMIX_BET_RECOMMENDED_CODES});
    public p8k A;
    public lx20 A0;
    public boolean A1;
    public boolean A2;
    public q8k B;
    public sty B0;
    public boolean B1;
    public String B2;
    public nzm C;
    public sfy C0;
    public boolean C1;
    public boolean C2;
    public azm D;
    public s1p D0;
    public boolean D1;
    public boolean D2;
    public gbn E;
    public med E0;
    public boolean E1;
    public String E2;
    public JsonSerializeService F;
    public xfd0 F0;
    public boolean F1;
    public double F2;
    public erb G;
    public boolean G1;
    public final kvh G2;
    public wsm H;
    public boolean H1;
    public final cqy H2;
    public iym I;
    public GuideView I1;
    public final nl0 I2;
    public lq1 J;
    public boolean J1;
    public BetTypeFlexiBetConfig J2;
    public k650 K;
    public cg3 K1;
    public BetTypeAnyWinConfig K2;
    public vho L;
    public final ArrayList L1;
    public el0 L2;
    public ykc0 M;
    public String M1;
    public EarlyPayoutConfig M2;
    public dlc0 N;
    public boolean N1;
    public int N2;
    public uy0 O;
    public int O1;
    public boolean O2;
    public g9d0 P;
    public boolean P1;
    public boolean P2;
    public h3z Q;
    public boolean Q1;
    public boolean Q2;
    public com.sporty.android.common.uievent.e R;
    public boolean R1;
    public final LinkedHashMap R2;
    public y53 S;
    public long S1;
    public final kg3 S2;
    public xz80 T;
    public boolean T1;
    public final vg3 T2;
    public mjf U;
    public boolean U1;
    public final h U2;
    public hvo V;
    public boolean V1;
    public final f V2;
    public up3 W;
    public boolean W1;
    public final e W2;
    public up3 X;
    public boolean X1;
    public up3 Y;
    public int Y1;
    public gl0 Z;
    public String Z1;
    public h53 a0;
    public long a2;
    public lrm b;
    public s2k b0;
    public CountDownTimer b2;
    public t090 c;
    public t2k c0;
    public long c2;
    public jrm d;
    public shh0 d0;
    public boolean d2;
    public BetSlipDataStore e;
    public bih0 e0;
    public UserAddress e2;
    public hc40 f;
    public aih0 f0;
    public String f2;
    public zry g0;
    public double g2;
    public c980 h0;
    public long h2;
    public mc40 i;
    public i6f i0;
    public String i2;
    public fih0 j0;
    public String j2;
    public x26 k0;
    public kgf k2;
    public ebe l0;
    public nnf l2;
    public xnh m0;
    public final bqy m1;
    public boolean m2;
    public f5k n0;
    public final mpe0 n1;
    public boolean n2;
    public wnh o0;
    public final b63 o1;
    public boolean o2;
    public vnh p0;
    public so3 p1;
    public boolean p2;
    public ni7 q0;
    public String q1;
    public boolean q2;
    public gt90 r0;
    public int r1;
    public long r2;
    public it90 s0;
    public String s1;
    public long s2;
    public pmw t0;
    public int t1;
    public boolean t2;
    public cqe0 u0;
    public String u1;
    public boolean u2;
    public rdd0 v;
    public vp3 v0;
    public ArrayList v1;
    public boolean v2;
    public krm w;
    public o8s w0;
    public boolean w1;
    public String w2;
    public bi30 x0;
    public boolean x1;
    public String x2;
    public ynh y;
    public ww2 y0;
    public r53 y1;
    public String y2;
    public y8k z;
    public j990 z0;
    public float z1;
    public String z2;
    public final mpe0 G0 = hwr.b(new Function0() { // from class: of3
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            Set<g08> set = BetslipActivity.X2;
            return new dx4(this.a.w2());
        }
    });
    public final q8i0 H0 = new q8i0(jq40.a(q73.class), new x0(), new m0(), new i1());
    public final q8i0 I0 = new q8i0(jq40.a(u53.class), new e2(), new t1(), new j2());
    public final q8i0 J0 = new q8i0(jq40.a(i250.class), new l2(), new k2(), new m2());
    public final q8i0 K0 = new q8i0(jq40.a(ruy.class), new d0(), new c0(), new e0());
    public final q8i0 L0 = new q8i0(jq40.a(ujf.class), new g0(), new f0(), new h0());
    public final q8i0 M0 = new q8i0(jq40.a(bsy.class), new j0(), new i0(), new k0());
    public final q8i0 N0 = new q8i0(jq40.a(ijf.class), new n0(), new l0(), new o0());
    public final q8i0 O0 = new q8i0(jq40.a(xlc.class), new q0(), new p0(), new r0());
    public final q8i0 P0 = new q8i0(jq40.a(bpx.class), new t0(), new s0(), new u0());
    public final q8i0 Q0 = new q8i0(jq40.a(jqy.class), new w0(), new v0(), new y0());
    public final q8i0 R0 = new q8i0(jq40.a(eja0.class), new a1(), new z0(), new b1());
    public final q8i0 S0 = new q8i0(jq40.a(fj2.class), new d1(), new c1(), new e1());
    public final q8i0 T0 = new q8i0(jq40.a(rws.class), new g1(), new f1(), new h1());
    public final q8i0 U0 = new q8i0(jq40.a(tch.class), new k1(), new j1(), new l1());
    public final q8i0 V0 = new q8i0(jq40.a(ouo.class), new n1(), new m1(), new o1());
    public final q8i0 W0 = new q8i0(jq40.a(kvo.class), new q1(), new p1(), new r1());
    public final q8i0 X0 = new q8i0(jq40.a(yyk.class), new u1(), new s1(), new v1());
    public final q8i0 Y0 = new q8i0(jq40.a(sa90.class), new x1(), new w1(), new y1());
    public final q8i0 Z0 = new q8i0(jq40.a(hzz.class), new a2(), new z1(), new b2());
    public final q8i0 a1 = new q8i0(jq40.a(aj90.class), new d2(), new c2(), new f2());
    public final q8i0 b1 = new q8i0(jq40.a(fb1.class), new h2(), new g2(), new i2());
    public final Handler c1 = new Handler(Looper.getMainLooper());
    public final ema d1 = new ema();
    public final l830<String> e1 = new l830<>();
    public final l830<Boolean> f1 = new l830<>();
    public final k830<Boolean> g1 = new k830<>();
    public final zd2<String> h1 = new zd2<>();
    public final GroupTopic i1 = new GroupTopic(TopicType.BO_CONFIG_UPDATE.getPostfix());
    public final GroupTopic j1 = new GroupTopic("flexibleBet^statusv2");
    public final GroupTopic k1 = new GroupTopic("banned^events");
    public final JsonSerializeService l1 = sh8.b();

    /* JADX INFO: loaded from: classes7.dex */
    public interface a {
        void a();

        void b();
    }

    /* JADX INFO: loaded from: classes7.dex */
    public static final class a0 implements ViewTreeObserver.OnGlobalLayoutListener {
        public a0() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public final void onGlobalLayout() {
            Set<g08> set = BetslipActivity.X2;
            BetslipActivity betslipActivity = BetslipActivity.this;
            if (betslipActivity.S1().S.getHeight() > 0) {
                betslipActivity.v4();
                betslipActivity.S1().S.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            }
        }
    }

    /* JADX INFO: loaded from: classes7.dex */
    public static final class a1 extends qlr implements Function0<v8i0> {
        public a1() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final v8i0 invoke() {
            return BetslipActivity.this.getViewModelStore();
        }
    }

    /* JADX INFO: loaded from: classes7.dex */
    public static final class a2 extends qlr implements Function0<v8i0> {
        public a2() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final v8i0 invoke() {
            return BetslipActivity.this.getViewModelStore();
        }
    }

    /* JADX INFO: loaded from: classes7.dex */
    public static final class b {
        public final int a;
        public final String b;
        public final pdd0 c;
        public final pdd0 d;

        public b(int i, String str, pdd0 pdd0Var, pdd0 pdd0Var2) {
            pdd0Var.getClass();
            pdd0Var2.getClass();
            this.a = i;
            this.b = str;
            this.c = pdd0Var;
            this.d = pdd0Var2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.a == bVar.a && this.b.equals(bVar.b) && Intrinsics.g(this.c, bVar.c) && Intrinsics.g(this.d, bVar.d);
        }

        public final int hashCode() {
            return this.d.hashCode() + ((this.c.hashCode() + gmf0.a(Integer.hashCode(this.a) * 31, 31, this.b)) * 31);
        }

        public final String toString() {
            StringBuilder sbA = uqe0.a(this.a, "CombineSnackbarContent(messageRes=", ", dataOpAttribute=", this.b, ", viewEvent=");
            sbA.append(this.c);
            sbA.append(", clickEvent=");
            sbA.append(this.d);
            sbA.append(")");
            return sbA.toString();
        }
    }

    /* JADX INFO: loaded from: classes7.dex */
    public static final class b0 implements lfy, paj {
        public final /* synthetic */ Function1 a;

        public b0(Function1 function1) {
            this.a = function1;
        }

        @Override // defpackage.paj
        public final haj<?> c() {
            return this.a;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof lfy) && (obj instanceof paj)) {
                return Intrinsics.g(c(), ((paj) obj).c());
            }
            return false;
        }

        public final int hashCode() {
            return c().hashCode();
        }

        @Override // defpackage.lfy
        public final /* synthetic */ void u1(Object obj) {
            this.a.invoke(obj);
        }
    }

    /* JADX INFO: loaded from: classes7.dex */
    public static final class b1 extends qlr implements Function0<cyb> {
        public b1() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final cyb invoke() {
            return BetslipActivity.this.getDefaultViewModelCreationExtras();
        }
    }

    /* JADX INFO: loaded from: classes7.dex */
    public static final class b2 extends qlr implements Function0<cyb> {
        public b2() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final cyb invoke() {
            return BetslipActivity.this.getDefaultViewModelCreationExtras();
        }
    }

    /* JADX INFO: loaded from: classes7.dex */
    public static final class c {
        public static BigDecimal a(BigDecimal bigDecimal) {
            if (bigDecimal == null || bigDecimal.compareTo(BigDecimal.ZERO) == 0) {
                BigDecimal bigDecimal2 = BigDecimal.ZERO;
                bigDecimal2.getClass();
                return bigDecimal2;
            }
            BigDecimal bigDecimalDivide = bigDecimal.divide(BigDecimal.valueOf(10000L), 2, RoundingMode.FLOOR);
            bigDecimalDivide.getClass();
            return bigDecimalDivide;
        }
    }

    /* JADX INFO: loaded from: classes7.dex */
    public static final class c0 extends qlr implements Function0<r8i0.c> {
        public c0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final r8i0.c invoke() {
            return BetslipActivity.this.getDefaultViewModelProviderFactory();
        }
    }

    /* JADX INFO: loaded from: classes7.dex */
    public static final class c1 extends qlr implements Function0<r8i0.c> {
        public c1() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final r8i0.c invoke() {
            return BetslipActivity.this.getDefaultViewModelProviderFactory();
        }
    }

    /* JADX INFO: loaded from: classes7.dex */
    public static final class c2 extends qlr implements Function0<r8i0.c> {
        public c2() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final r8i0.c invoke() {
            return BetslipActivity.this.getDefaultViewModelProviderFactory();
        }
    }

    /* JADX INFO: loaded from: classes7.dex */
    public static final /* synthetic */ class d {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[azs.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                azs azsVar = azs.a;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            a = iArr;
            int[] iArr2 = new int[rl0.values().length];
            try {
                iArr2[2] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                rl0 rl0Var = rl0.a;
                iArr2[3] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            int[] iArr3 = new int[k53.values().length];
            try {
                iArr3[0] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                k53.a aVar = k53.b;
                iArr3[1] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                k53.a aVar2 = k53.b;
                iArr3[2] = 3;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* JADX INFO: loaded from: classes7.dex */
    public static final class d0 extends qlr implements Function0<v8i0> {
        public d0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final v8i0 invoke() {
            return BetslipActivity.this.getViewModelStore();
        }
    }

    /* JADX INFO: loaded from: classes7.dex */
    public static final class d1 extends qlr implements Function0<v8i0> {
        public d1() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final v8i0 invoke() {
            return BetslipActivity.this.getViewModelStore();
        }
    }

    /* JADX INFO: loaded from: classes7.dex */
    public static final class d2 extends qlr implements Function0<v8i0> {
        public d2() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final v8i0 invoke() {
            return BetslipActivity.this.getViewModelStore();
        }
    }

    /* JADX INFO: loaded from: classes7.dex */
    public static final class e implements Subscriber {

        @Metadata(d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001¨\u0006\u0004"}, d2 = {"com/sportybet/plugin/realsports/betslip/widget/BetslipActivity$e$a", "Lcom/google/gson/reflect/TypeToken;", "", "Lcom/sportybet/android/data/BannedItemSocket;", "africa-bet-android"}, k = 1, mv = {2, 4, 0}, xi = 48)
        public static final class a extends TypeToken<List<? extends BannedItemSocket>> {
        }

        public e() {
        }

        @Override // com.sportybet.ntespm.socket.Subscriber
        public final void onReceive(String str) {
            BetslipActivity betslipActivity = BetslipActivity.this;
            if (betslipActivity.V1 || betslipActivity.isFinishing() || !betslipActivity.w1) {
                return;
            }
            try {
                List list = (List) betslipActivity.l1.fromJson(str, new a().getType());
                list.getClass();
                ArrayList arrayListE = g2k.e(list);
                wwd0 wwd0Var = betslipActivity.Q1().W0;
                lk50.c cVar = new lk50.c(arrayListE);
                wwd0Var.getClass();
                wwd0Var.k(null, cVar);
            } catch (Exception e) {
                itf0.a aVar = itf0.a;
                aVar.q(MyLog.TAG_SOCKET);
                aVar.p(e, "Failed to parse bannedList Socket data: %s", str);
            }
        }
    }

    /* JADX INFO: loaded from: classes7.dex */
    public static final class e0 extends qlr implements Function0<cyb> {
        public e0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final cyb invoke() {
            return BetslipActivity.this.getDefaultViewModelCreationExtras();
        }
    }

    /* JADX INFO: loaded from: classes7.dex */
    public static final class e1 extends qlr implements Function0<cyb> {
        public e1() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final cyb invoke() {
            return BetslipActivity.this.getDefaultViewModelCreationExtras();
        }
    }

    /* JADX INFO: loaded from: classes7.dex */
    public static final class e2 extends qlr implements Function0<v8i0> {
        public e2() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final v8i0 invoke() {
            return BetslipActivity.this.getViewModelStore();
        }
    }

    /* JADX INFO: loaded from: classes7.dex */
    public static final class f implements Subscriber {

        @Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"com/sportybet/plugin/realsports/betslip/widget/BetslipActivity$f$a", "Lcom/google/gson/reflect/TypeToken;", "Lcom/sportybet/android/data/BOConfigSocket;", "africa-bet-android"}, k = 1, mv = {2, 4, 0}, xi = 48)
        public static final class a extends TypeToken<BOConfigSocket> {
        }

        public f() {
        }

        @Override // com.sportybet.ntespm.socket.Subscriber
        public final void onReceive(String str) {
            BetTypeFlexiBetConfig betTypeFlexiBetConfig;
            BetTypeFlexiBetConfig betTypeFlexiBetConfigC;
            BetslipActivity betslipActivity = BetslipActivity.this;
            if (betslipActivity.V1 || betslipActivity.isFinishing() || !betslipActivity.w1 || str == null || str.length() == 0) {
                return;
            }
            try {
                BOConfigSocket bOConfigSocket = (BOConfigSocket) betslipActivity.l1.fromJson(str, new a().getType());
                if (bOConfigSocket == null) {
                    return;
                }
                String configKey = bOConfigSocket.getConfigKey();
                String configValue = bOConfigSocket.getConfigValue();
                if (configKey != null && configValue != null) {
                    if (TextUtils.equals(configKey, BOConfigParam.AnyWinStatus.getConfigKey()) || TextUtils.equals(configKey, BOConfigParam.AnyWinMinOdds.getConfigKey()) || TextUtils.equals(configKey, BOConfigParam.AnyWinMinSelectionOdds.getConfigKey()) || TextUtils.equals(configKey, BOConfigParam.AnyWinMinSelectionNumber.getConfigKey()) || TextUtils.equals(configKey, BOConfigParam.AnyWinMaxSelectionNumber.getConfigKey())) {
                        gl0 gl0Var = betslipActivity.Z;
                        if (gl0Var == null) {
                            Intrinsics.n("anyWinDomainService");
                            throw null;
                        }
                        gl0Var.a(betslipActivity.getLifecycle(), true);
                    }
                    if (!fd3.a(configKey) || (betTypeFlexiBetConfig = betslipActivity.J2) == null || (betTypeFlexiBetConfigC = fd3.c(betTypeFlexiBetConfig, configKey, configValue)) == null) {
                        return;
                    }
                    if (betTypeFlexiBetConfigC.equals(betslipActivity.J2)) {
                        betTypeFlexiBetConfigC = null;
                    }
                    if (betTypeFlexiBetConfigC != null) {
                        q73 q73VarQ1 = betslipActivity.Q1();
                        ej5.c(o8i0.d(q73VarQ1), null, null, new f83(q73VarQ1, betTypeFlexiBetConfigC, null), 3);
                    }
                }
            } catch (Exception e) {
                itf0.a aVar = itf0.a;
                aVar.q(MyLog.TAG_SOCKET);
                aVar.p(e, "Failed to parse bo config socket data: %s", str);
            }
        }
    }

    /* JADX INFO: loaded from: classes7.dex */
    public static final class f0 extends qlr implements Function0<r8i0.c> {
        public f0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final r8i0.c invoke() {
            return BetslipActivity.this.getDefaultViewModelProviderFactory();
        }
    }

    /* JADX INFO: loaded from: classes7.dex */
    public static final class f1 extends qlr implements Function0<r8i0.c> {
        public f1() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final r8i0.c invoke() {
            return BetslipActivity.this.getDefaultViewModelProviderFactory();
        }
    }

    /* JADX INFO: loaded from: classes7.dex */
    public static final class f2 extends qlr implements Function0<cyb> {
        public f2() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final cyb invoke() {
            return BetslipActivity.this.getDefaultViewModelCreationExtras();
        }
    }

    /* JADX INFO: loaded from: classes7.dex */
    @c0d(c = "com.sportybet.plugin.realsports.betslip.widget.BetslipActivity$deleteSelection$1", f = "BetslipActivity.kt", l = {11608}, m = "invokeSuspend", v = 2)
    public static final class g extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;

        public g(v1b<? super g> v1bVar) {
            super(2, v1bVar);
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return BetslipActivity.this.new g(v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((g) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            int i = this.a;
            if (i == 0) {
                uj50.b(obj);
                mc40 mc40Var = BetslipActivity.this.i;
                if (mc40Var == null) {
                    Intrinsics.n("rebetRemixFunnelState");
                    throw null;
                }
                this.a = 1;
                if (mc40Var.a.getRebetRemixStep2TimestampMillis().a(this) == y5bVar) {
                    return y5bVar;
                }
            } else {
                if (i != 1) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                uj50.b(obj);
            }
            return Unit.a;
        }
    }

    /* JADX INFO: loaded from: classes7.dex */
    public static final class g0 extends qlr implements Function0<v8i0> {
        public g0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final v8i0 invoke() {
            return BetslipActivity.this.getViewModelStore();
        }
    }

    /* JADX INFO: loaded from: classes7.dex */
    public static final class g1 extends qlr implements Function0<v8i0> {
        public g1() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final v8i0 invoke() {
            return BetslipActivity.this.getViewModelStore();
        }
    }

    /* JADX INFO: loaded from: classes7.dex */
    public static final class g2 extends qlr implements Function0<r8i0.c> {
        public g2() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final r8i0.c invoke() {
            return BetslipActivity.this.getDefaultViewModelProviderFactory();
        }
    }

    /* JADX INFO: loaded from: classes7.dex */
    public static final class h implements Subscriber {
        public h() {
        }

        @Override // com.sportybet.ntespm.socket.Subscriber
        public final void onReceive(String str) {
            BetslipActivity betslipActivity = BetslipActivity.this;
            if (betslipActivity.V1 || betslipActivity.isFinishing() || !betslipActivity.w1 || betslipActivity.J2 == null) {
                return;
            }
            try {
                JSONArray jSONArray = new JSONArray(str);
                if (jSONArray.length() != 1) {
                    return;
                }
                int iOptInt = jSONArray.optInt(0);
                if (iOptInt == 0 || iOptInt == 1 || iOptInt == 2) {
                    BetTypeFlexiBetConfig betTypeFlexiBetConfig = betslipActivity.J2;
                    BetTypeFlexiBetConfig betTypeFlexiBetConfigCopy$default = betTypeFlexiBetConfig != null ? BetTypeFlexiBetConfig.copy$default(betTypeFlexiBetConfig, null, null, false, null, null, null, null, iOptInt, 127, null) : null;
                    betslipActivity.J2 = betTypeFlexiBetConfigCopy$default;
                    if (betTypeFlexiBetConfigCopy$default != null) {
                        q73 q73VarQ1 = betslipActivity.Q1();
                        ej5.c(o8i0.d(q73VarQ1), null, null, new f83(q73VarQ1, betTypeFlexiBetConfigCopy$default, null), 3);
                    }
                    betslipActivity.C4(false, false);
                }
            } catch (Exception e) {
                itf0.a aVar = itf0.a;
                aVar.q(MyLog.TAG_SOCKET);
                aVar.p(e, "Failed to parse FlexibleBet Socket data: %s", str);
            }
        }
    }

    /* JADX INFO: loaded from: classes7.dex */
    public static final class h0 extends qlr implements Function0<cyb> {
        public h0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final cyb invoke() {
            return BetslipActivity.this.getDefaultViewModelCreationExtras();
        }
    }

    /* JADX INFO: loaded from: classes7.dex */
    public static final class h1 extends qlr implements Function0<cyb> {
        public h1() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final cyb invoke() {
            return BetslipActivity.this.getDefaultViewModelCreationExtras();
        }
    }

    /* JADX INFO: loaded from: classes7.dex */
    public static final class h2 extends qlr implements Function0<v8i0> {
        public h2() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final v8i0 invoke() {
            return BetslipActivity.this.getViewModelStore();
        }
    }

    /* JADX INFO: loaded from: classes7.dex */
    public static final class i implements rzm {
        public i() {
        }

        @Override // defpackage.rzm
        public final void a() {
            Set<g08> set = BetslipActivity.X2;
            BetslipActivity betslipActivity = BetslipActivity.this;
            betslipActivity.getAccountHelper().demandAccount(betslipActivity, betslipActivity);
            betslipActivity.R1 = true;
        }
    }

    /* JADX INFO: loaded from: classes7.dex */
    public static final class i0 extends qlr implements Function0<r8i0.c> {
        public i0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final r8i0.c invoke() {
            return BetslipActivity.this.getDefaultViewModelProviderFactory();
        }
    }

    /* JADX INFO: loaded from: classes7.dex */
    public static final class i1 extends qlr implements Function0<cyb> {
        public i1() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final cyb invoke() {
            return BetslipActivity.this.getDefaultViewModelCreationExtras();
        }
    }

    /* JADX INFO: loaded from: classes7.dex */
    public static final class i2 extends qlr implements Function0<cyb> {
        public i2() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final cyb invoke() {
            return BetslipActivity.this.getDefaultViewModelCreationExtras();
        }
    }

    /* JADX INFO: loaded from: classes7.dex */
    public static final class j implements qzm {
        public j() {
        }

        @Override // defpackage.qzm
        public final void a() {
            sh8.c().e(o7d.a(wae.SWIPE_BET));
            BetslipActivity.this.finish();
        }
    }

    /* JADX INFO: loaded from: classes7.dex */
    public static final class j0 extends qlr implements Function0<v8i0> {
        public j0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final v8i0 invoke() {
            return BetslipActivity.this.getViewModelStore();
        }
    }

    /* JADX INFO: loaded from: classes7.dex */
    public static final class j1 extends qlr implements Function0<r8i0.c> {
        public j1() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final r8i0.c invoke() {
            return BetslipActivity.this.getDefaultViewModelProviderFactory();
        }
    }

    /* JADX INFO: loaded from: classes7.dex */
    public static final class j2 extends qlr implements Function0<cyb> {
        public j2() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final cyb invoke() {
            return BetslipActivity.this.getDefaultViewModelCreationExtras();
        }
    }

    /* JADX INFO: loaded from: classes7.dex */
    public static final class k implements q05 {
        public k() {
        }

        @Override // defpackage.q05
        public final void a(p05 p05Var) {
            Set<g08> set = BetslipActivity.X2;
            rws.y1(BetslipActivity.this.h2(), p05Var.a, g08.LOAD_BOOKING_CODE_EMPTY_BETSLIP, null, 28);
        }
    }

    /* JADX INFO: loaded from: classes7.dex */
    public static final class k0 extends qlr implements Function0<cyb> {
        public k0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final cyb invoke() {
            return BetslipActivity.this.getDefaultViewModelCreationExtras();
        }
    }

    /* JADX INFO: loaded from: classes7.dex */
    public static final class k1 extends qlr implements Function0<v8i0> {
        public k1() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final v8i0 invoke() {
            return BetslipActivity.this.getViewModelStore();
        }
    }

    /* JADX INFO: loaded from: classes7.dex */
    public static final class k2 extends qlr implements Function0<r8i0.c> {
        public k2() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final r8i0.c invoke() {
            return BetslipActivity.this.getDefaultViewModelProviderFactory();
        }
    }

    /* JADX INFO: loaded from: classes7.dex */
    public static final class l implements ij40 {
        public l() {
        }

        @Override // defpackage.ij40
        public final jvd0 a() {
            Set<g08> set = BetslipActivity.X2;
            return BetslipActivity.this.X1().C1();
        }
    }

    /* JADX INFO: loaded from: classes7.dex */
    public static final class l0 extends qlr implements Function0<r8i0.c> {
        public l0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final r8i0.c invoke() {
            return BetslipActivity.this.getDefaultViewModelProviderFactory();
        }
    }

    /* JADX INFO: loaded from: classes7.dex */
    public static final class l1 extends qlr implements Function0<cyb> {
        public l1() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final cyb invoke() {
            return BetslipActivity.this.getDefaultViewModelCreationExtras();
        }
    }

    /* JADX INFO: loaded from: classes7.dex */
    public static final class l2 extends qlr implements Function0<v8i0> {
        public l2() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final v8i0 invoke() {
            return BetslipActivity.this.getViewModelStore();
        }
    }

    /* JADX INFO: loaded from: classes7.dex */
    public static final class m implements fz4 {
        public m() {
        }

        @Override // defpackage.fz4
        public final void a(ez4 ez4Var) {
            Set<g08> set = BetslipActivity.X2;
            BetslipActivity.this.X1().B1(ez4Var);
        }
    }

    /* JADX INFO: loaded from: classes7.dex */
    public static final class m0 extends qlr implements Function0<r8i0.c> {
        public m0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final r8i0.c invoke() {
            return BetslipActivity.this.getDefaultViewModelProviderFactory();
        }
    }

    /* JADX INFO: loaded from: classes7.dex */
    public static final class m1 extends qlr implements Function0<r8i0.c> {
        public m1() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final r8i0.c invoke() {
            return BetslipActivity.this.getDefaultViewModelProviderFactory();
        }
    }

    /* JADX INFO: loaded from: classes7.dex */
    public static final class m2 extends qlr implements Function0<cyb> {
        public m2() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final cyb invoke() {
            return BetslipActivity.this.getDefaultViewModelCreationExtras();
        }
    }

    @c0d(c = "com.sportybet.plugin.realsports.betslip.widget.BetslipActivity$maybeSendRetainSelectionsAfterRebetEvent$1", f = "BetslipActivity.kt", l = {3715}, m = "invokeSuspend", v = 2)
    public static final class n extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;

        public n(v1b<? super n> v1bVar) {
            super(2, v1bVar);
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return BetslipActivity.this.new n(v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((n) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            int i = this.a;
            BetslipActivity betslipActivity = BetslipActivity.this;
            if (i == 0) {
                uj50.b(obj);
                BetSlipDataStore betSlipDataStore = betslipActivity.e;
                if (betSlipDataStore == null) {
                    Intrinsics.n(CaxEybC.FAHdcEhkI);
                    throw null;
                }
                String userId = betslipActivity.getAccountHelper().getUserId();
                if (userId == null) {
                    userId = "";
                }
                this.a = 1;
                obj = betSlipDataStore.getRetainSelectionsAfterRebet(userId, this);
                if (obj == y5bVar) {
                    return y5bVar;
                }
            } else {
                if (i != 1) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                uj50.b(obj);
            }
            boolean zBooleanValue = ((Boolean) obj).booleanValue();
            rdd0 rdd0Var = betslipActivity.v;
            if (rdd0Var != null) {
                rdd0Var.a(new v03.o0(kpu.d(new Pair("value", zBooleanValue ? AnalyticsParam.EVENT_STATUS_ON : AnalyticsParam.EVENT_STATUS_OFF))), k00.c);
                return Unit.a;
            }
            Intrinsics.n("sportyTrackingUseCase");
            throw null;
        }
    }

    /* JADX INFO: loaded from: classes7.dex */
    public static final class n0 extends qlr implements Function0<v8i0> {
        public n0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final v8i0 invoke() {
            return BetslipActivity.this.getViewModelStore();
        }
    }

    /* JADX INFO: loaded from: classes7.dex */
    public static final class n1 extends qlr implements Function0<v8i0> {
        public n1() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final v8i0 invoke() {
            return BetslipActivity.this.getViewModelStore();
        }
    }

    /* JADX INFO: loaded from: classes7.dex */
    public static final class n2 implements com.sportybet.plugin.realsports.betslip.widget.d.c {
        public n2() {
        }

        @Override // com.sportybet.plugin.realsports.betslip.widget.d.c
        public final void a() {
            BetslipActivity betslipActivity = BetslipActivity.this;
            if (betslipActivity.N1().m0()) {
                q73 q73VarQ1 = betslipActivity.Q1();
                q73VarQ1.i0.a(betslipActivity.N1().v0(), betslipActivity.N1().t1());
            }
        }

        @Override // com.sportybet.plugin.realsports.betslip.widget.d.c
        public final void b() {
            Set<g08> set = BetslipActivity.X2;
            BetslipActivity betslipActivity = BetslipActivity.this;
            betslipActivity.Q1().L1(betslipActivity.Q1().G1());
        }

        @Override // com.sportybet.plugin.realsports.betslip.widget.d.c
        public final void onCancel() {
        }
    }

    /* JADX INFO: loaded from: classes7.dex */
    @c0d(c = "com.sportybet.plugin.realsports.betslip.widget.BetslipActivity$maybeShowBetslipCombineSnackbar$1", f = "BetslipActivity.kt", l = {5391}, m = "invokeSuspend", v = 2)
    public static final class o extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ lws c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o(lws lwsVar, v1b<? super o> v1bVar) {
            super(2, v1bVar);
            this.c = lwsVar;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return BetslipActivity.this.new o(this.c, v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((o) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            final b bVar;
            y5b y5bVar = y5b.a;
            int i = this.a;
            final BetslipActivity betslipActivity = BetslipActivity.this;
            if (i == 0) {
                uj50.b(obj);
                Set<g08> set = BetslipActivity.X2;
                String userId = betslipActivity.getAccountHelper().getUserId();
                if (userId == null) {
                    userId = "";
                }
                hc40 hc40Var = betslipActivity.f;
                if (hc40Var == null) {
                    Intrinsics.n("rebetRemixCombineAnTestHelper");
                    throw null;
                }
                this.a = 1;
                obj = hc40Var.c.isRebetRemixCombineVariant(userId, this);
                if (obj == y5bVar) {
                    return y5bVar;
                }
            } else {
                if (i != 1) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                uj50.b(obj);
            }
            if (!((Boolean) obj).booleanValue()) {
                return Unit.a;
            }
            int iOrdinal = this.c.ordinal();
            if (iOrdinal == 0) {
                bVar = new b(R.string.component_betslip__combined_with_new_selections, "betslip__combined_snackbar_settings_btn", v03.a0.a, v03.z.a);
            } else {
                if (iOrdinal != 1 && iOrdinal != 2) {
                    uhc.a();
                    return null;
                }
                bVar = new b(R.string.component_betslip__betslip_replaced, "betslip__replaced_snackbar_settings_btn", v03.n0.a, v03.m0.a);
            }
            Set<g08> set2 = BetslipActivity.X2;
            ConstraintLayout constraintLayout = betslipActivity.S1().a;
            constraintLayout.getClass();
            h3a0 h3a0Var = new h3a0(constraintLayout);
            String cMSString = betslipActivity.getCMSString(bVar.a, new Object[0]);
            cMSString.getClass();
            h3a0Var.b = cMSString;
            h3a0Var.c = betslipActivity.getCMSString(R.string.wap_setting__navbar_title, new Object[0]);
            h3a0Var.d = new Function0() { // from class: zj3
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    BetslipActivity betslipActivity2 = betslipActivity;
                    rdd0 rdd0Var = betslipActivity2.v;
                    if (rdd0Var == null) {
                        Intrinsics.n(QQWMbKFOuTf.HEEeTlwynJqy);
                        throw null;
                    }
                    rdd0Var.a(bVar.d, k00.d);
                    betslipActivity2.r3();
                    return Unit.a;
                }
            };
            Snackbar snackbarA = h3a0Var.a();
            if (snackbarA == null) {
                return Unit.a;
            }
            View viewFindViewById = snackbarA.i.findViewById(R.id.snackbar_action);
            if (viewFindViewById != null) {
                betslipActivity.getFullStoryCommonManager().e(viewFindViewById, bVar.b);
            }
            snackbarA.j();
            rdd0 rdd0Var = betslipActivity.v;
            if (rdd0Var == null) {
                Intrinsics.n("sportyTrackingUseCase");
                throw null;
            }
            rdd0Var.a(bVar.c, k00.d);
            return Unit.a;
        }
    }

    /* JADX INFO: loaded from: classes7.dex */
    public static final class o0 extends qlr implements Function0<cyb> {
        public o0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final cyb invoke() {
            return BetslipActivity.this.getDefaultViewModelCreationExtras();
        }
    }

    /* JADX INFO: loaded from: classes7.dex */
    public static final class o1 extends qlr implements Function0<cyb> {
        public o1() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final cyb invoke() {
            return BetslipActivity.this.getDefaultViewModelCreationExtras();
        }
    }

    /* JADX INFO: loaded from: classes7.dex */
    public static final class o2 implements ViewTreeObserver.OnGlobalLayoutListener {
        public o2() {
        }

        /* JADX WARN: Type inference failed for: r4v2, types: [cg3] */
        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public final void onGlobalLayout() {
            Set<g08> set = BetslipActivity.X2;
            final BetslipActivity betslipActivity = BetslipActivity.this;
            betslipActivity.S1().y.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            if (vn20.c("flexibet_sp_v2", "showRookie", false) || betslipActivity.S1().y.getVisibility() != 0) {
                return;
            }
            vn20.g("flexibet_sp_v2", "showRookie", true, false);
            betslipActivity.K1 = new Runnable() { // from class: cg3
                /* JADX WARN: Type inference fix 'apply assigned field type' failed
                java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
                	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
                	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
                	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
                 */
                @Override // java.lang.Runnable
                public final void run() {
                    Set<g08> set2 = BetslipActivity.X2;
                    final BetslipActivity betslipActivity2 = betslipActivity;
                    if (betslipActivity2.isFinishing() || betslipActivity2.S1().i.getVisibility() == 0) {
                        return;
                    }
                    Rect rect = new Rect();
                    betslipActivity2.getWindow().getDecorView().getWindowVisibleDisplayFrame(rect);
                    int i = rect.top;
                    GuideView guideView = new GuideView(betslipActivity2);
                    guideView.a = -1308622848;
                    guideView.w = i;
                    guideView.b();
                    betslipActivity2.I1 = guideView;
                    int[] iArr = new int[2];
                    betslipActivity2.S1().y.getLocationOnScreen(iArr);
                    int iB = (zch0.b(betslipActivity2.getResources(), 47) + iArr[1]) - rect.top;
                    ImageView imageView = new ImageView(betslipActivity2);
                    imageView.setImageResource(R.drawable.spr_right_introduce_arrow);
                    GuideView guideView2 = betslipActivity2.I1;
                    if (guideView2 != null) {
                        guideView2.addView(imageView, zch0.d(zch0.b(betslipActivity2.getResources(), -60), iB));
                    }
                    GuideView guideView3 = betslipActivity2.I1;
                    if (guideView3 != null) {
                        String cMSString = betslipActivity2.getCMSString(R.string.component_betslip__tap_to_boost_your_odds_and_potential_winnings, new Object[0]);
                        LinearLayout linearLayout = new LinearLayout(betslipActivity2);
                        linearLayout.setOrientation(1);
                        linearLayout.setGravity(1);
                        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
                        TextView textView = new TextView(betslipActivity2);
                        textView.setText(cMSString);
                        textView.setTextColor(-1);
                        textView.setTextSize(15.0f);
                        textView.setLineSpacing(zch0.b(betslipActivity2.getResources(), 5), 1.0f);
                        textView.setGravity(17);
                        linearLayout.addView(textView, layoutParams);
                        layoutParams.topMargin = zch0.b(betslipActivity2.getResources(), 10);
                        String cMSString2 = betslipActivity2.getCMSString(R.string.component_betslip__got_it, new Object[0]);
                        TextView textView2 = new TextView(betslipActivity2);
                        textView2.setTextColor(-1);
                        textView2.setTextSize(15.0f);
                        textView2.setPadding(zch0.b(betslipActivity2.getResources(), 15), zch0.b(betslipActivity2.getResources(), 5), zch0.b(betslipActivity2.getResources(), 15), zch0.b(betslipActivity2.getResources(), 5));
                        textView2.setBackgroundResource(R.drawable.spr_bg_white_rect);
                        textView2.setText(cMSString2);
                        textView2.setOnClickListener(new View.OnClickListener() { // from class: fi3
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                GuideView guideView4 = betslipActivity2.I1;
                                if (guideView4 != null) {
                                    ViewParent parent = guideView4.getParent();
                                    ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
                                    if (viewGroup != null) {
                                        Bitmap bitmap = guideView4.d;
                                        if (bitmap != null) {
                                            bitmap.recycle();
                                            guideView4.d = null;
                                        }
                                        viewGroup.removeView(guideView4);
                                    }
                                }
                            }
                        });
                        linearLayout.addView(textView2, layoutParams);
                        guideView3.addView(linearLayout, zch0.d(0, zch0.b(betslipActivity2.getResources(), 80) + iB));
                    }
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(betslipActivity2.S1().y);
                    GuideView guideView4 = betslipActivity2.I1;
                    if (guideView4 != null) {
                        guideView4.setDate(arrayList);
                    }
                    View decorView = betslipActivity2.getWindow().getDecorView();
                    decorView.getClass();
                    FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, -1);
                    layoutParams2.topMargin = rect.top;
                    ((FrameLayout) decorView).addView(betslipActivity2.I1, layoutParams2);
                    betslipActivity2.J1 = true;
                }
            };
            betslipActivity.S1().y.postDelayed(betslipActivity.K1, 300L);
        }
    }

    /* JADX INFO: loaded from: classes7.dex */
    public static final class p implements a {
        public final /* synthetic */ List<Selection> a;
        public final /* synthetic */ List<Selection> b;
        public final /* synthetic */ BetslipActivity c;
        public final /* synthetic */ boolean d;

        /* JADX WARN: Multi-variable type inference failed */
        public p(List<? extends Selection> list, List<? extends Selection> list2, BetslipActivity betslipActivity, boolean z) {
            this.a = list;
            this.b = list2;
            this.c = betslipActivity;
            this.d = z;
        }

        @Override // com.sportybet.plugin.realsports.betslip.widget.BetslipActivity.a
        public final void a() {
            Set<g08> set = BetslipActivity.X2;
            BetslipActivity betslipActivity = this.c;
            betslipActivity.Q1().P0.a(a53.b.a);
            betslipActivity.w4(true, true);
            betslipActivity.S1().D.setInsureEarlyGoalsChecked(!this.d);
        }

        @Override // com.sportybet.plugin.realsports.betslip.widget.BetslipActivity.a
        public final void b() {
            List<Selection> list = this.a;
            if (list.isEmpty()) {
                list = this.b;
            }
            int size = list.size();
            int i = 0;
            while (true) {
                BetslipActivity betslipActivity = this.c;
                if (i >= size) {
                    Set<g08> set = BetslipActivity.X2;
                    betslipActivity.Q1().P0.a(a53.b.a);
                    betslipActivity.x3();
                    betslipActivity.w4(true, true);
                    betslipActivity.A2(this.d);
                    return;
                }
                Selection selection = list.get(i);
                Set<g08> set2 = BetslipActivity.X2;
                betslipActivity.H1(selection);
                i++;
            }
        }
    }

    /* JADX INFO: loaded from: classes7.dex */
    public static final class p0 extends qlr implements Function0<r8i0.c> {
        public p0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final r8i0.c invoke() {
            return BetslipActivity.this.getDefaultViewModelProviderFactory();
        }
    }

    /* JADX INFO: loaded from: classes7.dex */
    public static final class p1 extends qlr implements Function0<r8i0.c> {
        public p1() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final r8i0.c invoke() {
            return BetslipActivity.this.getDefaultViewModelProviderFactory();
        }
    }

    /* JADX INFO: loaded from: classes7.dex */
    public static final class p2 implements Animation.AnimationListener {
        public p2() {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public final void onAnimationEnd(Animation animation) {
            Set<g08> set = BetslipActivity.X2;
            BetslipActivity.this.T3(1500L, true);
        }

        @Override // android.view.animation.Animation.AnimationListener
        public final void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public final void onAnimationStart(Animation animation) {
        }
    }

    /* JADX INFO: loaded from: classes7.dex */
    public static final class q implements a {
        public final /* synthetic */ List<Selection> a;
        public final /* synthetic */ List<Selection> b;
        public final /* synthetic */ BetslipActivity c;
        public final /* synthetic */ zuy d;
        public final /* synthetic */ huy e;
        public final /* synthetic */ avy f;

        /* JADX WARN: Multi-variable type inference failed */
        public q(List<? extends Selection> list, List<? extends Selection> list2, BetslipActivity betslipActivity, zuy zuyVar, huy huyVar, avy avyVar, avy avyVar2) {
            this.a = list;
            this.b = list2;
            this.c = betslipActivity;
            this.d = zuyVar;
            this.e = huyVar;
            this.f = avyVar;
        }

        @Override // com.sportybet.plugin.realsports.betslip.widget.BetslipActivity.a
        public final void a() {
            Set<g08> set = BetslipActivity.X2;
            BetslipActivity betslipActivity = this.c;
            betslipActivity.Q1().P0.a(a53.b.a);
            betslipActivity.w4(true, true);
            betslipActivity.F4();
        }

        @Override // com.sportybet.plugin.realsports.betslip.widget.BetslipActivity.a
        public final void b() {
            List<Selection> list = this.a;
            if (list.isEmpty()) {
                list = this.b;
            }
            int size = list.size();
            int i = 0;
            while (true) {
                BetslipActivity betslipActivity = this.c;
                if (i >= size) {
                    Set<g08> set = BetslipActivity.X2;
                    betslipActivity.Q1().P0.a(a53.b.a);
                    betslipActivity.x3();
                    betslipActivity.w4(true, true);
                    betslipActivity.F2(this.d, this.e, this.f);
                    return;
                }
                Selection selection = list.get(i);
                Set<g08> set2 = BetslipActivity.X2;
                betslipActivity.H1(selection);
                i++;
            }
        }
    }

    /* JADX INFO: loaded from: classes7.dex */
    public static final class q0 extends qlr implements Function0<v8i0> {
        public q0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final v8i0 invoke() {
            return BetslipActivity.this.getViewModelStore();
        }
    }

    /* JADX INFO: loaded from: classes7.dex */
    public static final class q1 extends qlr implements Function0<v8i0> {
        public q1() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final v8i0 invoke() {
            return BetslipActivity.this.getViewModelStore();
        }
    }

    /* JADX INFO: loaded from: classes7.dex */
    public static final class r {

        @c0d(c = "com.sportybet.plugin.realsports.betslip.widget.BetslipActivity$openBetSettingsDialog$1$onAutoRemoveCurrentSelection$1", f = "BetslipActivity.kt", l = {5316, 5317, 5318}, m = "invokeSuspend", v = 2)
        public static final class a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
            public String a;
            public int b;
            public final /* synthetic */ BetslipActivity c;
            public final /* synthetic */ boolean d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(BetslipActivity betslipActivity, boolean z, v1b<? super a> v1bVar) {
                super(2, v1bVar);
                this.c = betslipActivity;
                this.d = z;
            }

            @Override // defpackage.pz1
            public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
                return new a(this.c, this.d, v1bVar);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
                return ((a) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
            }

            /* JADX WARN: Code duplicated, block: B:28:0x0064  */
            /* JADX WARN: Code duplicated, block: B:30:0x0068  */
            /* JADX WARN: Code duplicated, block: B:33:0x0073  */
            /* JADX WARN: Code restructure failed: missing block: B:31:0x0070, code lost:
            
                if (r9.markRetainSelectionsUserOverridden(r1, r8) == r0) goto L32;
             */
            @Override // defpackage.pz1
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r9) {
                /*
                    r8 = this;
                    y5b r0 = defpackage.y5b.a
                    int r1 = r8.b
                    java.lang.String r2 = "betSlipDataStore"
                    r3 = 0
                    r4 = 3
                    r5 = 2
                    r6 = 1
                    com.sportybet.plugin.realsports.betslip.widget.BetslipActivity r7 = r8.c
                    if (r1 == 0) goto L2a
                    if (r1 == r6) goto L24
                    if (r1 == r5) goto L1e
                    if (r1 != r4) goto L18
                    defpackage.uj50.b(r9)
                    goto L77
                L18:
                    java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                    defpackage.ib5.a(r8)
                    return r3
                L1e:
                    java.lang.String r1 = r8.a
                    defpackage.uj50.b(r9)
                    goto L5c
                L24:
                    java.lang.String r1 = r8.a
                    defpackage.uj50.b(r9)
                    goto L4d
                L2a:
                    defpackage.uj50.b(r9)
                    java.util.Set<g08> r9 = com.sportybet.plugin.realsports.betslip.widget.BetslipActivity.X2
                    uqm r9 = r7.getAccountHelper()
                    java.lang.String r9 = r9.getUserId()
                    if (r9 != 0) goto L3b
                    java.lang.String r9 = ""
                L3b:
                    com.sportybet.plugin.realsports.data.local.BetSlipDataStore r1 = r7.e
                    if (r1 == 0) goto L7e
                    r8.a = r9
                    r8.b = r6
                    boolean r6 = r8.d
                    java.lang.Object r1 = r1.setRetainSelectionsAfterRebet(r9, r6, r8)
                    if (r1 != r0) goto L4c
                    goto L72
                L4c:
                    r1 = r9
                L4d:
                    com.sportybet.plugin.realsports.data.local.BetSlipDataStore r9 = r7.e
                    if (r9 == 0) goto L7a
                    r8.a = r1
                    r8.b = r5
                    java.lang.Object r9 = r9.hasEnteredRebetRemixCombineTest(r1, r8)
                    if (r9 != r0) goto L5c
                    goto L72
                L5c:
                    java.lang.Boolean r9 = (java.lang.Boolean) r9
                    boolean r9 = r9.booleanValue()
                    if (r9 == 0) goto L77
                    com.sportybet.plugin.realsports.data.local.BetSlipDataStore r9 = r7.e
                    if (r9 == 0) goto L73
                    r8.a = r3
                    r8.b = r4
                    java.lang.Object r8 = r9.markRetainSelectionsUserOverridden(r1, r8)
                    if (r8 != r0) goto L77
                L72:
                    return r0
                L73:
                    kotlin.jvm.internal.Intrinsics.n(r2)
                    throw r3
                L77:
                    kotlin.Unit r8 = kotlin.Unit.a
                    return r8
                L7a:
                    kotlin.jvm.internal.Intrinsics.n(r2)
                    throw r3
                L7e:
                    kotlin.jvm.internal.Intrinsics.n(r2)
                    throw r3
                */
                throw new UnsupportedOperationException("Method not decompiled: com.sportybet.plugin.realsports.betslip.widget.BetslipActivity.r.a.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        public r() {
        }

        public final void a(boolean z) {
            Set<g08> set = BetslipActivity.X2;
            BetslipActivity betslipActivity = BetslipActivity.this;
            if (betslipActivity.getAccountHelper().isLogin()) {
                ej5.c(ebs.a(betslipActivity.getLifecycle()), null, null, new a(betslipActivity, z, null), 3);
            }
        }

        public final void b(boolean z) {
            Set<g08> set = BetslipActivity.X2;
            BetslipActivity betslipActivity = BetslipActivity.this;
            betslipActivity.v2().F = false;
            betslipActivity.i2().F = false;
            betslipActivity.i2().F = false;
            hzz hzzVarN2 = betslipActivity.n2();
            tjh0 tjh0Var = hzzVarN2.c;
            tjh0Var.getClass();
            kzh.d(ozh.c(new g1i(new wzh(new or60(new rjh0(tjh0Var, z, null)), new sjh0(tjh0Var, z, null)), new gzz(hzzVarN2, null)), hzzVarN2.a), o8i0.d(hzzVarN2));
        }
    }

    /* JADX INFO: loaded from: classes7.dex */
    public static final class r0 extends qlr implements Function0<cyb> {
        public r0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final cyb invoke() {
            return BetslipActivity.this.getDefaultViewModelCreationExtras();
        }
    }

    /* JADX INFO: loaded from: classes7.dex */
    public static final class r1 extends qlr implements Function0<cyb> {
        public r1() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final cyb invoke() {
            return BetslipActivity.this.getDefaultViewModelCreationExtras();
        }
    }

    /* JADX INFO: loaded from: classes7.dex */
    @c0d(c = "com.sportybet.plugin.realsports.betslip.widget.BetslipActivity$placeBet$1", f = "BetslipActivity.kt", l = {8430}, m = "invokeSuspend", v = 2)
    public static final class s extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;

        public s(v1b<? super s> v1bVar) {
            super(2, v1bVar);
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return BetslipActivity.this.new s(v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((s) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            int i = this.a;
            if (i == 0) {
                uj50.b(obj);
                BetslipActivity betslipActivity = BetslipActivity.this;
                hc40 hc40Var = betslipActivity.f;
                if (hc40Var == null) {
                    Intrinsics.n("rebetRemixCombineAnTestHelper");
                    throw null;
                }
                boolean zM0 = betslipActivity.N1().m0();
                this.a = 1;
                if (hc40Var.c(zM0, this) == y5bVar) {
                    return y5bVar;
                }
            } else {
                if (i != 1) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                uj50.b(obj);
            }
            return Unit.a;
        }
    }

    /* JADX INFO: loaded from: classes7.dex */
    public static final class s0 extends qlr implements Function0<r8i0.c> {
        public s0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final r8i0.c invoke() {
            return BetslipActivity.this.getDefaultViewModelProviderFactory();
        }
    }

    /* JADX INFO: loaded from: classes7.dex */
    public static final class s1 extends qlr implements Function0<r8i0.c> {
        public s1() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final r8i0.c invoke() {
            return BetslipActivity.this.getDefaultViewModelProviderFactory();
        }
    }

    /* JADX INFO: loaded from: classes7.dex */
    public static final class t extends CountDownTimer {
        public t() {
            super(30000L, 1000L);
        }

        @Override // android.os.CountDownTimer
        public final void onFinish() {
            if (BetslipActivity.this.V1) {
                f00 f00Var = vgb0.a;
                vgb0.a(AnalyticsEvent.SESSION_TIMEOUT);
                q73 q73VarQ1 = BetslipActivity.this.Q1();
                BetslipActivity betslipActivity = BetslipActivity.this;
                long j = betslipActivity.S1;
                boolean z = betslipActivity.T1;
                q73VarQ1.L1 = true;
                q73VarQ1.T1(new v03.s(-1, -1, j, System.currentTimeMillis(), z));
                BetslipActivity.this.k4(10, null);
                BetslipActivity.this.D1(true);
                ((br3) mmc.a(hp0.A, br3.class)).U().f(true);
            }
        }

        @Override // android.os.CountDownTimer
        public final void onTick(long j) {
            BetslipActivity.this.a2 = j / 1000;
        }
    }

    /* JADX INFO: loaded from: classes7.dex */
    public static final class t0 extends qlr implements Function0<v8i0> {
        public t0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final v8i0 invoke() {
            return BetslipActivity.this.getViewModelStore();
        }
    }

    /* JADX INFO: loaded from: classes7.dex */
    public static final class t1 extends qlr implements Function0<r8i0.c> {
        public t1() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final r8i0.c invoke() {
            return BetslipActivity.this.getDefaultViewModelProviderFactory();
        }
    }

    /* JADX INFO: loaded from: classes7.dex */
    public static final class u implements qoy {
        public u() {
        }

        @Override // defpackage.qoy
        public final void a() {
            BetslipActivity.this.requestTheUserLocation(true);
        }
    }

    /* JADX INFO: loaded from: classes7.dex */
    public static final class u0 extends qlr implements Function0<cyb> {
        public u0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final cyb invoke() {
            return BetslipActivity.this.getDefaultViewModelCreationExtras();
        }
    }

    /* JADX INFO: loaded from: classes7.dex */
    public static final class u1 extends qlr implements Function0<v8i0> {
        public u1() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final v8i0 invoke() {
            return BetslipActivity.this.getViewModelStore();
        }
    }

    /* JADX INFO: loaded from: classes7.dex */
    public static final class v implements f990 {
        public v() {
        }

        @Override // defpackage.f990
        public final boolean a() {
            return BetslipActivity.this.showRationalPermissions();
        }
    }

    /* JADX INFO: loaded from: classes7.dex */
    public static final class v0 extends qlr implements Function0<r8i0.c> {
        public v0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final r8i0.c invoke() {
            return BetslipActivity.this.getDefaultViewModelProviderFactory();
        }
    }

    /* JADX INFO: loaded from: classes7.dex */
    public static final class v1 extends qlr implements Function0<cyb> {
        public v1() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final cyb invoke() {
            return BetslipActivity.this.getDefaultViewModelCreationExtras();
        }
    }

    /* JADX INFO: loaded from: classes7.dex */
    public static final class w implements ooy {
        public w() {
        }

        @Override // defpackage.ooy
        public final void a() {
            BetslipActivity.this.showPermissionDeniedMessage();
        }
    }

    /* JADX INFO: loaded from: classes7.dex */
    public static final class w0 extends qlr implements Function0<v8i0> {
        public w0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final v8i0 invoke() {
            return BetslipActivity.this.getViewModelStore();
        }
    }

    /* JADX INFO: loaded from: classes7.dex */
    public static final class w1 extends qlr implements Function0<r8i0.c> {
        public w1() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final r8i0.c invoke() {
            return BetslipActivity.this.getDefaultViewModelProviderFactory();
        }
    }

    /* JADX INFO: loaded from: classes7.dex */
    public static final class x implements ioy {
        public x() {
        }

        @Override // defpackage.ioy
        public final void a(double d, double d2) {
            BetslipActivity.this.getAddressFromLocation(d, d2);
        }
    }

    /* JADX INFO: loaded from: classes7.dex */
    public static final class x0 extends qlr implements Function0<v8i0> {
        public x0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final v8i0 invoke() {
            return BetslipActivity.this.getViewModelStore();
        }
    }

    /* JADX INFO: loaded from: classes7.dex */
    public static final class x1 extends qlr implements Function0<v8i0> {
        public x1() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final v8i0 invoke() {
            return BetslipActivity.this.getViewModelStore();
        }
    }

    /* JADX INFO: loaded from: classes7.dex */
    public static final class y implements ymy {
        public final /* synthetic */ BigDecimal b;

        public y(BigDecimal bigDecimal) {
            this.b = bigDecimal;
        }

        @Override // defpackage.ymy
        public final void a(UserAddress userAddress) {
            Set<g08> set = BetslipActivity.X2;
            BetslipActivity.this.t3(userAddress, this.b);
        }
    }

    /* JADX INFO: loaded from: classes7.dex */
    public static final class y0 extends qlr implements Function0<cyb> {
        public y0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final cyb invoke() {
            return BetslipActivity.this.getDefaultViewModelCreationExtras();
        }
    }

    /* JADX INFO: loaded from: classes7.dex */
    public static final class y1 extends qlr implements Function0<cyb> {
        public y1() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final cyb invoke() {
            return BetslipActivity.this.getDefaultViewModelCreationExtras();
        }
    }

    /* JADX INFO: loaded from: classes7.dex */
    public static final class z implements ViewTreeObserver.OnGlobalLayoutListener {
        public z() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public final void onGlobalLayout() {
            Set<g08> set = BetslipActivity.X2;
            BetslipActivity betslipActivity = BetslipActivity.this;
            betslipActivity.v4();
            so3 so3Var = betslipActivity.p1;
            if (so3Var != null) {
                so3Var.a.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            }
        }
    }

    /* JADX INFO: loaded from: classes7.dex */
    public static final class z0 extends qlr implements Function0<r8i0.c> {
        public z0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final r8i0.c invoke() {
            return BetslipActivity.this.getDefaultViewModelProviderFactory();
        }
    }

    /* JADX INFO: loaded from: classes7.dex */
    public static final class z1 extends qlr implements Function0<r8i0.c> {
        public z1() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final r8i0.c invoke() {
            return BetslipActivity.this.getDefaultViewModelProviderFactory();
        }
    }

    /* JADX WARN: Type inference failed for: r0v42, types: [kg3] */
    /* JADX WARN: Type inference failed for: r0v43, types: [vg3] */
    public BetslipActivity() {
        bqy bqyVarA = bqy.a();
        bqyVarA.getClass();
        this.m1 = bqyVarA;
        this.n1 = hwr.b(new Function0() { // from class: zf3
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Set<g08> set = BetslipActivity.X2;
                BetslipActivity betslipActivity = this.a;
                lrm lrmVarR1 = betslipActivity.R1();
                krm krmVarO1 = betslipActivity.O1();
                q8k q8kVarA2 = betslipActivity.a2();
                p8k p8kVarZ1 = betslipActivity.Z1();
                y8k y8kVar = betslipActivity.z;
                if (y8kVar == null) {
                    Intrinsics.n("getMinStakeUseCase");
                    throw null;
                }
                ynh ynhVar = betslipActivity.y;
                if (ynhVar != null) {
                    return new hu2(lrmVarR1, krmVarO1, q8kVarA2, p8kVarZ1, y8kVar, ynhVar, betslipActivity.w2());
                }
                Intrinsics.n("findSingleStakeUseCase");
                throw null;
            }
        });
        this.o1 = new b63(b63.e);
        String strE = a8b.e();
        strE.getClass();
        this.u1 = strE;
        this.y1 = r53.a;
        this.L1 = new ArrayList();
        this.d2 = true;
        this.f2 = "0";
        this.v2 = true;
        this.w2 = "0";
        this.x2 = "0";
        this.y2 = "0";
        this.z2 = "0";
        this.B2 = "";
        this.E2 = "";
        kvh kvhVar = new kvh();
        kvhVar.c = new BigDecimal("0.0");
        kvhVar.d = new BigDecimal("0.0");
        kvhVar.e = new BigDecimal("0.0");
        kvhVar.f = new BigDecimal("0.0");
        this.G2 = kvhVar;
        cqy cqyVar = new cqy();
        cqyVar.e = 0;
        this.H2 = cqyVar;
        BigDecimal bigDecimal = BigDecimal.ZERO;
        bigDecimal.getClass();
        bigDecimal.getClass();
        nl0 nl0Var = new nl0();
        nl0Var.a = false;
        nl0Var.b = bigDecimal;
        nl0Var.c = bigDecimal;
        this.I2 = nl0Var;
        this.L2 = el0.c;
        this.M2 = EarlyPayoutConfigFeatures.INSTANCE.getDefaultInstance();
        this.P2 = true;
        this.R2 = new LinkedHashMap();
        this.S2 = new Runnable() { // from class: kg3
            @Override // java.lang.Runnable
            public final void run() {
                Set<g08> set = BetslipActivity.X2;
                this.a.C4(true, false);
            }
        };
        this.T2 = new tce0() { // from class: vg3
            /* JADX WARN: Code duplicated, block: B:78:0x01cc  */
            /* JADX WARN: Multi-variable type inference failed */
            @Override // defpackage.tce0
            public final void a0(hqc hqcVar) {
                so3 so3Var;
                Object bVar;
                boolean z2;
                BetslipActivity betslipActivity = this.a;
                Set<g08> set = BetslipActivity.X2;
                int i3 = 2;
                if (hqcVar instanceof lqc) {
                    so3 so3Var2 = betslipActivity.p1;
                    if (so3Var2 != null) {
                        so3Var2.a.setLoading(betslipActivity.Q1().c1.hasRate(betslipActivity.N1().m0()), betslipActivity.N1().D());
                    }
                    azs azsVar = ((lqc) hqcVar).a;
                    int i4 = azsVar == null ? -1 : BetslipActivity.d.a[azsVar.ordinal()];
                    if (i4 == 1 || i4 == 2) {
                        return;
                    }
                    uhc.a();
                    return;
                }
                if (!(hqcVar instanceof nqc)) {
                    if (!(hqcVar instanceof kqc) || (so3Var = betslipActivity.p1) == null) {
                        return;
                    }
                    BetSlipFooter betSlipFooter = so3Var.a;
                    betSlipFooter.t(false, true);
                    betSlipFooter.setBonus(BigDecimal.ZERO);
                    return;
                }
                T t2 = ((nqc) hqcVar).a;
                if (!(t2 instanceof GetBonusResult)) {
                    if ((t2 instanceof Long) && betslipActivity.r2 == ((Number) t2).longValue()) {
                        itf0.a aVar = itf0.a;
                        aVar.q(MyLog.TAG_COMMON);
                        aVar.g("[Bonus] init system bonus", new Object[0]);
                        return;
                    }
                    return;
                }
                itf0.a aVar2 = itf0.a;
                aVar2.q(MyLog.TAG_COMMON);
                GetBonusResult getBonusResult = (GetBonusResult) t2;
                aVar2.g("[Bonus] bonus = %s", getBonusResult.getBonus().toString());
                if (getBonusResult.getBetType() == betslipActivity.Q1().G1() && betslipActivity.r2 == getBonusResult.getTimestamp()) {
                    boolean z3 = getBonusResult.isExistBonus() && getBonusResult.getBonus().compareTo(BigDecimal.ZERO) > 0;
                    boolean zIsBonusActivated = getBonusResult.isBonusActivated();
                    boolean z4 = betslipActivity.W2(Integer.valueOf(betslipActivity.Q1().G1())) && iw2.a() > 1;
                    so3 so3Var3 = betslipActivity.p1;
                    if (so3Var3 != null) {
                        boolean zM0 = betslipActivity.N1().m0();
                        boolean zU0 = betslipActivity.N1().u0();
                        boolean multiBetBonusEnable = SimShareData.INSTANCE.getMultiBetBonusEnable();
                        boolean zJ1 = betslipActivity.Q1().J1();
                        boolean z5 = betslipActivity.q2().y.getValue() instanceof vwv.c;
                        BigDecimal bonus = getBonusResult.getBonus();
                        so3Var3.a.y(zM0, zU0, multiBetBonusEnable, z3, z4, zIsBonusActivated, zJ1, z5);
                        so3Var3.a.setBonus(bonus);
                    }
                    int iG1 = betslipActivity.Q1().G1();
                    if (iG1 != 2 || iw2.a() <= 1) {
                        if (iG1 != 3) {
                            if (iG1 == 1) {
                                betslipActivity.Y3(false, betslipActivity.R1().e0());
                                return;
                            }
                            return;
                        } else {
                            so3 so3Var4 = betslipActivity.p1;
                            if (so3Var4 != null) {
                                so3Var4.g(betslipActivity.M1().l(betslipActivity.Q1().c1.getRealSportTaxConfig(), getBonusResult.getBonus()), Long.valueOf(betslipActivity.h2));
                                return;
                            }
                            return;
                        }
                    }
                    so3 so3Var5 = betslipActivity.p1;
                    if (so3Var5 != null) {
                        so3Var5.g(betslipActivity.G1(getBonusResult.getMinBonus(), getBonusResult.getBonus()), Long.valueOf(betslipActivity.h2));
                    }
                    so3 so3Var6 = betslipActivity.p1;
                    if (so3Var6 != null) {
                        so3Var6.a.setOneCutEnable(vuo.f(betslipActivity.T1(), betslipActivity.m1, betslipActivity.O1()));
                    }
                    try {
                        zi50.a aVar3 = zi50.b;
                        bVar = ((GetBonusResult) t2).getBonus().divide(new BigDecimal(betslipActivity.R1().d0().a), 8, RoundingMode.HALF_UP).toString();
                    } catch (Throwable th) {
                        zi50.a aVar4 = zi50.b;
                        bVar = new zi50.b(th);
                    }
                    Throwable thA = zi50.a(bVar);
                    if (thA != null) {
                        itf0.a aVar5 = itf0.a;
                        aVar5.q(MyLog.TAG_COMMON);
                        aVar5.p(thA, "[Bonus] Failed to calculate bonus rate", new Object[0]);
                        bVar = "0";
                    }
                    betslipActivity.x2 = (String) bVar;
                    if (betslipActivity.b3()) {
                        i3 = 5;
                    } else if (betslipActivity.Y2()) {
                        i3 = 4;
                    } else if (betslipActivity.T2()) {
                        i3 = 6;
                    }
                    if (betslipActivity.b3() || betslipActivity.Y2() || betslipActivity.T2()) {
                        GetInsureBetOddsData getInsureBetOddsData = new GetInsureBetOddsData(0, false, 0, null, null, null, null, 127, null);
                        getInsureBetOddsData.flexibleCount = betslipActivity.G2.b;
                        getInsureBetOddsData.isSimMode = betslipActivity.N1().m0();
                        getInsureBetOddsData.selections = betslipActivity.N1().U();
                        getInsureBetOddsData.betType = i3;
                        getInsureBetOddsData.flexiBetConfig = betslipActivity.J2;
                        getInsureBetOddsData.anyWinBetConfig = betslipActivity.K2;
                        betslipActivity.J1(getInsureBetOddsData);
                    } else {
                        so3 so3Var7 = betslipActivity.p1;
                        if (so3Var7 != null) {
                            z2 = so3Var7.a.d(betslipActivity.Q1().G1(), betslipActivity.M1().e());
                        }
                        betslipActivity.I1(z2);
                    }
                    so3 so3Var8 = betslipActivity.p1;
                    if (so3Var8 != null) {
                        so3Var8.d(vuo.d(betslipActivity.J2, betslipActivity.O1()), vuo.f(betslipActivity.T1(), betslipActivity.m1, betslipActivity.O1()), vuo.a(betslipActivity.K2, betslipActivity.L2, betslipActivity.R1()), vuo.c(betslipActivity.M2, betslipActivity.N1()), betslipActivity.x2().d(), betslipActivity.Q1().J1());
                    }
                }
            }
        };
        this.U2 = new h();
        this.V2 = new f();
        this.W2 = new e();
    }

    public static String B3(String str) {
        if (str == null) {
            return null;
        }
        int length = str.length() - 1;
        int i3 = 0;
        boolean z2 = false;
        while (i3 <= length) {
            boolean z3 = str.charAt(!z2 ? i3 : length) <= ' ';
            if (z2) {
                if (!z3) {
                    break;
                }
                length--;
            } else if (z3) {
                i3++;
            } else {
                z2 = true;
            }
        }
        return fu5.a(",", str.subSequence(i3, length + 1).toString(), "");
    }

    public static String H3(String str, SelectedGiftData selectedGiftData) {
        if (selectedGiftData == null || str == null || str.length() == 0 || !selectedGiftData.getChecked() || !selectedGiftData.getAddToStake() || !Intrinsics.g(selectedGiftData.getTotalStake(), str)) {
            return str;
        }
        BigDecimal bigDecimal = new BigDecimal(str);
        BigDecimal bigDecimal2 = new BigDecimal(selectedGiftData.getGiftValue());
        if (bigDecimal.subtract(bigDecimal2).compareTo(BigDecimal.ZERO) <= 0) {
            return str;
        }
        String string = bigDecimal.subtract(bigDecimal2).toString();
        string.getClass();
        return string;
    }

    public static final void I2(BetslipActivity betslipActivity) {
        if (betslipActivity.N1().Q1().isEmpty()) {
            return;
        }
        betslipActivity.Q1().P0.a(a53.b.a);
        betslipActivity.S3(!betslipActivity.J2());
    }

    public static /* synthetic */ void z4(BetslipActivity betslipActivity, List list, List list2, long j3, long j4, int i3) {
        if ((i3 & 2) != 0) {
            list2 = new ArrayList();
        }
        List list3 = list2;
        if ((i3 & 4) != 0) {
            j3 = -1;
        }
        betslipActivity.y4(list, list3, j3, null, false, (i3 & 64) == 0);
    }

    @Override // defpackage.to3
    public final void A() throws Throwable {
        if (!U2()) {
            R2();
        }
        C4(true, false);
        B1();
        J3();
    }

    public final void A1(Selection selection, Runnable runnable) {
        if (!N1().V()) {
            runnable.run();
            return;
        }
        ArrayList arrayList = new ArrayList(N1().U());
        int size = arrayList.size();
        int i3 = 0;
        while (i3 < size) {
            Object obj = arrayList.get(i3);
            i3++;
            Selection selection2 = (Selection) obj;
            if (selection2.p() && selection2.d.contains(selection)) {
                ((fj2) this.S0.getValue()).y1(g880.y(selection2, kotlin.collections.a.c(selection)), true);
            } else if (selection2.equals(selection)) {
                runnable.run();
            }
        }
    }

    public final void A2(boolean z2) {
        f5k f5kVar = this.n0;
        if (f5kVar == null) {
            Intrinsics.n("getCurrentEarlyGoalSelectionsForRequestOutcomeUseCase");
            throw null;
        }
        ArrayList arrayListA = f5kVar.a(z2);
        if (arrayListA.isEmpty()) {
            return;
        }
        S1().D.setInsureEarlyGoalsLoading(true);
        Q1().C1(g880.l(arrayListA, z2), aak.b, arrayListA);
    }

    public final void A3(boolean z2) throws Throwable {
        if (N1().U().isEmpty()) {
            return;
        }
        so3 so3Var = this.p1;
        if (so3Var != null) {
            BetSlipFooter betSlipFooter = so3Var.a;
            SimShareData simShareData = SimShareData.INSTANCE;
            simShareData.resetAutoBetTimes();
            mgd0 mgd0Var = betSlipFooter.G;
            mgd0Var.H0.E(simShareData.getAutoBetTimes());
            mgd0Var.l0.E(simShareData.getAutoBetTimes());
        }
        if (N1().m0()) {
            int size = N1().U().size();
            for (int i3 = 0; i3 < size; i3++) {
                H1((Selection) N1().U().get(0));
            }
            if (N1().U().isEmpty()) {
                F3();
                s3();
            }
            B1();
            x3();
            S3((N1().u0() || J2()) ? false : true);
        } else {
            D1(true);
            t4(2);
            if (!z2) {
                o8s o8sVarG2 = g2();
                o8sVarG2.b.k0(null);
                o8sVarG2.c.add(h8s.c);
                if (N1().W()) {
                    gym.a(l2(), new jm3(0));
                }
            }
        }
        r4(false, false);
        w4(true, true);
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0049  */
    /* JADX WARN: Code duplicated, block: B:25:0x004f  */
    /* JADX WARN: Code duplicated, block: B:29:0x0063  */
    /* JADX WARN: Code duplicated, block: B:37:0x005d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:38:? A[LOOP:0: B:24:0x004d->B:38:?, LOOP_END, SYNTHETIC] */
    public final void A4() {
        dkf dkfVar;
        ArrayList arrayListU;
        int size;
        Object obj;
        ebe ebeVar = this.l0;
        if (ebeVar == null) {
            Intrinsics.n("determineEarlyGoalSelectionInsureStateUseCase");
            throw null;
        }
        jrm jrmVar = ebeVar.a;
        if (ebeVar.b.d(ckf.c)) {
            ArrayList arrayListU2 = jrmVar.U();
            int i3 = 0;
            if (arrayListU2 == null || !arrayListU2.isEmpty()) {
                int size2 = arrayListU2.size();
                int i4 = 0;
                while (i4 < size2) {
                    Object obj2 = arrayListU2.get(i4);
                    i4++;
                    if (yay.i((Selection) obj2)) {
                        if (!jrmVar.m0()) {
                            dkfVar = dkf.a.a;
                        }
                    }
                }
                arrayListU = jrmVar.U();
                if (arrayListU == null && arrayListU.isEmpty()) {
                    dkfVar = dkf.b.a;
                } else {
                    size = arrayListU.size();
                    while (i3 < size) {
                        obj = arrayListU.get(i3);
                        i3++;
                        if (yay.j((Selection) obj)) {
                            if (!jrmVar.m0()) {
                                dkfVar = dkf.d.a;
                            }
                        }
                    }
                    dkfVar = dkf.b.a;
                }
            } else {
                arrayListU = jrmVar.U();
                if (arrayListU == null) {
                    size = arrayListU.size();
                    while (i3 < size) {
                        obj = arrayListU.get(i3);
                        i3++;
                        if (yay.j((Selection) obj)) {
                            if (!jrmVar.m0()) {
                                dkfVar = dkf.d.a;
                            }
                        }
                    }
                    dkfVar = dkf.b.a;
                } else {
                    size = arrayListU.size();
                    while (i3 < size) {
                        obj = arrayListU.get(i3);
                        i3++;
                        if (yay.j((Selection) obj)) {
                            if (!jrmVar.m0()) {
                                dkfVar = dkf.d.a;
                            }
                        }
                    }
                    dkfVar = dkf.b.a;
                }
            }
        } else {
            dkfVar = dkf.c.a;
        }
        S1().D.setInsureEarlyPayoutViewState(dkfVar);
    }

    @Override // defpackage.to3
    public final void B(avy avyVar) {
        bsy bsyVarK2 = k2();
        Map mapA = com.appsflyer.internal.u.a("value", bsy.A1(vuy.b(avyVar)));
        bsyVarK2.d.a(AnalyticsEvent.UP_CLICK_INSURE_MENU, mapA);
        itf0.a aVar = itf0.a;
        aVar.q(bsyVarK2.e);
        aVar.a("reportOneTwoUpInsureMenuClicked: " + mapA, new Object[0]);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void B1() throws Throwable {
        boolean z2 = false;
        if (S2()) {
            ArrayList arrayListU = N1().U();
            int size = arrayListU.size();
            int i3 = 0;
            while (i3 < size) {
                Object obj = arrayListU.get(i3);
                i3++;
                N1().I0((Selection) obj, false);
            }
            Q1().P0.a(a53.b.a);
            return;
        }
        this.N1 = false;
        this.O1 = 0;
        ArrayList arrayListU2 = N1().U();
        int size2 = arrayListU2.size();
        int i4 = 0;
        while (i4 < size2) {
            int i5 = i4 + 1;
            Selection selection = (Selection) arrayListU2.get(i4);
            N1().c0(selection, z2);
            s1p s1pVar = this.D0;
            Throwable th = null;
            if (s1pVar == null) {
                Intrinsics.n("isLfbBoostEligibleUseCase");
                throw null;
            }
            Event event = selection.a;
            Outcome outcome = selection.c;
            Market market = selection.b;
            boolean zA = s1pVar.a(event.eventId, market.status, outcome);
            N1().I0(selection, zA);
            N1().L0(selection, zA);
            ArrayList arrayList = this.L1;
            int size3 = arrayList.size();
            int i6 = z2;
            while (i6 < size3) {
                i6++;
                Map map = (Map) arrayList.get(i6);
                try {
                    if (qz3.l((String) map.get("tournamentId"), event.sport.category.tournament.id) && qz3.l((String) map.get("marketId"), market.id) && qz3.l((String) map.get("productId"), String.valueOf(market.product))) {
                        this.N1 = true;
                        sfy sfyVar = this.C0;
                        if (sfyVar == null) {
                            Intrinsics.n("oddsBoostConfigurationManager");
                            throw th;
                        }
                        if (sfyVar == null) {
                            Intrinsics.n("oddsBoostConfigurationManager");
                            throw th;
                        }
                        outcome.getClass();
                        boolean zB = sfyVar.b(sfyVar.c(outcome));
                        if (zB) {
                            N1().c0(selection, true);
                        }
                        if (qz3.b(selection) && zB) {
                            this.O1++;
                        }
                    }
                } catch (Exception e3) {
                    if (event != null) {
                        String str = event.eventId;
                        str.getClass();
                        if (str.length() > 0) {
                            ArrayList arrayList2 = new ArrayList();
                            arrayList2.add(new android.util.Pair("EventId", event.eventId));
                            w950.a("BetslipActivity", "checkOddsBoost", e3, arrayList2);
                            th = th;
                            z2 = false;
                        }
                    }
                }
            }
            i4 = i5;
        }
        Q1().P0.a(a53.b.a);
    }

    public final boolean B2() {
        SelectedGiftData selectedGiftData;
        if (!N1().m0() || SimShareData.INSTANCE.getAutoBetTimes() <= 1) {
            return false;
        }
        if (y2().i || ((selectedGiftData = y2().C) != null && selectedGiftData.getChecked())) {
            String string = Q1().H1(Q1().G1()).toString();
            string.getClass();
            z(string, false);
        } else {
            L3(false);
        }
        so3 so3Var = this.p1;
        if (so3Var != null) {
            so3Var.c(false);
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void B4(boolean z2) {
        so3 so3Var;
        S1().E.setBetSlipNumberText(String.valueOf(iw2.a()));
        S1().E.setAccountInfo(getAccountHelper().getAccount());
        if (getCountryManager().r() && (so3Var = this.p1) != null) {
            mgd0 mgd0Var = so3Var.a.G;
            mgd0Var.j0.v.setText(a8b.e());
            EditTextWithKeyBoard editTextWithKeyBoard = mgd0Var.M0;
            editTextWithKeyBoard.v.setText(a8b.e());
            mgd0Var.j0.setMinStakeHint();
            editTextWithKeyBoard.setMinStakeHint();
        }
        if (N1().U().size() < 2) {
            Z3();
            return;
        }
        S1().E.setDisplayTypeMenuVisibility(iw2.g(), (q43) Q1().C1.d());
        S1().E.setRemoveContainerVisibility((q43) Q1().C1.d());
        S1().E.E();
        if (R1().getTypeName() == 0) {
            if (qz3.g()) {
                Z3();
            } else {
                Q3();
            }
        } else if (R1().getTypeName() == 1) {
            Z3();
        } else if (R1().getTypeName() == 2) {
            if (qz3.g()) {
                Z3();
            } else {
                Q3();
            }
        } else if (N1().U().size() > 15) {
            Q3();
        } else if (qz3.g()) {
            Z3();
        } else {
            c4();
        }
        if (z2) {
            Q1().P0.a(a53.b.a);
        }
    }

    @Override // iu2.a
    public final void C() {
        q73 q73VarQ1 = Q1();
        q73VarQ1.N.V0(q73VarQ1.j1, false);
        z3();
        Q1().X1();
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0067  */
    public final void C1() {
        BigDecimal bigDecimalH1;
        boolean z2;
        try {
            bigDecimalH1 = Q1().H1(Q1().G1());
        } catch (Exception unused) {
            bigDecimalH1 = BigDecimal.ZERO;
            bigDecimalH1.getClass();
        }
        if (bigDecimalH1.compareTo(BigDecimal.ZERO) == 0 || N1().u0()) {
            z2 = false;
        } else {
            y8k y8kVar = this.z;
            if (y8kVar == null) {
                Intrinsics.n("getMinStakeUseCase");
                throw null;
            }
            if (bigDecimalH1.compareTo(y8kVar.a()) < 0 || bigDecimalH1.compareTo(Z1().a()) > 0 || N1().M1() || !N1().Q() || J2()) {
                z2 = false;
            } else {
                z2 = true;
            }
        }
        S3(z2);
    }

    public final void C2(JSONArray jSONArray, Set<Selection> set) throws JSONException {
        long j3;
        boolean z2;
        boolean z3;
        JSONArray jSONArrayOptJSONArray = jSONArray.optJSONArray(8);
        try {
            j3 = jSONArray.getLong(7);
        } catch (JSONException unused) {
            j3 = -1;
        }
        for (final Selection selection : set) {
            Market market = selection.b;
            Event event = selection.a;
            Outcome outcome = selection.c;
            boolean z4 = true;
            if (market.product != 1 || jSONArray.getInt(1) != 3) {
                if (this.y0 == null) {
                    Intrinsics.n("betOddsUseCases");
                    throw null;
                }
                market.getClass();
                if (!ww2.b(market, j3)) {
                    if (selection.q()) {
                        market.update(jSONArray);
                        market.product = jSONArray.getInt(1);
                        event.changeFlag = true;
                        if (jSONArrayOptJSONArray != null) {
                            Iterable iterableN = kotlin.ranges.f.n(0, jSONArrayOptJSONArray.length());
                            if (!(iterableN instanceof Collection) || !((Collection) iterableN).isEmpty()) {
                                Iterator<Integer> it = iterableN.iterator();
                                while (((mwo) it).c) {
                                    if (new SocketOutcomeMessage(null, null, 0.0d, 0, null, 0, 0, 0, 255, null).create(jSONArrayOptJSONArray.getString(((zvo) it).nextInt())).isActive() != 1) {
                                        z4 = false;
                                        break;
                                    }
                                }
                            }
                        }
                        N1().f(event, market, z4);
                    } else {
                        if (market.product == 3 && jSONArray.getInt(1) == 1 && this.P2) {
                            this.O2 = true;
                            this.P2 = false;
                        }
                        int length = jSONArrayOptJSONArray.length();
                        boolean z5 = false;
                        int i3 = 0;
                        while (i3 < length) {
                            String string = jSONArrayOptJSONArray.getString(i3);
                            string.getClass();
                            String[] strArr = (String[]) new Regex("#").h(string).toArray(new String[0]);
                            if (Intrinsics.g(outcome.id, strArr[0])) {
                                boolean z6 = z5;
                                outcome.oddsChangesFlag = new BigDecimal(strArr[2]).compareTo(new BigDecimal(outcome.odds));
                                boolean z7 = outcome.isActive != Integer.parseInt(strArr[3]);
                                boolean z8 = outcome.oddsChangesFlag != 0;
                                N1().q0(z8);
                                if (z7 || z8) {
                                    z3 = true;
                                    this.B1 = true;
                                    q73 q73VarQ1 = Q1();
                                    q73VarQ1.N1 = q73VarQ1.M1;
                                    z6 = true;
                                } else {
                                    z3 = true;
                                }
                                if (z6) {
                                    event.changeFlag = z3;
                                    outcome.odds = strArr[2];
                                    market.status = jSONArray.getInt(2);
                                    try {
                                        market.lastOddsChangeTime = jSONArray.getLong(7);
                                    } catch (Exception e3) {
                                        itf0.a.e(e3);
                                    }
                                    outcome.isActive = Integer.parseInt(strArr[3]);
                                    if (strArr.length > 6 && Double.parseDouble(strArr[6]) > 1.0E-4d) {
                                        outcome.probability = Double.parseDouble(strArr[6]);
                                    }
                                    A1(selection, new Runnable() { // from class: bf3
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            Set<g08> set2 = BetslipActivity.X2;
                                            jrm jrmVarN1 = this.a.N1();
                                            Selection selection2 = selection;
                                            jrmVarN1.N0(selection2.a, selection2.b, selection2.c, true, (14336 & 16) != 0 ? false : false, (14336 & 32) != 0 ? null : selection2.d, (14336 & 64) != 0 ? k980.DEFAULT : selection2.e, (14336 & 128) != 0 ? false : selection2.i, (14336 & 256) != 0 ? false : true, (14336 & 512) != 0 ? false : false, (14336 & 1024) != 0 ? null : null, (14336 & 2048) != 0 ? false : false, (14336 & 4096) != 0 ? false : false, false);
                                        }
                                    });
                                    z2 = false;
                                } else {
                                    if (strArr.length <= 6 || Double.parseDouble(strArr[6]) <= 1.0E-4d || outcome.probability == Double.parseDouble(strArr[6])) {
                                        z2 = false;
                                    } else {
                                        outcome.probability = Double.parseDouble(strArr[6]);
                                        A1(selection, new Runnable() { // from class: cf3
                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                Set<g08> set2 = BetslipActivity.X2;
                                                jrm jrmVarN1 = this.a.N1();
                                                Selection selection2 = selection;
                                                jrmVarN1.N0(selection2.a, selection2.b, selection2.c, true, (14336 & 16) != 0 ? false : false, (14336 & 32) != 0 ? null : selection2.d, (14336 & 64) != 0 ? k980.DEFAULT : selection2.e, (14336 & 128) != 0 ? false : selection2.i, (14336 & 256) != 0 ? false : true, (14336 & 512) != 0 ? false : false, (14336 & 1024) != 0 ? null : null, (14336 & 2048) != 0 ? false : false, (14336 & 4096) != 0 ? false : false, false);
                                            }
                                        });
                                        itf0.a aVar = itf0.a;
                                        aVar.q(MyLog.TAG_COMMON);
                                        z2 = false;
                                        aVar.g(" update probability", new Object[0]);
                                    }
                                    event.changeFlag = z2;
                                }
                                z5 = z6;
                            } else {
                                length = length;
                                z2 = false;
                            }
                            if (N1().m0()) {
                                N1().k1(selection);
                            }
                            i3++;
                            length = length;
                        }
                    }
                }
            }
        }
    }

    public final void C3(String str, Map<String, String> map) {
        f00 f00Var = vgb0.a;
        vgb0.c(str, map, false);
        l2().c(str, map, null);
    }

    public final void C4(boolean z2, boolean z3) {
        BigDecimal bigDecimal;
        boolean z4;
        long j3;
        luo luoVarD = vuo.d(this.J2, O1());
        luo luoVarF = vuo.f(T1(), this.m1, O1());
        luo luoVarA = vuo.a(this.K2, this.L2, R1());
        luo luoVarC = vuo.c(this.M2, N1());
        boolean zL = O1().L(N1().m0());
        luo luoVar = luo.c;
        if (luoVarD != luoVar) {
            R1().G(false);
        }
        if (luoVarF != luoVar) {
            R1().K(false);
        }
        if (luoVarA != luoVar) {
            R1().E(false);
            R2();
        }
        this.G2.b = O1().w();
        BigDecimal bigDecimal2 = BigDecimal.ZERO;
        int size = O1().s().size();
        String str = R1().d0().a;
        str.getClass();
        String strL = "";
        if (str.length() == 0) {
            this.g2 = 0.0d;
            so3 so3Var = this.p1;
            if (so3Var != null) {
                so3Var.a.setShowExciseTax(o2().hasExciseTaxRate(), W1(""));
            }
            bigDecimal = bigDecimal2;
        } else {
            bigDecimal = new BigDecimal(str);
        }
        this.G2.a = false;
        this.H2.a = false;
        this.I2.a = false;
        if (zL) {
            long jQ = O1().Q(size);
            R1().Y(jQ);
            strL = bjb0.L(bigDecimal.multiply(BigDecimal.valueOf(jQ)), Locale.US);
            z4 = true;
            j3 = jQ;
        } else {
            if (luoVarD == luoVar && R1().o()) {
                this.h2 = 1L;
                if (this.G2.b < size) {
                    if (z2) {
                        GetInsureBetOddsData getInsureBetOddsData = new GetInsureBetOddsData(0, false, 0, null, null, null, null, 127, null);
                        getInsureBetOddsData.flexibleCount = this.G2.b;
                        getInsureBetOddsData.isSimMode = N1().m0();
                        getInsureBetOddsData.betType = 4;
                        getInsureBetOddsData.selections = N1().U();
                        getInsureBetOddsData.flexiBetConfig = this.J2;
                        getInsureBetOddsData.anyWinBetConfig = this.K2;
                        J1(getInsureBetOddsData);
                    }
                    kvh kvhVar = this.G2;
                    so3 so3Var2 = this.p1;
                    kvhVar.a = so3Var2 != null ? so3Var2.a.m() : false;
                    so3 so3Var3 = this.p1;
                    if (so3Var3 != null) {
                        boolean zHasExciseTaxRate = o2().hasExciseTaxRate();
                        String str2 = R1().d0().a;
                        str2.getClass();
                        so3Var3.a.setShowExciseTax(zHasExciseTaxRate, W1(str2));
                    }
                    z4 = false;
                } else {
                    z4 = true;
                }
            } else if (luoVarA == luoVar && U2() && x() == 2) {
                this.h2 = 1L;
                this.I2.a = U2();
                if (z2) {
                    nl0 nl0Var = this.I2;
                    bigDecimal2.getClass();
                    nl0Var.getClass();
                    bigDecimal2.getClass();
                    nl0Var.c = bigDecimal2;
                    nl0 nl0Var2 = this.I2;
                    nl0Var2.getClass();
                    nl0Var2.b = bigDecimal2;
                    GetInsureBetOddsData getInsureBetOddsData2 = new GetInsureBetOddsData(0, false, 0, null, null, null, null, 127, null);
                    getInsureBetOddsData2.flexibleCount = this.G2.b;
                    getInsureBetOddsData2.isSimMode = N1().m0();
                    getInsureBetOddsData2.betType = 6;
                    getInsureBetOddsData2.selections = N1().U();
                    getInsureBetOddsData2.flexiBetConfig = this.J2;
                    getInsureBetOddsData2.anyWinBetConfig = this.K2;
                    J1(getInsureBetOddsData2);
                }
                so3 so3Var4 = this.p1;
                if (so3Var4 != null) {
                    BetSlipFooter betSlipFooter = so3Var4.a;
                    betSlipFooter.t(false, true);
                    betSlipFooter.setBonus(bigDecimal2);
                }
                so3 so3Var5 = this.p1;
                if (so3Var5 != null) {
                    boolean zHasExciseTaxRate2 = o2().hasExciseTaxRate();
                    String str3 = R1().d0().a;
                    str3.getClass();
                    so3Var5.a.setShowExciseTax(zHasExciseTaxRate2, W1(str3));
                }
                z4 = false;
            } else {
                if (luoVarF == luoVar && R1().M()) {
                    cqy cqyVar = this.H2;
                    so3 so3Var6 = this.p1;
                    cqyVar.a = so3Var6 != null ? so3Var6.a.n() : false;
                }
                z4 = true;
            }
            j3 = 1;
        }
        R1().e(Y1());
        if (this.C2) {
            this.C2 = false;
            if (N1().m0()) {
                s3();
            } else {
                e2().F1(false);
            }
        }
        itf0.a aVar = itf0.a;
        aVar.q(MyLog.TAG_COMMON);
        aVar.g(whs.b(this.G2.b, size, "[Flexi Bet] flexibet =", ", count ="), new Object[0]);
        so3 so3Var7 = this.p1;
        if (so3Var7 != null) {
            so3Var7.a.G(luoVarD, zL, this.G2.b, j3, strL, size);
        }
        long j4 = j3;
        if (z4) {
            D4(R1().d0(), size, j4, z3);
        }
        so3 so3Var8 = this.p1;
        if (so3Var8 != null) {
            so3Var8.a.setOneCutEnable(luoVarF);
        }
        so3 so3Var9 = this.p1;
        if (so3Var9 != null) {
            so3Var9.a.setEarlyPayoutEnable(luoVarC);
        }
        Q1().U1();
    }

    public final void D1(boolean z2) {
        if (z2) {
            sty styVar = this.B0;
            if (styVar == null) {
                Intrinsics.n("oneUpSelectionAttributionDispatcher");
                throw null;
            }
            styVar.b(sty.b.a.a);
        }
        N1().G(true);
        O1().clear();
        R1().clear();
        v2().b(null);
        i2().b(null);
        V1().b(null);
        this.j2 = null;
        this.i2 = null;
        P1().f(true);
        hvo hvoVar = this.V;
        if (hvoVar == null) {
            Intrinsics.n("insureMoreUiStateManager");
            throw null;
        }
        hvoVar.a.setValue(f5w.b.a);
        this.o2 = false;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x006d  */
    public final void D2(JSONArray jSONArray, Set<Selection> set) {
        boolean z2;
        for (final Selection selection : set) {
            Market market = selection.b;
            Event event = selection.a;
            if (market.product != 1 || jSONArray.getInt(1) != 3) {
                if (selection.q()) {
                    market.update(jSONArray);
                    market.product = jSONArray.getInt(1);
                    event.changeFlag = true;
                    jrm jrmVarN1 = N1();
                    event.getClass();
                    Market market2 = selection.b;
                    market2.getClass();
                    jrmVarN1.f(event, market2, true);
                    event.changeFlag = true;
                } else {
                    int i3 = market.status;
                    if (i3 == 0) {
                        if (i3 != jSONArray.getInt(2)) {
                            this.B1 = true;
                            q73 q73VarQ1 = Q1();
                            q73VarQ1.N1 = q73VarQ1.M1;
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                    } else if (jSONArray.getInt(2) == 0 || (jSONArray.getInt(2) == 3 && market.status != 3)) {
                        this.B1 = true;
                        q73 q73VarQ2 = Q1();
                        q73VarQ2.N1 = q73VarQ2.M1;
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (market.product == 3 && jSONArray.getInt(1) == 1) {
                        if (this.P2) {
                            this.O2 = true;
                            this.P2 = false;
                        }
                        market.product = 1;
                        this.B1 = true;
                        q73 q73VarQ3 = Q1();
                        q73VarQ3.N1 = q73VarQ3.M1;
                        z2 = true;
                    }
                    if (z2) {
                        event.changeFlag = true;
                        this.F1 = X2();
                        market.status = jSONArray.getInt(2);
                        A1(selection, new Runnable() { // from class: ze3
                            @Override // java.lang.Runnable
                            public final void run() {
                                Set<g08> set2 = BetslipActivity.X2;
                                jrm jrmVarN2 = this.a.N1();
                                Selection selection2 = selection;
                                jrmVarN2.N0(selection2.a, selection2.b, selection2.c, true, (14336 & 16) != 0 ? false : false, (14336 & 32) != 0 ? null : selection2.d, (14336 & 64) != 0 ? k980.DEFAULT : selection2.e, (14336 & 128) != 0 ? false : selection2.i, (14336 & 256) != 0 ? false : true, (14336 & 512) != 0 ? false : false, (14336 & 1024) != 0 ? null : null, (14336 & 2048) != 0 ? false : false, (14336 & 4096) != 0 ? false : false, false);
                            }
                        });
                    } else {
                        event.changeFlag = false;
                    }
                    if (N1().m0()) {
                        N1().k1(selection);
                    }
                }
            }
        }
    }

    public final void D3() {
        if (N1().U().isEmpty() || this.m2) {
            return;
        }
        so3 so3Var = this.p1;
        if (so3Var != null) {
            so3Var.a.getViewTreeObserver().addOnGlobalLayoutListener(new z());
        }
        S1().S.getViewTreeObserver().addOnGlobalLayoutListener(new a0());
    }

    public final void D4(imn imnVar, int i3, long j3, boolean z2) {
        if (Q1().G1() != 2) {
            return;
        }
        boolean zI = O1().I();
        boolean zA = P1().a();
        boolean zW2 = W2(Integer.valueOf(Q1().G1()));
        FooterInfo footerInfo = new FooterInfo();
        footerInfo.setBetType(Q1().G1());
        footerInfo.setTaxConfig(Q1().c1);
        footerInfo.setExistBonus(zI);
        footerInfo.setBonusEnable(zW2);
        footerInfo.setBonusActivated(zA);
        footerInfo.setFlexiBetCount(this.G2.b);
        BigDecimal bigDecimal = new BigDecimal("0.00");
        if (imnVar != null) {
            String str = imnVar.a;
            str.getClass();
            if (str.length() != 0 && i3 != 0) {
                if ((!zI || imnVar.a == null) && vuo.f(T1(), this.m1, O1()) != luo.c) {
                    footerInfo.setBonus(bigDecimal);
                    BigDecimal bigDecimal2 = BigDecimal.ZERO;
                    bigDecimal2.getClass();
                    BetSlipInfo betSlipInfoG1 = G1(bigDecimal2, bigDecimal);
                    footerInfo.setPotentialWin(betSlipInfoG1.getNetWin());
                    footerInfo.setWHTax(betSlipInfoG1.getWhTax());
                    footerInfo.setMultipleTotalOdds(betSlipInfoG1.getTotalOdds());
                    footerInfo.setMultipleTotalOddsForGift(betSlipInfoG1.getTotalOddsForGiftDialog());
                    footerInfo.setMultipleMinScaled(betSlipInfoG1.getMinScaled());
                    U1().c(new mqc());
                } else {
                    this.r2 = System.currentTimeMillis();
                    BigDecimal bigDecimal3 = BigDecimal.ZERO;
                    bigDecimal3.getClass();
                    BetSlipInfo betSlipInfoG2 = G1(bigDecimal3, bigDecimal3);
                    footerInfo.setPotentialWin("--");
                    footerInfo.setWHTax("--");
                    boolean zW3 = W2(Integer.valueOf(Q1().G1()));
                    BigDecimal bonus = S1().D.getBonus();
                    if (zW3 && bonus != null) {
                        bigDecimal3 = bonus;
                    }
                    footerInfo.setBonus(bigDecimal3);
                    footerInfo.setMultipleTotalOdds(betSlipInfoG2.getTotalOdds());
                    footerInfo.setMultipleTotalOddsForGift(betSlipInfoG2.getTotalOddsForGiftDialog());
                    footerInfo.setMultipleMinScaled(betSlipInfoG2.getMinScaled());
                    U1().f(Q1().G1(), zI, zA, i3, this.r2, z2);
                }
                this.h2 = j3;
                String string = Q1().H1(Q1().G1()).toString();
                string.getClass();
                footerInfo.setExciseTax(W1(string));
                footerInfo.setGift(b2());
                footerInfo.setGiftChecked(y2().i);
                String str2 = imnVar.a;
                if (str2 != null && str2.length() != 0) {
                    String string2 = new BigDecimal(imnVar.a).multiply(new BigDecimal(S1().D.getSimCurrentAutoTimes())).toString();
                    string2.getClass();
                    footerInfo.setMultipleTotalStake(string2);
                }
                String multipleTotalOddsForGift = footerInfo.getMultipleTotalOddsForGift();
                multipleTotalOddsForGift.getClass();
                this.w2 = multipleTotalOddsForGift;
                OrderBetType orderBetTypeFromValue = OrderBetType.INSTANCE.fromValue(Q1().G1());
                if (orderBetTypeFromValue == null) {
                    orderBetTypeFromValue = OrderBetType.ALL;
                }
                q2().y1(new i53(orderBetTypeFromValue, Boolean.valueOf(y2().i), O1().M().toString(), N1().W()));
                String string3 = a2().a().toString();
                string3.getClass();
                this.z2 = string3;
                String string4 = a2().a().toString();
                string4.getClass();
                this.y2 = string4;
                so3 so3Var = this.p1;
                if (so3Var != null) {
                    so3Var.a.H(footerInfo, this.h2, Q1().J1(), q2().y.getValue() instanceof vwv.c);
                    return;
                }
                return;
            }
        }
        O3();
    }

    public final void E1() {
        androidx.constraintlayout.widget.b bVar = new androidx.constraintlayout.widget.b();
        bVar.f(S1().O);
        bVar.e(R.id.bs_header_parent, 3);
        bVar.g(R.id.bs_header_parent, 4, R.id.booking_panel, 3);
        bVar.b(S1().O);
    }

    public final void E2(SelectedGiftData selectedGiftData, SelectedGiftData selectedGiftData2) {
        so3 so3Var;
        L3(true);
        y2().b(selectedGiftData);
        y2().D = selectedGiftData2;
        y2().v = true;
        GiftDetails rawGift = selectedGiftData.getRawGift();
        if (rawGift != null) {
            e2().I1(rawGift, selectedGiftData.getTotalStake(), selectedGiftData.getGiftValue(), Boolean.valueOf(selectedGiftData.getChecked()), Boolean.valueOf(selectedGiftData.getAddToStake()), Boolean.valueOf(selectedGiftData.getUserSelect()));
        }
        l3(false);
        if (!N1().m0() || (so3Var = this.p1) == null) {
            return;
        }
        so3Var.c(f4());
    }

    public final void E3() throws Throwable {
        so3 so3Var = this.p1;
        if (so3Var != null) {
            so3Var.a.setAnyWinChecked(false);
        }
        R1().E(false);
        gl0 gl0Var = this.Z;
        if (gl0Var == null) {
            Intrinsics.n("anyWinDomainService");
            throw null;
        }
        gl0Var.a(getLifecycle(), false);
        B1();
    }

    public final void E4() {
        q73 q73VarQ1 = Q1();
        ej5.c(o8i0.d(q73VarQ1), null, null, new n73(q73VarQ1, null), 3);
        new lsm() { // from class: wh3
            /* JADX WARN: Code duplicated, block: B:23:0x00fd  */
            @Override // defpackage.lsm
            public final void a(Object obj) {
                BetslipActivity betslipActivity = this.a;
                ArrayList arrayList = betslipActivity.L1;
                bcp bcpVar = (bcp) obj;
                if (bcpVar != null) {
                    ArrayList<tcp> arrayList2 = bcpVar.a;
                    Set<g08> set = BetslipActivity.X2;
                    if (arrayList2.isEmpty()) {
                        arrayList.clear();
                    } else {
                        xdp xdpVarD = arrayList2.get(0).d();
                        bcp bcpVarC = xdpVarD.j("details").c();
                        if (betslipActivity.M1 != null && !Intrinsics.g(xdpVarD.j("periodId").f(), betslipActivity.M1)) {
                            betslipActivity.N1().p0(false);
                            so3 so3Var = betslipActivity.p1;
                            if (so3Var != null) {
                                so3Var.a.J(false);
                            }
                            betslipActivity.S1().z.setText(betslipActivity.getCMSString(R.string.component_betslip__live_odds_boost, new Object[0]));
                            betslipActivity.S1().A.setText(betslipActivity.getCMSString(R.string.component_betslip__u_boost, new Object[0]));
                            betslipActivity.S1().v.setBackgroundResource(R.drawable.background_flash_odds);
                            betslipActivity.S1().w.setBackgroundResource(R.drawable.background_flash_odds);
                            zch0.k(betslipActivity, betslipActivity.S1().Y, Color.parseColor("#dcdee5"));
                            betslipActivity.Q1().P0.a(a53.b.a);
                        }
                        betslipActivity.M1 = xdpVarD.j("periodId").f();
                        arrayList.clear();
                        Iterator<tcp> it = bcpVarC.a.iterator();
                        it.getClass();
                        while (it.hasNext()) {
                            tcp next = it.next();
                            LinkedHashMap linkedHashMap = new LinkedHashMap();
                            xdp xdpVarD2 = next.d();
                            linkedHashMap.put("tournamentId", lal.b(xdpVarD2, "tournamentId"));
                            linkedHashMap.put("marketId", lal.b(xdpVarD2, "marketId"));
                            if (lal.a(xdpVarD2, "productId", 0) == 0) {
                                linkedHashMap.put("productId", Chyeyik.xln);
                            } else {
                                linkedHashMap.put("productId", String.valueOf(lal.a(xdpVarD2, "productId", 0)));
                            }
                            arrayList.add(linkedHashMap);
                        }
                    }
                } else {
                    arrayList.clear();
                }
                betslipActivity.B1();
                betslipActivity.B4(true);
            }
        }.a(dgy.b.a.a);
    }

    public final void F1() {
        v2().a();
        i2().a();
        V1().a();
    }

    public final void F2(zuy zuyVar, huy huyVar, avy avyVar) {
        bih0 bih0Var = this.e0;
        if (bih0Var == null) {
            Intrinsics.n("upSelectionRequestUseCase");
            throw null;
        }
        List<Selection> listA = bih0Var.a(zuyVar, huyVar, avyVar);
        if (!listA.isEmpty()) {
            S1().D.setInsureOneTwoUpEnable(false);
            N1().y(listA, t880.a.a);
            j2().a(listA, avyVar);
            Q1().C1(g880.n(listA, zuyVar, avyVar), aak.d, listA);
            return;
        }
        S1().D.b0 = null;
        wwd0 wwd0Var = j2().a;
        o2g o2gVar = o2g.a;
        o2gVar.getClass();
        wwd0Var.getClass();
        wwd0Var.k(null, o2gVar);
        F4();
    }

    public final void F3() {
        R1().i(null);
        R1().L(null);
        R1().S();
        R1().n();
        R1().Q(null);
        R1().v(null);
        F1();
        v2().b(null);
        i2().b(null);
        V1().b(null);
        v2().D = null;
        i2().D = null;
        V1().D = null;
        Boolean bool = (Boolean) n2().e.a.getValue();
        if (bool != null) {
            L3(bool.booleanValue());
        }
    }

    public final void F4() {
        zuy zuyVar;
        xry aVar;
        shh0 shh0VarX2 = x2();
        mhh0 mhh0VarA = nhh0.a(shh0VarX2.d);
        boolean z2 = mhh0VarA.b;
        zuy zuyVarB = shh0VarX2.b();
        boolean z3 = mhh0VarA.a;
        if (!z3 && !z2) {
            zuyVar = zuyVarB;
        } else if (z3 && z2) {
            zuyVar = zuy.b;
        } else if (z3) {
            zuyVar = zuy.c;
        } else {
            zuyVar = z2 ? zuy.d : zuy.a;
        }
        huy huyVarA = x2().a(S1().D.a0, new qi3(this, 0));
        boolean z4 = zuyVarB != zuy.a;
        huyVarA.getClass();
        boolean z5 = mhh0VarA.c;
        boolean z6 = mhh0VarA.d;
        if (z3 && z2) {
            int iOrdinal = huyVarA.ordinal();
            if (iOrdinal == 0) {
                aVar = new xry.a(zuyVar, z4, true, z5);
            } else {
                if (iOrdinal != 1) {
                    uhc.a();
                    return;
                }
                aVar = new xry.b(zuyVar, z4, true, z6);
            }
        } else if (z3) {
            aVar = new xry.a(zuyVar, z4, true, z5);
        } else if (z2) {
            aVar = new xry.b(zuyVar, z4, z2, z6);
        } else {
            int iOrdinal2 = huyVarA.ordinal();
            if (iOrdinal2 == 0) {
                aVar = new xry.a(zuyVar, z4, false, false);
            } else {
                if (iOrdinal2 != 1) {
                    uhc.a();
                    return;
                }
                aVar = new xry.b(zuyVar, z4, false, false);
            }
        }
        S1().D.setInsureOneTwoUpViewState(aVar, Q1().J1());
    }

    public final BetSlipInfo G1(BigDecimal bigDecimal, BigDecimal bigDecimal2) {
        if (S2() || !N1().n()) {
            return M1().c(bigDecimal, bigDecimal2, Q1().c1, N1().m0(), this.h2);
        }
        hu2 hu2VarM1 = M1();
        TaxConfigs taxConfigs = Q1().c1;
        boolean zM0 = N1().m0();
        long j3 = this.h2;
        med medVar = this.E0;
        if (medVar == null) {
            Intrinsics.n("oddsBoostRatioForSelectionProvider");
            throw null;
        }
        krm krmVar = hu2VarM1.b;
        q8k q8kVar = hu2VarM1.c;
        BigDecimal bigDecimal3 = BigDecimal.ZERO;
        lrm lrmVar = hu2VarM1.a;
        BigDecimal bigDecimal4 = !TextUtils.isEmpty(lrmVar.d0().a) ? new BigDecimal(lrmVar.d0().a) : bigDecimal3;
        BigDecimal bigDecimalE = krmVar.e(medVar);
        BigDecimal bigDecimalP = krmVar.p(medVar);
        BigDecimal bigDecimalMin = bigDecimal4.multiply(bigDecimalP).min(q8kVar.a());
        BigDecimal bigDecimalMin2 = !bigDecimal3.equals(bigDecimal2) ? bigDecimalMin.add(bigDecimal2).min(q8kVar.a()) : bigDecimalMin;
        BigDecimal bigDecimalMin3 = bigDecimal4.multiply(bigDecimalE).min(q8kVar.a());
        if (!bigDecimal3.equals(bigDecimal)) {
            bigDecimalMin3 = bigDecimalMin3.add(bigDecimal).min(q8kVar.a());
        }
        BetSlipInfo betSlipInfoI = hu2.i(taxConfigs, zM0, j3, bigDecimalMin3, bigDecimalMin, bigDecimalMin2, bigDecimal4);
        betSlipInfoI.setTotalOdds(hu2.d(bigDecimalE, bigDecimalP));
        RoundingMode roundingMode = RoundingMode.HALF_UP;
        BigDecimal scale = bigDecimalE.setScale(8, roundingMode);
        BigDecimal scale2 = bigDecimalP.setScale(8, roundingMode);
        betSlipInfoI.setTotalOddsForGiftDialog(scale.compareTo(scale2) >= 0 ? scale2.toString() : scale.toString());
        betSlipInfoI.setNoRoundTotalOdds(bigDecimalP);
        if (kni0.l()) {
            betSlipInfoI.setTotalOdds("-");
        }
        return betSlipInfoI;
    }

    public final void G2(OrderWithFailUpdate orderWithFailUpdate, ng10 ng10Var) {
        String str;
        String strL;
        String str2;
        String str3;
        q73 q73VarQ1 = Q1();
        q73VarQ1.M1 = false;
        q73VarQ1.N1 = false;
        if (orderWithFailUpdate == null || (str = orderWithFailUpdate.orderId) == null || !ng10Var.c.compareAndSet(false, true)) {
            return;
        }
        if (orderWithFailUpdate.orderId != null) {
            String str4 = orderWithFailUpdate.favorAmount;
            int i3 = 2;
            if (str4 != null && str4.length() != 0) {
                yyk yykVarE2 = e2();
                ej5.c(o8i0.d(yykVarE2), yykVarE2.a, null, new pyk(yykVarE2, false, null), 2);
            }
            L1().g();
            I1(false);
            orderWithFailUpdate.totalStake = Q1().H1(Q1().G1()).toString();
            try {
                strL = bjb0.L(Q1().c1.getRealSportTaxConfig().getExciseTax(new BigDecimal(Double.toString(this.g2))), Locale.US);
            } catch (Exception unused) {
                strL = "0.00";
            }
            orderWithFailUpdate.exciseTax = strL;
            if (Q1().G1() == 1 && (str2 = this.i2) != null && (str3 = this.j2) != null) {
                orderWithFailUpdate.maxWHTax = str2;
                orderWithFailUpdate.maxPTWin = str3;
            }
            if (N1().V()) {
                f00 f00Var = vgb0.a;
                vgb0.a(AnalyticsEvent.BET_BUILDER_PLACED);
            }
            if (N1().v0()) {
                k2().H1(Q1().G1());
            }
            if (N1().t1()) {
                k2().I1(Q1().G1());
            }
            ArrayList arrayListU = N1().U();
            if (arrayListU == null || !arrayListU.isEmpty()) {
                int size = arrayListU.size();
                int i4 = 0;
                while (i4 < size) {
                    Object obj = arrayListU.get(i4);
                    i4++;
                    if (N1().A0().containsKey((Selection) obj)) {
                        q73 q73VarQ2 = Q1();
                        sfy sfyVar = q73VarQ2.h0;
                        sfyVar.g();
                        sfyVar.f();
                        ej5.c(o8i0.d(q73VarQ2), null, null, new m73(q73VarQ2, null), 3);
                        break;
                    }
                }
            }
            N1().j1(this);
            boolean zE = N1().e();
            D1(false);
            F1();
            v2().F = false;
            i2().F = false;
            V1().F = false;
            ((br3) mmc.a(hp0.A, br3.class)).U().f(true);
            g9d0 g9d0Var = this.P;
            if (g9d0Var == null) {
                Intrinsics.n("sportySimBadgeHelper");
                throw null;
            }
            gq gqVar = new gq(g9d0Var, i3);
            zu7.a aVar = zu7.a;
            ej5.c(zu7.b(g9d0Var.c), null, null, new f9d0(g9d0Var, gqVar, null), 3);
            f00 f00Var2 = vgb0.a;
            Map mapSingletonMap = Collections.singletonMap("type", b3.b);
            mapSingletonMap.getClass();
            vgb0.c(AnalyticsEvent.BET_SUCCESS, mapSingletonMap, false);
            BetSuccessfulPageFragment betSuccessfulPageFragmentP0 = BetSuccessfulPageFragment.p0(orderWithFailUpdate, false, this.c2, zE);
            betSuccessfulPageFragmentP0.U = new yf3(this);
            FragmentManager supportFragmentManager = getSupportFragmentManager();
            supportFragmentManager.getClass();
            betSuccessfulPageFragmentP0.show(supportFragmentManager, "TAG_BET_SUCCESS");
            Intent intent = new Intent("ACTION_PLACE_BET_OR_CASH_OUT");
            intent.putExtra("EXTRA_ACTION_TYPE", 0);
            fdt.a(this).c(intent);
            q73 q73VarQ3 = Q1();
            ej5.c(o8i0.d(q73VarQ3), q73VarQ3.S, null, new r73(q73VarQ3, null), 2);
            o8s o8sVarG2 = g2();
            o8sVarG2.b.k0(null);
            o8sVarG2.c.add(h8s.c);
        }
        ej5.c(ebs.a(getLifecycle()), null, null, new ck3(ng10Var, this, str, null), 3);
    }

    public final void G3(boolean z2) {
        F3();
        int i3 = 0;
        if (!z2) {
            e2().y1(0, false);
            return;
        }
        if (Q1().G1() == 1 && !N1().U().isEmpty()) {
            imn imnVarE0 = R1().e0();
            R1().S();
            ArrayList arrayListU = N1().U();
            int size = arrayListU.size();
            while (i3 < size) {
                Object obj = arrayListU.get(i3);
                i3++;
                R1().O((Selection) obj, imnVarE0.a);
            }
            Y3(true, imnVarE0);
        }
        ui90 ui90Var = s2().d;
        ui90Var.b();
        ui90Var.c();
    }

    /* JADX WARN: Code duplicated, block: B:126:0x0242  */
    /* JADX WARN: Code duplicated, block: B:129:0x0248  */
    /* JADX WARN: Code duplicated, block: B:189:0x024b A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r10v2, types: [sh3] */
    /* JADX WARN: Type inference failed for: r11v1, types: [th3] */
    public final void G4() {
        ArrayList arrayList;
        boolean z2;
        String str;
        String str2;
        String str3;
        String str4;
        Object bVar;
        RelatedBetRequest.BetBuilderSelection betBuilderSelection;
        Tournament tournament;
        String str5;
        String str6;
        Object bVar2;
        Tournament tournament2;
        String str7;
        if (Q1().J1()) {
            S1().F.setVisibility(8);
            return;
        }
        S1().F.setVisibility(0);
        ArrayList arrayListU = N1().U();
        boolean z3 = (!getAccountHelper().isLogin() || N1().m0() || arrayListU.isEmpty()) ? false : true;
        arrayListU.getClass();
        ArrayList arrayList2 = new ArrayList();
        int size = arrayListU.size();
        int i3 = 0;
        while (i3 < size) {
            Object obj = arrayListU.get(i3);
            i3++;
            if (!((Selection) obj).p()) {
                arrayList2.add(obj);
            }
        }
        ArrayList arrayList3 = new ArrayList();
        int size2 = arrayList2.size();
        int i4 = 0;
        while (true) {
            String str8 = "tournamentId is null.";
            String str9 = "outcomeId is null.";
            if (i4 >= size2) {
                String str10 = "marketId is null.";
                String str11 = "eventId is null.";
                boolean z4 = false;
                ArrayList arrayList4 = new ArrayList();
                int size3 = arrayListU.size();
                int i5 = 0;
                while (i5 < size3) {
                    Object obj2 = arrayListU.get(i5);
                    i5++;
                    if (((Selection) obj2).p()) {
                        arrayList4.add(obj2);
                    }
                }
                ArrayList arrayList5 = new ArrayList();
                int size4 = arrayList4.size();
                int i6 = 0;
                while (i6 < size4) {
                    int i7 = i6 + 1;
                    Selection selection = (Selection) arrayList4.get(i6);
                    try {
                        zi50.a aVar = zi50.b;
                        String str12 = selection.a.sport.id;
                        str12.getClass();
                        Category category = selection.a.sport.category;
                        if (category != null && (tournament = category.tournament) != null && (str5 = tournament.id) != null) {
                            if (str5.length() == 0) {
                                str5 = null;
                            }
                            if (str5 != null) {
                                String str13 = str5;
                                String eventId = selection.getEventId();
                                if (eventId == null) {
                                    throw new Exception(str11);
                                }
                                List<Selection> list = selection.d;
                                list.getClass();
                                ArrayList arrayList6 = new ArrayList();
                                for (Selection selection2 : list) {
                                    try {
                                        String str14 = str12;
                                        str6 = str11;
                                        try {
                                            String marketId = selection2.getMarketId();
                                            if (marketId == null) {
                                                throw new Exception(str10);
                                            }
                                            arrayList = arrayList4;
                                            try {
                                                String outcomeId = selection2.getOutcomeId();
                                                z2 = z3;
                                                if (outcomeId == null) {
                                                    throw new Exception(str9);
                                                }
                                                try {
                                                    String specifier = selection2.getSpecifier();
                                                    String str15 = selection2.c.odds;
                                                    str15.getClass();
                                                    arrayList6.add(new RelatedBetRequest.BetBuilderSelection.Market(marketId, outcomeId, specifier, str15));
                                                    str12 = str14;
                                                    str11 = str6;
                                                    arrayList4 = arrayList;
                                                    z3 = z2;
                                                } catch (Throwable th) {
                                                    th = th;
                                                    str4 = str8;
                                                    str = str9;
                                                    str2 = str10;
                                                    str3 = str6;
                                                    zi50.a aVar2 = zi50.b;
                                                    bVar = new zi50.b(th);
                                                    if (bVar instanceof zi50.b) {
                                                        bVar = null;
                                                    }
                                                    betBuilderSelection = (RelatedBetRequest.BetBuilderSelection) bVar;
                                                    if (betBuilderSelection != null) {
                                                        arrayList5.add(betBuilderSelection);
                                                    }
                                                    str8 = str4;
                                                    str9 = str;
                                                    str10 = str2;
                                                    str11 = str3;
                                                    i6 = i7;
                                                    arrayList4 = arrayList;
                                                    z3 = z2;
                                                }
                                            } catch (Throwable th2) {
                                                th = th2;
                                                z2 = z3;
                                                str4 = str8;
                                                str = str9;
                                                str2 = str10;
                                                str3 = str6;
                                                zi50.a aVar3 = zi50.b;
                                                bVar = new zi50.b(th);
                                                if (bVar instanceof zi50.b) {
                                                    bVar = null;
                                                }
                                                betBuilderSelection = (RelatedBetRequest.BetBuilderSelection) bVar;
                                                if (betBuilderSelection != null) {
                                                    arrayList5.add(betBuilderSelection);
                                                }
                                                str8 = str4;
                                                str9 = str;
                                                str10 = str2;
                                                str11 = str3;
                                                i6 = i7;
                                                arrayList4 = arrayList;
                                                z3 = z2;
                                            }
                                        } catch (Throwable th3) {
                                            th = th3;
                                            arrayList = arrayList4;
                                            z2 = z3;
                                            str4 = str8;
                                            str = str9;
                                            str2 = str10;
                                            str3 = str6;
                                            zi50.a aVar4 = zi50.b;
                                            bVar = new zi50.b(th);
                                            if (bVar instanceof zi50.b) {
                                                bVar = null;
                                            }
                                            betBuilderSelection = (RelatedBetRequest.BetBuilderSelection) bVar;
                                            if (betBuilderSelection != null) {
                                                arrayList5.add(betBuilderSelection);
                                            }
                                            str8 = str4;
                                            str9 = str;
                                            str10 = str2;
                                            str11 = str3;
                                            i6 = i7;
                                            arrayList4 = arrayList;
                                            z3 = z2;
                                        }
                                    } catch (Throwable th4) {
                                        th = th4;
                                        str6 = str11;
                                    }
                                }
                                String str16 = str12;
                                str6 = str11;
                                arrayList = arrayList4;
                                z2 = z3;
                                String str17 = selection.c.odds;
                                str17.getClass();
                                str4 = str8;
                                try {
                                    str = str9;
                                    str2 = str10;
                                    boolean z5 = z4;
                                    str3 = str6;
                                    try {
                                        bVar = new RelatedBetRequest.BetBuilderSelection(str16, str13, eventId, arrayList6, str17, z5);
                                        z4 = z5;
                                        try {
                                            zi50.a aVar5 = zi50.b;
                                        } catch (Throwable th5) {
                                            th = th5;
                                            zi50.a aVar6 = zi50.b;
                                            bVar = new zi50.b(th);
                                        }
                                    } catch (Throwable th6) {
                                        th = th6;
                                        z4 = z5;
                                    }
                                } catch (Throwable th7) {
                                    th = th7;
                                    str = str9;
                                    str2 = str10;
                                    str3 = str6;
                                }
                                if (bVar instanceof zi50.b) {
                                    bVar = null;
                                }
                                betBuilderSelection = (RelatedBetRequest.BetBuilderSelection) bVar;
                                if (betBuilderSelection != null) {
                                    arrayList5.add(betBuilderSelection);
                                }
                                str8 = str4;
                                str9 = str;
                                str10 = str2;
                                str11 = str3;
                                i6 = i7;
                                arrayList4 = arrayList;
                                z3 = z2;
                            }
                            zi50.a aVar7 = zi50.b;
                            bVar = new zi50.b(th);
                            if (bVar instanceof zi50.b) {
                                bVar = null;
                            }
                            betBuilderSelection = (RelatedBetRequest.BetBuilderSelection) bVar;
                            if (betBuilderSelection != null) {
                                arrayList5.add(betBuilderSelection);
                            }
                            str8 = str4;
                            str9 = str;
                            str10 = str2;
                            str11 = str3;
                            i6 = i7;
                            arrayList4 = arrayList;
                            z3 = z2;
                        }
                        throw new Exception(str8);
                    } catch (Throwable th8) {
                        th = th8;
                        arrayList = arrayList4;
                        z2 = z3;
                        str = str9;
                        str2 = str10;
                        str3 = str11;
                        str4 = str8;
                    }
                }
                final boolean z6 = z3;
                final RelatedBetRequest relatedBetRequest = new RelatedBetRequest(arrayList3, arrayList5);
                ComposeView composeView = S1().F;
                final v150 v150Var = g2().f() ? v150.WARNING : v150.NORMAL;
                final int i8 = g2().f() ? R.string.component_betslip__liability_related_bet_remind_text : R.string.component_betslip__people_also_bet_on;
                final ?? r10 = new Function1() { // from class: sh3
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj3) {
                        com.sporty.android.book.domain.entity.Event event = (com.sporty.android.book.domain.entity.Event) obj3;
                        Set<g08> set = BetslipActivity.X2;
                        event.getClass();
                        this.a.j3(apg.i(event), event.getEventStatus() == EventStatus.PRE_MATCH);
                        return Unit.a;
                    }
                };
                final ?? r11 = new Function1() { // from class: th3
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj3) {
                        com.sporty.android.book.domain.entity.Event event = (com.sporty.android.book.domain.entity.Event) obj3;
                        Set<g08> set = BetslipActivity.X2;
                        event.getClass();
                        Event eventI = apg.i(event);
                        Market market = eventI.markets.get(0);
                        Outcome outcome = market.outcomes.get(0);
                        BetslipActivity betslipActivity = this.a;
                        if (betslipActivity.N1().j0(eventI, market, outcome, k980.RELATED_BET)) {
                            betslipActivity.R1().O(new Selection(eventI, market, outcome), betslipActivity.R1().e0().a);
                            betslipActivity.m2(true);
                        } else {
                            if (betslipActivity.N1().R()) {
                                qz3.p(betslipActivity);
                            }
                            if (betslipActivity.N1().e0(new Selection(eventI, market, outcome)) || betslipActivity.N1().y1(eventI)) {
                                qz3.m(betslipActivity);
                            }
                        }
                        iym iymVarL2 = betslipActivity.l2();
                        PageMeta.INSTANCE.getClass();
                        iymVarL2.f(AnalyticsEvent.BETSLIP_RELATED_BET_ADD_TO_BETSLIP, new PageMeta("betslip", null));
                        o8s o8sVarG2 = betslipActivity.g2();
                        o8sVarG2.c.add(h8s.d);
                        return Unit.a;
                    }
                };
                composeView.setContent(new op8(86498086, new Function2() { // from class: y150
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj3, Object obj4) {
                        a aVar8 = (a) obj3;
                        int iIntValue = ((Integer) obj4).intValue();
                        if (aVar8.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                            final boolean z7 = z6;
                            final RelatedBetRequest relatedBetRequest2 = relatedBetRequest;
                            final v150 v150Var2 = v150Var;
                            final int i9 = i8;
                            final sh3 sh3Var = r10;
                            final th3 th3Var = r11;
                            scv.b(null, null, null, pp8.b(-1802374406, new Function2() { // from class: z150
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj5, Object obj6) {
                                    a aVar9 = (a) obj5;
                                    int iIntValue2 = ((Integer) obj6).intValue();
                                    if (aVar9.q(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                        e250.a(z7, relatedBetRequest2, v150Var2, i9, sh3Var, th3Var, aVar9, RelatedBetRequest.$stable << 3);
                                    } else {
                                        aVar9.G();
                                    }
                                    return Unit.a;
                                }
                            }, aVar8), aVar8, 3072, 7);
                        } else {
                            aVar8.G();
                        }
                        return Unit.a;
                    }
                }, true));
                if (g2().f()) {
                    ((x5a0) ((i250) this.J0.getValue()).b).setValue(Boolean.TRUE);
                    return;
                }
                return;
            }
            int i9 = i4 + 1;
            Selection selection3 = (Selection) arrayList2.get(i4);
            try {
                zi50.a aVar8 = zi50.b;
                String str18 = selection3.a.sport.id;
                str18.getClass();
                Category category2 = selection3.a.sport.category;
                if (category2 != null && (tournament2 = category2.tournament) != null && (str7 = tournament2.id) != null) {
                    if (str7.length() == 0) {
                        str7 = null;
                    }
                    if (str7 != null) {
                        String eventId2 = selection3.getEventId();
                        if (eventId2 == null) {
                            throw new Exception("eventId is null.");
                        }
                        String marketId2 = selection3.getMarketId();
                        if (marketId2 == null) {
                            throw new Exception("marketId is null.");
                        }
                        String str19 = str7;
                        String outcomeId2 = selection3.getOutcomeId();
                        if (outcomeId2 == null) {
                            throw new Exception("outcomeId is null.");
                        }
                        String specifier2 = selection3.getSpecifier();
                        String str20 = selection3.c.odds;
                        str20.getClass();
                        bVar2 = new RelatedBetRequest.Selection(str18, str19, eventId2, marketId2, outcomeId2, specifier2, str20, false);
                        RelatedBetRequest.Selection selection4 = (RelatedBetRequest.Selection) (bVar2 instanceof zi50.b ? null : bVar2);
                        if (selection4 != null) {
                            arrayList3.add(selection4);
                        }
                        i4 = i9;
                    }
                }
                throw new Exception("tournamentId is null.");
            } catch (Throwable th9) {
                zi50.a aVar9 = zi50.b;
                bVar2 = new zi50.b(th9);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x001a  */
    /* JADX WARN: Code duplicated, block: B:34:0x008f  */
    @Override // defpackage.to3
    public final void H0() {
        boolean z2;
        boolean z3;
        boolean zM0 = N1().m0();
        bqy bqyVar = this.m1;
        if (zM0) {
            z2 = false;
        } else {
            bqy.a aVar = bqyVar.b;
            if (aVar == null ? false : aVar.b) {
                z2 = true;
            } else {
                z2 = false;
            }
        }
        gvo gvoVar = new gvo();
        Bundle bundle = new Bundle();
        luo luoVarD = vuo.d(this.J2, O1());
        luo luoVar = luo.a;
        bundle.putBoolean("key_show_flex_bet_info", luoVarD != luoVar);
        bundle.putBoolean("key_show_cut_bet_info", vuo.f(T1(), bqyVar, O1()) != luoVar);
        bundle.putBoolean("key_show_any_win_info", N1().W() && vuo.a(this.K2, this.L2, R1()) != luoVar);
        if (N1().W()) {
            mjf mjfVar = this.U;
            if (mjfVar == null) {
                Intrinsics.n("earlyPayoutConfigManager");
                throw null;
            }
            z3 = mjfVar.d(ckf.c);
        }
        bundle.putBoolean("key_show_early_payout_info", z3);
        bundle.putBoolean("key_is_one_cut_v3", z2);
        bundle.putBoolean("key_show_one_two_up_info", x2().d());
        bundle.putString("key_one_two_up_state", x2().b().name());
        gvoVar.setArguments(bundle);
        gvoVar.setCancelable(false);
        gvoVar.show(getSupportFragmentManager(), "InsureInfoFragment");
        if (vuo.a(this.K2, this.L2, R1()) != luoVar) {
            Q1().O1(v03.j.a);
        }
    }

    public final void H1(Selection selection) {
        sty styVar = this.B0;
        if (styVar == null) {
            Intrinsics.n("oneUpSelectionAttributionDispatcher");
            throw null;
        }
        selection.getClass();
        styVar.b(new sty.b.C1102b(new yty(selection, false, gty.f, false, nty.a.a, styVar.c.b()), false));
        q73 q73VarQ1 = Q1();
        q73VarQ1.O.N(selection);
        jrm jrmVar = q73VarQ1.N;
        jrmVar.j(selection);
        jrmVar.C1(selection);
        jrmVar.m(selection);
        jrmVar.i1(selection);
        Event event = selection.a;
        event.getClass();
        String strD = apg.d(event);
        String strC = apg.c(event);
        List<PreCannedBBOutcome> list = selection.c.childOutcomes;
        if (list != null && !list.isEmpty()) {
            Market market = selection.b;
            market.getClass();
            if (u5y.c(market)) {
                q73VarQ1.T1(new sg2.p(strD, strC));
            } else {
                q73VarQ1.T1(new sg2.t(strD, strC));
            }
        }
        if (selection.y) {
            q73VarQ1.T1(new sg2.k(strD, strC));
        }
        if (N1().U().isEmpty()) {
            ej5.c(ebs.a(getLifecycle()), null, null, new g(null), 3);
        }
        S1().S.post(new Runnable() { // from class: ei3
            @Override // java.lang.Runnable
            public final void run() {
                this.a.o1.notifyDataSetChanged();
            }
        });
    }

    public final void H2(ej90 ej90Var) {
        n780 cVar;
        Object next;
        Object obj;
        Object obj2;
        n780.c cVar2;
        GiftDetails rawGift;
        long j3;
        long jLongValue;
        BigDecimal bigDecimalG;
        BigDecimal bigDecimalC;
        if (s2().w || !N1().m0() || ej90Var == null) {
            return;
        }
        List<GiftDetails> list = ej90Var.c;
        if (ej90Var.b == ipk.a) {
            cVar = n780.f.a;
        } else if (list.isEmpty()) {
            cVar = new n780.a(Integer.valueOf(N1().U().size() > 1 ? 2 : 1));
        } else {
            GiftDetails giftDetails = (GiftDetails) CollectionsKt.T(list);
            String string = Q1().H1(Q1().G1()).toString();
            string.getClass();
            cVar = new n780.c(giftDetails, string, bjb0.W(giftDetails.getCurrentBalance()), Boolean.valueOf(ej90Var.a != null), Boolean.valueOf(ej90Var.d), Boolean.FALSE);
        }
        if (cVar instanceof n780.a) {
            so3 so3Var = this.p1;
            if (so3Var != null) {
                so3Var.c(false);
            }
            so3 so3Var2 = this.p1;
            if (so3Var2 != null) {
                so3Var2.e(false);
            }
            F1();
            y2().b = 0;
            if (Q1().G1() != 1) {
                if (Q1().G1() == 2) {
                    SelectedGiftData selectedGiftData = y2().C;
                    y2().b(null);
                    imn imnVarE = M1().e();
                    imnVarE.a = H3(imnVarE.a, selectedGiftData);
                    Q3();
                    return;
                }
                return;
            }
            SelectedGiftData selectedGiftData2 = y2().C;
            if (selectedGiftData2 != null) {
                SelectedGiftData selectedGiftDataCopy$default = SelectedGiftData.copy$default(selectedGiftData2, null, 0, null, null, 0, null, false, false, false, null, 895, null);
                y2().D = selectedGiftData2;
                y2().b(selectedGiftDataCopy$default);
                y2().v = true;
                l3(true);
                y2().b(null);
                return;
            }
            return;
        }
        if (cVar instanceof n780.f) {
            so3 so3Var3 = this.p1;
            if (so3Var3 != null) {
                so3Var3.e(true);
                return;
            }
            return;
        }
        if (cVar instanceof n780.c) {
            so3 so3Var4 = this.p1;
            if (so3Var4 != null) {
                so3Var4.e(false);
            }
            if (b3()) {
                so3 so3Var5 = this.p1;
                if (so3Var5 != null) {
                    so3Var5.c(false);
                    return;
                }
                return;
            }
            if (B2()) {
                return;
            }
            v2().b = list.size();
            i2().b = list.size();
            V1().b = list.size();
            SelectedGiftData selectedGiftData3 = y2().C;
            Iterator<T> it = list.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!Intrinsics.g(((GiftDetails) next).getGiftId(), selectedGiftData3 != null ? selectedGiftData3.getGiftId() : null));
            GiftDetails giftDetails2 = (GiftDetails) next;
            n780.c cVar3 = (n780.c) cVar;
            GiftDetails giftDetails3 = cVar3.a;
            String giftId = giftDetails3.getGiftId();
            String str = AnalyticsParam.EVENT_STATUS_UNCHECKED;
            if (selectedGiftData3 == null || giftDetails2 == null || !(selectedGiftData3.getUserSelect() || Intrinsics.g(giftDetails2.getGiftId(), giftId))) {
                obj = AnalyticsParam.EVENT_STATUS;
                obj2 = "betslip";
                cVar2 = null;
            } else {
                C3(AnalyticsEvent.BETSLIP_GIFT_CHECKBOX_VIEW, kpu.f(new Pair("source", "betslip"), new Pair(AnalyticsParam.EVENT_STATUS, selectedGiftData3.getChecked() ? AnalyticsParam.EVENT_STATUS_CHECKED : AnalyticsParam.EVENT_STATUS_UNCHECKED)));
                String giftValue = selectedGiftData3.getGiftValue();
                if (giftValue == null || (bigDecimalG = kotlin.text.b.g(giftValue)) == null || (bigDecimalC = p54.c(bigDecimalG)) == null) {
                    j3 = Long.MAX_VALUE;
                } else {
                    j3 = Long.MAX_VALUE;
                    if (bigDecimalC.compareTo(BigDecimal.valueOf(Long.MAX_VALUE)) <= 0) {
                        jLongValue = bigDecimalC.compareTo(BigDecimal.ZERO) < 0 ? 0L : bigDecimalC.longValue();
                    }
                    long jMin = Math.min(giftDetails2.getCurrentBalance(), jLongValue);
                    String totalStake = selectedGiftData3.getTotalStake();
                    String strW = bjb0.W(jMin);
                    Boolean boolValueOf = Boolean.valueOf(selectedGiftData3.getChecked());
                    Boolean boolValueOf2 = Boolean.valueOf(selectedGiftData3.getAddToStake());
                    Boolean boolValueOf3 = Boolean.valueOf(selectedGiftData3.getUserSelect());
                    obj2 = "betslip";
                    obj = AnalyticsParam.EVENT_STATUS;
                    cVar2 = new n780.c(giftDetails2, totalStake, strW, boolValueOf, boolValueOf2, boolValueOf3);
                }
                jLongValue = j3;
                long jMin2 = Math.min(giftDetails2.getCurrentBalance(), jLongValue);
                String totalStake2 = selectedGiftData3.getTotalStake();
                String strW2 = bjb0.W(jMin2);
                Boolean boolValueOf4 = Boolean.valueOf(selectedGiftData3.getChecked());
                Boolean boolValueOf5 = Boolean.valueOf(selectedGiftData3.getAddToStake());
                Boolean boolValueOf6 = Boolean.valueOf(selectedGiftData3.getUserSelect());
                obj2 = "betslip";
                obj = AnalyticsParam.EVENT_STATUS;
                cVar2 = new n780.c(giftDetails2, totalStake2, strW2, boolValueOf4, boolValueOf5, boolValueOf6);
            }
            if (cVar2 == null) {
                boolean checked = selectedGiftData3 != null ? selectedGiftData3.getChecked() : Intrinsics.g(n2().e.a.getValue(), Boolean.TRUE);
                L3(checked);
                boolean z2 = (selectedGiftData3 == null || (rawGift = selectedGiftData3.getRawGift()) == null || Intrinsics.g(giftDetails3.getGiftId(), rawGift.getGiftId())) ? false : true;
                Pair pair = new Pair("source", obj2);
                if (checked) {
                    str = AnalyticsParam.EVENT_STATUS_CHECKED;
                }
                C3(AnalyticsEvent.BETSLIP_GIFT_CHECKBOX_VIEW, kpu.f(pair, new Pair(obj, str)));
                if (checked && z2) {
                    Snackbar snackbarH = Snackbar.h(S1().a, getCMSString(R.string.component_coupon__gift_updated_to_better_match_your_current_selection, new Object[0]), 0);
                    p4(snackbarH);
                    l2().c(AnalyticsEvent.BETSLIP_GIFT_UPDATED_SNACKBAR_VIEW, null, null);
                    y8j fullStoryCommonManager = getFullStoryCommonManager();
                    BaseTransientBottomBar.SnackbarBaseLayout snackbarBaseLayout = snackbarH.i;
                    snackbarBaseLayout.getClass();
                    fullStoryCommonManager.c(snackbarBaseLayout, AnalyticsEvent.BETSLIP_GIFT_UPDATED_SNACKBAR);
                }
                y2().D = selectedGiftData3;
                cVar2 = new n780.c(giftDetails3, null, null, Boolean.valueOf(checked), selectedGiftData3 != null ? Boolean.valueOf(selectedGiftData3.getAddToStake()) : cVar3.e, null);
            }
            z1(cVar2, true);
        }
    }

    public final void H4() {
        if (!N1().m0() || N1().u0()) {
            return;
        }
        this.h1.onNext(String.valueOf(this.g2));
    }

    public final void I1(boolean z2) {
        String strValueOf;
        String strP;
        if (N1().U().isEmpty()) {
            return;
        }
        boolean z3 = true;
        if (Q1().G1() == 2 && z2 && b3()) {
            BigDecimal bigDecimal = this.H2.f;
            z2 = bigDecimal != null && bigDecimal.compareTo(BigDecimal.ZERO) > 0;
        }
        itf0.a aVar = itf0.a;
        aVar.q(MyLog.TAG_ACCEPT_CHANGE);
        boolean z4 = this.B1;
        boolean zV2 = V2();
        boolean z5 = this.F1;
        StringBuilder sbA = cwz.a("mPushChanged ", " isAutoAcceptChangeWithRemoveSuspendToggle() ", " mEventStatusChange ", z4, zV2);
        sbA.append(z5);
        aVar.a(sbA.toString(), new Object[0]);
        t2k t2kVar = this.c0;
        if (t2kVar == null) {
            Intrinsics.n("getAnyWinOddsChangeStateUseCase");
            throw null;
        }
        rl0 rl0VarA = t2kVar.a();
        rl0 rl0Var = rl0.c;
        boolean z6 = (this.B1 && (V2() || this.F1 || this.E1)) || g2().a() || (Q1().C.getResult() instanceof uh30.b) || (Q1().C.getResult() instanceof uh30.c) || (R1().A() && (rl0VarA == rl0Var || rl0VarA == rl0.d) && Q1().G1() == 2);
        boolean zM0 = N1().m0();
        t2k t2kVar2 = this.c0;
        if (t2kVar2 == null) {
            Intrinsics.n("getAnyWinOddsChangeStateUseCase");
            throw null;
        }
        rl0 rl0VarA2 = t2kVar2.a();
        boolean z7 = R1().A() && (rl0VarA2 == rl0Var || rl0VarA2 == rl0.d) && Q1().G1() == 2;
        if (g2().f() || (Q1().C.getResult() instanceof uh30.b)) {
            S1().G.setText(getCMSString(R.string.component_betslip__required_selection_change, new Object[0]));
        } else if (z7) {
            S1().G.setText(getCMSString(R.string.component_betslip__changes_in_odds_or_low_return, new Object[0]));
        } else {
            S1().G.setText(getCMSString(R.string.component_betslip__note_changes_in_odds_or_availability, new Object[0]));
        }
        S1().G.setVisibility(g2().f() || (Q1().C.getResult() instanceof uh30.b) || z6 ? 0 : 8);
        if (z6) {
            S1().y.setBackgroundColor(S1().y.getContext().getColor(R.color.warning_tertiary));
            k3(zM0);
            S1().P.b.setVisibility(0);
            if (z7) {
                int iOrdinal = rl0VarA2.ordinal();
                if (iOrdinal == 2) {
                    S1().P.b.setText(getCMSString(R.string.component_betslip__remove_low_returns, new Object[0]));
                    Q1().O1(v03.l0.a);
                } else if (iOrdinal != 3) {
                    S1().P.b.setText(getCMSString(R.string.component_betslip__accept_changes, new Object[0]));
                } else {
                    S1().P.b.setText(getCMSString(R.string.component_betslip__accept_changes_and_remove_low_returns, new Object[0]));
                    Q1().O1(v03.j0.a);
                }
            } else {
                S1().P.b.setText(getCMSString(R.string.component_betslip__accept_changes, new Object[0]));
            }
            S1().P.z.setVisibility(8);
            S1().P.f.setVisibility(8);
            S1().P.d.setVisibility(8);
            S1().P.y.setVisibility(8);
            S1().P.b.setBackgroundResource(zM0 ? R.drawable.spr_place_bet_sim_selector : R.drawable.spr_place_bet_selector);
            S1().P.b.setTextColor(zM0 ? getResources().getColor(R.color.background_type2_primary) : getResources().getColor(R.color.brand_tertiary));
            Q1().O1(new v03.l(Q1().E1()));
        } else {
            S1().y.setBackgroundColor(S1().y.getContext().getColor(R.color.background_general_primary));
            S1().P.b.setVisibility(8);
            S1().P.f.setVisibility(0);
            S1().P.y.setVisibility(N1().e() ? 8 : 0);
            if (zM0) {
                S1().P.z.setVisibility(0);
            }
            if (N1().D()) {
                S1().P.d.setVisibility(0);
            }
        }
        String string = Q1().H1(Q1().G1()).toString();
        string.getClass();
        if (d2().h(Q1().G1(), Integer.valueOf(Y1())) && d2().i(Q1().G1())) {
            double d3 = Double.parseDouble(string);
            String str = y2().c;
            double d4 = d3 - (str != null ? Double.parseDouble(str) : 0.0d);
            this.g2 = d4;
            strValueOf = String.valueOf(d4);
        } else {
            this.g2 = Double.parseDouble(string);
            strValueOf = string;
        }
        if (strValueOf.length() <= 0 || Double.parseDouble(strValueOf) >= 0.0d) {
            strP = bjb0.P(strValueOf, Locale.US);
        } else {
            this.g2 = 0.0d;
            strP = "0.00";
        }
        int iC = O1().C();
        LinkedHashMap linkedHashMap = this.R2;
        if (iC != 0) {
            S1().P.f.setEnabled(z2);
            this.d2 = z2;
            if (!z2) {
                c8i0.m(S1().P.f, getCMSString(R.string.component_betslip__place_bet, new Object[0]), ebs.a(getLifecycle()), linkedHashMap);
                H4();
                S3(false);
            } else if (a3(string)) {
                c8i0.m(S1().P.f, getCMSString(R.string.component_betslip__place_bet, new Object[0]), ebs.a(getLifecycle()), linkedHashMap);
                S1().P.z.setText(getCMSString(R.string.component_betslip__place_simulate_bet, new Object[0]));
                S3(false);
                S1().P.f.setEnabled(false);
                Q1().B1("0");
            } else {
                C1();
                if (N1().m0()) {
                    this.h1.onNext(strP);
                } else if (Q1().c1.hasExciseTaxRate(false)) {
                    c8i0.m(S1().P.f, getCMSString(R.string.component_betslip__place_bet_with_excise_tax, strP), ebs.a(getLifecycle()), linkedHashMap);
                } else {
                    Button button = S1().P.f;
                    j7g j7gVar = new j7g(getCMSString(R.string.component_betslip__place_bet, new Object[0]));
                    j7gVar.l(zch0.b(getResources(), 12), getCMSString(R.string.component_betslip__about_to_pay_vamount_lineup, strP));
                    c8i0.m(button, j7gVar, ebs.a(getLifecycle()), linkedHashMap);
                }
                Q1().B1(string);
            }
        } else {
            S3(false);
            S1().P.f.setEnabled(false);
            wwd0 wwd0Var = Q1().L0;
            Boolean bool = Boolean.FALSE;
            wwd0Var.getClass();
            wwd0Var.k(null, bool);
            H4();
            c8i0.m(S1().P.f, getCMSString(R.string.component_betslip__place_bet, new Object[0]), ebs.a(getLifecycle()), linkedHashMap);
            S1().P.z.setText(getCMSString(R.string.component_betslip__place_simulate_bet, new Object[0]));
        }
        if (!g2().f() && !(Q1().C.getResult() instanceof uh30.b)) {
            z3 = false;
        }
        S1().P.v.setVisibility(z3 ? 0 : 8);
    }

    public final void I3(JSONArray jSONArray) {
        JSONArray jSONArrayOptJSONArray = jSONArray.optJSONArray(8);
        if (jSONArrayOptJSONArray == null) {
            return;
        }
        int i3 = 0;
        String strOptString = jSONArray.optString(0);
        strOptString.getClass();
        final String str = "";
        List listSplit$default = StringsKt__StringsKt.split$default(StringsKt.p0(strOptString, "^", ""), new String[]{"^"}, false, 0, 6, null);
        if (listSplit$default.size() <= 6) {
            return;
        }
        final String str2 = (String) listSplit$default.get(3);
        final String str3 = (String) listSplit$default.get(5);
        String str4 = (String) listSplit$default.get(6);
        if (str4 != null && !StringsKt.U(str4) && !str4.equals("~")) {
            str = str4;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int length = jSONArrayOptJSONArray.length();
        for (int i4 = 0; i4 < length; i4++) {
            String strOptString2 = jSONArrayOptJSONArray.optString(i4);
            strOptString2.getClass();
            List listSplit$default2 = StringsKt__StringsKt.split$default(strOptString2, new String[]{"#"}, false, 0, 6, null);
            if (listSplit$default2.size() > 2) {
                linkedHashMap.put(listSplit$default2.get(0), listSplit$default2.get(2));
            }
        }
        knh.a aVar = new knh.a(ld80.d(ld80.j(ld80.d(CollectionsKt.K(N1().U()), new we3(i3)), new xe3(i3)), new Function1(str2, str3, this, str) { // from class: ye3
            public final /* synthetic */ String a;
            public final /* synthetic */ String b;
            public final /* synthetic */ String c;

            {
                this.c = str;
            }

            /* JADX WARN: Code duplicated, block: B:17:0x0040  */
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                boolean z2;
                Selection selection = (Selection) obj;
                Set<g08> set = BetslipActivity.X2;
                selection.getClass();
                if (Intrinsics.g(selection.getEventId(), this.a) && Intrinsics.g(selection.getMarketId(), this.b)) {
                    String str5 = selection.b.specifier;
                    if (str5 == null || StringsKt.U(str5) || str5.equals("~")) {
                        str5 = "";
                    }
                    if (str5.equals(this.c)) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                } else {
                    z2 = false;
                }
                return Boolean.valueOf(z2);
            }
        }));
        while (aVar.hasNext()) {
            Selection selection = (Selection) aVar.next();
            String str5 = (String) linkedHashMap.get(selection.getOutcomeId());
            if (str5 != null) {
                R1().T(selection, str5);
            }
        }
        Q1().P0.a(a53.a.a);
    }

    public final void I4() {
        boolean z2 = false;
        h4(Q1().G1() == 3);
        q73 q73VarQ1 = Q1();
        if (Q1().G1() != 1 && O1().P()) {
            z2 = true;
        }
        q73VarQ1.d1 = z2;
        Q1().P0.a(a53.b.a);
    }

    public final void J1(GetInsureBetOddsData getInsureBetOddsData) {
        if (getInsureBetOddsData.betType == 6) {
            BigDecimal bigDecimal = BigDecimal.ZERO;
            bigDecimal.getClass();
            nl0 nl0Var = this.I2;
            nl0Var.getClass();
            bigDecimal.getClass();
            nl0Var.c = bigDecimal;
            nl0Var.b = bigDecimal;
        }
        ouo ouoVarF2 = f2();
        ruo ruoVar = new ruo(ouoVarF2.f.incrementAndGet(), getInsureBetOddsData.betType);
        ouoVarF2.i.set(ruoVar);
        jvd0 jvd0Var = ouoVarF2.e;
        if (jvd0Var != null) {
            jvd0Var.cancel((CancellationException) null);
        }
        ouoVarF2.e = ej5.c(o8i0.d(ouoVarF2), ouoVarF2.b, null, new nuo(getInsureBetOddsData, ouoVarF2, ruoVar, null), 2);
    }

    public final boolean J2() {
        ArrayList arrayListU = N1().U();
        int size = arrayListU.size();
        int i3 = 0;
        while (i3 < size) {
            Object obj = arrayListU.get(i3);
            i3++;
            if (N1().Q1().contains(((Selection) obj).i())) {
                return true;
            }
        }
        return false;
    }

    public final void J3() {
        S1().W.postDelayed(new xi3(this, 0), 50L);
    }

    /* JADX WARN: Code duplicated, block: B:51:0x0111  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v13 */
    /* JADX WARN: Type inference failed for: r10v29 */
    /* JADX WARN: Type inference failed for: r10v30 */
    /* JADX WARN: Type inference failed for: r10v6 */
    /* JADX WARN: Type inference failed for: r10v7 */
    /* JADX WARN: Type inference failed for: r10v9, types: [com.sportybet.plugin.realsports.betslip.widget.BetslipActivity] */
    public final ng10 K1(UserAddress userAddress, BigDecimal bigDecimal) {
        BetslipActivity betslipActivity;
        ng10 ng10Var;
        int i3;
        int i4;
        LinkedHashSet linkedHashSet;
        String str;
        String str2;
        String str3;
        String str4;
        BigDecimal bigDecimal2;
        String str5;
        String str6;
        String str7 = AnalyticsParam.EVENT_PARAM_ID;
        JSONObject jSONObject = new JSONObject();
        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        try {
            ArrayList arrayListU = N1().U();
            boolean zIsEmpty = arrayListU.isEmpty();
            String str8 = MyLog.TAG_BET_SLIP;
            if (zIsEmpty) {
                itf0.a aVar = itf0.a;
                aVar.q(MyLog.TAG_BET_SLIP);
                aVar.d("No selections available for placing bet", new Object[0]);
                Throwable th = new Throwable("No selections available for placing bet");
                ArrayList arrayList = new ArrayList();
                try {
                    arrayList.add(new android.util.Pair("orderBetType", String.valueOf(Q1().G1())));
                } catch (Exception e3) {
                    itf0.a aVar2 = itf0.a;
                    aVar2.q(MyLog.TAG_BET_SLIP);
                    aVar2.e(e3);
                }
                w950.a("BetslipActivity", "generatePlaceBetBody", th, arrayList);
                return null;
            }
            f2();
            ouo.x1(arrayListU);
            o5p.a(jSONObject, userAddress);
            int iG1 = Q1().G1();
            ng10Var = null;
            if (Q1().G1() == 2) {
                try {
                    kvh kvhVar = this.G2;
                    if (kvhVar.a) {
                        BigDecimal bigDecimal3 = kvhVar.f;
                        if (bigDecimal3.compareTo(BigDecimal.ZERO) <= 0) {
                            bigDecimal3 = null;
                        }
                        if (bigDecimal3 != null) {
                            BigDecimal scale = bigDecimal3.setScale(2, RoundingMode.HALF_UP);
                            scale.getClass();
                            jSONObject.put("oddsKey", scale.toString());
                        }
                        iG1 = 4;
                    }
                } catch (Exception e4) {
                    e = e4;
                    betslipActivity = this;
                }
            }
            if (Q1().G1() == 2 && this.H2.a) {
                BigDecimal bigDecimal4 = this.G2.f;
                if (bigDecimal4.compareTo(BigDecimal.ZERO) <= 0) {
                    bigDecimal4 = null;
                }
                if (bigDecimal4 != null) {
                    BigDecimal scale2 = bigDecimal4.setScale(2, RoundingMode.HALF_UP);
                    scale2.getClass();
                    jSONObject.put("oddsKey", scale2.toString());
                }
                iG1 = 5;
            }
            if (Q1().G1() == 2) {
                nl0 nl0Var = this.I2;
                if (nl0Var.a) {
                    BigDecimal bigDecimal5 = nl0Var.b;
                    if (bigDecimal5.compareTo(BigDecimal.ZERO) <= 0) {
                        bigDecimal5 = null;
                    }
                    if (bigDecimal5 != null) {
                        jSONObject.put("oddsKey", bigDecimal5.toString());
                    }
                    i3 = 6;
                } else {
                    i3 = iG1;
                }
            } else {
                i3 = iG1;
            }
            if (N1().M() && Q1().G1() == 1 && this.N1 && this.O1 > 0) {
                jSONObject.put("oddsBoost", this.M1);
            }
            if (Q1().G1() == 1 || Q1().G1() == 2 || Q1().G1() == 3) {
                jSONObject.put("paymentType", 0);
            } else {
                jSONObject.put("paymentType", 1);
            }
            String strB = getCountryManager().B();
            if (strB.length() > 0) {
                jSONObject.put("currency", strB);
            }
            jSONObject.put("isBonusFactor", Q1().G1() != 1 && nh4.c().k);
            jSONObject.put("bizType", 1);
            jSONObject.put("operId", 1);
            jSONObject.put("actualPayAmount", R1().s(this.f2));
            if (N1().Z()) {
                jSONObject.put("isMultiMaker", true);
                jSONObject.put("multiMakerType", N1().d0().a);
            }
            g08 g08VarJ = N1().J();
            if (g08VarJ != null) {
                jSONObject.put("codeSource", g08VarJ.a);
            } else {
                String str9 = this.q1;
                if (str9 != null) {
                    jSONObject.put("codeSource", g08.valueOf(str9).a);
                }
            }
            bew bewVarC = g2().c();
            if (bewVarC != null) {
                itf0.a aVar3 = itf0.a;
                aVar3.q(MyLog.TAG_LIABILITY_CHECK);
                aVar3.g("multiMakerActionAccordingToLiabilityCheckEventRecord=%s", bewVarC.toString());
                i4 = bewVarC.a;
            } else {
                itf0.a aVar4 = itf0.a;
                aVar4.q(MyLog.TAG_LIABILITY_CHECK);
                aVar4.g("multiMakerActionAccordingToLiabilityCheckEventRecord=null", new Object[0]);
                i4 = this.t1;
            }
            jSONObject.put("multiMakerAction", i4);
            jSONObject.put("codeProvider", this.r1);
            String strD0 = N1().D0();
            String str10 = this.s1;
            if (str10 != null && str10.length() != 0) {
                strD0 = this.s1;
            }
            if (strD0 != null && strD0.length() != 0) {
                jSONObject.put("loadingShareCode", strD0);
            }
            JSONObject jSONObject2 = new JSONObject();
            JSONArray jSONArray = new JSONArray();
            HashSet hashSet = new HashSet();
            AliasBookingCode aliasBookingCodeF0 = R1().f0();
            if (aliasBookingCodeF0 != null) {
                hashSet.addAll(aliasBookingCodeF0.getSelections());
            }
            int size = arrayListU.size();
            int i5 = i3;
            int i6 = 0;
            int i7 = 0;
            while (i6 < size) {
                try {
                    i6++;
                    size = size;
                    Selection selection = (Selection) arrayListU.get(i6);
                    arrayListU = arrayListU;
                    try {
                        hashSet.remove(selection.a.eventId + selection.b + selection.c.id);
                    } catch (Exception e5) {
                        itf0.a aVar5 = itf0.a;
                        aVar5.q(MyLog.TAG_BET_SLIP);
                        aVar5.e(e5);
                    }
                    if (Q1().G1() != 1 || t2().a(selection)) {
                        if (qz3.b(selection)) {
                            int i8 = i7 + 1;
                            JSONObject jSONObject3 = new JSONObject();
                            jSONObject3.put(AnalyticsParam.EVENT_PARAM_PAGE_VIEW_EVENT_ID, selection.a.eventId);
                            jSONObject3.put(str7, selection.j());
                            jSONObject3.put("odds", selection.c.odds);
                            if (Q1().G1() == 3) {
                                jSONObject3.put("banker", O1().K(selection.a));
                            }
                            jSONObject3.put("probability", String.valueOf(selection.c.probability));
                            jSONObject3.put("isRelatedBet", selection.e == k980.RELATED_BET);
                            if (selection.q()) {
                                JSONObject jSONObject4 = new JSONObject();
                                jSONObject4.put("odds", selection.c.odds);
                                jSONObject4.put("probability", selection.c.probability);
                                jSONObject3.put("joker", jSONObject4);
                            }
                            if (selection.p()) {
                                JSONArray jSONArray2 = new JSONArray();
                                for (Iterator<Selection> it = selection.d.iterator(); it.hasNext(); it = it) {
                                    Selection next = it.next();
                                    JSONObject jSONObject5 = new JSONObject();
                                    jSONObject5.put(AnalyticsParam.EVENT_PARAM_PAGE_VIEW_EVENT_ID, next.a.eventId);
                                    jSONObject5.put(str7, next.j());
                                    jSONObject5.put("odds", next.c.odds);
                                    jSONObject5.put("probability", String.valueOf(next.c.probability));
                                    jSONArray2.put(jSONObject5);
                                    str7 = str7;
                                }
                                str6 = str7;
                                jSONObject3.put("betBuilderSelections", jSONArray2);
                                jSONObject3.put("betBuilder", true);
                            } else {
                                str6 = str7;
                            }
                            List<PreCannedBBOutcome> list = selection.c.childOutcomes;
                            if (list != null && !list.isEmpty()) {
                                JSONArray jSONArray3 = new JSONArray();
                                for (Iterator<PreCannedBBOutcome> it2 = selection.c.childOutcomes.iterator(); it2.hasNext(); it2 = it2) {
                                    PreCannedBBOutcome next2 = it2.next();
                                    JSONObject jSONObject6 = new JSONObject();
                                    jSONObject6.put("marketId", next2.getMarketId());
                                    jSONObject6.put("marketName", next2.getMarketName());
                                    jSONObject6.put("outcomeId", next2.getOutcomeId());
                                    jSONObject6.put("outcomeDesc", next2.getOutcomeDesc());
                                    jSONObject6.put("specifiers", next2.getSpecifier());
                                    jSONArray3.put(jSONObject6);
                                }
                                jSONObject3.put("childOutcomes", jSONArray3);
                            }
                            if (Q1().G1() == 1 && N1().M() && ((Boolean) N1().l1().getOrDefault(selection, Boolean.FALSE)).booleanValue()) {
                                jSONObject3.put("lobBoost", true);
                            }
                            if (!S2() && ((Boolean) N1().A0().getOrDefault(selection, Boolean.FALSE)).booleanValue()) {
                                jSONObject3.put("lfbBoost", true);
                            }
                            jSONArray.put(jSONObject3);
                            linkedHashSet2.add(selection.k());
                            str7 = str6;
                            i7 = i8;
                        }
                    }
                } catch (Exception e6) {
                    e = e6;
                    betslipActivity = this;
                }
            }
            ArrayList arrayList2 = arrayListU;
            AliasBookingCode aliasBookingCodeF1 = R1().f0();
            if (aliasBookingCodeF1 != null) {
                if (aliasBookingCodeF1.getAliasCode().length() > 0 && !aliasBookingCodeF1.getSelections().isEmpty() && hashSet.isEmpty()) {
                    jSONObject.put("codeAlias", aliasBookingCodeF1.getAliasCode());
                }
                Unit unit = Unit.a;
            }
            int i9 = (i7 == 1 || O1().s().values().size() == 1) ? 1 : i5;
            jSONObject.put("orderType", i9);
            jSONObject2.put("selections", jSONArray);
            JSONArray jSONArray4 = new JSONArray();
            JSONArray jSONArray5 = new JSONArray();
            JSONArray jSONArray6 = new JSONArray();
            JSONObject jSONObject7 = new JSONObject();
            ?? r10 = 4;
            try {
                if (i9 == 4) {
                    BetslipActivity betslipActivity2 = this;
                    jSONArray6.put(betslipActivity2.G2.b);
                    jSONObject7.put("flexibleMinWinnings", jSONArray6);
                    jSONObject7.put("totalOdds", betslipActivity2.G2.c.toString());
                    r10 = betslipActivity2;
                } else if (i9 != 6) {
                    r10 = this;
                } else {
                    jSONArray6.put(1);
                    jSONObject7.put("flexibleMinWinnings", jSONArray6);
                    BetslipActivity betslipActivity3 = this;
                    jSONObject7.put("totalOdds", betslipActivity3.I2.c.toString());
                    r10 = betslipActivity3;
                }
                if (r10.Q1().G1() == 1) {
                    int size2 = arrayList2.size();
                    int i10 = 0;
                    int i11 = 0;
                    while (i11 < size2) {
                        arrayList2 = arrayList2;
                        Object obj = arrayList2.get(i11);
                        int i12 = i11 + 1;
                        Selection selection2 = (Selection) obj;
                        if (r10.t2().a(selection2) && (str5 = (String) r10.R1().B().get(selection2)) != null && str5.length() != 0) {
                            long jS = r10.R1().s(str5);
                            JSONObject jSONObject8 = new JSONObject();
                            JSONArray jSONArray7 = new JSONArray();
                            JSONObject jSONObject9 = new JSONObject();
                            JSONArray jSONArray8 = new JSONArray();
                            jSONArray7.put(1);
                            jSONObject8.put("selectedSystems", jSONArray7);
                            jSONObject8.put("stake", new JSONObject().put("value", jS));
                            jSONObject9.put("selectionIndex", i10);
                            jSONArray8.put(jSONObject9);
                            jSONObject8.put("selectionRefs", jSONArray8);
                            i10++;
                            jSONArray4.put(jSONObject8);
                        }
                        size2 = size2;
                        i11 = i12;
                        linkedHashSet2 = linkedHashSet2;
                        str8 = str8;
                    }
                    linkedHashSet = linkedHashSet2;
                    str = str8;
                    Unit unit2 = Unit.a;
                } else {
                    linkedHashSet = linkedHashSet2;
                    str = MyLog.TAG_BET_SLIP;
                    if (r10.Q1().G1() == 2) {
                        if (i9 == 1) {
                            jSONArray5.put(1);
                        } else if (r10.O1().v()) {
                            jSONArray5.put(r10.O1().s().values().size());
                        } else {
                            jSONArray5.put(i7);
                        }
                        lrm lrmVarR1 = r10.R1();
                        String str11 = r10.R1().d0().a;
                        str11.getClass();
                        long jS2 = lrmVarR1.s(str11);
                        jSONObject7.put("selectedSystems", jSONArray5);
                        jSONObject7.put("stake", new JSONObject().put("value", jS2));
                        jSONArray4.put(jSONObject7);
                    } else {
                        r10.R1().p();
                        for (Map.Entry entry : r10.R1().u().entrySet()) {
                            JSONArray jSONArray9 = new JSONArray();
                            JSONObject jSONObject10 = new JSONObject();
                            String str12 = (String) entry.getKey();
                            imn imnVar = (imn) entry.getValue();
                            if (imnVar != null && (str2 = imnVar.a) != null && str2.length() != 0 && !Intrinsics.g(ln7.a(), str12)) {
                                String str13 = imnVar.a;
                                for (ln7 ln7Var : r10.R1().U()) {
                                    if (Intrinsics.g(ln7Var.b, str12)) {
                                        jSONArray9.put(ln7Var.a);
                                        break;
                                    }
                                }
                                jSONObject10.put("selectedSystems", jSONArray9);
                                JSONObject jSONObject11 = new JSONObject();
                                lrm lrmVarR2 = r10.R1();
                                str13.getClass();
                                jSONObject10.put("stake", jSONObject11.put("value", lrmVarR2.s(str13)));
                                jSONArray4.put(jSONObject10);
                            }
                        }
                        Unit unit3 = Unit.a;
                    }
                }
                jSONObject2.put("bets", jSONArray4);
                jSONObject.put("ticket", jSONObject2);
                if (i9 != 4 && i9 != 6) {
                    if (r10.O1().I() && r10.P1().a()) {
                        bigDecimal2 = bigDecimal;
                        if (bigDecimal2.compareTo(BigDecimal.ZERO) > 0) {
                            BigDecimal bigDecimalMultiply = bigDecimal2.multiply(BigDecimal.valueOf(10000L));
                            bigDecimalMultiply.getClass();
                            JSONObject jSONObject12 = new JSONObject();
                            jSONObject12.put("bonusPlanId", nh4.c().b);
                            jSONObject12.put("bonusAmount", bigDecimalMultiply);
                            jSONObject12.put("version", 1);
                            jSONObject.put("bonus", jSONObject12);
                        }
                    } else {
                        bigDecimal2 = bigDecimal;
                    }
                    r10.Q1().M1(bigDecimal2);
                }
                if (r10.d2().h(r10.Q1().G1(), Integer.valueOf(i9)) && (str3 = r10.y2().d) != null && str3.length() != 0 && (str4 = r10.y2().c) != null && str4.length() != 0 && !r10.H2.a) {
                    jj7 jj7VarX1 = r10.e2().x1(jSONObject);
                    if (jj7VarX1.a) {
                        r10.C3(AnalyticsEvent.BETSLIP_GIFT_STAKE_EQUALS_PAY, kpu.f(wxm.a("pay", jj7VarX1.b), wxm.a("stake", jj7VarX1.c), wxm.a("order_type", String.valueOf(r10.Q1().G1())), wxm.a("gift_id", String.valueOf(r10.y2().d))));
                        Unit unit4 = Unit.a;
                    } else {
                        JSONObject jSONObject13 = new JSONObject();
                        JSONArray jSONArray10 = new JSONArray();
                        JSONObject jSONObject14 = new JSONObject();
                        jSONObject14.put("giftId", r10.y2().d);
                        jSONArray10.put(jSONObject14);
                        jSONObject13.put("favorInfo", jSONArray10);
                        jSONObject.put("favor", jSONObject13);
                    }
                }
                if (i9 == 5) {
                    JSONObject jSONObject15 = new JSONObject();
                    jSONObject15.put("cutbetWinningAmount", r10.H2.f);
                    jSONObject15.put("allWinningAmount", r10.H2.b);
                    jSONObject15.put("type", 2);
                    bqy.a aVar6 = r10.m1.b;
                    if (aVar6 == null ? false : aVar6.b) {
                        jSONObject15.put("isCustom", true);
                        cqy cqyVar = r10.H2;
                        cqyVar.getClass();
                        jSONObject15.put("cutbetPct", new BigDecimal(cqyVar.e).divide(new BigDecimal("100"), 2, RoundingMode.HALF_UP));
                    } else {
                        jSONObject15.put("isCustom", false);
                    }
                    jSONObject.put(SimulateBetConsts.BetslipType.CUTBET, jSONObject15);
                }
                jSONObject.put("userClickBetTimeMillis", System.currentTimeMillis());
                r10.Q1().O1(new v03.p(r10.Q1().E1()));
                itf0.a aVar7 = itf0.a;
                aVar7.q(str);
                aVar7.a(jSONObject.toString(), new Object[0]);
                String string = jSONObject.toString();
                string.getClass();
                return new ng10(string, linkedHashSet);
            } catch (Exception e7) {
                e = e7;
                betslipActivity = r10;
            }
        } catch (Exception e8) {
            e = e8;
            betslipActivity = this;
            ng10Var = null;
        }
        betslipActivity.f3(e);
        return ng10Var;
    }

    public final void K2() {
        if (Z2()) {
            S1().K.setVisibility(8);
            HashSet<com.sportybet.plugin.realsports.betslip.widget.f.a> hashSet = com.sportybet.plugin.realsports.betslip.widget.f.a;
            com.sportybet.plugin.realsports.betslip.widget.f.b(com.sportybet.plugin.realsports.betslip.widget.f.a.b);
        }
        if (c3()) {
            S1().J.setVisibility(8);
            HashSet<com.sportybet.plugin.realsports.betslip.widget.f.a> hashSet2 = com.sportybet.plugin.realsports.betslip.widget.f.a;
            com.sportybet.plugin.realsports.betslip.widget.f.b(com.sportybet.plugin.realsports.betslip.widget.f.a.c);
        }
        if (d3()) {
            S1().L.setVisibility(8);
            HashSet<com.sportybet.plugin.realsports.betslip.widget.f.a> hashSet3 = com.sportybet.plugin.realsports.betslip.widget.f.a;
            com.sportybet.plugin.realsports.betslip.widget.f.b(com.sportybet.plugin.realsports.betslip.widget.f.a.d);
        }
    }

    public final void K3() {
        s4(true, false);
        this.s2 = 0L;
        this.V1 = false;
        this.q2 = false;
        S1().E.setRemoveAllBtnEnabled(true);
        S1().L.setVisibility(8);
        com.sportybet.plugin.realsports.betslip.widget.f.b.clear();
        com.sportybet.plugin.realsports.betslip.widget.f.a.clear();
    }

    public final uy0 L1() {
        uy0 uy0Var = this.O;
        if (uy0Var != null) {
            return uy0Var;
        }
        Intrinsics.n("assetsInfoRepository");
        throw null;
    }

    public final void L2() {
        S1().X.setVisibility(8);
    }

    public final void L3(boolean z2) {
        v2().E = z2;
        i2().E = z2;
        i2().E = z2;
    }

    public final hu2 M1() {
        return (hu2) this.n1.getValue();
    }

    public final void M2(boolean z2) {
        if (z2) {
            return;
        }
        S1().V.a.setVisibility(8);
        S1().J.setVisibility(8);
    }

    public final void M3(AssetsInfo assetsInfo) {
        SelectedGiftData selectedGiftData;
        if (getAccountHelper().getAccount() == null) {
            return;
        }
        if (assetsInfo == null) {
            S1().E.setBetSlipCashText(getCMSString(R.string.app_common__no_cash, new Object[0]));
        } else if (assetsInfo.balance != 0) {
            S1().E.setBetSlipCashText(this.u1 + " " + bjb0.U(assetsInfo.balance, Locale.US));
        } else {
            S1().E.setBetSlipCashText(this.u1 + " " + assetsInfo.balance);
        }
        if (assetsInfo != null && assetsInfo.balance >= 0) {
            this.D2 = true;
            e2().F1(false);
            return;
        }
        this.D2 = false;
        if (N1().m0()) {
            so3 so3Var = this.p1;
            if (so3Var != null) {
                so3Var.c(false);
            }
            if (y2().i || ((selectedGiftData = y2().C) != null && selectedGiftData.getChecked())) {
                String string = Q1().H1(Q1().G1()).toString();
                string.getClass();
                z(string, false);
            }
        }
    }

    public final jrm N1() {
        jrm jrmVar = this.d;
        if (jrmVar != null) {
            return jrmVar;
        }
        Intrinsics.n("betItem");
        throw null;
    }

    public final void N2() {
        S1().N.setVisibility(8);
        Q1().h1(ss90.b.a);
    }

    public final void N3() {
        boolean zM0 = N1().m0();
        Resources resources = getResources();
        S1().E.setBetSlipNumberTextColor(zM0 ? resources.getColor(R.color.background_type2_primary) : resources.getColor(R.color.text_type2_primary));
        S1().E.setBetSlipNumberBackground(getDrawable(zM0 ? R.drawable.bg_filled_sim_theme_primary_circle_24dp : R.drawable.spr_shape_bg_green_circle_24dp));
        if (zM0) {
            return;
        }
        if (N1().U().isEmpty() || iw2.a() == 0) {
            S1().E.setBetSlipNumberBackground(getDrawable(R.drawable.spr_shape_bg_grey_circle_24dp));
            S1().E.setBetSlipNumberTextColor(getColor(R.color.text_type2_secondary));
        }
    }

    public final krm O1() {
        krm krmVar = this.w;
        if (krmVar != null) {
            return krmVar;
        }
        Intrinsics.n("betMutexData");
        throw null;
    }

    public final void O2() {
        Object bVar;
        g08 g08Var;
        boolean z2;
        if (this.w1) {
            return;
        }
        this.w1 = true;
        Intent intent = getIntent();
        this.q1 = intent.getStringExtra("action_load_booking_code_from");
        Q1().Y1(this.q1);
        int i3 = 0;
        this.r1 = intent.getIntExtra("code_provider", 0);
        this.t1 = intent.getIntExtra("multi_maker_code_action", 0);
        this.s1 = intent.getStringExtra("share_code");
        int intExtra = intent.getIntExtra("extra_booking_code_order_type", -1);
        if (!N1().m0() && intExtra != -1) {
            q73 q73VarQ1 = Q1();
            wwd0 wwd0Var = q73VarQ1.x0;
            tb00.c cVar = new tb00.c(intExtra);
            wwd0Var.getClass();
            wwd0Var.k(null, cVar);
            q73VarQ1.U1();
        }
        String str = this.q1;
        if (str != null) {
            try {
                zi50.a aVar = zi50.b;
                bVar = g08.valueOf(str);
            } catch (Throwable th) {
                zi50.a aVar2 = zi50.b;
                bVar = new zi50.b(th);
            }
            if (bVar instanceof zi50.b) {
                bVar = null;
            }
            g08Var = (g08) bVar;
        } else {
            g08Var = null;
        }
        g3(g08Var);
        h3(this.q1, intent.getStringExtra("extra_booking_code_combine_selection"));
        String stringExtra = intent.getStringExtra("extra_remix_share_code");
        if (stringExtra != null && stringExtra.length() != 0) {
            rws.y1(h2(), stringExtra, null, lws.b, 14);
        }
        ((br3) mmc.a(hp0.A, br3.class)).U().f(false);
        F1();
        R1().h();
        this.X1 = false;
        this.W1 = false;
        this.Z1 = null;
        v2().b = -1;
        i2().b = -1;
        V1().b = -1;
        this.h2 = 1L;
        getAccountHelper().addAccountChangeListener(this);
        N1().b1();
        ArrayList arrayListU = N1().U();
        int size = arrayListU.size();
        int i4 = 0;
        while (i4 < size) {
            Object obj = arrayListU.get(i4);
            i4++;
            Selection selection = (Selection) obj;
            jrm jrmVarN1 = N1();
            String str2 = selection.c.odds;
            str2.getClass();
            jrmVarN1.T(selection, str2);
        }
        q73 q73VarQ2 = Q1();
        q73VarQ2.N.e1(q73VarQ2.j1);
        this.G2.b = O1().w();
        findViewById(R.id.banker_help).setOnClickListener(new View.OnClickListener() { // from class: gh3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Set<g08> set = BetslipActivity.X2;
                this.a.k4(-1001, null);
            }
        });
        ToggleButton toggleButton = (ToggleButton) findViewById(R.id.banker_switch);
        toggleButton.setChecked(R1().J());
        toggleButton.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: rh3
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z3) {
                Set<g08> set = BetslipActivity.X2;
                BetslipActivity betslipActivity = this.a;
                if (z3) {
                    betslipActivity.R1().l(true);
                } else {
                    betslipActivity.R1().l(false);
                    betslipActivity.O1().d();
                }
                betslipActivity.w4(true, true);
            }
        });
        h4(false);
        S1().S.setLayoutManager(new LinearLayoutManager() { // from class: com.sportybet.plugin.realsports.betslip.widget.BetslipActivity$initRecyclerView$1
            @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.o
            public final View i0(View view, int i5, RecyclerView.u uVar, RecyclerView.z zVar) {
                uVar.getClass();
                zVar.getClass();
                View view2 = null;
                try {
                    View viewI0 = super.i0(view, i5, uVar, zVar);
                    if (viewI0 != null) {
                        try {
                            if (!viewI0.hasFocusable()) {
                                return null;
                            }
                        } catch (Exception e3) {
                            e = e3;
                            view2 = viewI0;
                            e.printStackTrace();
                            return view2;
                        }
                    }
                    return viewI0;
                } catch (Exception e4) {
                    e = e4;
                }
            }

            @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.o
            public final void t0(RecyclerView.u uVar, RecyclerView.z zVar) {
                try {
                    super.t0(uVar, zVar);
                } catch (Exception e3) {
                    e3.printStackTrace();
                    wsm wsmVar = this.T.H;
                    if (wsmVar != null) {
                        wsmVar.g("onLayoutChildren in betslip page", "", e3, null);
                    } else {
                        Intrinsics.n("crashlyticsHelper");
                        throw null;
                    }
                }
            }
        });
        S1().S.k(new dj3(this));
        b63 b63Var = this.o1;
        xf3 xf3Var = new xf3(this, i3);
        b63Var.getClass();
        b63Var.b = xf3Var;
        y8k y8kVar = this.z;
        if (y8kVar == null) {
            Intrinsics.n("getMinStakeUseCase");
            throw null;
        }
        p8k p8kVarZ1 = Z1();
        b63Var.c = y8kVar;
        b63Var.d = p8kVarZ1;
        S1().S.setAdapter(b63Var);
        S1().S.i(new cq3(this, new yf3(this)));
        S1().S.setOnClickListener(this);
        S1().S.setItemAnimator(null);
        new androidx.recyclerview.widget.r(new q53(this, this, getDrawable(R.drawable.ic_delete_bucket))).j(S1().S);
        int iE = qq1.e(T1(), BOConfigParam.SimCutStatus, SimOneCutStatus.DISABLED_ALL.getValue());
        BetTypeFlexiBetConfig betTypeFlexiBetConfig = this.J2;
        boolean z3 = betTypeFlexiBetConfig != null && betTypeFlexiBetConfig.getStatus() == 1;
        bqy.a aVar3 = this.m1.b;
        boolean z4 = ((aVar3 == null ? 2 : aVar3.a) == 1 && !N1().m0()) || (iE == SimOneCutStatus.ACCESS_WITHOUT_LIVE.getValue() && N1().m0());
        BetTypeAnyWinConfig betTypeAnyWinConfig = this.K2;
        boolean z5 = betTypeAnyWinConfig != null && betTypeAnyWinConfig.getStatus() == 1;
        if (N1().p() && z3 && z4 && z5 && (R1().M() || R1().o() || R1().A())) {
            this.O2 = false;
            this.P2 = false;
            m4(R.string.component_betslip__sporty_insure_is_unavailable_for_live_events);
        }
        this.D1 = N1().H0();
        this.F1 = X2();
        this.G1 = N1().E1();
        if (getAccountHelper().getAccount() != null) {
            this.D1 = vn20.c("user_accept_change", getAccountHelper().getUserId(), false);
            this.G1 = vn20.c("suspend_event_change", getAccountHelper().getUserId(), false);
        }
        S1().E.setOnBetSettingsClick(new Function0() { // from class: pi3
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Set<g08> set = BetslipActivity.X2;
                this.a.r3();
                return Unit.a;
            }
        });
        getFullStoryCommonManager().c(S1().E.getBetSlipTypeDropdown(), AnalyticsParam.BETSLIP_STANDARD_SIMPLE_SWITCH);
        S1().E.setOnBetSlipTypeChanged(new ci3(this, i3));
        S1().E.setInsureSelected(new Function0() { // from class: ni3
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Set<g08> set = BetslipActivity.X2;
                BetslipActivity betslipActivity = this.a;
                boolean z6 = false;
                if (betslipActivity.R1().o() || betslipActivity.R1().M() || betslipActivity.R1().A()) {
                    betslipActivity.p4(Snackbar.h(betslipActivity.S1().a, betslipActivity.getCMSString(R.string.component_betslip__switch_simple_mode_unavailable, new Object[0]), 0));
                    z6 = true;
                }
                return Boolean.valueOf(z6);
            }
        });
        S1().E.setOnAutoBetClick(new yi3(this, i3));
        S1().E.setOnRemoveAllClick(new Function0() { // from class: ue3
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Set<g08> set = BetslipActivity.X2;
                q73 q73VarQ3 = this.a.Q1();
                ej5.c(o8i0.d(q73VarQ3), null, null, new c83(q73VarQ3, null), 3);
                return Unit.a;
            }
        });
        S1().P.w.setOnClickListener(this);
        View viewFindViewById = findViewById(R.id.compose_view);
        viewFindViewById.getClass();
        nnf nnfVar = new nnf((ComposeView) viewFindViewById);
        this.l2 = nnfVar;
        nnfVar.c = new cj3(this);
        S1().E.setOnLoginClick(new ff3(this, i3));
        S1().E.setOnRegisterClick(new gf3(this, i3));
        S1().E.setOnSinglesClick(new hf3(this, i3));
        S1().E.setOnMultipleClick(new if3(this, i3));
        S1().E.setOnSystemClick(new jf3(this, 0));
        S1().P.f.setOnClickListener(this);
        S1().P.z.setOnClickListener(this);
        S1().P.b.setOnClickListener(this);
        S1().P.d.setOnClickListener(this);
        if (N1().M()) {
            T3(1000L, false);
        }
        S1().y.setOnClickListener(this);
        ema emaVar = this.d1;
        SimShareData simShareData = SimShareData.INSTANCE;
        zd2<Integer> autoBetTimesSubject = simShareData.getAutoBetTimesSubject();
        dk3 dk3Var = new dk3(this);
        autoBetTimesSubject.a(dk3Var);
        emaVar.b(dk3Var);
        zd2<Integer> autoBetTimesSubject2 = simShareData.getAutoBetTimesSubject();
        zd2<String> zd2Var = this.h1;
        final oe3 oe3Var = new oe3();
        ucy ucyVarB = ucy.b(autoBetTimesSubject2, zd2Var, new k54() { // from class: pe3
            @Override // defpackage.k54
            public final Object apply(Object obj2, Object obj3) {
                Set<g08> set = BetslipActivity.X2;
                obj2.getClass();
                obj3.getClass();
                return (Pair) oe3Var.invoke(obj2, obj3);
            }
        });
        ek3 ek3Var = new ek3(this);
        ucyVarB.a(ek3Var);
        emaVar.b(ek3Var);
        x3();
        B4(true);
        if (getAccountHelper().getAccount() != null) {
            E4();
        }
        if (intent.getBooleanExtra("extra_trigger_auto_bet_create", false)) {
            u4();
        }
        so3 so3Var = this.p1;
        if (so3Var != null) {
            so3Var.a.l(Q1().c1, this);
        }
        com.sportybet.plugin.realsports.betslip.widget.f.b.clear();
        com.sportybet.plugin.realsports.betslip.widget.f.a.clear();
        S1().E.setOnSimDescContainerClick(new Function0() { // from class: wf3
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Set<g08> set = BetslipActivity.X2;
                f.b.clear();
                f.a.clear();
                f.a(f.a.b);
                BetslipActivity betslipActivity = this.a;
                betslipActivity.S1().L.setVisibility(8);
                betslipActivity.N2();
                betslipActivity.S1().J.setVisibility(8);
                betslipActivity.S1().V.a.setVisibility(8);
                betslipActivity.S1().K.setVisibility(0);
                if (!betslipActivity.N1().U().isEmpty()) {
                    betslipActivity.S1().E.setRemoveAllBtnEnabled(betslipActivity.S1().K.getVisibility() == 8);
                }
                return Unit.a;
            }
        });
        S1().E.setOnSimBetHistoryContainerClick(new kf3(this, i3));
        S1().E.setBetHistoryButtonEnabled(getAccountHelper().isLogin(), getAccountHelper().isLogin());
        if (N1().E()) {
            if (getAccountHelper().isLogin()) {
                S1().E.setSimBetHistoryHintVisible(true);
            } else {
                S1().E.setSimBetHistoryHintVisible(false);
                N1().J0(false);
            }
        }
        P2();
        ShimmerFrameLayout shimmerFrameLayout = S1().E.F.C.c;
        com.facebook.shimmer.a.C0188a c0188aD = new com.facebook.shimmer.a.C0188a().g(2000L).e(0).f(0.3f).d(0.0f);
        c0188aD.a.q = PorterDuff.Mode.SCREEN;
        com.facebook.shimmer.a.C0188a c0188aH = c0188aD.h(1.0f);
        c0188aH.a.m = -20.0f;
        shimmerFrameLayout.b(c0188aH.a());
        s4(N1().m0(), false);
        if (Q1().G1() == 3 || Q1().G1() == 2) {
            nh4.c().j.f(this, new lfy() { // from class: qh3
                @Override // defpackage.lfy
                public final void u1(Object obj2) {
                    Set<g08> set = BetslipActivity.X2;
                    BetslipActivity betslipActivity = this.a;
                    betslipActivity.U1().f(betslipActivity.Q1().G1(), betslipActivity.O1().I(), betslipActivity.P1().a(), betslipActivity.N1().m0() ? betslipActivity.N1().U().size() : betslipActivity.O1().s().size(), betslipActivity.r2, false);
                    betslipActivity.N1().B();
                    betslipActivity.w4(true, true);
                }
            });
        }
        S1().Z.setOnRefreshListener(this);
        S1().i.setOnTabClickListener(new i());
        S1().i.setSwipeBetClickListener(new j());
        S1().i.setUiActionListener(new k());
        S1().i.setRecommendedCodeHeaderToggleListener(new l());
        S1().i.setRecommendedCodeUiActionListener(new m());
        if (!N1().U().isEmpty()) {
            S1().i.setVisibility(8);
            S1().i.L();
            m2(false);
            if (getAccountHelper().isLogin()) {
                e2().F1(false);
            }
            if (N1().O0()) {
                ArrayList arrayListU2 = N1().U();
                if (arrayListU2 != null && arrayListU2.isEmpty()) {
                    k2().F1(guy.a);
                    break;
                }
                int size2 = arrayListU2.size();
                int i5 = 0;
                while (true) {
                    if (i5 >= size2) {
                        k2().F1(guy.a);
                        break;
                    }
                    Object obj2 = arrayListU2.get(i5);
                    i5++;
                    if (rlc.b((Selection) obj2)) {
                        if (!arrayListU2.isEmpty()) {
                            int size3 = arrayListU2.size();
                            int i6 = 0;
                            while (true) {
                                if (i6 >= size3) {
                                    z2 = false;
                                    break;
                                }
                                Object obj3 = arrayListU2.get(i6);
                                i6++;
                                if (rlc.d((Selection) obj3)) {
                                    z2 = true;
                                    break;
                                }
                            }
                        } else {
                            z2 = false;
                            break;
                        }
                        ((xlc) this.O0.getValue()).z1(new ulc.b(nkf.a, z2 ? pkf.a : pkf.b), k00.d, k00.c);
                        break;
                    }
                }
            }
            if (N1().I()) {
                ((ijf) this.N0.getValue()).A1("betslip", N1().h() ? AnalyticsParam.EVENT_STATUS_ON : AnalyticsParam.EVENT_STATUS_OFF);
            }
            if (N1().v1()) {
                ((bpx) this.P0.getValue()).b.a(new xjg0(new zox(nkf.a, N1().U0() ? pkf.a : pkf.b), ay0.S(new k00[]{k00.d, k00.c})));
            }
        }
        if (getCountryManager().r()) {
            w2().m(this);
        }
        w2().c();
        if (N1().D()) {
            View viewFindViewById2 = findViewById(R.id.betslip_label);
            viewFindViewById2.getClass();
            TextView textView = (TextView) viewFindViewById2;
            textView.setText(getCMSString(R.string.common_functions__edit_bet, new Object[0]));
            textView.setVisibility(0);
            so3 so3Var2 = this.p1;
            if (so3Var2 != null) {
                so3Var2.a.setEditBetStake(Q1().D1());
            }
            so3 so3Var3 = this.p1;
            if (so3Var3 != null) {
                so3Var3.b(false);
            }
            so3 so3Var4 = this.p1;
            if (so3Var4 != null) {
                so3Var4.c(false);
            }
        }
        Q2();
        if (!intent.getBooleanExtra("extra_quick_sim_bet", false) || this.A1) {
            return;
        }
        this.A1 = true;
        if (N1().U().isEmpty() || !N1().m0()) {
            return;
        }
        u3(intent.getIntExtra("extra_simulated_auto_bet_times", 1));
    }

    public final void O3() {
        FooterInfo footerInfo = new FooterInfo();
        footerInfo.setTaxConfig(Q1().c1);
        footerInfo.setBetType(Q1().G1());
        footerInfo.setPotentialWin(getCMSString(R.string.app_common__zero_point_zero, new Object[0]));
        footerInfo.setWHTax(getCMSString(R.string.app_common__zero_point_zero, new Object[0]));
        P3(false, false);
        v2().F = false;
        i2().F = false;
        V1().F = false;
        footerInfo.setGift(b2());
        footerInfo.setGiftChecked(y2().i);
        footerInfo.setExciseTax(W1(""));
        footerInfo.setExistBonus(O1().I());
        footerInfo.setBonusEnable(W2(Integer.valueOf(Q1().G1())));
        footerInfo.setBonusActivated(P1().a());
        BigDecimal bigDecimal = BigDecimal.ZERO;
        footerInfo.setBonus(bigDecimal);
        if (Q1().G1() == 1) {
            footerInfo.setBetTotalCount(N1().U().size());
            footerInfo.setExistBonus(false);
            footerInfo.setBonusEnable(false);
            footerInfo.setBonusActivated(false);
            footerInfo.setSingleTotalStake(getCMSString(R.string.app_common__zero, new Object[0]));
        } else if (Q1().G1() == 2) {
            bigDecimal.getClass();
            BetSlipInfo betSlipInfoG1 = G1(bigDecimal, bigDecimal);
            footerInfo.setPotentialWin(betSlipInfoG1.getNetWin());
            footerInfo.setWHTax(betSlipInfoG1.getWhTax());
            footerInfo.setMultipleTotalOdds(betSlipInfoG1.getTotalOdds());
            footerInfo.setMultipleMinScaled(betSlipInfoG1.getMinScaled());
            footerInfo.setMaxPW(betSlipInfoG1.getMaxPW());
            footerInfo.setStake(betSlipInfoG1.getStake());
            footerInfo.setMinScaled(betSlipInfoG1.getMinScaled());
            footerInfo.setMaxScaled(betSlipInfoG1.getMaxScaled());
            footerInfo.setMultipleTotalStake(getCMSString(R.string.app_common__zero, new Object[0]));
        }
        so3 so3Var = this.p1;
        if (so3Var != null) {
            so3Var.a.H(footerInfo, this.h2, Q1().J1(), q2().y.getValue() instanceof vwv.c);
        }
        I1(false);
    }

    @Override // defpackage.to3
    public final void P() {
        o2g o2gVar = o2g.a;
        o2gVar.getClass();
        C3(AnalyticsEvent.MORE_INSURE_BETSLIP_CLICK, o2gVar);
        so3 so3Var = this.p1;
        if (so3Var != null) {
            so3Var.d(vuo.d(this.J2, O1()), vuo.f(T1(), this.m1, O1()), vuo.a(this.K2, this.L2, R1()), vuo.c(this.M2, N1()), x2().d(), Q1().J1());
        }
    }

    public final h53 P1() {
        h53 h53Var = this.a0;
        if (h53Var != null) {
            return h53Var;
        }
        Intrinsics.n("betSlipMarketingDomainService");
        throw null;
    }

    public final void P2() {
        boolean zIsSimulatedActive = SimShareData.INSTANCE.isSimulatedActive();
        boolean z2 = Q1().C1.d() == q43.c;
        View viewFindViewById = findViewById(R.id.real2sim_switch);
        View viewFindViewById2 = findViewById(R.id.real2sim_switch_container);
        View viewFindViewById3 = findViewById(R.id.betslip_label);
        viewFindViewById.setVisibility((!zIsSimulatedActive || z2 || N1().D()) ? 4 : 0);
        viewFindViewById3.setVisibility(N1().K0() == k53.EDIT ? 0 : 4);
        if (zIsSimulatedActive) {
            viewFindViewById2.setOnClickListener(this);
        } else {
            S1().E.setSimDescAndGamesContainerVisible(false);
        }
    }

    public final q73 Q1() {
        return (q73) this.H0.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void Q2() {
        S1().E.setDisplayTypeMenuVisibility(iw2.g(), (q43) Q1().C1.d());
        S1().E.setRemoveContainerVisibility((q43) Q1().C1.d());
        View viewFindViewById = findViewById(R.id.real2sim_switch);
        k53 k53VarC = iu2.c();
        k53VarC.getClass();
        k53 k53Var = k53.REAL;
        k53 k53Var2 = k53.SIM;
        viewFindViewById.setVisibility((kotlin.collections.b.k(k53Var, k53Var2).contains(k53VarC) && SimShareData.INSTANCE.isSimulatedActive() && !N1().D()) ? 0 : 8);
        BetSlipHeader betSlipHeader = S1().E;
        boolean zJ1 = Q1().J1();
        boolean zIsLogin = getAccountHelper().isLogin();
        ogd0 ogd0Var = betSlipHeader.F;
        TextView textView = ogd0Var.v;
        k53 k53VarC2 = iu2.c();
        k53VarC2.getClass();
        textView.setVisibility((kotlin.collections.b.k(k53Var, k53Var2).contains(k53VarC2) && zIsLogin) ? 0 : 8);
        TextView textView2 = ogd0Var.i;
        k53 k53VarC3 = iu2.c();
        k53VarC3.getClass();
        k53 k53Var3 = k53.EDIT;
        textView2.setVisibility((kotlin.collections.a.c(k53Var3).contains(k53VarC3) && zIsLogin) ? 0 : 8);
        ogd0Var.N.setVisibility(zJ1 ? false : iw2.c() ? 0 : 8);
        Button button = S1().P.d;
        k53 k53VarC4 = iu2.c();
        k53VarC4.getClass();
        button.setVisibility(kotlin.collections.a.c(k53Var3).contains(k53VarC4) ? 0 : 8);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void Q3() {
        Q1().Q1(2);
        R1().q(Q1().G1());
        e2().F1(false);
        r4(false, false);
        if (this.N1) {
            S1().E.setSinglesCompoundDrawable(null, null, gr0.a(this, R.drawable.ic_odds_boost_dark), null);
        }
        U3(Q1().G1());
        h4(false);
        S1().E.setDisplayTypeMenuVisibility(iw2.g(), (q43) Q1().C1.d());
        imn imnVarE = M1().e();
        if (!this.C1) {
            imnVarE.a = H3(imnVarE.a, y2().C);
        }
        R3(true, imnVarE);
    }

    @Override // defpackage.to3
    public final void R(boolean z2) {
        ((u53) this.I0.getValue()).b.a(Boolean.valueOf(z2));
    }

    public final lrm R1() {
        lrm lrmVar = this.b;
        if (lrmVar != null) {
            return lrmVar;
        }
        Intrinsics.n("betStore");
        throw null;
    }

    public final void R2() {
        ruo ruoVar = f2().i.get();
        if (ruoVar != null && ruoVar.b == 6) {
            ouo ouoVarF2 = f2();
            ouoVarF2.f.incrementAndGet();
            ouoVarF2.i.set(null);
            jvd0 jvd0Var = ouoVarF2.e;
            if (jvd0Var != null) {
                jvd0Var.cancel((CancellationException) null);
            }
            ouoVarF2.e = null;
        }
        nl0 nl0Var = this.I2;
        nl0Var.a = false;
        BigDecimal bigDecimal = BigDecimal.ZERO;
        bigDecimal.getClass();
        bigDecimal.getClass();
        nl0Var.c = bigDecimal;
        nl0Var.b = bigDecimal;
    }

    public final void R3(boolean z2, imn imnVar) {
        boolean zD;
        I4();
        itf0.a aVar = itf0.a;
        aVar.q(MyLog.TAG_COMMON);
        aVar.g("[Multiple Footer] obj =%s", imnVar.a);
        so3 so3Var = this.p1;
        if (so3Var != null) {
            so3Var.a.setInitMultiple(z2, imnVar);
        }
        so3 so3Var2 = this.p1;
        if (so3Var2 != null) {
            zD = so3Var2.a.d(Q1().G1(), imnVar);
        } else {
            zD = false;
        }
        P3(false, false);
        so3 so3Var3 = this.p1;
        if (so3Var3 != null) {
            so3Var3.a(Q1().G1(), new imn(0L, imnVar.a.toString(), pk2.a(this, imnVar.a.toString())));
        }
        aVar.q(MyLog.TAG_COMMON);
        aVar.g("[Multiple Footer] enablePB =%s", Boolean.valueOf(zD));
        C4(true, false);
        I1(zD);
        so3 so3Var4 = this.p1;
        if (so3Var4 != null) {
            so3Var4.a.setGiftsSelected(y2().i);
        }
        y3();
        if (kni0.l()) {
            Q1().d1 = false;
        }
    }

    @Override // defpackage.to3
    public final void S(boolean z2) {
        f5k f5kVar = this.n0;
        if (f5kVar == null) {
            Intrinsics.n("getCurrentEarlyGoalSelectionsForRequestOutcomeUseCase");
            throw null;
        }
        ArrayList arrayListA = f5kVar.a(z2);
        wnh wnhVar = this.o0;
        if (wnhVar == null) {
            Intrinsics.n("findDuplicatedEarlyGoalSelectionsUseCase");
            throw null;
        }
        List listA = wnhVar.a(arrayListA, z2);
        vnh vnhVar = this.p0;
        if (vnhVar == null) {
            Intrinsics.n("findCurrentDuplicatedEarlyGoalSelectionsUseCase");
            throw null;
        }
        List<Selection> listA2 = vnhVar.a();
        if (listA.isEmpty() && listA2.isEmpty()) {
            A2(z2);
        } else {
            j4(new p(listA, listA2, this, z2));
        }
    }

    public final xfd0 S1() {
        xfd0 xfd0Var = this.F0;
        if (xfd0Var != null) {
            return xfd0Var;
        }
        Intrinsics.n("_binding");
        throw null;
    }

    public final boolean S2() {
        if (Q1().G1() == 2) {
            return Y2() || b3() || T2();
        }
        return false;
    }

    public final void S3(boolean z2) {
        S1().P.z.setEnabled(z2);
        if (z2) {
            S1().P.z.setTextColor(getColor(R.color.black));
            S1().P.z.setBackgroundColor(getColor(R.color.sim_theme_primary));
        } else {
            S1().P.z.setTextColor(getColor(R.color.text_disable_type1_primary));
            S1().P.z.setBackgroundColor(getColor(R.color.brand_secondary_disable));
        }
    }

    @Override // nzm.a
    public final void T() {
        B4(true);
    }

    public final lq1 T1() {
        lq1 lq1Var = this.J;
        if (lq1Var != null) {
            return lq1Var;
        }
        Intrinsics.n("boConfigSource");
        throw null;
    }

    public final boolean T2() {
        so3 so3Var = this.p1;
        return so3Var != null && so3Var.a.G.U.isChecked() && vuo.a(this.K2, this.L2, R1()) == luo.c;
    }

    public final RotateAnimation T3(long j3, boolean z2) {
        RotateAnimation rotateAnimation = new RotateAnimation(0.0f, 90.0f, 1, 1.0f, 1, 0.8f);
        if (z2) {
            rotateAnimation = new RotateAnimation(90.0f, 0.0f, 1, 1.0f, 1, 0.8f);
        }
        rotateAnimation.setFillAfter(true);
        rotateAnimation.setDuration(j3);
        rotateAnimation.setInterpolator(new LinearInterpolator());
        S1().Y.startAnimation(rotateAnimation);
        return rotateAnimation;
    }

    public final dx4 U1() {
        return (dx4) this.G0.getValue();
    }

    public final boolean U2() {
        so3 so3Var;
        return R1().A() || ((so3Var = this.p1) != null && so3Var.a.G.U.isChecked());
    }

    public final void U3(int i3) {
        S1().E.setSelectTab(i3);
        so3 so3Var = this.p1;
        if (so3Var != null) {
            so3Var.a.setBetTypeFooterVisibility(i3, false);
        }
    }

    public final up3 V1() {
        up3 up3Var = this.Y;
        if (up3Var != null) {
            return up3Var;
        }
        Intrinsics.n("defaultNoUseGiftState");
        throw null;
    }

    public final boolean V2() {
        boolean z2 = !this.D1 || this.E1;
        return (z2 && N1().f0()) ? this.F1 : z2;
    }

    public final void V3(boolean z2) {
        if (z2) {
            androidx.constraintlayout.widget.b bVar = new androidx.constraintlayout.widget.b();
            bVar.f(S1().O);
            bVar.e(R.id.bs_header_parent, 4);
            bVar.g(R.id.bs_header_parent, 3, R.id.multi_guideline, 4);
            bVar.y(0.1f);
            bVar.b(S1().O);
        }
    }

    public final String W1(String str) {
        so3 so3Var;
        if (N1().U().isEmpty()) {
            return "--";
        }
        if (O1().C() == 0) {
            return "- -";
        }
        String strA = fu5.a(",", str, "");
        if (strA.length() == 0 || TextUtils.equals(strA, "0.00")) {
            return "0.00";
        }
        double d3 = 0.0d;
        if (d2().h(Q1().G1(), Integer.valueOf(Y1())) && (so3Var = this.p1) != null && !so3Var.a.n()) {
            double d4 = Double.parseDouble(strA);
            String str2 = y2().c;
            double d5 = d4 - (str2 != null ? Double.parseDouble(str2) : 0.0d);
            if (d5 >= 0.0d) {
                d3 = d5;
            }
        } else if (!N1().u0()) {
            d3 = Double.parseDouble(strA);
        }
        BigDecimal bigDecimal = new BigDecimal(String.valueOf(d3));
        BigDecimal exciseTax = Q1().c1.getExciseTax(N1().m0(), bigDecimal);
        itf0.a aVar = itf0.a;
        aVar.q(MyLog.TAG_TAX);
        aVar.g(lx5.a("[showExciseTaxAndPlaceBet] totalSake=", bigDecimal.toPlainString(), ", exciseTax=", exciseTax.toPlainString()), new Object[0]);
        return bjb0.L(exciseTax, Locale.US);
    }

    public final boolean W2(Integer num) {
        if (num.intValue() != 3) {
            if (num.intValue() != 2) {
                return false;
            }
            so3 so3Var = this.p1;
            if (so3Var != null && so3Var.a.m()) {
                return false;
            }
            so3 so3Var2 = this.p1;
            if (so3Var2 != null && so3Var2.a.n()) {
                return false;
            }
            so3 so3Var3 = this.p1;
            if (so3Var3 != null && so3Var3.a.G.U.isChecked()) {
                return false;
            }
        }
        return true;
    }

    public final void W3(boolean z2) {
        if (z2) {
            S1().P.w.setEnabled(false);
            S1().P.i.setVisibility(0);
            S1().P.w.setVisibility(8);
        } else {
            S1().P.i.setVisibility(8);
            S1().P.w.setVisibility(0);
            S1().P.w.setEnabled(true);
        }
    }

    public final tch X1() {
        return (tch) this.U0.getValue();
    }

    public final boolean X2() {
        if (this.G1) {
            return false;
        }
        return N1().F1();
    }

    public final void X3(boolean z2) {
        boolean zM0 = N1().m0();
        findViewById(R.id.layout_sim_empty).setVisibility(N1().m0() && z2 ? 0 : 8);
        S1().P.z.setVisibility(zM0 ? 0 : 8);
        S1().P.f.setVisibility(zM0 ? 8 : 0);
        so3 so3Var = this.p1;
        if (so3Var != null) {
            so3Var.a.setBetTypeFooterVisibility(Q1().G1(), zM0);
        }
        S1().G.setVisibility(8);
        S1().E.setRemoveAllBtnEnabled(false);
        S1().i.setHideRouterContainer();
    }

    public final int Y1() {
        int iG1 = Q1().G1();
        if (iG1 == 2) {
            if (this.G2.a) {
                return 4;
            }
            if (this.H2.a) {
                return 5;
            }
            if (this.I2.a) {
                return 6;
            }
        }
        return iG1;
    }

    public final boolean Y2() {
        so3 so3Var = this.p1;
        return so3Var != null && so3Var.a.m() && vuo.d(this.J2, O1()) == luo.c;
    }

    public final void Y3(boolean z2, imn imnVar) {
        String strL;
        so3 so3Var;
        if (getCountryManager().r() && imnVar != null) {
            R1().i(new imn(0L, imnVar.a.toString(), pk2.a(this, imnVar.a.toString())));
        }
        ArrayList arrayListU = N1().U();
        int size = arrayListU.size();
        int i3 = 0;
        while (i3 < size) {
            Object obj = arrayListU.get(i3);
            i3++;
            Selection selection = (Selection) obj;
            if (R1().B().containsKey(selection)) {
                R1().O(selection, (String) R1().B().get(selection));
            }
        }
        I4();
        FooterInfo footerInfo = new FooterInfo();
        footerInfo.setBetType(Q1().G1());
        footerInfo.setBetTotalCount(N1().U().size());
        footerInfo.setExistBonus(false);
        footerInfo.setBonusActivated(false);
        footerInfo.setBonusEnable(false);
        footerInfo.setBonus(BigDecimal.ZERO);
        footerInfo.setTaxConfig(Q1().c1);
        ArrayList arrayListU2 = N1().U();
        int size2 = arrayListU2.size();
        int i4 = 0;
        int i5 = 0;
        while (i5 < size2) {
            Object obj2 = arrayListU2.get(i5);
            i5++;
            if (qz3.b((Selection) obj2)) {
                i4++;
            }
        }
        footerInfo.setCanBetStatusCount(i4);
        String cMSString = getCMSString(R.string.app_common__zero, new Object[0]);
        if (imnVar == null || i4 == 0) {
            O3();
            return;
        }
        if (z2) {
            hu2 hu2VarM1 = M1();
            nzm nzmVar = hu2VarM1.g;
            lrm lrmVar = hu2VarM1.a;
            ArrayList arrayList = (ArrayList) iu2.d();
            int size3 = arrayList.size();
            int i6 = 0;
            String str = "";
            while (i6 < size3) {
                Object obj3 = arrayList.get(i6);
                i6++;
                Selection selection2 = (Selection) obj3;
                if (!lrmVar.B().containsKey(selection2)) {
                    if (lrmVar.H() == null || TextUtils.isEmpty(imnVar.a)) {
                        ynh ynhVar = hu2VarM1.f;
                        ConcurrentHashMap concurrentHashMapB = lrmVar.B();
                        ynhVar.getClass();
                        String strA = ynh.a(selection2, concurrentHashMapB);
                        if (strA == null) {
                            strA = nzmVar.j();
                        }
                        lrmVar.O(selection2, strA);
                    } else {
                        lrmVar.O(selection2, !TextUtils.isEmpty(lrmVar.e0().a) ? lrmVar.e0().a : nzmVar.j());
                    }
                }
                str = TextUtils.isEmpty(str) ? (String) lrmVar.B().get(selection2) : str;
            }
            lrmVar.c0(null);
            it90 it90VarU2 = u2();
            List<Selection> listA0 = CollectionsKt.A0(it90VarU2.c.U());
            Map mapL = kpu.l(it90VarU2.d.B());
            ArrayList arrayList2 = new ArrayList();
            for (Selection selection3 : listA0) {
                String strA2 = !qz3.b(selection3) ? null : ynh.a(selection3, mapL);
                if (strA2 != null) {
                    arrayList2.add(strA2);
                }
            }
            if (!arrayList2.isEmpty() && CollectionsKt.A0(CollectionsKt.D0(arrayList2)).size() == 1 && (so3Var = this.p1) != null) {
                so3Var.a.setInitSingle(str);
            }
        }
        krm krmVarO1 = O1();
        boolean zM = N1().M();
        med medVar = this.E0;
        if (medVar == null) {
            Intrinsics.n("oddsBoostRatioForSelectionProvider");
            throw null;
        }
        lw2.b bVarJ = krmVarO1.J(zM, medVar);
        BigDecimal bigDecimal = bVarJ.b;
        krm krmVarO2 = O1();
        boolean zM2 = N1().M();
        BigDecimal bigDecimal2 = BigDecimal.ZERO;
        med medVar2 = this.E0;
        if (medVar2 == null) {
            Intrinsics.n("oddsBoostRatioForSelectionProvider");
            throw null;
        }
        lw2.b bVarF = krmVarO2.f(zM2, bigDecimal2, medVar2);
        BigDecimal bigDecimalMin = bVarF.b.min(a2().a());
        krm krmVarO3 = O1();
        boolean zM3 = N1().M();
        BigDecimal bigDecimal3 = nh4.c().a;
        med medVar3 = this.E0;
        if (medVar3 == null) {
            Intrinsics.n("oddsBoostRatioForSelectionProvider");
            throw null;
        }
        BigDecimal bigDecimalMin2 = krmVarO3.f(zM3, bigDecimal3, medVar3).b.min(a2().a());
        BigDecimal bigDecimalC = u2().c();
        P3(false, false);
        if (i4 == 1) {
            try {
                this.A2 = true;
                String string = bigDecimal.divide(bigDecimalC, 8, RoundingMode.HALF_UP).toString();
                string.getClass();
                this.w2 = string;
                this.x2 = "0";
            } catch (ArithmeticException unused) {
                this.w2 = "0";
                this.x2 = "0";
            }
        } else {
            this.A2 = false;
            this.w2 = "0";
            this.x2 = "0";
        }
        if (R1().B().isEmpty()) {
            strL = "0.00";
        } else {
            List<BigDecimal> listC = O1().c();
            listC.getClass();
            Iterator<T> it = listC.iterator();
            if (!it.hasNext()) {
                lrh0.a();
                return;
            }
            Comparable comparable = (Comparable) it.next();
            while (it.hasNext()) {
                Comparable comparable2 = (Comparable) it.next();
                if (comparable.compareTo(comparable2) < 0) {
                    comparable = comparable2;
                }
            }
            strL = bjb0.L((BigDecimal) comparable, Locale.US);
        }
        OrderBetType orderBetTypeFromValue = OrderBetType.INSTANCE.fromValue(Q1().G1());
        if (orderBetTypeFromValue == null) {
            orderBetTypeFromValue = OrderBetType.ALL;
        }
        q2().y1(new i53(orderBetTypeFromValue, Boolean.valueOf(y2().i), strL, N1().W()));
        String string2 = a2().a().toString();
        string2.getClass();
        this.z2 = string2;
        String string3 = a2().a().toString();
        string3.getClass();
        this.y2 = string3;
        if (R1().B().isEmpty() || bigDecimalC.compareTo(BigDecimal.ZERO) <= 0) {
            String str2 = imnVar.a;
            if (str2 == null || str2.length() == 0) {
                footerInfo.setPotentialWin(getCMSString(R.string.app_common__zero_point_zero, new Object[0]));
                footerInfo.setWHTax(getCMSString(R.string.app_common__zero_point_zero, new Object[0]));
            } else {
                BigDecimal bigDecimal4 = new BigDecimal(imnVar.a);
                String strL2 = kni0.l() ? "-" : bjb0.L(bigDecimal4.multiply(BigDecimal.valueOf(i4)), Locale.US);
                BigDecimal bigDecimalMin3 = bigDecimal4.multiply(O1().n().isEmpty() ? BigDecimal.ZERO : (BigDecimal) Collections.min(O1().n())).setScale(2, RoundingMode.HALF_UP).min(a2().a());
                hu2 hu2VarM2 = M1();
                BigDecimal bigDecimal5 = BigDecimal.ZERO;
                BigDecimal bigDecimalMin4 = hu2VarM2.a(bigDecimal4, bigDecimal5).min(a2().a());
                BigDecimal bigDecimalMin5 = M1().a(bigDecimal4, nh4.c().a).min(a2().a());
                hu2 hu2VarM3 = M1();
                boolean zI = O1().I();
                boolean zW2 = W2(Integer.valueOf(Q1().G1()));
                boolean zA = P1().a();
                CharSequence charSequenceB2 = b2();
                String strW1 = W1("");
                hu2VarM3.getClass();
                FooterInfo footerInfoK = hu2.k(zI, zW2, zA, bigDecimalMin5, charSequenceB2, strW1);
                footerInfo.setExistBonus(footerInfoK.isExistBonus());
                footerInfo.setBonusEnable(footerInfoK.isBonusEnable());
                footerInfo.setBonusActivated(footerInfoK.isBonusActivated());
                footerInfo.setBonus(footerInfoK.getBonus());
                Iterator<BigDecimal> it2 = M1().b.c().iterator();
                BigDecimal bigDecimalAdd = bigDecimal5;
                while (it2.hasNext()) {
                    if (it2.next().compareTo(bigDecimal5) >= 0) {
                        bigDecimalAdd = bigDecimalAdd.add(bigDecimal4);
                    }
                }
                BigDecimal bigDecimal6 = bigDecimalAdd;
                BetSlipInfo betSlipInfoJ = M1().j(Q1().c1, Boolean.valueOf(N1().m0()), bigDecimalMin3, bigDecimalMin4, footerInfo.getBonus(), bigDecimal4, bigDecimal6);
                footerInfo.setPotentialWin(betSlipInfoJ.getNetWin());
                footerInfo.setWHTax(betSlipInfoJ.getWhTax());
                footerInfo.setPtMin(bigDecimalMin3);
                footerInfo.setPtMax(bigDecimalMin4);
                footerInfo.setMinStake(bigDecimal4);
                footerInfo.setMaxStake(bigDecimal6);
                if (O1().P()) {
                    this.j2 = betSlipInfoJ.getMaxNetWin();
                    this.i2 = betSlipInfoJ.getMaxWHTax();
                } else {
                    this.j2 = betSlipInfoJ.getMaxWHTax();
                }
                cMSString = strL2;
            }
        } else {
            hu2 hu2VarM4 = M1();
            boolean zI2 = O1().I();
            boolean zW3 = W2(Integer.valueOf(Q1().G1()));
            boolean zA2 = P1().a();
            CharSequence charSequenceB3 = b2();
            String strW2 = W1("");
            hu2VarM4.getClass();
            FooterInfo footerInfoK2 = hu2.k(zI2, zW3, zA2, bigDecimalMin2, charSequenceB3, strW2);
            footerInfo.setExistBonus(footerInfoK2.isExistBonus());
            footerInfo.setBonusEnable(footerInfoK2.isBonusEnable());
            footerInfo.setBonusActivated(footerInfoK2.isBonusActivated());
            footerInfo.setBonus(footerInfoK2.getBonus());
            BetSlipInfo betSlipInfoJ2 = M1().j(Q1().c1, Boolean.valueOf(N1().m0()), bigDecimal, bigDecimalMin, footerInfo.getBonus(), bVarJ.a, bVarF.a);
            footerInfo.setPotentialWin(betSlipInfoJ2.getNetWin());
            footerInfo.setWHTax(betSlipInfoJ2.getWhTax());
            footerInfo.setPtMin(bigDecimal);
            footerInfo.setPtMax(bigDecimalMin);
            footerInfo.setMinStake(bVarJ.a);
            footerInfo.setMaxStake(bVarF.a);
            if (kni0.l()) {
                footerInfo.setPotentialWin("-");
                cMSString = "-";
            } else {
                cMSString = bjb0.L(bigDecimalC, Locale.US);
            }
            if (O1().P()) {
                this.j2 = betSlipInfoJ2.getMaxNetWin();
                this.i2 = betSlipInfoJ2.getMaxWHTax();
            } else {
                this.j2 = betSlipInfoJ2.getMaxWHTax();
            }
            so3 so3Var2 = this.p1;
            if (so3Var2 != null) {
                int iG1 = Q1().G1();
                String string4 = bigDecimalC.toString();
                String string5 = bigDecimalC.toString();
                string5.getClass();
                so3Var2.a(iG1, new imn(0L, string4, pk2.a(this, string5)));
            }
        }
        footerInfo.setGift(c2(cMSString));
        footerInfo.setGiftChecked(y2().i);
        footerInfo.setSingleTotalStake(cMSString);
        footerInfo.setExciseTax(W1(cMSString));
        if (bigDecimalC.compareTo(BigDecimal.ZERO) <= 0) {
            footerInfo.setExciseTax(W1(cMSString));
        }
        so3 so3Var3 = this.p1;
        if (so3Var3 != null) {
            so3Var3.a.H(footerInfo, this.h2, Q1().J1(), q2().y.getValue() instanceof vwv.c);
        }
        I1(u2().d());
        y3();
    }

    public final p8k Z1() {
        p8k p8kVar = this.A;
        if (p8kVar != null) {
            return p8kVar;
        }
        Intrinsics.n("getMaxStakeUseCase");
        throw null;
    }

    public final boolean Z2() {
        return S1().K.getVisibility() == 0;
    }

    public final void Z3() {
        if (iw2.b()) {
            Q1().Q1(2);
            return;
        }
        Q1().Q1(1);
        R1().q(Q1().G1());
        if (this.N1) {
            S1().E.setSinglesCompoundDrawable(null, null, gr0.a(this, R.drawable.ic_odds_boost), null);
            r4(true, true);
        } else {
            r4(false, true);
        }
        this.G2.a = false;
        this.H2.a = false;
        this.I2.a = false;
        so3 so3Var = this.p1;
        if (so3Var != null) {
            so3Var.b(d2().j(Q1().G1(), Y1()) && this.D2);
        }
        U3(Q1().G1());
        h4(false);
        Y3(true, R1().e0());
        b4();
        U1().c(new mqc());
        if (N1().m0()) {
            return;
        }
        e2().F1(false);
    }

    public final q8k a2() {
        q8k q8kVar = this.B;
        if (q8kVar != null) {
            return q8kVar;
        }
        Intrinsics.n("getMaxWinUseCase");
        throw null;
    }

    public final boolean a3(String str) {
        return str == null || str.length() == 0 || TextUtils.equals(str, "0.00") || pk2.a(this, str).length() > 0;
    }

    public final void a4(SelectedGiftData selectedGiftData, SelectedGiftData selectedGiftData2, boolean z2) {
        long j3;
        if ((y2().e == 3 && d2().e(Q1().G1())) || (z2 && Q1().G1() == 1)) {
            String string = y2().H;
            if (string == null || string.length() == 0) {
                String str = this.E2;
                if (str == null || str.length() == 0) {
                    string = Q1().H1(Q1().G1()).toString();
                    if (string.length() == 0) {
                        string = "0";
                    }
                } else {
                    string = this.E2;
                    this.E2 = "";
                }
            } else {
                y2().H = "";
                y2().v = false;
            }
            boolean z3 = y2().v;
            String str2 = y2().c;
            String strB3 = B3(string);
            String strB4 = B3(str2);
            Stream stream = N1().U().stream();
            final ag3 ag3Var = new ag3();
            long jCount = stream.filter(new Predicate() { // from class: bg3
                @Override // java.util.function.Predicate
                public final boolean test(Object obj) {
                    Set<g08> set = BetslipActivity.X2;
                    return ((Boolean) ag3Var.invoke(obj)).booleanValue();
                }
            }).count();
            if (!z2 || Q1().G1() != 1 || jCount <= 1) {
                j3 = 0;
                if (z2 && Q1().G1() == 1 && jCount == 0) {
                    R1().i(null);
                    R1().S();
                    v2().b(null);
                    return;
                }
            } else {
                if (Intrinsics.g(selectedGiftData, selectedGiftData2)) {
                    return;
                }
                try {
                    BigDecimal bigDecimal = new BigDecimal(strB3);
                    BigDecimal bigDecimal2 = new BigDecimal(jCount);
                    BigDecimal bigDecimal3 = new BigDecimal(selectedGiftData.getTotalStake());
                    BigDecimal bigDecimal4 = new BigDecimal(selectedGiftData.getGiftValue());
                    BigDecimal bigDecimal5 = new BigDecimal(R1().e0().a);
                    BigDecimal bigDecimalDivide = bigDecimal.divide(bigDecimal2, RoundingMode.HALF_UP);
                    j3 = 0;
                    try {
                        BigDecimal bigDecimalMultiply = bigDecimal3.multiply(bigDecimal2);
                        BigDecimal bigDecimalAdd = bigDecimal.add(bigDecimal4);
                        BigDecimal bigDecimalMultiply2 = bigDecimal5.multiply(bigDecimal2);
                        itf0.a aVar = itf0.a;
                        aVar.q(MyLog.TAG_BET_SLIP);
                        aVar.a("totalStakeBD: %s", bigDecimal);
                        if (bigDecimalDivide.compareTo(bigDecimal3) == 0) {
                            aVar.q(MyLog.TAG_BET_SLIP);
                            aVar.a("scenarioResult_1", new Object[0]);
                            strB3 = B3(bigDecimalDivide.toString());
                        } else if (bigDecimalAdd.compareTo(bigDecimalMultiply) == 0) {
                            aVar.q(MyLog.TAG_BET_SLIP);
                            aVar.a("scenarioResult_2", new Object[0]);
                            strB3 = B3(bigDecimal3.toString());
                        } else if (bigDecimalMultiply2.compareTo(bigDecimal) == 0) {
                            aVar.q(MyLog.TAG_BET_SLIP);
                            aVar.a("scenarioResult_3", new Object[0]);
                            strB3 = B3(bigDecimal3.toString());
                        }
                    } catch (Exception e3) {
                        e = e3;
                        itf0.a aVar2 = itf0.a;
                        aVar2.q(MyLog.TAG_BET_SLIP);
                        aVar2.a("setStakeForFreeBetGift temp exception: %s", e.getMessage());
                    }
                } catch (Exception e4) {
                    e = e4;
                    j3 = 0;
                }
            }
            if (strB3 != null && strB3.length() != 0 && strB4 != null && strB4.length() != 0 && !strB4.equals(GiftUtil.CLEARED_GIFT_VALUE)) {
                itf0.a aVar3 = itf0.a;
                aVar3.q(MyLog.TAG_BET_SLIP);
                aVar3.a("before cal gift total: %s", strB3);
                aVar3.q(MyLog.TAG_BET_SLIP);
                aVar3.a("before cal gift isNew: %s", Boolean.valueOf(z3));
                aVar3.q(MyLog.TAG_BET_SLIP);
                aVar3.a("before cal gift newSelectedGiftData: %s", selectedGiftData);
                aVar3.q(MyLog.TAG_BET_SLIP);
                aVar3.a("before cal gift oldSelectedGiftData: %s", selectedGiftData2);
                try {
                    yyk yykVarE2 = e2();
                    selectedGiftData.getClass();
                    zik zikVar = yykVarE2.y;
                    BigDecimal bigDecimal6 = new BigDecimal(strB3);
                    zikVar.getClass();
                    ajk.a aVarA = zik.a(bigDecimal6, selectedGiftData, selectedGiftData2, z3);
                    BigDecimal bigDecimal7 = aVarA.b;
                    BigDecimal bigDecimal8 = aVarA.a;
                    if (!z2 && aVarA.c != y2().E) {
                        boolean z4 = y2().E;
                        boolean z5 = aVarA.d;
                        a4(new SelectedGiftData(bigDecimal7.toString(), selectedGiftData.getGiftKind(), selectedGiftData.getGiftId(), selectedGiftData.getGiftLimit(), selectedGiftData.getGiftCount(), selectedGiftData.getRawGift(), z5, z4, selectedGiftData.getUserSelect(), bigDecimal8.toString()), new SelectedGiftData(bigDecimal7.toString(), selectedGiftData.getGiftKind(), selectedGiftData.getGiftId(), selectedGiftData.getGiftLimit(), selectedGiftData.getGiftCount(), selectedGiftData.getRawGift(), z5, selectedGiftData.getChecked(), selectedGiftData.getUserSelect(), bigDecimal8.toString()), false);
                        return;
                    }
                    y2().D = null;
                    aVar3.q(MyLog.TAG_BET_SLIP);
                    aVar3.a("after cal gift state: %s", aVarA);
                    if (aVarA.e) {
                        y2().G++;
                    }
                    if (this.B2.length() == 0) {
                        String string2 = bigDecimal8.toString();
                        string2.getClass();
                        this.B2 = string2;
                    }
                    boolean z6 = aVarA.d;
                    String string3 = bigDecimal8.toString();
                    String string4 = bigDecimal7.toString();
                    string4.getClass();
                    imn imnVar = new imn(j3, string3, pk2.a(this, string4));
                    y2().b(new SelectedGiftData(bigDecimal7.toString(), selectedGiftData.getGiftKind(), selectedGiftData.getGiftId(), selectedGiftData.getGiftLimit(), selectedGiftData.getGiftCount(), selectedGiftData.getRawGift(), z6, selectedGiftData.getChecked(), selectedGiftData.getUserSelect(), bigDecimal8.toString()));
                    if (Q1().G1() == 1) {
                        String string5 = bigDecimal8.toString();
                        R1().i(imnVar);
                        R1().S();
                        R1().Q(null);
                        ArrayList arrayListU = N1().U();
                        int size = arrayListU.size();
                        int i3 = 0;
                        while (i3 < size) {
                            Object obj = arrayListU.get(i3);
                            i3++;
                            R1().O((Selection) obj, string5);
                        }
                        Y3(false, imnVar);
                        Q1().P0.a(a53.b.a);
                    } else if (Q1().G1() == 2) {
                        R1().L(imnVar);
                        R3(false, imnVar);
                    }
                    if (y2().G > 0) {
                        y2().G = 0;
                        Snackbar snackbarH = Snackbar.h(S1().a, getCMSString(R.string.component_coupon__gift_value_can_not_be_higher_than_total_stake, new Object[0]), 0);
                        p4(snackbarH);
                        l2().c(AnalyticsEvent.BETSLIP_GIFT_HIGHER_SNACKBAR_VIEW, null, null);
                        y8j fullStoryCommonManager = getFullStoryCommonManager();
                        BaseTransientBottomBar.SnackbarBaseLayout snackbarBaseLayout = snackbarH.i;
                        snackbarBaseLayout.getClass();
                        fullStoryCommonManager.c(snackbarBaseLayout, AnalyticsEvent.BETSLIP_GIFT_HIGHER_SNACKBAR);
                    }
                } catch (Exception e5) {
                    itf0.a aVar4 = itf0.a;
                    aVar4.q(MyLog.TAG_BET_SLIP);
                    aVar4.p(e5, "Error in calculateStakeWithGift", new Object[0]);
                    return;
                }
            }
            y2().v = false;
        }
    }

    public final CharSequence b2() {
        hu2 hu2VarM1 = M1();
        up3 up3VarY2 = y2();
        String string = Q1().H1(Q1().G1()).toString();
        boolean zH = d2().h(Q1().G1(), Integer.valueOf(Y1()));
        hu2VarM1.getClass();
        UiText uiTextG = hu2.g(up3VarY2, string, zH);
        if (uiTextG != null) {
            return uiTextG.e(this);
        }
        return null;
    }

    public final boolean b3() {
        so3 so3Var = this.p1;
        return so3Var != null && so3Var.a.n() && vuo.f(T1(), this.m1, O1()) == luo.c;
    }

    public final void b4() {
        if (qz3.g()) {
            S1().E.setStrikeThruFlag();
            if (Q1().G1() == 1) {
                R1().q(1);
            }
        }
    }

    @Override // defpackage.to3
    public final void c0() {
        luo luoVarD = vuo.d(this.J2, O1());
        luo luoVar = luo.c;
        if (luoVarD == luoVar && R1().o()) {
            C4(true, false);
        }
        lq1 lq1VarT1 = T1();
        krm krmVarO1 = O1();
        bqy bqyVar = this.m1;
        if (vuo.f(lq1VarT1, bqyVar, krmVarO1) == luoVar && R1().M()) {
            hu2 hu2VarM1 = M1();
            TaxConfig taxConfigO2 = o2();
            cqy cqyVar = this.H2;
            BigDecimal bigDecimalB = hu2VarM1.b(taxConfigO2, c.a(cqyVar.f), N1().m0());
            so3 so3Var = this.p1;
            if (so3Var != null) {
                so3Var.a.I(vuo.f(T1(), bqyVar, O1()), bjb0.L(bigDecimalB.multiply(new BigDecimal(S1().D.getSimCurrentAutoTimes())), Locale.US), cqyVar.d);
            }
        }
    }

    public final CharSequence c2(String str) {
        hu2 hu2VarM1 = M1();
        up3 up3VarY2 = y2();
        boolean zH = d2().h(Q1().G1(), Integer.valueOf(Y1()));
        hu2VarM1.getClass();
        UiText uiTextG = hu2.g(up3VarY2, str, zH);
        if (uiTextG != null) {
            return uiTextG.e(this);
        }
        return null;
    }

    public final boolean c3() {
        return S1().J.getVisibility() == 0;
    }

    public final void c4() {
        if (iw2.b()) {
            Q1().Q1(2);
            return;
        }
        Q1().Q1(3);
        R1().q(Q1().G1());
        boolean z2 = false;
        r4(false, false);
        if (this.N1) {
            S1().E.setSinglesCompoundDrawable(null, null, gr0.a(this, R.drawable.ic_odds_boost_dark), null);
        }
        this.G2.a = false;
        this.H2.a = false;
        this.I2.a = false;
        so3 so3Var = this.p1;
        if (so3Var != null) {
            if (d2().j(Q1().G1(), Y1()) && this.D2) {
                z2 = true;
            }
            so3Var.b(z2);
        }
        U3(Q1().G1());
        d4();
        b4();
    }

    @Override // defpackage.to3
    public final void d(int i3) {
        this.H2.e = i3;
        C4(true, true);
    }

    @Override // defpackage.to3
    public final void d1(String str) {
        BigDecimal flexibleMinOdds;
        BigDecimal flexibleMinOdds2;
        BetTypeAnyWinConfig betTypeAnyWinConfig;
        if (TextUtils.equals(str, "anywin")) {
            if (vuo.a(this.K2, this.L2, R1()) != luo.b || (betTypeAnyWinConfig = this.K2) == null) {
                return;
            }
            int minSelectionNum = betTypeAnyWinConfig.getMinSelectionNum();
            BetTypeAnyWinConfig betTypeAnyWinConfig2 = this.K2;
            p4(Snackbar.h(S1().a, getCMSString(R.string.component_betslip__any_win_error_hint, Integer.valueOf(minSelectionNum), Integer.valueOf(betTypeAnyWinConfig2 != null ? betTypeAnyWinConfig2.getMaxSelectionNum() : 0)), 0));
            return;
        }
        if (TextUtils.equals(str, "one_up")) {
            p4(Snackbar.h(S1().a, getCMSString(R.string.component_betslip__one_up_error_hint, new Object[0]), 0));
            return;
        }
        if (TextUtils.equals(str, "two_up")) {
            p4(Snackbar.h(S1().a, getCMSString(R.string.component_betslip__two_up_error_hint, new Object[0]), 0));
            return;
        }
        if (TextUtils.equals(str, "onecut")) {
            BetTypeFlexiBetConfig betTypeFlexiBetConfig = this.J2;
            if (betTypeFlexiBetConfig == null || (flexibleMinOdds2 = betTypeFlexiBetConfig.getFlexibleMinOdds()) == null) {
                flexibleMinOdds2 = BigDecimal.ZERO;
            }
            p4(Snackbar.h(S1().a, getCMSString(R.string.component_betslip__one_bet_cut_error_hint, flexibleMinOdds2), 0));
            return;
        }
        if (!TextUtils.equals(str, "flexibet")) {
            if (TextUtils.equals(str, "early_goals")) {
                p4(Snackbar.h(S1().a, getCMSString(R.string.component_betslip__early_goal_error_hint, new Object[0]), 0));
            }
        } else {
            BetTypeFlexiBetConfig betTypeFlexiBetConfig2 = this.J2;
            if (betTypeFlexiBetConfig2 == null || (flexibleMinOdds = betTypeFlexiBetConfig2.getFlexibleMinOdds()) == null) {
                flexibleMinOdds = BigDecimal.ZERO;
            }
            p4(Snackbar.h(S1().a, getCMSString(R.string.component_betslip__flexi_bet_error_hint, flexibleMinOdds), 0));
        }
    }

    public final vp3 d2() {
        vp3 vp3Var = this.v0;
        if (vp3Var != null) {
            return vp3Var;
        }
        Intrinsics.n("giftUseCases");
        throw null;
    }

    public final boolean d3() {
        return S1().L.getVisibility() == 0;
    }

    public final void d4() {
        itf0.a aVar = itf0.a;
        aVar.q(MyLog.TAG_COMMON);
        boolean z2 = false;
        aVar.g("setSystemFooter", new Object[0]);
        so3 so3Var = this.p1;
        if (so3Var != null) {
            so3Var.a.J(false);
        }
        O1().m();
        I4();
        boolean zI = O1().I();
        boolean zA = P1().a();
        boolean zW2 = W2(Integer.valueOf(Q1().G1()));
        FooterInfo footerInfo = new FooterInfo();
        footerInfo.setBetType(Q1().G1());
        footerInfo.setExistBonus(zI);
        footerInfo.setBonusEnable(zW2);
        footerInfo.setBonusActivated(zA);
        footerInfo.setTaxConfig(Q1().c1);
        BigDecimal bigDecimal = new BigDecimal("0.00");
        if (O1().q().values().isEmpty() || O1().C() == 0) {
            O3();
            return;
        }
        String strL = bjb0.L(BigDecimal.valueOf(R1().a()), Locale.US);
        footerInfo.setSystemTotalStake(strL);
        footerInfo.setExciseTax(W1(strL));
        P3(false, false);
        footerInfo.setGift(c2(strL));
        footerInfo.setGiftChecked(y2().i);
        if (zI) {
            footerInfo.setPotentialWin("--");
            footerInfo.setWHTax("--");
            footerInfo.setBonus(BigDecimal.ZERO);
            this.r2 = System.currentTimeMillis();
            aVar.q(MyLog.TAG_COMMON);
            aVar.g("[Bonus] ChuanGuanName size =%s", Integer.valueOf(R1().U().size()));
            U1().f(Q1().G1(), zI, zA, -1, this.r2, false);
        } else {
            footerInfo.setBonus(bigDecimal);
            BetSlipInfo betSlipInfoL = M1().l(Q1().c1.getRealSportTaxConfig(), bigDecimal);
            footerInfo.setPotentialWin(betSlipInfoL.getNetWin());
            footerInfo.setWHTax(betSlipInfoL.getWhTax());
            U1().c(new mqc());
        }
        OrderBetType orderBetTypeFromValue = OrderBetType.INSTANCE.fromValue(Q1().G1());
        if (orderBetTypeFromValue == null) {
            orderBetTypeFromValue = OrderBetType.ALL;
        }
        q2().y1(new i53(orderBetTypeFromValue, Boolean.valueOf(y2().i), O1().M().toString(), N1().W()));
        so3 so3Var2 = this.p1;
        if (so3Var2 != null) {
            so3Var2.a.H(footerInfo, this.h2, Q1().J1(), q2().y.getValue() instanceof vwv.c);
        }
        if (getCountryManager().r()) {
            R1().j(this);
        }
        so3 so3Var3 = this.p1;
        if (so3Var3 != null) {
            int iG1 = Q1().G1();
            cqe0 cqe0Var = this.u0;
            if (cqe0Var == null) {
                Intrinsics.n("systemBetUseCases");
                throw null;
            }
            so3Var3.a.setWarningAndInputUIStatus(iG1, "", cqe0Var.d().compareTo(cqe0Var.f.a()) > 0);
        }
        cqe0 cqe0Var2 = this.u0;
        if (cqe0Var2 == null) {
            Intrinsics.n("systemBetUseCases");
            throw null;
        }
        BigDecimal bigDecimalD = cqe0Var2.d();
        if (bigDecimalD.compareTo(cqe0Var2.e.a()) >= 0 && bigDecimalD.compareTo(cqe0Var2.f.a()) <= 0) {
            BigDecimal bigDecimalSubtract = bigDecimalD.subtract(cqe0Var2.c());
            bigDecimalSubtract.getClass();
            BigDecimal bigDecimalAdd = bigDecimalSubtract.add(cqe0Var2.a.a(bigDecimalSubtract));
            bigDecimalAdd.getClass();
            AssetsInfo assetsInfoC = cqe0Var2.b.c();
            BigDecimal bigDecimalB = assetsInfoC != null ? ty0.b(assetsInfoC) : null;
            if (bigDecimalB == null || bigDecimalAdd.compareTo(bigDecimalB) <= 0) {
                z2 = true;
            }
        }
        I1(z2);
    }

    @Override // defpackage.to3
    public final void e1(String str, String str2) {
        this.j2 = str2;
        this.i2 = str;
    }

    public final yyk e2() {
        return (yyk) this.X0.getValue();
    }

    public final boolean e3() {
        return S1().N.getVisibility() == 0;
    }

    public final void e4() {
        W3(false);
        q73 q73VarQ1 = Q1();
        zz80 zz80Var = new zz80(S1().D.getDisplayedPotentialWinnings(), S1().D.getDisplayedTotalOdds(), S1().D.getDisplayedBonus(), Q1().H1(Q1().G1()));
        ej5.c(o8i0.d(q73VarQ1), null, null, new h73(q73VarQ1, Y1(), zz80Var, null), 3);
    }

    @Override // defpackage.to3
    public final void f() {
        R1().Q(null);
        R1().v(null);
        Q1().P0.a(a53.b.a);
    }

    @Override // oaj0.a
    public final void f1() {
        M1().i.removeCallbacksAndMessages(null);
    }

    public final ouo f2() {
        return (ouo) this.V0.getValue();
    }

    public final void f3(Exception exc) {
        ArrayList arrayList = new ArrayList();
        try {
            arrayList.add(new android.util.Pair("orderBetType", String.valueOf(Q1().G1())));
        } catch (Exception e3) {
            itf0.a aVar = itf0.a;
            aVar.q(MyLog.TAG_BET_SLIP);
            aVar.e(e3);
        }
        try {
            arrayList.add(new android.util.Pair("selectionIds", new ArrayList(N1().U()).toString()));
        } catch (Exception e4) {
            itf0.a aVar2 = itf0.a;
            aVar2.q(MyLog.TAG_BET_SLIP);
            aVar2.e(e4);
        }
        w950.a("BetslipActivity", "generatePlaceBetBody", exc, arrayList);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean f4() {
        ej90 ej90Var;
        if (!this.D2 || b3() || SimShareData.INSTANCE.getAutoBetTimes() > 1 || (ej90Var = (ej90) s2().v.d()) == null || ej90Var.b == ipk.a) {
            return false;
        }
        return !ej90Var.c.isEmpty();
    }

    @Override // android.app.Activity
    public final void finish() {
        if (this.F0 != null) {
            S1().b.setBackground(getDrawable(R.drawable.betslip_bg_enter));
        }
        overridePendingTransition(R.anim.activity_slide_exit_bottom_without_change, R.anim.activity_slide_exit_bottom);
        super.finish();
    }

    @Override // defpackage.to3
    public final void g(String str) {
        str.getClass();
        itf0.a aVar = itf0.a;
        aVar.q(MyLog.TAG_COMMON);
        aVar.g("[onKeyClick] value =".concat(str), new Object[0]);
        if (".".equals(str) || str.length() == 0) {
            str = "0";
        }
        imn imnVar = new imn(0L, str, pk2.a(this, str));
        if (Q1().G1() == 1) {
            R1().i(imnVar);
            R1().S();
            R1().Q(null);
            String str2 = imnVar.a;
            ArrayList arrayListU = N1().U();
            int size = arrayListU.size();
            int i3 = 0;
            while (i3 < size) {
                Object obj = arrayListU.get(i3);
                i3++;
                R1().O((Selection) obj, str2);
            }
            Y3(false, imnVar);
            Q1().P0.a(a53.b.a);
        } else if (Q1().G1() == 2) {
            R1().L(imnVar);
            R3(false, imnVar);
        }
        R1().v(null);
        if (N1().m0() && str.length() > 0 && N1().Q() && !J2() && !N1().u0() && this.d2) {
            S3(true);
        }
        if (TextUtils.equals(str, "0")) {
            S3(false);
            so3 so3Var = this.p1;
            if (so3Var != null) {
                BetSlipFooter betSlipFooter = so3Var.a;
                betSlipFooter.t(false, true);
                betSlipFooter.setBonus(BigDecimal.ZERO);
            }
        }
        Q1().B1(str);
    }

    @Override // defpackage.to3
    public final void g1() {
        bsy bsyVarK2 = k2();
        muo muoVar = bsyVarK2.d;
        o2g o2gVar = o2g.a;
        o2gVar.getClass();
        muoVar.a(AnalyticsEvent.UP_VIEW_INSURE_MENU, o2gVar);
        itf0.a aVar = itf0.a;
        aVar.q(bsyVarK2.e);
        aVar.a("reportOneTwoUpInsureMenuViewed", new Object[0]);
    }

    public final o8s g2() {
        o8s o8sVar = this.w0;
        if (o8sVar != null) {
            return o8sVar;
        }
        Intrinsics.n("liabilityCheckUseCases");
        throw null;
    }

    public final void g3(g08 g08Var) {
        if (g08Var == null || !X2.contains(g08Var)) {
            return;
        }
        ej5.c(ebs.a(getLifecycle()), null, null, new n(null), 3);
    }

    public final void g4(int i3) {
        f8a0 f8a0Var;
        BetTypeAnyWinConfig betTypeAnyWinConfig = this.K2;
        if (betTypeAnyWinConfig == null) {
            return;
        }
        int i4 = 0;
        if (i3 == 4759) {
            int minSelectionNum = betTypeAnyWinConfig.getMinSelectionNum();
            StringBuilder sb = new StringBuilder();
            sb.append(minSelectionNum);
            final String string = sb.toString();
            final le3 le3Var = new le3(this, i4);
            f8a0Var = new f8a0(new op8(353375312, new gaj() { // from class: il0
                @Override // defpackage.gaj
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    final Dialog dialog = (Dialog) obj;
                    a aVar = (a) obj2;
                    ((Integer) obj3).getClass();
                    dialog.getClass();
                    String str = string;
                    String strA = cb40.a(R.string.component_betslip__any_win_add_selections_error_title, new Object[]{str}, aVar);
                    String strA2 = cb40.a(R.string.component_betslip__any_win_add_selections_error_desc, new Object[]{str}, aVar);
                    boolean zA = aVar.A(dialog);
                    final le3 le3Var2 = le3Var;
                    boolean zM = zA | aVar.M(le3Var2);
                    Object objY = aVar.y();
                    if (zM || objY == a.C0041a.a) {
                        objY = new Function0() { // from class: ml0
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() throws Throwable {
                                dialog.dismiss();
                                le3Var2.invoke();
                                return Unit.a;
                            }
                        };
                        aVar.r(objY);
                    }
                    nzj.b(null, strA, strA2, null, null, null, null, null, null, null, null, null, (Function0) objY, null, aVar, 0, 0, 12281);
                    return Unit.a;
                }
            }, true));
            Q1().O1(v03.e.a);
        } else if (i3 == 4760) {
            int maxSelectionNum = betTypeAnyWinConfig.getMaxSelectionNum();
            StringBuilder sb2 = new StringBuilder();
            sb2.append(maxSelectionNum);
            final String string2 = sb2.toString();
            final me3 me3Var = new me3(this, i4);
            f8a0Var = new f8a0(new op8(-1649119741, new gaj() { // from class: hl0
                @Override // defpackage.gaj
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    final Dialog dialog = (Dialog) obj;
                    a aVar = (a) obj2;
                    ((Integer) obj3).getClass();
                    dialog.getClass();
                    String str = string2;
                    String strA = cb40.a(R.string.component_betslip__any_win_reduce_selections_error_title, new Object[]{str}, aVar);
                    String strA2 = cb40.a(R.string.component_betslip__any_win_reduce_selections_error_desc, new Object[]{str}, aVar);
                    boolean zA = aVar.A(dialog);
                    final me3 me3Var2 = me3Var;
                    boolean zM = zA | aVar.M(me3Var2);
                    Object objY = aVar.y();
                    if (zM || objY == a.C0041a.a) {
                        objY = new Function0() { // from class: ll0
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() throws Throwable {
                                dialog.dismiss();
                                me3Var2.invoke();
                                return Unit.a;
                            }
                        };
                        aVar.r(objY);
                    }
                    nzj.b(null, strA, strA2, null, null, null, null, null, null, null, null, null, (Function0) objY, null, aVar, 0, 0, 12281);
                    return Unit.a;
                }
            }, true));
            Q1().O1(v03.g.a);
        } else {
            if (i3 != 4762) {
                return;
            }
            final String string3 = betTypeAnyWinConfig.getMinOdds().toString();
            string3.getClass();
            final ke3 ke3Var = new ke3(this, betTypeAnyWinConfig);
            f8a0Var = new f8a0(new op8(1999560396, new gaj() { // from class: jl0
                @Override // defpackage.gaj
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    final Dialog dialog = (Dialog) obj;
                    a aVar = (a) obj2;
                    ((Integer) obj3).getClass();
                    dialog.getClass();
                    String strA = cb40.a(R.string.common_functions__note, new Object[0], aVar);
                    String strA2 = cb40.a(R.string.component_betslip__any_win_cannot_be_applied_tip, new Object[]{string3}, aVar);
                    boolean zA = aVar.A(dialog);
                    final ke3 ke3Var2 = ke3Var;
                    boolean zM = zA | aVar.M(ke3Var2);
                    Object objY = aVar.y();
                    if (zM || objY == a.C0041a.a) {
                        objY = new Function0() { // from class: kl0
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() throws Throwable {
                                dialog.dismiss();
                                ke3Var2.invoke();
                                return Unit.a;
                            }
                        };
                        aVar.r(objY);
                    }
                    nzj.b(null, strA, strA2, null, null, null, null, null, null, null, null, null, (Function0) objY, null, aVar, 0, 0, 12281);
                    return Unit.a;
                }
            }, true));
            Q1().O1(v03.i.a);
        }
        u1k.a aVar = u1k.b;
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        supportFragmentManager.getClass();
        aVar.getClass();
        u1k.a.a(supportFragmentManager, f8a0Var);
    }

    @Override // defpackage.to3
    public final void h0(String str, boolean z2) {
        r53 r53Var;
        kvo kvoVar = (kvo) this.W0.getValue();
        Map mapF = kpu.f(new Pair("type", str), new Pair(AnalyticsParam.EVENT_PARAM_IS_CHECKED, Boolean.valueOf(z2)));
        Object obj = mapF.get(AnalyticsParam.EVENT_PARAM_IS_CHECKED);
        obj.getClass();
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        Object obj2 = mapF.get("type");
        obj2.getClass();
        String str2 = (String) obj2;
        switch (str2.hashCode()) {
            case -1412629904:
                if (str2.equals("anywin")) {
                    kvoVar.i = zBooleanValue;
                }
                break;
            case -1012440300:
                str2.equals("one_up");
                break;
            case -1012436452:
                if (str2.equals("onecut")) {
                    kvoVar.f = zBooleanValue;
                }
                break;
            case -860684946:
                if (str2.equals("two_up")) {
                    kvoVar.v = zBooleanValue;
                }
                break;
            case 1744737025:
                if (str2.equals("flexibet")) {
                    kvoVar.e = zBooleanValue;
                }
                break;
        }
        if (zBooleanValue) {
            LinkedHashMap linkedHashMap = new LinkedHashMap(mapF);
            linkedHashMap.remove(AnalyticsParam.EVENT_PARAM_IS_CHECKED);
            kvoVar.d.a(AnalyticsEvent.BETSLIP_INSURE_CLICK, linkedHashMap);
        }
        if (TextUtils.equals(str, "anywin")) {
            Q1().O1(new v03.b(vuo.a(this.K2, this.L2, R1()) == luo.c));
        } else if (TextUtils.equals(str, "onecut")) {
            if (!z2) {
                yyk yykVarE2 = e2();
                ej5.c(o8i0.d(yykVarE2), null, null, new czk(null, yykVarE2), 3);
            } else if (y2().c != null && !N1().m0() && (r53Var = this.y1) != r53.b && r53Var != r53.i) {
                yyk yykVarE3 = e2();
                ej5.c(o8i0.d(yykVarE3), null, null, new dzk(null, yykVarE3), 3);
            }
        } else if (TextUtils.equals(str, "one_up")) {
            k2().B1(z2 ? hvy.a : hvy.c);
        } else if (TextUtils.equals(str, "two_up")) {
            k2().B1(z2 ? hvy.b : hvy.c);
        } else if (TextUtils.equals(str, "early_goals")) {
            C3(AnalyticsEvent.EG_CHECKBOX_INSURE_BETSLIP_CLICK, jpu.b(new Pair("value", z2 ? AnalyticsParam.EVENT_STATUS_ON : AnalyticsParam.EVENT_STATUS_OFF)));
        }
        if (TextUtils.equals(str, "anywin") || TextUtils.equals(str, "flexibet") || TextUtils.equals(str, "onecut")) {
            this.C2 = true;
        }
    }

    public final rws h2() {
        return (rws) this.T0.getValue();
    }

    public final void h3(String str, String str2) {
        Object bVar;
        Object bVar2;
        if (str2 != null) {
            try {
                zi50.a aVar = zi50.b;
                bVar = lws.valueOf(str2);
            } catch (Throwable th) {
                zi50.a aVar2 = zi50.b;
                bVar = new zi50.b(th);
            }
            if (bVar instanceof zi50.b) {
                bVar = null;
            }
            lws lwsVar = (lws) bVar;
            if (lwsVar == null || str == null) {
                return;
            }
            try {
                bVar2 = g08.valueOf(str);
            } catch (Throwable th2) {
                zi50.a aVar3 = zi50.b;
                bVar2 = new zi50.b(th2);
            }
            if (bVar2 instanceof zi50.b) {
                bVar2 = null;
            }
            g08 g08Var = (g08) bVar2;
            if (g08Var != null && X2.contains(g08Var)) {
                ej5.c(ebs.a(getLifecycle()), null, null, new o(lwsVar, null), 3);
            }
        }
    }

    public final void h4(boolean z2) {
        if (!z2 || !N1().W()) {
            findViewById(R.id.banker_container).setVisibility(8);
            return;
        }
        if (O1().P()) {
            findViewById(R.id.banker_container).setVisibility(8);
            O1().d();
        } else {
            findViewById(R.id.banker_container).setVisibility(0);
            if (N1().m0()) {
                findViewById(R.id.banker_container).setVisibility(8);
            }
        }
    }

    @Override // androidx.swiperefreshlayout.widget.SwipeRefreshLayout.f
    public final void i() {
        so3 so3Var;
        if (getAccountHelper().getAccount() != null) {
            if (Q1().G1() == 2 && (so3Var = this.p1) != null && so3Var.a.n()) {
                so3 so3Var2 = this.p1;
                if (so3Var2 != null) {
                    so3Var2.b(false);
                }
            } else if (N1().m0()) {
                s3();
            } else {
                e2().F1(false);
            }
            yyk.A1(e2());
            L1().g();
        }
        q73 q73VarQ1 = Q1();
        kzh.d(new g1i(q73VarQ1.A.g(), new h83(q73VarQ1, null, true)), o8i0.d(q73VarQ1));
        if (!N1().U().isEmpty()) {
            m2(true);
        } else {
            q73 q73VarQ2 = Q1();
            ej5.c(o8i0.d(q73VarQ2), null, null, new z73(q73VarQ2, null), 3);
        }
    }

    @Override // defpackage.to3
    public final void i1() throws Throwable {
        SelectedGiftData selectedGiftData;
        if (!U2()) {
            R2();
        }
        if (N1().m0()) {
            if (b3()) {
                boolean z2 = y2().i || ((selectedGiftData = y2().C) != null && selectedGiftData.getChecked());
                String string = Q1().H1(Q1().G1()).toString();
                string.getClass();
                if (z2) {
                    yyk yykVarE2 = e2();
                    ej5.c(o8i0.d(yykVarE2), null, null, new dzk(null, yykVarE2), 3);
                }
                z(string, false);
                so3 so3Var = this.p1;
                if (so3Var != null) {
                    so3Var.c(false);
                }
            } else {
                so3 so3Var2 = this.p1;
                if (so3Var2 != null) {
                    so3Var2.c(f4());
                }
            }
        }
        C4(true, false);
        B1();
        this.y1 = r53.a;
        J3();
    }

    public final up3 i2() {
        up3 up3Var = this.X;
        if (up3Var != null) {
            return up3Var;
        }
        Intrinsics.n("multipleGiftState");
        throw null;
    }

    public final void i3() {
        int intExtra = getIntent().getIntExtra("extra_is_edit_bet_source", 0);
        wae waeVar = wae.OPEN_BETS_IN_MAIN_TAB;
        if (intExtra == 1 || intExtra == 2) {
            waeVar = wae.ME_SPORTS_BET_HISTORY_IN_MAIN_TAB;
        }
        sh8.c().e(o7d.a(waeVar));
    }

    public final void i4() {
        GuideView guideView;
        if (N1().m0()) {
            S1().E.setSwitchRealToSim(true, Q1().J1());
            Q1().S1(true);
            return;
        }
        if (this.J1 && (guideView = this.I1) != null) {
            guideView.setVisibility(8);
            this.J1 = false;
        } else if (this.K1 != null) {
            S1().y.removeCallbacks(this.K1);
        }
        N3();
        Q2();
        E1();
        BookingCodePanel bookingCodePanel = S1().i;
        bookingCodePanel.M.D.setVisibility(8);
        bookingCodePanel.M.N.setVisibility(8);
        BookingCodePanel bookingCodePanel2 = S1().i;
        if (!bookingCodePanel2.S && bookingCodePanel2.R != null) {
            bookingCodePanel2.M.e.setOnTouchCallBack(new k05(bookingCodePanel2));
            bookingCodePanel2.getRootView().getViewTreeObserver().addOnGlobalLayoutListener(bookingCodePanel2.d0);
            bookingCodePanel2.S = true;
        }
        S1().i.setVisibility(0);
        BookingCodePanel bookingCodePanel3 = S1().i;
        bookingCodePanel3.M.V.setOffscreenPageLimit(bookingCodePanel3.getResources().getConfiguration().screenWidthDp >= 600 ? 2 : 1);
        bookingCodePanel3.J();
        S1().i.setHideRouterContainer();
        S1().G.setVisibility(8);
        S1().y.setVisibility(8);
        findViewById(R.id.layout_sim_empty).setVisibility(8);
    }

    public final zry j2() {
        zry zryVar = this.g0;
        if (zryVar != null) {
            return zryVar;
        }
        Intrinsics.n("oneTwoUpPendingToggleHolder");
        throw null;
    }

    public final void j3(Event event, boolean z2) {
        String stringExtra;
        Intent intent = new Intent();
        if (z2) {
            intent.putExtra("EXTRA_EVENT", apg.f(event));
            intent.setClass(this, PreMatchEventActivity.class);
            yrh0.s(this, intent, true);
            return;
        }
        intent.putExtra("EXTRA_EVENT", apg.f(event));
        intent.putExtra("EXTRA_SOURCE", 4);
        intent.setClass(this, EventActivity.class);
        Event event2 = (Event) intent.getParcelableExtra("EXTRA_EVENT");
        if (event2 == null || (stringExtra = event2.eventId) == null) {
            stringExtra = intent.getStringExtra("EXTRA_EVENT_ID");
        }
        if (stringExtra == null || stringExtra.length() == 0) {
            new b12().showDialog(this, sn5.b(this, R.string.common_feedback__failed_to_load_data_please_refresh_the_page, new Object[0]), new ckg(0));
        } else {
            yrh0.s(this, intent, true);
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [se3] */
    /* JADX WARN: Type inference failed for: r1v1, types: [te3] */
    public final void j4(final a aVar) {
        kgf kgfVar = this.k2;
        if (kgfVar != null) {
            kgfVar.dismiss();
        }
        kgf kgfVar2 = new kgf(this);
        this.k2 = kgfVar2;
        kgfVar2.b = new DialogInterface.OnClickListener() { // from class: se3
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i3) {
                Set<g08> set = BetslipActivity.X2;
                aVar.b();
                kgf kgfVar3 = this.k2;
                if (kgfVar3 != null) {
                    kgfVar3.dismiss();
                }
            }
        };
        kgfVar2.c = new DialogInterface.OnClickListener() { // from class: te3
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i3) {
                Set<g08> set = BetslipActivity.X2;
                aVar.a();
                kgf kgfVar3 = this.k2;
                if (kgfVar3 != null) {
                    kgfVar3.dismiss();
                }
            }
        };
        kgfVar2.show(getSupportFragmentManager(), "duplicateSelectionDialog");
    }

    @Override // defpackage.to3
    public final void k(String str) {
        so3 so3Var;
        so3 so3Var2;
        str.getClass();
        R1().r(null);
        y2().D = null;
        e2().E1();
        if (Q1().G1() != 1) {
            if (Q1().G1() != 2 || (so3Var = this.p1) == null) {
                return;
            }
            so3Var.a(Q1().G1(), R1().d0());
            return;
        }
        BigDecimal bigDecimalC = u2().c();
        so3 so3Var3 = this.p1;
        if (so3Var3 == null || !so3Var3.a(Q1().G1(), new imn(0L, bigDecimalC.toString(), "")) || (so3Var2 = this.p1) == null) {
            return;
        }
        so3Var2.a(Q1().G1(), R1().e0());
    }

    public final bsy k2() {
        return (bsy) this.M0.getValue();
    }

    public final void k3(boolean z2) {
        if (N1().U().isEmpty() || this.q2) {
            S1().G.setVisibility(8);
            return;
        }
        if (z2) {
            Iterator it = N1().U().iterator();
            if (it.hasNext()) {
                Selection selection = (Selection) it.next();
                if (N1().u1(selection) && selection.a.changeFlag && !this.q2) {
                    S1().G.setVisibility(0);
                }
            }
        }
    }

    public final void k4(int i3, String str) {
        if (isFinishing()) {
            return;
        }
        this.c2 = 0L;
        if (((e9h) getSupportFragmentManager().H("FailedFragment")) == null) {
            e9h e9hVarJ0 = e9h.j0(i3, str);
            if (!this.x1) {
                this.X1 = true;
                this.Y1 = i3;
                this.Z1 = str;
            } else {
                FragmentManager supportFragmentManager = getSupportFragmentManager();
                supportFragmentManager.getClass();
                e9hVarJ0.show(supportFragmentManager, "FailedFragment");
                this.X1 = false;
                this.Z1 = null;
            }
        }
    }

    public final iym l2() {
        iym iymVar = this.I;
        if (iymVar != null) {
            return iymVar;
        }
        Intrinsics.n("openTelemetryLogger");
        throw null;
    }

    public final void l3(boolean z2) {
        P3(true, z2);
        int iG1 = Q1().G1();
        if (iG1 == 1) {
            Y3(true, R1().e0());
        } else if (iG1 == 2) {
            R3(true, R1().d0());
        } else {
            if (iG1 != 3) {
                return;
            }
            c4();
        }
    }

    public final void l4(boolean z2) {
        if (isFinishing()) {
            return;
        }
        ade0 ade0Var = (ade0) getSupportFragmentManager().H("SubmittingFragment");
        if (!z2) {
            if (ade0Var != null) {
                ade0Var.dismissAllowingStateLoss();
                if (N1().m0()) {
                    return;
                }
                this.V1 = false;
                return;
            }
            return;
        }
        if (ade0Var == null) {
            boolean zM0 = N1().m0();
            ade0 ade0Var2 = new ade0();
            Bundle bundle = new Bundle();
            bundle.putBoolean("sim_mode", zM0);
            ade0Var2.setArguments(bundle);
            if (!this.x1) {
                this.W1 = true;
                return;
            }
            FragmentManager supportFragmentManager = getSupportFragmentManager();
            supportFragmentManager.getClass();
            ade0Var2.show(supportFragmentManager, "SubmittingFragment");
            this.W1 = false;
        }
    }

    public final void m2(boolean z2) {
        if (N1().U().isEmpty()) {
            return;
        }
        ArrayList arrayListU = N1().U();
        Q1().C1(g880.k(arrayListU, true), z2 ? aak.v : aak.i, arrayListU);
        Q1().Q0();
    }

    public final void m3() {
        ((br3) mmc.a(hp0.A, br3.class)).U().e();
        if (this.t2) {
            ((br3) mmc.a(hp0.A, br3.class)).U().B(Long.valueOf(this.s2));
        }
        finish();
    }

    public final void m4(int i3) {
        o4(0, getCMSString(i3, new Object[0]));
    }

    public final hzz n2() {
        return (hzz) this.Z0.getValue();
    }

    public final BetSlipInfo n3(BigDecimal bigDecimal, BigDecimal bigDecimal2, Integer num) {
        String strA;
        BigDecimal bigDecimal3 = bigDecimal == null ? BigDecimal.ZERO : bigDecimal;
        BigDecimal bigDecimal4 = N1().m0() ? new BigDecimal(S1().D.getSimCurrentAutoTimes()) : BigDecimal.ONE;
        String str = R1().d0().a;
        BigDecimal bigDecimal5 = (str == null || str.length() == 0) ? BigDecimal.ZERO : new BigDecimal(str);
        int iIntValue = num.intValue();
        kvh kvhVar = this.G2;
        if (iIntValue == 6) {
            bigDecimal3.getClass();
            nl0 nl0Var = this.I2;
            nl0Var.getClass();
            nl0Var.c = bigDecimal3;
            bigDecimal2.getClass();
            nl0Var.b = bigDecimal2;
        } else if (num.intValue() == 4 || num.intValue() == 5) {
            kvhVar.c = bigDecimal3;
            kvhVar.e = bigDecimal3;
            kvhVar.f = bigDecimal2;
        }
        BigDecimal bigDecimalJ = O1().j();
        BigDecimal bigDecimalA = a2().a();
        bigDecimal5.getClass();
        BigDecimal bigDecimalMin = bigDecimal5.multiply(bigDecimalJ).multiply(bigDecimal4).min(bigDecimalA.multiply(bigDecimal4));
        RoundingMode roundingMode = RoundingMode.HALF_UP;
        BigDecimal scale = bigDecimalMin.setScale(2, roundingMode);
        BigDecimal scale2 = bigDecimal5.multiply(bigDecimal3).multiply(bigDecimal4).min(bigDecimalA.multiply(bigDecimal4)).setScale(2, roundingMode);
        hu2 hu2VarM1 = M1();
        TaxConfig taxConfigO2 = o2();
        int iG1 = Q1().G1();
        BigDecimal bigDecimalMultiply = bigDecimal5.multiply(bigDecimal4);
        hu2VarM1.getClass();
        BigDecimal tax = taxConfigO2.getTax(scale2, bigDecimalMultiply);
        BigDecimal netWin = taxConfigO2.getNetWin(scale2, bigDecimalMultiply);
        itf0.a aVar = itf0.a;
        aVar.q(MyLog.TAG_COMMON);
        StringBuilder sb = new StringBuilder("[getFlexbetWHTaxAndNetWin] BetConfig.TaxType = ");
        sb.append(taxConfigO2.getType());
        sb.append(", wh tax =");
        sb.append(tax);
        sb.append(", net win =");
        iib0.b(sb, netWin, ", pt win=", scale2, ", stake =");
        sb.append(bigDecimalMultiply);
        aVar.g(sb.toString(), new Object[0]);
        Locale locale = Locale.US;
        BetSlipInfo betSlipInfo = new BetSlipInfo(iG1, bjb0.L(netWin, locale), bjb0.L(tax.multiply(new BigDecimal(-1)), locale), scale, taxConfigO2.hasRate());
        betSlipInfo.setNet(netWin);
        betSlipInfo.setStake(bigDecimalMultiply);
        if (bigDecimal3.compareTo(BigDecimal.ZERO) == 0) {
            strA = "--";
        } else {
            strA = gky.a.a(bjb0.L(bigDecimal3, locale), false);
        }
        betSlipInfo.setTotalOdds(strA);
        kvhVar.d = betSlipInfo.getNet();
        String string = bigDecimal3.toString();
        string.getClass();
        this.w2 = string;
        this.x2 = "0";
        aVar.q(MyLog.TAG_COMMON);
        aVar.g("FlexiOdds =%s", bigDecimal3);
        return betSlipInfo;
    }

    public final void n4(int i3, int i4) {
        o4(i4, getCMSString(i3, new Object[0]));
    }

    public final TaxConfig o2() {
        return N1().m0() ? Q1().c1.getVirtualTaxConfig() : Q1().c1.getRealSportTaxConfig();
    }

    public final void o3(int i3) throws Throwable {
        HashSet hashSet = new HashSet();
        try {
            Selection selection = (Selection) N1().U().get(i3);
            hashSet.add(selection);
            Event event = selection.a;
            if (b3.U(event.eventId)) {
                Q1().V.a(u7d0.a, k00.d);
            }
            if (N1().W() && !event.isVirtualSoccer()) {
                iym iymVarL2 = l2();
                Market market = selection.b;
                market.getClass();
                gym.a(iymVarL2, new nt3(apg.b(event, market)));
            }
        } catch (Throwable th) {
            itf0.a.o(th);
        }
        p3(hashSet);
    }

    public final void o4(int i3, String str) {
        if (Q1().f1.a.getValue() instanceof cs3.c) {
            p4(Snackbar.h(S1().a, str, i3));
        }
    }

    @Override // defpackage.py1, defpackage.i8
    public final void onAccountChange(Account account) {
        e2().F1(false);
        q73 q73VarQ1 = Q1();
        boolean z2 = this.x1;
        jvd0 jvd0Var = q73VarQ1.g1;
        if (jvd0Var != null) {
            jvd0Var.cancel((CancellationException) null);
        }
        q73VarQ1.g1 = ej5.c(o8i0.d(q73VarQ1), null, null, new s63(q73VarQ1, true, z2, null), 3);
    }

    @Override // defpackage.r1k
    public final boolean onBackPressedCompat() {
        com.sportybet.plugin.realsports.betslip.widget.f.a aVar;
        com.sportybet.plugin.realsports.betslip.widget.f.a aVar2;
        if (e3()) {
            N2();
            return true;
        }
        Stack<com.sportybet.plugin.realsports.betslip.widget.f.a> stack = com.sportybet.plugin.realsports.betslip.widget.f.b;
        if (stack.isEmpty()) {
            aVar = com.sportybet.plugin.realsports.betslip.widget.f.a.a;
        } else {
            com.sportybet.plugin.realsports.betslip.widget.f.a aVarPeek = stack.peek();
            aVarPeek.getClass();
            aVar = aVarPeek;
        }
        if (aVar == com.sportybet.plugin.realsports.betslip.widget.f.a.e) {
            Q1().N1();
            z2();
            K3();
            return true;
        }
        if ((!N1().m0() || (!Z2() && !c3())) && !d3()) {
            finish();
            if (this.t2) {
                ((br3) mmc.a(hp0.A, br3.class)).U().B(Long.valueOf(this.s2));
            }
            N1().A1();
            ((br3) mmc.a(hp0.A, br3.class)).U().f(true);
            return true;
        }
        K2();
        if (stack.isEmpty()) {
            aVar2 = com.sportybet.plugin.realsports.betslip.widget.f.a.a;
        } else {
            com.sportybet.plugin.realsports.betslip.widget.f.a aVarPeek2 = stack.peek();
            aVarPeek2.getClass();
            aVar2 = aVarPeek2;
        }
        if (aVar2 == com.sportybet.plugin.realsports.betslip.widget.f.a.d) {
            S1().L.setVisibility(0);
            return true;
        }
        S1().E.setRemoveAllBtnEnabled(true);
        S1().V.a.setVisibility(0);
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:56:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:83:0x01ac  */
    @Override // android.view.View.OnClickListener
    public void onClick(View view) throws Throwable {
        BigDecimal bigDecimalG;
        jrm jrmVar;
        Collection<? extends Selection> collection;
        BetTypeAnyWinConfig anyWin;
        BigDecimal bigDecimal;
        String str;
        Object bVar;
        view.getClass();
        R1().r(null);
        int id = view.getId();
        if (id == R.id.grey_container) {
            m3();
            return;
        }
        if (id == R.id.place_bet_btn || id == R.id.sim_place_bet_btn || id == R.id.edit_bet_place_btn) {
            if (id == R.id.sim_place_bet_btn) {
                Q1().i0.c();
            }
            if (id == R.id.place_bet_btn || id == R.id.sim_place_bet_btn) {
                Q1().V1(Y1());
                SelectedGiftData selectedGiftData = y2().C;
                if (selectedGiftData != null) {
                    boolean checked = selectedGiftData.getChecked();
                    boolean userSelect = selectedGiftData.getUserSelect();
                    q73 q73VarQ1 = Q1();
                    wwd0 wwd0Var = q73VarQ1.I1;
                    pjh0 pjh0Var = q73VarQ1.U;
                    v03.q qVar = (v03.q) wwd0Var.getValue();
                    pjh0Var.getClass();
                    qVar.getClass();
                    wwd0Var.k(null, v03.q.a(qVar, null, null, null, null, null, null, null, null, checked ? "yes" : "no", userSelect ? "user_select" : "system_select", 0, 0, 0, 0, 0, null, null, null, null, false, null, 0, 0, 8387839));
                }
                Q1().O1(new v03.r(Q1().E1()));
                y8j fullStoryCommonManager = getFullStoryCommonManager();
                Map<String, ? extends Object> map = o2g.a;
                map.getClass();
                fullStoryCommonManager.f(AnalyticsEvent.BETSLIP_PLACE_BET_CLICK, map);
            }
            if (N1().m0()) {
                K2();
            }
            if (this.V1) {
                return;
            }
            if (!getAccountHelper().isLogin()) {
                getAccountHelper().demandAccount(this, this);
                this.R1 = true;
                return;
            }
            if (N1().m0()) {
                q4(true);
                return;
            }
            if (!N1().D() || (bigDecimalG = kotlin.text.b.g(Q1().D1())) == null) {
                bigDecimalG = BigDecimal.ZERO;
            }
            qz3.a aVarD = qz3.d(Q1().c1.getRealSportTaxConfig(), L1().c(), new BigDecimal(String.valueOf(this.g2)), bigDecimalG);
            if (aVarD.a && qz3.n(this, aVarD.b, aVarD.c)) {
                return;
            }
            Q1().L1(Q1().G1());
            q4(true);
            return;
        }
        boolean z2 = false;
        if (id != R.id.accept_changes_btn) {
            if (id == R.id.share || id == R.id.share_icon) {
                W3(true);
                j990 j990Var = this.z0;
                if (j990Var == null) {
                    Intrinsics.n("shouldShowUniqueCodeInfoSheetUseCase");
                    throw null;
                }
                if (!((Boolean) dj5.a(kotlin.coroutines.e.a, new i990(j990Var, null))).booleanValue()) {
                    e4();
                    return;
                }
                fk3 fk3Var = new fk3(this);
                FragmentManager supportFragmentManager = getSupportFragmentManager();
                supportFragmentManager.getClass();
                new eeh0(fk3Var).show(supportFragmentManager, "UniqueBookingCodeInfoBottomSheetDialog");
                S1().P.w.setEnabled(true);
                W3(false);
                return;
            }
            if (id == R.id.boost_container) {
                N1().d();
                T3(1000L, !N1().M());
                if (N1().M()) {
                    Iterator it = N1().l1().entrySet().iterator();
                    while (it.hasNext()) {
                        N1().L0((Selection) ((Map.Entry) it.next()).getKey(), true);
                    }
                }
                so3 so3Var = this.p1;
                if (so3Var != null) {
                    so3Var.a.J(N1().M());
                }
                x4(N1().M());
                Q1().P0.a(a53.b.a);
                Y3(false, R1().e0());
                return;
            }
            if (id == R.id.real2sim_switch_container) {
                k53 k53Var = N1().m0() ? k53.REAL : k53.SIM;
                N1().r0(k53Var);
                if (k53Var == k53.SIM) {
                    xm90 xm90Var = Q1().i0;
                    xm90Var.b.a(new ii90(), k00.d);
                    y8j.a(xm90Var.c, AnalyticsEvent.SIM_TOGGLE_BTN);
                }
                com.sportybet.plugin.realsports.betslip.widget.f.b.clear();
                com.sportybet.plugin.realsports.betslip.widget.f.a.clear();
                q4(false);
                if (N1().m0()) {
                    S1().E.setSimNotifyBadgeVisible(false);
                    g9d0 g9d0Var = this.P;
                    if (g9d0Var == null) {
                        Intrinsics.n("sportySimBadgeHelper");
                        throw null;
                    }
                    if (g9d0Var.a.isLogin()) {
                        zu7.a aVar = zu7.a;
                        ej5.c(zu7.b(g9d0Var.c), null, null, new d9d0(g9d0Var, null), 3);
                    }
                    N1().p0(false);
                    T3(1L, false);
                    so3 so3Var2 = this.p1;
                    if (so3Var2 != null) {
                        so3Var2.a.J(N1().M());
                    }
                    x4(N1().M());
                }
                S1().E.setRemoveAllBtnEnabled(!N1().m0());
                this.H1 = false;
                s4(N1().m0(), true);
                F4();
                G4();
                so3 so3Var3 = this.p1;
                if (so3Var3 != null) {
                    so3Var3.a.setInputMinStakeHint();
                }
                Q1().P0.a(a53.b.a);
                return;
            }
            return;
        }
        this.B1 = false;
        this.F1 = false;
        this.E1 = false;
        I1(false);
        N1().B();
        t2k t2kVar = this.c0;
        if (t2kVar == null) {
            Intrinsics.n("getAnyWinOddsChangeStateUseCase");
            throw null;
        }
        rl0 rl0VarA = t2kVar.a();
        boolean z3 = rl0VarA == rl0.c || rl0VarA == rl0.d;
        if (R1().A() && z3 && Q1().G1() == 2) {
            final ArrayList arrayList = new ArrayList(N1().U());
            s2k s2kVar = this.b0;
            if (s2kVar == null) {
                Intrinsics.n("getAnyWinLowReturnSelectionsUseCase");
                throw null;
            }
            jrm jrmVar2 = s2kVar.b;
            BetTypeConfig betTypeConfigM = s2kVar.a.m();
            if (betTypeConfigM == null || (anyWin = betTypeConfigM.getAnyWin()) == null || !jrmVar2.W()) {
                collection = t3g.a;
            } else {
                ArrayList arrayListU = jrmVar2.U();
                ArrayList arrayList2 = new ArrayList();
                int size = arrayListU.size();
                int i3 = 0;
                while (i3 < size) {
                    Object obj = arrayListU.get(i3);
                    int i4 = i3 + 1;
                    Outcome outcome = ((Selection) obj).c;
                    if (outcome == null || (str = outcome.odds) == null) {
                        bigDecimal = BigDecimal.ZERO;
                    } else {
                        try {
                            zi50.a aVar2 = zi50.b;
                            bVar = new BigDecimal(str);
                        } catch (Throwable th) {
                            zi50.a aVar3 = zi50.b;
                            bVar = new zi50.b(th);
                        }
                        Throwable thA = zi50.a(bVar);
                        if (thA != null) {
                            itf0.a aVar4 = itf0.a;
                            aVar4.q(MyLog.TAG_BET_SLIP);
                            aVar4.o(thA);
                        }
                        BigDecimal bigDecimal2 = BigDecimal.ZERO;
                        if (bVar instanceof zi50.b) {
                            bVar = bigDecimal2;
                        }
                        bigDecimal = (BigDecimal) bVar;
                        if (bigDecimal == null) {
                            bigDecimal = BigDecimal.ZERO;
                        }
                    }
                    if (bigDecimal.compareTo(anyWin.getMinSelectionOdds()) < 0) {
                        arrayList2.add(obj);
                    }
                    i3 = i4;
                }
                collection = arrayList2;
            }
            p3(collection);
            Snackbar snackbarH = Snackbar.h(S1().a, getCMSString(R.string.component_betslip__remove_low_return_toast, new Object[0]), 0);
            snackbarH.i(snackbarH.h.getText(R.string.common_functions__undo), new View.OnClickListener() { // from class: mf3
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) throws Throwable {
                    BetslipActivity betslipActivity = this.a;
                    so3 so3Var4 = betslipActivity.p1;
                    if (so3Var4 != null) {
                        BetSlipFooter betSlipFooter = so3Var4.a;
                        SimShareData simShareData = SimShareData.INSTANCE;
                        simShareData.resetAutoBetTimes();
                        mgd0 mgd0Var = betSlipFooter.G;
                        mgd0Var.H0.E(simShareData.getAutoBetTimes());
                        mgd0Var.l0.E(simShareData.getAutoBetTimes());
                    }
                    betslipActivity.N1().f1(arrayList);
                    if (betslipActivity.N1().U().size() > 1) {
                        betslipActivity.Q3();
                        betslipActivity.R1().E(true);
                        so3 so3Var5 = betslipActivity.p1;
                        if (so3Var5 != null) {
                            so3Var5.a.setAnyWinChecked(true);
                        }
                        betslipActivity.I1(false);
                    } else {
                        betslipActivity.R1().E(false);
                        so3 so3Var6 = betslipActivity.p1;
                        if (so3Var6 != null) {
                            so3Var6.a.setAnyWinChecked(false);
                        }
                    }
                    gl0 gl0Var = betslipActivity.Z;
                    if (gl0Var == null) {
                        Intrinsics.n("anyWinDomainService");
                        throw null;
                    }
                    gl0Var.a(betslipActivity.getLifecycle(), false);
                    betslipActivity.B1();
                    betslipActivity.x3();
                    betslipActivity.w4(true, true);
                    betslipActivity.Q1().O1(v03.f0.a);
                }
            });
            p4(snackbarH);
            if (rl0VarA == rl0.c) {
                Q1().O1(v03.k0.a);
                Q1().O1(v03.g0.a);
            } else {
                Q1().O1(v03.i0.a);
            }
        }
        p3(g2().d());
        q73 q73VarQ2 = Q1();
        ej5.c(o8i0.d(q73VarQ2), null, null, new x73(q73VarQ2, null), 3);
        i8s i8sVar = (i8s) Q1().w0.getValue();
        o8s o8sVarG2 = g2();
        i8sVar.getClass();
        jrm jrmVar3 = o8sVarG2.b;
        if (jrmVar3.W()) {
            j8s j8sVarW = jrmVar3.w();
            if (!(j8sVarW instanceof j8s.b) && (!(j8sVarW instanceof j8s.c) || i8sVar == i8s.c || ((j8s.c) j8sVarW).e)) {
                jrmVar = g2().b;
                if (jrmVar.w() instanceof j8s.c) {
                    jrmVar.k0(new j8s.a(m8s.a));
                }
            } else {
                q73 q73VarQ3 = Q1();
                ej5.c(o8i0.d(q73VarQ3), null, null, new p63(q73VarQ3, null), 3);
            }
        } else {
            jrmVar = g2().b;
            if ((jrmVar.w() instanceof j8s.c) && i8sVar == i8s.c) {
                jrmVar.k0(new j8s.a(m8s.a));
            }
        }
        if (R1().A() && z3) {
            z2 = true;
        }
        q73 q73VarQ4 = Q1();
        ej5.c(o8i0.d(q73VarQ4), null, null, new o63(q73VarQ4, null, z2), 3);
        w4(true, true);
        Q1().O1(new v03.k(Q1().E1()));
    }

    /* JADX WARN: Type inference failed for: r3v141, types: [xh3] */
    @Override // defpackage.py1, defpackage.r1k, defpackage.hrl, androidx.fragment.app.e, defpackage.rn8, defpackage.yn8, android.app.Activity
    public final void onCreate(Bundle bundle) {
        Object bVar;
        n8j0.g cVar;
        this.v1 = getIntent().getParcelableArrayListExtra("extra_selection_item");
        getIntent().removeExtra("extra_selection_item");
        super.onCreate(bundle);
        getWindow().setSoftInputMode(48);
        try {
            zi50.a aVar = zi50.b;
            this.F0 = xfd0.a(getLayoutInflater());
            setContentView(S1().a);
            bVar = Unit.a;
        } catch (Throwable th) {
            zi50.a aVar2 = zi50.b;
            bVar = new zi50.b(th);
        }
        Throwable thA = zi50.a(bVar);
        if (thA != null) {
            erb erbVar = this.G;
            if (erbVar == null) {
                Intrinsics.n("crashUtils");
                throw null;
            }
            erbVar.a(this);
            wsm wsmVar = this.H;
            if (wsmVar == null) {
                Intrinsics.n("crashlyticsHelper");
                throw null;
            }
            wsmVar.g("Detect the view binding inflate exception in BetslipActivity", "", thA, null);
            finish();
            return;
        }
        int i3 = 0;
        this.A1 = bundle != null ? bundle.getBoolean("arg_is_quick_sim_bet_consumed") : false;
        boolean z2 = true;
        if (Build.VERSION.SDK_INT >= 35) {
            Window window = getWindow();
            qoa0 qoa0Var = new qoa0(window.getDecorView());
            int i4 = Build.VERSION.SDK_INT;
            if (i4 >= 35) {
                cVar = new n8j0.f(window, qoa0Var);
            } else if (i4 >= 30) {
                cVar = new n8j0.d(window, qoa0Var);
            } else {
                cVar = i4 >= 26 ? new n8j0.c(window, qoa0Var) : new n8j0.b(window, qoa0Var);
            }
            cVar.d(true);
            cVar.c(true);
            View viewFindViewById = findViewById(android.R.id.content);
            tlf tlfVar = new tlf(viewFindViewById, z2);
            WeakHashMap<View, g9i0> weakHashMap = r6i0.a;
            r6i0.d.n(viewFindViewById, tlfVar);
        } else {
            Window window2 = getWindow();
            window2.addFlags(Integer.MIN_VALUE);
            window2.clearFlags(67108864);
            window2.setStatusBarColor(0);
        }
        S1().T.setSystemUiVisibility(1280);
        this.p1 = new so3(S1().D, this, ebs.a(getLifecycle()), this.R2);
        S1().M.setContent(new op8(-1535916347, new mta0(Q1().k0.h, new nf3(this, i3)), true));
        ComposeView composeView = S1().L;
        final q73 q73VarQ1 = Q1();
        final xj3 xj3Var = new xj3(0, this, BetslipActivity.class, "gotoResultPage", "gotoResultPage()V", 0, 0);
        final yj3 yj3Var = new yj3(0, this, BetslipActivity.class, "setAfterSimResultStatus", "setAfterSimResultStatus()V", 0);
        composeView.setContent(new op8(-1051201539, new Function2() { // from class: vo90
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                a aVar3 = (a) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (aVar3.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                    final q73 q73Var = q73VarQ1;
                    final xj3 xj3Var2 = xj3Var;
                    final yj3 yj3Var2 = yj3Var;
                    o0z.a(null, null, null, null, null, pp8.b(-1456680914, new Function2() { // from class: ap90
                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj3, Object obj4) {
                            a aVar4 = (a) obj3;
                            int iIntValue2 = ((Integer) obj4).intValue();
                            if (aVar4.q(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                final q73 q73Var2 = q73Var;
                                qq90 qq90Var = (qq90) wyh.c(q73Var2.j0.p, aVar4, 0, 7).getValue();
                                if (qq90Var == null) {
                                    aVar4.N(368611166);
                                    aVar4.H();
                                } else {
                                    aVar4.N(368611167);
                                    Object objY = aVar4.y();
                                    a.C0041a.C0042a c0042a = a.C0041a.a;
                                    if (objY == c0042a) {
                                        objY = new bp90();
                                        aVar4.r(objY);
                                    }
                                    d dVarF = g3w.f(d.a.b, true, (Function0) objY);
                                    aiv aivVarC = g75.c(ht.a.a, false);
                                    int iHashCode = Long.hashCode(aVar4.m());
                                    ne00 ne00VarO = aVar4.o();
                                    d dVarC = c.c(aVar4, dVarF);
                                    yka.k.getClass();
                                    tsr.a aVar5 = yka.a.b;
                                    if (aVar4.k() == null) {
                                        l2a.b();
                                        throw null;
                                    }
                                    aVar4.D();
                                    if (aVar4.g()) {
                                        aVar4.F(aVar5);
                                    } else {
                                        aVar4.p();
                                    }
                                    hlh0.a(aVar4, aivVarC, yka.a.f);
                                    hlh0.a(aVar4, ne00VarO, yka.a.e);
                                    yka.a.C1350a c1350a = yka.a.g;
                                    if (aVar4.g() || !Intrinsics.g(aVar4.y(), Integer.valueOf(iHashCode))) {
                                        j3c.a(iHashCode, aVar4, iHashCode, c1350a);
                                    }
                                    hlh0.a(aVar4, dVarC, yka.a.d);
                                    final xj3 xj3Var3 = xj3Var2;
                                    boolean zM = aVar4.M(xj3Var3);
                                    final yj3 yj3Var3 = yj3Var2;
                                    boolean zM2 = zM | aVar4.M(yj3Var3) | aVar4.A(q73Var2);
                                    Object objY2 = aVar4.y();
                                    if (zM2 || objY2 == c0042a) {
                                        objY2 = new Function1() { // from class: cp90
                                            /* JADX WARN: Multi-variable type inference failed */
                                            @Override // kotlin.jvm.functions.Function1
                                            public final Object invoke(Object obj5) {
                                                Object value;
                                                Object value2;
                                                Object value3;
                                                LinkedHashSet linkedHashSetD0;
                                                Object value4;
                                                LinkedHashMap linkedHashMapM;
                                                Object value5;
                                                LinkedHashMap linkedHashMapM2;
                                                Object value6;
                                                Object value7;
                                                Pair pair;
                                                pq90 pq90Var = (pq90) obj5;
                                                pq90Var.getClass();
                                                if (pq90Var instanceof pq90.c) {
                                                    xj3Var3.invoke();
                                                }
                                                if (pq90Var instanceof pq90.a) {
                                                    yj3Var3.invoke();
                                                }
                                                do90 do90Var = q73Var2.j0;
                                                wwd0 wwd0Var = do90Var.l;
                                                String str = null;
                                                if (pq90Var instanceof pq90.g) {
                                                    wwd0 wwd0Var2 = do90Var.h;
                                                    do {
                                                        value7 = wwd0Var2.getValue();
                                                        Pair pair2 = (Pair) value7;
                                                        zji zjiVar = ((pq90.g) pq90Var).a;
                                                        boolean z3 = zjiVar.c == zji.a.a;
                                                        boolean z4 = zjiVar.d == zji.c.a;
                                                        Pair pairA = pair2 != null ? Pair.a(pair2, null, null, 3) : new Pair(0, 0);
                                                        int iIntValue3 = ((Number) pairA.a).intValue();
                                                        int iIntValue4 = ((Number) pairA.b).intValue();
                                                        if (z3 && z4) {
                                                            pair = new Pair(Integer.valueOf(iIntValue3 + 1), Integer.valueOf(iIntValue4));
                                                        } else {
                                                            pair = (z3 || !z4) ? new Pair(Integer.valueOf(iIntValue3), Integer.valueOf(iIntValue4)) : new Pair(Integer.valueOf(iIntValue3), Integer.valueOf(iIntValue4 + 1));
                                                        }
                                                    } while (!wwd0Var2.g(value7, pair));
                                                } else if (pq90Var instanceof pq90.f) {
                                                    do {
                                                        value6 = wwd0Var.getValue();
                                                    } while (!wwd0Var.g(value6, ((pq90.f) pq90Var).a));
                                                } else if (pq90Var instanceof pq90.b) {
                                                    pq90.b bVar2 = (pq90.b) pq90Var;
                                                    wwd0 wwd0Var3 = do90Var.m;
                                                    if (bVar2 instanceof pq90.b.a) {
                                                        String str2 = (String) wwd0Var.getValue();
                                                        ucn<String> ucnVar = ((pq90.b.a) bVar2).a;
                                                        do {
                                                            value5 = wwd0Var3.getValue();
                                                            linkedHashMapM2 = kpu.m((Map) value5);
                                                            Set set = (Set) linkedHashMapM2.get(str2);
                                                            LinkedHashSet linkedHashSetD1 = set != null ? CollectionsKt.D0(set) : new LinkedHashSet();
                                                            if (ucnVar.isEmpty()) {
                                                                linkedHashSetD1.clear();
                                                            } else {
                                                                linkedHashSetD1.addAll(ucnVar);
                                                            }
                                                            linkedHashMapM2.put(str2, linkedHashSetD1);
                                                        } while (!wwd0Var3.g(value5, linkedHashMapM2));
                                                    } else if (bVar2 instanceof pq90.b.C0981b) {
                                                        String str3 = (String) wwd0Var.getValue();
                                                        String str4 = ((pq90.b.C0981b) bVar2).b;
                                                        do {
                                                            value4 = wwd0Var3.getValue();
                                                            linkedHashMapM = kpu.m((Map) value4);
                                                            Set set2 = (Set) linkedHashMapM.get(str3);
                                                            LinkedHashSet linkedHashSetD2 = set2 != null ? CollectionsKt.D0(set2) : new LinkedHashSet();
                                                            if (linkedHashSetD2.contains(str4)) {
                                                                linkedHashSetD2.remove(str4);
                                                            } else {
                                                                linkedHashSetD2.add(str4);
                                                            }
                                                            linkedHashMapM.put(str3, linkedHashSetD2);
                                                        } while (!wwd0Var3.g(value4, linkedHashMapM));
                                                    } else {
                                                        uhc.a();
                                                    }
                                                } else if (pq90Var instanceof pq90.d) {
                                                    String str5 = ((pq90.d) pq90Var).a;
                                                    wwd0 wwd0Var4 = do90Var.n;
                                                    do {
                                                        value3 = wwd0Var4.getValue();
                                                        linkedHashSetD0 = CollectionsKt.D0((Set) value3);
                                                        if (linkedHashSetD0.contains(str5)) {
                                                            linkedHashSetD0.remove(str5);
                                                        } else {
                                                            linkedHashSetD0.add(str5);
                                                        }
                                                    } while (!wwd0Var4.g(value3, linkedHashSetD0));
                                                } else if (pq90Var instanceof pq90.c) {
                                                    jvd0 jvd0Var = do90Var.j;
                                                    if (jvd0Var != null) {
                                                        jvd0Var.cancel((CancellationException) null);
                                                    }
                                                    do90Var.j = null;
                                                    wwd0 wwd0Var5 = do90Var.g;
                                                    do {
                                                        value2 = wwd0Var5.getValue();
                                                    } while (!wwd0Var5.g(value2, qn90.c.a));
                                                } else if (pq90Var instanceof pq90.a) {
                                                    do90Var.c();
                                                } else if (pq90Var instanceof pq90.e) {
                                                    pq90.e eVar = (pq90.e) pq90Var;
                                                    if (eVar instanceof pq90.e.b) {
                                                        str = ((pq90.e.b) eVar).a;
                                                    } else if (!(eVar instanceof pq90.e.a)) {
                                                        uhc.a();
                                                    }
                                                    wwd0 wwd0Var6 = do90Var.o;
                                                    do {
                                                        value = wwd0Var6.getValue();
                                                    } while (!wwd0Var6.g(value, str));
                                                } else {
                                                    uhc.a();
                                                }
                                                return Unit.a;
                                            }
                                        };
                                        aVar4.r(objY2);
                                    }
                                    hp90.a(qq90Var, (Function1) objY2, aVar4, 8);
                                    aVar4.s();
                                    aVar4.H();
                                }
                            } else {
                                aVar4.G();
                            }
                            return Unit.a;
                        }
                    }, aVar3), aVar3, 196608);
                } else {
                    aVar3.G();
                }
                return Unit.a;
            }
        }, true));
        ComposeView composeView2 = S1().J;
        final q73 q73VarQ2 = Q1();
        final pf3 pf3Var = new pf3(this, i3);
        final qf3 qf3Var = new qf3(this, i3);
        composeView2.setContent(new op8(1546600652, new Function2() { // from class: zl90
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                a aVar3 = (a) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (aVar3.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                    final q73 q73Var = q73VarQ2;
                    final pf3 pf3Var2 = pf3Var;
                    final qf3 qf3Var2 = qf3Var;
                    o0z.a(null, null, null, null, null, pp8.b(-2061770243, new Function2() { // from class: am90
                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj3, Object obj4) {
                            a aVar4 = (a) obj3;
                            int iIntValue2 = ((Integer) obj4).intValue();
                            if (aVar4.q(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                final q73 q73Var2 = q73Var;
                                sm90 sm90Var = (sm90) wyh.c(e1i.b(q73Var2.o0.i), aVar4, 0, 7).getValue();
                                if (sm90Var == null) {
                                    aVar4.N(130145636);
                                    aVar4.H();
                                } else {
                                    aVar4.N(130145637);
                                    t340 t340VarA = e1i.a(q73Var2.o0.j);
                                    boolean zA = aVar4.A(q73Var2);
                                    Object objY = aVar4.y();
                                    if (zA || objY == a.C0041a.a) {
                                        objY = new Function1() { // from class: bm90
                                            @Override // kotlin.jvm.functions.Function1
                                            public final Object invoke(Object obj5) {
                                                qm90 qm90Var = (qm90) obj5;
                                                qm90Var.getClass();
                                                q73Var2.o0.a(qm90Var);
                                                return Unit.a;
                                            }
                                        };
                                        aVar4.r(objY);
                                    }
                                    gm90.a(sm90Var, t340VarA, (Function1) objY, pf3Var2, qf3Var2, aVar4, 8);
                                    aVar4.H();
                                }
                            } else {
                                aVar4.G();
                            }
                            return Unit.a;
                        }
                    }, aVar3), aVar3, 196608);
                } else {
                    aVar3.G();
                }
                return Unit.a;
            }
        }, true));
        ComposeView composeView3 = S1().N;
        final q73 q73VarQ3 = Q1();
        final rf3 rf3Var = new rf3(this, 0);
        final sf3 sf3Var = new sf3(this, i3);
        composeView3.setContent(new op8(721543128, new Function2() { // from class: yr90
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                a aVar3 = (a) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (aVar3.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                    final q73 q73Var = q73VarQ3;
                    final rf3 rf3Var2 = rf3Var;
                    final sf3 sf3Var2 = sf3Var;
                    o0z.a(null, null, null, null, null, pp8.b(316063753, new Function2() { // from class: zr90
                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj3, Object obj4) {
                            a aVar4 = (a) obj3;
                            int iIntValue2 = ((Integer) obj4).intValue();
                            if (aVar4.q(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                q73 q73Var2 = q73Var;
                                ts90 ts90Var = (ts90) wyh.c(e1i.b(q73Var2.m0.v), aVar4, 0, 7).getValue();
                                if (ts90Var == null) {
                                    aVar4.N(1287107203);
                                    aVar4.H();
                                } else {
                                    aVar4.N(1287107204);
                                    boolean zA = aVar4.A(q73Var2);
                                    Object objY = aVar4.y();
                                    if (zA || objY == a.C0041a.a) {
                                        x710 x710Var = new x710(1, q73Var2, jr90.class, "handleUiAction", "handleUiAction(Lcom/sportybet/android/instantwin/presentation/simulationticketdetail/SimulationTicketDetailUiAction;)V", 0, 1);
                                        aVar4.r(x710Var);
                                        objY = x710Var;
                                    }
                                    ls90.a(ts90Var, rf3Var2, sf3Var2, (Function1) ((chp) objY), aVar4, 8);
                                    aVar4.H();
                                }
                            } else {
                                aVar4.G();
                            }
                            return Unit.a;
                        }
                    }, aVar3), aVar3, 196608);
                } else {
                    aVar3.G();
                }
                return Unit.a;
            }
        }, true));
        ComposeView composeView4 = S1().H;
        final vxk vxkVar = s2().c.b;
        final tf3 tf3Var = new tf3(0);
        composeView4.setContent(new op8(-1245312972, new Function2() { // from class: cxk
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                a aVar3 = (a) obj;
                int iIntValue = ((Integer) obj2).intValue();
                int i5 = 0;
                if (aVar3.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                    o0z.a(null, null, null, null, null, pp8.b(-1409815067, new lxk(i5, vxkVar, tf3Var), aVar3), aVar3, 196608);
                } else {
                    aVar3.G();
                }
                return Unit.a;
            }
        }, true));
        S1().I.setContent(new op8(-67805283, new dtk(s2().c.c, new uf3()), true));
        ComposeView composeView5 = S1().K;
        StringUiText stringUiText = vch0.a;
        composeView5.setContent(new op8(-1946866651, new nfi(new fn90(new bt90(R.color.bg_inverse_tertiary_d_base, new ResourceUiText(R.string.common_helps__how_to_play))), new vf3(this, i3)), true));
        S1().E.setOnCancelEditClick(new Function0() { // from class: yh3
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                nnf nnfVar = this.a.l2;
                if (nnfVar != null) {
                    nnfVar.a(new ErrorDataInfo(EditBetDlgType.DISCARD, ""));
                }
                return Unit.a;
            }
        });
        S1().E.getRootView().setOnTouchListener(this);
        S1().E.setOnCollapseClick(new Function0() { // from class: zh3
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Set<g08> set = BetslipActivity.X2;
                this.a.m3();
                return Unit.a;
            }
        });
        S1().R.setOnClickListener(this);
        S1().R.setOnTouchListener(this);
        S1().P.z.setOnClickListener(this);
        S1().P.v.setOnClickListener(new ai3());
        S1().Q.setOnClickListener(new ai3());
        this.N2 = N1().U().size();
        F1();
        SocketPushManager.getInstance().subscribeTopic(this.j1, this.U2);
        SocketPushManager.getInstance().subscribeTopic(this.i1, this.V2);
        SocketPushManager.getInstance().subscribeTopic(this.k1, this.W2);
        k650 k650Var = this.K;
        if (k650Var == null) {
            Intrinsics.n("remoteConfigRepository");
            throw null;
        }
        long jC = k650Var.c("betslip_ui_update_frequency_time");
        l830<String> l830Var = this.e1;
        qt1 qt1Var = qt1.b;
        d3i d3iVar = new d3i(l830Var.i(qt1Var), new gi3());
        int i5 = r2i.a;
        k830<Boolean> k830Var = this.g1;
        yby.b(k830Var, "other is null");
        yby.c(i5, "bufferSize");
        q3i q3iVarL = new q3i(null, k830Var, true, i5).l(d3iVar);
        qm70 qm70Var = wm70.b;
        b3i b3iVarF = q3iVarL.f(qm70Var);
        yby.b(TimeUnit.MILLISECONDS, "unit is null");
        yby.b(qm70Var, "scheduler is null");
        yby.c(25, "count");
        b3i b3iVarF2 = new s2i(b3iVarF, 500L, 500L, qm70Var).f(va0.a());
        pya pyaVar = new pya() { // from class: hi3
            @Override // defpackage.pya
            public final void accept(Object obj) {
                List list = (List) obj;
                Set<g08> set = BetslipActivity.X2;
                list.getClass();
                int size = list.size();
                while (true) {
                    size--;
                    if (-1 >= size) {
                        return;
                    }
                    String str = (String) list.get(size);
                    if (str.length() != 0) {
                        BetslipActivity betslipActivity = this.a;
                        if (!betslipActivity.V1 && !betslipActivity.isFinishing() && betslipActivity.w1) {
                            try {
                                itf0.a aVar3 = itf0.a;
                                aVar3.q(MyLog.TAG_BET_SLIP);
                                aVar3.a("handleEventMsg : %s", str);
                                JSONArray jSONArray = new JSONArray(str);
                                String string = jSONArray.getString(0);
                                string.getClass();
                                String[] strArr = (String[]) new Regex("\\^").h(wae0.K(StringsKt.V(6, string, "^"), string)).toArray(new String[0]);
                                String str2 = strArr[strArr.length - 1];
                                if (strArr.length >= 5) {
                                    strArr[4] = "~";
                                    StringBuilder sb = new StringBuilder();
                                    int length = strArr.length;
                                    int i6 = 0;
                                    while (i6 < length) {
                                        sb.append(i6 != 0 ? "^" : "");
                                        sb.append(strArr[i6]);
                                        i6++;
                                    }
                                    Set<Selection> set2 = (Set) betslipActivity.N1().c1().get(sb.toString());
                                    if (set2 != null) {
                                        if (jSONArray.optJSONArray(8) == null) {
                                            betslipActivity.D2(jSONArray, set2);
                                        } else {
                                            betslipActivity.C2(jSONArray, set2);
                                        }
                                    }
                                    betslipActivity.I3(jSONArray);
                                    betslipActivity.f1.onNext(Boolean.TRUE);
                                }
                            } catch (Exception e3) {
                                itf0.a aVar4 = itf0.a;
                                aVar4.q(MyLog.TAG_BET_SLIP);
                                aVar4.f(e3, "handleEventMsg exception", new Object[0]);
                            }
                        }
                    }
                }
            }
        };
        ii3 ii3Var = new ii3();
        taj.d dVar = taj.c;
        slr slrVar = new slr(pyaVar, ii3Var, dVar);
        b3iVarF2.h(slrVar);
        ema emaVar = this.d1;
        emaVar.b(slrVar);
        b3i b3iVarF3 = new o3i(new d3i(this.f1.i(qt1Var), new ji3()).f(qm70Var), jC, qm70Var).f(va0.a());
        slr slrVar2 = new slr(new ki3(this), new li3(), dVar);
        b3iVarF3.h(slrVar2);
        emaVar.b(slrVar2);
        mjf mjfVar = this.U;
        if (mjfVar == null) {
            Intrinsics.n("earlyPayoutConfigManager");
            throw null;
        }
        if (mjfVar.d(ckf.c)) {
            mjf mjfVar2 = this.U;
            if (mjfVar2 == null) {
                Intrinsics.n("earlyPayoutConfigManager");
                throw null;
            }
            EarlyPayoutConfig earlyPayoutConfigC = mjfVar2.c();
            if (earlyPayoutConfigC != null) {
                this.M2 = earlyPayoutConfigC;
            }
        }
        U1().e(this.T2);
        getSupportFragmentManager().n0("key_gift_change", this, new dg3(this));
        vho vhoVar = this.L;
        if (vhoVar == null) {
            Intrinsics.n("instantWinOnlineImagePreloader");
            throw null;
        }
        vhoVar.a();
        ykc0 ykc0Var = this.M;
        if (ykc0Var == null) {
            Intrinsics.n("sportyLegendsSettlementClipsPreCacheHelper");
            throw null;
        }
        ykc0Var.a();
        dlc0 dlc0Var = this.N;
        if (dlc0Var == null) {
            Intrinsics.n("sportyLegendsSettlementLottiePreCacheHelper");
            throw null;
        }
        dlc0Var.a();
        q8i0 q8i0Var = this.b1;
        fb1 fb1Var = (fb1) q8i0Var.getValue();
        kzh.d(ozh.c(new or60(new gb1(fb1Var, null)), fb1Var.a), o8i0.d(fb1Var));
        f2().d.f(this, new lfy() { // from class: eg3
            @Override // defpackage.lfy
            public final void u1(Object obj) {
                boolean zY2;
                BetslipActivity betslipActivity = this.a;
                q8i0 q8i0Var2 = betslipActivity.Q0;
                hqc hqcVar = (hqc) obj;
                Set<g08> set = BetslipActivity.X2;
                hqcVar.getClass();
                if (hqcVar instanceof nqc) {
                    T t2 = ((nqc) hqcVar).a;
                    if (t2 instanceof tuo) {
                        tuo tuoVar = (tuo) t2;
                        ruo ruoVarA = tuoVar.a();
                        ruo ruoVar = betslipActivity.f2().i.get();
                        ruoVarA.getClass();
                        if (ruoVarA.equals(ruoVar)) {
                            int i6 = tuoVar.a().b;
                            if (i6 == 4) {
                                zY2 = betslipActivity.Y2();
                            } else if (i6 != 5) {
                                zY2 = i6 == 6 && betslipActivity.Q1().G1() == 2 && betslipActivity.U2() && vuo.a(betslipActivity.K2, betslipActivity.L2, betslipActivity.R1()) == luo.c;
                            } else {
                                zY2 = betslipActivity.b3();
                            }
                            if (!zY2) {
                                if (tuoVar.a().b == 6) {
                                    betslipActivity.R2();
                                    return;
                                }
                                return;
                            }
                            if (tuoVar instanceof quo) {
                                quo quoVar = (quo) tuoVar;
                                so3 so3Var = betslipActivity.p1;
                                if (so3Var != null) {
                                    BigDecimal bigDecimal = BigDecimal.ZERO;
                                    bigDecimal.getClass();
                                    so3Var.g(betslipActivity.n3(bigDecimal, bigDecimal, Integer.valueOf(quoVar.a.b)), Long.valueOf(betslipActivity.h2));
                                    return;
                                }
                                return;
                            }
                            suo suoVar = (suo) tuoVar;
                            int i7 = suoVar.a.b;
                            GetInsureBetResult getInsureBetResult = suoVar.b;
                            BigDecimal bigDecimal2 = getInsureBetResult.odds;
                            if (bigDecimal2 == null) {
                                bigDecimal2 = BigDecimal.ZERO;
                            }
                            BigDecimal bigDecimal3 = getInsureBetResult.oddsKey;
                            if (bigDecimal3 == null) {
                                bigDecimal3 = BigDecimal.ZERO;
                            }
                            so3 so3Var2 = betslipActivity.p1;
                            if (so3Var2 != null) {
                                bigDecimal3.getClass();
                                so3Var2.g(betslipActivity.n3(bigDecimal2, bigDecimal3, Integer.valueOf(i7)), Long.valueOf(betslipActivity.h2));
                            }
                            if (i7 == 5 && betslipActivity.b3()) {
                                BigDecimal bigDecimal4 = BigDecimal.ZERO;
                                if (bigDecimal2.compareTo(bigDecimal4) > 0) {
                                    BigDecimal bigDecimalX = betslipActivity.N1().W() ? betslipActivity.R1().X() : betslipActivity.R1().R();
                                    cqy cqyVar = betslipActivity.H2;
                                    cqyVar.a = true;
                                    BetSlipInfo betSlipInfoC = betslipActivity.M1().c(bigDecimal4, bigDecimalX, betslipActivity.Q1().c1, false, betslipActivity.h2);
                                    itf0.a aVar3 = itf0.a;
                                    aVar3.q(MyLog.TAG_COMMON);
                                    aVar3.g("[New OneCut] bonus = %s", bigDecimalX);
                                    aVar3.q(MyLog.TAG_COMMON);
                                    kvh kvhVar = betslipActivity.G2;
                                    aVar3.g("[New OneCut] FlexOdds = %s", kvhVar.c);
                                    aVar3.q(MyLog.TAG_COMMON);
                                    aVar3.g("[New OneCut] stake = %s", betSlipInfoC.getStake());
                                    aVar3.q(MyLog.TAG_COMMON);
                                    aVar3.g("[New OneCut] TotalOdds = %s", betSlipInfoC.getNoRoundingTotalOdds());
                                    aVar3.q(MyLog.TAG_COMMON);
                                    bqy bqyVar = betslipActivity.m1;
                                    bqy.a aVar4 = bqyVar.b;
                                    aVar3.g("[New OneCut] oneCutConfigAgent.isSliderEnable() %s", Boolean.valueOf(aVar4 == null ? false : aVar4.b));
                                    bqy.a aVar5 = bqyVar.b;
                                    if (!(aVar5 != null ? aVar5.b : false) || betslipActivity.N1().m0()) {
                                        jqy jqyVar = (jqy) q8i0Var2.getValue();
                                        BigDecimal bigDecimal5 = kvhVar.c;
                                        bigDecimal5.getClass();
                                        BigDecimal bigDecimalA = betslipActivity.a2().a();
                                        bigDecimalX.getClass();
                                        bigDecimalA.getClass();
                                        jvd0 jvd0Var = jqyVar.c;
                                        if (jvd0Var != null) {
                                            jvd0Var.cancel((CancellationException) null);
                                        }
                                        jvd0 jvd0Var2 = jqyVar.d;
                                        if (jvd0Var2 != null) {
                                            jvd0Var2.cancel((CancellationException) null);
                                        }
                                        et7 et7VarD = o8i0.d(jqyVar);
                                        pfd pfdVar = fse.a;
                                        jqyVar.c = ej5.c(et7VarD, odd.b, null, new hqy(jqyVar, bigDecimalX, bigDecimal5, betSlipInfoC, bigDecimalA, null), 2);
                                    } else {
                                        jqy jqyVar2 = (jqy) q8i0Var2.getValue();
                                        BigDecimal bigDecimal6 = kvhVar.c;
                                        bigDecimal6.getClass();
                                        BigDecimal bigDecimalA2 = betslipActivity.a2().a();
                                        BigDecimal bigDecimalDivide = new BigDecimal(cqyVar.e).divide(new BigDecimal("100"), 2, RoundingMode.HALF_UP);
                                        bigDecimalDivide.getClass();
                                        bigDecimalX.getClass();
                                        bigDecimalA2.getClass();
                                        jvd0 jvd0Var3 = jqyVar2.c;
                                        if (jvd0Var3 != null) {
                                            jvd0Var3.cancel((CancellationException) null);
                                        }
                                        jvd0 jvd0Var4 = jqyVar2.d;
                                        if (jvd0Var4 != null) {
                                            jvd0Var4.cancel((CancellationException) null);
                                        }
                                        et7 et7VarD2 = o8i0.d(jqyVar2);
                                        pfd pfdVar2 = fse.a;
                                        jqyVar2.d = ej5.c(et7VarD2, odd.b, null, new iqy(jqyVar2, bigDecimalX, bigDecimal6, betSlipInfoC, bigDecimalA2, bigDecimalDivide, null), 2);
                                    }
                                }
                            }
                            so3 so3Var3 = betslipActivity.p1;
                            if (so3Var3 != null) {
                                so3Var3.b(betslipActivity.d2().j(betslipActivity.Q1().G1(), betslipActivity.Y1()));
                            }
                        }
                    }
                }
            }
        });
        f1i f1iVar = ((jqy) this.Q0.getValue()).b;
        s9s.b bVar2 = s9s.b.a;
        ej5.c(ebs.a(getLifecycle()), null, null, new ij3(this, f1iVar, null, this), 3);
        if (getAccountHelper().isLogin()) {
            n2().x1(false);
        }
        ej5.c(ebs.a(getLifecycle()), null, null, new mj3(this, r1i.b(Q1().B1, ((fb1) q8i0Var.getValue()).S, Q1().z1, Q1().u0, new wj3(5, null)), null, this), 3);
        ej5.c(ebs.a(getLifecycle()), null, null, new nj3(this, n2().e, null, this), 3);
        e2().y1(0, false);
        yyk.A1(e2());
        e2().I.f(this, new lfy() { // from class: qg3
            @Override // defpackage.lfy
            public final void u1(Object obj) {
                vjk vjkVar = (vjk) obj;
                Set<g08> set = BetslipActivity.X2;
                vjkVar.getClass();
                boolean z3 = vjkVar instanceof vjk.a;
                final BetslipActivity betslipActivity = this.a;
                if (!z3) {
                    if (vjkVar instanceof vjk.b) {
                        vjk.b bVar3 = (vjk.b) vjkVar;
                        GiftDetails giftDetails = bVar3.a;
                        final SelectedGiftData selectedGiftData = bVar3.b;
                        int i6 = bVar3.c;
                        if (giftDetails == null) {
                            return;
                        }
                        jwk.a.a(betslipActivity.u1, betslipActivity.w2, betslipActivity.x2, betslipActivity.y2, betslipActivity.z2, betslipActivity.Q1().c1.hasRate(betslipActivity.N1().m0()), i6, betslipActivity.e2().C1(), giftDetails, selectedGiftData, new Function1() { // from class: mi3
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj2) {
                                SelectedGiftData selectedGiftData2 = (SelectedGiftData) obj2;
                                Set<g08> set2 = BetslipActivity.X2;
                                selectedGiftData2.getClass();
                                betslipActivity.E2(selectedGiftData2, selectedGiftData);
                                return Unit.a;
                            }
                        }, new oi3(betslipActivity, 0)).show(betslipActivity.getSupportFragmentManager(), "gift_value_edit_dialog");
                        return;
                    }
                    return;
                }
                Bundle bundle2 = new Bundle();
                bundle2.putString("key_gift_id", betslipActivity.y2().d);
                bundle2.putInt("key_gift_kind", betslipActivity.y2().e);
                bundle2.putString("key_gift_value", betslipActivity.y2().c);
                bundle2.putBoolean("is_support_free_bet", betslipActivity.d2().e(betslipActivity.Q1().G1()));
                final SelectedGiftData selectedGiftData2 = betslipActivity.y2().C;
                Function1<? super GiftDetails, Unit> function1 = new Function1() { // from class: di3
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        Set<g08> set2 = BetslipActivity.X2;
                        BetslipActivity betslipActivity2 = betslipActivity;
                        betslipActivity2.e2().K1(new vjk.b((GiftDetails) obj2, selectedGiftData2, betslipActivity2.y2().b));
                        return Unit.a;
                    }
                };
                rok rokVar = new rok();
                rokVar.setArguments(bundle2);
                rokVar.f = function1;
                rokVar.show(betslipActivity.getSupportFragmentManager(), "gifts_dialog");
            }
        });
        e2().M.f(this, new lfy() { // from class: ch3
            @Override // defpackage.lfy
            public final void u1(Object obj) {
                k990 k990Var = (k990) obj;
                Set<g08> set = BetslipActivity.X2;
                k990Var.getClass();
                if (k990Var instanceof k990.c) {
                    BetslipActivity betslipActivity = this.a;
                    yyk yykVarE2 = betslipActivity.e2();
                    ej5.c(o8i0.d(yykVarE2), null, null, new bzk(null, yykVarE2), 3);
                    betslipActivity.p4(Snackbar.h(betslipActivity.S1().a, betslipActivity.getCMSString(R.string.component_betslip__one_cut_can_not_apply_gift_hint, new Object[0]), 0));
                }
            }
        });
        e2().O.f(this, new lfy() { // from class: jh3
            @Override // defpackage.lfy
            public final void u1(Object obj) {
                Set<g08> set = BetslipActivity.X2;
                ((Unit) obj).getClass();
                this.a.l3(false);
            }
        });
        e2().K.f(this, new lfy() { // from class: kh3
            @Override // defpackage.lfy
            public final void u1(Object obj) {
                Boolean bool;
                boolean zD1;
                GiftDetails rawGift;
                GiftDetails rawGift2;
                n780 n780Var = (n780) obj;
                Set<g08> set = BetslipActivity.X2;
                n780Var.getClass();
                BetslipActivity betslipActivity = this.a;
                if (!betslipActivity.D2 || betslipActivity.N1().D()) {
                    so3 so3Var = betslipActivity.p1;
                    if (so3Var != null) {
                        so3Var.e(false);
                        return;
                    }
                    return;
                }
                if (betslipActivity.N1().m0()) {
                    return;
                }
                if (n780Var instanceof n780.a) {
                    so3 so3Var2 = betslipActivity.p1;
                    if (so3Var2 != null) {
                        so3Var2.b(false);
                    }
                    so3 so3Var3 = betslipActivity.p1;
                    if (so3Var3 != null) {
                        so3Var3.e(false);
                    }
                    betslipActivity.F1();
                    betslipActivity.y2().b = 0;
                    if (betslipActivity.Q1().G1() == 1) {
                        SelectedGiftData selectedGiftData = betslipActivity.y2().C;
                        if (selectedGiftData != null) {
                            SelectedGiftData selectedGiftDataCopy = selectedGiftData.copy(selectedGiftData.getGiftValue(), selectedGiftData.getGiftKind(), selectedGiftData.getGiftId(), selectedGiftData.getGiftLimit(), selectedGiftData.getGiftCount(), selectedGiftData.getRawGift(), selectedGiftData.getAddToStake(), false, selectedGiftData.getUserSelect(), selectedGiftData.getTotalStake());
                            betslipActivity.y2().D = selectedGiftData;
                            betslipActivity.y2().b(selectedGiftDataCopy);
                            betslipActivity.y2().v = true;
                            betslipActivity.l3(true);
                            betslipActivity.y2().b(null);
                        }
                    } else if (betslipActivity.Q1().G1() == 2) {
                        betslipActivity.Q3();
                    }
                    betslipActivity.y2().b(null);
                    return;
                }
                if (n780Var instanceof n780.f) {
                    so3 so3Var4 = betslipActivity.p1;
                    if (so3Var4 != null) {
                        so3Var4.e(true);
                    }
                    so3 so3Var5 = betslipActivity.p1;
                    if (so3Var5 != null) {
                        so3Var5.b(false);
                        return;
                    }
                    return;
                }
                if (!(n780Var instanceof n780.b)) {
                    if (!(n780Var instanceof n780.c) || betslipActivity.b3()) {
                        return;
                    }
                    n780.c cVar2 = (n780.c) n780Var;
                    String strW = cVar2.c;
                    GiftDetails giftDetails = cVar2.a;
                    String str = cVar2.b;
                    boolean zC1 = betslipActivity.e2().C1();
                    if (zC1 && (bool = cVar2.e) != null) {
                        zC1 = Boolean.TRUE.equals(bool);
                    }
                    boolean z3 = zC1;
                    Boolean bool2 = cVar2.d;
                    boolean zEquals = bool2 != null ? Boolean.TRUE.equals(bool2) : true;
                    Boolean bool3 = cVar2.f;
                    boolean zEquals2 = bool3 != null ? Boolean.TRUE.equals(bool3) : false;
                    if (strW == null || strW.length() == 0) {
                        strW = bjb0.W(giftDetails.getCurrentBalance());
                    }
                    SelectedGiftData selectedGiftData2 = new SelectedGiftData(strW, giftDetails.getKind(), giftDetails.getGiftId(), bjb0.W(giftDetails.getLeastOrderAmount()), 1, giftDetails, z3, zEquals, zEquals2, str);
                    betslipActivity.y2().v = true;
                    betslipActivity.y2().b(selectedGiftData2);
                    betslipActivity.e2().E1();
                    return;
                }
                if (betslipActivity.b3()) {
                    return;
                }
                up3 up3VarV2 = betslipActivity.v2();
                n780.b bVar3 = (n780.b) n780Var;
                int i6 = bVar3.b;
                GiftDetails giftDetails2 = bVar3.a;
                up3VarV2.b = i6;
                betslipActivity.i2().b = i6;
                betslipActivity.V1().b = i6;
                so3 so3Var6 = betslipActivity.p1;
                if (so3Var6 != null) {
                    so3Var6.e(false);
                }
                so3 so3Var7 = betslipActivity.p1;
                if (so3Var7 != null) {
                    so3Var7.b(true);
                }
                SelectedGiftData selectedGiftData3 = betslipActivity.y2().C;
                String str2 = AnalyticsParam.EVENT_STATUS_UNCHECKED;
                if (selectedGiftData3 == null || (rawGift2 = selectedGiftData3.getRawGift()) == null) {
                    zD1 = false;
                } else {
                    betslipActivity.e2();
                    zD1 = yyk.D1(rawGift2, bVar3.c);
                    if (zD1 && (selectedGiftData3.getUserSelect() || rawGift2.getCurrentBalance() > giftDetails2.getCurrentBalance() || (rawGift2.getCurrentBalance() == giftDetails2.getCurrentBalance() && Intrinsics.g(rawGift2.getGiftId(), giftDetails2.getGiftId())))) {
                        Pair pair = new Pair("source", "betslip");
                        if (selectedGiftData3.getChecked()) {
                            str2 = AnalyticsParam.EVENT_STATUS_CHECKED;
                        }
                        betslipActivity.C3(AnalyticsEvent.BETSLIP_GIFT_CHECKBOX_VIEW, kpu.f(pair, new Pair(AnalyticsParam.EVENT_STATUS, str2)));
                        betslipActivity.e2().I1(rawGift2, selectedGiftData3.getTotalStake(), selectedGiftData3.getGiftValue(), Boolean.valueOf(selectedGiftData3.getChecked()), Boolean.valueOf(selectedGiftData3.getAddToStake()), Boolean.valueOf(selectedGiftData3.getUserSelect()));
                        return;
                    }
                }
                boolean z4 = betslipActivity.y2().E;
                boolean z5 = (selectedGiftData3 == null || (rawGift = selectedGiftData3.getRawGift()) == null || Intrinsics.g(giftDetails2.getGiftId(), rawGift.getGiftId())) ? false : true;
                Pair pair2 = new Pair("source", "betslip");
                if (z4) {
                    str2 = AnalyticsParam.EVENT_STATUS_CHECKED;
                }
                betslipActivity.C3(AnalyticsEvent.BETSLIP_GIFT_CHECKBOX_VIEW, kpu.f(pair2, new Pair(AnalyticsParam.EVENT_STATUS, str2)));
                if (!betslipActivity.N1().m0() && z4 && z5) {
                    Snackbar snackbarH = Snackbar.h(betslipActivity.S1().a, betslipActivity.getCMSString(R.string.component_coupon__gift_updated_to_better_match_your_current_selection, new Object[0]), 0);
                    betslipActivity.p4(snackbarH);
                    betslipActivity.l2().c(AnalyticsEvent.BETSLIP_GIFT_UPDATED_SNACKBAR_VIEW, null, null);
                    y8j fullStoryCommonManager = betslipActivity.getFullStoryCommonManager();
                    BaseTransientBottomBar.SnackbarBaseLayout snackbarBaseLayout = snackbarH.i;
                    snackbarBaseLayout.getClass();
                    fullStoryCommonManager.c(snackbarBaseLayout, AnalyticsEvent.BETSLIP_GIFT_UPDATED_SNACKBAR);
                }
                if (!zD1 && betslipActivity.N1().m0() && selectedGiftData3 != null) {
                    betslipActivity.E2 = BetslipActivity.H3(selectedGiftData3.getTotalStake(), selectedGiftData3);
                }
                if (betslipActivity.N1().m0()) {
                    betslipActivity.y2().D = null;
                } else {
                    betslipActivity.y2().D = selectedGiftData3;
                }
                betslipActivity.e2().I1(bVar3.a, null, null, Boolean.valueOf(z4), null, null);
            }
        });
        q2().z1();
        ui90 ui90Var = s2().d;
        ui90Var.b();
        ui90Var.c();
        s2().v.f(this, new b0(new Function1() { // from class: lh3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Set<g08> set = BetslipActivity.X2;
                this.a.H2((ej90) obj);
                return Unit.a;
            }
        }));
        ej5.c(ebs.a(getLifecycle()), null, null, new oj3(this, s2().c.x, null, this), 3);
        ej5.c(ebs.a(getLifecycle()), null, null, new pj3(this, s2().c.A, null, this), 3);
        ej5.c(ebs.a(getLifecycle()), null, null, new qj3(this, new n1i(Q1().B1, q2().y, new uj3(3, null)), null, this), 3);
        ej5.c(ebs.a(getLifecycle()), null, null, new rj3(this, e2().T, null, this), 3);
        Q1().Q0();
        q73 q73VarQ4 = Q1();
        ej5.c(o8i0.d(q73VarQ4), null, null, new y63(q73VarQ4, null), 3);
        Q1().X0.f(this, new lfy() { // from class: mh3
            @Override // defpackage.lfy
            public final void u1(Object obj) throws Throwable {
                lk50 lk50Var = (lk50) obj;
                Set<g08> set = BetslipActivity.X2;
                lk50Var.getClass();
                if (lk50Var instanceof lk50.c) {
                    BetslipActivity betslipActivity = this.a;
                    if (betslipActivity.V1 || betslipActivity.isFinishing() || !betslipActivity.w1) {
                        return;
                    }
                    try {
                        for (BannedItemSocket bannedItemSocket : (List) ((lk50.c) lk50Var).a) {
                            String id = bannedItemSocket.getId();
                            ArrayList arrayListC = betslipActivity.N1().C();
                            int size = arrayListC.size();
                            int i6 = 0;
                            while (i6 < size) {
                                Object obj2 = arrayListC.get(i6);
                                i6++;
                                Selection selection = (Selection) obj2;
                                if (kotlin.text.c.l(id, selection.a.eventId, true)) {
                                    jrm jrmVarN1 = betslipActivity.N1();
                                    String str = selection.a.eventId;
                                    str.getClass();
                                    jrmVarN1.K(str, bannedItemSocket.getBanned());
                                    betslipActivity.B1 = true;
                                    betslipActivity.F1 = true;
                                    break;
                                }
                            }
                            ArrayList arrayListU = betslipActivity.N1().U();
                            int size2 = arrayListU.size();
                            int i7 = 0;
                            while (i7 < size2) {
                                Object obj3 = arrayListU.get(i7);
                                i7++;
                                if (kotlin.text.c.l(id, ((Selection) obj3).a.eventId, true)) {
                                    betslipActivity.w3(false);
                                }
                            }
                        }
                    } catch (Exception e3) {
                        itf0.a aVar3 = itf0.a;
                        aVar3.q(MyLog.TAG_COMMON);
                        aVar3.p(e3, "Banned API pushUpdateViews error: %s", e3.getMessage());
                    }
                }
            }
        });
        ej5.c(ebs.a(getLifecycle()), null, null, new sj3(this, Q1().n1, null, this), 3);
        ej5.c(ebs.a(getLifecycle()), null, null, new tj3(this, Q1().y0, null, this), 3);
        Q1().i1.f(this, new lfy() { // from class: nh3
            @Override // defpackage.lfy
            public final void u1(Object obj) {
                String str = (String) obj;
                Set<g08> set = BetslipActivity.X2;
                itf0.a aVar3 = itf0.a;
                aVar3.q(MyLog.TAG_BET_SLIP);
                aVar3.a("eventMessage: %s", str);
                if (str != null) {
                    this.a.e1.onNext(str);
                }
            }
        });
        ej5.c(ebs.a(getLifecycle()), null, null, new ej3(this, e1i.b(Q1().o0.h), null, this), 3);
        ej5.c(ebs.a(getLifecycle()), null, null, new fj3(this, e1i.b(Q1().m0.i), null, this), 3);
        ej5.c(ebs.a(getLifecycle()), null, null, new gj3(this, Q1().j0.e, null, this), 3);
        Q1().t1.f(this, new b0(new oh3(this, i3)));
        Q1().p1.f(this, new lfy() { // from class: ph3
            @Override // defpackage.lfy
            public final void u1(Object obj) {
                List list = (List) obj;
                Set<g08> set = BetslipActivity.X2;
                list.getClass();
                this.a.o1.i(list);
            }
        });
        Q1().r0.f(this, new lfy() { // from class: fg3
            @Override // defpackage.lfy
            public final void u1(Object obj) {
                CountDownTimer countDownTimer;
                f8a0 f8a0VarA;
                List<Event> list;
                tg10 tg10Var = (tg10) obj;
                Set<g08> set = BetslipActivity.X2;
                tg10Var.getClass();
                BaseResponse<OrderWithFailUpdate> baseResponse = tg10Var.a;
                ng10 ng10Var = tg10Var.b;
                final BetslipActivity betslipActivity = this.a;
                if (betslipActivity.isFinishing() || betslipActivity.a2 == 1 || (countDownTimer = betslipActivity.b2) == null) {
                    return;
                }
                countDownTimer.cancel();
                int i6 = 0;
                betslipActivity.l4(false);
                if (baseResponse == null) {
                    betslipActivity.k4(-1, null);
                    return;
                }
                if (baseResponse.bizCode == 10000) {
                    j990 j990Var = betslipActivity.z0;
                    if (j990Var == null) {
                        Intrinsics.n("shouldShowUniqueCodeInfoSheetUseCase");
                        throw null;
                    }
                    if (!((Boolean) dj5.a(e.a, new i990(j990Var, null))).booleanValue()) {
                        betslipActivity.G2(baseResponse.data, ng10Var);
                        return;
                    }
                    ak3 ak3Var = new ak3(betslipActivity, baseResponse, ng10Var);
                    FragmentManager supportFragmentManager = betslipActivity.getSupportFragmentManager();
                    supportFragmentManager.getClass();
                    new eeh0(ak3Var).show(supportFragmentManager, "UniqueBookingCodeInfoBottomSheetDialog");
                    return;
                }
                if (baseResponse.message == null) {
                    betslipActivity.k4(-1, null);
                    return;
                }
                q73 q73VarQ5 = betslipActivity.Q1();
                ej5.c(o8i0.d(q73VarQ5), q73VarQ5.S, null, new u73(q73VarQ5, Integer.valueOf(baseResponse.bizCode), baseResponse.message, null), 2);
                betslipActivity.Q1().M1 = false;
                betslipActivity.Q1().N1 = false;
                int i7 = baseResponse.bizCode;
                if (i7 == 4510) {
                    ArrayList arrayList = new ArrayList();
                    OrderWithFailUpdate orderWithFailUpdate = baseResponse.data;
                    if (orderWithFailUpdate != null && (list = orderWithFailUpdate.fcOutcomes) != null && !list.isEmpty()) {
                        OrderWithFailUpdate orderWithFailUpdate2 = baseResponse.data;
                        List list2 = orderWithFailUpdate2 != null ? orderWithFailUpdate2.fcOutcomes : null;
                        if (list2 == null) {
                            list2 = m2g.a;
                        }
                        arrayList.addAll(list2);
                    }
                    if (arrayList.isEmpty()) {
                        betslipActivity.F1 = betslipActivity.X2();
                        betslipActivity.B1 = true;
                        betslipActivity.I1(false);
                    } else {
                        itf0.a aVar3 = itf0.a;
                        aVar3.q(MyLog.TAG_ODDS_UPDATE);
                        aVar3.a("checkToUpdateCurrentSelections", new Object[0]);
                        BetslipActivity.z4(betslipActivity, arrayList, null, 0L, 0L, WebSocketProtocol.PAYLOAD_SHORT);
                    }
                } else if (i7 == 4600) {
                    betslipActivity.E4();
                } else if (i7 == 4310 || i7 == 4320) {
                    betslipActivity.C4(true, false);
                } else {
                    if (i7 == 4762 || i7 == 4759 || i7 == 4760) {
                        betslipActivity.g4(i7);
                        return;
                    }
                    if (i7 == 4801) {
                        ArrayList arrayList2 = new ArrayList();
                        ArrayList arrayListU = betslipActivity.N1().U();
                        int size = arrayListU.size();
                        while (i6 < size) {
                            Object obj2 = arrayListU.get(i6);
                            i6++;
                            Selection selection = (Selection) obj2;
                            if (betslipActivity.Q1().G1() != 1 || betslipActivity.t2().a(selection)) {
                                if (qz3.b(selection)) {
                                    arrayList2.add(selection);
                                }
                            }
                        }
                        q73 q73VarQ6 = betslipActivity.Q1();
                        ej5.c(o8i0.d(q73VarQ6), null, null, new p73(q73VarQ6, baseResponse, arrayList2, null), 3);
                        return;
                    }
                    if (i7 == 4200) {
                        q73 q73VarQ7 = betslipActivity.Q1();
                        ej5.c(o8i0.d(q73VarQ7), null, null, new o73(baseResponse, q73VarQ7, betslipActivity.Q1().G1(), null), 3);
                        return;
                    }
                    if (i7 == 80001) {
                        fbh0 fbh0VarC = sh8.c();
                        OrderWithFailUpdate orderWithFailUpdate3 = baseResponse.data;
                        fbh0VarC.b(x140.a(orderWithFailUpdate3 != null ? orderWithFailUpdate3.reachedLimits : null));
                        return;
                    }
                    if (i7 == 4901 || i7 == 4902 || i7 == 4903 || i7 == 4904) {
                        switch (i7) {
                            case 4901:
                                f8a0VarA = hsu.a(MarketingServiceType.MULTIPLE, new Function0() { // from class: ti3
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() throws Throwable {
                                        Set<g08> set2 = BetslipActivity.X2;
                                        BetslipActivity betslipActivity2 = betslipActivity;
                                        betslipActivity2.P1().f(false);
                                        betslipActivity2.e2().H1();
                                        betslipActivity2.L1.clear();
                                        betslipActivity2.B1();
                                        betslipActivity2.B4(true);
                                        betslipActivity2.w4(true, true);
                                        return Unit.a;
                                    }
                                });
                                break;
                            case 4902:
                                f8a0VarA = hsu.a(MarketingServiceType.BONUS, new ui3(betslipActivity, i6));
                                break;
                            case 4903:
                                f8a0VarA = hsu.a(MarketingServiceType.GIFT, new vi3(betslipActivity, i6));
                                break;
                            case 4904:
                                f8a0VarA = hsu.a(MarketingServiceType.LIVE_ODDS_BOOST, new wi3(betslipActivity, i6));
                                break;
                            default:
                                return;
                        }
                        u1k.a aVar4 = u1k.b;
                        FragmentManager supportFragmentManager2 = betslipActivity.getSupportFragmentManager();
                        supportFragmentManager2.getClass();
                        aVar4.getClass();
                        u1k.a.a(supportFragmentManager2, f8a0VarA);
                        return;
                    }
                }
                ArrayList arrayList3 = new ArrayList();
                arrayList3.add(new android.util.Pair("BaseResponse.message", baseResponse.message));
                arrayList3.add(new android.util.Pair("BaseResponse.BizCode", String.valueOf(baseResponse.bizCode)));
                w950.a("BetslipActivity", "PlaceBet", new Throwable(), arrayList3);
                betslipActivity.k4(baseResponse.bizCode, baseResponse.message);
            }
        });
        Q1().E0.f(this, new lfy() { // from class: gg3
            @Override // defpackage.lfy
            public final void u1(Object obj) {
                BetTypeFlexiBetConfig betTypeFlexiBetConfig = (BetTypeFlexiBetConfig) obj;
                BetslipActivity betslipActivity = this.a;
                boolean zG = Intrinsics.g(betTypeFlexiBetConfig, betslipActivity.J2);
                betslipActivity.J2 = betTypeFlexiBetConfig;
                if (zG) {
                    return;
                }
                betslipActivity.C4(true, false);
            }
        });
        q73 q73VarQ5 = Q1();
        jvh jvhVar = q73VarQ5.z;
        kzh.d(new yzh(new g1i(new g1i(new hvh(jvhVar.a.h(pu0.c.a), jvhVar), new ivh(jvhVar, null)), new z63(q73VarQ5, null)), new a73(3, null)), o8i0.d(q73VarQ5));
        this.m1.b(new vj3(this));
        Q1().G0.f(this, new lfy() { // from class: hg3
            @Override // defpackage.lfy
            public final void u1(Object obj) {
                this.a.K2 = (BetTypeAnyWinConfig) obj;
            }
        });
        q73 q73VarQ6 = Q1();
        kzh.d(new yzh(new g1i(q73VarQ6.y.f, new w63(q73VarQ6, null)), new x63(3, null)), o8i0.d(q73VarQ6));
        Q1().I0.f(this, new lfy() { // from class: ig3
            @Override // defpackage.lfy
            public final void u1(Object obj) {
                el0 el0Var = (el0) obj;
                Set<g08> set = BetslipActivity.X2;
                el0Var.getClass();
                BetslipActivity betslipActivity = this.a;
                boolean z3 = el0Var != betslipActivity.L2;
                betslipActivity.L2 = el0Var;
                luo luoVarA = vuo.a(betslipActivity.K2, el0Var, betslipActivity.R1());
                so3 so3Var = betslipActivity.p1;
                if (so3Var != null) {
                    so3Var.a.setAnyWinEnable(luoVarA);
                }
                if (z3) {
                    betslipActivity.Q1().O1(new v03.c(luoVarA == luo.c));
                }
            }
        });
        q73 q73VarQ7 = Q1();
        kzh.d(new yzh(new g1i(q73VarQ7.y.g, new u63(q73VarQ7, null)), new v63(q73VarQ7, null)), o8i0.d(q73VarQ7));
        ej5.c(ebs.a(getLifecycle()), null, null, new hj3(this, Q1().a1, null, this), 3);
        q73 q73VarQ8 = Q1();
        kzh.d(new g1i(q73VarQ8.A.g(), new h83(q73VarQ8, null, false)), o8i0.d(q73VarQ8));
        Q1().K0.f(this, new lfy() { // from class: jg3
            @Override // defpackage.lfy
            public final void u1(Object obj) {
                lk50 lk50Var = (lk50) obj;
                Set<g08> set = BetslipActivity.X2;
                boolean z3 = lk50Var instanceof lk50.c;
                BetslipActivity betslipActivity = this.a;
                if (z3) {
                    if (betslipActivity.N1().D()) {
                        betslipActivity.Q1().h0.g();
                    }
                    betslipActivity.N1().I1();
                    betslipActivity.N1().j1(betslipActivity);
                    betslipActivity.n4(R.string.component_betslip__bet_successfully_edited, 1);
                    long jCurrentTimeMillis = System.currentTimeMillis() - betslipActivity.c2;
                    if (jCurrentTimeMillis > 0) {
                        iym iymVarL2 = betslipActivity.l2();
                        Map<String, ? extends Object> mapB = jpu.b(new Pair(AnalyticsParam.KEY_BI_DURATION, Long.valueOf(jCurrentTimeMillis)));
                        PageMeta.INSTANCE.getClass();
                        iymVarL2.c(AnalyticsEvent.EDITBET_SUCCESS, mapB, new PageMeta("editbet", null));
                    }
                    betslipActivity.D1(true);
                    betslipActivity.i3();
                } else if (lk50Var instanceof lk50.a) {
                    Throwable th2 = ((lk50.a) lk50Var).a;
                    betslipActivity.V1 = false;
                    if (th2 instanceof SprThrowable) {
                        SprThrowable sprThrowable = (SprThrowable) th2;
                        if (sprThrowable.getD() == 80001) {
                            sh8.c().e(o7d.a(wae.REACHED_LIMITS));
                        } else {
                            betslipActivity.k4(sprThrowable.getD(), sprThrowable.getE());
                        }
                    } else if (th2 instanceof gnf) {
                        nnf nnfVar = betslipActivity.l2;
                        if (nnfVar != null) {
                            gnf gnfVar = (gnf) th2;
                            EditBetDlgType editBetDlgType = gnfVar.b;
                            String str = gnfVar.a.cashOut.maxCashOutAmount;
                            str.getClass();
                            nnfVar.a(new ErrorDataInfo(editBetDlgType, str));
                        }
                    } else {
                        betslipActivity.k4(-1, null);
                    }
                }
                betslipActivity.l4(false);
            }
        });
        Q1().M0.f(this, new lfy() { // from class: lg3
            @Override // defpackage.lfy
            public final void u1(Object obj) {
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                Set<g08> set = BetslipActivity.X2;
                this.a.S1().P.d.setEnabled(zBooleanValue);
            }
        });
        ej5.c(ebs.a(getLifecycle()), null, null, new jj3(this, Q1().O0, null, this), 3);
        Q1().R0.f(this, new lfy() { // from class: mg3
            @Override // defpackage.lfy
            public final void u1(Object obj) {
                BetslipActivity betslipActivity = this.a;
                betslipActivity.D1 = true;
                betslipActivity.I1(true);
                vn20.g("user_accept_change", betslipActivity.getAccountHelper().isLogin() ? betslipActivity.getAccountHelper().getUserId() : "no_account", true, false);
                betslipActivity.w4(true, true);
            }
        });
        Q1().t0.f(this, new lfy() { // from class: ng3
            @Override // defpackage.lfy
            public final void u1(Object obj) throws Throwable {
                Object value;
                LinkedHashMap linkedHashMap;
                EarlyPayoutMarket earlyPayoutMarketB;
                u7z u7zVar = (u7z) obj;
                Set<g08> set = BetslipActivity.X2;
                u7zVar.getClass();
                t7z t7zVar = u7zVar.a;
                BoreDrawConfig boreDrawConfig = u7zVar.b;
                final BetslipActivity betslipActivity = this.a;
                betslipActivity.N1().z0(boreDrawConfig);
                if (t7zVar instanceof t7z.a) {
                    aak aakVar = ((t7z.a) t7zVar).a;
                    if (aakVar == aak.c || aakVar == aak.d) {
                        betslipActivity.S1().D.b0 = null;
                        wwd0 wwd0Var = betslipActivity.j2().a;
                        o2g o2gVar = o2g.a;
                        o2gVar.getClass();
                        wwd0Var.getClass();
                        wwd0Var.k(null, o2gVar);
                    }
                    if (aakVar == aak.e) {
                        betslipActivity.p2().a(c980.a.b);
                    }
                    if (aakVar == aak.a || aakVar == aak.b) {
                        betslipActivity.p2().a(c980.a.a);
                    }
                    betslipActivity.m4(R.string.common_feedback__something_went_wrong_please_try_again_later);
                    betslipActivity.S1().D.setInsureOneTwoUpEnable(true);
                    betslipActivity.N1().r1();
                    betslipActivity.Q1().P0.a(a53.b.a);
                    betslipActivity.F4();
                    return;
                }
                if (t7zVar instanceof t7z.c) {
                    t7z.c cVar2 = (t7z.c) t7zVar;
                    List<Selection> list = cVar2.c;
                    List<Event> list2 = cVar2.a;
                    aak aakVar2 = cVar2.b;
                    aak aakVar3 = aak.i;
                    if (aakVar2 == aakVar3 || aakVar2 == aak.v) {
                        BetslipActivity.z4(betslipActivity, list2, list, cVar2.d, cVar2.e, 32);
                        betslipActivity.B1();
                        betslipActivity.Q1().U1();
                        if (aakVar2 == aakVar3) {
                            q73 q73VarQ9 = betslipActivity.Q1();
                            q73VarQ9.N.B0(q73VarQ9.j1);
                            betslipActivity.F4();
                            betslipActivity.A4();
                            betslipActivity.Q1().P0.a(a53.b.a);
                        }
                    } else if (aakVar2 == aak.c || aakVar2 == aak.d) {
                        betslipActivity.N1().S0(t880.a.a);
                        if (betslipActivity.j0 == null) {
                            Intrinsics.n("upSelectionValidationUseCase");
                            throw null;
                        }
                        list2.getClass();
                        if (list2.isEmpty()) {
                            betslipActivity.y4(cVar2.a, cVar2.c, cVar2.d, new j980(6), false, true);
                            betslipActivity.S1().a.post(new Runnable() { // from class: ri3
                                @Override // java.lang.Runnable
                                public final void run() {
                                    Set<g08> set2 = BetslipActivity.X2;
                                    BetslipActivity betslipActivity2 = betslipActivity;
                                    if (betslipActivity2.N1().m0()) {
                                        betslipActivity2.s3();
                                    }
                                }
                            });
                        } else {
                            Iterator<T> it = list2.iterator();
                            while (true) {
                                if (it.hasNext()) {
                                    Event event = (Event) it.next();
                                    List listC = kotlin.collections.a.c(event);
                                    if (listC != null) {
                                        if (listC.isEmpty()) {
                                            continue;
                                        } else {
                                            Iterator it2 = listC.iterator();
                                            while (true) {
                                                if (it2.hasNext()) {
                                                    List<Market> list3 = ((Event) it2.next()).markets;
                                                    if (list3 != null && !list3.isEmpty()) {
                                                        if (!list3.isEmpty()) {
                                                            Iterator<T> it3 = list3.iterator();
                                                            while (true) {
                                                                if (!it3.hasNext()) {
                                                                    continue;
                                                                } else if (xvy.a((Market) it3.next()) != null) {
                                                                }
                                                            }
                                                        }
                                                    }
                                                } else {
                                                    continue;
                                                }
                                            }
                                        }
                                    }
                                    List listC2 = kotlin.collections.a.c(event);
                                    if (listC2 != null) {
                                        if (listC2.isEmpty()) {
                                            continue;
                                        } else {
                                            Iterator it4 = listC2.iterator();
                                            while (true) {
                                                if (it4.hasNext()) {
                                                    List<Market> list4 = ((Event) it4.next()).markets;
                                                    if (list4 != null && !list4.isEmpty()) {
                                                        if (!list4.isEmpty()) {
                                                            Iterator<T> it5 = list4.iterator();
                                                            while (true) {
                                                                if (it5.hasNext()) {
                                                                    Market market = (Market) it5.next();
                                                                    if (market != null && (earlyPayoutMarketB = akf.b(market, tlc.a, true)) != null && earlyPayoutMarketB.getSupported() && rlc.f(market.id, market.specifier)) {
                                                                    }
                                                                } else {
                                                                    continue;
                                                                }
                                                            }
                                                        }
                                                    }
                                                } else {
                                                    continue;
                                                }
                                            }
                                        }
                                    }
                                    List listC3 = kotlin.collections.a.c(event);
                                    if (listC3 != null) {
                                        if (listC3.isEmpty()) {
                                            continue;
                                        } else {
                                            Iterator it6 = listC3.iterator();
                                            while (true) {
                                                if (it6.hasNext()) {
                                                    List<Market> list5 = ((Event) it6.next()).markets;
                                                    if (list5 != null && !list5.isEmpty()) {
                                                        if (!list5.isEmpty()) {
                                                            Iterator<T> it7 = list5.iterator();
                                                            while (true) {
                                                                if (!it7.hasNext()) {
                                                                    continue;
                                                                } else if (xvy.b((Market) it7.next()) != null) {
                                                                }
                                                            }
                                                        }
                                                    }
                                                } else {
                                                    continue;
                                                }
                                            }
                                        }
                                    }
                                    betslipActivity.S1().D.b0 = null;
                                    betslipActivity.S1().D.setInsureOneTwoUpEnable(true);
                                    betslipActivity.m4(R.string.common_feedback__something_went_wrong_please_try_again_later);
                                } else {
                                    betslipActivity.y4(cVar2.a, cVar2.c, cVar2.d, new j980(6), false, true);
                                    betslipActivity.S1().a.post(new Runnable() { // from class: ri3
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            Set<g08> set2 = BetslipActivity.X2;
                                            BetslipActivity betslipActivity2 = betslipActivity;
                                            if (betslipActivity2.N1().m0()) {
                                                betslipActivity2.s3();
                                            }
                                        }
                                    });
                                }
                            }
                        }
                        zry zryVarJ2 = betslipActivity.j2();
                        list.getClass();
                        if (!list.isEmpty()) {
                            ArrayList arrayList = new ArrayList(l48.r(list, 10));
                            Iterator<T> it8 = list.iterator();
                            while (it8.hasNext()) {
                                arrayList.add(o980.a((Selection) it8.next()));
                            }
                            Set setE0 = CollectionsKt.E0(arrayList);
                            wwd0 wwd0Var2 = zryVarJ2.a;
                            do {
                                value = wwd0Var2.getValue();
                                linkedHashMap = new LinkedHashMap();
                                for (Map.Entry entry : ((Map) value).entrySet()) {
                                    if (!setE0.contains((String) entry.getKey())) {
                                        linkedHashMap.put(entry.getKey(), entry.getValue());
                                    }
                                }
                            } while (!wwd0Var2.g(value, linkedHashMap));
                        }
                        betslipActivity.F4();
                    } else if (aakVar2 == aak.a || aakVar2 == aak.b) {
                        betslipActivity.N1().S0(t880.a.b);
                        if (betslipActivity.q0 == null) {
                            Intrinsics.n("checkEarlyGoalOutcomeResponseValidUseCase");
                            throw null;
                        }
                        list2.getClass();
                        if (list2.isEmpty()) {
                            betslipActivity.y4(cVar2.a, cVar2.c, cVar2.d, new j980(5), false, true);
                        } else {
                            Iterator<T> it9 = list2.iterator();
                            while (true) {
                                if (it9.hasNext()) {
                                    List<Market> list6 = ((Event) it9.next()).markets;
                                    if (list6 != null && !list6.isEmpty()) {
                                        if (!list6.isEmpty()) {
                                            Iterator<T> it10 = list6.iterator();
                                            while (true) {
                                                if (!it10.hasNext()) {
                                                    continue;
                                                } else if (yay.e((Market) it10.next()) != null) {
                                                }
                                            }
                                        }
                                    }
                                    betslipActivity.S1().D.setInsureEarlyGoalsLoading(false);
                                    betslipActivity.m4(R.string.common_feedback__something_went_wrong_please_try_again_later);
                                    y8j fullStoryCommonManager = betslipActivity.getFullStoryCommonManager();
                                    ConstraintLayout constraintLayout = betslipActivity.S1().a;
                                    constraintLayout.getClass();
                                    fullStoryCommonManager.c(constraintLayout, AnalyticsEvent.EG_NO_AVAILABLE_EG_ERROR_TOAST);
                                } else {
                                    betslipActivity.y4(cVar2.a, cVar2.c, cVar2.d, new j980(5), false, true);
                                }
                            }
                        }
                        betslipActivity.A4();
                        betslipActivity.p2().b(list, c980.a.a);
                    } else if (aakVar2 == aak.e) {
                        betslipActivity.N1().S0(t880.a.c);
                        if (betslipActivity.k0 == null) {
                            Intrinsics.n("neverDownSelectionValidationUseCase");
                            throw null;
                        }
                        list2.getClass();
                        if (list2.isEmpty()) {
                            betslipActivity.y4(cVar2.a, cVar2.c, cVar2.d, new j980(3), false, true);
                            betslipActivity.S1().a.post(new Runnable() { // from class: ri3
                                @Override // java.lang.Runnable
                                public final void run() {
                                    Set<g08> set2 = BetslipActivity.X2;
                                    BetslipActivity betslipActivity2 = betslipActivity;
                                    if (betslipActivity2.N1().m0()) {
                                        betslipActivity2.s3();
                                    }
                                }
                            });
                        } else {
                            Iterator<T> it11 = list2.iterator();
                            while (true) {
                                if (it11.hasNext()) {
                                    List listC4 = kotlin.collections.a.c((Event) it11.next());
                                    if (listC4 != null) {
                                        if (!listC4.isEmpty()) {
                                            Iterator it12 = listC4.iterator();
                                            while (true) {
                                                if (it12.hasNext()) {
                                                    List<Market> list7 = ((Event) it12.next()).markets;
                                                    if (list7 != null && !list7.isEmpty()) {
                                                        if (!list7.isEmpty()) {
                                                            Iterator<T> it13 = list7.iterator();
                                                            while (true) {
                                                                if (!it13.hasNext()) {
                                                                    continue;
                                                                } else if (qvy.b((Market) it13.next()) != null) {
                                                                }
                                                            }
                                                        }
                                                    }
                                                } else {
                                                    continue;
                                                }
                                            }
                                        }
                                    }
                                    betslipActivity.m4(R.string.common_feedback__something_went_wrong_please_try_again_later);
                                } else {
                                    betslipActivity.y4(cVar2.a, cVar2.c, cVar2.d, new j980(3), false, true);
                                    betslipActivity.S1().a.post(new Runnable() { // from class: ri3
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            Set<g08> set2 = BetslipActivity.X2;
                                            BetslipActivity betslipActivity2 = betslipActivity;
                                            if (betslipActivity2.N1().m0()) {
                                                betslipActivity2.s3();
                                            }
                                        }
                                    });
                                }
                            }
                        }
                        betslipActivity.p2().b(list, c980.a.b);
                    } else if (aakVar2 == aak.f) {
                        betslipActivity.y4(list2, list, cVar2.d, null, true, true);
                    } else {
                        betslipActivity.m4(R.string.common_feedback__sorry_something_went_wrong);
                    }
                    betslipActivity.Q1().P0.a(a53.b.a);
                }
            }
        });
        Q1().v0.f(this, new lfy() { // from class: og3
            @Override // defpackage.lfy
            public final void u1(Object obj) {
                uh30 uh30Var = (uh30) obj;
                Set<g08> set = BetslipActivity.X2;
                uh30Var.getClass();
                if (uh30Var instanceof uh30.b) {
                    BetslipActivity betslipActivity = this.a;
                    if (betslipActivity.V1) {
                        return;
                    }
                    bi30 bi30Var = betslipActivity.x0;
                    if (bi30Var == null) {
                        Intrinsics.n("quickLiabilityCheckResultValidationUseCase");
                        throw null;
                    }
                    if (bi30Var.a(uh30Var) == ai30.a) {
                        betslipActivity.q4(false);
                        betslipActivity.I1(false);
                    }
                }
            }
        });
        Q1().l1.f(this, new lfy() { // from class: pg3
            @Override // defpackage.lfy
            public final void u1(Object obj) {
                com.sporty.android.common.uievent.a aVar3 = (com.sporty.android.common.uievent.a) obj;
                Set<g08> set = BetslipActivity.X2;
                aVar3.getClass();
                BetslipActivity betslipActivity = this.a;
                com.sporty.android.common.uievent.e eVar = betslipActivity.R;
                if (eVar != null) {
                    eVar.c(aVar3, betslipActivity, betslipActivity.findViewById(R.id.layout_container), null);
                } else {
                    Intrinsics.n("commonUiEventProcessor");
                    throw null;
                }
            }
        });
        ej5.c(ebs.a(getLifecycle()), null, null, new kj3(this, Q1().r1, null, this), 3);
        Q1().x1.f(this, new lfy() { // from class: rg3
            @Override // defpackage.lfy
            public final void u1(Object obj) {
                tzs tzsVar = (tzs) obj;
                Set<g08> set = BetslipActivity.X2;
                tzsVar.getClass();
                boolean z3 = tzsVar instanceof tzs.b;
                BetslipActivity betslipActivity = this.a;
                if (z3) {
                    betslipActivity.S1().Q.setVisibility(0);
                } else {
                    betslipActivity.S1().Q.setVisibility(8);
                }
            }
        });
        Q1().v1.f(this, new lfy() { // from class: sg3
            @Override // defpackage.lfy
            public final void u1(Object obj) {
                c330 c330Var = (c330) obj;
                Set<g08> set = BetslipActivity.X2;
                c330Var.getClass();
                boolean z3 = c330Var instanceof c330.b;
                BetslipActivity betslipActivity = this.a;
                if (z3) {
                    betslipActivity.S1().P.b.setOnClickListener(new ai3());
                    betslipActivity.S1().P.c.setVisibility(0);
                    betslipActivity.S1().P.b.setText("");
                } else if (c330Var instanceof c330.a) {
                    betslipActivity.S1().P.b.setOnClickListener(betslipActivity);
                    betslipActivity.S1().P.c.setVisibility(8);
                    UiText uiText = ((c330.a) c330Var).b;
                    if (uiText != null) {
                        betslipActivity.S1().P.b.setText(uiText.e(betslipActivity));
                    }
                }
            }
        });
        Q1().X1();
        Q1().C1.f(this, new b0(new tg3(this, i3)));
        ej5.c(ebs.a(getLifecycle()), null, null, new lj3(this, (lyh) ((ruy) this.K0.getValue()).c.getValue(), null, this), 3);
        ((ujf) this.L0.getValue()).d.f(this, new lfy() { // from class: ug3
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r1v4, types: [m2g] */
            /* JADX WARN: Type inference failed for: r1v5, types: [java.util.Collection, java.util.List] */
            /* JADX WARN: Type inference failed for: r1v6, types: [java.util.ArrayList] */
            /* JADX WARN: Type inference failed for: r8v1, types: [com.sportybet.plugin.realsports.betslip.widget.BetslipActivity] */
            /* JADX WARN: Type inference fix 'apply assigned field type' failed
            java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
            	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
            	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
            	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
             */
            @Override // defpackage.lfy
            public final void u1(Object obj) throws Throwable {
                ?? arrayList;
                Market market;
                Map map = (Map) obj;
                Set<g08> set = BetslipActivity.X2;
                map.getClass();
                ?? r8 = this.a;
                mjf mjfVar3 = r8.U;
                if (mjfVar3 == null) {
                    Intrinsics.n("earlyPayoutConfigManager");
                    throw null;
                }
                ckf ckfVar = ckf.c;
                if (mjfVar3.d(ckfVar)) {
                    EarlyPayoutConfig earlyPayoutConfig = (EarlyPayoutConfig) map.get(ckfVar);
                    if (earlyPayoutConfig != null) {
                        r8.M2 = earlyPayoutConfig;
                        xnh xnhVar = r8.m0;
                        if (xnhVar == null) {
                            Intrinsics.n("findEarlyGoalInvalidSelectionsUseCase");
                            throw null;
                        }
                        ArrayList arrayListU = xnhVar.a.U();
                        try {
                            arrayList = new ArrayList();
                            int size = arrayListU.size();
                            int i6 = 0;
                            while (i6 < size) {
                                Object obj2 = arrayListU.get(i6);
                                i6++;
                                Selection selection = (Selection) obj2;
                                if (yay.i(selection) && ((market = selection.b) == null || !xnhVar.b.e(ckf.c, market.isLive()))) {
                                    arrayList.add(obj2);
                                }
                            }
                        } catch (Exception e3) {
                            e3.printStackTrace();
                            arrayList = m2g.a;
                        }
                        if (!arrayList.isEmpty()) {
                            r8.p3(arrayList);
                        }
                    }
                    r8.A4();
                    r8.Q1().P0.a(a53.b.a);
                    so3 so3Var = r8.p1;
                    if (so3Var != null) {
                        so3Var.d(vuo.d(r8.J2, r8.O1()), vuo.f(r8.T1(), r8.m1, r8.O1()), vuo.a(r8.K2, r8.L2, r8.R1()), vuo.c(r8.M2, r8.N1()), r8.x2().d(), r8.Q1().J1());
                    }
                    mgd0 mgd0Var = r8.S1().D.G;
                    if ((mgd0Var.X.getVisibility() == 0 && mgd0Var.Y.getVisibility() == 8) || ((mgd0Var.C0.getVisibility() == 0 && mgd0Var.D0.getVisibility() == 8) || (mgd0Var.Q0.getVisibility() == 0 && mgd0Var.R0.getVisibility() == 8))) {
                        r8.C3(AnalyticsEvent.EG_CHECKBOX_INSURE_BETSLIP_VIEW, jpu.b(new Pair("value", r8.S1().D.getInsureEarlyPayoutActive() ? AnalyticsParam.EVENT_STATUS_ON : AnalyticsParam.EVENT_STATUS_OFF)));
                    }
                }
            }
        });
        ((eja0) this.R0.getValue()).i.f(this, new lfy() { // from class: wg3
            /* JADX WARN: Multi-variable type inference failed */
            @Override // defpackage.lfy
            public final void u1(Object obj) {
                jox joxVar = (jox) obj;
                Set<g08> set = BetslipActivity.X2;
                joxVar.getClass();
                boolean z3 = joxVar instanceof jox.a;
                BetslipActivity betslipActivity = this.a;
                if (z3) {
                    ej5.c(ebs.a(betslipActivity.getLifecycle()), null, null, new bj3(betslipActivity, (zha0) ((jox.a) joxVar).a, null), 3);
                } else if (joxVar instanceof jox.c) {
                    betslipActivity.W3(false);
                    zyf0.c(1, ((jox.c) joxVar).a.getMessage());
                }
            }
        });
        ((fj2) this.S0.getValue()).w.f(this, new lfy() { // from class: xg3
            @Override // defpackage.lfy
            public final void u1(Object obj) throws Throwable {
                BetBuilderDataWSelections betBuilderDataWSelections = (BetBuilderDataWSelections) obj;
                Set<g08> set = BetslipActivity.X2;
                if (betBuilderDataWSelections == null || betBuilderDataWSelections.getPushChanges() == null) {
                    return;
                }
                BetBuilderData betBuilderData = betBuilderDataWSelections.getBetBuilderData();
                ArrayList arrayListC = g880.C(betBuilderDataWSelections.getSelections());
                Event event = ((Selection) arrayListC.get(0)).a;
                int i6 = event.isLiveOrFinished() ? 1 : 3;
                boolean zG = Intrinsics.g(betBuilderDataWSelections.getPushChanges(), Boolean.TRUE);
                BetslipActivity betslipActivity = this.a;
                if (zG) {
                    betslipActivity.B1 = true;
                    event.changeFlag = true;
                }
                itf0.a aVar3 = itf0.a;
                aVar3.q("BetBuilder");
                aVar3.a("Selection replaced! - marketId:%s", betBuilderData.getMarketId());
                betslipActivity.N1().N0(apg.f(event), qg2.a(betBuilderData, betslipActivity, i6), qg2.b(betBuilderData, betslipActivity), true, (14336 & 16) != 0 ? false : false, (14336 & 32) != 0 ? null : arrayListC, (14336 & 64) != 0 ? k980.DEFAULT : null, (14336 & 128) != 0 ? false : false, (14336 & 256) != 0 ? false : false, (14336 & 512) != 0 ? false : false, (14336 & 1024) != 0 ? null : null, (14336 & 2048) != 0 ? false : false, (14336 & 4096) != 0 ? false : false, false);
                betslipActivity.w3(false);
                betslipActivity.Q1().P0.a(a53.b.a);
            }
        });
        i2i.c(h2().e, null, 3).f(this, new lfy() { // from class: yg3
            @Override // defpackage.lfy
            public final void u1(Object obj) {
                com.sporty.android.common.uievent.a aVar3 = (com.sporty.android.common.uievent.a) obj;
                Set<g08> set = BetslipActivity.X2;
                aVar3.getClass();
                BetslipActivity betslipActivity = this.a;
                com.sporty.android.common.uievent.e eVar = betslipActivity.R;
                if (eVar != null) {
                    eVar.c(aVar3, betslipActivity, betslipActivity.S1().a, null);
                } else {
                    Intrinsics.n(siPCzPFw.qGUyQdYyDxcQN);
                    throw null;
                }
            }
        });
        i2i.c(h2().i, null, 3).f(this, new lfy() { // from class: zg3
            @Override // defpackage.lfy
            public final void u1(Object obj) {
                String strName;
                mws mwsVar = (mws) obj;
                Set<g08> set = BetslipActivity.X2;
                mwsVar.getClass();
                boolean z3 = mwsVar instanceof mws.a;
                BetslipActivity betslipActivity = this.a;
                if (z3) {
                    mws.a aVar3 = (mws.a) mwsVar;
                    betslipActivity.q3(aVar3.a, aVar3.b, aVar3.c);
                    return;
                }
                if (!(mwsVar instanceof mws.c)) {
                    if (mwsVar instanceof mws.b) {
                        BookingCodePanel bookingCodePanel = betslipActivity.S1().i;
                        bookingCodePanel.M.e.setText("");
                        bookingCodePanel.K(null);
                        bookingCodePanel.M.f.setEnabled(false);
                        return;
                    }
                    return;
                }
                mws.c cVar2 = (mws.c) mwsVar;
                String str = cVar2.a;
                if (str == null || str.length() <= 0) {
                    return;
                }
                List<Event> list = cVar2.b;
                g08 g08Var = cVar2.c;
                g08 g08Var2 = g08.UNKNOWN;
                if (g08Var != g08.UNKNOWN) {
                    strName = g08Var.name();
                } else {
                    strName = betslipActivity.q1;
                    if (strName == null) {
                        strName = "SINGLE_LIVE_BET";
                    }
                }
                ekl.b(betslipActivity, str, list, strName, true, cVar2.d);
            }
        });
        i2i.c(h2().w, null, 3).f(this, new lfy() { // from class: ah3
            @Override // defpackage.lfy
            public final void u1(Object obj) {
                tzs tzsVar = (tzs) obj;
                Set<g08> set = BetslipActivity.X2;
                tzsVar.getClass();
                this.a.S1().i.setIsLoadButtonLoading(tzsVar instanceof tzs.b);
            }
        });
        i2i.c(h2().z, null, 3).f(this, new lfy() { // from class: bh3
            @Override // defpackage.lfy
            public final void u1(Object obj) {
                Set<g08> set = BetslipActivity.X2;
                this.a.S1().i.setBookingCodeTextFieldWarningUiText((UiText) obj);
            }
        });
        i2i.c(X1().w, null, 3).f(this, new lfy() { // from class: dh3
            @Override // defpackage.lfy
            public final void u1(Object obj) {
                com.sporty.android.common.uievent.a aVar3 = (com.sporty.android.common.uievent.a) obj;
                Set<g08> set = BetslipActivity.X2;
                aVar3.getClass();
                BetslipActivity betslipActivity = this.a;
                com.sporty.android.common.uievent.e eVar = betslipActivity.R;
                if (eVar != null) {
                    eVar.c(aVar3, betslipActivity, betslipActivity.S1().a, null);
                } else {
                    Intrinsics.n("commonUiEventProcessor");
                    throw null;
                }
            }
        });
        i2i.c(X1().z, null, 3).f(this, new lfy() { // from class: eh3
            @Override // defpackage.lfy
            public final void u1(Object obj) {
                mws.c cVar2;
                String str;
                String strName;
                mws mwsVar = (mws) obj;
                Set<g08> set = BetslipActivity.X2;
                mwsVar.getClass();
                boolean z3 = mwsVar instanceof mws.a;
                BetslipActivity betslipActivity = this.a;
                if (z3) {
                    betslipActivity.q3(((mws.a) mwsVar).a, null, null);
                    return;
                }
                if (!(mwsVar instanceof mws.c) || (str = (cVar2 = (mws.c) mwsVar).a) == null || str.length() <= 0) {
                    return;
                }
                List<Event> list = cVar2.b;
                g08 g08Var = cVar2.c;
                g08 g08Var2 = g08.UNKNOWN;
                if (g08Var != g08.UNKNOWN) {
                    strName = g08Var.name();
                } else {
                    strName = betslipActivity.q1;
                    if (strName == null) {
                        strName = "FEATURED_BOOKING_CODE_EMPTY_BETSLIP";
                    }
                }
                ekl.b(betslipActivity, str, list, strName, true, cVar2.d);
            }
        });
        i2i.c(X1().B, null, 3).f(this, new lfy() { // from class: fh3
            @Override // defpackage.lfy
            public final void u1(Object obj) {
                wz80 wz80Var = (wz80) obj;
                Set<g08> set = BetslipActivity.X2;
                wz80Var.getClass();
                xz80 xz80Var = this.a.T;
                if (xz80Var != null) {
                    xz80Var.a(wz80Var);
                } else {
                    Intrinsics.n("shareCodeNavigator");
                    throw null;
                }
            }
        });
        i2i.c(X1().U, null, 3).f(this, new lfy() { // from class: hh3
            @Override // defpackage.lfy
            public final void u1(Object obj) {
                jj40 jj40Var = (jj40) obj;
                Set<g08> set = BetslipActivity.X2;
                jj40Var.getClass();
                this.a.S1().i.setRecommendedCodeHeaderUiState(jj40Var);
            }
        });
        i2i.c(X1().V, null, 3).f(this, new lfy() { // from class: ih3
            @Override // defpackage.lfy
            public final void u1(Object obj) {
                lk50<List<gz4>> lk50Var = (lk50) obj;
                Set<g08> set = BetslipActivity.X2;
                lk50Var.getClass();
                this.a.S1().i.setFeaturedCodesUiState(lk50Var);
            }
        });
        X1().A1(new aj40.a(null, false), sch.a, false, false, "recommended_code_when_empty");
        X1().x1();
        if (N1().m0()) {
            N1().p0(false);
        }
        g9d0 g9d0Var = this.P;
        if (g9d0Var == null) {
            Intrinsics.n("sportySimBadgeHelper");
            throw null;
        }
        uh3 uh3Var = new uh3(this, i3);
        zu7.a aVar3 = zu7.a;
        ej5.c(zu7.b(g9d0Var.c), null, null, new f9d0(g9d0Var, uh3Var, null), 3);
        ComposeView composeView6 = S1().F;
        u6i0.a aVar4 = u6i0.a.a;
        composeView6.setViewCompositionStrategy(aVar4);
        ComposeView composeView7 = S1().B;
        k53 k53VarC = iu2.c();
        boolean zL = iu2.l();
        k53VarC.getClass();
        composeView7.setVisibility(kotlin.collections.a.c(k53.EDIT).contains(k53VarC) & (zL ^ true) ? 0 : 8);
        ComposeView composeView8 = S1().B;
        composeView8.setViewCompositionStrategy(aVar4);
        composeView8.setContent(sw9.a);
        Drawable background = S1().b.getBackground();
        background.getClass();
        ((TransitionDrawable) background).startTransition(300);
        Animation animationLoadAnimation = AnimationUtils.loadAnimation(this, R.anim.activity_slide_enter_bottom);
        animationLoadAnimation.reset();
        S1().O.clearAnimation();
        S1().O.startAnimation(animationLoadAnimation);
        if (getIntent().getBooleanExtra("extra_show_replace_dialog", false)) {
            g950 g950Var = new g950(new Function0() { // from class: xh3
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() throws Throwable {
                    k980 k980Var;
                    Set<g08> set = BetslipActivity.X2;
                    BetslipActivity betslipActivity = this.a;
                    betslipActivity.N1().X0(true);
                    betslipActivity.A3(true);
                    int intExtra = betslipActivity.getIntent().getIntExtra("extra_selection_mode", 0);
                    ArrayList arrayList = betslipActivity.v1;
                    if (arrayList != null) {
                        int size = arrayList.size();
                        int i6 = 0;
                        while (i6 < size) {
                            Object obj = arrayList.get(i6);
                            i6++;
                            Selection selection = (Selection) obj;
                            jrm jrmVarN1 = betslipActivity.N1();
                            Event event = selection.a;
                            Market market = selection.b;
                            Outcome outcome = selection.c;
                            k980.b.getClass();
                            k980[] k980VarArrValues = k980.values();
                            int length = k980VarArrValues.length;
                            int i7 = 0;
                            while (true) {
                                if (i7 >= length) {
                                    k980Var = null;
                                    break;
                                }
                                k980Var = k980VarArrValues[i7];
                                if (k980Var.a == intExtra) {
                                    break;
                                }
                                i7++;
                            }
                            if (k980Var == null) {
                                k980Var = k980.DEFAULT;
                            }
                            jrmVarN1.N(event, market, outcome, k980Var, selection.d);
                        }
                    }
                    betslipActivity.N1().X0(false);
                    betslipActivity.R1().q(0);
                    betslipActivity.B4(false);
                    betslipActivity.P2();
                    return Unit.a;
                }
            });
            FragmentManager supportFragmentManager = getSupportFragmentManager();
            supportFragmentManager.getClass();
            cr0.a(g950Var, supportFragmentManager, "ReplaceDialog");
        }
        O2();
        S1().f.setOnClickListener(new View.OnClickListener() { // from class: vh3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Set<g08> set = BetslipActivity.X2;
                this.a.Q1().A1(aq3.g.a);
            }
        });
        ej5.c(ebs.a(getLifecycle()), null, null, new zi3(this, Q1().f1, null, this), 3);
        Q1().A1(aq3.c.a);
        i2i.c(L1().h(pu0.b.a), null, 3).f(this, new lfy() { // from class: si3
            /* JADX WARN: Multi-variable type inference failed */
            @Override // defpackage.lfy
            public final void u1(Object obj) {
                lk50 lk50Var = (lk50) obj;
                Set<g08> set = BetslipActivity.X2;
                lk50Var.getClass();
                boolean z3 = lk50Var instanceof lk50.c;
                BetslipActivity betslipActivity = this.a;
                if (z3) {
                    betslipActivity.M3((AssetsInfo) ((lk50.c) lk50Var).a);
                    int iG1 = betslipActivity.Q1().G1();
                    if (iG1 == 1) {
                        betslipActivity.Y3(false, betslipActivity.R1().e0());
                    } else if (iG1 == 2) {
                        betslipActivity.R3(false, betslipActivity.R1().d0());
                    } else if (iG1 == 3) {
                        betslipActivity.d4();
                    }
                } else {
                    betslipActivity.M3(null);
                }
                betslipActivity.Q1().A1(aq3.e.a);
            }
        });
        i2i.c(Q1().V0, null, 3).f(this, new lfy() { // from class: qe3
            @Override // defpackage.lfy
            public final void u1(Object obj) {
                BookingData bookingData = (BookingData) obj;
                Set<g08> set = BetslipActivity.X2;
                bookingData.getClass();
                String str = bookingData.shareCode;
                BetslipActivity betslipActivity = this.a;
                if (betslipActivity.getAccountHelper().hasPersonalPage()) {
                    if (str == null || str.length() == 0) {
                        return;
                    }
                    ((eja0) betslipActivity.R0.getValue()).x1(str);
                    return;
                }
                Boolean bool = Boolean.TRUE;
                Boolean bool2 = Boolean.FALSE;
                ej5.c(ebs.a(betslipActivity.getLifecycle()), null, null, new bj3(betslipActivity, new zha0(bool, bool2, bool2, betslipActivity.getAccountHelper().getLastNickName(), betslipActivity.getAccountHelper().getAvatarUrl()), null), 3);
            }
        });
        i2i.c(Q1().T0, null, 3).f(this, new lfy() { // from class: re3
            @Override // defpackage.lfy
            public final void u1(Object obj) {
                tzs tzsVar = (tzs) obj;
                Set<g08> set = BetslipActivity.X2;
                tzsVar.getClass();
                boolean z3 = tzsVar instanceof tzs.a;
                final BetslipActivity betslipActivity = this.a;
                if (z3) {
                    betslipActivity.S1().P.i.postDelayed(new Runnable() { // from class: af3
                        @Override // java.lang.Runnable
                        public final void run() {
                            Set<g08> set2 = BetslipActivity.X2;
                            betslipActivity.W3(false);
                        }
                    }, 200L);
                } else if (tzsVar instanceof tzs.b) {
                    betslipActivity.W3(true);
                }
            }
        });
    }

    @Override // defpackage.py1, defpackage.hrl, defpackage.fq0, androidx.fragment.app.e, android.app.Activity
    public final void onDestroy() {
        if (this.F0 == null) {
            super.onDestroy();
            return;
        }
        if (isFinishing()) {
            wwd0 wwd0Var = p2().a;
            o2g o2gVar = o2g.a;
            o2gVar.getClass();
            wwd0Var.getClass();
            wwd0Var.k(null, o2gVar);
        }
        M1().i.removeCallbacksAndMessages(null);
        this.c1.removeCallbacksAndMessages(null);
        Q1().N1();
        for (c9p c9pVar : this.R2.values()) {
            if (c9pVar != null) {
                c9pVar.cancel((CancellationException) null);
            }
        }
        this.R2.clear();
        super.onDestroy();
        SocketPushManager.getInstance().unsubscribeTopic(this.j1, this.U2);
        SocketPushManager.getInstance().unsubscribeTopic(this.i1, this.V2);
        SocketPushManager.getInstance().unsubscribeTopic(this.k1, this.W2);
        Q1().A1(aq3.b.a);
        ((br3) mmc.a(hp0.A, br3.class)).U().M = false;
        BookingCodePanel bookingCodePanel = S1().i;
        bookingCodePanel.L();
        bookingCodePanel.M.V.f(null);
        bookingCodePanel.M.V.setAdapter(null);
        CountDownTimer countDownTimer = this.b2;
        if (countDownTimer != null) {
            countDownTimer.cancel();
            this.b2 = null;
        }
        getAccountHelper().removeAccountChangeListener(this);
        dx4 dx4VarU1 = U1();
        vg3 vg3Var = this.T2;
        ArrayList arrayList = dx4VarU1.a;
        if (arrayList.contains(vg3Var)) {
            arrayList.remove(vg3Var);
        }
        U1().c.d();
        this.d1.d();
        if (getCountryManager().r()) {
            w2().d(this);
        }
        so3 so3Var = this.p1;
        if (so3Var != null) {
            so3Var.a.e();
        }
        this.m1.a.d();
        com.sporty.android.common.uievent.e eVar = this.R;
        if (eVar == null) {
            Intrinsics.n("commonUiEventProcessor");
            throw null;
        }
        eVar.a();
        R1().Q(null);
        R1().v(null);
        R1().D(null);
        R1().h0(null);
        this.c2 = 0L;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.c2 = 0L;
    }

    @Override // defpackage.rn8, android.app.Activity
    public final void onNewIntent(Intent intent) {
        intent.getClass();
        super.onNewIntent(intent);
        overridePendingTransition(0, 0);
        this.q1 = getIntent().getStringExtra("action_load_booking_code_from");
        Q1().Y1(this.q1);
        String str = this.q1;
        if (str != null) {
            C3(AnalyticsEvent.CODE_BTN_ADD_TO_BETSLIP, jpu.b(new Pair("from", str)));
        }
        intent.addFlags(65536);
        if (intent.getBooleanExtra("EXTRA_SHOULD_CLOSE_BETSLIP", true)) {
            finish();
        }
        overridePendingTransition(0, 0);
        startActivity(intent);
    }

    @Override // defpackage.py1, androidx.fragment.app.e, android.app.Activity
    public final void onPause() {
        super.onPause();
        this.x1 = false;
        Q1().A1(aq3.d.a);
        N1().j1(this);
        lop.b(S1().i.M.e, Boolean.FALSE);
        this.c2 = 0L;
    }

    @Override // defpackage.py1, androidx.fragment.app.e, android.app.Activity
    public final void onResume() {
        super.onResume();
        if (izw.a.a().r()) {
            R1().clear();
            t4(Q1().G1());
            I4();
            S1().S.post(new lf3());
        }
        if (!N1().o0()) {
            Q1().X1();
            Q1().O1(new v03.x(AnalyticsEvent.BETSLIP_VIEW, Q1().E1()));
            y8j fullStoryCommonManager = getFullStoryCommonManager();
            o2g o2gVar = o2g.a;
            o2gVar.getClass();
            fullStoryCommonManager.f(AnalyticsEvent.BETSLIP_VIEW, o2gVar);
        }
        Q1().A1(aq3.f.a);
        vnh vnhVar = this.p0;
        if (vnhVar == null) {
            Intrinsics.n("findCurrentDuplicatedEarlyGoalSelectionsUseCase");
            throw null;
        }
        List<Selection> listA = vnhVar.a();
        if (!listA.isEmpty()) {
            int size = listA.size();
            for (int i3 = 0; i3 < size; i3++) {
                H1(listA.get(i3));
            }
            Q1().P0.a(a53.b.a);
            x3();
            w4(true, true);
        }
        ujf ujfVar = (ujf) this.L0.getValue();
        kzh.d(new g1i(ujfVar.a.a(), new tjf(ujfVar, null)), o8i0.d(ujfVar));
        q73 q73VarQ1 = Q1();
        q73VarQ1.i0.b(N1().m0());
    }

    @Override // androidx.fragment.app.e
    public final void onResumeFragments() throws Throwable {
        super.onResumeFragments();
        this.x1 = true;
        this.H1 = false;
        ((br3) mmc.a(hp0.A, br3.class)).U().f(false);
        N1().m1(this);
        if (this.w1 && (Q1().f1.a.getValue() instanceof cs3.c)) {
            z3();
            if (this.W1) {
                l4(true);
            } else if (this.X1) {
                k4(this.Y1, this.Z1);
            } else {
                w3(false);
            }
            S1().P.w.setEnabled(true);
        }
    }

    @Override // defpackage.rn8, defpackage.yn8, android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        bundle.getClass();
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("arg_is_quick_sim_bet_consumed", this.A1);
    }

    @Override // defpackage.fq0, androidx.fragment.app.e, android.app.Activity
    public final void onStop() {
        super.onStop();
        this.c2 = 0L;
        yyk yykVarE2 = e2();
        ou90 ou90Var = yykVarE2.f;
        if (yykVarE2.B1().isEmpty()) {
            ou90Var.a.k(null, new n780.a(1));
        } else {
            List<GiftGroup> listB1 = yykVarE2.B1();
            ou90Var.getClass();
            listB1.getClass();
            ou90Var.a.k(null, new n780.d(listB1));
        }
        yykVarE2.M1((n780) ou90Var.a.getValue());
        if (Q1().f1.a.getValue() instanceof cs3.b) {
            finish();
        }
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        view.getClass();
        motionEvent.getClass();
        if (view.getId() == R.id.bs_header_parent || view.getId() == R.id.grey_container) {
            float y2 = motionEvent.getY();
            int action = motionEvent.getAction();
            if (action == 0) {
                this.z1 = y2;
            } else if (action == 1) {
                float f3 = y2 - this.z1;
                if (Math.abs(f3) > 10.0f && f3 > 0.0f) {
                    ((br3) mmc.a(hp0.A, br3.class)).U().e();
                    finish();
                }
            }
        }
        return view.getId() != R.id.grey_container;
    }

    public final c980 p2() {
        c980 c980Var = this.h0;
        if (c980Var != null) {
            return c980Var;
        }
        Intrinsics.n("selectionPendingToggleHolder");
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0062  */
    public final void p3(Collection<? extends Selection> collection) throws Throwable {
        g08 g08Var;
        so3 so3Var = this.p1;
        if (so3Var != null) {
            BetSlipFooter betSlipFooter = so3Var.a;
            SimShareData simShareData = SimShareData.INSTANCE;
            simShareData.resetAutoBetTimes();
            mgd0 mgd0Var = betSlipFooter.G;
            mgd0Var.H0.E(simShareData.getAutoBetTimes());
            mgd0Var.l0.E(simShareData.getAutoBetTimes());
        }
        if (!collection.isEmpty()) {
            String str = this.q1;
            if (str == null) {
                g08Var = null;
            } else {
                int iHashCode = str.hashCode();
                if (iHashCode != -417496532) {
                    if (iHashCode != 486844938) {
                        if (iHashCode == 2003408396 && str.equals("LOAD_BOOKING_CODE_EMPTY_BETSLIP")) {
                            g08Var = g08.LOAD_BOOKING_CODE_REMOVE_MATCH;
                        } else {
                            g08Var = null;
                        }
                    } else if (str.equals("REBET_SUCCESSFUL_SAME")) {
                        g08Var = g08.REBET_SUCCESSFUL_REMOVED_SELECTIONS;
                    } else {
                        g08Var = null;
                    }
                } else if (str.equals("LOAD_CODE_FROM_CODEHUB")) {
                    g08Var = g08.LOAD_CODE_FROM_CODEHUB_REMOVE_MATCH;
                } else {
                    g08Var = null;
                }
            }
            if (g08Var != null) {
                this.q1 = g08Var.name();
                getIntent().putExtra("action_load_booking_code_from", this.q1);
            }
        }
        Iterator<? extends Selection> it = collection.iterator();
        while (it.hasNext()) {
            H1(it.next());
        }
        if (N1().U().isEmpty()) {
            o8s o8sVarG2 = g2();
            o8sVarG2.b.k0(null);
            o8sVarG2.c.add(h8s.c);
            if (N1().m0()) {
                F3();
                s3();
            }
        }
        B1();
        if (Q1().G1() == 1) {
            r4(this.N1, false);
        }
        x3();
        w4(true, true);
    }

    public final void p4(Snackbar snackbar) {
        BaseTransientBottomBar.SnackbarBaseLayout snackbarBaseLayout = snackbar.i;
        snackbarBaseLayout.getClass();
        ViewGroup.LayoutParams layoutParams = snackbarBaseLayout.getLayoutParams();
        layoutParams.getClass();
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
        ((TextView) snackbarBaseLayout.findViewById(R.id.snackbar_action)).setAllCaps(false);
        layoutParams2.setMargins(bqe.a(12.0f) + layoutParams2.leftMargin, layoutParams2.topMargin, bqe.a(12.0f) + layoutParams2.rightMargin, bqe.a(60.0f) + layoutParams2.bottomMargin);
        snackbarBaseLayout.setLayoutParams(layoutParams2);
        snackbarBaseLayout.setBackground(getDrawable(R.drawable.bg_snackbar));
        snackbar.j();
    }

    public final sa90 q2() {
        return (sa90) this.Y0.getValue();
    }

    public final void q4(boolean z2) {
        String string;
        String str;
        if (isFinishing()) {
            return;
        }
        com.sportybet.plugin.realsports.betslip.widget.d dVar = (com.sportybet.plugin.realsports.betslip.widget.d) getSupportFragmentManager().H("ConfirmFragment");
        if (!z2) {
            if (dVar != null) {
                kvh kvhVar = this.G2;
                if (!kvhVar.a) {
                    dVar.dismissAllowingStateLoss();
                    return;
                }
                if (kvhVar.c != null) {
                    BetTypeFlexiBetConfig betTypeFlexiBetConfig = this.J2;
                    if ((betTypeFlexiBetConfig != null ? betTypeFlexiBetConfig.getFlexibleMinOdds() : null) != null) {
                        BigDecimal bigDecimal = this.G2.c;
                        BetTypeFlexiBetConfig betTypeFlexiBetConfig2 = this.J2;
                        if (bigDecimal.compareTo(betTypeFlexiBetConfig2 != null ? betTypeFlexiBetConfig2.getFlexibleMinOdds() : null) >= 0) {
                            kvh kvhVar2 = this.G2;
                            BigDecimal bigDecimal2 = kvhVar2.d;
                            BigDecimal bigDecimal3 = kvhVar2.e;
                            int i3 = kvhVar2.b;
                            int iC = O1().C();
                            TextView textView = dVar.Y;
                            if (textView == null || dVar.Z == null || dVar.a0 == null) {
                                return;
                            }
                            textView.setBackgroundColor(dVar.requireContext().getColor(R.color.brand_secondary_variable_type1));
                            dVar.Z.setBackgroundColor(dVar.requireContext().getColor(R.color.brand_secondary_variable_type1));
                            dVar.a0.setBackgroundColor(dVar.requireContext().getColor(R.color.brand_secondary_variable_type1));
                            TextView textView2 = dVar.Y;
                            Locale locale = Locale.US;
                            textView2.setText(String.format(locale, "%.2f", bigDecimal2));
                            dVar.Z.setText(gky.a.a(bjb0.L(bigDecimal3, locale), false));
                            j7g j7gVar = new j7g("");
                            j7gVar.a(Integer.valueOf(i3).toString());
                            j7gVar.a(" of ");
                            j7gVar.a(Integer.valueOf(iC).toString());
                            dVar.a0.setText(j7gVar);
                            return;
                        }
                    }
                }
                dVar.dismissAllowingStateLoss();
                return;
            }
            return;
        }
        if (this.G2.c != null) {
            BetTypeFlexiBetConfig betTypeFlexiBetConfig3 = this.J2;
            if ((betTypeFlexiBetConfig3 != null ? betTypeFlexiBetConfig3.getFlexibleMinOdds() : null) != null) {
                BigDecimal bigDecimal4 = this.G2.c;
                BetTypeFlexiBetConfig betTypeFlexiBetConfig4 = this.J2;
                if (bigDecimal4.compareTo(betTypeFlexiBetConfig4 != null ? betTypeFlexiBetConfig4.getFlexibleMinOdds() : null) < 0 && this.G2.a && !N1().m0()) {
                    androidx.appcompat.app.b.a title = new androidx.appcompat.app.b.a(this).setTitle(getCMSString(R.string.common_functions__note, new Object[0]));
                    BetTypeFlexiBetConfig betTypeFlexiBetConfig5 = this.J2;
                    title.a.f = getCMSString(R.string.component_betslip__flexibet_feature_cannot_be_applied_tip, String.valueOf(betTypeFlexiBetConfig5 != null ? betTypeFlexiBetConfig5.getFlexibleMinOdds() : null));
                    title.c(getCMSString(R.string.common_functions__ok, new Object[0]), new ne3());
                    androidx.appcompat.app.b bVarCreate = title.create();
                    bVarCreate.getClass();
                    bVarCreate.setCanceledOnTouchOutside(false);
                    bVarCreate.show();
                    return;
                }
            }
        }
        if (dVar != null || !this.x1) {
            itf0.a aVar = itf0.a;
            aVar.q(MyLog.TAG_BET_SLIP);
            aVar.a("the dialog is already on the screen or activity isn't on the screen", new Object[0]);
            return;
        }
        String string2 = Q1().H1(Q1().G1()).toString();
        string2.getClass();
        if (string2.length() == 0) {
            return;
        }
        if (Y1() == 1 && !this.A2) {
            v2().b = 0;
        }
        if (d2().h(Q1().G1(), Integer.valueOf(Y1())) && d2().i(Q1().G1())) {
            String str2 = y2().c;
            string = BigDecimal.valueOf(Double.parseDouble(string2)).subtract(BigDecimal.valueOf(str2 != null ? Double.parseDouble(str2) : 0.0d)).toString();
            string.getClass();
            this.f2 = string;
        } else {
            this.f2 = string2;
            string = string2;
        }
        if (string.length() > 0 && Double.parseDouble(this.f2) < 0.0d) {
            this.f2 = "0";
        }
        if (this.B2.length() != 0) {
            try {
                if (new BigDecimal(this.B2).compareTo(Q1().H1(Q1().G1())) > 0) {
                    o2g o2gVar = o2g.a;
                    o2gVar.getClass();
                    C3(AnalyticsEvent.BETSLIP_TOTAL_STAKE_INCLUDE_GIFT_CHANGE, o2gVar);
                }
            } catch (Exception e3) {
                itf0.a aVar2 = itf0.a;
                aVar2.q(MyLog.TAG_BET_SLIP);
                aVar2.c(e3, "Error parsing initTotalStakeForGift", new Object[0]);
            }
        }
        if (q2().y.getValue() instanceof vwv.c) {
            double d3 = this.g2 - this.F2;
            if (d3 > 0.0d) {
                str = AnalyticsParam.DATA_HIGHER;
            } else {
                str = d3 < 0.0d ? AnalyticsParam.DATA_LOWER : AnalyticsParam.DATA_UNCHANGE;
            }
            C3(AnalyticsEvent.BETSLIP_STAKE_TEXTFIELD_PLACE_BET, kpu.f(new Pair(AnalyticsParam.EVENT_PARAM_STAKE_CHANGE, str), new Pair(AnalyticsParam.EVENT_PARAM_DELTA_AMOUNT, String.valueOf(d3))));
        }
        Bundle bundle = new Bundle();
        bundle.putString("realPay", Q1().z1(this.f2));
        bundle.putInt("gift_count", y2().b);
        bundle.putBoolean("key_is_sim_bet", N1().m0());
        bundle.putString("key_total_odds_for_gift", this.w2);
        bundle.putString("key_bonus_rate_for_gift", this.x2);
        bundle.putString("key_max_win_for_gift", this.y2);
        bundle.putString("key_max_bonus_for_gift", this.z2);
        bundle.putBoolean("key_is_show_WHTax", Q1().c1.hasRate(N1().m0()));
        bundle.putInt("key_simulated_auto_bet_times", SimShareData.INSTANCE.getAutoBetTimes());
        bundle.putBoolean("useBalance", Q1().G1() == 1 || Q1().G1() == 2 || Q1().G1() == 3);
        bundle.putBoolean("is_support_free_bet", d2().e(Q1().G1()));
        bundle.putString("totalstake", Q1().z1(string2));
        bundle.putInt("orderType", Y1());
        jrm jrmVar = Q1().N;
        bundle.putBoolean("has_bet_builder_selections", jrmVar.V() && jrmVar.Q0() <= 0);
        if (!d2().h(Q1().G1(), Integer.valueOf(Y1())) || this.H2.a) {
            bundle.putString("key_gift_id", null);
            bundle.putInt("key_gift_kind", 0);
            bundle.putString("gift_value", null);
        } else {
            bundle.putString("key_gift_id", y2().d);
            bundle.putInt("key_gift_kind", y2().e);
            bundle.putString("gift_value", y2().c);
        }
        if (this.G2.c != null) {
            BetTypeFlexiBetConfig betTypeFlexiBetConfig6 = this.J2;
            if ((betTypeFlexiBetConfig6 != null ? betTypeFlexiBetConfig6.getFlexibleMinOdds() : null) != null) {
                BigDecimal bigDecimal5 = this.G2.c;
                BetTypeFlexiBetConfig betTypeFlexiBetConfig7 = this.J2;
                if (bigDecimal5.compareTo(betTypeFlexiBetConfig7 != null ? betTypeFlexiBetConfig7.getFlexibleMinOdds() : null) >= 0) {
                    kvh kvhVar3 = this.G2;
                    if (kvhVar3.a) {
                        BigDecimal bigDecimal6 = kvhVar3.e;
                        bundle.putString("flexiodds", bigDecimal6 != null ? bigDecimal6.toString() : "0.0");
                        bundle.putInt("flexicount", this.G2.b);
                        bundle.putInt("totalcount", O1().C());
                        bundle.putString("potentialwin", this.G2.d.toString());
                    }
                }
            }
        }
        com.sportybet.plugin.realsports.betslip.widget.d dVarQ0 = com.sportybet.plugin.realsports.betslip.widget.d.q0(bundle);
        dVarQ0.j0 = new n2();
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        supportFragmentManager.getClass();
        dVarQ0.show(supportFragmentManager, "ConfirmFragment");
    }

    @Override // defpackage.to3
    public final void r() throws Throwable {
        if (!U2()) {
            R2();
        }
        C4(true, false);
        so3 so3Var = this.p1;
        if (so3Var != null && !so3Var.a.G.U.isChecked()) {
            Q1().P0.a(a53.b.a);
            gl0 gl0Var = this.Z;
            if (gl0Var == null) {
                Intrinsics.n("anyWinDomainService");
                throw null;
            }
            gl0Var.a(getLifecycle(), false);
        }
        B1();
        J3();
    }

    /* JADX WARN: Code duplicated, block: B:14:0x002a  */
    public final boolean r2() {
        if (!N1().m0() && getAccountHelper().isLogin()) {
            String userId = getAccountHelper().getUserId();
            if (userId == null) {
                userId = "no_account";
            } else {
                if (StringsKt.U(userId)) {
                    userId = null;
                }
                if (userId == null) {
                    userId = "no_account";
                }
            }
            long j3 = getSharedPreferences("default_gift_betslip_ts", 0).getLong(userId, 0L);
            if (j3 == 0) {
                getSharedPreferences("default_gift_betslip_ts", 0).edit().putLong(userId, System.currentTimeMillis()).commit();
                return true;
            }
            if (System.currentTimeMillis() - j3 <= 604800000) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x006a  */
    public final void r3() {
        FragmentManager supportFragmentManager;
        String str;
        r rVar = new r();
        try {
            Context contextB = dvi.b(this);
            contextB.getClass();
            supportFragmentManager = ((androidx.fragment.app.e) contextB).getSupportFragmentManager();
            try {
                if (supportFragmentManager.H("BetSettingDlg") != null) {
                    itf0.a aVar = itf0.a;
                    aVar.q("BetSettingDlg");
                    aVar.a("a dialog is already on the screen", new Object[0]);
                } else if (supportFragmentManager != null && !supportFragmentManager.K) {
                    qz2 qz2Var = new qz2();
                    qz2Var.y = rVar;
                    qz2Var.setCancelable(true);
                    qz2Var.show(supportFragmentManager, "BetSettingDlg");
                }
            } catch (ClassCastException unused) {
                itf0.a aVar2 = itf0.a;
                aVar2.q("BetSettingDlg");
                aVar2.a("Can't get fragment manager", new Object[0]);
            }
        } catch (ClassCastException unused2) {
            supportFragmentManager = null;
        }
        if (S1().E.getSettingNewFlagVisible()) {
            String userId = getAccountHelper().getUserId();
            if (userId == null) {
                str = "no_account";
            } else {
                str = StringsKt.U(userId) ? null : userId;
                if (str == null) {
                    str = "no_account";
                }
            }
            getSharedPreferences("default_gift_betslip_ts", 0).edit().putLong(str, System.currentTimeMillis() - 691200000).commit();
        }
        S1().E.G(false);
    }

    public final void r4(boolean z2, boolean z3) {
        if (z2 && N1().W()) {
            S1().y.setVisibility(0);
            S1().y.getViewTreeObserver().addOnGlobalLayoutListener(new o2());
            if (vn20.c("sportybet", "first_single", true)) {
                vn20.g("sportybet", "first_single", false, false);
                T3(1500L, false).setAnimationListener(new p2());
            }
            if (this.O1 == 0) {
                S1().y.setEnabled(false);
                S1().z.setText(getCMSString(R.string.component_betslip__no_games_available_to_boost, new Object[0]));
                so3 so3Var = this.p1;
                if (so3Var != null) {
                    so3Var.a.J(false);
                }
                S1().A.setText(getCMSString(R.string.component_betslip__u_boost, new Object[0]));
                S1().w.setBackgroundColor(getColor(R.color.custom_background_type2_for_iv_primary_type1));
                S1().w.setImageResource(R.drawable.ic_boost_unchecked);
                S1().v.setBackgroundColor(getColor(R.color.custom_background_type2_for_iv_primary_type1));
                zch0.k(this, S1().Y, Color.parseColor("#dcdee5"));
                T3(1L, true);
            } else {
                S1().y.setEnabled(true);
                S1().z.setText(getCMSString(R.string.component_betslip__live_odds_boost, new Object[0]));
                so3 so3Var2 = this.p1;
                if (so3Var2 != null) {
                    so3Var2.a.J(N1().M());
                }
                x4(N1().M());
                T3(1L, !N1().M());
            }
        } else {
            so3 so3Var3 = this.p1;
            if (so3Var3 != null) {
                so3Var3.a.J(false);
            }
            S1().E.setSinglesCompoundDrawable(null, null, null, null);
            S1().y.setVisibility(8);
            Unit unit = Unit.a;
        }
        if (Q1().G1() != 1 || z3) {
            return;
        }
        Y3(false, R1().e0());
    }

    @Override // defpackage.to3
    public final void s0(boolean z2) {
        if (S1().P.e.getVisibility() == 0) {
            return;
        }
        int size = O1().s().size();
        if (size > gvh.b) {
            n4(R.string.component_betslip__feature_is_constrained_for_certain_selections, 0);
            return;
        }
        boolean zL = O1().L(N1().m0());
        this.G2.b = O1().w();
        if (this.G2.b < 2) {
            n4(R.string.component_betslip__feature_is_constrained_for_certain_selections, 0);
            return;
        }
        if (zL) {
            n4(R.string.component_betslip__feature_is_unavailable_for_contingent_outcomes, 0);
            return;
        }
        if ((z2 && size - this.G2.b == 1) || (!z2 && this.G2.b <= gvh.a(size))) {
            n4(R.string.component_betslip__feature_is_constrained_for_certain_selections, 0);
            return;
        }
        O1().O(z2);
        C4(false, false);
        this.c1.removeCallbacks(this.S2);
        this.c1.postDelayed(this.S2, 100L);
        f00 f00Var = vgb0.a;
        vgb0.c(AnalyticsEvent.BETSLIP_FLEXIBET, jpu.b(new Pair("type", z2 ? "up" : "down")), false);
    }

    public final aj90 s2() {
        return (aj90) this.a1.getValue();
    }

    public final void s3() {
        s2().y1();
    }

    /* JADX WARN: Code duplicated, block: B:105:0x0295  */
    /* JADX WARN: Multi-variable type inference failed */
    public final void s4(boolean z2, boolean z3) {
        if (!z2 && this.t2) {
            this.t2 = false;
            z2();
        }
        if (z3) {
            this.G2.a = false;
            this.H2.a = false;
            this.I2.a = false;
            so3 so3Var = this.p1;
            if (so3Var != null) {
                BetSlipFooter betSlipFooter = so3Var.a;
                mgd0 mgd0Var = betSlipFooter.G;
                betSlipFooter.getBetStore().G(false);
                betSlipFooter.getBetStore().K(false);
                betSlipFooter.getBetStore().E(false);
                mgd0Var.N.setChecked(false);
                mgd0Var.s0.setChecked(false);
                mgd0Var.U.setChecked(false);
                betSlipFooter.V = false;
                mgd0Var.T.setVisibility(8);
            }
            S1().K.setVisibility(8);
            S1().J.setVisibility(8);
            N2();
        }
        if (!z2) {
            S1().E.setSimButtonsEnabled(true, getAccountHelper().isLogin());
        }
        if (!N1().D()) {
            N1().r0(z2 ? k53.SIM : k53.REAL);
        }
        if (z3) {
            G3(z2);
        }
        N1().b1();
        O1().B();
        if (this.p2 && !z2) {
            this.p2 = false;
            L1().g();
            z2();
        }
        S1().V.a.setVisibility(z2 ? 0 : 8);
        if (!N1().U().isEmpty()) {
            X3(false);
            S1().E.setRemoveAllBtnEnabled((Z2() || c3() || d3() || e3()) ? false : true);
            if (Q1().G1() == 1 && !z2) {
                Y3(true, R1().e0());
            }
        } else if (z2) {
            X3(true);
        } else {
            S1().E.setBetSlipNumberBackground(getDrawable(R.drawable.spr_shape_bg_grey_circle_24dp));
            S1().E.setBetSlipNumberTextColor(getColor(R.color.text_type2_secondary));
            i4();
        }
        ogd0 ogd0Var = S1().E.F;
        if (z2) {
            ShimmerFrameLayout shimmerFrameLayout = ogd0Var.C.c;
            shimmerFrameLayout.d();
            shimmerFrameLayout.c = false;
            shimmerFrameLayout.invalidate();
            ogd0Var.C.c.d();
        } else {
            ogd0Var.C.c.c();
        }
        S1().E.setSwitchRealToSim(z2, Q1().J1());
        S1().E.G(r2());
        Q1().S1(z2);
        N3();
        S1().E.F.c.setVisibility(z2 ? 8 : 0);
        S1().E.setBetBonusHintCount();
        if (!N1().U().isEmpty()) {
            S1().P.f.setVisibility(z2 ? 8 : 0);
            S1().P.y.setVisibility((z2 || N1().e()) ? 8 : 0);
            S1().P.z.setVisibility(z2 ? 0 : 8);
            H4();
        }
        S1().E.setDisplayTypeMenuVisibility(!z2, (q43) Q1().C1.d());
        S1().V.b.setVisibility((z2 && N1().u0()) ? 0 : 8);
        if (!z2) {
            HashSet<com.sportybet.plugin.realsports.betslip.widget.f.a> hashSet = com.sportybet.plugin.realsports.betslip.widget.f.a;
            com.sportybet.plugin.realsports.betslip.widget.f.b(com.sportybet.plugin.realsports.betslip.widget.f.a.c);
            S1().L.setVisibility(8);
        }
        k3(z2);
        if (Q1().G1() != 3 || z2) {
            int size = N1().U().size();
            if (z2) {
                if (size > 1) {
                    t4(2);
                } else if (size == 1) {
                    t4(1);
                }
            } else if (qz3.g() || Q1().G1() == 1) {
                if (N1().U().size() > 1) {
                    k980 k980VarD0 = N1().d0();
                    k980VarD0.getClass();
                    if (k980VarD0 == k980.RECOMMENDED_CODE) {
                        t4(2);
                    }
                }
                t4(1);
            } else {
                t4(2);
            }
        } else {
            t4(3);
        }
        V3(z2);
        if (this.q2 && N1().U().isEmpty()) {
            S1().E.setRemoveAllBtnEnabled(false);
            S1().G.setVisibility(8);
            S1().V.a.setVisibility(8);
        }
        if (N1().M1() && !this.H1) {
            N1().c(this);
            I1(false);
            this.H1 = true;
        }
        if (N1().W() && this.N1 && N1().U().size() == 1) {
            S1().y.setVisibility(0);
        } else {
            S1().y.setVisibility(8);
        }
        if (iu2.p() && ((ArrayList) iu2.d()).size() == 1 && this.N1) {
            D4(R1().d0(), N1().U().size(), 1L, false);
        }
        M2(z2);
        if (!z2) {
            S1().E.E();
        }
        b4();
        S1().E.setRemoveContainerVisibility((q43) Q1().C1.d());
        so3 so3Var2 = this.p1;
        if (so3Var2 != null) {
            boolean z4 = y2().i;
            BetSlipFooter betSlipFooter2 = so3Var2.a;
            betSlipFooter2.F(z2, z3, z4);
            mgd0 mgd0Var2 = betSlipFooter2.G;
            if ((!SimShareData.INSTANCE.isAutoBetEnabled() || !z2) && !lw2.d.P()) {
                EditTextWithKeyBoard editTextWithKeyBoard = mgd0Var2.j0;
                editTextWithKeyBoard.i.setText("");
                editTextWithKeyBoard.J = false;
                editTextWithKeyBoard.c();
            }
        }
        if (z2 && Q1().G1() == 2) {
            D4(R1().d0(), N1().U().size(), 1L, false);
        }
        if (iu2.p() && ((ArrayList) iu2.d()).size() == 1) {
            R1().Q(null);
            Q1().P0.a(a53.b.a);
        }
        C1();
        so3 so3Var3 = this.p1;
        if (so3Var3 != null) {
            so3Var3.a.E(z2, vuo.d(this.J2, O1()), vuo.f(T1(), this.m1, O1()), vuo.a(this.K2, this.L2, R1()), vuo.c(this.M2, N1()), qz3.g(), Q1().J1());
        }
        e2().E1();
        t4(Q1().G1());
        q73 q73VarQ1 = Q1();
        wwd0 wwd0Var = q73VarQ1.I1;
        pjh0 pjh0Var = q73VarQ1.U;
        v03.q qVar = (v03.q) wwd0Var.getValue();
        pjh0Var.getClass();
        qVar.getClass();
        wwd0Var.k(null, v03.q.a(qVar, null, null, null, pjh0Var.b.W() ? "real" : "sim", null, null, null, null, null, null, 0, 0, 0, 0, 0, null, null, null, null, false, null, 0, 0, 8388599));
        so3 so3Var4 = this.p1;
        if (so3Var4 != null) {
            int iG1 = Q1().G1();
            cqe0 cqe0Var = this.u0;
            if (cqe0Var != null) {
                so3Var4.a.setWarningAndInputUIStatus(iG1, "", cqe0Var.d().compareTo(cqe0Var.f.a()) > 0);
            } else {
                Intrinsics.n("systemBetUseCases");
                throw null;
            }
        }
    }

    public final gt90 t2() {
        gt90 gt90Var = this.r0;
        if (gt90Var != null) {
            return gt90Var;
        }
        Intrinsics.n("singleBetSelectionStakeValidationUseCase");
        throw null;
    }

    public final void t3(UserAddress userAddress, BigDecimal bigDecimal) {
        ej5.c(ebs.a(getLifecycle()), null, null, new s(null), 3);
        so3 so3Var = this.p1;
        if (so3Var != null) {
            so3Var.a.k();
        }
        this.c2 = System.currentTimeMillis();
        this.V1 = true;
        q73 q73VarQ1 = Q1();
        int iY1 = Y1();
        String string = Q1().H1(Q1().G1()).toString();
        string.getClass();
        int i3 = this.G2.b;
        Set<g08> set = m290.a;
        ej5.c(o8i0.d(q73VarQ1), q73VarQ1.S, null, new v73(q73VarQ1, iY1, string, m290.a(this.q1), i3, null), 2);
        ng10 ng10VarK1 = K1(userAddress, bigDecimal);
        if (ng10VarK1 == null) {
            this.V1 = false;
            k4(-1, null);
            return;
        }
        l4(true);
        this.b2 = new t().start();
        q73 q73VarQ2 = Q1();
        Set<Topic> subscribedTopics = q73VarQ2.Z.getSubscribedTopics(q73VarQ2.j1);
        LinkedHashSet linkedHashSetR0 = q73VarQ2.N.R0();
        if (!linkedHashSetR0.isEmpty() && !subscribedTopics.isEmpty() && !linkedHashSetR0.equals(subscribedTopics)) {
            q73VarQ2.T1(new s53(CollectionsKt.a0(subscribedTopics, ",", null, null, null, 62), CollectionsKt.a0(linkedHashSetR0, ",", null, null, null, 62)));
        }
        g2().c.clear();
        wwd0 wwd0Var = Q1().w0;
        i8s i8sVar = i8s.a;
        wwd0Var.getClass();
        wwd0Var.k(null, i8sVar);
        q73 q73VarQ3 = Q1();
        long j3 = this.S1;
        boolean z2 = this.T1;
        q73VarQ3.K1 = Long.valueOf(System.currentTimeMillis());
        q73VarQ3.L1 = false;
        q73VarQ3.M1 = true;
        ct90 ct90VarA = ru90.a(q73VarQ3.D.a(ng10VarK1.a), q73VarQ3.a);
        final d63 d63Var = new d63(q73VarQ3, j3, z2, ng10VarK1);
        pya pyaVar = new pya() { // from class: e63
            @Override // defpackage.pya
            public final void accept(Object obj) {
                d63Var.invoke(obj);
            }
        };
        final f63 f63Var = new f63(q73VarQ3, j3, z2, ng10VarK1);
        rya ryaVar = new rya(pyaVar, new pya() { // from class: g63
            @Override // defpackage.pya
            public final void accept(Object obj) {
                f63Var.invoke(obj);
            }
        });
        ct90VarA.a(ryaVar);
        q73VarQ3.x1(ryaVar);
    }

    public final void t4(final int i3) {
        if (i3 != Q1().G1()) {
            R1().w(null);
        }
        int iG1 = Q1().G1();
        if (iG1 != 1) {
            if (iG1 != 2) {
                if (iG1 == 3) {
                    if (i3 == 1) {
                        this.y1 = r53.f;
                    } else if (i3 == 2) {
                        this.y1 = r53.i;
                    }
                }
            } else if (i3 == 1) {
                this.y1 = r53.d;
            } else if (i3 == 3) {
                this.y1 = r53.e;
            }
        } else if (i3 == 2) {
            this.y1 = r53.b;
        } else if (i3 == 3) {
            this.y1 = r53.c;
        }
        if (Q1().G1() == 3 && R1().b0() != null) {
            R1().D(null);
            R1().h0(null);
            Q1().P0.a(a53.b.a);
            this.c1.postDelayed(new Runnable() { // from class: bi3
                @Override // java.lang.Runnable
                public final void run() {
                    Set<g08> set = BetslipActivity.X2;
                    int i4 = i3;
                    BetslipActivity betslipActivity = this;
                    if (i4 == 1) {
                        betslipActivity.Z3();
                    } else if (i4 == 2) {
                        betslipActivity.Q3();
                    } else if (i4 == 3) {
                        betslipActivity.c4();
                    }
                    betslipActivity.Q1().P0.a(a53.b.a);
                }
            }, 100L);
            return;
        }
        if (i3 == 1) {
            Z3();
        } else if (i3 == 2) {
            Q3();
        } else if (i3 == 3) {
            c4();
        }
        Q1().P0.a(a53.b.a);
    }

    public final it90 u2() {
        it90 it90Var = this.s0;
        if (it90Var != null) {
            return it90Var;
        }
        Intrinsics.n("singleBetUseCases");
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x008a  */
    /* JADX WARN: Code duplicated, block: B:65:0x0289  */
    public final void u3(int i3) {
        Object obj;
        String string;
        long jLongValue;
        boolean z2;
        boolean addToStake;
        CharSequence charSequence;
        String giftValue;
        String str;
        Object obj2;
        int i4;
        String str2;
        this.V1 = true;
        int i5 = 0;
        S1().E.setSimButtonsEnabled(false, getAccountHelper().isLogin());
        String str3 = "odds";
        String str4 = AnalyticsParam.EVENT_PARAM_ID;
        int iG1 = Q1().G1();
        String str5 = SimulateBetConsts.BetslipType.CUTBET;
        Object obj3 = SimulateBetConsts.BetslipType.SINGLE;
        if (iG1 == 1) {
            obj = SimulateBetConsts.BetslipType.SINGLE;
        } else if (this.G2.a) {
            obj = SimulateBetConsts.BetslipType.FLEX;
        } else {
            obj = this.H2.a ? SimulateBetConsts.BetslipType.CUTBET : SimulateBetConsts.BetslipType.MULTIPLE;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            JSONArray jSONArray = new JSONArray();
            ArrayList arrayListU = N1().U();
            int size = arrayListU.size();
            while (i5 < size) {
                Selection selection = (Selection) arrayListU.get(i5);
                i5++;
                obj = obj;
                if (Q1().G1() != 1 || t2().a(selection)) {
                    if (qz3.b(selection)) {
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put(AnalyticsParam.EVENT_PARAM_PAGE_VIEW_EVENT_ID, selection.a.eventId);
                        jSONObject2.put(str4, selection.j());
                        jSONObject2.put(str3, selection.c.odds);
                        String str6 = str5;
                        jSONObject2.put("probability", String.valueOf(selection.c.probability));
                        if (selection.p()) {
                            JSONArray jSONArray2 = new JSONArray();
                            Iterator<Selection> it = selection.d.iterator();
                            while (it.hasNext()) {
                                Iterator<Selection> it2 = it;
                                Selection next = it.next();
                                Object obj4 = obj3;
                                JSONObject jSONObject3 = new JSONObject();
                                jSONObject3.put(AnalyticsParam.EVENT_PARAM_PAGE_VIEW_EVENT_ID, next.a.eventId);
                                jSONObject3.put(str4, next.j());
                                jSONObject3.put(str3, next.c.odds);
                                jSONObject3.put("probability", String.valueOf(next.c.probability));
                                jSONArray2.put(jSONObject3);
                                str3 = str3;
                                obj3 = obj4;
                                it = it2;
                                size = size;
                                str4 = str4;
                            }
                            str = str4;
                            obj2 = obj3;
                            i4 = size;
                            str2 = str3;
                            jSONObject2.put("betBuilderSelections", jSONArray2);
                            jSONObject2.put("betBuilder", true);
                        } else {
                            str = str4;
                            obj2 = obj3;
                            i4 = size;
                            str2 = str3;
                        }
                        List<PreCannedBBOutcome> list = selection.c.childOutcomes;
                        if (list != null && !list.isEmpty()) {
                            JSONArray jSONArray3 = new JSONArray();
                            for (PreCannedBBOutcome preCannedBBOutcome : selection.c.childOutcomes) {
                                JSONObject jSONObject4 = new JSONObject();
                                jSONObject4.put("marketId", preCannedBBOutcome.getMarketId());
                                jSONObject4.put("marketName", preCannedBBOutcome.getMarketName());
                                jSONObject4.put("outcomeId", preCannedBBOutcome.getOutcomeId());
                                jSONObject4.put("outcomeDesc", preCannedBBOutcome.getOutcomeDesc());
                                jSONObject4.put("specifiers", preCannedBBOutcome.getSpecifier());
                                jSONArray3.put(jSONObject4);
                            }
                            jSONObject2.put("childOutcomes", jSONArray3);
                        }
                        jSONArray.put(jSONObject2);
                        str3 = str2;
                        str5 = str6;
                        obj3 = obj2;
                        size = i4;
                        str4 = str;
                    }
                }
            }
            Object obj5 = obj;
            String str7 = str5;
            Object obj6 = obj3;
            BigDecimal bigDecimalB = xa00.b(N1().U());
            lrm lrmVarR1 = R1();
            String str8 = R1().d0().a;
            str8.getClass();
            BigDecimal bigDecimalMultiply = bigDecimalB.multiply(BigDecimal.valueOf(lrmVarR1.s(str8)));
            Object obj7 = O1().s().values().size() == 1 ? obj6 : obj5;
            if (obj7.equals(SimulateBetConsts.BetslipType.FLEX)) {
                jSONObject.put("flexibleMinWinnings", this.G2.b);
            }
            jSONObject.put("type", obj7);
            SimShareData simShareData = SimShareData.INSTANCE;
            jSONObject.put("supportMultiBetBonus", simShareData.getMultiBetBonusEnable());
            bigDecimalMultiply.getClass();
            BigDecimal simMaxPayout = simShareData.getSimMaxPayout();
            if (bigDecimalMultiply.compareTo(simMaxPayout) > 0) {
                bigDecimalMultiply = simMaxPayout;
            }
            jSONObject.put("bonusAmount", bigDecimalMultiply);
            jSONObject.put("selections", jSONArray);
            jSONObject.put("autoBetTimes", i3);
            SelectedGiftData selectedGiftData = y2().C;
            if (selectedGiftData == null) {
                jLongValue = 0;
                z2 = false;
                addToStake = false;
            } else {
                if (!selectedGiftData.getChecked() || (giftValue = selectedGiftData.getGiftValue()) == null || giftValue.length() == 0) {
                    selectedGiftData = null;
                }
                if (selectedGiftData != null) {
                    jSONObject.put("giftId", selectedGiftData.getGiftId());
                    BigDecimal bigDecimal = new BigDecimal(selectedGiftData.getGiftValue());
                    jSONObject.put("giftAmount", bigDecimal.multiply(BigDecimal.valueOf(10000L)).longValue());
                    jSONObject.put("giftKind", selectedGiftData.getGiftKind());
                    jSONObject.put("addToStake", selectedGiftData.getAddToStake());
                    jLongValue = bigDecimal.multiply(BigDecimal.valueOf(10000L)).longValue();
                    addToStake = selectedGiftData.getAddToStake();
                    z2 = true;
                } else {
                    jLongValue = 0;
                    z2 = false;
                    addToStake = false;
                }
            }
            JSONArray jSONArray4 = new JSONArray();
            JSONArray jSONArray5 = new JSONArray();
            JSONObject jSONObject5 = new JSONObject();
            if (Q1().G1() == 1) {
                ArrayList arrayListU2 = N1().U();
                int size2 = arrayListU2.size();
                int i6 = 0;
                while (i6 < size2) {
                    Object obj8 = arrayListU2.get(i6);
                    i6++;
                    Selection selection2 = (Selection) obj8;
                    if (t2().a(selection2) && (charSequence = (CharSequence) R1().B().get(selection2)) != null && charSequence.length() != 0) {
                        JSONObject jSONObject6 = new JSONObject();
                        new JSONArray().put(1);
                        lrm lrmVarR2 = R1();
                        String str9 = R1().e0().a;
                        str9.getClass();
                        long jS = lrmVarR2.s(str9);
                        if (z2 && addToStake) {
                            jS -= jLongValue;
                        }
                        jSONObject6.put("stake", jS);
                        jSONArray4.put(jSONObject6);
                    }
                }
            } else if (Q1().G1() == 2) {
                jSONArray5.put(1);
                lrm lrmVarR3 = R1();
                String str10 = R1().d0().a;
                str10.getClass();
                long jS2 = lrmVarR3.s(str10);
                if (z2 && addToStake) {
                    jS2 -= jLongValue;
                }
                jSONObject5.put("stake", jS2);
                jSONArray4.put(jSONObject5);
            }
            jSONObject.put("bets", jSONArray4);
            if (Q1().G1() == 2 && this.H2.a) {
                JSONObject jSONObject7 = new JSONObject();
                jSONObject7.put("cutbetWinningAmount", this.H2.f);
                jSONObject7.put("allWinningAmount", this.H2.b);
                jSONObject.put(str7, jSONObject7);
            }
            itf0.a aVar = itf0.a;
            aVar.q(MyLog.TAG_BET_SLIP);
            aVar.a(jSONObject.toString(), new Object[0]);
            Q1().O1(new v03.p(Q1().E1()));
            string = jSONObject.toString();
        } catch (Exception e3) {
            itf0.a aVar2 = itf0.a;
            aVar2.q(MyLog.TAG_BET_SLIP);
            aVar2.f(e3, "Error generating simulated place bet body", new Object[0]);
            string = null;
        }
        if (string == null || string.length() == 0) {
            this.V1 = false;
            S1().E.setSimButtonsEnabled(true, getAccountHelper().isLogin());
            k4(-1, null);
        } else {
            q73 q73VarQ1 = Q1();
            string.getClass();
            do90 do90Var = q73VarQ1.j0;
            do90Var.getClass();
            do90Var.d.a(string);
        }
    }

    public final void u4() {
        if (!getAccountHelper().isLogin()) {
            getAccountHelper().setRegisterStatus(false);
            this.Q1 = true;
            getAccountHelper().demandAccount(this, this);
        } else {
            Intent intent = new Intent(this, (Class<?>) AutoBetActivity.class);
            intent.putExtra("extra_show_only_bet_list", false);
            intent.putExtra("extra_tab_index", 0);
            startActivity(intent);
        }
    }

    @Override // defpackage.to3
    public final void v() {
        if (N1().m0()) {
            s2().x1(y2().C, this.w2, this.x2);
            return;
        }
        getAccountHelper().setRegisterStatus(false);
        this.P1 = true;
        getAccountHelper().demandAccount(this, this);
    }

    public final up3 v2() {
        up3 up3Var = this.W;
        if (up3Var != null) {
            return up3Var;
        }
        Intrinsics.n("singleGiftState");
        throw null;
    }

    public final void v3(boolean z2, BigDecimal bigDecimal) {
        bigDecimal.getClass();
        ww2 ww2Var = this.y0;
        if (ww2Var == null) {
            Intrinsics.n("betOddsUseCases");
            throw null;
        }
        if (!ww2Var.c.isConnected() && !z2) {
            ww2 ww2Var2 = this.y0;
            if (ww2Var2 == null) {
                Intrinsics.n("betOddsUseCases");
                throw null;
            }
            s9s lifecycle = getLifecycle();
            ef3 ef3Var = new ef3(this, bigDecimal);
            lifecycle.getClass();
            if (ww2Var2.c.isConnected()) {
                ef3Var.invoke(x8z.a.a);
                return;
            } else {
                ej5.c(ebs.a(lifecycle), null, null, new tw2(lifecycle, ww2Var2, ef3Var, null), 3);
                return;
            }
        }
        nl0 nl0Var = this.I2;
        if (nl0Var.a) {
            BigDecimal bigDecimal2 = nl0Var.c;
            BigDecimal bigDecimal3 = BigDecimal.ZERO;
            if (!Intrinsics.g(bigDecimal2, bigDecimal3)) {
                BetTypeAnyWinConfig betTypeAnyWinConfig = this.K2;
                if (!Intrinsics.g(betTypeAnyWinConfig != null ? betTypeAnyWinConfig.getMinOdds() : null, bigDecimal3)) {
                    BigDecimal bigDecimal4 = nl0Var.c;
                    BetTypeAnyWinConfig betTypeAnyWinConfig2 = this.K2;
                    if (bigDecimal4.compareTo(betTypeAnyWinConfig2 != null ? betTypeAnyWinConfig2.getMinOdds() : null) < 0) {
                        g4(4762);
                        return;
                    }
                }
            }
        }
        if (!getCountryManager().W() || this.e2 != null) {
            t3(this.e2, bigDecimal);
            this.e2 = null;
            return;
        }
        getLocationPermissionHelper().e = new u();
        getLocationPermissionHelper().i = new v();
        getLocationPermissionHelper().f = new w();
        getLocationPermissionHelper().g = new x();
        getLocationPermissionHelper().h = new y(bigDecimal);
        checkAndRequestPermissions(true);
    }

    public final void v4() {
        int dimension;
        int size;
        DisplayMetrics displayMetrics = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        int i3 = displayMetrics.heightPixels;
        so3 so3Var = this.p1;
        int height = so3Var != null ? so3Var.a.getHeight() : 0;
        int height2 = S1().S.getHeight();
        if (this.n2) {
            if (!qz3.g()) {
                so3 so3Var2 = this.p1;
                int multiInputViewHeight = so3Var2 != null ? so3Var2.a.getMultiInputViewHeight() : 0;
                if (N1().U().size() < 3) {
                    height = getCountryManager().S() ? height - (multiInputViewHeight * 2) : (height - multiInputViewHeight) + ((int) getResources().getDimension(R.dimen.keyboard_height));
                    dimension = (int) getResources().getDimension(R.dimen.boost_ad);
                    size = N1().U().size();
                    height2 -= size * dimension;
                }
            } else if (N1().U().size() < 4) {
                so3 so3Var3 = this.p1;
                int singleInputViewHeight = so3Var3 != null ? so3Var3.a.getSingleInputViewHeight() : 0;
                height = getCountryManager().S() ? height - (singleInputViewHeight * 2) : (height - singleInputViewHeight) + ((int) getResources().getDimension(R.dimen.keyboard_height));
                dimension = (int) getResources().getDimension(R.dimen.boost_ad);
                size = N1().U().size();
                height2 -= size * dimension;
            }
            height += (int) getResources().getDimension(R.dimen.load_code_margin);
            this.n2 = false;
        }
        View viewFindViewById = findViewById(R.id.footer_button);
        int height3 = S1().C.getHeight();
        int dimension2 = (int) getResources().getDimension(R.dimen.betslip_bottom_margin);
        if (iw2.e()) {
            height = 0;
        } else {
            height3 = 0;
        }
        float height4 = 1.0f - (((viewFindViewById.getHeight() + (S1().E.getRootView().getHeight() + ((height + height3) + height2))) - dimension2) / i3);
        V3(N1().m0());
        androidx.constraintlayout.widget.b bVar = new androidx.constraintlayout.widget.b();
        bVar.f(S1().O);
        bVar.e(R.id.bs_header_parent, 4);
        bVar.g(R.id.bs_header_parent, 3, R.id.multi_guideline, 4);
        if (height4 <= 0.1f || N1().m0()) {
            bVar.y(0.1f);
        } else {
            bVar.y(height4);
        }
        bVar.b(S1().O);
        if (N1().U().isEmpty() && S1().i.getHeight() > 0 && !N1().m0()) {
            E1();
        }
        if (this.v2) {
            if (!N1().m0() || N1().U().size() > 1) {
                J3();
            }
            if (N1().m0()) {
                S1().W.postDelayed(new Runnable() { // from class: je3
                    @Override // java.lang.Runnable
                    public final void run() {
                        Set<g08> set = BetslipActivity.X2;
                        BetslipActivity betslipActivity = this.a;
                        betslipActivity.S1().S.o0(betslipActivity.N1().U().size() - 1);
                    }
                }, 200L);
            }
            this.v2 = false;
        }
    }

    @Override // defpackage.tit
    public final void w(Account account, boolean z2) {
        mz7 mz7Var;
        if (isFinishing() || account == null) {
            return;
        }
        String strE = a8b.e();
        strE.getClass();
        this.u1 = strE;
        S1().E.setAccountInfo(account);
        S1().E.G(r2());
        if (this.U1) {
            this.U1 = false;
            if (z2) {
                int iOrdinal = N1().K0().ordinal();
                if (iOrdinal == 0) {
                    q73 q73VarQ1 = Q1();
                    ej5.c(o8i0.d(q73VarQ1), null, null, new w73(q73VarQ1, null), 3);
                } else if (iOrdinal == 1) {
                    u3(SimShareData.INSTANCE.getAutoBetTimes());
                } else {
                    if (iOrdinal != 2) {
                        uhc.a();
                        return;
                    }
                    this.c2 = System.currentTimeMillis();
                    this.V1 = true;
                    String string = Q1().H1(2).toString();
                    string.getClass();
                    String strB = getCountryManager().B();
                    q73 q73VarQ2 = Q1();
                    kzh.d(new g1i(bm50.a(new d73(r0i.a(new c73(r0i.a(new i0i(q73VarQ2.O1), new e73(q73VarQ2, null)), q73VarQ2), new f73(q73VarQ2, string, Q1().G1(), strB, null)))), new g73(q73VarQ2, null)), o8i0.d(q73VarQ2));
                    l4(true);
                }
            }
        }
        if (this.R1) {
            this.R1 = false;
            E4();
            e2().F1(false);
            S1().E.setBetHistoryButtonEnabled(getAccountHelper().isLogin(), getAccountHelper().isLogin());
        }
        if (this.Q1) {
            this.Q1 = false;
            if (getAccountHelper().getRegisterStatus()) {
                getAccountHelper().setRegisterStatus(false);
            } else {
                Intent intent = new Intent(this, (Class<?>) AutoBetActivity.class);
                intent.putExtra("extra_show_only_bet_list", false);
                intent.putExtra("extra_tab_index", 0);
                startActivity(intent);
            }
        }
        if (this.P1) {
            this.P1 = false;
            if (getAccountHelper().getRegisterStatus()) {
                getAccountHelper().setRegisterStatus(false);
            } else {
                SelectedGiftData selectedGiftData = y2().C;
                if (selectedGiftData != null && selectedGiftData.getRawGift() != null) {
                    e2().K1(new vjk.b(selectedGiftData.getRawGift(), selectedGiftData, y2().b));
                }
                C3(AnalyticsEvent.BETSLIP_GIFT_ENTRANCE_CLICK, jpu.b(new Pair("source", "betslip")));
            }
        }
        if (getCountryManager().r()) {
            q73 q73VarQ3 = Q1();
            ej5.c(o8i0.d(q73VarQ3), null, null, new i73(q73VarQ3, null), 3);
        }
        if (getAccountHelper().isLogin()) {
            q2().z1();
        }
        if (getAccountHelper().isLogin() && S1().i.getVisibility() == 0 && (mz7Var = S1().i.U) != null) {
            kzh.d(mz7Var.i.d(pu0.c.a), zu7.a());
        }
    }

    @Override // defpackage.to3
    public final void w0(zuy zuyVar, huy huyVar, avy avyVar, avy avyVar2) {
        zuyVar.getClass();
        huyVar.getClass();
        avyVar2.getClass();
        bih0 bih0Var = this.e0;
        if (bih0Var == null) {
            Intrinsics.n("upSelectionRequestUseCase");
            throw null;
        }
        List<Selection> listA = bih0Var.a(zuyVar, huyVar, avyVar);
        aih0 aih0Var = this.f0;
        if (aih0Var == null) {
            Intrinsics.n("upSelectionDuplicateUseCase");
            throw null;
        }
        List<Selection> listC = aih0Var.c(listA, huyVar, avyVar);
        aih0 aih0Var2 = this.f0;
        if (aih0Var2 == null) {
            Intrinsics.n("upSelectionDuplicateUseCase");
            throw null;
        }
        List<Selection> listB = aih0Var2.b();
        if (listC.isEmpty() && listB.isEmpty()) {
            if (avyVar != avy.c) {
                N1().b(false);
            }
            F2(zuyVar, huyVar, avyVar);
        } else {
            j4(new q(listC, listB, this, zuyVar, huyVar, avyVar, avyVar2));
        }
        k2().B1(vuy.b(avyVar));
    }

    public final nzm w2() {
        nzm nzmVar = this.C;
        if (nzmVar != null) {
            return nzmVar;
        }
        Intrinsics.n("stakeConfigAgent");
        throw null;
    }

    public final void w3(boolean z2) throws Throwable {
        if (!this.B1 || this.V1 || isFinishing()) {
            itf0.a aVar = itf0.a;
            aVar.q(MyLog.TAG_BET_SLIP);
            aVar.a("pushUpdateViews skip ? isPushChanged: " + this.B1 + ", isSubmitting: " + this.V1, new Object[0]);
            return;
        }
        B1();
        if (Q1().G1() == 1) {
            r4(this.N1, false);
        }
        O1().B();
        q4(false);
        this.F1 = X2();
        if (!z2) {
            I1((V2() || (this.D1 && this.F1)) ? false : true);
        } else if (N1().h0()) {
            N1().K1();
            I1(false);
        } else {
            this.B1 = false;
            this.F1 = false;
            this.E1 = false;
            I1(false);
            N1().B();
        }
        w4(Q1().G1() == 3, !z2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void w4(boolean z2, boolean z3) {
        R1().w(null);
        if (z2) {
            R1().r(null);
        }
        BetSlipHeader betSlipHeader = S1().E;
        boolean zG = qz3.g();
        ogd0 ogd0Var = betSlipHeader.F;
        if (zG) {
            ogd0Var.B.setEnabled(false);
            ogd0Var.B.setPaintFlags(16);
        } else {
            ogd0Var.B.setEnabled(true);
            ogd0Var.B.setPaintFlags(1);
        }
        S1().E.E();
        if (iw2.a() <= 1) {
            S1().E.setDisplayTypeMenuVisibility(false, (q43) Q1().C1.d());
            if (iw2.a() == 0) {
                int iOrdinal = N1().K0().ordinal();
                if (iOrdinal == 0) {
                    i4();
                } else if (iOrdinal == 1) {
                    X3(true);
                } else if (iOrdinal != 2) {
                    uhc.a();
                    return;
                }
                so3 so3Var = this.p1;
                if (so3Var != null) {
                    so3Var.a.setInVisibleLayout();
                }
                S1().S.removeAllViews();
                S1().P.f.setVisibility(8);
                S1().P.y.setVisibility(8);
                S1().P.b.setVisibility(8);
                S1().G.setVisibility(8);
                S1().P.z.setVisibility(8);
            } else {
                S1().i.setVisibility(8);
                S1().i.L();
            }
        } else {
            S1().i.setVisibility(8);
            S1().i.L();
        }
        D3();
        if (qz3.g() && !iw2.b()) {
            Z3();
            R1().L(null);
            R1().n();
        } else if (!O1().E().values().isEmpty()) {
            int iG1 = Q1().G1();
            if (iG1 == 1) {
                Y3(false, R1().e0());
            } else if (iG1 == 2) {
                R3(false, R1().d0());
            } else if (iG1 == 3) {
                h4(true);
                d4();
            }
        }
        S1().E.setRemoveContainerVisibility((q43) Q1().C1.d());
        ComposeView composeView = S1().B;
        k53 k53VarC = iu2.c();
        boolean zL = iu2.l();
        k53VarC.getClass();
        composeView.setVisibility(kotlin.collections.a.c(k53.EDIT).contains(k53VarC) & (true ^ zL) ? 0 : 8);
        S1().C.setVisibility(iw2.e() ? 0 : 8);
        S1().F.setVisibility((Q1().J1() || iw2.e()) ? 8 : 0);
        S1().D.setVisibility(iw2.e() ? 8 : 0);
        S1().E.setBetSlipNumberText(String.valueOf(iw2.a()));
        s4(N1().m0(), false);
        if (z3) {
            G4();
        }
        F4();
        A4();
        Q1().P0.a(a53.b.a);
        String string = Q1().H1(2).toString();
        string.getClass();
        boolean zA3 = a3(string);
        q73 q73VarQ1 = Q1();
        if (zA3) {
            string = "0";
        }
        q73VarQ1.B1(string);
    }

    @Override // defpackage.to3
    public final int x() {
        return Q1().G1();
    }

    public final shh0 x2() {
        shh0 shh0Var = this.d0;
        if (shh0Var != null) {
            return shh0Var;
        }
        Intrinsics.n("upFooterInsureUseCase");
        throw null;
    }

    public final void x3() {
        int size = N1().U().size();
        boolean z2 = false;
        for (int i3 = 0; i3 < size; i3++) {
            if (((Selection) N1().U().get(i3)).a.changeFlag || ((Selection) N1().U().get(i3)).c.oddsChangesFlag != 0) {
                if (((Selection) N1().U().get(i3)).c.oddsChangesFlag == 0) {
                    this.F1 = X2();
                }
                z2 = true;
            }
        }
        this.B1 = z2;
    }

    public final void x4(boolean z2) {
        if (z2) {
            S1().A.setText(getCMSString(R.string.component_betslip__u_boosted, new Object[0]));
            S1().v.setBackgroundResource(R.drawable.background_flash_odds);
            S1().w.setImageResource(R.drawable.ic_boost_checked);
            zch0.k(this, S1().Y, Color.parseColor("#f2af00"));
            return;
        }
        S1().A.setText(getCMSString(R.string.component_betslip__u_boost, new Object[0]));
        S1().v.setBackgroundResource(R.drawable.background_flash_odds);
        S1().w.setImageResource(R.drawable.ic_boost_unchecked);
        S1().w.setBackgroundResource(R.drawable.background_flash_odds);
        zch0.k(this, S1().Y, Color.parseColor("#dcdee5"));
    }

    public final up3 y2() {
        int iG1 = Q1().G1();
        if (iG1 != 1) {
            return iG1 != 2 ? V1() : i2();
        }
        return v2();
    }

    public final void y3() {
        so3 so3Var;
        if (!N1().m0() || Intrinsics.g(y2().C, y2().D) || (so3Var = this.p1) == null) {
            return;
        }
        so3Var.c(f4());
    }

    /* JADX WARN: Code duplicated, block: B:135:0x02fb  */
    /* JADX WARN: Code duplicated, block: B:80:0x01bc  */
    public final void y4(List list, List list2, long j3, j980 j980Var, boolean z2, boolean z3) {
        boolean z4;
        boolean z5;
        boolean z6;
        String str;
        ArrayList arrayList = new ArrayList();
        LinkedHashMap linkedHashMapA = apg.a(list);
        Iterator it = list.iterator();
        while (true) {
            boolean z7 = true;
            if (!it.hasNext()) {
                if (z3 && N1().V()) {
                    ArrayList arrayList2 = new ArrayList(N1().U());
                    int size = arrayList2.size();
                    int i3 = 0;
                    while (i3 < size) {
                        Object obj = arrayList2.get(i3);
                        i3++;
                        Selection selection = (Selection) obj;
                        if (selection.a(arrayList)) {
                            ((fj2) this.S0.getValue()).y1(g880.y(selection, arrayList), false);
                        }
                    }
                }
                if (z2) {
                    this.E1 = this.B1;
                }
                boolean z8 = j980Var != null;
                if (N1().m0() && j980Var != null) {
                    z4 = j980Var.a;
                }
                this.C1 = z4;
                try {
                    w3(z8);
                    return;
                } finally {
                    this.C1 = false;
                }
            }
            Event event = (Event) it.next();
            if (event.markets == null || event.isBetBuilderChild()) {
                it = it;
            } else {
                ArrayList arrayList3 = new ArrayList();
                for (Market market : event.markets) {
                    if (market != null) {
                        if (Collections.frequency(event.markets, market) <= 1) {
                            arrayList3.add(market);
                        } else if (market.product == 1) {
                            arrayList3.add(market);
                        }
                    }
                }
                int size2 = arrayList3.size();
                int i4 = 0;
                while (i4 < size2) {
                    i4++;
                    Market market2 = (Market) arrayList3.get(i4);
                    List<Outcome> list3 = market2.outcomes;
                    list3.getClass();
                    if (!list3.isEmpty() || !N1().f(event, market2, z7)) {
                        ArrayList arrayList4 = new ArrayList(list3);
                        ArrayList arrayList5 = new ArrayList(N1().U());
                        int size3 = arrayList4.size();
                        int i5 = 0;
                        while (i5 < size3) {
                            int i6 = i5 + 1;
                            Outcome outcome = (Outcome) arrayList4.get(i5);
                            Selection selection2 = new Selection(event, market2, outcome, (List) linkedHashMapA.get(market2.id));
                            if (Intrinsics.g(market2.id, "1") && qvy.b(market2) != null) {
                                lrm lrmVarR1 = R1();
                                String str2 = outcome.odds;
                                str2.getClass();
                                lrmVarR1.T(selection2, str2);
                            }
                            arrayList.add(selection2);
                            int size4 = arrayList5.size();
                            int i7 = 0;
                            while (i7 < size4) {
                                Object obj2 = arrayList5.get(i7);
                                i7++;
                                it = it;
                                Selection selection3 = (Selection) obj2;
                                arrayList3 = arrayList3;
                                if (this.y0 == null) {
                                    Intrinsics.n("betOddsUseCases");
                                    throw null;
                                }
                                Market market3 = selection3.b;
                                size4 = size4;
                                Outcome outcome2 = selection3.c;
                                market3.getClass();
                                ArrayList arrayList6 = arrayList4;
                                size3 = size3;
                                boolean zA = ww2.a(market3, market2, j3);
                                Selection selectionE = g880.e(selection3, list2);
                                Selection selection4 = selection2;
                                boolean zA2 = mkf.a(selection3, selection4, selectionE, j980Var != null ? j980Var.a : false, j980Var != null ? j980Var.b : false, j980Var != null ? j980Var.c : false);
                                if ((!selection3.equals(selection4) || zA) && !zA2) {
                                    selection2 = selection4;
                                    arrayList4 = arrayList6;
                                } else {
                                    int iCompareTo = new BigDecimal(outcome.odds).compareTo(new BigDecimal(outcome2.odds));
                                    outcome.oddsChangesFlag = iCompareTo;
                                    if (iCompareTo != 0) {
                                        itf0.a aVar = itf0.a;
                                        aVar.q(MyLog.TAG_ODDS_UPDATE);
                                        aVar.g("odds = " + outcome.odds + ", prob = " + outcome.probability, new Object[0]);
                                    }
                                    if (outcome.desc == null) {
                                        outcome.desc = outcome2.desc;
                                    }
                                    int i8 = selection3.b.status;
                                    int i9 = market2.status;
                                    if (i8 == 0) {
                                        if (i8 == i9 && outcome2.isActive == outcome.isActive && outcome.oddsChangesFlag == 0) {
                                            z5 = true;
                                            z6 = false;
                                        } else {
                                            this.B1 = true;
                                            N1().q0(outcome.oddsChangesFlag != 0 && outcome2.isActive == outcome.isActive);
                                            z5 = true;
                                            z6 = true;
                                        }
                                    } else if (i9 == 0 || (i9 == 3 && i8 != 3)) {
                                        z5 = true;
                                        this.B1 = true;
                                        z6 = true;
                                    } else {
                                        z5 = true;
                                        z6 = false;
                                    }
                                    if (zA2) {
                                        this.B1 = z5;
                                    }
                                    event.changeFlag = z6;
                                    if (N1().D() && N1().l0(selection3)) {
                                        selection2 = selection4;
                                        size2 = size2;
                                        arrayList5 = arrayList5;
                                        arrayList4 = arrayList6;
                                        i7 = i7;
                                    } else {
                                        Outcome outcome3 = outcome;
                                        ArrayList arrayList7 = arrayList5;
                                        int i10 = size2;
                                        N1().N0(event, market2, outcome3, true, (14336 & 16) != 0 ? false : false, (14336 & 32) != 0 ? null : (List) linkedHashMapA.get(market2.id), (14336 & 64) != 0 ? k980.DEFAULT : k980.DEFAULT, (14336 & 128) != 0 ? false : false, (14336 & 256) != 0 ? false : false, (14336 & 512) != 0 ? false : zA2, (14336 & 1024) != 0 ? null : selectionE, (14336 & 2048) != 0 ? false : false, (14336 & 4096) != 0 ? false : false, false);
                                        if (zA2 && j980Var != null && j980Var.a && N1().m0() && Q1().G1() == 1 && selectionE != null && !selectionE.equals(selection4) && (str = (String) R1().B().get(selectionE)) != null && str.length() != 0) {
                                            R1().N(selectionE);
                                            R1().O(selection4, str);
                                        }
                                        arrayList4 = arrayList6;
                                        selection2 = selection4;
                                        size2 = i10;
                                        outcome = outcome3;
                                        i7 = i7;
                                        arrayList5 = arrayList7;
                                    }
                                }
                            }
                            i5 = i6;
                        }
                        z7 = true;
                    }
                }
            }
        }
    }

    @Override // defpackage.to3
    public final void z(String str, boolean z2) {
        str.getClass();
        try {
            SelectedGiftData selectedGiftData = y2().C;
            if (selectedGiftData == null) {
                return;
            }
            C3(AnalyticsEvent.BETSLIP_GIFT_CHECKBOX_CLICK, kpu.f(new Pair("source", "betslip"), new Pair(AnalyticsParam.EVENT_STATUS, z2 ? AnalyticsParam.EVENT_STATUS_CHECKED : AnalyticsParam.EVENT_STATUS_UNCHECKED)));
            L3(z2);
            if (!z2) {
                if (N1().m0()) {
                    y2().v = false;
                }
                SelectedGiftData selectedGiftDataCopy = selectedGiftData.copy(selectedGiftData.getGiftValue(), selectedGiftData.getGiftKind(), selectedGiftData.getGiftId(), selectedGiftData.getGiftLimit(), selectedGiftData.getGiftCount(), selectedGiftData.getRawGift(), str.length() > 0 && selectedGiftData.getAddToStake(), false, selectedGiftData.getUserSelect(), selectedGiftData.getTotalStake());
                y2().D = selectedGiftData;
                y2().b(selectedGiftDataCopy);
                if (str.length() == 0) {
                    return;
                }
                e2().E1();
                return;
            }
            if (TextUtils.equals(GiftUtil.CLEARED_GIFT_VALUE, selectedGiftData.getGiftValue())) {
                e2().F1(false);
                return;
            }
            SelectedGiftData selectedGiftDataCopy2 = selectedGiftData.copy(selectedGiftData.getGiftValue(), selectedGiftData.getGiftKind(), selectedGiftData.getGiftId(), selectedGiftData.getGiftLimit(), selectedGiftData.getGiftCount(), selectedGiftData.getRawGift(), str.length() > 0 && selectedGiftData.getAddToStake(), true, selectedGiftData.getUserSelect(), selectedGiftData.getTotalStake());
            y2().D = selectedGiftData;
            y2().b(selectedGiftDataCopy2);
            if (str.length() == 0) {
                return;
            }
            e2().E1();
        } catch (Exception e3) {
            if (z2) {
                e2().F1(false);
            }
            itf0.a aVar = itf0.a;
            aVar.q(MyLog.TAG_BET_SLIP);
            aVar.c(e3, "onGiftChecked exception", new Object[0]);
        }
    }

    public final void z1(n780.c cVar, boolean z2) {
        GiftDetails giftDetails = cVar.a;
        String strW = cVar.c;
        String str = cVar.b;
        Boolean bool = cVar.e;
        Boolean bool2 = Boolean.TRUE;
        boolean zG = Intrinsics.g(bool, bool2);
        Boolean bool3 = cVar.d;
        boolean zEquals = bool3 != null ? bool3.equals(bool2) : true;
        Boolean bool4 = cVar.f;
        boolean zEquals2 = bool4 != null ? bool4.equals(bool2) : false;
        if (strW == null || strW.length() == 0) {
            strW = bjb0.W(giftDetails.getCurrentBalance());
        }
        SelectedGiftData selectedGiftData = new SelectedGiftData(strW, giftDetails.getKind(), giftDetails.getGiftId(), bjb0.W(giftDetails.getLeastOrderAmount()), 1, giftDetails, zG, zEquals, zEquals2, str);
        y2().v = z2;
        y2().b(selectedGiftData);
        so3 so3Var = this.p1;
        if (so3Var != null) {
            so3Var.c(f4());
        }
        e2().E1();
    }

    public final void z2() {
        if (this.u2) {
            HashSet<com.sportybet.plugin.realsports.betslip.widget.f.a> hashSet = com.sportybet.plugin.realsports.betslip.widget.f.a;
            com.sportybet.plugin.realsports.betslip.widget.f.b(com.sportybet.plugin.realsports.betslip.widget.f.a.e);
            com.sportybet.plugin.realsports.betslip.widget.f.a(com.sportybet.plugin.realsports.betslip.widget.f.a.d);
            this.u2 = false;
            this.p2 = false;
            this.q2 = true;
            this.t2 = false;
            this.V1 = false;
            L1().g();
            S1().E.setSimBetHistoryHintVisible(true);
            S1().V.a.setVisibility(8);
            S1().a0.setVisibility(8);
            S1().E.setSimButtonsEnabled(true, getAccountHelper().isLogin());
            S1().E.setRemoveAllBtnEnabled(false);
            if (this.s2 > 0) {
                hu2 hu2VarM1 = M1();
                long j3 = this.s2;
                hu2VarM1.getClass();
                if (j3 <= 0 || ((oaj0) getSupportFragmentManager().H("WinningDialog")) != null) {
                    return;
                }
                BigDecimal bigDecimalDivide = new BigDecimal(j3).divide(SimulateBetConsts.MAGIC_NUMBER);
                String str = SimulateWinOnlineRes.WINNING_IMAGE;
                Bundle bundle = new Bundle();
                bundle.putSerializable("arg_return_amount", bigDecimalDivide);
                bundle.putString("arg_img_path", str);
                oaj0 oaj0Var = new oaj0();
                oaj0Var.setArguments(bundle);
                oaj0Var.show(getSupportFragmentManager(), "WinningDialog");
                hu2VarM1.i.postDelayed(new Runnable() { // from class: gu2
                    @Override // java.lang.Runnable
                    public final void run() {
                        oaj0 oaj0Var2;
                        BetslipActivity betslipActivity = this.a;
                        if (betslipActivity.isFinishing() || (oaj0Var2 = (oaj0) betslipActivity.getSupportFragmentManager().H("WinningDialog")) == null) {
                            return;
                        }
                        oaj0Var2.dismissAllowingStateLoss();
                    }
                }, 2000L);
            }
        }
    }

    public final void z3() {
        if (this.N2 == N1().U().size() || !this.w1) {
            return;
        }
        this.N2 = N1().U().size();
        w4(true, true);
    }

    public final void q3(g08 g08Var, Integer num, lws lwsVar) {
        if (g08Var != g08.UNKNOWN) {
            this.q1 = g08Var.name();
            getIntent().putExtra("action_load_booking_code_from", this.q1);
        }
        String str = this.q1;
        if (str == null || str.length() == 0) {
            g08 g08Var2 = g08.UNKNOWN;
            this.q1 = "FEATURED_BOOKING_CODE_EMPTY_BETSLIP";
            getIntent().putExtra("action_load_booking_code_from", this.q1);
        }
        Q1().Y1(this.q1);
        C3(AnalyticsEvent.CODE_BTN_ADD_TO_BETSLIP, jpu.b(new Pair("from", this.q1)));
        bew bewVar = bew.ADD_TO_BETSLIP_DIRECTLY;
        this.t1 = 2;
        this.m2 = true;
        S1().i.setVisibility(8);
        S1().i.L();
        R1().q(0);
        ogd0 ogd0Var = S1().E.F;
        ogd0Var.B.setEnabled(true);
        ogd0Var.B.setPaintFlags(128);
        ogd0Var.S.setEnabled(true);
        ogd0Var.S.setPaintFlags(128);
        q73 q73VarQ1 = Q1();
        q73VarQ1.N.e1(q73VarQ1.j1);
        ((br3) mmc.a(hp0.A, br3.class)).U().f(false);
        hvo hvoVar = this.V;
        if (hvoVar == null) {
            Intrinsics.n("insureMoreUiStateManager");
            throw null;
        }
        hvoVar.a.setValue(f5w.b.a);
        Boolean bool = (Boolean) n2().e.a.getValue();
        if (bool != null) {
            L3(bool.booleanValue());
        }
        B4(false);
        so3 so3Var = this.p1;
        if (so3Var != null) {
            boolean zHasRate = Q1().c1.hasRate(N1().m0());
            boolean z2 = y2().b > 0;
            BetSlipFooter betSlipFooter = so3Var.a;
            Context context = betSlipFooter.getContext();
            context.getClass();
            String strB = sn5.b(context, R.string.app_common__zero, new Object[0]);
            mgd0 mgd0Var = betSlipFooter.G;
            mgd0Var.N0.setText(strB);
            mgd0Var.V0.setText(strB);
            mgd0Var.j0.setInputData(null);
            mgd0Var.M0.setInputData(null);
            betSlipFooter.x(2, zHasRate);
            betSlipFooter.setGiftsVisible(z2);
        }
        w4(true, true);
        m2(false);
        if (getAccountHelper().isLogin()) {
            e2().F1(false);
        }
        this.m2 = false;
        this.n2 = true;
        this.v2 = true;
        D3();
        P2();
        if (!N1().m0() && num != null) {
            int iIntValue = num.intValue();
            Q1().V1(iIntValue);
            q73 q73VarQ2 = Q1();
            wwd0 wwd0Var = q73VarQ2.x0;
            tb00.c cVar = new tb00.c(iIntValue);
            wwd0Var.getClass();
            wwd0Var.k(null, cVar);
            q73VarQ2.U1();
        }
        if (!this.o2) {
            q73 q73VarQ3 = Q1();
            boolean z3 = this.n2;
            wwd0 wwd0Var2 = q73VarQ3.I1;
            pjh0 pjh0Var = q73VarQ3.U;
            v03.q qVar = (v03.q) wwd0Var2.getValue();
            pjh0Var.getClass();
            qVar.getClass();
            wwd0Var2.k(null, v03.q.a(qVar, z3 ? sgwpmp.zdYuKjScnlZX : "non_load_code", null, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 0, null, null, null, null, false, null, 0, 0, 8388606));
            Q1().O1(new v03.m(Q1().E1()));
            this.o2 = true;
        }
        g3(g08Var);
        h3(this.q1, lwsVar != null ? lwsVar.name() : null);
    }

    public final void P3(boolean z2, boolean z3) {
        boolean z4;
        boolean z5;
        so3 so3Var;
        SelectedGiftData selectedGiftData = y2().C;
        SelectedGiftData selectedGiftData2 = y2().D;
        boolean z6 = true;
        String str = "0";
        if (selectedGiftData != null) {
            String giftValue = selectedGiftData.getGiftValue();
            if (giftValue != null && giftValue.length() != 0) {
                y2().c = giftValue;
            }
            y2().d = selectedGiftData.getGiftId();
            y2().e = selectedGiftData.getGiftKind();
            y2().f = selectedGiftData.getGiftLimit();
            y2().i = selectedGiftData.getChecked();
            GiftDetails rawGift = selectedGiftData.getRawGift();
            if (rawGift != null) {
                up3 up3VarY2 = y2();
                List<Integer> betTypeScopes = rawGift.getBetTypeScopes();
                betTypeScopes.getClass();
                up3VarY2.w = betTypeScopes;
                y2().y = rawGift.getUpTypes();
                y2().z = rawGift.getEarlyGoalsType();
                y2().A = rawGift.getBetBuilderTypes();
                y2().B = Integer.valueOf(rawGift.getPrematchOrLive());
            }
            if (z2) {
                a4(selectedGiftData, selectedGiftData2, z3);
            }
            String string = Q1().H1(Q1().G1()).toString();
            string.getClass();
            if (string.length() == 0) {
                this.f2 = "0";
            } else {
                int iG1 = Q1().G1();
                String str2 = sgwpmp.tAMqhjL;
                if (iG1 == 2 && (so3Var = this.p1) != null && so3Var.a.n()) {
                    this.f2 = string;
                    C3(AnalyticsEvent.BETSLIP_GIFT_STAKE_EQUALS_PAY_1, kpu.f(new Pair("pay", string), new Pair("stake", string), new Pair(str2, String.valueOf(Q1().G1())), new Pair("gift_id", String.valueOf(y2().d))));
                } else if (d2().h(Q1().G1(), Integer.valueOf(Y1()))) {
                    String str3 = y2().c;
                    if (str3 == null) {
                        str3 = "0";
                    }
                    String string2 = BigDecimal.valueOf(Double.parseDouble(string)).subtract(BigDecimal.valueOf(Double.parseDouble(str3))).toString();
                    string2.getClass();
                    this.f2 = string2;
                    C3(AnalyticsEvent.BETSLIP_GIFT_STAKE_EQUALS_PAY_2, kpu.f(new Pair("pay", string2), new Pair("stake", string), new Pair("gift_value", str3), new Pair(str2, String.valueOf(Q1().G1())), new Pair("gift_id", String.valueOf(y2().d))));
                } else {
                    this.f2 = string;
                    F1();
                    C3(AnalyticsEvent.BETSLIP_GIFT_STAKE_EQUALS_PAY_3, kpu.f(new Pair("pay", this.f2), new Pair("stake", string), new Pair(str2, String.valueOf(Q1().G1())), new Pair("gift_id", String.valueOf(y2().d))));
                }
            }
            if (this.f2.length() > 0 && Double.parseDouble(this.f2) < 0.0d) {
                this.f2 = "0";
            }
        }
        String str4 = y2().f;
        if (str4 == null) {
            str4 = "0";
        }
        boolean z7 = false;
        if (y2().e == 2) {
            String string3 = Q1().H1(1).toString();
            string3.getClass();
            if (string3.length() == 0) {
                string3 = "0";
            }
            if (string3.length() > 0 && str4.length() > 0 && Double.parseDouble(string3) < Double.parseDouble(str4)) {
                z5 = true;
            } else {
                z5 = false;
            }
            String string4 = Q1().H1(2).toString();
            string4.getClass();
            if (string4.length() == 0) {
                string4 = "0";
            }
            if (string4.length() > 0 && str4.length() > 0 && Double.parseDouble(string4) < Double.parseDouble(str4)) {
                z4 = true;
            } else {
                z4 = false;
            }
            String string5 = Q1().H1(3).toString();
            string5.getClass();
            if (string5.length() != 0) {
                str = string5;
            }
            if (str.length() <= 0 || str4.length() <= 0 || Double.parseDouble(str) >= Double.parseDouble(str4)) {
                z6 = false;
            }
            z7 = z5;
        } else {
            z4 = false;
            z6 = false;
        }
        if (z7 && z4 && z6) {
            F1();
        }
    }
}
