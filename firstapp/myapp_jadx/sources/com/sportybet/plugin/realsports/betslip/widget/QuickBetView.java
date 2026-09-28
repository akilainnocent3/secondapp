package com.sportybet.plugin.realsports.betslip.widget;

import android.accounts.Account;
import android.app.Activity;
import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.text.InputFilter;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.UnderlineSpan;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Pair;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.animation.Animation;
import android.view.animation.LinearInterpolator;
import android.view.animation.RotateAnimation;
import android.view.animation.TranslateAnimation;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.e;
import com.google.gson.reflect.TypeToken;
import com.sporty.android.book.domain.entity.BetBuilderData;
import com.sporty.android.book.domain.entity.BetBuilderDataWSelections;
import com.sporty.android.book.domain.entity.UIState;
import com.sporty.android.common.network.data.BaseResponse;
import com.sporty.android.common.uievent.a;
import com.sporty.android.common_ui.uitext.ResourceUiText;
import com.sporty.android.common_ui.uitext.StringUiText;
import com.sporty.android.common_ui.uitext.UiText;
import com.sporty.android.core.model.MyLog;
import com.sporty.android.core.model.assetsinfo.AssetsInfo;
import com.sporty.android.core.model.config.tax.TaxConfigs;
import com.sporty.android.core.model.gift.GiftDetails;
import com.sporty.android.core.model.gift.GiftGroup;
import com.sporty.android.core.model.gift.GiftUtil;
import com.sporty.android.core.model.gift.SelectedGiftData;
import com.sporty.android.core.model.json.JsonSerializeService;
import com.sporty.android.core.model.pocket.withdraw.partner.RX.oAudzpbdOhCI;
import com.sporty.android.core.model.realsports.Order;
import com.sporty.android.core.model.tracking.AnalyticsEvent;
import com.sporty.android.core.model.tracking.AnalyticsParam;
import com.sporty.android.permission.location.UserAddress;
import com.sportybet.android.auth.AccountHelperEntryPointImpl;
import com.sportybet.android.data.BannedItemSocket;
import com.sportybet.android.gp.tz.R;
import com.sportybet.android.widget.EarlyPayoutCheckbox;
import com.sportybet.android.widget.OneUpTwoUpCheckbox;
import com.sportybet.android.widget.OneUpTwoUpItemControl;
import com.sportybet.android.widget.OneUpTwoUpSwitch;
import com.sportybet.feature.payment.impl.security.nameupdate.presentation.activity.kekO.YAzniTbXHYQ;
import com.sportybet.ntespm.socket.GroupTopic;
import com.sportybet.ntespm.socket.SocketPushManager;
import com.sportybet.ntespm.socket.Subscriber;
import com.sportybet.plugin.realsports.betslip.Selection;
import com.sportybet.plugin.realsports.betslip.simulate.SimulateAutoBetPanel;
import com.sportybet.plugin.realsports.betslip.virtualkeyboard.KeyboardView;
import com.sportybet.plugin.realsports.betslip.widget.QuickBetView;
import com.sportybet.plugin.realsports.betsucc.presentation.fragment.BetSuccessfulPageFragment;
import com.sportybet.plugin.realsports.data.Category;
import com.sportybet.plugin.realsports.data.Event;
import com.sportybet.plugin.realsports.data.Market;
import com.sportybet.plugin.realsports.data.OrderWithFailUpdate;
import com.sportybet.plugin.realsports.data.Outcome;
import com.sportybet.plugin.realsports.data.PreCannedBBOutcome;
import com.sportybet.plugin.realsports.data.SocketMarketMessage;
import com.sportybet.plugin.realsports.data.SocketOutcomeMessage;
import com.sportybet.plugin.realsports.data.Sport;
import com.sportybet.plugin.realsports.data.Tournament;
import com.sportybet.plugin.realsports.data.sim.SimShareData;
import com.sportybet.plugin.realsports.widget.DancingNumber;
import com.sportybet.plugin.realsports.widget.GuideView;
import com.sportybet.plugin.realsports.widget.SettleDelayHint;
import defpackage.a3i;
import defpackage.a78;
import defpackage.aak;
import defpackage.ade0;
import defpackage.af30;
import defpackage.ai30;
import defpackage.aj90;
import defpackage.ajk;
import defpackage.ap0;
import defpackage.apg;
import defpackage.apx;
import defpackage.at2;
import defpackage.aty;
import defpackage.avy;
import defpackage.ay0;
import defpackage.b3;
import defpackage.b3i;
import defpackage.b6y;
import defpackage.bcp;
import defpackage.bf30;
import defpackage.bg30;
import defpackage.bi30;
import defpackage.bjb0;
import defpackage.bmy;
import defpackage.bpx;
import defpackage.bqe;
import defpackage.br3;
import defpackage.bsy;
import defpackage.c0d;
import defpackage.c8i0;
import defpackage.c980;
import defpackage.ce30;
import defpackage.cf30;
import defpackage.cih0;
import defpackage.cj90;
import defpackage.cvd0;
import defpackage.cwz;
import defpackage.cyb;
import defpackage.d3i;
import defpackage.dby;
import defpackage.de30;
import defpackage.df30;
import defpackage.dgy;
import defpackage.dj5;
import defpackage.dq7;
import defpackage.e9h;
import defpackage.ebs;
import defpackage.ee30;
import defpackage.eeh0;
import defpackage.ef30;
import defpackage.egy;
import defpackage.ej5;
import defpackage.ej90;
import defpackage.ekf;
import defpackage.ema;
import defpackage.ex4;
import defpackage.f00;
import defpackage.fd30;
import defpackage.fdt;
import defpackage.ff30;
import defpackage.fj2;
import defpackage.fjd;
import defpackage.fks;
import defpackage.fq0;
import defpackage.fu5;
import defpackage.fvd0;
import defpackage.g08;
import defpackage.g1i;
import defpackage.g2k;
import defpackage.g880;
import defpackage.gd30;
import defpackage.ge30;
import defpackage.gf30;
import defpackage.gfg;
import defpackage.gky;
import defpackage.gpb;
import defpackage.gr0;
import defpackage.guy;
import defpackage.gx2;
import defpackage.h53;
import defpackage.h530;
import defpackage.h5e;
import defpackage.hb5;
import defpackage.hc40;
import defpackage.hd30;
import defpackage.hf30;
import defpackage.hih0;
import defpackage.hp0;
import defpackage.hwr;
import defpackage.hzz;
import defpackage.i2i;
import defpackage.i420;
import defpackage.i8;
import defpackage.i990;
import defpackage.ib5;
import defpackage.ibs;
import defpackage.iel;
import defpackage.ijd0;
import defpackage.ijf;
import defpackage.imn;
import defpackage.ipk;
import defpackage.ird0;
import defpackage.it90;
import defpackage.itf0;
import defpackage.itu;
import defpackage.iu2;
import defpackage.iw2;
import defpackage.iwh0;
import defpackage.izw;
import defpackage.j7g;
import defpackage.j800;
import defpackage.j980;
import defpackage.j990;
import defpackage.jc30;
import defpackage.jf30;
import defpackage.jj7;
import defpackage.jlv;
import defpackage.jq40;
import defpackage.jrm;
import defpackage.jvd0;
import defpackage.jwk;
import defpackage.k00;
import defpackage.k53;
import defpackage.k650;
import defpackage.k830;
import defpackage.k980;
import defpackage.k9j;
import defpackage.kd30;
import defpackage.kf30;
import defpackage.kgb0;
import defpackage.kj7;
import defpackage.knh;
import defpackage.krm;
import defpackage.ku90;
import defpackage.kx2;
import defpackage.kzh;
import defpackage.l830;
import defpackage.ld80;
import defpackage.lf30;
import defpackage.lfb0;
import defpackage.lfy;
import defpackage.ll5;
import defpackage.lrm;
import defpackage.lsm;
import defpackage.lx20;
import defpackage.m2g;
import defpackage.me30;
import defpackage.mf30;
import defpackage.mfb0;
import defpackage.mi90;
import defpackage.mjf;
import defpackage.mkf;
import defpackage.mmc;
import defpackage.mpe0;
import defpackage.mr4;
import defpackage.n780;
import defpackage.nd30;
import defpackage.ng10;
import defpackage.nh4;
import defpackage.njs;
import defpackage.nkf;
import defpackage.nt3;
import defpackage.nzm;
import defpackage.o2g;
import defpackage.o5p;
import defpackage.o8i0;
import defpackage.o8s;
import defpackage.oc30;
import defpackage.oe30;
import defpackage.okf;
import defpackage.oti;
import defpackage.oxc;
import defpackage.p8k;
import defpackage.pg10;
import defpackage.phd0;
import defpackage.pk2;
import defpackage.pkf;
import defpackage.psm;
import defpackage.pu0;
import defpackage.pv2;
import defpackage.pya;
import defpackage.pyk;
import defpackage.q3i;
import defpackage.q8k;
import defpackage.qf30;
import defpackage.qm70;
import defpackage.qpb;
import defpackage.qt1;
import defpackage.qvy;
import defpackage.qz3;
import defpackage.r2i;
import defpackage.r5b;
import defpackage.r8i0;
import defpackage.rdd;
import defpackage.rdd0;
import defpackage.rf30;
import defpackage.rlc;
import defpackage.rok;
import defpackage.rrh0;
import defpackage.s0b;
import defpackage.s1p;
import defpackage.s2i;
import defpackage.s8i0;
import defpackage.s9s;
import defpackage.se30;
import defpackage.sfy;
import defpackage.sh8;
import defpackage.slr;
import defpackage.sn5;
import defpackage.sty;
import defpackage.su5;
import defpackage.t340;
import defpackage.t7z;
import defpackage.taj;
import defpackage.tcp;
import defpackage.tf30;
import defpackage.tit;
import defpackage.tje0;
import defpackage.tl5;
import defpackage.tob;
import defpackage.ucy;
import defpackage.ue30;
import defpackage.uh30;
import defpackage.uhc;
import defpackage.ui90;
import defpackage.uj50;
import defpackage.uj90;
import defpackage.ulc;
import defpackage.up3;
import defpackage.uqm;
import defpackage.uy0;
import defpackage.v03;
import defpackage.v1b;
import defpackage.v5b;
import defpackage.v8i0;
import defpackage.va0;
import defpackage.vch0;
import defpackage.vgb0;
import defpackage.vjk;
import defpackage.vn20;
import defpackage.vu90;
import defpackage.vuy;
import defpackage.w8i0;
import defpackage.w950;
import defpackage.wf30;
import defpackage.wi80;
import defpackage.wm70;
import defpackage.wq3;
import defpackage.ww2;
import defpackage.wwd0;
import defpackage.wym;
import defpackage.xdp;
import defpackage.xjg0;
import defpackage.xlc;
import defpackage.xrb;
import defpackage.xv2;
import defpackage.xxw;
import defpackage.y5b;
import defpackage.y8j;
import defpackage.y8k;
import defpackage.yby;
import defpackage.yd30;
import defpackage.yox;
import defpackage.yrh0;
import defpackage.yuy;
import defpackage.yyh;
import defpackage.yyk;
import defpackage.yzh;
import defpackage.z9k;
import defpackage.zc30;
import defpackage.zch0;
import defpackage.zd2;
import defpackage.zf30;
import defpackage.zik;
import defpackage.zox;
import defpackage.zuy;
import defpackage.zyf0;
import java.lang.ref.WeakReference;
import java.lang.reflect.Method;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.function.Predicate;
import java.util.stream.Stream;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsKt;
import kotlin.text.c;
import okhttp3.internal.ws.WebSocketProtocol;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u008e\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0018\u0002\n\u0002\b'\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u00062\u00020\u00072\u00020\bB\u0011\b\u0016\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fB\u001b\b\u0016\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000b\u0010\u000fB#\b\u0016\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u000b\u0010\u0012J\u0015\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0016\u0010\u0017J\r\u0010\u0018\u001a\u00020\u0015¢\u0006\u0004\b\u0018\u0010\u0019J\u0015\u0010\u001b\u001a\u00020\u00152\u0006\u0010\u001a\u001a\u00020\u0013¢\u0006\u0004\b\u001b\u0010\u0017J\u0017\u0010\u001c\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u001c\u0010\u0017J\u0019\u0010\u001f\u001a\u00020\u00152\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dH\u0002¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010\"\u001a\u00020\u00152\u0006\u0010!\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\"\u0010\u0017J\u0017\u0010$\u001a\u00020\u00152\u0006\u0010#\u001a\u00020\u0013H\u0002¢\u0006\u0004\b$\u0010\u0017J\u0017\u0010%\u001a\u00020\u00152\u0006\u0010#\u001a\u00020\u0013H\u0002¢\u0006\u0004\b%\u0010\u0017R\u001b\u0010+\u001a\u00020&8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R$\u00103\u001a\u0004\u0018\u00010,8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b-\u0010.\u001a\u0004\b/\u00100\"\u0004\b1\u00102R\"\u00109\u001a\u00020\u00138\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b4\u00105\u001a\u0004\b6\u00107\"\u0004\b8\u0010\u0017R\"\u0010;\u001a\u00020\u00138\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b:\u00105\u001a\u0004\b;\u00107\"\u0004\b<\u0010\u0017R\"\u0010>\u001a\u00020\u00138\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b=\u00105\u001a\u0004\b>\u00107\"\u0004\b?\u0010\u0017R!\u0010E\u001a\b\u0012\u0004\u0012\u00020A0@8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bB\u0010(\u001a\u0004\bC\u0010DR\"\u0010M\u001a\u00020F8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\bG\u0010H\u001a\u0004\bI\u0010J\"\u0004\bK\u0010LR\"\u0010U\u001a\u00020N8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\bO\u0010P\u001a\u0004\bQ\u0010R\"\u0004\bS\u0010TR\"\u0010]\u001a\u00020V8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\bW\u0010X\u001a\u0004\bY\u0010Z\"\u0004\b[\u0010\\R\"\u0010e\u001a\u00020^8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b_\u0010`\u001a\u0004\ba\u0010b\"\u0004\bc\u0010dR\"\u0010m\u001a\u00020f8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\bg\u0010h\u001a\u0004\bi\u0010j\"\u0004\bk\u0010lR\"\u0010u\u001a\u00020n8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\bo\u0010p\u001a\u0004\bq\u0010r\"\u0004\bs\u0010tR\"\u0010}\u001a\u00020v8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\bw\u0010x\u001a\u0004\by\u0010z\"\u0004\b{\u0010|R(\u0010\u0085\u0001\u001a\u00020~8\u0006@\u0006X\u0087.¢\u0006\u0017\n\u0005\b\u007f\u0010\u0080\u0001\u001a\u0006\b\u0081\u0001\u0010\u0082\u0001\"\u0006\b\u0083\u0001\u0010\u0084\u0001R*\u0010\u008d\u0001\u001a\u00030\u0086\u00018\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0006\b\u0087\u0001\u0010\u0088\u0001\u001a\u0006\b\u0089\u0001\u0010\u008a\u0001\"\u0006\b\u008b\u0001\u0010\u008c\u0001R*\u0010\u0095\u0001\u001a\u00030\u008e\u00018\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0006\b\u008f\u0001\u0010\u0090\u0001\u001a\u0006\b\u0091\u0001\u0010\u0092\u0001\"\u0006\b\u0093\u0001\u0010\u0094\u0001R*\u0010\u009d\u0001\u001a\u00030\u0096\u00018\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0006\b\u0097\u0001\u0010\u0098\u0001\u001a\u0006\b\u0099\u0001\u0010\u009a\u0001\"\u0006\b\u009b\u0001\u0010\u009c\u0001R*\u0010¥\u0001\u001a\u00030\u009e\u00018\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0006\b\u009f\u0001\u0010 \u0001\u001a\u0006\b¡\u0001\u0010¢\u0001\"\u0006\b£\u0001\u0010¤\u0001R*\u0010\u00ad\u0001\u001a\u00030¦\u00018\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0006\b§\u0001\u0010¨\u0001\u001a\u0006\b©\u0001\u0010ª\u0001\"\u0006\b«\u0001\u0010¬\u0001R*\u0010µ\u0001\u001a\u00030®\u00018\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0006\b¯\u0001\u0010°\u0001\u001a\u0006\b±\u0001\u0010²\u0001\"\u0006\b³\u0001\u0010´\u0001R*\u0010½\u0001\u001a\u00030¶\u00018\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0006\b·\u0001\u0010¸\u0001\u001a\u0006\b¹\u0001\u0010º\u0001\"\u0006\b»\u0001\u0010¼\u0001R*\u0010Å\u0001\u001a\u00030¾\u00018\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0006\b¿\u0001\u0010À\u0001\u001a\u0006\bÁ\u0001\u0010Â\u0001\"\u0006\bÃ\u0001\u0010Ä\u0001R*\u0010Í\u0001\u001a\u00030Æ\u00018\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0006\bÇ\u0001\u0010È\u0001\u001a\u0006\bÉ\u0001\u0010Ê\u0001\"\u0006\bË\u0001\u0010Ì\u0001R*\u0010Õ\u0001\u001a\u00030Î\u00018\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0006\bÏ\u0001\u0010Ð\u0001\u001a\u0006\bÑ\u0001\u0010Ò\u0001\"\u0006\bÓ\u0001\u0010Ô\u0001R*\u0010Ý\u0001\u001a\u00030Ö\u00018\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0006\b×\u0001\u0010Ø\u0001\u001a\u0006\bÙ\u0001\u0010Ú\u0001\"\u0006\bÛ\u0001\u0010Ü\u0001R1\u0010æ\u0001\u001a\u00030Þ\u00018\u0006@\u0006X\u0087.¢\u0006\u001f\n\u0006\bß\u0001\u0010à\u0001\u0012\u0005\bå\u0001\u0010\u0019\u001a\u0006\bá\u0001\u0010â\u0001\"\u0006\bã\u0001\u0010ä\u0001R1\u0010ë\u0001\u001a\u00030Þ\u00018\u0006@\u0006X\u0087.¢\u0006\u001f\n\u0006\bç\u0001\u0010à\u0001\u0012\u0005\bê\u0001\u0010\u0019\u001a\u0006\bè\u0001\u0010â\u0001\"\u0006\bé\u0001\u0010ä\u0001R1\u0010ð\u0001\u001a\u00030Þ\u00018\u0006@\u0006X\u0087.¢\u0006\u001f\n\u0006\bì\u0001\u0010à\u0001\u0012\u0005\bï\u0001\u0010\u0019\u001a\u0006\bí\u0001\u0010â\u0001\"\u0006\bî\u0001\u0010ä\u0001R*\u0010ø\u0001\u001a\u00030ñ\u00018\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0006\bò\u0001\u0010ó\u0001\u001a\u0006\bô\u0001\u0010õ\u0001\"\u0006\bö\u0001\u0010÷\u0001R*\u0010\u0080\u0002\u001a\u00030ù\u00018\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0006\bú\u0001\u0010û\u0001\u001a\u0006\bü\u0001\u0010ý\u0001\"\u0006\bþ\u0001\u0010ÿ\u0001R*\u0010\u0088\u0002\u001a\u00030\u0081\u00028\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0006\b\u0082\u0002\u0010\u0083\u0002\u001a\u0006\b\u0084\u0002\u0010\u0085\u0002\"\u0006\b\u0086\u0002\u0010\u0087\u0002R*\u0010\u0090\u0002\u001a\u00030\u0089\u00028\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0006\b\u008a\u0002\u0010\u008b\u0002\u001a\u0006\b\u008c\u0002\u0010\u008d\u0002\"\u0006\b\u008e\u0002\u0010\u008f\u0002R*\u0010\u0098\u0002\u001a\u00030\u0091\u00028\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0006\b\u0092\u0002\u0010\u0093\u0002\u001a\u0006\b\u0094\u0002\u0010\u0095\u0002\"\u0006\b\u0096\u0002\u0010\u0097\u0002R*\u0010 \u0002\u001a\u00030\u0099\u00028\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0006\b\u009a\u0002\u0010\u009b\u0002\u001a\u0006\b\u009c\u0002\u0010\u009d\u0002\"\u0006\b\u009e\u0002\u0010\u009f\u0002R*\u0010¨\u0002\u001a\u00030¡\u00028\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0006\b¢\u0002\u0010£\u0002\u001a\u0006\b¤\u0002\u0010¥\u0002\"\u0006\b¦\u0002\u0010§\u0002R*\u0010°\u0002\u001a\u00030©\u00028\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0006\bª\u0002\u0010«\u0002\u001a\u0006\b¬\u0002\u0010\u00ad\u0002\"\u0006\b®\u0002\u0010¯\u0002R*\u0010¸\u0002\u001a\u00030±\u00028\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0006\b²\u0002\u0010³\u0002\u001a\u0006\b´\u0002\u0010µ\u0002\"\u0006\b¶\u0002\u0010·\u0002R*\u0010À\u0002\u001a\u00030¹\u00028\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0006\bº\u0002\u0010»\u0002\u001a\u0006\b¼\u0002\u0010½\u0002\"\u0006\b¾\u0002\u0010¿\u0002R*\u0010È\u0002\u001a\u00030Á\u00028\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0006\bÂ\u0002\u0010Ã\u0002\u001a\u0006\bÄ\u0002\u0010Å\u0002\"\u0006\bÆ\u0002\u0010Ç\u0002R*\u0010Ð\u0002\u001a\u00030É\u00028\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0006\bÊ\u0002\u0010Ë\u0002\u001a\u0006\bÌ\u0002\u0010Í\u0002\"\u0006\bÎ\u0002\u0010Ï\u0002R*\u0010Ø\u0002\u001a\u00030Ñ\u00028\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0006\bÒ\u0002\u0010Ó\u0002\u001a\u0006\bÔ\u0002\u0010Õ\u0002\"\u0006\bÖ\u0002\u0010×\u0002R*\u0010à\u0002\u001a\u00030Ù\u00028\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0006\bÚ\u0002\u0010Û\u0002\u001a\u0006\bÜ\u0002\u0010Ý\u0002\"\u0006\bÞ\u0002\u0010ß\u0002R*\u0010è\u0002\u001a\u00030á\u00028\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0006\bâ\u0002\u0010ã\u0002\u001a\u0006\bä\u0002\u0010å\u0002\"\u0006\bæ\u0002\u0010ç\u0002R*\u0010ð\u0002\u001a\u00030é\u00028\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0006\bê\u0002\u0010ë\u0002\u001a\u0006\bì\u0002\u0010í\u0002\"\u0006\bî\u0002\u0010ï\u0002R*\u0010ø\u0002\u001a\u00030ñ\u00028\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0006\bò\u0002\u0010ó\u0002\u001a\u0006\bô\u0002\u0010õ\u0002\"\u0006\bö\u0002\u0010÷\u0002R\u0014\u0010û\u0002\u001a\u00020\u00108F¢\u0006\b\u001a\u0006\bù\u0002\u0010ú\u0002R\u0014\u0010ý\u0002\u001a\u00020\u00108F¢\u0006\b\u001a\u0006\bü\u0002\u0010ú\u0002R\u0018\u0010\u0081\u0003\u001a\u00030þ\u00028BX\u0082\u0004¢\u0006\b\u001a\u0006\bÿ\u0002\u0010\u0080\u0003R\u0018\u0010\u0083\u0003\u001a\u00030þ\u00028BX\u0082\u0004¢\u0006\b\u001a\u0006\b\u0082\u0003\u0010\u0080\u0003R\u0018\u0010\u0087\u0003\u001a\u00030\u0084\u00038BX\u0082\u0004¢\u0006\b\u001a\u0006\b\u0085\u0003\u0010\u0086\u0003R\u0018\u0010\u008b\u0003\u001a\u00030\u0088\u00038BX\u0082\u0004¢\u0006\b\u001a\u0006\b\u0089\u0003\u0010\u008a\u0003R\u0018\u0010\u008d\u0003\u001a\u00030\u0084\u00038BX\u0082\u0004¢\u0006\b\u001a\u0006\b\u008c\u0003\u0010\u0086\u0003R\u0018\u0010\u008f\u0003\u001a\u00030þ\u00028BX\u0082\u0004¢\u0006\b\u001a\u0006\b\u008e\u0003\u0010\u0080\u0003R\u0018\u0010\u0093\u0003\u001a\u00030\u0090\u00038BX\u0082\u0004¢\u0006\b\u001a\u0006\b\u0091\u0003\u0010\u0092\u0003R\u0018\u0010\u0097\u0003\u001a\u00030\u0094\u00038BX\u0082\u0004¢\u0006\b\u001a\u0006\b\u0095\u0003\u0010\u0096\u0003R\u0018\u0010\u0099\u0003\u001a\u00030\u0084\u00038BX\u0082\u0004¢\u0006\b\u001a\u0006\b\u0098\u0003\u0010\u0086\u0003R\u0018\u0010\u009d\u0003\u001a\u00030\u009a\u00038BX\u0082\u0004¢\u0006\b\u001a\u0006\b\u009b\u0003\u0010\u009c\u0003R\u0018\u0010\u009f\u0003\u001a\u00030þ\u00028BX\u0082\u0004¢\u0006\b\u001a\u0006\b\u009e\u0003\u0010\u0080\u0003R\u0018\u0010¡\u0003\u001a\u00030þ\u00028BX\u0082\u0004¢\u0006\b\u001a\u0006\b \u0003\u0010\u0080\u0003R\u0018\u0010¥\u0003\u001a\u00030¢\u00038BX\u0082\u0004¢\u0006\b\u001a\u0006\b£\u0003\u0010¤\u0003R\u0018\u0010§\u0003\u001a\u00030\u0084\u00038BX\u0082\u0004¢\u0006\b\u001a\u0006\b¦\u0003\u0010\u0086\u0003R\u0018\u0010©\u0003\u001a\u00030þ\u00028BX\u0082\u0004¢\u0006\b\u001a\u0006\b¨\u0003\u0010\u0080\u0003R\u0018\u0010«\u0003\u001a\u00030\u0084\u00038BX\u0082\u0004¢\u0006\b\u001a\u0006\bª\u0003\u0010\u0086\u0003R\u0018\u0010\u00ad\u0003\u001a\u00030\u0084\u00038BX\u0082\u0004¢\u0006\b\u001a\u0006\b¬\u0003\u0010\u0086\u0003R\u0018\u0010¯\u0003\u001a\u00030\u0084\u00038BX\u0082\u0004¢\u0006\b\u001a\u0006\b®\u0003\u0010\u0086\u0003R\u0018\u0010±\u0003\u001a\u00030þ\u00028BX\u0082\u0004¢\u0006\b\u001a\u0006\b°\u0003\u0010\u0080\u0003R\u0018\u0010³\u0003\u001a\u00030\u0084\u00038BX\u0082\u0004¢\u0006\b\u001a\u0006\b²\u0003\u0010\u0086\u0003R\u0018\u0010µ\u0003\u001a\u00030\u0084\u00038BX\u0082\u0004¢\u0006\b\u001a\u0006\b´\u0003\u0010\u0086\u0003R\u0018\u0010·\u0003\u001a\u00030\u0088\u00038BX\u0082\u0004¢\u0006\b\u001a\u0006\b¶\u0003\u0010\u008a\u0003R\u0018\u0010¹\u0003\u001a\u00030\u0084\u00038BX\u0082\u0004¢\u0006\b\u001a\u0006\b¸\u0003\u0010\u0086\u0003R\u0018\u0010»\u0003\u001a\u00030\u0084\u00038BX\u0082\u0004¢\u0006\b\u001a\u0006\bº\u0003\u0010\u0086\u0003R\u0018\u0010½\u0003\u001a\u00030þ\u00028BX\u0082\u0004¢\u0006\b\u001a\u0006\b¼\u0003\u0010\u0080\u0003R\u0018\u0010Á\u0003\u001a\u00030¾\u00038BX\u0082\u0004¢\u0006\b\u001a\u0006\b¿\u0003\u0010À\u0003R\u0018\u0010Ã\u0003\u001a\u00030\u0084\u00038BX\u0082\u0004¢\u0006\b\u001a\u0006\bÂ\u0003\u0010\u0086\u0003R\u0018\u0010Å\u0003\u001a\u00030þ\u00028BX\u0082\u0004¢\u0006\b\u001a\u0006\bÄ\u0003\u0010\u0080\u0003R\u0018\u0010Ç\u0003\u001a\u00030\u0088\u00038BX\u0082\u0004¢\u0006\b\u001a\u0006\bÆ\u0003\u0010\u008a\u0003R\u0018\u0010É\u0003\u001a\u00030\u0084\u00038BX\u0082\u0004¢\u0006\b\u001a\u0006\bÈ\u0003\u0010\u0086\u0003R\u0018\u0010Ë\u0003\u001a\u00030\u0084\u00038BX\u0082\u0004¢\u0006\b\u001a\u0006\bÊ\u0003\u0010\u0086\u0003R\u0018\u0010Í\u0003\u001a\u00030\u0088\u00038BX\u0082\u0004¢\u0006\b\u001a\u0006\bÌ\u0003\u0010\u008a\u0003R\u0018\u0010Ï\u0003\u001a\u00030þ\u00028BX\u0082\u0004¢\u0006\b\u001a\u0006\bÎ\u0003\u0010\u0080\u0003R\u0018\u0010Ñ\u0003\u001a\u00030\u0084\u00038BX\u0082\u0004¢\u0006\b\u001a\u0006\bÐ\u0003\u0010\u0086\u0003R\u0018\u0010Ó\u0003\u001a\u00030\u0088\u00038BX\u0082\u0004¢\u0006\b\u001a\u0006\bÒ\u0003\u0010\u008a\u0003R\u0018\u0010Õ\u0003\u001a\u00030\u0088\u00038BX\u0082\u0004¢\u0006\b\u001a\u0006\bÔ\u0003\u0010\u008a\u0003R\u0018\u0010×\u0003\u001a\u00030þ\u00028BX\u0082\u0004¢\u0006\b\u001a\u0006\bÖ\u0003\u0010\u0080\u0003R\u0018\u0010Ù\u0003\u001a\u00030\u0084\u00038BX\u0082\u0004¢\u0006\b\u001a\u0006\bØ\u0003\u0010\u0086\u0003R\u0018\u0010Û\u0003\u001a\u00030\u0084\u00038BX\u0082\u0004¢\u0006\b\u001a\u0006\bÚ\u0003\u0010\u0086\u0003R\u0018\u0010Ý\u0003\u001a\u00030\u0094\u00038BX\u0082\u0004¢\u0006\b\u001a\u0006\bÜ\u0003\u0010\u0096\u0003R\u0018\u0010ß\u0003\u001a\u00030\u0094\u00038BX\u0082\u0004¢\u0006\b\u001a\u0006\bÞ\u0003\u0010\u0096\u0003R\u0018\u0010á\u0003\u001a\u00030þ\u00028BX\u0082\u0004¢\u0006\b\u001a\u0006\bà\u0003\u0010\u0080\u0003R\u0018\u0010ã\u0003\u001a\u00030þ\u00028BX\u0082\u0004¢\u0006\b\u001a\u0006\bâ\u0003\u0010\u0080\u0003R\u0018\u0010å\u0003\u001a\u00030\u0084\u00038BX\u0082\u0004¢\u0006\b\u001a\u0006\bä\u0003\u0010\u0086\u0003R\u0018\u0010é\u0003\u001a\u00030æ\u00038BX\u0082\u0004¢\u0006\b\u001a\u0006\bç\u0003\u0010è\u0003R\u0018\u0010ë\u0003\u001a\u00030\u0084\u00038BX\u0082\u0004¢\u0006\b\u001a\u0006\bê\u0003\u0010\u0086\u0003R\u0018\u0010í\u0003\u001a\u00030\u0084\u00038BX\u0082\u0004¢\u0006\b\u001a\u0006\bì\u0003\u0010\u0086\u0003R\u0018\u0010ï\u0003\u001a\u00030\u0084\u00038BX\u0082\u0004¢\u0006\b\u001a\u0006\bî\u0003\u0010\u0086\u0003R\u0018\u0010ó\u0003\u001a\u00030ð\u00038BX\u0082\u0004¢\u0006\b\u001a\u0006\bñ\u0003\u0010ò\u0003R\u0018\u0010÷\u0003\u001a\u00030ô\u00038BX\u0082\u0004¢\u0006\b\u001a\u0006\bõ\u0003\u0010ö\u0003R\u0018\u0010û\u0003\u001a\u00030ø\u00038BX\u0082\u0004¢\u0006\b\u001a\u0006\bù\u0003\u0010ú\u0003R\u0018\u0010ý\u0003\u001a\u00030\u0084\u00038BX\u0082\u0004¢\u0006\b\u001a\u0006\bü\u0003\u0010\u0086\u0003R\u0018\u0010\u0081\u0004\u001a\u00030þ\u00038BX\u0082\u0004¢\u0006\b\u001a\u0006\bÿ\u0003\u0010\u0080\u0004R\u0018\u0010\u0085\u0004\u001a\u00030\u0082\u00048BX\u0082\u0004¢\u0006\b\u001a\u0006\b\u0083\u0004\u0010\u0084\u0004R\u0018\u0010\u0089\u0004\u001a\u00030\u0086\u00048BX\u0082\u0004¢\u0006\b\u001a\u0006\b\u0087\u0004\u0010\u0088\u0004R\u0018\u0010\u008b\u0004\u001a\u00030\u0086\u00048BX\u0082\u0004¢\u0006\b\u001a\u0006\b\u008a\u0004\u0010\u0088\u0004R\u0017\u0010\u008e\u0004\u001a\u00020\u001d8BX\u0082\u0004¢\u0006\b\u001a\u0006\b\u008c\u0004\u0010\u008d\u0004R)\u0010\u0092\u0004\u001a\u00020\u001d2\u0007\u0010\u008f\u0004\u001a\u00020\u001d8B@BX\u0082\u000e¢\u0006\u000f\u001a\u0006\b\u0090\u0004\u0010\u008d\u0004\"\u0005\b\u0091\u0004\u0010 ¨\u0006\u0093\u0004"}, d2 = {"Lcom/sportybet/plugin/realsports/betslip/widget/QuickBetView;", "Landroid/widget/FrameLayout;", "Lcom/sportybet/ntespm/socket/Subscriber;", "Landroid/view/View$OnClickListener;", "Li8;", "Landroid/view/View$OnTouchListener;", "Lcom/sportybet/plugin/realsports/betslip/virtualkeyboard/KeyboardView$b;", "Lnzm$a;", "Lk9j;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", AnalyticsParam.EVENT_PARAM_IS_CHECKED, "", "setGiftChecked", "(Z)V", "setMultipleModeUI", "()V", "value", "setMessageValue", "setAllGiftStateChecked", "", "text", "setGiftsContainerText", "(Ljava/lang/String;)V", "visible", "setConfirmPageVisibility", "isSim", "setPlaceBetBtn", "setAcceptBtn", "Lijd0;", "c", "Lttr;", "getBinding", "()Lijd0;", "binding", "Landroid/view/animation/Animation;", "H", "Landroid/view/animation/Animation;", "getTranslate", "()Landroid/view/animation/Animation;", "setTranslate", "(Landroid/view/animation/Animation;)V", "translate", "I", "Z", "getQuickBetViewAnimFinish", "()Z", "setQuickBetViewAnimFinish", "quickBetViewAnimFinish", "J", "isConfirmPageOnScreen", "setConfirmPageOnScreen", "K", "isPlaceBetSuccess", "setPlaceBetSuccess", "Lnjs;", "Lcom/sporty/android/core/model/config/tax/TaxConfigs;", "q0", "getTaxConfigsLiveData", "()Lnjs;", "taxConfigsLiveData", "Ly8j;", "r0", "Ly8j;", "getFullStoryCommonManager", "()Ly8j;", "setFullStoryCommonManager", "(Ly8j;)V", "fullStoryCommonManager", "Lk650;", "s0", "Lk650;", "getRemoteConfigRepository", "()Lk650;", "setRemoteConfigRepository", "(Lk650;)V", "remoteConfigRepository", "Luqm;", "t0", "Luqm;", "getAccountHelper", "()Luqm;", "setAccountHelper", "(Luqm;)V", "accountHelper", "Lo8s;", "u0", "Lo8s;", "getLiabilityCheckUseCases", "()Lo8s;", "setLiabilityCheckUseCases", "(Lo8s;)V", "liabilityCheckUseCases", "Lbi30;", "v0", "Lbi30;", "getQuickLiabilityCheckResultValidationUseCase", "()Lbi30;", "setQuickLiabilityCheckResultValidationUseCase", "(Lbi30;)V", "quickLiabilityCheckResultValidationUseCase", "Lpsm;", "w0", "Lpsm;", "getCountryManager", "()Lpsm;", "setCountryManager", "(Lpsm;)V", "countryManager", "Lj800;", "x0", "Lj800;", "getPaymentNavigator", "()Lj800;", "setPaymentNavigator", "(Lj800;)V", "paymentNavigator", "Lh530;", "y0", "Lh530;", "getPromotionRepository", "()Lh530;", "setPromotionRepository", "(Lh530;)V", "promotionRepository", "Lcom/sporty/android/common/uievent/e;", "z0", "Lcom/sporty/android/common/uievent/e;", "getCommonUiEventProcessor", "()Lcom/sporty/android/common/uievent/e;", "setCommonUiEventProcessor", "(Lcom/sporty/android/common/uievent/e;)V", "commonUiEventProcessor", "Luy0;", "A0", "Luy0;", "getAssetsInfoRepository", "()Luy0;", "setAssetsInfoRepository", "(Luy0;)V", "assetsInfoRepository", "Ljrm;", "B0", "Ljrm;", "getBetItem", "()Ljrm;", "setBetItem", "(Ljrm;)V", "betItem", "Llrm;", "C0", "Llrm;", "getBetStore", "()Llrm;", "setBetStore", "(Llrm;)V", "betStore", "Ly8k;", "D0", "Ly8k;", "getGetMinStakeUseCase", "()Ly8k;", "setGetMinStakeUseCase", "(Ly8k;)V", "getMinStakeUseCase", "Lp8k;", "E0", "Lp8k;", "getGetMaxStakeUseCase", "()Lp8k;", "setGetMaxStakeUseCase", "(Lp8k;)V", "getMaxStakeUseCase", "Lq8k;", "F0", "Lq8k;", "getGetMaxWinUseCase", "()Lq8k;", "setGetMaxWinUseCase", "(Lq8k;)V", "getMaxWinUseCase", "Lnzm;", "G0", "Lnzm;", "getStakeConfigAgent", "()Lnzm;", "setStakeConfigAgent", "(Lnzm;)V", "stakeConfigAgent", "Lkrm;", "H0", "Lkrm;", "getBetMutexDataInstance", "()Lkrm;", "setBetMutexDataInstance", "(Lkrm;)V", "betMutexDataInstance", "Lh53;", "I0", "Lh53;", "getBetSlipMarketingDomainService", "()Lh53;", "setBetSlipMarketingDomainService", "(Lh53;)V", "betSlipMarketingDomainService", "Lit90;", "J0", "Lit90;", "getSingleBetUseCase", "()Lit90;", "setSingleBetUseCase", "(Lit90;)V", "singleBetUseCase", "Lup3;", "K0", "Lup3;", "getSingleGiftState", "()Lup3;", "setSingleGiftState", "(Lup3;)V", "getSingleGiftState$annotations", "singleGiftState", "L0", "getMultipleGiftState", "setMultipleGiftState", "getMultipleGiftState$annotations", "multipleGiftState", "M0", "getDefaultNoUseGiftState", "setDefaultNoUseGiftState", "getDefaultNoUseGiftState$annotations", "defaultNoUseGiftState", "Lww2;", "N0", "Lww2;", "getBetOddsUseCases", "()Lww2;", "setBetOddsUseCases", "(Lww2;)V", "betOddsUseCases", "Lcih0;", "O0", "Lcih0;", "getUpSelectionRowUseCase", "()Lcih0;", "setUpSelectionRowUseCase", "(Lcih0;)V", "upSelectionRowUseCase", "Lz9k;", "P0", "Lz9k;", "getGetOUEarlyGoalSelectionViewState", "()Lz9k;", "setGetOUEarlyGoalSelectionViewState", "(Lz9k;)V", "getOUEarlyGoalSelectionViewState", "Lrdd0;", "Q0", "Lrdd0;", "getSportyTrackingUseCase", "()Lrdd0;", "setSportyTrackingUseCase", "(Lrdd0;)V", "sportyTrackingUseCase", "Lex4;", "R0", "Lex4;", "getBookConfigRepository", "()Lex4;", "setBookConfigRepository", "(Lex4;)V", "bookConfigRepository", "Lat2;", "S0", "Lat2;", "getBetHistoryRepository", "()Lat2;", "setBetHistoryRepository", "(Lat2;)V", "betHistoryRepository", "Lkj7;", "T0", "Lkj7;", "getCheckUseGiftStakeEqualPayUseCase", "()Lkj7;", "setCheckUseGiftStakeEqualPayUseCase", "(Lkj7;)V", "checkUseGiftStakeEqualPayUseCase", "Lj990;", "U0", "Lj990;", "getShouldShowUniqueCodeInfoSheetUseCase", "()Lj990;", "setShouldShowUniqueCodeInfoSheetUseCase", "(Lj990;)V", "shouldShowUniqueCodeInfoSheetUseCase", "Llx20;", "V0", "Llx20;", "getProcessOneUpPromoBetSuccessUseCase", "()Llx20;", "setProcessOneUpPromoBetSuccessUseCase", "(Llx20;)V", "processOneUpPromoBetSuccessUseCase", "Lsty;", "W0", "Lsty;", "getOneUpSelectionAttributionDispatcher", "()Lsty;", "setOneUpSelectionAttributionDispatcher", "(Lsty;)V", "oneUpSelectionAttributionDispatcher", "Lzik;", "X0", "Lzik;", "getGiftCalculateStakeWithGiftUseCase", "()Lzik;", "setGiftCalculateStakeWithGiftUseCase", "(Lzik;)V", "giftCalculateStakeWithGiftUseCase", "Lmjf;", "Y0", "Lmjf;", "getEarlyPayoutConfiguration", "()Lmjf;", "setEarlyPayoutConfiguration", "(Lmjf;)V", "earlyPayoutConfiguration", "Lc980;", "Z0", "Lc980;", "getSelectionPendingToggleHolder", "()Lc980;", "setSelectionPendingToggleHolder", "(Lc980;)V", "selectionPendingToggleHolder", "Lsfy;", "a1", "Lsfy;", "getOddsBoostConfigurationManager", "()Lsfy;", "setOddsBoostConfigurationManager", "(Lsfy;)V", "oddsBoostConfigurationManager", "Lhc40;", "b1", "Lhc40;", "getRebetRemixCombineAnTestHelper", "()Lhc40;", "setRebetRemixCombineAnTestHelper", "(Lhc40;)V", "rebetRemixCombineAnTestHelper", "Ls1p;", "c1", "Ls1p;", "O", "()Ls1p;", "setLfbBoostEligibleUseCase", "(Ls1p;)V", "isLfbBoostEligibleUseCase", "Legy;", "d1", "Legy;", "getOddsBoostRatioForSelectionProvider", "()Legy;", "setOddsBoostRatioForSelectionProvider", "(Legy;)V", "oddsBoostRatioForSelectionProvider", "getThemeBgColor", "()I", "themeBgColor", "getThemeHighlightedBgColor", "themeHighlightedBgColor", "Landroid/view/View;", "getBoostView", "()Landroid/view/View;", "boostView", "getBoostButton", "boostButton", "Landroid/widget/TextView;", "getBoostTextView", "()Landroid/widget/TextView;", "boostTextView", "Landroid/widget/ImageView;", "getRotateClockView", "()Landroid/widget/ImageView;", "rotateClockView", "getBoostHintView", "boostHintView", "getBoostOddsView", "boostOddsView", "Lcom/sportybet/plugin/realsports/betslip/virtualkeyboard/KeyboardView;", "getNumberKeyboardView", "()Lcom/sportybet/plugin/realsports/betslip/virtualkeyboard/KeyboardView;", "numberKeyboardView", "Landroid/widget/LinearLayout;", "getPlaceBetBtnLayout", "()Landroid/widget/LinearLayout;", "placeBetBtnLayout", "getPlaceBetBtn", "placeBetBtn", "Landroid/widget/Button;", "getAcceptChangesBtn", "()Landroid/widget/Button;", "acceptChangesBtn", "getRequireManualChangeSelectionView", "requireManualChangeSelectionView", "getChangesWarningView", "changesWarningView", "Landroid/widget/EditText;", "getEtInput", "()Landroid/widget/EditText;", "etInput", "getAdditionalMsg", "additionalMsg", "getGoToDepositBtn", "goToDepositBtn", "getFullWin", "fullWin", "getPotentialWinTitle", "potentialWinTitle", "getPotentialWin", "potentialWin", "getMatchOddsViewContainer", "matchOddsViewContainer", "getInitMatchOddsView", "initMatchOddsView", "getMatchOddsView", "matchOddsView", "getMatchOddsLeftIcon", "matchOddsLeftIcon", "getMarketDesc", "marketDesc", "getMarketDescAlt", "marketDescAlt", "getGiftsContainerV2", "giftsContainerV2", "Landroid/widget/CheckBox;", "getGiftCheckbox", "()Landroid/widget/CheckBox;", "giftCheckbox", "getTvGift", "tvGift", "getCloseQuickBetContainer", "closeQuickBetContainer", "getCloseQuickBetView", "closeQuickBetView", "getLiveView", "liveView", "getStatusView", "statusView", "getBoostCheckBoxView", "boostCheckBoxView", "getWholeView", "wholeView", "getCurrencyView", "currencyView", "getToggleSportyCoins", "toggleSportyCoins", "getToggleBalance", "toggleBalance", "getPotentialTaxWinLayout", "potentialTaxWinLayout", "getPotentialTaxTitle", "potentialTaxTitle", "getPotentialTaxWin", "potentialTaxWin", "getQuickBetSlipLoading", "quickBetSlipLoading", "getQuickBetSlipLayout", "quickBetSlipLayout", "getPotWinLayout", "potWinLayout", "getFullWinLayout", "fullWinLayout", "getExciseTax", "exciseTax", "Landroidx/constraintlayout/widget/ConstraintLayout;", "getClMultipleBet", "()Landroidx/constraintlayout/widget/ConstraintLayout;", "clMultipleBet", "getTvMultipleBetCount", "tvMultipleBetCount", "getTvMultipleDoubleValue", "tvMultipleDoubleValue", "getTvMultipleDoubleText", "tvMultipleDoubleText", "Landroidx/appcompat/widget/AppCompatTextView;", "getTvMultipleBetBonusHint", "()Landroidx/appcompat/widget/AppCompatTextView;", "tvMultipleBetBonusHint", "Landroid/widget/ProgressBar;", "getPbMultipleBetBonusHint", "()Landroid/widget/ProgressBar;", "pbMultipleBetBonusHint", "Lcom/sportybet/plugin/realsports/betslip/simulate/SimulateAutoBetPanel;", "getSimulateAutoBetPanel", "()Lcom/sportybet/plugin/realsports/betslip/simulate/SimulateAutoBetPanel;", "simulateAutoBetPanel", "getBetSlipTitleText", "betSlipTitleText", "Landroidx/constraintlayout/widget/Group;", "getGroupBonusHint", "()Landroidx/constraintlayout/widget/Group;", "groupBonusHint", "Lcom/sportybet/android/widget/OneUpTwoUpItemControl;", "getOneTwoUpItemControl", "()Lcom/sportybet/android/widget/OneUpTwoUpItemControl;", "oneTwoUpItemControl", "Lcom/sportybet/android/widget/EarlyPayoutCheckbox;", "getEarlyPayoutItemControl", "()Lcom/sportybet/android/widget/EarlyPayoutCheckbox;", "earlyPayoutItemControl", "getNeverDownItemControl", "neverDownItemControl", "getCurrentTotalOddsForGift", "()Ljava/lang/String;", "currentTotalOddsForGift", "data", "getInputData", "setInputData", "inputData", "africa-bet-android"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class QuickBetView extends Hilt_QuickBetView implements Subscriber, View.OnClickListener, i8, View.OnTouchListener, KeyboardView.b, nzm.a, k9j {
    public static boolean j1 = false;
    public static boolean k1 = false;
    public static boolean l1 = true;
    public static String m1;
    public static Selection n1;
    public static String o1;
    public static String p1;
    public static final HashSet q1 = new HashSet();
    public boolean A;

    /* JADX INFO: renamed from: A0, reason: from kotlin metadata */
    public uy0 assetsInfoRepository;
    public CountDownTimer B;

    /* JADX INFO: renamed from: B0, reason: from kotlin metadata */
    public jrm betItem;
    public boolean C;

    /* JADX INFO: renamed from: C0, reason: from kotlin metadata */
    public lrm betStore;
    public boolean D;

    /* JADX INFO: renamed from: D0, reason: from kotlin metadata */
    public y8k getMinStakeUseCase;
    public su5<BaseResponse<OrderWithFailUpdate>> E;

    /* JADX INFO: renamed from: E0, reason: from kotlin metadata */
    public p8k getMaxStakeUseCase;
    public TaxConfigs F;

    /* JADX INFO: renamed from: F0, reason: from kotlin metadata */
    public q8k getMaxWinUseCase;
    public float G;

    /* JADX INFO: renamed from: G0, reason: from kotlin metadata */
    public nzm stakeConfigAgent;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    public Animation translate;

    /* JADX INFO: renamed from: H0, reason: from kotlin metadata */
    public krm betMutexDataInstance;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    public boolean quickBetViewAnimFinish;

    /* JADX INFO: renamed from: I0, reason: from kotlin metadata */
    public h53 betSlipMarketingDomainService;

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    public boolean isConfirmPageOnScreen;

    /* JADX INFO: renamed from: J0, reason: from kotlin metadata */
    public it90 singleBetUseCase;

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    public boolean isPlaceBetSuccess;

    /* JADX INFO: renamed from: K0, reason: from kotlin metadata */
    public up3 singleGiftState;
    public BigDecimal L;

    /* JADX INFO: renamed from: L0, reason: from kotlin metadata */
    public up3 multipleGiftState;
    public boolean M;

    /* JADX INFO: renamed from: M0, reason: from kotlin metadata */
    public up3 defaultNoUseGiftState;
    public boolean N;

    /* JADX INFO: renamed from: N0, reason: from kotlin metadata */
    public ww2 betOddsUseCases;
    public boolean O;

    /* JADX INFO: renamed from: O0, reason: from kotlin metadata */
    public cih0 upSelectionRowUseCase;
    public boolean P;

    /* JADX INFO: renamed from: P0, reason: from kotlin metadata */
    public z9k getOUEarlyGoalSelectionViewState;
    public boolean Q;

    /* JADX INFO: renamed from: Q0, reason: from kotlin metadata */
    public rdd0 sportyTrackingUseCase;
    public final ema R;

    /* JADX INFO: renamed from: R0, reason: from kotlin metadata */
    public ex4 bookConfigRepository;
    public final l830<String> S;

    /* JADX INFO: renamed from: S0, reason: from kotlin metadata */
    public at2 betHistoryRepository;
    public zc30 T;

    /* JADX INFO: renamed from: T0, reason: from kotlin metadata */
    public kj7 checkUseGiftStakeEqualPayUseCase;
    public k830<Boolean> U;

    /* JADX INFO: renamed from: U0, reason: from kotlin metadata */
    public j990 shouldShowUniqueCodeInfoSheetUseCase;
    public final zd2<bg30> V;

    /* JADX INFO: renamed from: V0, reason: from kotlin metadata */
    public lx20 processOneUpPromoBetSuccessUseCase;
    public final zd2<String> W;

    /* JADX INFO: renamed from: W0, reason: from kotlin metadata */
    public sty oneUpSelectionAttributionDispatcher;

    /* JADX INFO: renamed from: X0, reason: from kotlin metadata */
    public zik giftCalculateStakeWithGiftUseCase;

    /* JADX INFO: renamed from: Y0, reason: from kotlin metadata */
    public mjf earlyPayoutConfiguration;

    /* JADX INFO: renamed from: Z0, reason: from kotlin metadata */
    public c980 selectionPendingToggleHolder;
    public final GroupTopic a0;

    /* JADX INFO: renamed from: a1, reason: from kotlin metadata */
    public sfy oddsBoostConfigurationManager;
    public fj2 b0;

    /* JADX INFO: renamed from: b1, reason: from kotlin metadata */
    public hc40 rebetRemixCombineAnTestHelper;
    public final mpe0 c;
    public ee30 c0;

    /* JADX INFO: renamed from: c1, reason: from kotlin metadata */
    public s1p isLfbBoostEligibleUseCase;
    public GuideView d;
    public tf30 d0;

    /* JADX INFO: renamed from: d1, reason: from kotlin metadata */
    public egy oddsBoostRatioForSelectionProvider;
    public kd30 e;
    public bsy e0;
    public final b e1;
    public WeakReference<Activity> f;
    public ijf f0;
    public boolean f1;
    public xlc g0;
    public boolean g1;
    public bpx h0;
    public final JsonSerializeService h1;
    public final ArrayList i;
    public yyk i0;
    public final a i1;
    public hzz j0;
    public aj90 k0;
    public jvd0 l0;
    public jvd0 m0;
    public jlv n0;
    public ibs o0;
    public long p0;
    public final mpe0 q0;

    /* JADX INFO: renamed from: r0, reason: from kotlin metadata */
    public y8j fullStoryCommonManager;

    /* JADX INFO: renamed from: s0, reason: from kotlin metadata */
    public k650 remoteConfigRepository;

    /* JADX INFO: renamed from: t0, reason: from kotlin metadata */
    public uqm accountHelper;

    /* JADX INFO: renamed from: u0, reason: from kotlin metadata */
    public o8s liabilityCheckUseCases;
    public boolean v;

    /* JADX INFO: renamed from: v0, reason: from kotlin metadata */
    public bi30 quickLiabilityCheckResultValidationUseCase;
    public String w;

    /* JADX INFO: renamed from: w0, reason: from kotlin metadata */
    public psm countryManager;

    /* JADX INFO: renamed from: x0, reason: from kotlin metadata */
    public j800 paymentNavigator;
    public long y;

    /* JADX INFO: renamed from: y0, reason: from kotlin metadata */
    public h530 promotionRepository;
    public boolean z;

    /* JADX INFO: renamed from: z0, reason: from kotlin metadata */
    public com.sporty.android.common.uievent.e commonUiEventProcessor;

    /* JADX INFO: loaded from: classes7.dex */
    public static final class a implements Subscriber {

        /* JADX INFO: renamed from: com.sportybet.plugin.realsports.betslip.widget.QuickBetView$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001¨\u0006\u0004"}, d2 = {"com/sportybet/plugin/realsports/betslip/widget/QuickBetView$a$a", "Lcom/google/gson/reflect/TypeToken;", "", "Lcom/sportybet/android/data/BannedItemSocket;", "africa-bet-android"}, k = 1, mv = {2, 4, 0}, xi = 48)
        public static final class C0424a extends TypeToken<List<? extends BannedItemSocket>> {
        }

        public a() {
        }

        @Override // com.sportybet.ntespm.socket.Subscriber
        public final void onReceive(String str) {
            QuickBetView quickBetView = QuickBetView.this;
            if (quickBetView.v || !quickBetView.A) {
                return;
            }
            try {
                Object objFromJson = quickBetView.h1.fromJson(str, new C0424a().getType());
                objFromJson.getClass();
                ArrayList arrayListE = g2k.e((List) objFromJson);
                int size = arrayListE.size();
                int i = 0;
                while (i < size) {
                    Object obj = arrayListE.get(i);
                    i++;
                    BannedItemSocket bannedItemSocket = (BannedItemSocket) obj;
                    ArrayList arrayListU = quickBetView.getBetItem().U();
                    int size2 = arrayListU.size();
                    int i2 = 0;
                    while (i2 < size2) {
                        Object obj2 = arrayListU.get(i2);
                        i2++;
                        Selection selection = (Selection) obj2;
                        Event event = selection.a;
                        if (event != null && kotlin.text.c.l(bannedItemSocket.getId(), event.eventId, true)) {
                            String str2 = event.eventId;
                            str2.getClass();
                            quickBetView.post(new yd30(quickBetView, str2, bannedItemSocket.getBanned(), selection));
                            break;
                        }
                    }
                }
            } catch (Exception e) {
                itf0.a aVar = itf0.a;
                aVar.q(MyLog.TAG_SOCKET);
                aVar.p(e, "Failed to parse bannedList Socket data: %s", str);
            }
        }
    }

    /* JADX INFO: loaded from: classes7.dex */
    public static final class b implements rdd {
        public b() {
        }

        @Override // defpackage.rdd
        public final void onPause(ibs ibsVar) {
            tf30 tf30Var = QuickBetView.this.d0;
            if (tf30Var != null) {
                tf30Var.c0 = Long.valueOf(System.currentTimeMillis());
            }
        }

        @Override // defpackage.rdd
        public final void onResume(ibs ibsVar) {
            itf0.a aVar = itf0.a;
            aVar.q(MyLog.TAG_QUICK_BET);
            aVar.g("onResume", new Object[0]);
            tf30 tf30Var = QuickBetView.this.d0;
            if (tf30Var != null) {
                ej5.c(o8i0.d(tf30Var), null, null, new jf30(tf30Var, null), 3);
            }
        }
    }

    /* JADX INFO: loaded from: classes7.dex */
    public static final class c extends uj90<Integer> {
        public c() {
        }

        @Override // defpackage.kfy
        public final void onNext(Object obj) {
            ((Number) obj).intValue();
            boolean z = QuickBetView.j1;
            QuickBetView.this.R0();
        }
    }

    /* JADX INFO: loaded from: classes7.dex */
    public static final class d extends uj90<Pair<Integer, bg30>> {
        public d() {
        }

        @Override // defpackage.kfy
        public final void onNext(Object obj) {
            BigDecimal bigDecimalMultiply;
            BigDecimal bigDecimalMultiply2;
            BigDecimal bigDecimalMultiply3;
            Pair pair = (Pair) obj;
            pair.getClass();
            Object obj2 = pair.first;
            obj2.getClass();
            BigDecimal bigDecimal = new BigDecimal(((Number) obj2).intValue());
            QuickBetView quickBetView = QuickBetView.this;
            boolean zM0 = quickBetView.getBetItem().m0();
            bg30 bg30Var = (bg30) pair.second;
            if (zM0) {
                bigDecimalMultiply = bg30Var.a.setScale(2, RoundingMode.HALF_UP).multiply(bigDecimal);
                bigDecimalMultiply.getClass();
            } else {
                bigDecimalMultiply = bg30Var.a.multiply(bigDecimal);
                bigDecimalMultiply.getClass();
            }
            if (zM0) {
                bigDecimalMultiply2 = bg30Var.c.setScale(2, RoundingMode.HALF_UP).multiply(bigDecimal);
                bigDecimalMultiply2.getClass();
            } else {
                bigDecimalMultiply2 = bg30Var.c.multiply(bigDecimal);
                bigDecimalMultiply2.getClass();
            }
            if (zM0) {
                bigDecimalMultiply3 = bg30Var.b.setScale(2, RoundingMode.HALF_UP).multiply(bigDecimal).multiply(new BigDecimal(-1));
                bigDecimalMultiply3.getClass();
            } else {
                bigDecimalMultiply3 = bg30Var.b.multiply(bigDecimal).multiply(new BigDecimal(-1));
                bigDecimalMultiply3.getClass();
            }
            TextView fullWin = quickBetView.getFullWin();
            Locale locale = Locale.US;
            fullWin.setText(bjb0.L(bigDecimalMultiply, locale));
            quickBetView.getPotentialWin().setText(bjb0.L(bigDecimalMultiply2, locale));
            quickBetView.getPotentialTaxWin().setText(bjb0.L(bigDecimalMultiply3, locale));
        }
    }

    /* JADX INFO: loaded from: classes7.dex */
    public static final class e extends uj90<kotlin.Pair<? extends Integer, ? extends String>> {
        public e() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // defpackage.kfy
        public final void onNext(Object obj) {
            kotlin.Pair pair = (kotlin.Pair) obj;
            pair.getClass();
            Number number = (Number) pair.a;
            BigDecimal bigDecimal = new BigDecimal(number.intValue());
            String str = (String) pair.b;
            BigDecimal bigDecimal2 = new BigDecimal(str);
            QuickBetView quickBetView = QuickBetView.this;
            boolean zM0 = quickBetView.getBetItem().m0();
            if (zM0) {
                TextView placeBetBtn = quickBetView.getPlaceBetBtn();
                Context context = quickBetView.getContext();
                context.getClass();
                placeBetBtn.setText(cj90.a(number.intValue(), context, str));
                quickBetView.getExciseTax().setVisibility(8);
                return;
            }
            if (quickBetView.F.hasExciseTaxRate(zM0)) {
                BigDecimal bigDecimalMultiply = quickBetView.F.getExciseTax(false, bigDecimal2).multiply(bigDecimal);
                bigDecimalMultiply.getClass();
                quickBetView.getExciseTax().setVisibility(0);
                TextView exciseTax = quickBetView.getExciseTax();
                TextView exciseTax2 = quickBetView.getExciseTax();
                Locale locale = Locale.US;
                exciseTax.setText(sn5.c(exciseTax2, R.string.component_betslip__excise_tax_stake, bjb0.L(bigDecimalMultiply, locale)));
                quickBetView.getExciseTax().setTextColor(quickBetView.getResources().getColor(R.color.white));
                quickBetView.getPlaceBetBtn().setText(sn5.c(quickBetView.getPlaceBetBtn(), R.string.component_betslip__place_bet_with_excise_tax, bjb0.L(bigDecimal2.multiply(bigDecimal), locale)));
                return;
            }
            quickBetView.getExciseTax().setVisibility(8);
            String strC = sn5.c(quickBetView, R.string.component_betslip__login_to_place_bet, new Object[0]);
            if (quickBetView.getAccountHelper().getAccount() != null) {
                strC = quickBetView.getContext().getString(R.string.component_betslip__place_bet);
                strC.getClass();
            }
            String strL = bjb0.L(bigDecimal2.multiply(bigDecimal), Locale.US);
            TextView placeBetBtn2 = quickBetView.getPlaceBetBtn();
            j7g j7gVar = new j7g(strC);
            j7gVar.l(bqe.a(12.0f), sn5.c(quickBetView, R.string.component_betslip__about_to_pay_vamount_lineup, strL));
            placeBetBtn2.setText(j7gVar);
        }
    }

    /* JADX INFO: loaded from: classes7.dex */
    @c0d(c = "com.sportybet.plugin.realsports.betslip.widget.QuickBetView$processQuickBetSuccess$1", f = "QuickBetView.kt", l = {4183}, m = "invokeSuspend", v = 2)
    public static final class f extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ ng10 b;
        public final /* synthetic */ QuickBetView c;
        public final /* synthetic */ OrderWithFailUpdate d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(ng10 ng10Var, QuickBetView quickBetView, OrderWithFailUpdate orderWithFailUpdate, v1b<? super f> v1bVar) {
            super(2, v1bVar);
            this.b = ng10Var;
            this.c = quickBetView;
            this.d = orderWithFailUpdate;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return new f(this.b, this.c, this.d, v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((f) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            Object objA;
            y5b y5bVar = y5b.a;
            int i = this.a;
            QuickBetView quickBetView = this.c;
            if (i == 0) {
                uj50.b(obj);
                lx20 processOneUpPromoBetSuccessUseCase = quickBetView.getProcessOneUpPromoBetSuccessUseCase();
                this.a = 1;
                objA = pg10.a(this.b, processOneUpPromoBetSuccessUseCase, this);
                if (objA == y5bVar) {
                    return y5bVar;
                }
            } else {
                if (i != 1) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                uj50.b(obj);
                objA = obj;
            }
            aty atyVar = (aty) objA;
            tf30 tf30Var = quickBetView.d0;
            if (tf30Var != null) {
                int i2 = atyVar.a;
                wwd0 wwd0Var = tf30Var.Z;
                wwd0Var.k(null, v03.q.a((v03.q) wwd0Var.getValue(), null, null, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 0, null, null, null, null, false, null, i2, 0, 6291455));
            }
            tf30 tf30Var2 = quickBetView.d0;
            if (tf30Var2 != null) {
                String str = this.d.orderId;
                if (str != null) {
                    wwd0 wwd0Var2 = tf30Var2.Z;
                    wwd0Var2.k(null, v03.q.a((v03.q) wwd0Var2.getValue(), null, null, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 0, null, str, null, null, false, null, 0, 0, 8323071));
                }
                tf30Var2.E1(new v03.o(tf30Var2.A1()));
            }
            return Unit.a;
        }
    }

    /* JADX INFO: loaded from: classes7.dex */
    public static final class g implements com.sportybet.plugin.realsports.betslip.widget.d.c {
        public g() {
        }

        @Override // com.sportybet.plugin.realsports.betslip.widget.d.c
        public final void a() {
            tf30 tf30Var;
            QuickBetView quickBetView = QuickBetView.this;
            quickBetView.setConfirmPageOnScreen(false);
            tf30 tf30Var2 = quickBetView.d0;
            if (tf30Var2 != null) {
                tf30Var2.E1(new v03.p(tf30Var2.A1()));
            }
            if (!quickBetView.getBetItem().m0() || (tf30Var = quickBetView.d0) == null) {
                return;
            }
            tf30Var.O.a(quickBetView.getBetItem().v0(), quickBetView.getBetItem().t1());
        }

        @Override // com.sportybet.plugin.realsports.betslip.widget.d.c
        public final void b() {
            QuickBetView quickBetView = QuickBetView.this;
            quickBetView.P = true;
            yyk yykVar = quickBetView.i0;
            if (yykVar != null) {
                yykVar.E1();
            }
            tf30 tf30Var = quickBetView.d0;
            if (tf30Var != null) {
                tf30Var.C1(1);
            }
        }

        @Override // com.sportybet.plugin.realsports.betslip.widget.d.c
        public final void onCancel() {
            QuickBetView.this.setConfirmPageOnScreen(false);
        }
    }

    /* JADX INFO: loaded from: classes7.dex */
    public static final class h implements ViewTreeObserver.OnGlobalLayoutListener {
        public h() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public final void onGlobalLayout() {
            QuickBetView quickBetView = QuickBetView.this;
            quickBetView.getBoostView().getViewTreeObserver().removeOnGlobalLayoutListener(this);
            quickBetView.B0();
        }
    }

    /* JADX INFO: loaded from: classes7.dex */
    public static final class i implements Animation.AnimationListener {
        public i() {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public final void onAnimationEnd(Animation animation) {
            RotateAnimation rotateAnimation = new RotateAnimation(90.0f, 0.0f, 1, 1.0f, 1, 0.8f);
            rotateAnimation.setFillAfter(true);
            rotateAnimation.setDuration(1500L);
            rotateAnimation.setInterpolator(new LinearInterpolator());
            QuickBetView.this.getRotateClockView().startAnimation(rotateAnimation);
        }

        @Override // android.view.animation.Animation.AnimationListener
        public final void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public final void onAnimationStart(Animation animation) {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public QuickBetView(Context context) {
        super(context);
        context.getClass();
        if (!isInEditMode()) {
            d();
        }
        this.c = hwr.b(new fd30(this, 0));
        this.i = new ArrayList();
        this.F = TaxConfigs.INSTANCE.getDefault();
        BigDecimal bigDecimal = BigDecimal.ZERO;
        bigDecimal.getClass();
        this.L = bigDecimal;
        this.R = new ema();
        this.S = new l830<>();
        this.V = new zd2<>();
        this.W = new zd2<>();
        this.a0 = new GroupTopic("banned^events");
        this.q0 = hwr.b(new gfg(this, 2));
        this.e1 = new b();
        this.h1 = sh8.b();
        this.i1 = new a();
    }

    public static final void F0(final QuickBetView quickBetView, vjk vjkVar) {
        Activity activity;
        int i2 = 1;
        if (vjkVar instanceof vjk.a) {
            WeakReference<Activity> weakReference = quickBetView.f;
            activity = weakReference != null ? weakReference.get() : null;
            if (activity instanceof fq0) {
                Bundle bundle = new Bundle();
                bundle.putString("key_gift_id", quickBetView.getSingleGiftState().d);
                bundle.putInt("key_gift_kind", quickBetView.getSingleGiftState().e);
                bundle.putString("key_gift_value", quickBetView.getSingleGiftState().c);
                bundle.putBoolean("is_support_free_bet", true);
                bundle.putBoolean("gift_quick_bet", true);
                bundle.putString("quick_stake", o1);
                final SelectedGiftData selectedGiftData = quickBetView.getSingleGiftState().C;
                Function1<? super GiftDetails, Unit> function1 = new Function1() { // from class: ke30
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        boolean z = QuickBetView.j1;
                        QuickBetView quickBetView2 = quickBetView;
                        vjk.b bVar = new vjk.b((GiftDetails) obj, selectedGiftData, quickBetView2.getSingleGiftState().b);
                        yyk yykVar = quickBetView2.i0;
                        if (yykVar != null) {
                            yykVar.K1(bVar);
                        }
                        return Unit.a;
                    }
                };
                rok rokVar = new rok();
                rokVar.setArguments(bundle);
                rokVar.f = function1;
                rokVar.show(((fq0) activity).getSupportFragmentManager(), "gifts_dialog");
                return;
            }
            return;
        }
        if (vjkVar instanceof vjk.b) {
            vjk.b bVar = (vjk.b) vjkVar;
            GiftDetails giftDetails = bVar.a;
            final SelectedGiftData selectedGiftData2 = bVar.b;
            int i3 = bVar.c;
            WeakReference<Activity> weakReference2 = quickBetView.f;
            activity = weakReference2 != null ? weakReference2.get() : null;
            if ((activity instanceof fq0) && giftDetails != null) {
                yyk yykVar = quickBetView.i0;
                boolean z = yykVar != null && yykVar.C1();
                String str = m1;
                if (str == null) {
                    str = "";
                }
                String currentTotalOddsForGift = quickBetView.getCurrentTotalOddsForGift();
                String string = quickBetView.getGetMaxWinUseCase().a().toString();
                string.getClass();
                jwk.a.a(str, currentTotalOddsForGift, "0", string, "0", quickBetView.F.hasRate(quickBetView.getBetItem().m0()), i3, z, giftDetails, selectedGiftData2, new Function1() { // from class: ie30
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        boolean z2 = QuickBetView.j1;
                        quickBetView.G((SelectedGiftData) obj, selectedGiftData2);
                        return Unit.a;
                    }
                }, new gx2(quickBetView, i2)).show(((fq0) activity).getSupportFragmentManager(), "gift_value_edit_dialog");
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void G0(QuickBetView quickBetView, yyk yykVar, kotlin.Pair pair) {
        String str;
        Boolean bool;
        boolean zD1;
        tf30 tf30Var;
        if (quickBetView.getBetItem().m0()) {
            return;
        }
        n780 n780Var = (n780) pair.a;
        B b2 = pair.b;
        Boolean bool2 = Boolean.TRUE;
        boolean zG = Intrinsics.g(b2, bool2);
        if (quickBetView.O) {
            boolean z = false;
            if (quickBetView.getBetItem().U().size() != 1) {
                quickBetView.getSingleGiftState().b = 0;
                quickBetView.C();
                return;
            }
            String giftValue = null;
            if (n780Var instanceof n780.a) {
                quickBetView.x();
                quickBetView.getSingleGiftState().b = 0;
                SelectedGiftData selectedGiftData = quickBetView.getSingleGiftState().C;
                if (selectedGiftData == null) {
                    quickBetView.P = true;
                    yykVar.E1();
                    return;
                }
                quickBetView.getSingleGiftState().E = false;
                SelectedGiftData selectedGiftDataCopy = selectedGiftData.copy(selectedGiftData.getGiftValue(), selectedGiftData.getGiftKind(), selectedGiftData.getGiftId(), selectedGiftData.getGiftLimit(), selectedGiftData.getGiftCount(), selectedGiftData.getRawGift(), selectedGiftData.getAddToStake(), false, selectedGiftData.getUserSelect(), selectedGiftData.getTotalStake());
                quickBetView.getSingleGiftState().D = selectedGiftData;
                quickBetView.getSingleGiftState().b(selectedGiftDataCopy);
                quickBetView.getSingleGiftState().v = true;
                quickBetView.O0();
                quickBetView.getSingleGiftState().b(null);
                return;
            }
            if (n780Var instanceof n780.d) {
                quickBetView.Q = true;
                return;
            }
            if (!(n780Var instanceof n780.b)) {
                if ((n780Var instanceof n780.c) && quickBetView.Q) {
                    n780.c cVar = (n780.c) n780Var;
                    GiftDetails giftDetails = cVar.a;
                    String str2 = cVar.b;
                    boolean zC1 = yykVar.C1();
                    if (zC1 && (bool = cVar.e) != null) {
                        zC1 = bool2.equals(bool);
                    }
                    boolean z2 = zC1;
                    Boolean bool3 = cVar.d;
                    boolean zEquals = bool3 != null ? bool2.equals(bool3) : true;
                    Boolean bool4 = cVar.f;
                    boolean zEquals2 = bool4 != null ? bool2.equals(bool4) : false;
                    if (!zEquals && (strW = cVar.c) != null) {
                        str = strW;
                    } else if (quickBetView.getSingleGiftState().c == null || TextUtils.isEmpty(quickBetView.getSingleGiftState().c)) {
                        String strW = bjb0.W(giftDetails.getCurrentBalance());
                        str = strW;
                    } else {
                        if (new BigDecimal(quickBetView.getSingleGiftState().c).compareTo(BigDecimal.ZERO) != 0 || quickBetView.getSingleGiftState().C == null) {
                            giftValue = quickBetView.getSingleGiftState().c;
                        } else {
                            SelectedGiftData selectedGiftData2 = quickBetView.getSingleGiftState().C;
                            if (selectedGiftData2 != null) {
                                giftValue = selectedGiftData2.getGiftValue();
                            }
                        }
                        str = giftValue;
                    }
                    SelectedGiftData selectedGiftData3 = new SelectedGiftData(str, giftDetails.getKind(), giftDetails.getGiftId(), bjb0.W(giftDetails.getLeastOrderAmount()), 1, giftDetails, z2, zEquals, zEquals2, str2);
                    quickBetView.getSingleGiftState().v = true;
                    quickBetView.getSingleGiftState().b(selectedGiftData3);
                    quickBetView.P = true;
                    yykVar.E1();
                    return;
                }
                return;
            }
            up3 singleGiftState = quickBetView.getSingleGiftState();
            n780.b bVar = (n780.b) n780Var;
            GiftDetails giftDetails2 = bVar.a;
            singleGiftState.b = bVar.b;
            quickBetView.C();
            SelectedGiftData selectedGiftData4 = quickBetView.getSingleGiftState().C;
            GiftDetails rawGift = selectedGiftData4 != null ? selectedGiftData4.getRawGift() : null;
            if (rawGift != null) {
                List<GiftDetails> list = bVar.c;
                yykVar.getClass();
                zD1 = yyk.D1(rawGift, list);
            } else {
                zD1 = false;
            }
            if (zD1 && (selectedGiftData4.getUserSelect() || rawGift.getCurrentBalance() > giftDetails2.getCurrentBalance() || (rawGift.getCurrentBalance() == giftDetails2.getCurrentBalance() && Intrinsics.g(rawGift.getGiftId(), giftDetails2.getGiftId())))) {
                yykVar.J1(rawGift, selectedGiftData4.getTotalStake(), selectedGiftData4.getGiftValue(), Boolean.valueOf(selectedGiftData4.getChecked()), Boolean.valueOf(selectedGiftData4.getAddToStake()), Boolean.valueOf(selectedGiftData4.getUserSelect()));
                return;
            }
            quickBetView.setAllGiftStateChecked(zG);
            boolean z3 = quickBetView.getSingleGiftState().E;
            if (selectedGiftData4 != null) {
                String giftId = giftDetails2.getGiftId();
                GiftDetails rawGift2 = selectedGiftData4.getRawGift();
                if (!Intrinsics.g(giftId, rawGift2 != null ? rawGift2.getGiftId() : null)) {
                    z = true;
                }
            }
            if (!quickBetView.getBetItem().m0() && z3 && z && (tf30Var = quickBetView.d0) != null) {
                ku90<com.sporty.android.common.uievent.a> ku90Var = tf30Var.Q;
                StringUiText stringUiText = vch0.a;
                com.sporty.android.common.uievent.b.i(ku90Var, new ResourceUiText(R.string.component_coupon__gift_updated_to_better_match_your_current_selection), null, null, null, WebSocketProtocol.PAYLOAD_SHORT);
            }
            quickBetView.getSingleGiftState().D = selectedGiftData4;
            quickBetView.getSingleGiftState().a();
            yykVar.J1(bVar.a, null, null, Boolean.valueOf(z3), null, null);
        }
    }

    public static final void K(final QuickBetView quickBetView, MotionEvent motionEvent) {
        quickBetView.getNumberKeyboardView().L(quickBetView.getEtInput(), 3);
        quickBetView.getEtInput().requestFocus();
        quickBetView.getEtInput().setCursorVisible(true);
        Integer numValueOf = motionEvent != null ? Integer.valueOf(motionEvent.getActionMasked()) : null;
        if ((numValueOf == null || numValueOf.intValue() != 0) && numValueOf != null && numValueOf.intValue() == 1) {
            quickBetView.getEtInput().post(new Runnable() { // from class: pe30
                @Override // java.lang.Runnable
                public final void run() {
                    QuickBetView.L(this.a);
                }
            });
        }
        quickBetView.C();
    }

    public static final void L(QuickBetView quickBetView) {
        quickBetView.getEtInput().setSelection(quickBetView.getEtInput().getText().length());
    }

    public static boolean R(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return true;
        }
        return !TextUtils.isEmpty(str2) && Intrinsics.g(str, str2);
    }

    public static final void S(QuickBetView quickBetView, t7z t7zVar) {
        if (!(t7zVar instanceof t7z.c)) {
            if (t7zVar instanceof t7z.a) {
                aak aakVar = ((t7z.a) t7zVar).a;
                aak aakVar2 = aak.c;
                if (aakVar == aakVar2 || aakVar == aak.a || aakVar == aak.e) {
                    quickBetView.t();
                    if (aakVar == aak.e) {
                        quickBetView.getNeverDownItemControl().setLoading(false, true);
                        quickBetView.getSelectionPendingToggleHolder().a(c980.a.b);
                    }
                    aak aakVar3 = aak.a;
                    if (aakVar == aakVar3) {
                        quickBetView.getSelectionPendingToggleHolder().a(c980.a.a);
                    }
                    if (aakVar == aakVar2) {
                        quickBetView.q0();
                    } else if (aakVar == aakVar3) {
                        quickBetView.h0();
                    } else {
                        quickBetView.l0();
                    }
                    zyf0.a(R.string.common_feedback__sorry_something_went_wrong);
                    return;
                }
                return;
            }
            return;
        }
        t7z.c cVar = (t7z.c) t7zVar;
        aak aakVar4 = cVar.b;
        List<Selection> list = cVar.c;
        if (aakVar4 == aak.i || aakVar4 == aak.v) {
            quickBetView.P0(cVar.a, list, cVar.d, null, false);
            return;
        }
        aak aakVar5 = aak.c;
        if (aakVar4 == aakVar5 || aakVar4 == aak.a || aakVar4 == aak.e) {
            quickBetView.t();
            List<Event> list2 = cVar.a;
            List<Selection> list3 = cVar.c;
            long j = cVar.d;
            boolean z = aakVar4 == aakVar5;
            aak aakVar6 = aak.a;
            boolean z2 = aakVar4 == aakVar6;
            aak aakVar7 = aak.e;
            quickBetView.P0(list2, list3, j, new j980(z, z2, aakVar4 == aakVar7), true);
            if (aakVar4 == aakVar7) {
                quickBetView.getSelectionPendingToggleHolder().b(list, c980.a.b);
            }
            if (aakVar4 == aakVar6) {
                quickBetView.getSelectionPendingToggleHolder().b(list, c980.a.a);
            }
            quickBetView.L0();
        }
    }

    public static final void U(QuickBetView quickBetView, uh30 uh30Var) {
        if ((uh30Var instanceof uh30.b) && !quickBetView.v && quickBetView.getQuickLiabilityCheckResultValidationUseCase().a(uh30Var) == ai30.a) {
            quickBetView.setConfirmPageVisibility(false);
            quickBetView.u0(false);
        }
    }

    public static final void W(QuickBetView quickBetView, Account account) {
        if (account != null) {
            if (TextUtils.isEmpty(p1)) {
                p1 = "0";
            }
            qz3.a aVarD = qz3.d(quickBetView.F.getRealSportTaxConfig(), quickBetView.getAssetsInfoRepository().c(), new BigDecimal(p1), BigDecimal.ZERO);
            if (aVarD.a) {
                WeakReference<Activity> weakReference = quickBetView.f;
                if (qz3.n(weakReference != null ? weakReference.get() : null, aVarD.b, aVarD.c)) {
                    return;
                }
            }
            if (quickBetView.isConfirmPageOnScreen) {
                return;
            }
            tf30 tf30Var = quickBetView.d0;
            if (tf30Var != null) {
                tf30Var.C1(1);
            }
            quickBetView.setConfirmPageVisibility(true);
        }
    }

    public static final void X(QuickBetView quickBetView, UserAddress userAddress) {
        ng10 ng10Var;
        JSONObject jSONObject;
        String str;
        if (quickBetView.z) {
            quickBetView.z = false;
            if (quickBetView.getBetItem().m0()) {
                wq3 wq3VarU = ((br3) mmc.a(hp0.A, br3.class)).U();
                int autoBetTimes = SimShareData.INSTANCE.getAutoBetTimes();
                if (!wq3VarU.M) {
                    wq3VarU.L = new WeakReference<>(oti.c().e());
                    wq3VarU.M = true;
                }
                wq3.l0 = true;
                Intent intent = new Intent(hp0.A, (Class<?>) BetslipActivity.class);
                intent.putExtra("extra_quick_sim_bet", true);
                intent.putExtra("extra_simulated_auto_bet_times", autoBetTimes);
                yrh0.s(hp0.A, intent, true);
                Intent intent2 = new Intent();
                intent2.setAction("open_bet_slip");
                fdt.a(hp0.A).c(intent2);
                return;
            }
            quickBetView.p0 = System.currentTimeMillis();
            ibs ibsVarQ = quickBetView.Q();
            if (ibsVarQ != null) {
                ej5.c(ebs.a(ibsVarQ.getLifecycle()), null, null, new ef30(quickBetView, null), 3);
            }
            quickBetView.v = true;
            JSONObject jSONObject2 = new JSONObject();
            Selection selection = n1;
            if (selection == null) {
                ng10Var = null;
            } else {
                try {
                    Event event = selection.a;
                    Outcome outcome = selection.c;
                    o5p.a(jSONObject2, userAddress);
                    if (quickBetView.getBetItem().M() && quickBetView.C && !quickBetView.D) {
                        jSONObject2.put("oddsBoost", quickBetView.w);
                    }
                    if (l1) {
                        jSONObject2.put("paymentType", 0);
                    } else {
                        jSONObject2.put("paymentType", 1);
                    }
                    String strB = quickBetView.getCountryManager().b();
                    int length = strB.length() - 1;
                    int i2 = 0;
                    boolean z = false;
                    while (i2 <= length) {
                        boolean z2 = strB.charAt(!z ? i2 : length) <= ' ';
                        if (z) {
                            if (!z2) {
                                break;
                            } else {
                                length--;
                            }
                        } else if (z2) {
                            i2++;
                        } else {
                            z = true;
                        }
                    }
                    String string = strB.subSequence(i2, length + 1).toString();
                    if (!TextUtils.isEmpty(string)) {
                        jSONObject2.put("currency", string);
                    }
                    jSONObject2.put("bizType", 1);
                    jSONObject2.put("operId", 1);
                    jSONObject2.put("orderType", 1);
                    lrm betStore = quickBetView.getBetStore();
                    String str2 = p1;
                    String str3 = "";
                    if (str2 == null) {
                        str2 = "";
                    }
                    jSONObject2.put("actualPayAmount", betStore.s(str2));
                    Selection selection2 = n1;
                    if (selection2 != null && selection2.y) {
                        g08 g08Var = g08.UNKNOWN;
                        jSONObject2.put("codeSource", (Object) 28);
                    } else if (selection2 != null && selection2.z) {
                        g08 g08Var2 = g08.UNKNOWN;
                        jSONObject2.put("codeSource", (Object) 25);
                    }
                    JSONObject jSONObject3 = new JSONObject();
                    JSONArray jSONArray = new JSONArray();
                    JSONObject jSONObject4 = new JSONObject();
                    jSONObject4.put(AnalyticsParam.EVENT_PARAM_PAGE_VIEW_EVENT_ID, event != null ? event.eventId : null);
                    jSONObject4.put(AnalyticsParam.EVENT_PARAM_ID, selection.j());
                    jSONObject4.put("odds", outcome != null ? outcome.odds : null);
                    jSONObject4.put("banker", quickBetView.getBetMutexDataInstance().K(event));
                    jSONObject4.put("probability", outcome != null ? String.valueOf(outcome.probability) : null);
                    jSONObject4.put("isRelatedBet", selection.e == k980.RELATED_BET);
                    if (selection.q()) {
                        JSONObject jSONObject5 = new JSONObject();
                        jSONObject5.put("odds", outcome != null ? outcome.odds : null);
                        jSONObject5.put("probability", outcome != null ? Double.valueOf(outcome.probability) : null);
                        jSONObject4.put("joker", jSONObject5);
                    }
                    if (selection.p()) {
                        JSONArray jSONArray2 = new JSONArray();
                        List list = selection.d;
                        if (list == null) {
                            list = m2g.a;
                        }
                        Iterator it = list.iterator();
                        while (it.hasNext()) {
                            Selection selection3 = (Selection) it.next();
                            String str4 = str3;
                            JSONObject jSONObject6 = new JSONObject();
                            Iterator it2 = it;
                            Event event2 = selection3.a;
                            JSONObject jSONObject7 = jSONObject2;
                            Outcome outcome2 = selection3.c;
                            jSONObject6.put(AnalyticsParam.EVENT_PARAM_PAGE_VIEW_EVENT_ID, event2.eventId);
                            jSONObject6.put(AnalyticsParam.EVENT_PARAM_ID, selection3.j());
                            jSONObject6.put("odds", outcome2.odds);
                            jSONObject6.put("probability", String.valueOf(outcome2.probability));
                            jSONArray2.put(jSONObject6);
                            str3 = str4;
                            it = it2;
                            jSONObject2 = jSONObject7;
                        }
                        jSONObject = jSONObject2;
                        str = str3;
                        jSONObject4.put("betBuilderSelections", jSONArray2);
                        jSONObject4.put("betBuilder", true);
                    } else {
                        jSONObject = jSONObject2;
                        str = "";
                    }
                    List<PreCannedBBOutcome> list2 = outcome != null ? outcome.childOutcomes : null;
                    if (list2 != null && !list2.isEmpty()) {
                        JSONArray jSONArray3 = new JSONArray();
                        for (PreCannedBBOutcome preCannedBBOutcome : list2) {
                            JSONObject jSONObject8 = new JSONObject();
                            jSONObject8.put("marketId", preCannedBBOutcome.getMarketId());
                            jSONObject8.put("marketName", preCannedBBOutcome.getMarketName());
                            jSONObject8.put("outcomeId", preCannedBBOutcome.getOutcomeId());
                            jSONObject8.put("outcomeDesc", preCannedBBOutcome.getOutcomeDesc());
                            jSONObject8.put("specifiers", preCannedBBOutcome.getSpecifier());
                            jSONArray3.put(jSONObject8);
                        }
                        jSONObject4.put("childOutcomes", jSONArray3);
                    }
                    if (quickBetView.getBetItem().M() && quickBetView.C && !quickBetView.D) {
                        jSONObject4.put("lobBoost", true);
                    }
                    s1p s1pVarO = quickBetView.O();
                    String str5 = event != null ? event.eventId : null;
                    Market market = selection.b;
                    if (s1pVarO.a(str5, market != null ? market.status : 0, outcome)) {
                        jSONObject4.put("lfbBoost", true);
                    }
                    jSONArray.put(jSONObject4);
                    jSONObject3.put("selections", jSONArray);
                    JSONArray jSONArray4 = new JSONArray();
                    JSONArray jSONArray5 = new JSONArray();
                    JSONObject jSONObject9 = new JSONObject();
                    jSONArray5.put(1);
                    jSONObject9.put("selectedSystems", jSONArray5);
                    jSONObject9.put("stake", new JSONObject().put("value", quickBetView.getBetStore().s(quickBetView.getInputData())));
                    jSONArray4.put(jSONObject9);
                    jSONObject3.put("bets", jSONArray4);
                    JSONObject jSONObject10 = jSONObject;
                    jSONObject10.put("ticket", jSONObject3);
                    BigDecimal bigDecimalZ = quickBetView.getBetStore().z();
                    if (bigDecimalZ.compareTo(BigDecimal.ZERO) > 0) {
                        BigDecimal bigDecimalMultiply = bigDecimalZ.multiply(BigDecimal.valueOf(10000L));
                        bigDecimalMultiply.getClass();
                        JSONObject jSONObject11 = new JSONObject();
                        jSONObject11.put("bonusPlanId", nh4.c().b);
                        jSONObject11.put("bonusAmount", bigDecimalMultiply);
                        jSONObject11.put("version", 1);
                        jSONObject10.put("bonus", jSONObject11);
                    }
                    if (!TextUtils.isEmpty(quickBetView.getSingleGiftState().c) && !TextUtils.isEmpty(quickBetView.getSingleGiftState().d) && quickBetView.getSingleGiftState().i) {
                        quickBetView.getCheckUseGiftStakeEqualPayUseCase().getClass();
                        jj7 jj7VarA = kj7.a(jSONObject10);
                        if (jj7VarA.a) {
                            tf30 tf30Var = quickBetView.d0;
                            if (tf30Var != null) {
                                String str6 = jj7VarA.b;
                                String str7 = jj7VarA.c;
                                String str8 = quickBetView.getSingleGiftState().d;
                                tf30Var.D1(AnalyticsEvent.BETSLIP_GIFT_STAKE_EQUALS_PAY, str6, str7, str8 == null ? str : str8, null);
                            }
                        } else {
                            JSONObject jSONObject12 = new JSONObject();
                            JSONArray jSONArray6 = new JSONArray();
                            JSONObject jSONObject13 = new JSONObject();
                            jSONObject13.put("giftId", quickBetView.getSingleGiftState().d);
                            jSONArray6.put(jSONObject13);
                            jSONObject12.put("favorInfo", jSONArray6);
                            jSONObject10.put("favor", jSONObject12);
                        }
                    }
                    String string2 = jSONObject10.toString();
                    string2.getClass();
                    ng10Var = new ng10(string2, wi80.b(selection.k()));
                } catch (Exception e2) {
                    itf0.a aVar = itf0.a;
                    aVar.q(MyLog.TAG_QUICK_BET);
                    aVar.f(e2, "generatePlaceBetBody error: %s", e2.getMessage());
                    ng10Var = null;
                }
            }
            if (ng10Var == null) {
                quickBetView.C0(-1, null);
                return;
            }
            quickBetView.f1 = true;
            AtomicBoolean atomicBoolean = i420.F;
            i420.a.a(true);
            quickBetView.E0(true);
            quickBetView.B = new ff30(quickBetView).start();
            quickBetView.getLiabilityCheckUseCases().c.clear();
            su5<BaseResponse<OrderWithFailUpdate>> su5VarE = ap0.f().e(ng10Var.a);
            quickBetView.E = su5VarE;
            if (su5VarE != null) {
                su5VarE.G(new gf30(quickBetView, ng10Var));
            }
        }
    }

    public static final void g0(QuickBetView quickBetView) {
        Selection selection;
        tf30 tf30Var = quickBetView.d0;
        if (tf30Var == null || (selection = n1) == null) {
            return;
        }
        boolean zIsChecked = quickBetView.getEarlyPayoutItemControl().a.b.isChecked();
        quickBetView.getSelectionPendingToggleHolder().d(kotlin.collections.a.c(selection), c980.a.a, zIsChecked);
        quickBetView.h0();
        List listC = kotlin.collections.a.c(selection);
        tf30Var.z1(g880.l(listC, zIsChecked).getRequestBody(), aak.a, listC);
        ijf ijfVar = quickBetView.f0;
        if (ijfVar != null) {
            ijfVar.z1("quickBet", !zIsChecked ? AnalyticsParam.EVENT_STATUS_ON : AnalyticsParam.EVENT_STATUS_OFF);
        }
    }

    private final Button getAcceptChangesBtn() {
        return getBinding().b;
    }

    private final TextView getAdditionalMsg() {
        return getBinding().c;
    }

    private final TextView getBetSlipTitleText() {
        return getBinding().q0;
    }

    private final ijd0 getBinding() {
        Object value = this.c.getValue();
        value.getClass();
        return (ijd0) value;
    }

    private final View getBoostButton() {
        return getBinding().d;
    }

    private final ImageView getBoostCheckBoxView() {
        return getBinding().e;
    }

    private final TextView getBoostHintView() {
        return getBinding().i;
    }

    private final View getBoostOddsView() {
        return getBinding().v;
    }

    private final TextView getBoostTextView() {
        return getBinding().w;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final View getBoostView() {
        return getBinding().f;
    }

    private final View getChangesWarningView() {
        return getBinding().y;
    }

    private final ConstraintLayout getClMultipleBet() {
        return getBinding().A;
    }

    private final View getCloseQuickBetContainer() {
        return getBinding().C;
    }

    private final ImageView getCloseQuickBetView() {
        return getBinding().B;
    }

    private final TextView getCurrencyView() {
        return getBinding().D;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String getCurrentTotalOddsForGift() {
        String str;
        try {
            Selection selection = n1;
            Outcome outcome = selection != null ? selection.c : null;
            if (!getBetItem().M() || !this.C || outcome == null) {
                return (outcome == null || (str = outcome.odds) == null) ? "0" : str;
            }
            BigDecimal bigDecimal = new BigDecimal(outcome.odds);
            BigDecimal bigDecimalC = getOddsBoostConfigurationManager().c(outcome);
            BigDecimal bigDecimalValueOf = BigDecimal.valueOf(10000L);
            RoundingMode roundingMode = RoundingMode.HALF_UP;
            String string = bigDecimal.multiply(bigDecimalC.divide(bigDecimalValueOf, 2, roundingMode)).setScale(2, roundingMode).toString();
            string.getClass();
            return string;
        } catch (Exception e2) {
            itf0.a aVar = itf0.a;
            aVar.q(MyLog.TAG_QUICK_BET);
            aVar.c(e2, "[getCurrentTotalOdds] totalOdds get error", new Object[0]);
            return "0";
        }
    }

    public static /* synthetic */ void getDefaultNoUseGiftState$annotations() {
    }

    private final EarlyPayoutCheckbox getEarlyPayoutItemControl() {
        return getBinding().F;
    }

    private final EditText getEtInput() {
        return getBinding().l0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final TextView getExciseTax() {
        return getBinding().G;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final TextView getFullWin() {
        return getBinding().I;
    }

    private final View getFullWinLayout() {
        return getBinding().H;
    }

    private final CheckBox getGiftCheckbox() {
        return getBinding().z;
    }

    private final View getGiftsContainerV2() {
        return getBinding().J;
    }

    private final View getGoToDepositBtn() {
        return getBinding().K;
    }

    private final Group getGroupBonusHint() {
        return getBinding().L;
    }

    private final TextView getInitMatchOddsView() {
        return getBinding().M;
    }

    private final String getInputData() {
        String string = getEtInput().getText().toString();
        int length = string.length() - 1;
        int i2 = 0;
        boolean z = false;
        while (i2 <= length) {
            boolean z2 = string.charAt(!z ? i2 : length) <= ' ';
            if (z) {
                if (!z2) {
                    break;
                }
                length--;
            } else if (z2) {
                i2++;
            } else {
                z = true;
            }
        }
        return ".".equals(string.subSequence(i2, length + 1).toString()) ? "" : getEtInput().getText().toString();
    }

    private final TextView getLiveView() {
        return getBinding().O;
    }

    private final TextView getMarketDesc() {
        return getBinding().P;
    }

    private final TextView getMarketDescAlt() {
        return getBinding().Q;
    }

    private final ImageView getMatchOddsLeftIcon() {
        return getBinding().U;
    }

    private final TextView getMatchOddsView() {
        return getBinding().S;
    }

    private final View getMatchOddsViewContainer() {
        return getBinding().T;
    }

    public static /* synthetic */ void getMultipleGiftState$annotations() {
    }

    private final EarlyPayoutCheckbox getNeverDownItemControl() {
        return getBinding().V;
    }

    private final KeyboardView getNumberKeyboardView() {
        return getBinding().E;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final OneUpTwoUpItemControl getOneTwoUpItemControl() {
        return getBinding().W;
    }

    private final ProgressBar getPbMultipleBetBonusHint() {
        return getBinding().X;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final TextView getPlaceBetBtn() {
        return getBinding().Y;
    }

    private final LinearLayout getPlaceBetBtnLayout() {
        return getBinding().Z;
    }

    private final View getPotWinLayout() {
        return getBinding().b0;
    }

    private final TextView getPotentialTaxTitle() {
        return getBinding().c0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final TextView getPotentialTaxWin() {
        return getBinding().e0;
    }

    private final View getPotentialTaxWinLayout() {
        return getBinding().d0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final TextView getPotentialWin() {
        return getBinding().f0;
    }

    private final TextView getPotentialWinTitle() {
        return getBinding().a0;
    }

    private final LinearLayout getQuickBetSlipLayout() {
        return getBinding().g0;
    }

    private final LinearLayout getQuickBetSlipLoading() {
        return getBinding().h0;
    }

    private final View getRequireManualChangeSelectionView() {
        return getBinding().i0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ImageView getRotateClockView() {
        return getBinding().j0;
    }

    private final SimulateAutoBetPanel getSimulateAutoBetPanel() {
        return getBinding().k0;
    }

    public static /* synthetic */ void getSingleGiftState$annotations() {
    }

    private final TextView getStatusView() {
        return getBinding().m0;
    }

    private final njs<TaxConfigs> getTaxConfigsLiveData() {
        return (njs) this.q0.getValue();
    }

    private final ImageView getToggleBalance() {
        return getBinding().n0;
    }

    private final ImageView getToggleSportyCoins() {
        return getBinding().o0;
    }

    private final TextView getTvGift() {
        return getBinding().p0;
    }

    private final AppCompatTextView getTvMultipleBetBonusHint() {
        return getBinding().u0;
    }

    private final TextView getTvMultipleBetCount() {
        return getBinding().r0;
    }

    private final TextView getTvMultipleDoubleText() {
        return getBinding().s0;
    }

    private final TextView getTvMultipleDoubleValue() {
        return getBinding().t0;
    }

    private final View getWholeView() {
        return getBinding().N;
    }

    public static final void n0(QuickBetView quickBetView, bcp bcpVar) {
        ArrayList arrayList = quickBetView.i;
        if (bcpVar != null) {
            ArrayList<tcp> arrayList2 = bcpVar.a;
            if (!arrayList2.isEmpty()) {
                xdp xdpVarD = arrayList2.get(0).d();
                bcp bcpVarC = xdpVarD.j("details").c();
                if (quickBetView.w != null && !Intrinsics.g(xdpVarD.j("periodId").f(), quickBetView.w)) {
                    quickBetView.getBetItem().p0(false);
                    quickBetView.getBoostHintView().setText(sn5.c(quickBetView, R.string.component_betslip__live_odds_boost, new Object[0]));
                    quickBetView.getBoostTextView().setText(sn5.c(quickBetView, R.string.component_betslip__u_boost, new Object[0]));
                    quickBetView.getBoostButton().setBackgroundResource(R.drawable.spr_unboost_background);
                    zch0.k(quickBetView.getContext(), quickBetView.getRotateClockView(), Color.parseColor("#dcdee5"));
                }
                quickBetView.w = xdpVarD.j("periodId").f();
                arrayList.clear();
                Iterator<tcp> it = bcpVarC.a.iterator();
                it.getClass();
                while (it.hasNext()) {
                    tcp next = it.next();
                    HashMap map = new HashMap();
                    xdp xdpVarD2 = next.d();
                    map.put("tournamentId", xdpVarD2.j("tournamentId").f());
                    map.put("marketId", xdpVarD2.j("marketId").f());
                    if (xdpVarD2.j("productId").b() == 0) {
                        map.put("productId", "");
                    } else {
                        map.put("productId", String.valueOf(xdpVarD2.j("productId").b()));
                    }
                    arrayList.add(map);
                }
                quickBetView.v();
                quickBetView.K0();
                return;
            }
        }
        arrayList.clear();
        quickBetView.v();
        quickBetView.D0(quickBetView.C);
    }

    public static final void p0(QuickBetView quickBetView) {
        Selection selection;
        zuy zuyVar;
        tf30 tf30Var = quickBetView.d0;
        if (tf30Var == null || (selection = n1) == null) {
            return;
        }
        quickBetView.getOneTwoUpItemControl().getCheckBoxView().F();
        OneUpTwoUpCheckbox.a mode = quickBetView.getOneTwoUpItemControl().getCheckBoxView().getG();
        mode.getClass();
        int iOrdinal = mode.ordinal();
        if (iOrdinal == 0) {
            zuyVar = zuy.c;
        } else {
            if (iOrdinal != 1) {
                uhc.a();
                return;
            }
            zuyVar = zuy.d;
        }
        avy avyVarF = hih0.f(mode, quickBetView.getOneTwoUpItemControl().getCheckBoxView().F.b.isChecked());
        List listC = kotlin.collections.a.c(selection);
        tf30Var.z1(g880.n(listC, zuyVar, avyVarF).getRequestBody(), aak.c, listC);
        quickBetView.b0(avyVarF);
    }

    public static final ijd0 r(QuickBetView quickBetView) {
        int i2 = R.id.accept_changes_btn;
        Button button = (Button) h5e.a(R.id.accept_changes_btn, quickBetView);
        if (button != null) {
            i2 = R.id.additional_msg;
            TextView textView = (TextView) h5e.a(R.id.additional_msg, quickBetView);
            if (textView != null) {
                i2 = R.id.balance;
                if (((TextView) h5e.a(R.id.balance, quickBetView)) != null) {
                    i2 = R.id.boost_button;
                    ConstraintLayout constraintLayout = (ConstraintLayout) h5e.a(R.id.boost_button, quickBetView);
                    if (constraintLayout != null) {
                        i2 = R.id.boost_checkbox;
                        ImageView imageView = (ImageView) h5e.a(R.id.boost_checkbox, quickBetView);
                        if (imageView != null) {
                            i2 = R.id.boost_container;
                            ConstraintLayout constraintLayout2 = (ConstraintLayout) h5e.a(R.id.boost_container, quickBetView);
                            if (constraintLayout2 != null) {
                                i2 = R.id.boost_hint;
                                TextView textView2 = (TextView) h5e.a(R.id.boost_hint, quickBetView);
                                if (textView2 != null) {
                                    i2 = R.id.boost_odds_container;
                                    LinearLayout linearLayout = (LinearLayout) h5e.a(R.id.boost_odds_container, quickBetView);
                                    if (linearLayout != null) {
                                        i2 = R.id.boost_text;
                                        TextView textView3 = (TextView) h5e.a(R.id.boost_text, quickBetView);
                                        if (textView3 != null) {
                                            i2 = R.id.changes_warning;
                                            TextView textView4 = (TextView) h5e.a(R.id.changes_warning, quickBetView);
                                            if (textView4 != null) {
                                                i2 = R.id.checkbox_gift;
                                                CheckBox checkBox = (CheckBox) h5e.a(R.id.checkbox_gift, quickBetView);
                                                if (checkBox != null) {
                                                    i2 = R.id.cl_multiple_bet;
                                                    ConstraintLayout constraintLayout3 = (ConstraintLayout) h5e.a(R.id.cl_multiple_bet, quickBetView);
                                                    if (constraintLayout3 != null) {
                                                        i2 = R.id.close_quick_bet;
                                                        ImageView imageView2 = (ImageView) h5e.a(R.id.close_quick_bet, quickBetView);
                                                        if (imageView2 != null) {
                                                            i2 = R.id.close_quick_bet_container;
                                                            ConstraintLayout constraintLayout4 = (ConstraintLayout) h5e.a(R.id.close_quick_bet_container, quickBetView);
                                                            if (constraintLayout4 != null) {
                                                                i2 = R.id.close_quick_loading_bet;
                                                                if (((ImageView) h5e.a(R.id.close_quick_loading_bet, quickBetView)) != null) {
                                                                    i2 = R.id.currency;
                                                                    TextView textView5 = (TextView) h5e.a(R.id.currency, quickBetView);
                                                                    if (textView5 != null) {
                                                                        i2 = R.id.custom_number_keyboard;
                                                                        KeyboardView keyboardView = (KeyboardView) h5e.a(R.id.custom_number_keyboard, quickBetView);
                                                                        if (keyboardView != null) {
                                                                            i2 = R.id.delay_info_hint;
                                                                            View viewA = h5e.a(R.id.delay_info_hint, quickBetView);
                                                                            if (viewA != null) {
                                                                                phd0.a(viewA);
                                                                                i2 = R.id.delete;
                                                                                if (((LinearLayout) h5e.a(R.id.delete, quickBetView)) != null) {
                                                                                    i2 = R.id.early_payout_item_control;
                                                                                    EarlyPayoutCheckbox earlyPayoutCheckbox = (EarlyPayoutCheckbox) h5e.a(R.id.early_payout_item_control, quickBetView);
                                                                                    if (earlyPayoutCheckbox != null) {
                                                                                        i2 = R.id.excise_tax;
                                                                                        TextView textView6 = (TextView) h5e.a(R.id.excise_tax, quickBetView);
                                                                                        if (textView6 != null) {
                                                                                            i2 = R.id.flash_odds;
                                                                                            if (((DancingNumber) h5e.a(R.id.flash_odds, quickBetView)) != null) {
                                                                                                i2 = R.id.full_win_layout;
                                                                                                Group group = (Group) h5e.a(R.id.full_win_layout, quickBetView);
                                                                                                if (group != null) {
                                                                                                    i2 = R.id.full_win_title;
                                                                                                    if (((TextView) h5e.a(R.id.full_win_title, quickBetView)) != null) {
                                                                                                        i2 = R.id.full_win_value;
                                                                                                        TextView textView7 = (TextView) h5e.a(R.id.full_win_value, quickBetView);
                                                                                                        if (textView7 != null) {
                                                                                                            i2 = R.id.game_id;
                                                                                                            if (((TextView) h5e.a(R.id.game_id, quickBetView)) != null) {
                                                                                                                i2 = R.id.gifts_container_v2;
                                                                                                                ConstraintLayout constraintLayout5 = (ConstraintLayout) h5e.a(R.id.gifts_container_v2, quickBetView);
                                                                                                                if (constraintLayout5 != null) {
                                                                                                                    i2 = R.id.go_to_deposit_btn;
                                                                                                                    TextView textView8 = (TextView) h5e.a(R.id.go_to_deposit_btn, quickBetView);
                                                                                                                    if (textView8 != null) {
                                                                                                                        i2 = R.id.group_multiplebet_bonus_hint;
                                                                                                                        Group group2 = (Group) h5e.a(R.id.group_multiplebet_bonus_hint, quickBetView);
                                                                                                                        if (group2 != null) {
                                                                                                                            i2 = R.id.img_container;
                                                                                                                            if (((FrameLayout) h5e.a(R.id.img_container, quickBetView)) != null) {
                                                                                                                                i2 = R.id.init_boost_odds;
                                                                                                                                if (((TextView) h5e.a(R.id.init_boost_odds, quickBetView)) != null) {
                                                                                                                                    i2 = R.id.init_match_odds;
                                                                                                                                    TextView textView9 = (TextView) h5e.a(R.id.init_match_odds, quickBetView);
                                                                                                                                    if (textView9 != null) {
                                                                                                                                        i2 = R.id.list_item_container;
                                                                                                                                        ConstraintLayout constraintLayout6 = (ConstraintLayout) h5e.a(R.id.list_item_container, quickBetView);
                                                                                                                                        if (constraintLayout6 != null) {
                                                                                                                                            i2 = R.id.live;
                                                                                                                                            TextView textView10 = (TextView) h5e.a(R.id.live, quickBetView);
                                                                                                                                            if (textView10 != null) {
                                                                                                                                                i2 = R.id.loading;
                                                                                                                                                if (((TextView) h5e.a(R.id.loading, quickBetView)) != null) {
                                                                                                                                                    i2 = R.id.loading_pot_win;
                                                                                                                                                    if (((TextView) h5e.a(R.id.loading_pot_win, quickBetView)) != null) {
                                                                                                                                                        i2 = R.id.loading_pot_win_layout;
                                                                                                                                                        if (((RelativeLayout) h5e.a(R.id.loading_pot_win_layout, quickBetView)) != null) {
                                                                                                                                                            i2 = R.id.loading_pot_win_value;
                                                                                                                                                            if (((TextView) h5e.a(R.id.loading_pot_win_value, quickBetView)) != null) {
                                                                                                                                                                i2 = R.id.main_info_bottom_barrier;
                                                                                                                                                                if (((Barrier) h5e.a(R.id.main_info_bottom_barrier, quickBetView)) != null) {
                                                                                                                                                                    i2 = R.id.market_desc;
                                                                                                                                                                    TextView textView11 = (TextView) h5e.a(R.id.market_desc, quickBetView);
                                                                                                                                                                    if (textView11 != null) {
                                                                                                                                                                        i2 = R.id.market_desc_alt;
                                                                                                                                                                        TextView textView12 = (TextView) h5e.a(R.id.market_desc_alt, quickBetView);
                                                                                                                                                                        if (textView12 != null) {
                                                                                                                                                                            i2 = R.id.market_desc_divider;
                                                                                                                                                                            if (((TextView) h5e.a(R.id.market_desc_divider, quickBetView)) != null) {
                                                                                                                                                                                i2 = R.id.market_info_bottom;
                                                                                                                                                                                if (((LinearLayout) h5e.a(R.id.market_info_bottom, quickBetView)) != null) {
                                                                                                                                                                                    i2 = R.id.market_info_middle;
                                                                                                                                                                                    LinearLayout linearLayout2 = (LinearLayout) h5e.a(R.id.market_info_middle, quickBetView);
                                                                                                                                                                                    if (linearLayout2 != null) {
                                                                                                                                                                                        i2 = R.id.market_info_top;
                                                                                                                                                                                        if (((ConstraintLayout) h5e.a(R.id.market_info_top, quickBetView)) != null) {
                                                                                                                                                                                            i2 = R.id.match_odds;
                                                                                                                                                                                            TextView textView13 = (TextView) h5e.a(R.id.match_odds, quickBetView);
                                                                                                                                                                                            if (textView13 != null) {
                                                                                                                                                                                                i2 = R.id.match_odds_container;
                                                                                                                                                                                                LinearLayout linearLayout3 = (LinearLayout) h5e.a(R.id.match_odds_container, quickBetView);
                                                                                                                                                                                                if (linearLayout3 != null) {
                                                                                                                                                                                                    i2 = R.id.match_odds_left_icon;
                                                                                                                                                                                                    ImageView imageView3 = (ImageView) h5e.a(R.id.match_odds_left_icon, quickBetView);
                                                                                                                                                                                                    if (imageView3 != null) {
                                                                                                                                                                                                        i2 = R.id.match_outcome_desc;
                                                                                                                                                                                                        if (((TextView) h5e.a(R.id.match_outcome_desc, quickBetView)) != null) {
                                                                                                                                                                                                            i2 = R.id.never_down_item_control;
                                                                                                                                                                                                            EarlyPayoutCheckbox earlyPayoutCheckbox2 = (EarlyPayoutCheckbox) h5e.a(R.id.never_down_item_control, quickBetView);
                                                                                                                                                                                                            if (earlyPayoutCheckbox2 != null) {
                                                                                                                                                                                                                i2 = R.id.one_two_up_item_control;
                                                                                                                                                                                                                OneUpTwoUpItemControl oneUpTwoUpItemControl = (OneUpTwoUpItemControl) h5e.a(R.id.one_two_up_item_control, quickBetView);
                                                                                                                                                                                                                if (oneUpTwoUpItemControl != null) {
                                                                                                                                                                                                                    i2 = R.id.pb_multiplebet_bonus_hint;
                                                                                                                                                                                                                    ProgressBar progressBar = (ProgressBar) h5e.a(R.id.pb_multiplebet_bonus_hint, quickBetView);
                                                                                                                                                                                                                    if (progressBar != null) {
                                                                                                                                                                                                                        i2 = R.id.place_bet_btn;
                                                                                                                                                                                                                        TextView textView14 = (TextView) h5e.a(R.id.place_bet_btn, quickBetView);
                                                                                                                                                                                                                        if (textView14 != null) {
                                                                                                                                                                                                                            i2 = R.id.place_bet_btn_layout;
                                                                                                                                                                                                                            LinearLayout linearLayout4 = (LinearLayout) h5e.a(R.id.place_bet_btn_layout, quickBetView);
                                                                                                                                                                                                                            if (linearLayout4 != null) {
                                                                                                                                                                                                                                i2 = R.id.place_bet_loading_btn;
                                                                                                                                                                                                                                if (((Button) h5e.a(R.id.place_bet_loading_btn, quickBetView)) != null) {
                                                                                                                                                                                                                                    i2 = R.id.pot_win;
                                                                                                                                                                                                                                    TextView textView15 = (TextView) h5e.a(R.id.pot_win, quickBetView);
                                                                                                                                                                                                                                    if (textView15 != null) {
                                                                                                                                                                                                                                        i2 = R.id.pot_win_layout;
                                                                                                                                                                                                                                        Group group3 = (Group) h5e.a(R.id.pot_win_layout, quickBetView);
                                                                                                                                                                                                                                        if (group3 != null) {
                                                                                                                                                                                                                                            i2 = R.id.pot_win_tax;
                                                                                                                                                                                                                                            TextView textView16 = (TextView) h5e.a(R.id.pot_win_tax, quickBetView);
                                                                                                                                                                                                                                            if (textView16 != null) {
                                                                                                                                                                                                                                                i2 = R.id.pot_win_tax_layout;
                                                                                                                                                                                                                                                Group group4 = (Group) h5e.a(R.id.pot_win_tax_layout, quickBetView);
                                                                                                                                                                                                                                                if (group4 != null) {
                                                                                                                                                                                                                                                    i2 = R.id.pot_win_tax_value;
                                                                                                                                                                                                                                                    TextView textView17 = (TextView) h5e.a(R.id.pot_win_tax_value, quickBetView);
                                                                                                                                                                                                                                                    if (textView17 != null) {
                                                                                                                                                                                                                                                        i2 = R.id.pot_win_value;
                                                                                                                                                                                                                                                        TextView textView18 = (TextView) h5e.a(R.id.pot_win_value, quickBetView);
                                                                                                                                                                                                                                                        if (textView18 != null) {
                                                                                                                                                                                                                                                            i2 = R.id.potwin_ctl;
                                                                                                                                                                                                                                                            if (((ConstraintLayout) h5e.a(R.id.potwin_ctl, quickBetView)) != null) {
                                                                                                                                                                                                                                                                i2 = R.id.quick_bet_slip;
                                                                                                                                                                                                                                                                LinearLayout linearLayout5 = (LinearLayout) h5e.a(R.id.quick_bet_slip, quickBetView);
                                                                                                                                                                                                                                                                if (linearLayout5 != null) {
                                                                                                                                                                                                                                                                    i2 = R.id.quick_bet_slip_loading;
                                                                                                                                                                                                                                                                    LinearLayout linearLayout6 = (LinearLayout) h5e.a(R.id.quick_bet_slip_loading, quickBetView);
                                                                                                                                                                                                                                                                    if (linearLayout6 != null) {
                                                                                                                                                                                                                                                                        i2 = R.id.require_manual_change_selection_view;
                                                                                                                                                                                                                                                                        TextView textView19 = (TextView) h5e.a(R.id.require_manual_change_selection_view, quickBetView);
                                                                                                                                                                                                                                                                        if (textView19 != null) {
                                                                                                                                                                                                                                                                            i2 = R.id.right_info_container;
                                                                                                                                                                                                                                                                            if (((LinearLayout) h5e.a(R.id.right_info_container, quickBetView)) != null) {
                                                                                                                                                                                                                                                                                i2 = R.id.right_info_container1;
                                                                                                                                                                                                                                                                                if (((LinearLayout) h5e.a(R.id.right_info_container1, quickBetView)) != null) {
                                                                                                                                                                                                                                                                                    i2 = R.id.rotate_clock;
                                                                                                                                                                                                                                                                                    ImageView imageView4 = (ImageView) h5e.a(R.id.rotate_clock, quickBetView);
                                                                                                                                                                                                                                                                                    if (imageView4 != null) {
                                                                                                                                                                                                                                                                                        i2 = R.id.simulate_times_panel;
                                                                                                                                                                                                                                                                                        SimulateAutoBetPanel simulateAutoBetPanel = (SimulateAutoBetPanel) h5e.a(R.id.simulate_times_panel, quickBetView);
                                                                                                                                                                                                                                                                                        if (simulateAutoBetPanel != null) {
                                                                                                                                                                                                                                                                                            i2 = R.id.single_edit_text;
                                                                                                                                                                                                                                                                                            EditText editText = (EditText) h5e.a(R.id.single_edit_text, quickBetView);
                                                                                                                                                                                                                                                                                            if (editText != null) {
                                                                                                                                                                                                                                                                                                i2 = R.id.sportycoin_selection;
                                                                                                                                                                                                                                                                                                if (((RelativeLayout) h5e.a(R.id.sportycoin_selection, quickBetView)) != null) {
                                                                                                                                                                                                                                                                                                    i2 = R.id.sportycoin_value;
                                                                                                                                                                                                                                                                                                    if (((TextView) h5e.a(R.id.sportycoin_value, quickBetView)) != null) {
                                                                                                                                                                                                                                                                                                        i2 = R.id.status;
                                                                                                                                                                                                                                                                                                        TextView textView20 = (TextView) h5e.a(R.id.status, quickBetView);
                                                                                                                                                                                                                                                                                                        if (textView20 != null) {
                                                                                                                                                                                                                                                                                                            i2 = R.id.team_name_info;
                                                                                                                                                                                                                                                                                                            if (((TextView) h5e.a(R.id.team_name_info, quickBetView)) != null) {
                                                                                                                                                                                                                                                                                                                i2 = R.id.title_barrier;
                                                                                                                                                                                                                                                                                                                if (((Barrier) h5e.a(R.id.title_barrier, quickBetView)) != null) {
                                                                                                                                                                                                                                                                                                                    i2 = R.id.toggle_balance;
                                                                                                                                                                                                                                                                                                                    AppCompatImageView appCompatImageView = (AppCompatImageView) h5e.a(R.id.toggle_balance, quickBetView);
                                                                                                                                                                                                                                                                                                                    if (appCompatImageView != null) {
                                                                                                                                                                                                                                                                                                                        i2 = R.id.toggle_sportycoins;
                                                                                                                                                                                                                                                                                                                        ImageView imageView5 = (ImageView) h5e.a(R.id.toggle_sportycoins, quickBetView);
                                                                                                                                                                                                                                                                                                                        if (imageView5 != null) {
                                                                                                                                                                                                                                                                                                                            i2 = R.id.tv_gift;
                                                                                                                                                                                                                                                                                                                            TextView textView21 = (TextView) h5e.a(R.id.tv_gift, quickBetView);
                                                                                                                                                                                                                                                                                                                            if (textView21 != null) {
                                                                                                                                                                                                                                                                                                                                i2 = R.id.tv_multi_title;
                                                                                                                                                                                                                                                                                                                                TextView textView22 = (TextView) h5e.a(R.id.tv_multi_title, quickBetView);
                                                                                                                                                                                                                                                                                                                                if (textView22 != null) {
                                                                                                                                                                                                                                                                                                                                    i2 = R.id.tv_multibet_count;
                                                                                                                                                                                                                                                                                                                                    TextView textView23 = (TextView) h5e.a(R.id.tv_multibet_count, quickBetView);
                                                                                                                                                                                                                                                                                                                                    if (textView23 != null) {
                                                                                                                                                                                                                                                                                                                                        i2 = R.id.tv_multibet_double_text;
                                                                                                                                                                                                                                                                                                                                        TextView textView24 = (TextView) h5e.a(R.id.tv_multibet_double_text, quickBetView);
                                                                                                                                                                                                                                                                                                                                        if (textView24 != null) {
                                                                                                                                                                                                                                                                                                                                            i2 = R.id.tv_multibet_double_value;
                                                                                                                                                                                                                                                                                                                                            TextView textView25 = (TextView) h5e.a(R.id.tv_multibet_double_value, quickBetView);
                                                                                                                                                                                                                                                                                                                                            if (textView25 != null) {
                                                                                                                                                                                                                                                                                                                                                i2 = R.id.tv_multiplebet_bonus_hint;
                                                                                                                                                                                                                                                                                                                                                AppCompatTextView appCompatTextView = (AppCompatTextView) h5e.a(R.id.tv_multiplebet_bonus_hint, quickBetView);
                                                                                                                                                                                                                                                                                                                                                if (appCompatTextView != null) {
                                                                                                                                                                                                                                                                                                                                                    return new ijd0(quickBetView, button, textView, constraintLayout, imageView, constraintLayout2, textView2, linearLayout, textView3, textView4, checkBox, constraintLayout3, imageView2, constraintLayout4, textView5, keyboardView, earlyPayoutCheckbox, textView6, group, textView7, constraintLayout5, textView8, group2, textView9, constraintLayout6, textView10, textView11, textView12, linearLayout2, textView13, linearLayout3, imageView3, earlyPayoutCheckbox2, oneUpTwoUpItemControl, progressBar, textView14, linearLayout4, textView15, group3, textView16, group4, textView17, textView18, linearLayout5, linearLayout6, textView19, imageView4, simulateAutoBetPanel, editText, textView20, appCompatImageView, imageView5, textView21, textView22, textView23, textView24, textView25, appCompatTextView);
                                                                                                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                }
                                                                                                                                                                                                                            }
                                                                                                                                                                                                                        }
                                                                                                                                                                                                                    }
                                                                                                                                                                                                                }
                                                                                                                                                                                                            }
                                                                                                                                                                                                        }
                                                                                                                                                                                                    }
                                                                                                                                                                                                }
                                                                                                                                                                                            }
                                                                                                                                                                                        }
                                                                                                                                                                                    }
                                                                                                                                                                                }
                                                                                                                                                                            }
                                                                                                                                                                        }
                                                                                                                                                                    }
                                                                                                                                                                }
                                                                                                                                                            }
                                                                                                                                                        }
                                                                                                                                                    }
                                                                                                                                                }
                                                                                                                                            }
                                                                                                                                        }
                                                                                                                                    }
                                                                                                                                }
                                                                                                                            }
                                                                                                                        }
                                                                                                                    }
                                                                                                                }
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        bmy.a("Missing required view with ID: ".concat(quickBetView.getResources().getResourceName(i2)));
        return null;
    }

    public static final void r0(QuickBetView quickBetView) {
        Selection selection;
        tf30 tf30Var = quickBetView.d0;
        if (tf30Var == null || (selection = n1) == null) {
            return;
        }
        boolean zIsChecked = quickBetView.getNeverDownItemControl().a.b.isChecked();
        quickBetView.getSelectionPendingToggleHolder().d(kotlin.collections.a.c(selection), c980.a.b, zIsChecked);
        quickBetView.l0();
        List listC = kotlin.collections.a.c(selection);
        tf30Var.z1(g880.m(listC, zIsChecked).getRequestBody(), aak.e, listC);
        bpx bpxVar = quickBetView.h0;
        if (bpxVar != null) {
            bpxVar.b.a(new xjg0(new yox(nkf.b, zIsChecked ? pkf.a : pkf.b), ay0.S(new k00[]{k00.d, k00.c})));
        }
    }

    private final void setAcceptBtn(boolean isSim) {
        Resources resources = getResources();
        getAcceptChangesBtn().setTextColor(isSim ? resources.getColor(R.color.custom_absolute_type2_type3) : resources.getColor(R.color.brand_tertiary));
        getAcceptChangesBtn().setBackgroundResource(isSim ? R.drawable.spr_place_bet_sim_selector : R.drawable.spr_place_bet_selector);
    }

    private final void setAllGiftStateChecked(boolean isChecked) {
        getSingleGiftState().E = isChecked;
        getMultipleGiftState().E = isChecked;
        getDefaultNoUseGiftState().E = isChecked;
    }

    private final void setConfirmPageVisibility(boolean visible) {
        BigDecimal bigDecimalG;
        WeakReference<Activity> weakReference = this.f;
        Activity activity = weakReference != null ? weakReference.get() : null;
        if (activity instanceof fq0) {
            this.isConfirmPageOnScreen = visible;
            fq0 fq0Var = (fq0) activity;
            com.sportybet.plugin.realsports.betslip.widget.d dVar = (com.sportybet.plugin.realsports.betslip.widget.d) fq0Var.getSupportFragmentManager().H("ConfirmFragment");
            if (!visible) {
                if (dVar != null) {
                    dVar.dismissAllowingStateLoss();
                    return;
                }
                return;
            }
            if (dVar == null) {
                String str = getSingleGiftState().c;
                boolean z = false;
                if (str == null || str.length() == 0 || StringsKt.M(str, GiftUtil.CLEARED_GIFT_VALUE, false)) {
                    String str2 = o1;
                    p1 = str2;
                    tf30 tf30Var = this.d0;
                    if (tf30Var != null) {
                        String str3 = str2 == null ? "" : str2;
                        String str4 = str2 == null ? "" : str2;
                        String str5 = getSingleGiftState().d;
                        tf30Var.D1(AnalyticsEvent.BETSLIP_GIFT_STAKE_EQUALS_PAY_2, str3, str4, str5 == null ? "" : str5, null);
                    }
                } else {
                    String str6 = o1;
                    BigDecimal bigDecimal = str6 != null ? new BigDecimal(str6) : BigDecimal.ZERO;
                    bigDecimal.getClass();
                    BigDecimal bigDecimalSubtract = bigDecimal.subtract(new BigDecimal(str));
                    bigDecimalSubtract.getClass();
                    String plainString = bigDecimalSubtract.toPlainString();
                    p1 = plainString;
                    tf30 tf30Var2 = this.d0;
                    if (tf30Var2 != null) {
                        String str7 = plainString == null ? "" : plainString;
                        String str8 = o1;
                        String str9 = str8 == null ? "" : str8;
                        String str10 = getSingleGiftState().d;
                        tf30Var2.D1(AnalyticsEvent.BETSLIP_GIFT_STAKE_EQUALS_PAY_1, str7, str9, str10 == null ? "" : str10, str);
                    }
                }
                String str11 = p1;
                if (str11 != null && str11.length() != 0) {
                    String str12 = p1;
                    if (str12 == null || (bigDecimalG = kotlin.text.b.g(str12)) == null) {
                        bigDecimalG = BigDecimal.ZERO;
                    }
                    if (bigDecimalG.compareTo(BigDecimal.ZERO) < 0) {
                        p1 = "0";
                    }
                }
                Bundle bundle = new Bundle();
                bundle.putString("realPay", p1);
                bundle.putString("key_gift_id", getSingleGiftState().d);
                bundle.putInt("key_gift_kind", getSingleGiftState().e);
                bundle.putInt("gift_count", getSingleGiftState().b);
                bundle.putString("gift_value", getSingleGiftState().c);
                bundle.putBoolean("gift_quick_bet", true);
                bundle.putString("totalstake", o1);
                bundle.putBoolean("useBalance", l1);
                bundle.putBoolean("key_is_sim_bet", getBetItem().m0());
                bundle.putInt("key_simulated_auto_bet_times", SimShareData.INSTANCE.getAutoBetTimes());
                if (getBetItem().V() && getBetItem().Q0() <= 0) {
                    z = true;
                }
                bundle.putBoolean("has_bet_builder_selections", z);
                bundle.putString("key_total_odds_for_gift", getCurrentTotalOddsForGift());
                bundle.putString("key_bonus_rate_for_gift", "0");
                bundle.putString("key_max_win_for_gift", getGetMaxWinUseCase().a().toString());
                bundle.putString("key_max_bonus_for_gift", "0");
                bundle.putBoolean("key_is_show_WHTax", this.F.hasRate(getBetItem().m0()));
                bundle.putBoolean("is_support_free_bet", true);
                bundle.putInt("orderType", 1);
                com.sportybet.plugin.realsports.betslip.widget.d dVarQ0 = com.sportybet.plugin.realsports.betslip.widget.d.q0(bundle);
                dVarQ0.j0 = new g();
                FragmentManager supportFragmentManager = fq0Var.getSupportFragmentManager();
                supportFragmentManager.getClass();
                dVarQ0.show(supportFragmentManager, "ConfirmFragment");
            }
        }
    }

    private final void setGiftsContainerText(String text) {
        if (text == null || text.length() == 0) {
            text = sn5.c(this, R.string.gift__l_gift, new Object[0]);
        }
        SpannableString spannableString = new SpannableString(text);
        spannableString.setSpan(new UnderlineSpan(), 0, spannableString.length(), 0);
        getTvGift().setText(spannableString);
    }

    private final void setInputData(String str) {
        if (Intrinsics.g(getEtInput().getText().toString(), str)) {
            return;
        }
        getEtInput().setText(str);
    }

    private final void setPlaceBetBtn(boolean isSim) {
        Resources resources = getResources();
        if (isSim) {
            getPlaceBetBtn().setTextColor(getPlaceBetBtnLayout().isEnabled() ? resources.getColor(R.color.custom_absolute_type2_type3) : resources.getColor(R.color.text_disable_type1_primary));
        } else {
            getPlaceBetBtn().setTextColor(getPlaceBetBtnLayout().isEnabled() ? resources.getColor(R.color.brand_tertiary) : resources.getColor(R.color.text_disable_type1_primary));
            getExciseTax().setTextColor(getPlaceBetBtnLayout().isEnabled() ? resources.getColor(R.color.brand_tertiary) : resources.getColor(R.color.text_disable_type1_primary));
        }
        getPlaceBetBtnLayout().setBackgroundResource(isSim ? R.drawable.spr_place_bet_sim_selector : R.drawable.spr_place_bet_selector);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setupWebSocketObserver$lambda$3(Throwable th) {
        itf0.a aVar = itf0.a;
        aVar.q(MyLog.TAG_QUICK_BET);
        aVar.o(th);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void w(QuickBetView quickBetView, int i2) {
        Event event;
        r5b r5bVar;
        boolean z = (i2 & 1) != 0;
        if ((i2 & 2) != 0) {
            sty oneUpSelectionAttributionDispatcher = quickBetView.getOneUpSelectionAttributionDispatcher();
            oneUpSelectionAttributionDispatcher.getClass();
            oneUpSelectionAttributionDispatcher.b(sty.b.a.a);
        }
        Boolean bool = null;
        if (quickBetView.getBetItem().m0()) {
            if (!quickBetView.getBetItem().U().isEmpty()) {
                Selection selection = (Selection) quickBetView.getBetItem().U().get(0);
                quickBetView.getBetStore().N(selection);
                quickBetView.getBetItem().j(selection);
                quickBetView.getBetItem().C1(selection);
                quickBetView.getBetItem().i1(selection);
            }
            quickBetView.getSimulateAutoBetPanel().E(Integer.MIN_VALUE);
            quickBetView.getBetStore().i(null);
            quickBetView.getBetStore().Q(null);
            quickBetView.getBetStore().v(null);
            quickBetView.x();
            quickBetView.getSingleGiftState().a();
            quickBetView.getSingleGiftState().b = 0;
            quickBetView.getSingleGiftState().D = null;
            quickBetView.getSingleGiftState().b(null);
            hzz hzzVar = quickBetView.j0;
            if (hzzVar != null && (r5bVar = hzzVar.f) != null) {
                bool = (Boolean) r5bVar.d();
            }
            quickBetView.setAllGiftStateChecked(bool != null && bool.booleanValue());
            o1 = "";
            p1 = "0";
            quickBetView.C();
        } else {
            quickBetView.x();
            quickBetView.getBetItem().G(z);
            quickBetView.getBetMutexDataInstance().clear();
            quickBetView.getBetStore().clear();
            quickBetView.getSingleGiftState().b(null);
            Selection selection2 = n1;
            if (selection2 != null && (event = selection2.a) != null && !event.isVirtualSoccer() && z) {
                Market market = selection2.b;
                quickBetView.getSportyTrackingUseCase().a(new nt3(market != null ? apg.b(event, market) : ""), k00.d);
            }
        }
        quickBetView.A = false;
        k1 = false;
        q1.clear();
        j1 = false;
        l1 = true;
        quickBetView.getBetSlipMarketingDomainService().f(true);
        quickBetView.getBetItem().z1(quickBetView, quickBetView.i1);
    }

    public final BigDecimal A(int i2) {
        if (i2 == 1 || qz3.g()) {
            BigDecimal scale = ((BigDecimal) Collections.max(getBetMutexDataInstance().c())).setScale(2, RoundingMode.HALF_UP);
            scale.getClass();
            return scale;
        }
        if (i2 > 1) {
            BigDecimal scale2 = getBetMutexDataInstance().M().setScale(2, RoundingMode.HALF_UP);
            scale2.getClass();
            return scale2;
        }
        BigDecimal bigDecimal = BigDecimal.ZERO;
        bigDecimal.getClass();
        return bigDecimal;
    }

    public final void A0(BigDecimal bigDecimal, BigDecimal bigDecimal2) {
        this.V.onNext(new bg30(bigDecimal, this.F.getTax(getBetItem().m0(), bigDecimal, bigDecimal2), this.F.getNetWin(getBetItem().m0(), bigDecimal, bigDecimal2)));
    }

    public final String B(int i2, boolean z) {
        if (i2 == 1 || qz3.g()) {
            BigDecimal bigDecimal = (BigDecimal) Collections.max(getBetMutexDataInstance().c());
            if (bigDecimal.compareTo(BigDecimal.ZERO) <= 0) {
                return "";
            }
            return gky.a.a(bjb0.L(bigDecimal.setScale(2, RoundingMode.HALF_UP), Locale.US), false);
        }
        if (i2 <= 1) {
            return "";
        }
        BigDecimal bigDecimalM = getBetMutexDataInstance().M();
        RoundingMode roundingMode = RoundingMode.HALF_UP;
        BigDecimal scale = bigDecimalM.setScale(2, roundingMode);
        if (!z) {
            return gky.a.a(bjb0.L(scale, Locale.US), false);
        }
        BigDecimal scale2 = getBetMutexDataInstance().j().setScale(2, roundingMode);
        if (scale2.compareTo(scale) == 0) {
            return gky.a.a(bjb0.L(scale2, Locale.US), false);
        }
        Locale locale = Locale.US;
        return oxc.a(gky.a.a(bjb0.L(scale2, locale), false), " ~ ", gky.a.a(bjb0.L(scale, locale), false));
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [kd30] */
    public final void B0() {
        if (vn20.c("sportybet", "quick_showRookie", false)) {
            return;
        }
        vn20.g("sportybet", "quick_showRookie", true, true);
        this.e = new Runnable() { // from class: kd30
            @Override // java.lang.Runnable
            public final void run() {
                boolean z = QuickBetView.j1;
                this.a.y0();
            }
        };
        getBoostView().post(this.e);
    }

    public final void C() {
        boolean zS0 = s0();
        setGiftChecked(getSingleGiftState().i);
        SelectedGiftData selectedGiftData = getSingleGiftState().C;
        o(zS0);
        Q0();
    }

    public final void C0(int i2, String str) {
        WeakReference<Activity> weakReference = this.f;
        Activity activity = weakReference != null ? weakReference.get() : null;
        if (activity == null || activity.isFinishing() || !(activity instanceof fq0) || ((e9h) ((fq0) activity).getSupportFragmentManager().H("FailedFragment")) != null) {
            return;
        }
        if (i2 == 4200 && !l1) {
            i2 = 42001;
        }
        e9h e9hVarJ0 = e9h.j0(i2, str);
        try {
            FragmentManager supportFragmentManager = ((fq0) activity).getSupportFragmentManager();
            supportFragmentManager.getClass();
            e9hVarJ0.show(supportFragmentManager, "FailedFragment");
        } catch (Exception unused) {
        }
    }

    public final boolean D() {
        if (!getBetItem().m0() || SimShareData.INSTANCE.getAutoBetTimes() <= 1) {
            return false;
        }
        SelectedGiftData selectedGiftData = getSingleGiftState().C;
        if (selectedGiftData == null || !selectedGiftData.getChecked()) {
            setAllGiftStateChecked(false);
            getSingleGiftState().i = false;
            Q0();
        } else {
            V(false);
        }
        SelectedGiftData selectedGiftData2 = getSingleGiftState().C;
        o(false);
        return true;
    }

    public final void D0(boolean z) {
        if (z) {
            k53 k53VarC = iu2.c();
            k53VarC.getClass();
            if (kotlin.collections.a.c(k53.REAL).contains(k53VarC)) {
                getBoostView().setVisibility(P() ? 8 : 0);
                getBoostView().getViewTreeObserver().addOnGlobalLayoutListener(new h());
                if (vn20.c("sportybet", "first_single", true)) {
                    vn20.g("sportybet", "first_single", false, true);
                    RotateAnimation rotateAnimation = new RotateAnimation(0.0f, 90.0f, 1, 1.0f, 1, 0.8f);
                    rotateAnimation.setFillAfter(true);
                    rotateAnimation.setDuration(1500L);
                    rotateAnimation.setInterpolator(new LinearInterpolator());
                    getRotateClockView().startAnimation(rotateAnimation);
                    rotateAnimation.setAnimationListener(new i());
                }
                if (this.D) {
                    getBoostView().setEnabled(false);
                    getBoostHintView().setText(sn5.c(this, R.string.component_betslip__no_games_available_to_boost, new Object[0]));
                    getBoostButton().setBackgroundColor(getContext().getColor(R.color.background_type2_for_iv_primary));
                    zch0.k(getContext(), getRotateClockView(), Color.parseColor("#dcdee5"));
                    getBoostCheckBoxView().setImageResource(R.drawable.ic_boost_unchecked);
                    getBoostTextView().setText(sn5.c(this, R.string.component_betslip__u_boost, new Object[0]));
                    RotateAnimation rotateAnimation2 = new RotateAnimation(90.0f, 0.0f, 1, 1.0f, 1, 0.8f);
                    rotateAnimation2.setFillAfter(true);
                    rotateAnimation2.setDuration(1L);
                    rotateAnimation2.setInterpolator(new LinearInterpolator());
                    getRotateClockView().startAnimation(rotateAnimation2);
                    return;
                }
                getBoostView().setEnabled(true);
                getBoostHintView().setText(sn5.c(this, R.string.component_betslip__live_odds_boost, new Object[0]));
                if (!getBetItem().M()) {
                    getBoostTextView().setText(sn5.c(this, R.string.component_betslip__u_boost, new Object[0]));
                    getBoostButton().setBackgroundResource(R.drawable.background_flash_odds);
                    getBoostCheckBoxView().setImageResource(R.drawable.ic_boost_unchecked);
                    zch0.k(getContext(), getRotateClockView(), Color.parseColor("#dcdee5"));
                    RotateAnimation rotateAnimation3 = new RotateAnimation(90.0f, 0.0f, 1, 1.0f, 1, 0.8f);
                    rotateAnimation3.setFillAfter(true);
                    rotateAnimation3.setDuration(1L);
                    rotateAnimation3.setInterpolator(new LinearInterpolator());
                    getRotateClockView().startAnimation(rotateAnimation3);
                    return;
                }
                getBoostTextView().setText(sn5.c(this, R.string.component_betslip__u_boosted, new Object[0]));
                getPotentialWin().setTextColor(-1);
                getBoostButton().setBackgroundResource(R.drawable.background_flash_odds);
                getBoostCheckBoxView().setImageResource(R.drawable.ic_boost_checked);
                zch0.k(getContext(), getRotateClockView(), Color.parseColor("#f2af00"));
                RotateAnimation rotateAnimation4 = new RotateAnimation(0.0f, 90.0f, 1, 1.0f, 1, 0.8f);
                rotateAnimation4.setFillAfter(true);
                rotateAnimation4.setDuration(1L);
                rotateAnimation4.setInterpolator(new LinearInterpolator());
                getRotateClockView().startAnimation(rotateAnimation4);
                return;
            }
        }
        getBoostView().setVisibility(8);
    }

    public final void E(JSONArray jSONArray, Set<Selection> set) throws JSONException {
        long j;
        Collection collectionT0;
        JSONArray jSONArray2;
        boolean z;
        JSONArray jSONArrayOptJSONArray = jSONArray.optJSONArray(8);
        try {
            j = jSONArray.getLong(7);
        } catch (JSONException unused) {
            j = -1;
        }
        for (final Selection selection : set) {
            Market market = selection.b;
            Event event = selection.a;
            Outcome outcome = selection.c;
            boolean z2 = true;
            if (market.product != 1 || jSONArray.getInt(1) != 3) {
                ww2 betOddsUseCases = getBetOddsUseCases();
                market.getClass();
                betOddsUseCases.getClass();
                if (!ww2.b(market, j)) {
                    int i2 = 0;
                    if (selection.q()) {
                        market.update(jSONArray);
                        event.changeFlag = true;
                        market.product = jSONArray.getInt(1);
                        int length = jSONArrayOptJSONArray.length();
                        for (int i3 = 0; i3 < length; i3++) {
                            if (new SocketOutcomeMessage(null, null, 0.0d, 0, null, 0, 0, 0, 255, null).create(jSONArrayOptJSONArray.getString(i3)).isActive() != 1) {
                                z2 = false;
                                break;
                            }
                        }
                        getBetItem().f(event, market, z2);
                    } else {
                        int length2 = jSONArrayOptJSONArray.length();
                        int i4 = 0;
                        while (i4 < length2) {
                            String string = jSONArrayOptJSONArray.getString(i4);
                            string.getClass();
                            boolean z3 = z2;
                            List listH = new Regex("#").h(string);
                            if (listH.isEmpty()) {
                                collectionT0 = m2g.a;
                                break;
                            }
                            ListIterator listIterator = listH.listIterator(listH.size());
                            while (true) {
                                if (listIterator.hasPrevious()) {
                                    if (((String) listIterator.previous()).length() != 0) {
                                        collectionT0 = CollectionsKt.t0(listH, listIterator.nextIndex() + 1);
                                        break;
                                    }
                                } else {
                                    collectionT0 = m2g.a;
                                    break;
                                }
                            }
                            String[] strArr = (String[]) collectionT0.toArray(new String[i2]);
                            if (Intrinsics.g(outcome.id, strArr[i2])) {
                                outcome.oddsChangesFlag = new BigDecimal(strArr[2]).compareTo(new BigDecimal(outcome.odds));
                                String str = strArr[3];
                                boolean z4 = (str == null || outcome.isActive != Integer.parseInt(str)) ? false : z3;
                                boolean z5 = outcome.oddsChangesFlag != 0 ? z3 : false;
                                getBetItem().q0(z5);
                                if (!z4 || z5) {
                                    jSONArray2 = jSONArrayOptJSONArray;
                                    k1 = z3;
                                    this.g1 = this.f1;
                                    event.changeFlag = z3;
                                    market.update(jSONArray);
                                    outcome.odds = strArr[2];
                                    String str2 = strArr[3];
                                    outcome.isActive = str2 != null ? Integer.parseInt(str2) : 0;
                                    String str3 = (String) ay0.C(6, strArr);
                                    Double dH = str3 != null ? kotlin.text.b.h(str3) : null;
                                    if (dH != null && dH.doubleValue() > 1.0E-4d) {
                                        outcome.probability = dH.doubleValue();
                                    }
                                    try {
                                        market.lastOddsChangeTime = jSONArray.getLong(7);
                                    } catch (Exception e2) {
                                        itf0.a.e(e2);
                                    }
                                    u(selection, new Runnable() { // from class: qe30
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            boolean z6 = QuickBetView.j1;
                                            QuickBetView quickBetView = this.a;
                                            jrm betItem = quickBetView.getBetItem();
                                            Selection selection2 = selection;
                                            betItem.N0(selection2.a, selection2.b, selection2.c, true, (14336 & 16) != 0 ? false : false, (14336 & 32) != 0 ? null : selection2.d, (14336 & 64) != 0 ? k980.DEFAULT : selection2.e, (14336 & 128) != 0 ? false : selection2.i, (14336 & 256) != 0 ? false : true, (14336 & 512) != 0 ? false : false, (14336 & 1024) != 0 ? null : null, (14336 & 2048) != 0 ? false : false, (14336 & 4096) != 0 ? false : false, false);
                                            jrm betItem2 = quickBetView.getBetItem();
                                            Event event2 = selection2.a;
                                            Market market2 = selection2.b;
                                            Outcome outcome2 = selection2.c;
                                            if (betItem2.v(event2, market2, outcome2)) {
                                                QuickBetView.q1.add(new Selection(event2, market2, outcome2, selection2.d));
                                            }
                                        }
                                    });
                                } else {
                                    String str4 = (String) ay0.C(6, strArr);
                                    Double dH2 = str4 != null ? kotlin.text.b.h(str4) : null;
                                    if (dH2 == null || dH2.doubleValue() <= 1.0E-4d) {
                                        jSONArray2 = jSONArrayOptJSONArray;
                                    } else {
                                        jSONArray2 = jSONArrayOptJSONArray;
                                        if (!Intrinsics.a(outcome.probability, dH2)) {
                                            outcome.probability = dH2.doubleValue();
                                            u(selection, new Runnable() { // from class: re30
                                                @Override // java.lang.Runnable
                                                public final void run() {
                                                    boolean z6 = QuickBetView.j1;
                                                    QuickBetView quickBetView = this.a;
                                                    jrm betItem = quickBetView.getBetItem();
                                                    Selection selection2 = selection;
                                                    betItem.N0(selection2.a, selection2.b, selection2.c, true, (14336 & 16) != 0 ? false : false, (14336 & 32) != 0 ? null : selection2.d, (14336 & 64) != 0 ? k980.DEFAULT : selection2.e, (14336 & 128) != 0 ? false : selection2.i, (14336 & 256) != 0 ? false : true, (14336 & 512) != 0 ? false : false, (14336 & 1024) != 0 ? null : null, (14336 & 2048) != 0 ? false : false, (14336 & 4096) != 0 ? false : false, false);
                                                    jrm betItem2 = quickBetView.getBetItem();
                                                    Event event2 = selection2.a;
                                                    Market market2 = selection2.b;
                                                    Outcome outcome2 = selection2.c;
                                                    if (betItem2.v(event2, market2, outcome2)) {
                                                        QuickBetView.q1.add(new Selection(event2, market2, outcome2, selection2.d));
                                                    }
                                                }
                                            });
                                            itf0.a aVar = itf0.a;
                                            aVar.q(MyLog.TAG_COMMON);
                                            z = false;
                                            aVar.g("quick bet - update probability", new Object[0]);
                                        }
                                        event.changeFlag = z;
                                    }
                                    z = false;
                                    event.changeFlag = z;
                                }
                                i4++;
                                jSONArrayOptJSONArray = jSONArray2;
                                j = j;
                                z2 = true;
                                i2 = 0;
                            } else {
                                jSONArray2 = jSONArrayOptJSONArray;
                            }
                            j = j;
                            i4++;
                            jSONArrayOptJSONArray = jSONArray2;
                            j = j;
                            z2 = true;
                            i2 = 0;
                        }
                    }
                }
            }
        }
    }

    public final void E0(boolean z) {
        WeakReference<Activity> weakReference = this.f;
        Activity activity = weakReference != null ? weakReference.get() : null;
        if (activity == null || activity.isFinishing() || !(activity instanceof fq0)) {
            return;
        }
        ade0 ade0Var = (ade0) ((fq0) activity).getSupportFragmentManager().H("SubmittingFragment");
        if (!z) {
            if (ade0Var != null) {
                ade0Var.dismissAllowingStateLoss();
                this.v = false;
                return;
            }
            return;
        }
        if (ade0Var == null) {
            boolean zM0 = getBetItem().m0();
            ade0 ade0Var2 = new ade0();
            Bundle bundle = new Bundle();
            bundle.putBoolean("sim_mode", zM0);
            ade0Var2.setArguments(bundle);
            try {
                FragmentManager supportFragmentManager = ((fq0) activity).getSupportFragmentManager();
                supportFragmentManager.getClass();
                ade0Var2.show(supportFragmentManager, "SubmittingFragment");
            } catch (Exception unused) {
            }
        }
    }

    public final void F(JSONArray jSONArray, Set<Selection> set) {
        boolean z;
        for (Selection selection : set) {
            Market market = selection.b;
            Event event = selection.a;
            int i2 = 1;
            if (market.product != 1 || jSONArray.getInt(1) != 3) {
                if (selection.q()) {
                    market.update(jSONArray);
                    event.changeFlag = true;
                    market.product = jSONArray.getInt(1);
                    getBetItem().f(event, market, true);
                } else {
                    if (market.status == jSONArray.getInt(2) && jSONArray.getInt(2) != 0 && (jSONArray.getInt(2) != 3 || market.status == 3)) {
                        z = false;
                    } else {
                        k1 = true;
                        this.g1 = this.f1;
                        z = true;
                    }
                    if (market.product == 3 && jSONArray.getInt(1) == 1) {
                        market.product = 1;
                        k1 = true;
                        this.g1 = this.f1;
                        z = true;
                    }
                    if (z) {
                        event.changeFlag = true;
                        j1 = true;
                        market.update(jSONArray);
                        u(selection, new xrb(i2, this, selection));
                    } else {
                        event.changeFlag = false;
                    }
                }
            }
        }
    }

    public final void G(SelectedGiftData selectedGiftData, SelectedGiftData selectedGiftData2) {
        setAllGiftStateChecked(true);
        getSingleGiftState().b(selectedGiftData);
        getSingleGiftState().D = selectedGiftData2;
        getSingleGiftState().v = true;
        this.P = true;
        if (getBetItem().m0()) {
            o(s0());
        }
        yyk yykVar = this.i0;
        if (yykVar != null) {
            yykVar.E1();
        }
    }

    public final void H(ajk.a aVar) {
        BigDecimal bigDecimal = aVar.a;
        BigDecimal bigDecimal2 = aVar.b;
        boolean z = aVar.d;
        SelectedGiftData selectedGiftData = getSingleGiftState().C;
        if (selectedGiftData != null) {
            getSingleGiftState().b(new SelectedGiftData(bigDecimal2.toString(), selectedGiftData.getGiftKind(), selectedGiftData.getGiftId(), selectedGiftData.getGiftLimit(), selectedGiftData.getGiftCount(), selectedGiftData.getRawGift(), z, getSingleGiftState().i, selectedGiftData.getUserSelect(), bigDecimal.toString()));
        }
        getSingleGiftState().c = (TextUtils.isEmpty(getSingleGiftState().c) || TextUtils.equals(getSingleGiftState().c, GiftUtil.CLEARED_GIFT_VALUE) || getSingleGiftState().i) ? getSingleGiftState().c : "0";
        String string = bigDecimal.toString();
        string.getClass();
        o1 = string;
        getBetStore().i(new imn(0L, string, ""));
        getBetStore().S();
        getBetStore().Q(null);
        ArrayList arrayListU = getBetItem().U();
        int size = arrayListU.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayListU.get(i2);
            i2++;
            getBetStore().O((Selection) obj, o1);
        }
        setInputData(string);
        R0();
        K0();
    }

    public final void H0() {
        r5b r5bVar;
        r5b r5bVar2;
        r5b r5bVar3;
        vu90<vjk> vu90Var;
        ibs ibsVarQ = Q();
        if (ibsVarQ != null) {
            yyk yykVar = this.i0;
            if (yykVar != null && (vu90Var = yykVar.I) != null) {
                vu90Var.l(ibsVarQ);
            }
            yyk yykVar2 = this.i0;
            if (yykVar2 != null && (r5bVar3 = yykVar2.K) != null) {
                r5bVar3.l(ibsVarQ);
            }
            yyk yykVar3 = this.i0;
            if (yykVar3 != null && (r5bVar2 = yykVar3.O) != null) {
                r5bVar2.l(ibsVarQ);
            }
            hzz hzzVar = this.j0;
            if (hzzVar == null || (r5bVar = hzzVar.f) == null) {
                return;
            }
            r5bVar.l(ibsVarQ);
        }
    }

    /* JADX WARN: Code duplicated, block: B:72:0x01d6  */
    public final void I(ej90 ej90Var, boolean z) {
        Object cVar;
        n780.c cVar2;
        boolean z2;
        tf30 tf30Var;
        if (ej90Var == null) {
            return;
        }
        List<GiftDetails> list = ej90Var.c;
        if (ej90Var.b == ipk.a) {
            cVar = n780.f.a;
        } else if (list.isEmpty()) {
            cVar = new n780.a(1);
        } else {
            GiftDetails giftDetails = list.get(0);
            cVar = new n780.c(giftDetails, getBetStore().e0().a, bjb0.W(giftDetails.getCurrentBalance()), Boolean.valueOf(ej90Var.a != null), Boolean.valueOf(ej90Var.d), Boolean.FALSE);
        }
        if (this.O) {
            if (getBetItem().U().size() != 1) {
                getSingleGiftState().b = 0;
                C();
                return;
            }
            if (cVar instanceof n780.a) {
                x();
                getSingleGiftState().b = 0;
                SelectedGiftData selectedGiftData = getSingleGiftState().C;
                if (selectedGiftData == null) {
                    this.P = true;
                    yyk yykVar = this.i0;
                    if (yykVar != null) {
                        yykVar.E1();
                    }
                    o(false);
                    return;
                }
                getSingleGiftState().E = false;
                SelectedGiftData selectedGiftDataCopy = selectedGiftData.copy(selectedGiftData.getGiftValue(), selectedGiftData.getGiftKind(), selectedGiftData.getGiftId(), selectedGiftData.getGiftLimit(), selectedGiftData.getGiftCount(), selectedGiftData.getRawGift(), selectedGiftData.getAddToStake(), false, selectedGiftData.getUserSelect(), selectedGiftData.getTotalStake());
                getSingleGiftState().D = selectedGiftData;
                getSingleGiftState().b(selectedGiftDataCopy);
                getSingleGiftState().v = true;
                O0();
                getSingleGiftState().b(null);
                o(false);
                return;
            }
            if (cVar instanceof n780.c) {
                this.Q = true;
                getSingleGiftState().b = list.size();
                if (D()) {
                    return;
                }
                SelectedGiftData selectedGiftData2 = getSingleGiftState().C;
                Stream<GiftDetails> stream = list.stream();
                final ge30 ge30Var = new ge30(selectedGiftData2, false ? 1 : 0);
                GiftDetails giftDetailsOrElse = stream.filter(new Predicate() { // from class: he30
                    @Override // java.util.function.Predicate
                    public final boolean test(Object obj) {
                        boolean z3 = QuickBetView.j1;
                        return ((Boolean) ge30Var.invoke(obj)).booleanValue();
                    }
                }).findFirst().orElse(null);
                n780.c cVar3 = (n780.c) cVar;
                GiftDetails giftDetails2 = cVar3.a;
                String giftId = giftDetails2.getGiftId();
                if (selectedGiftData2 == null || giftDetailsOrElse == null || !(selectedGiftData2.getUserSelect() || Intrinsics.g(giftDetailsOrElse.getGiftId(), giftId))) {
                    cVar2 = null;
                } else {
                    long jLongValue = Long.MAX_VALUE;
                    try {
                        BigDecimal bigDecimal = selectedGiftData2.getGiftValue() != null ? new BigDecimal(selectedGiftData2.getGiftValue()) : null;
                        if (bigDecimal != null) {
                            BigDecimal bigDecimalMultiply = bigDecimal.multiply(BigDecimal.valueOf(10000L));
                            if (bigDecimalMultiply.compareTo(BigDecimal.valueOf(Long.MAX_VALUE)) <= 0) {
                                jLongValue = bigDecimalMultiply.compareTo(BigDecimal.ZERO) < 0 ? 0L : bigDecimalMultiply.longValue();
                            }
                        }
                    } catch (Exception unused) {
                    }
                    cVar2 = new n780.c(giftDetailsOrElse, selectedGiftData2.getTotalStake(), bjb0.W(Math.min(giftDetailsOrElse.getCurrentBalance(), jLongValue)), Boolean.valueOf(selectedGiftData2.getChecked()), Boolean.valueOf(selectedGiftData2.getAddToStake()), Boolean.valueOf(selectedGiftData2.getUserSelect()));
                }
                if (cVar2 == null) {
                    setAllGiftStateChecked(z);
                    boolean z3 = getSingleGiftState().E;
                    if (selectedGiftData2 == null || selectedGiftData2.getRawGift() == null) {
                        z2 = false;
                    } else {
                        String giftId2 = giftDetails2.getGiftId();
                        GiftDetails rawGift = selectedGiftData2.getRawGift();
                        if (Intrinsics.g(giftId2, rawGift != null ? rawGift.getGiftId() : null)) {
                            z2 = false;
                        } else {
                            z2 = true;
                        }
                    }
                    if (z3 && z2 && (tf30Var = this.d0) != null) {
                        ku90<com.sporty.android.common.uievent.a> ku90Var = tf30Var.Q;
                        StringUiText stringUiText = vch0.a;
                        com.sporty.android.common.uievent.b.i(ku90Var, new ResourceUiText(R.string.component_coupon__gift_updated_to_better_match_your_current_selection), null, null, null, WebSocketProtocol.PAYLOAD_SHORT);
                    }
                    getSingleGiftState().D = selectedGiftData2;
                    cVar2 = new n780.c(cVar3.a, null, null, Boolean.valueOf(z3), null, null);
                }
                String strW = cVar2.c;
                GiftDetails giftDetails3 = cVar2.a;
                String str = cVar2.b;
                Boolean bool = Boolean.TRUE;
                boolean zEquals = bool.equals(cVar2.e);
                Boolean bool2 = cVar2.d;
                boolean zEquals2 = bool2 != null ? bool.equals(bool2) : true;
                Boolean bool3 = cVar2.f;
                boolean zEquals3 = bool3 != null ? bool.equals(bool3) : false;
                if (TextUtils.isEmpty(strW)) {
                    strW = bjb0.W(giftDetails3.getCurrentBalance());
                }
                SelectedGiftData selectedGiftData3 = new SelectedGiftData(strW, giftDetails3.getKind(), giftDetails3.getGiftId(), bjb0.W(giftDetails3.getLeastOrderAmount()), 1, giftDetails3, zEquals, zEquals2, zEquals3, str);
                getSingleGiftState().v = true;
                getSingleGiftState().b(selectedGiftData3);
                o(true);
                this.P = true;
                yyk yykVar2 = this.i0;
                if (yykVar2 != null) {
                    yykVar2.E1();
                }
            }
        }
    }

    public final void I0() {
        r5b r5bVar;
        r5b r5bVar2;
        jvd0 jvd0Var = this.l0;
        if (jvd0Var != null) {
            jvd0Var.cancel((CancellationException) null);
            this.l0 = null;
        }
        jvd0 jvd0Var2 = this.m0;
        if (jvd0Var2 != null) {
            jvd0Var2.cancel((CancellationException) null);
            this.m0 = null;
        }
        ibs ibsVarQ = Q();
        if (ibsVarQ == null || this.k0 == null) {
            return;
        }
        jlv jlvVar = this.n0;
        if (jlvVar != null) {
            jlvVar.l(ibsVarQ);
            this.n0 = null;
        }
        aj90 aj90Var = this.k0;
        if (aj90Var != null && (r5bVar2 = aj90Var.v) != null) {
            r5bVar2.l(ibsVarQ);
        }
        aj90 aj90Var2 = this.k0;
        if (aj90Var2 == null || (r5bVar = aj90Var2.z) == null) {
            return;
        }
        r5bVar.l(ibsVarQ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v13, types: [ee30, lfy] */
    public final void J(final Activity activity, zc30 zc30Var) {
        if (activity.isFinishing()) {
            return;
        }
        m1 = getCountryManager().B();
        this.f = new WeakReference<>(activity);
        this.T = zc30Var;
        if (getBetItem().U().isEmpty()) {
            return;
        }
        n1 = (Selection) getBetItem().U().get(0);
        jrm betItem = getBetItem();
        a aVar = this.i1;
        betItem.z1(this, aVar);
        SocketPushManager.getInstance().subscribeTopic(this.a0, aVar);
        getBetItem().A(this);
        long jC = getRemoteConfigRepository().c("live_event_page_socket_buffer_period");
        qm70 qm70Var = wm70.a;
        qm70Var.getClass();
        d3i d3iVar = new d3i(this.S.i(qt1.b), new me30());
        k830<Boolean> k830Var = this.U;
        int i2 = r2i.a;
        yby.b(k830Var, "other is null");
        yby.c(i2, "bufferSize");
        a3i a3iVar = new a3i(new q3i(null, k830Var, true, i2).l(d3iVar).f(qm70Var), new itu());
        qm70 qm70Var2 = wm70.b;
        yby.b(TimeUnit.MILLISECONDS, "unit is null");
        yby.b(qm70Var2, "scheduler is null");
        yby.c(25, "count");
        b3i b3iVarF = new s2i(a3iVar, jC, jC, qm70Var2).f(va0.a());
        slr slrVar = new slr(new pya() { // from class: ne30
            @Override // defpackage.pya
            public final void accept(Object obj) {
                Collection collectionT0;
                List list = (List) obj;
                boolean z = QuickBetView.j1;
                if (list == null) {
                    return;
                }
                HashSet hashSet = new HashSet();
                int size = list.size();
                while (true) {
                    size--;
                    if (-1 >= size) {
                        return;
                    }
                    SocketMarketMessage socketMarketMessage = (SocketMarketMessage) list.get(size);
                    if (socketMarketMessage != null) {
                        if (hashSet.contains(socketMarketMessage.topic)) {
                            itf0.a aVar2 = itf0.a;
                            aVar2.q(MyLog.TAG_QUICK_BET);
                            aVar2.a("(QuickBetView) skip duplicated market", new Object[0]);
                        } else {
                            hashSet.add(socketMarketMessage.topic);
                            QuickBetView quickBetView = this.a;
                            if (quickBetView.getBetItem().U().isEmpty()) {
                                quickBetView.getBetItem().z1(quickBetView, quickBetView.i1);
                            } else if (!quickBetView.v && quickBetView.A && !quickBetView.N()) {
                                itf0.a aVar3 = itf0.a;
                                aVar3.q(MyLog.TAG_QUICK_BET);
                                aVar3.a("QuickBetView - handleEventMsg: %s", socketMarketMessage.topic);
                                try {
                                    String str = socketMarketMessage.topic;
                                    str.getClass();
                                    List listH = new Regex("\\^").h(str.substring(0, StringsKt.V(6, str, "^")));
                                    if (!listH.isEmpty()) {
                                        ListIterator listIterator = listH.listIterator(listH.size());
                                        while (true) {
                                            if (!listIterator.hasPrevious()) {
                                                collectionT0 = m2g.a;
                                                break;
                                            } else if (((String) listIterator.previous()).length() != 0) {
                                                collectionT0 = CollectionsKt.t0(listH, listIterator.nextIndex() + 1);
                                                break;
                                            }
                                        }
                                    } else {
                                        collectionT0 = m2g.a;
                                        break;
                                    }
                                    String[] strArr = (String[]) collectionT0.toArray(new String[0]);
                                    if (strArr.length >= 5) {
                                        strArr[4] = "~";
                                        StringBuilder sb = new StringBuilder();
                                        int length = strArr.length;
                                        int i3 = 0;
                                        while (i3 < length) {
                                            sb.append(i3 != 0 ? "^" : "");
                                            sb.append(strArr[i3]);
                                            i3++;
                                        }
                                        Set<Selection> set = (Set) quickBetView.getBetItem().c1().get(sb.toString());
                                        JSONArray jSONArrayOptJSONArray = socketMarketMessage.jsonArray.optJSONArray(8);
                                        if (set != null) {
                                            JSONArray jSONArray = socketMarketMessage.jsonArray;
                                            if (jSONArrayOptJSONArray != null) {
                                                jSONArray.getClass();
                                                quickBetView.E(jSONArray, set);
                                            } else {
                                                jSONArray.getClass();
                                                quickBetView.F(jSONArray, set);
                                            }
                                        }
                                        quickBetView.e0(socketMarketMessage.jsonArray);
                                        QuickBetView.n1 = (Selection) quickBetView.getBetItem().U().get(0);
                                        quickBetView.a0(false);
                                        quickBetView.q();
                                        tf30 tf30Var = quickBetView.d0;
                                        if (tf30Var != null) {
                                            tf30Var.G1();
                                        }
                                    }
                                } catch (Exception e2) {
                                    itf0.a aVar4 = itf0.a;
                                    aVar4.q(MyLog.TAG_QUICK_BET);
                                    aVar4.o(e2);
                                }
                            }
                        }
                    }
                }
            }
        }, new oe30(), taj.c);
        b3iVarF.h(slrVar);
        ema emaVar = this.R;
        emaVar.b(slrVar);
        getStakeConfigAgent().m(this);
        SimShareData simShareData = SimShareData.INSTANCE;
        zd2<Integer> autoBetTimesSubject = simShareData.getAutoBetTimesSubject();
        c cVar = new c();
        autoBetTimesSubject.a(cVar);
        emaVar.b(cVar);
        ucy ucyVarB = ucy.b(simShareData.getAutoBetTimesSubject(), this.V, new ce30());
        d dVar = new d();
        ucyVarB.a(dVar);
        emaVar.b(dVar);
        ucy ucyVarB2 = ucy.b(simShareData.getAutoBetTimesSubject(), this.W, new de30());
        e eVar = new e();
        ucyVarB2.a(eVar);
        emaVar.b(eVar);
        w8i0 w8i0Var = (w8i0) activity;
        v8i0 viewModelStore = w8i0Var.getViewModelStore();
        boolean z = w8i0Var instanceof iel;
        r8i0.c defaultViewModelProviderFactory = z ? ((iel) w8i0Var).getDefaultViewModelProviderFactory() : fjd.a;
        cyb defaultViewModelCreationExtras = z ? ((iel) w8i0Var).getDefaultViewModelCreationExtras() : cyb.a.b;
        viewModelStore.getClass();
        defaultViewModelProviderFactory.getClass();
        defaultViewModelCreationExtras.getClass();
        s8i0 s8i0Var = new s8i0(viewModelStore, defaultViewModelProviderFactory, defaultViewModelCreationExtras);
        dq7 dq7VarA = jq40.a(fj2.class);
        String strI = dq7VarA.i();
        if (strI == null) {
            hb5.a("Local and anonymous classes can not be ViewModels");
            return;
        }
        fj2 fj2Var = (fj2) s8i0Var.a(dq7VarA, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strI));
        this.b0 = fj2Var;
        vu90 vu90Var = fj2Var.w;
        if (vu90Var != null) {
            ibs ibsVar = (ibs) activity;
            ?? r1 = new lfy() { // from class: ee30
                @Override // defpackage.lfy
                public final void u1(Object obj) {
                    BetBuilderDataWSelections betBuilderDataWSelections = (BetBuilderDataWSelections) obj;
                    boolean z2 = QuickBetView.j1;
                    if (betBuilderDataWSelections == null || betBuilderDataWSelections.getPushChanges() == null) {
                        return;
                    }
                    BetBuilderData betBuilderData = betBuilderDataWSelections.getBetBuilderData();
                    ArrayList arrayListC = g880.C(betBuilderDataWSelections.getSelections());
                    Event event = ((Selection) arrayListC.get(0)).a;
                    int i3 = event.isLiveOrFinished() ? 1 : 3;
                    if (Intrinsics.g(betBuilderDataWSelections.getPushChanges(), Boolean.TRUE)) {
                        QuickBetView.k1 = true;
                        event.changeFlag = true;
                    }
                    QuickBetView quickBetView = this.a;
                    jrm betItem2 = quickBetView.getBetItem();
                    Event eventF = apg.f(event);
                    Activity activity2 = activity;
                    betItem2.N0(eventF, qg2.a(betBuilderData, activity2, i3), qg2.b(betBuilderData, activity2), true, (14336 & 16) != 0 ? false : false, (14336 & 32) != 0 ? null : arrayListC, (14336 & 64) != 0 ? k980.DEFAULT : null, (14336 & 128) != 0 ? false : false, (14336 & 256) != 0 ? false : false, (14336 & 512) != 0 ? false : false, (14336 & 1024) != 0 ? null : null, (14336 & 2048) != 0 ? false : false, (14336 & 4096) != 0 ? false : false, false);
                    QuickBetView.n1 = (Selection) quickBetView.getBetItem().U().get(0);
                    quickBetView.a0(false);
                }
            };
            this.c0 = r1;
            Unit unit = Unit.a;
            vu90Var.f(ibsVar, r1);
        }
        M();
    }

    public final void J0() {
        Selection selection;
        if (this.A && (selection = n1) != null) {
            Market market = selection.b;
            Event event = selection.a;
            Outcome outcome = selection.c;
            boolean zU = g880.u(selection, getBetItem().w(), getBetItem().W());
            if (!qz3.f(selection) || zU) {
                getMatchOddsViewContainer().setVisibility(8);
                getStatusView().setVisibility(0);
                if (qz3.i(selection)) {
                    getStatusView().setText(sn5.c(this, R.string.component_betslip__suspended, new Object[0]));
                }
                if (qz3.j(selection) || zU) {
                    getStatusView().setText(sn5.c(this, R.string.component_betslip__unavailable, new Object[0]));
                }
                u0(false);
            } else {
                getStatusView().setVisibility(8);
                TextView matchOddsView = getMatchOddsView();
                String str = outcome.odds;
                str.getClass();
                matchOddsView.setText(gky.a.a(str, false));
                k0();
                q0();
                h0();
                l0();
                q();
                if (O().a(event.eventId, market.status, outcome)) {
                    w0(selection, true, outcome.oddsChangesFlag != 0);
                } else if (getBetItem().M() && this.C && !this.D) {
                    w0(selection, false, outcome.oddsChangesFlag != 0);
                } else {
                    d0();
                }
            }
            if (event.changeFlag || zU) {
                getWholeView().setBackgroundColor(getThemeHighlightedBgColor());
                getCloseQuickBetView().setImageResource(R.drawable.spr_quickbet_close_changed);
                getClMultipleBet().setBackgroundColor(getThemeHighlightedBgColor());
                getBoostView().setBackgroundColor(getThemeHighlightedBgColor());
            } else {
                getWholeView().setBackgroundColor(getThemeBgColor());
                getCloseQuickBetView().setImageResource(R.drawable.spr_quickbet_close);
                getClMultipleBet().setBackgroundColor(getThemeBgColor());
                getBoostView().setBackgroundColor(getThemeBgColor());
            }
            if (market.product == 1) {
                getLiveView().setVisibility(0);
            } else {
                getLiveView().setVisibility(8);
            }
            if (getEtInput().hasFocus() && getNumberKeyboardView().F()) {
                return;
            }
            y();
        }
    }

    public final void K0() {
        getBetStore().r(null);
        D0(this.C);
        String inputData = getInputData();
        boolean z = false;
        if (StringsKt.M(inputData, ",", false)) {
            inputData = fu5.a(",", inputData, ".");
        }
        u0(getSingleBetUseCase().d());
        Selection selection = n1;
        if (selection != null) {
            Outcome outcome = selection.c;
            if (qz3.b(selection)) {
                s1p s1pVarO = O();
                Event event = selection.a;
                String str = event != null ? event.eventId : null;
                Market market = selection.b;
                if (s1pVarO.a(str, market != null ? market.status : 0, outcome)) {
                    if (outcome != null && outcome.oddsChangesFlag == 0) {
                        z = true;
                    }
                    w0(selection, true, !z);
                    z0(selection, inputData);
                    return;
                }
                if (getBetItem().M() && this.C && !this.D) {
                    w0(selection, false, false);
                    z0(selection, inputData);
                    return;
                }
                d0();
                if (TextUtils.isEmpty(inputData)) {
                    BigDecimal bigDecimal = BigDecimal.ZERO;
                    bigDecimal.getClass();
                    A0(bigDecimal, bigDecimal);
                    return;
                } else {
                    BigDecimal bigDecimalMin = new BigDecimal(outcome != null ? outcome.odds : null).multiply(new BigDecimal(inputData)).min(getGetMaxWinUseCase().a());
                    bigDecimalMin.getClass();
                    A0(bigDecimalMin, new BigDecimal(inputData));
                    return;
                }
            }
        }
        BigDecimal bigDecimal2 = BigDecimal.ZERO;
        bigDecimal2.getClass();
        A0(bigDecimal2, bigDecimal2);
    }

    public final void L0() {
        ArrayList arrayListU = getBetItem().U();
        if (arrayListU.isEmpty()) {
            return;
        }
        n1 = (Selection) arrayListU.get(0);
        a0(false);
    }

    /* JADX WARN: Code duplicated, block: B:82:0x0191  */
    public final void M() {
        Event event;
        Sport sport;
        Event event2;
        Sport sport2;
        Market market;
        Event event3;
        Outcome outcome;
        String str;
        Outcome outcome2;
        Outcome outcome3;
        List<PreCannedBBOutcome> list;
        Outcome outcome4;
        Selection selection;
        String str2;
        Event event4;
        Sport sport3;
        Category category;
        Tournament tournament;
        Event event5;
        Event event6;
        Event event7;
        Event event8;
        Event event9;
        Sport sport4;
        Category category2;
        Tournament tournament2;
        getWholeView().setOnClickListener(this);
        getWholeView().setOnTouchListener(this);
        getQuickBetSlipLoading().setVisibility(8);
        getQuickBetSlipLayout().setVisibility(0);
        if (getBetItem().U().size() < 2) {
            getBetStore().q(0);
        }
        zc30 zc30Var = this.T;
        int i2 = 1;
        if (zc30Var != null && zc30Var.b) {
            getCloseQuickBetContainer().setVisibility(8);
        }
        getCloseQuickBetView().setOnClickListener(this);
        getCloseQuickBetView().setImageResource(R.drawable.spr_quickbet_close);
        getNeverDownItemControl().setCheckBoxListener(new View.OnClickListener() { // from class: xd30
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                QuickBetView.r0(this.a);
            }
        });
        getNeverDownItemControl().setInfoClickListener(new xv2(this, i2));
        TextView textView = (TextView) findViewById(R.id.match_outcome_desc);
        TextView textView2 = (TextView) findViewById(R.id.team_name_info);
        TextView textView3 = (TextView) findViewById(R.id.game_id);
        SettleDelayHint settleDelayHint = (SettleDelayHint) findViewById(R.id.delay_info_hint);
        String str3 = null;
        try {
            Selection selection2 = n1;
            settleDelayHint.setVisibility(kgb0.a.contains((selection2 == null || (event9 = selection2.a) == null || (sport4 = event9.sport) == null || (category2 = sport4.category) == null || (tournament2 = category2.tournament) == null) ? null : tournament2.id) ? 0 : 8);
        } catch (Exception unused) {
        }
        if (this.F.hasRate(getBetItem().m0())) {
            getPotentialTaxWinLayout().setVisibility(!P() ? 0 : 8);
            getPotentialWinTitle().setText(sn5.c(this, R.string.component_betslip__to_win, new Object[0]));
        } else {
            getPotentialTaxWinLayout().setVisibility(8);
            getPotentialWinTitle().setText(sn5.c(this, R.string.component_betslip__pot_win, new Object[0]));
        }
        j7g j7gVar = new j7g();
        try {
            Selection selection3 = n1;
            String str4 = (selection3 == null || (event8 = selection3.a) == null) ? null : event8.eventId;
            if (str4 == null) {
                str4 = "";
            }
            if (b3.T(str4)) {
                selection = n1;
                if (selection != null || (event4 = selection.a) == null || (sport3 = event4.sport) == null || (category = sport3.category) == null || (tournament = category.tournament) == null) {
                    str2 = null;
                } else {
                    str2 = tournament.name;
                }
                j7gVar = new j7g(str2);
            } else {
                Selection selection4 = n1;
                String str5 = (selection4 == null || (event7 = selection4.a) == null) ? null : event7.eventId;
                if (str5 == null) {
                    str5 = "";
                }
                if (b3.U(str5)) {
                    selection = n1;
                    if (selection != null) {
                        str2 = null;
                    } else {
                        str2 = null;
                    }
                    j7gVar = new j7g(str2);
                } else {
                    Context context = getContext();
                    context.getClass();
                    String strB = sn5.b(context, R.string.bet_history__vs, new Object[0]);
                    Selection selection5 = n1;
                    j7g j7gVar2 = new j7g((selection5 == null || (event6 = selection5.a) == null) ? null : event6.homeTeamName);
                    j7gVar2.a(" ");
                    j7gVar2.e(Color.parseColor("#8b8e9b"), strB);
                    j7gVar2.a(" ");
                    Selection selection6 = n1;
                    j7gVar2.a((selection6 == null || (event5 = selection6.a) == null) ? null : event5.awayTeamName);
                    j7gVar = j7gVar2;
                }
            }
        } catch (Exception unused2) {
        }
        Selection selection7 = n1;
        if ((selection7 != null ? selection7.c : null) == null || selection7 == null || (outcome3 = selection7.c) == null || (list = outcome3.childOutcomes) == null || !list.isEmpty()) {
            textView.setText(sn5.c(this, R.string.bet_builder__bet_builder, new Object[0]));
        } else {
            Selection selection8 = n1;
            textView.setText((selection8 == null || (outcome4 = selection8.c) == null) ? null : outcome4.desc);
        }
        Selection selection9 = n1;
        if (selection9 == null || (outcome2 = selection9.c) == null || !outcome2.isJokerOutcome()) {
            lfb0 lfb0VarD = lfb0.d();
            Selection selection10 = n1;
            if (lfb0VarD.e((selection10 == null || (event2 = selection10.a) == null || (sport2 = event2.sport) == null) ? null : sport2.id) != null) {
                textView.getClass();
                lfb0 lfb0VarD2 = lfb0.d();
                Selection selection11 = n1;
                mfb0 mfb0VarE = lfb0VarD2.e((selection11 == null || (event = selection11.a) == null || (sport = event.sport) == null) ? null : sport.id);
                j0(textView, mfb0VarE != null ? mfb0VarE.d() : null);
            } else {
                textView.getClass();
                j0(textView, getContext().getDrawable(R.drawable.ic_sport_default));
            }
        } else {
            textView.getClass();
            j0(textView, gr0.a(hp0.A, R.drawable.ic_joker_20dp));
        }
        k0();
        getOneTwoUpItemControl().getSwitchView().setOnStateChangedListener(new hf30(this));
        getOneTwoUpItemControl().getCheckBoxView().setCheckBoxListener(new View.OnClickListener() { // from class: id30
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                QuickBetView.p0(this.a);
            }
        });
        q0();
        getEarlyPayoutItemControl().setCheckBoxListener(new View.OnClickListener() { // from class: zd30
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                QuickBetView.g0(this.a);
            }
        });
        h0();
        l0();
        textView2.setText(j7gVar);
        TextView matchOddsView = getMatchOddsView();
        Selection selection12 = n1;
        matchOddsView.setText((selection12 == null || (outcome = selection12.c) == null || (str = outcome.odds) == null) ? null : gky.a.a(str, false));
        q();
        getCurrencyView().setText(m1);
        Selection selection13 = n1;
        if (selection13 != null && (event3 = selection13.a) != null) {
            str3 = event3.gameId;
        }
        if (str3 == null) {
            str3 = "";
        }
        textView3.setText(str3);
        Selection selection14 = n1;
        if (selection14 == null || (market = selection14.b) == null || market.product != 1) {
            getLiveView().setVisibility(8);
        } else {
            getLiveView().setVisibility(0);
        }
        findViewById(R.id.delete).setOnClickListener(this);
        getBoostView().setOnClickListener(this);
        if (getBetItem().M()) {
            RotateAnimation rotateAnimation = new RotateAnimation(0.0f, 90.0f, 1, 1.0f, 1, 0.8f);
            rotateAnimation.setFillAfter(true);
            rotateAnimation.setDuration(1000L);
            rotateAnimation.setInterpolator(new LinearInterpolator());
            getRotateClockView().startAnimation(rotateAnimation);
        }
        SelectedGiftData selectedGiftData = getSingleGiftState().C;
        setGiftsContainerText(sn5.c(this, R.string.gift__l_gift, new Object[0]));
        getTvGift().setOnClickListener(new cf30(this));
        getGiftCheckbox().setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: ae30
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                QuickBetView quickBetView = this.a;
                if (quickBetView.N) {
                    return;
                }
                quickBetView.V(z);
            }
        });
        getGoToDepositBtn().setOnClickListener(new View.OnClickListener() { // from class: qd30
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                boolean z = QuickBetView.j1;
                this.a.getPaymentNavigator().b(null);
            }
        });
        getAcceptChangesBtn().setOnClickListener(this);
        getPlaceBetBtnLayout().setOnClickListener(this);
        getNumberKeyboardView().setOnValueChangeListener(this);
        getNumberKeyboardView().setOnDoneButtonClickListener(new View.OnClickListener() { // from class: rd30
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                boolean z = QuickBetView.j1;
                QuickBetView quickBetView = this.a;
                quickBetView.getBetStore().Q(null);
                quickBetView.P = true;
                quickBetView.getSingleGiftState().D = null;
                yyk yykVar = quickBetView.i0;
                if (yykVar != null) {
                    yykVar.E1();
                }
                quickBetView.y();
            }
        });
        String str6 = getBetStore().e0().a;
        str6.getClass();
        SelectedGiftData selectedGiftData2 = getSingleGiftState().C;
        if (selectedGiftData2 != null && selectedGiftData2.getChecked() && selectedGiftData2.getAddToStake()) {
            try {
                BigDecimal bigDecimal = new BigDecimal(str6);
                BigDecimal bigDecimal2 = new BigDecimal(selectedGiftData2.getGiftValue());
                if (bigDecimal.subtract(bigDecimal2).compareTo(BigDecimal.ZERO) > 0) {
                    String string = bigDecimal.subtract(bigDecimal2).toString();
                    string.getClass();
                    str6 = string;
                }
            } catch (Exception e2) {
                itf0.a aVar = itf0.a;
                aVar.q(MyLog.TAG_QUICK_BET);
                aVar.a("restoreStakeWithOutGiftValue exception: %s", e2.toString());
                Pair pair = new Pair("stake", str6);
                String giftValue = selectedGiftData2.getGiftValue();
                if (giftValue == null) {
                    giftValue = "";
                }
                w950.a("QuickBetView", "restoreStakeWithOutGiftValue", e2, kotlin.collections.b.l(pair, new Pair("giftValue", giftValue)));
            }
        }
        o1 = str6;
        getBetStore().O(n1, o1);
        getBetStore().c0(n1);
        String str7 = o1;
        setInputData(str7 != null ? str7 : "");
        if (iw2.b()) {
            getNumberKeyboardView().setVisibility(8);
            getEtInput().setVisibility(8);
            getAdditionalMsg().setVisibility(8);
            getGoToDepositBtn().setVisibility(8);
        } else {
            getEtInput().setVisibility(0);
            EditText etInput = getEtInput();
            InputFilter.LengthFilter lengthFilter = new InputFilter.LengthFilter(getGetMaxStakeUseCase().a().toPlainString().length());
            AccountHelperEntryPointImpl accountHelperEntryPointImpl = yrh0.a;
            etInput.setFilters(new InputFilter[]{lengthFilter, new rrh0()});
            getEtInput().setHint(sn5.c(this, R.string.component_betslip__min_vstake, b6y.b(getGetMinStakeUseCase().a())));
            getEtInput().setCursorVisible(false);
            getEtInput().setLongClickable(false);
            getEtInput().setTextIsSelectable(false);
            getEtInput().setImeOptions(268435456);
            getEtInput().setOnTouchListener(new View.OnTouchListener() { // from class: je30
                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(View view, MotionEvent motionEvent) {
                    QuickBetView.K(this.a, motionEvent);
                    return false;
                }
            });
            Class cls = Boolean.TYPE;
            try {
                Method method = EditText.class.getMethod("setShowSoftInputOnFocus", cls);
                method.setAccessible(true);
                method.invoke(getEtInput(), Boolean.FALSE);
            } catch (Exception unused3) {
            }
            try {
                Method method2 = EditText.class.getMethod("setSoftInputShownOnFocus", cls);
                method2.setAccessible(true);
                method2.invoke(getEtInput(), Boolean.FALSE);
            } catch (Exception unused4) {
            }
            getEtInput().setCustomSelectionActionModeCallback(new af30());
            Context context2 = getContext();
            context2.getClass();
            String strA = pk2.a(context2, getInputData());
            if (TextUtils.isEmpty(strA)) {
                f0(0, strA);
            }
        }
        K0();
        R0();
        View viewFindViewById = findViewById(R.id.sportycoin_selection);
        TextView textView4 = (TextView) findViewById(R.id.sportycoin_value);
        AssetsInfo assetsInfoC = getAssetsInfoRepository().c();
        if (getAccountHelper().getAccount() == null || assetsInfoC == null || assetsInfoC.coins == 0) {
            l1 = true;
            viewFindViewById.setVisibility(8);
        } else {
            viewFindViewById.setVisibility(0);
            j7g j7gVar3 = new j7g(sn5.c(this, R.string.component_betslip__sportycoins_usable, new Object[0]));
            j7gVar3.e(getContext().getColor(R.color.brand_secondary), oxc.a(m1, " ", bjb0.U(assetsInfoC.coins, Locale.US)));
            textView4.setText(j7gVar3);
            S0();
            getToggleSportyCoins().setOnClickListener(new pv2(this, i2));
            getToggleBalance().setOnClickListener(new View.OnClickListener() { // from class: sd30
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    QuickBetView.l1 = true;
                    this.a.S0();
                }
            });
        }
        if (getAccountHelper().isLogin()) {
            m0();
            getAccountHelper().addAccountChangeListener(this);
            this.P = true;
            yyk yykVar = this.i0;
            if (yykVar != null) {
                yykVar.E1();
            }
        } else {
            x();
            getSingleGiftState().b = 0;
        }
        this.A = true;
        a0(false);
        TranslateAnimation translateAnimation = new TranslateAnimation(1, 0.0f, 1, 0.0f, 2, 0.0f, 2, 0.2f);
        this.translate = translateAnimation;
        translateAnimation.setDuration(250L);
        Animation animation = this.translate;
        if (animation != null) {
            animation.setAnimationListener(new df30(this));
        }
        zc30 zc30Var2 = this.T;
        if ((zc30Var2 != null && zc30Var2.a) || getBetItem().D()) {
            v0();
        }
        if (getBetItem().D()) {
            getCloseQuickBetContainer().setVisibility(8);
            getBetSlipTitleText().setText(sn5.c(getBetSlipTitleText(), R.string.common_functions__edit_bet, new Object[0]));
        }
        Q0();
        if (getBetItem().m0()) {
            setMultipleModeUI();
            setPlaceBetBtn(true);
        }
        if (!getCountryManager().p()) {
            getFullWinLayout().setVisibility(8);
        } else {
            getPotentialWinTitle().setText(sn5.c(getPotentialWinTitle(), R.string.component_betslip__net_amount, new Object[0]));
            getPotentialTaxTitle().setText(StringsKt.t0(sn5.c(getPotentialWinTitle(), R.string.component_betslip__winnings_tax, Integer.valueOf(this.F.getRateAsPercentage(getBetItem().m0())))).toString());
        }
    }

    public final void M0(boolean z) {
        getNeverDownItemControl().setVisibility(z ? 0 : 8);
        int iA = bqe.a(z ? 24.0f : 4.0f);
        LinearLayout linearLayout = getBinding().R;
        ViewGroup.LayoutParams layoutParams = getBinding().R.getLayoutParams();
        layoutParams.height = iA;
        linearLayout.setLayoutParams(layoutParams);
    }

    public final boolean N() {
        WeakReference<Activity> weakReference = this.f;
        Activity activity = weakReference != null ? weakReference.get() : null;
        return activity == null || activity.isFinishing();
    }

    public final void N0() {
        Selection selection;
        if (this.A && (selection = n1) != null) {
            Event event = selection.a;
            Outcome outcome = selection.c;
            boolean zU = g880.u(selection, getBetItem().w(), getBetItem().W());
            if (!qz3.f(selection) || zU) {
                d0();
                getMatchOddsLeftIcon().setVisibility(8);
                getMatchOddsLeftIcon().setImageDrawable(null);
                getMatchOddsViewContainer().setVisibility(8);
                getStatusView().setVisibility(0);
                if (qz3.i(selection)) {
                    getStatusView().setText(sn5.c(this, R.string.component_betslip__suspended, new Object[0]));
                }
                if (qz3.j(selection) || zU) {
                    getStatusView().setText(sn5.c(this, R.string.component_betslip__unavailable, new Object[0]));
                }
            } else {
                getMatchOddsViewContainer().setVisibility(0);
                getStatusView().setVisibility(8);
                TextView matchOddsView = getMatchOddsView();
                String str = outcome.odds;
                str.getClass();
                matchOddsView.setText(gky.a.a(str, false));
                k0();
                q0();
                h0();
                l0();
                q();
                if (O().a(event.eventId, selection.b.status, outcome)) {
                    w0(selection, true, outcome.oddsChangesFlag != 0);
                } else if (getBetItem().M() && this.C && !this.D) {
                    w0(selection, false, outcome.oddsChangesFlag != 0);
                } else {
                    d0();
                }
            }
            if ((event == null || !event.changeFlag) && !zU) {
                getWholeView().setBackgroundColor(getThemeBgColor());
                getCloseQuickBetView().setImageResource(R.drawable.spr_quickbet_close);
                getClMultipleBet().setBackgroundColor(getThemeBgColor());
                getBoostView().setBackgroundColor(getThemeBgColor());
            } else {
                getWholeView().setBackgroundColor(getThemeHighlightedBgColor());
                getCloseQuickBetView().setImageResource(R.drawable.spr_quickbet_close_changed);
                getClMultipleBet().setBackgroundColor(getThemeHighlightedBgColor());
                getBoostView().setBackgroundColor(getThemeHighlightedBgColor());
            }
            if (n1.b.product == 1) {
                getLiveView().setVisibility(0);
            } else {
                getLiveView().setVisibility(8);
            }
        }
    }

    public final s1p O() {
        s1p s1pVar = this.isLfbBoostEligibleUseCase;
        if (s1pVar != null) {
            return s1pVar;
        }
        Intrinsics.n("isLfbBoostEligibleUseCase");
        throw null;
    }

    public final void O0() {
        BigDecimal bigDecimalG;
        String plainString;
        BigDecimal bigDecimalG2;
        SelectedGiftData selectedGiftData = getSingleGiftState().C;
        zd2<String> zd2Var = this.W;
        if (selectedGiftData == null) {
            String str = !TextUtils.isEmpty(o1) ? o1 : "0";
            p1 = str;
            if (str != null && str.length() != 0) {
                String str2 = p1;
                if (str2 == null || (bigDecimalG = kotlin.text.b.g(str2)) == null) {
                    bigDecimalG = BigDecimal.ZERO;
                }
                if (bigDecimalG.compareTo(BigDecimal.ZERO) < 0) {
                    p1 = "0";
                }
            }
            C();
            String str3 = p1;
            zd2Var.onNext(str3 != null ? str3 : "");
            return;
        }
        String giftValue = selectedGiftData.getGiftValue();
        if (!TextUtils.isEmpty(giftValue)) {
            getSingleGiftState().c = giftValue;
        }
        getSingleGiftState().d = selectedGiftData.getGiftId();
        getSingleGiftState().e = selectedGiftData.getGiftKind();
        getSingleGiftState().f = selectedGiftData.getGiftLimit();
        getSingleGiftState().i = selectedGiftData.getChecked();
        GiftDetails rawGift = selectedGiftData.getRawGift();
        if (rawGift != null) {
            up3 singleGiftState = getSingleGiftState();
            List<Integer> betTypeScopes = rawGift.getBetTypeScopes();
            singleGiftState.getClass();
            betTypeScopes.getClass();
            singleGiftState.w = betTypeScopes;
            getSingleGiftState().y = rawGift.getUpTypes();
            getSingleGiftState().z = rawGift.getEarlyGoalsType();
            getSingleGiftState().A = rawGift.getBetBuilderTypes();
            getSingleGiftState().B = Integer.valueOf(rawGift.getPrematchOrLive());
        }
        o0(selectedGiftData, getSingleGiftState().D);
        String str4 = getSingleGiftState().c;
        String str5 = o1;
        if (str5 == null || str5.length() == 0) {
            plainString = "0";
        } else if (!selectedGiftData.getChecked() || str4 == null || str4.length() == 0 || StringsKt.M(str4, GiftUtil.CLEARED_GIFT_VALUE, false)) {
            plainString = o1;
        } else {
            String str6 = o1;
            BigDecimal bigDecimal = str6 != null ? new BigDecimal(str6) : BigDecimal.ZERO;
            bigDecimal.getClass();
            BigDecimal bigDecimalSubtract = bigDecimal.subtract(new BigDecimal(str4));
            bigDecimalSubtract.getClass();
            plainString = bigDecimalSubtract.toPlainString();
        }
        p1 = plainString;
        if (plainString != null && plainString.length() != 0) {
            String str7 = p1;
            if (str7 == null || (bigDecimalG2 = kotlin.text.b.g(str7)) == null) {
                bigDecimalG2 = BigDecimal.ZERO;
            }
            if (bigDecimalG2.compareTo(BigDecimal.ZERO) < 0) {
                p1 = "0";
            }
        }
        C();
        String str8 = p1;
        zd2Var.onNext(str8 != null ? str8 : "");
    }

    public final boolean P() {
        return getClMultipleBet().getVisibility() == 0;
    }

    /* JADX WARN: Code duplicated, block: B:80:0x01ac  */
    public final void P0(List list, List list2, long j, j980 j980Var, boolean z) {
        boolean z2;
        fj2 fj2Var;
        Iterator it;
        boolean z3;
        j980Var = j980Var;
        list.getClass();
        list2.getClass();
        ArrayList arrayList = new ArrayList();
        LinkedHashMap linkedHashMapA = apg.a(list);
        Iterator it2 = list.iterator();
        while (true) {
            boolean z4 = true;
            if (!it2.hasNext()) {
                break;
            }
            Event event = (Event) it2.next();
            if (event.markets == null || event.isBetBuilderChild()) {
                it = it2;
                it2 = it;
                break;
            }
            ArrayList arrayList2 = new ArrayList();
            for (Market market : event.markets) {
                if (market != null) {
                    if (Collections.frequency(event.markets, market) <= 1) {
                        arrayList2.add(market);
                    } else if (market.product == 1) {
                        arrayList2.add(market);
                    }
                }
            }
            int size = arrayList2.size();
            int i2 = 0;
            while (i2 < size) {
                i2++;
                Market market2 = (Market) arrayList2.get(i2);
                List<Outcome> list3 = market2.outcomes;
                if (list3 == null || list3.isEmpty()) {
                    it = it2;
                    ArrayList arrayList3 = arrayList2;
                    boolean z5 = z4;
                    int i3 = size;
                    if (getBetItem().f(event, market2, z5)) {
                        it2 = it;
                        break;
                        break;
                    } else {
                        z4 = z5;
                        size = i3;
                        it2 = it;
                        arrayList2 = arrayList3;
                    }
                } else {
                    for (Outcome outcome : list3) {
                        Selection selection = new Selection(event, market2, outcome, (List) linkedHashMapA.get(market2.id));
                        if (Intrinsics.g(market2.id, "1") && qvy.b(market2) != null) {
                            lrm betStore = getBetStore();
                            String str = outcome.odds;
                            str.getClass();
                            betStore.T(selection, str);
                        }
                        arrayList.add(selection);
                        ArrayList arrayListU = getBetItem().U();
                        int size2 = arrayListU.size();
                        int i4 = 0;
                        while (i4 < size2) {
                            i4++;
                            Selection selection2 = (Selection) arrayListU.get(i4);
                            ww2 betOddsUseCases = getBetOddsUseCases();
                            z4 = z4;
                            Market market3 = selection2.b;
                            Outcome outcome2 = selection2.c;
                            market3.getClass();
                            betOddsUseCases.getClass();
                            it2 = it2;
                            arrayList2 = arrayList2;
                            boolean zA = ww2.a(market3, market2, j);
                            Selection selectionE = g880.e(selection2, list2);
                            size2 = size2;
                            boolean zA2 = mkf.a(selection2, selection, selectionE, (j980Var == null || !j980Var.a) ? false : z4, (j980Var == null || !j980Var.b) ? false : z4, (j980Var == null || !j980Var.c) ? false : z4);
                            Selection selection3 = selection;
                            if ((!selection2.equals(selection3) || zA) && !zA2) {
                                selection = selection3;
                            } else {
                                int iCompareTo = new BigDecimal(outcome.odds).compareTo(new BigDecimal(outcome2.odds));
                                outcome.oddsChangesFlag = iCompareTo;
                                if (iCompareTo != 0) {
                                    itf0.a aVar = itf0.a;
                                    aVar.q(MyLog.TAG_ODDS_UPDATE);
                                    aVar.a("odds = " + outcome.odds + ", prob = " + outcome.probability, new Object[0]);
                                }
                                if (outcome.desc == null) {
                                    outcome.desc = outcome2.desc;
                                }
                                int i5 = selection2.b.status;
                                int i6 = market2.status;
                                if (i5 == 0) {
                                    if (i5 == i6 && outcome2.isActive == outcome.isActive && outcome.oddsChangesFlag == 0) {
                                        z3 = false;
                                    } else {
                                        k1 = z4;
                                        z3 = z4;
                                    }
                                } else if (i6 == 0 || (i6 == 3 && i5 != 3)) {
                                    k1 = z4;
                                    z3 = z4;
                                } else {
                                    z3 = false;
                                }
                                if (zA2) {
                                    k1 = z4;
                                }
                                event.changeFlag = z3;
                                getBetItem().N0(event, market2, outcome, true, (14336 & 16) != 0 ? false : false, (14336 & 32) != 0 ? null : (List) linkedHashMapA.get(market2.id), (14336 & 64) != 0 ? k980.DEFAULT : k980.DEFAULT, (14336 & 128) != 0 ? false : false, (14336 & 256) != 0 ? false : false, (14336 & 512) != 0 ? false : zA2, (14336 & 1024) != 0 ? null : selectionE, (14336 & 2048) != 0 ? false : false, (14336 & 4096) != 0 ? false : false, false);
                                selection = selection3;
                                size = size;
                            }
                        }
                        j980Var = j980Var;
                    }
                }
            }
        }
        if (getBetItem().m0()) {
            getBetItem().b1();
        }
        if (z && getBetItem().V() && this.b0 != null) {
            ArrayList arrayList4 = new ArrayList(getBetItem().U());
            int size3 = arrayList4.size();
            int i7 = 0;
            while (i7 < size3) {
                Object obj = arrayList4.get(i7);
                i7++;
                Selection selection4 = (Selection) obj;
                if (selection4.a(arrayList) && (fj2Var = this.b0) != null) {
                    fj2Var.y1(g880.y(selection4, arrayList), false);
                }
            }
        }
        if (getBetItem().U().isEmpty()) {
            z2 = false;
        } else {
            z2 = false;
            n1 = (Selection) getBetItem().U().get(0);
        }
        if (j980Var != null) {
            getBetItem().P(this);
        }
        a0(j980Var != null ? true : z2);
    }

    public final ibs Q() {
        ibs ibsVar = this.o0;
        if (ibsVar != null) {
            return ibsVar;
        }
        ibs ibsVarB = ll5.b(this);
        this.o0 = ibsVarB;
        return ibsVarB;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0031  */
    public final void Q0() {
        boolean z;
        zc30 zc30Var = this.T;
        if (zc30Var != null) {
            z = zc30Var.c && getClMultipleBet().getVisibility() == 8 && getBetItem().m0() && SimShareData.INSTANCE.isAutoBetEnabled() && !getSingleGiftState().i;
        }
        getSimulateAutoBetPanel().setVisibility(z ? 0 : 8);
        if (z) {
            getSimulateAutoBetPanel().setAutoBetTimesListener(new gd30());
            SimulateAutoBetPanel simulateAutoBetPanel = getSimulateAutoBetPanel();
            SimShareData simShareData = SimShareData.INSTANCE;
            simulateAutoBetPanel.G = simShareData.getAutoBetMaxTimes();
            getSimulateAutoBetPanel().E(simShareData.getAutoBetTimes());
        }
    }

    public final void R0() {
        if (!qz3.b(n1)) {
            getEtInput().setEnabled(false);
            f0(0, "");
            return;
        }
        getEtInput().setEnabled(true);
        cvd0 cvd0VarF = getSingleBetUseCase().f();
        UiText uiTextA = fvd0.a(cvd0VarF, true, getCountryManager().f());
        Context context = getContext();
        context.getClass();
        uiTextA.getClass();
        String string = uiTextA.e(context).toString();
        if (TextUtils.isEmpty(string)) {
            f0(0, string);
        } else {
            f0(c8i0.d(R.color.warning_primary, getEtInput()), string);
            getEtInput().setActivated(true);
        }
        c8i0.o(getGoToDepositBtn(), cvd0VarF instanceof cvd0.c);
        u0(cvd0VarF instanceof cvd0.e);
    }

    public final void S0() {
        if (l1) {
            getToggleBalance().setImageResource(R.drawable.spr_green_annulus);
            getToggleSportyCoins().setImageResource(R.drawable.spr_white_circle);
        } else {
            getToggleBalance().setImageResource(R.drawable.spr_white_circle);
            getToggleSportyCoins().setImageResource(R.drawable.spr_green_annulus);
        }
    }

    @Override // nzm.a
    public final void T() {
        getEtInput().setHint(sn5.c(this, R.string.page_payment__min_vnum, b6y.b(getGetMinStakeUseCase().a())));
        getCurrencyView().setText(getCountryManager().f());
        if (getBetItem().m0()) {
            xxw xxwVar = izw.a;
            if (xxwVar.a().r() && n1 != null) {
                String strJ = getStakeConfigAgent().j();
                o1 = strJ;
                strJ.getClass();
                setInputData(strJ);
                Context context = getContext();
                context.getClass();
                getBetStore().i(new imn(0L, strJ, pk2.a(context, strJ)));
                getBetStore().O(n1, strJ);
                K0();
                R0();
                xxwVar.a().d(false);
            }
        }
    }

    public final void V(boolean z) {
        yyk yykVar;
        SelectedGiftData selectedGiftDataCopy;
        try {
            SelectedGiftData selectedGiftData = getSingleGiftState().C;
            setAllGiftStateChecked(z);
            Q0();
            String inputData = getInputData();
            if (!z) {
                selectedGiftDataCopy = selectedGiftData != null ? selectedGiftData.copy(selectedGiftData.getGiftValue(), selectedGiftData.getGiftKind(), selectedGiftData.getGiftId(), selectedGiftData.getGiftLimit(), selectedGiftData.getGiftCount(), selectedGiftData.getRawGift(), (TextUtils.isEmpty(inputData) || selectedGiftData == null || !selectedGiftData.getAddToStake()) ? false : true, false, selectedGiftData.getUserSelect(), selectedGiftData.getTotalStake()) : null;
                getSingleGiftState().D = selectedGiftData;
                getSingleGiftState().b(selectedGiftDataCopy);
                getSingleGiftState().i = false;
                if (TextUtils.isEmpty(inputData)) {
                    return;
                }
                this.P = true;
                yyk yykVar2 = this.i0;
                if (yykVar2 != null) {
                    yykVar2.E1();
                    return;
                }
                return;
            }
            if (TextUtils.equals(GiftUtil.CLEARED_GIFT_VALUE, selectedGiftData != null ? selectedGiftData.getGiftValue() : null)) {
                yyk yykVar3 = this.i0;
                if (yykVar3 != null) {
                    yykVar3.F1(true);
                    return;
                }
                return;
            }
            selectedGiftDataCopy = selectedGiftData != null ? selectedGiftData.copy(selectedGiftData.getGiftValue(), selectedGiftData.getGiftKind(), selectedGiftData.getGiftId(), selectedGiftData.getGiftLimit(), selectedGiftData.getGiftCount(), selectedGiftData.getRawGift(), (TextUtils.isEmpty(inputData) || selectedGiftData == null || !selectedGiftData.getAddToStake()) ? false : true, true, selectedGiftData.getUserSelect(), selectedGiftData.getTotalStake()) : null;
            getSingleGiftState().D = selectedGiftData;
            getSingleGiftState().b(selectedGiftDataCopy);
            getSingleGiftState().i = true;
            if (TextUtils.isEmpty(inputData)) {
                return;
            }
            this.P = true;
            yyk yykVar4 = this.i0;
            if (yykVar4 != null) {
                yykVar4.E1();
            }
        } catch (Exception e2) {
            if (z && (yykVar = this.i0) != null) {
                yykVar.F1(true);
            }
            itf0.a aVar = itf0.a;
            aVar.q(MyLog.TAG_QUICK_BET);
            aVar.c(e2, "[onCheckedGift] error", new Object[0]);
        }
    }

    public final void Y() {
        fj2 fj2Var;
        vu90 vu90Var;
        H0();
        I0();
        if (this.e != null) {
            getBoostView().removeCallbacks(this.e);
        }
        this.R.d();
        getAccountHelper().removeAccountChangeListener(this);
        getBetItem().z1(this, this.i1);
        getStakeConfigAgent().d(this);
        ee30 ee30Var = this.c0;
        if (ee30Var == null || (fj2Var = this.b0) == null || (vu90Var = fj2Var.w) == null) {
            return;
        }
        vu90Var.k(ee30Var);
    }

    public final void Z(OrderWithFailUpdate orderWithFailUpdate, ng10 ng10Var) {
        String strL;
        yyk yykVar;
        bsy bsyVar;
        bsy bsyVar2;
        tf30 tf30Var;
        Market market;
        Event event;
        if (ng10Var.c.compareAndSet(false, true)) {
            this.f1 = false;
            this.g1 = false;
            getAssetsInfoRepository().g();
            Intent intent = new Intent();
            intent.setAction("update_openbet_count");
            fdt.a(hp0.A).c(intent);
            this.isPlaceBetSuccess = true;
            u0(false);
            orderWithFailUpdate.totalStake = fu5.a(",", getInputData(), "");
            if (TextUtils.isEmpty(p1)) {
                p1 = "0";
            }
            try {
                strL = bjb0.L(this.F.getRealSportTaxConfig().getExciseTax(new BigDecimal(Double.toString(new BigDecimal(p1).doubleValue()))), Locale.US);
            } catch (Exception unused) {
                strL = "0.00";
            }
            orderWithFailUpdate.exciseTax = strL;
            if (getBetItem().V()) {
                f00 f00Var = vgb0.a;
                vgb0.a(AnalyticsEvent.BET_BUILDER_PLACED);
            }
            s1p s1pVarO = O();
            Selection selection = n1;
            if (s1pVarO.a((selection == null || (event = selection.a) == null) ? null : event.eventId, (selection == null || (market = selection.b) == null) ? 0 : market.status, selection != null ? selection.c : null) && (tf30Var = this.d0) != null) {
                tf30Var.N.f();
                ej5.c(o8i0.d(tf30Var), null, null, new rf30(tf30Var, null), 3);
            }
            if (getBetItem().v0() && (bsyVar2 = this.e0) != null) {
                bsyVar2.H1(1);
            }
            if (getBetItem().t1() && (bsyVar = this.e0) != null) {
                bsyVar.I1(1);
            }
            getBetSlipMarketingDomainService().f(true);
            boolean zE = getBetItem().e();
            tf30 tf30Var2 = this.d0;
            if (tf30Var2 != null) {
                tf30Var2.G1();
            }
            w(this, 1);
            ((br3) mmc.a(hp0.A, br3.class)).U().f(true);
            String str = orderWithFailUpdate.favorAmount;
            if (str != null && !TextUtils.isEmpty(str) && (yykVar = this.i0) != null) {
                ej5.c(o8i0.d(yykVar), yykVar.a, null, new pyk(yykVar, true, null), 2);
            }
            j990 shouldShowUniqueCodeInfoSheetUseCase = getShouldShowUniqueCodeInfoSheetUseCase();
            shouldShowUniqueCodeInfoSheetUseCase.getClass();
            if (((Boolean) dj5.a(kotlin.coroutines.e.a, new i990(shouldShowUniqueCodeInfoSheetUseCase, null))).booleanValue()) {
                bf30 bf30Var = new bf30(this, orderWithFailUpdate, zE);
                WeakReference<Activity> weakReference = this.f;
                Activity activity = weakReference != null ? weakReference.get() : null;
                if (activity != null && !activity.isFinishing() && (activity instanceof androidx.fragment.app.e)) {
                    FragmentManager supportFragmentManager = ((androidx.fragment.app.e) activity).getSupportFragmentManager();
                    supportFragmentManager.getClass();
                    new eeh0(bf30Var).show(supportFragmentManager, "UniqueBookingCodeInfoBottomSheetDialog");
                }
            } else {
                t0(orderWithFailUpdate, zE);
            }
            Intent intent2 = new Intent("ACTION_PLACE_BET_OR_CASH_OUT");
            intent2.putExtra("EXTRA_ACTION_TYPE", 0);
            fdt.a(getContext()).c(intent2);
            getBetStore().i(null);
            ibs ibsVarQ = Q();
            if (ibsVarQ == null) {
                return;
            }
            ej5.c(ebs.a(ibsVarQ.getLifecycle()), null, null, new f(ng10Var, this, orderWithFailUpdate, null), 3);
        }
    }

    @Override // com.sportybet.plugin.realsports.betslip.virtualkeyboard.KeyboardView.b
    public final void a() {
        f0(0, "");
        C();
        o1 = getInputData();
        getBetStore().i(new imn(0L, o1, ""));
        if (n1 != null) {
            getBetStore().O(n1, o1);
        }
        R0();
        K0();
    }

    public final void a0(boolean z) {
        aj90 aj90Var;
        Outcome outcome;
        Event event;
        Market market;
        if (this.A) {
            if (!k1 || this.v) {
                J0();
                if (getBetItem().m0() && (aj90Var = this.k0) != null) {
                    aj90Var.y1();
                }
            } else {
                if (z) {
                    k1 = false;
                    j1 = false;
                    Selection selection = n1;
                    if (selection == null || (market = selection.b) == null || market.status != 3) {
                        if (selection != null && (event = selection.a) != null) {
                            event.changeFlag = false;
                        }
                        if (selection != null && (outcome = selection.c) != null) {
                            outcome.oddsChangesFlag = 0;
                        }
                    }
                }
                N0();
                v();
                D0(this.C);
                getBetMutexDataInstance().B();
                boolean zIsEmpty = q1.isEmpty();
                boolean zU = g880.u(n1, getBetItem().w(), getBetItem().W());
                if (!zIsEmpty || zU) {
                    getWholeView().setBackgroundColor(getThemeHighlightedBgColor());
                    getCloseQuickBetView().setImageResource(R.drawable.spr_quickbet_close_changed);
                    getClMultipleBet().setBackgroundColor(getThemeHighlightedBgColor());
                } else {
                    getWholeView().setBackgroundColor(getThemeBgColor());
                    getCloseQuickBetView().setImageResource(R.drawable.spr_quickbet_close);
                    getClMultipleBet().setBackgroundColor(getThemeBgColor());
                }
                int size = getBetMutexDataInstance().s().keySet().size();
                getTvMultipleDoubleValue().setText(B(size, getBetMutexDataInstance().P()));
                BigDecimal bigDecimal = this.L;
                BigDecimal bigDecimal2 = BigDecimal.ZERO;
                if (bigDecimal.compareTo(bigDecimal2) != 0 && !getBetItem().D()) {
                    BigDecimal bigDecimalA = A(size);
                    if (bigDecimalA.compareTo(this.L) > 0) {
                        i0(getTvMultipleDoubleValue(), R.drawable.spr_ic_arrow_upward_black_24dp, getContext().getColor(R.color.brand_secondary));
                    } else if (bigDecimalA.compareTo(this.L) < 0) {
                        i0(getTvMultipleDoubleValue(), R.drawable.spr_ic_arrow_downward_black_24dp, getContext().getColor(R.color.warning_primary));
                    }
                    if (bigDecimalA.compareTo(bigDecimal2) != 0) {
                        this.L = bigDecimalA;
                    }
                }
                setConfirmPageVisibility(false);
                u0(!j1);
                K0();
                if (getBetItem().m0()) {
                    aj90 aj90Var2 = this.k0;
                    if (aj90Var2 != null) {
                        aj90Var2.y1();
                    }
                } else {
                    yyk yykVar = this.i0;
                    if (yykVar != null) {
                        yykVar.F1(true);
                    }
                }
            }
            getAdditionalMsg().setVisibility((TextUtils.isEmpty(getAdditionalMsg().getText()) || getBetItem().U().size() != 1 || iw2.b()) ? 8 : 0);
        }
    }

    @Override // com.sportybet.plugin.realsports.betslip.virtualkeyboard.KeyboardView.b
    public final void b() {
        f0(0, "");
        C();
        o1 = getInputData();
        getBetStore().i(new imn(0L, o1, ""));
        if (n1 != null) {
            getBetStore().O(n1, o1);
        }
        R0();
        K0();
    }

    public final void b0(avy avyVar) {
        Selection selection = n1;
        if (selection == null || !rlc.b(selection)) {
            bsy bsyVar = this.e0;
            if (bsyVar != null) {
                bsyVar.E1(guy.b, vuy.b(avyVar));
                return;
            }
            return;
        }
        xlc xlcVar = this.g0;
        if (xlcVar != null) {
            xlcVar.z1(new ulc.a(nkf.b, avyVar == avy.a ? pkf.a : pkf.b), k00.d, k00.c);
        }
    }

    @Override // com.sportybet.plugin.realsports.betslip.virtualkeyboard.KeyboardView.b
    public final void c() {
        f0(0, "");
        o1 = "";
        getBetStore().i(new imn(0L, o1, ""));
        if (n1 != null) {
            getBetStore().O(n1, o1);
        }
        R0();
        K0();
    }

    public final void c0(avy avyVar) {
        Selection selection = n1;
        if (selection == null || !rlc.b(selection)) {
            bsy bsyVar = this.e0;
            if (bsyVar != null) {
                bsyVar.F1(guy.b);
                return;
            }
            return;
        }
        xlc xlcVar = this.g0;
        if (xlcVar != null) {
            xlcVar.z1(new ulc.b(nkf.b, avyVar == avy.a ? pkf.a : pkf.b), k00.d, k00.c);
        }
    }

    public final void d0() {
        if (qz3.b(n1)) {
            getMatchOddsViewContainer().setVisibility(0);
            getBoostOddsView().setVisibility(8);
        }
    }

    public final void e0(JSONArray jSONArray) {
        JSONArray jSONArrayOptJSONArray;
        if (jSONArray == null || (jSONArrayOptJSONArray = jSONArray.optJSONArray(8)) == null) {
            return;
        }
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
        for (int i2 = 0; i2 < length; i2++) {
            String strOptString2 = jSONArrayOptJSONArray.optString(i2);
            strOptString2.getClass();
            List listSplit$default2 = StringsKt__StringsKt.split$default(strOptString2, new String[]{"#"}, false, 0, 6, null);
            if (listSplit$default2.size() > 2) {
                linkedHashMap.put(listSplit$default2.get(0), listSplit$default2.get(2));
            }
        }
        knh.a aVar = new knh.a(ld80.d(ld80.j(ld80.d(CollectionsKt.K(getBetItem().U()), new se30()), new ue30()), new Function1(str2, str3, this, str) { // from class: ve30
            public final /* synthetic */ String a;
            public final /* synthetic */ String b;
            public final /* synthetic */ String c;

            {
                this.c = str;
            }

            /* JADX WARN: Code duplicated, block: B:17:0x0040  */
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                boolean z;
                Selection selection = (Selection) obj;
                boolean z2 = QuickBetView.j1;
                selection.getClass();
                if (Intrinsics.g(selection.getEventId(), this.a) && Intrinsics.g(selection.getMarketId(), this.b)) {
                    String str5 = selection.b.specifier;
                    if (str5 == null || StringsKt.U(str5) || str5.equals("~")) {
                        str5 = "";
                    }
                    if (str5.equals(this.c)) {
                        z = true;
                    } else {
                        z = false;
                    }
                } else {
                    z = false;
                }
                return Boolean.valueOf(z);
            }
        }));
        while (aVar.hasNext()) {
            Selection selection = (Selection) aVar.next();
            String str5 = (String) linkedHashMap.get(selection.getOutcomeId());
            if (str5 != null) {
                getBetStore().T(selection, str5);
            }
        }
    }

    public final void f0(int i2, String str) {
        getAdditionalMsg().setText(str);
        if (i2 != 0) {
            getAdditionalMsg().setTextColor(i2);
        } else {
            getEtInput().setActivated(false);
            getAdditionalMsg().setTextColor(getContext().getColor(R.color.text_disable_type1_primary));
        }
        getAdditionalMsg().setVisibility((TextUtils.isEmpty(str) || iw2.b()) ? 8 : 0);
    }

    public final uqm getAccountHelper() {
        uqm uqmVar = this.accountHelper;
        if (uqmVar != null) {
            return uqmVar;
        }
        Intrinsics.n("accountHelper");
        throw null;
    }

    public final uy0 getAssetsInfoRepository() {
        uy0 uy0Var = this.assetsInfoRepository;
        if (uy0Var != null) {
            return uy0Var;
        }
        Intrinsics.n("assetsInfoRepository");
        throw null;
    }

    public final at2 getBetHistoryRepository() {
        at2 at2Var = this.betHistoryRepository;
        if (at2Var != null) {
            return at2Var;
        }
        Intrinsics.n("betHistoryRepository");
        throw null;
    }

    public final jrm getBetItem() {
        jrm jrmVar = this.betItem;
        if (jrmVar != null) {
            return jrmVar;
        }
        Intrinsics.n("betItem");
        throw null;
    }

    public final krm getBetMutexDataInstance() {
        krm krmVar = this.betMutexDataInstance;
        if (krmVar != null) {
            return krmVar;
        }
        Intrinsics.n("betMutexDataInstance");
        throw null;
    }

    public final ww2 getBetOddsUseCases() {
        ww2 ww2Var = this.betOddsUseCases;
        if (ww2Var != null) {
            return ww2Var;
        }
        Intrinsics.n("betOddsUseCases");
        throw null;
    }

    public final h53 getBetSlipMarketingDomainService() {
        h53 h53Var = this.betSlipMarketingDomainService;
        if (h53Var != null) {
            return h53Var;
        }
        Intrinsics.n("betSlipMarketingDomainService");
        throw null;
    }

    public final lrm getBetStore() {
        lrm lrmVar = this.betStore;
        if (lrmVar != null) {
            return lrmVar;
        }
        Intrinsics.n("betStore");
        throw null;
    }

    public final ex4 getBookConfigRepository() {
        ex4 ex4Var = this.bookConfigRepository;
        if (ex4Var != null) {
            return ex4Var;
        }
        Intrinsics.n("bookConfigRepository");
        throw null;
    }

    public final kj7 getCheckUseGiftStakeEqualPayUseCase() {
        kj7 kj7Var = this.checkUseGiftStakeEqualPayUseCase;
        if (kj7Var != null) {
            return kj7Var;
        }
        Intrinsics.n("checkUseGiftStakeEqualPayUseCase");
        throw null;
    }

    public final com.sporty.android.common.uievent.e getCommonUiEventProcessor() {
        com.sporty.android.common.uievent.e eVar = this.commonUiEventProcessor;
        if (eVar != null) {
            return eVar;
        }
        Intrinsics.n("commonUiEventProcessor");
        throw null;
    }

    public final psm getCountryManager() {
        psm psmVar = this.countryManager;
        if (psmVar != null) {
            return psmVar;
        }
        Intrinsics.n("countryManager");
        throw null;
    }

    public final up3 getDefaultNoUseGiftState() {
        up3 up3Var = this.defaultNoUseGiftState;
        if (up3Var != null) {
            return up3Var;
        }
        Intrinsics.n("defaultNoUseGiftState");
        throw null;
    }

    public final mjf getEarlyPayoutConfiguration() {
        mjf mjfVar = this.earlyPayoutConfiguration;
        if (mjfVar != null) {
            return mjfVar;
        }
        Intrinsics.n("earlyPayoutConfiguration");
        throw null;
    }

    public final y8j getFullStoryCommonManager() {
        y8j y8jVar = this.fullStoryCommonManager;
        if (y8jVar != null) {
            return y8jVar;
        }
        Intrinsics.n("fullStoryCommonManager");
        throw null;
    }

    public final p8k getGetMaxStakeUseCase() {
        p8k p8kVar = this.getMaxStakeUseCase;
        if (p8kVar != null) {
            return p8kVar;
        }
        Intrinsics.n("getMaxStakeUseCase");
        throw null;
    }

    public final q8k getGetMaxWinUseCase() {
        q8k q8kVar = this.getMaxWinUseCase;
        if (q8kVar != null) {
            return q8kVar;
        }
        Intrinsics.n("getMaxWinUseCase");
        throw null;
    }

    public final y8k getGetMinStakeUseCase() {
        y8k y8kVar = this.getMinStakeUseCase;
        if (y8kVar != null) {
            return y8kVar;
        }
        Intrinsics.n("getMinStakeUseCase");
        throw null;
    }

    public final z9k getGetOUEarlyGoalSelectionViewState() {
        z9k z9kVar = this.getOUEarlyGoalSelectionViewState;
        if (z9kVar != null) {
            return z9kVar;
        }
        Intrinsics.n("getOUEarlyGoalSelectionViewState");
        throw null;
    }

    public final zik getGiftCalculateStakeWithGiftUseCase() {
        zik zikVar = this.giftCalculateStakeWithGiftUseCase;
        if (zikVar != null) {
            return zikVar;
        }
        Intrinsics.n("giftCalculateStakeWithGiftUseCase");
        throw null;
    }

    public final o8s getLiabilityCheckUseCases() {
        o8s o8sVar = this.liabilityCheckUseCases;
        if (o8sVar != null) {
            return o8sVar;
        }
        Intrinsics.n("liabilityCheckUseCases");
        throw null;
    }

    public final up3 getMultipleGiftState() {
        up3 up3Var = this.multipleGiftState;
        if (up3Var != null) {
            return up3Var;
        }
        Intrinsics.n("multipleGiftState");
        throw null;
    }

    public final sfy getOddsBoostConfigurationManager() {
        sfy sfyVar = this.oddsBoostConfigurationManager;
        if (sfyVar != null) {
            return sfyVar;
        }
        Intrinsics.n("oddsBoostConfigurationManager");
        throw null;
    }

    public final egy getOddsBoostRatioForSelectionProvider() {
        egy egyVar = this.oddsBoostRatioForSelectionProvider;
        if (egyVar != null) {
            return egyVar;
        }
        Intrinsics.n("oddsBoostRatioForSelectionProvider");
        throw null;
    }

    public final sty getOneUpSelectionAttributionDispatcher() {
        sty styVar = this.oneUpSelectionAttributionDispatcher;
        if (styVar != null) {
            return styVar;
        }
        Intrinsics.n("oneUpSelectionAttributionDispatcher");
        throw null;
    }

    public final j800 getPaymentNavigator() {
        j800 j800Var = this.paymentNavigator;
        if (j800Var != null) {
            return j800Var;
        }
        Intrinsics.n("paymentNavigator");
        throw null;
    }

    public final lx20 getProcessOneUpPromoBetSuccessUseCase() {
        lx20 lx20Var = this.processOneUpPromoBetSuccessUseCase;
        if (lx20Var != null) {
            return lx20Var;
        }
        Intrinsics.n("processOneUpPromoBetSuccessUseCase");
        throw null;
    }

    public final h530 getPromotionRepository() {
        h530 h530Var = this.promotionRepository;
        if (h530Var != null) {
            return h530Var;
        }
        Intrinsics.n("promotionRepository");
        throw null;
    }

    public final boolean getQuickBetViewAnimFinish() {
        return this.quickBetViewAnimFinish;
    }

    public final bi30 getQuickLiabilityCheckResultValidationUseCase() {
        bi30 bi30Var = this.quickLiabilityCheckResultValidationUseCase;
        if (bi30Var != null) {
            return bi30Var;
        }
        Intrinsics.n("quickLiabilityCheckResultValidationUseCase");
        throw null;
    }

    public final k650 getRemoteConfigRepository() {
        k650 k650Var = this.remoteConfigRepository;
        if (k650Var != null) {
            return k650Var;
        }
        Intrinsics.n("remoteConfigRepository");
        throw null;
    }

    public final c980 getSelectionPendingToggleHolder() {
        c980 c980Var = this.selectionPendingToggleHolder;
        if (c980Var != null) {
            return c980Var;
        }
        Intrinsics.n("selectionPendingToggleHolder");
        throw null;
    }

    public final j990 getShouldShowUniqueCodeInfoSheetUseCase() {
        j990 j990Var = this.shouldShowUniqueCodeInfoSheetUseCase;
        if (j990Var != null) {
            return j990Var;
        }
        Intrinsics.n("shouldShowUniqueCodeInfoSheetUseCase");
        throw null;
    }

    public final it90 getSingleBetUseCase() {
        it90 it90Var = this.singleBetUseCase;
        if (it90Var != null) {
            return it90Var;
        }
        Intrinsics.n("singleBetUseCase");
        throw null;
    }

    public final up3 getSingleGiftState() {
        up3 up3Var = this.singleGiftState;
        if (up3Var != null) {
            return up3Var;
        }
        Intrinsics.n("singleGiftState");
        throw null;
    }

    public final rdd0 getSportyTrackingUseCase() {
        rdd0 rdd0Var = this.sportyTrackingUseCase;
        if (rdd0Var != null) {
            return rdd0Var;
        }
        Intrinsics.n("sportyTrackingUseCase");
        throw null;
    }

    public final nzm getStakeConfigAgent() {
        nzm nzmVar = this.stakeConfigAgent;
        if (nzmVar != null) {
            return nzmVar;
        }
        Intrinsics.n("stakeConfigAgent");
        throw null;
    }

    public final int getThemeBgColor() {
        return getContext().getColor(getBetItem().D() ? R.color.edit_bet_quick_view_bg : R.color.custom_brand_tertiary_type2);
    }

    public final int getThemeHighlightedBgColor() {
        Context context = getContext();
        k53 k53VarC = iu2.c();
        k53VarC.getClass();
        return context.getColor(kotlin.collections.b.k(k53.REAL, k53.SIM).contains(k53VarC) ? R.color.warning_tertiary : R.color.edit_bet_quick_view_bg);
    }

    public final Animation getTranslate() {
        return this.translate;
    }

    public final cih0 getUpSelectionRowUseCase() {
        cih0 cih0Var = this.upSelectionRowUseCase;
        if (cih0Var != null) {
            return cih0Var;
        }
        Intrinsics.n("upSelectionRowUseCase");
        throw null;
    }

    public final void h0() {
        okf okfVarA = getGetOUEarlyGoalSelectionViewState().a(n1, true, true);
        if (okfVarA instanceof okf.e) {
            getEarlyPayoutItemControl().setVisibility(0);
            getEarlyPayoutItemControl().setLoading(false, true);
            getEarlyPayoutItemControl().setDashViewVisible(false);
            getEarlyPayoutItemControl().setCheckBoxVisible(true);
            getEarlyPayoutItemControl().setChecked(false);
            EarlyPayoutCheckbox earlyPayoutItemControl = getEarlyPayoutItemControl();
            Context context = getContext();
            context.getClass();
            okf.e eVar = (okf.e) okfVarA;
            earlyPayoutItemControl.setDescription(dby.a(context, eVar.a, eVar.b));
            p(false);
            ijf ijfVar = this.f0;
            if (ijfVar != null) {
                ijfVar.A1("quickBet", AnalyticsParam.EVENT_STATUS_OFF);
                return;
            }
            return;
        }
        if (okfVarA instanceof okf.a) {
            getEarlyPayoutItemControl().setVisibility(0);
            getEarlyPayoutItemControl().setLoading(false, true);
            getEarlyPayoutItemControl().setDashViewVisible(false);
            getEarlyPayoutItemControl().setCheckBoxVisible(true);
            getEarlyPayoutItemControl().setChecked(true);
            EarlyPayoutCheckbox earlyPayoutItemControl2 = getEarlyPayoutItemControl();
            Context context2 = getContext();
            context2.getClass();
            okf.a aVar = (okf.a) okfVarA;
            earlyPayoutItemControl2.setDescription(dby.a(context2, aVar.a, aVar.b));
            p(false);
            ijf ijfVar2 = this.f0;
            if (ijfVar2 != null) {
                ijfVar2.A1("quickBet", AnalyticsParam.EVENT_STATUS_ON);
                return;
            }
            return;
        }
        if (okfVarA instanceof okf.c) {
            getEarlyPayoutItemControl().setVisibility(0);
            getEarlyPayoutItemControl().setLoading(false, true);
            getEarlyPayoutItemControl().setDashViewVisible(false);
            getEarlyPayoutItemControl().setCheckBoxVisible(false);
            getEarlyPayoutItemControl().setChecked(false);
            getEarlyPayoutItemControl().setDescription(sn5.c(this, R.string.component_betslip__early_goals_not_supported, new Object[0]));
            p(false);
            return;
        }
        if (!(okfVarA instanceof okf.b)) {
            getEarlyPayoutItemControl().setVisibility(8);
            getEarlyPayoutItemControl().setLoading(false, true);
            return;
        }
        getEarlyPayoutItemControl().setVisibility(0);
        getEarlyPayoutItemControl().setLoading(true, true);
        getEarlyPayoutItemControl().setDashViewVisible(false);
        getEarlyPayoutItemControl().setCheckBoxVisible(true);
        okf.b bVar = (okf.b) okfVarA;
        getEarlyPayoutItemControl().setChecked(bVar.d);
        EarlyPayoutCheckbox earlyPayoutItemControl3 = getEarlyPayoutItemControl();
        Context context3 = getContext();
        context3.getClass();
        earlyPayoutItemControl3.setDescription(dby.a(context3, bVar.a, bVar.b));
        p(false);
    }

    public final void i0(TextView textView, int i2, int i3) {
        jc30 jc30Var;
        Drawable drawableMutate;
        if (i2 == 0) {
            jc30Var = null;
        } else {
            Integer numValueOf = Integer.valueOf(i3);
            if (i3 == 0) {
                numValueOf = null;
            }
            jc30Var = new jc30(i2, numValueOf);
        }
        if (jc30Var == null) {
            textView.setCompoundDrawables(null, null, null, null);
            return;
        }
        int i4 = jc30Var.a;
        Integer num = jc30Var.b;
        if (num != null) {
            drawableMutate = iwh0.a(getContext(), i4, num.intValue());
        } else {
            Drawable drawableA = gr0.a(getContext(), i4);
            drawableMutate = drawableA != null ? drawableA.mutate() : null;
        }
        if (drawableMutate != null) {
            int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.spr_stats_drawable_size);
            drawableMutate.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
        } else {
            drawableMutate = null;
        }
        textView.setCompoundDrawables(drawableMutate, null, null, null);
        textView.setCompoundDrawablePadding(zch0.a(getContext(), 2));
    }

    public final void j0(TextView textView, Drawable drawable) {
        if (drawable == null) {
            textView.setCompoundDrawables(null, null, null, null);
        } else {
            textView.setCompoundDrawablesWithIntrinsicBounds(drawable, (Drawable) null, (Drawable) null, (Drawable) null);
            textView.setCompoundDrawablePadding(zch0.a(getContext(), 4));
        }
    }

    public final void k0() {
        Outcome outcome;
        List<PreCannedBBOutcome> list;
        Outcome outcome2;
        List<PreCannedBBOutcome> list2;
        List<Selection> list3;
        Selection selection = n1;
        Integer numValueOf = null;
        if (selection != null && selection.p()) {
            getMarketDesc().setVisibility(8);
            getMarketDescAlt().setVisibility(0);
            TextView marketDescAlt = getMarketDescAlt();
            Selection selection2 = n1;
            if (selection2 != null && (list3 = selection2.d) != null) {
                numValueOf = Integer.valueOf(list3.size());
            }
            marketDescAlt.setText(String.valueOf(numValueOf));
            return;
        }
        Selection selection3 = n1;
        if ((selection3 != null ? selection3.c : null) == null || selection3 == null || (outcome = selection3.c) == null || (list = outcome.childOutcomes) == null || !(!list.isEmpty())) {
            getMarketDesc().setVisibility(0);
            getMarketDescAlt().setVisibility(8);
            TextView marketDesc = getMarketDesc();
            Selection selection4 = n1;
            marketDesc.setText(com.sportybet.plugin.realsports.betslip.widget.e.b(selection4, new com.sportybet.plugin.realsports.betslip.widget.e.a.c(ekf.a(selection4, getEarlyPayoutConfiguration()))));
            return;
        }
        getMarketDesc().setVisibility(8);
        getMarketDescAlt().setVisibility(0);
        TextView marketDescAlt2 = getMarketDescAlt();
        Selection selection5 = n1;
        if (selection5 != null && (outcome2 = selection5.c) != null && (list2 = outcome2.childOutcomes) != null) {
            numValueOf = Integer.valueOf(list2.size());
        }
        marketDescAlt2.setText(String.valueOf(numValueOf));
    }

    public final void l0() {
        tf30 tf30Var;
        Selection selection = n1;
        if (selection == null || (tf30Var = this.d0) == null) {
            M0(false);
            return;
        }
        apx apxVarA = tf30Var.P.a(selection, true, false, null);
        if (apxVarA instanceof apx.b) {
            M0(false);
            getNeverDownItemControl().setLoading(false, true);
            getNeverDownItemControl().setInfoVisible(false);
            return;
        }
        if (apxVarA instanceof apx.a) {
            M0(true);
            getNeverDownItemControl().setDashViewVisible(false);
            getNeverDownItemControl().setVerticalDividerVisible(false);
            getNeverDownItemControl().setInfoVisible(true);
            getNeverDownItemControl().setCheckBoxVisible(true);
            EarlyPayoutCheckbox neverDownItemControl = getNeverDownItemControl();
            apx.a aVar = (apx.a) apxVarA;
            boolean z = aVar.a;
            neverDownItemControl.setChecked(z);
            getNeverDownItemControl().setLoading(aVar.b, true);
            getNeverDownItemControl().setDescription(sn5.c(this, R.string.common_bet_ways__never_down, new Object[0]));
            bpx bpxVar = this.h0;
            if (bpxVar != null) {
                bpxVar.b.a(new xjg0(new zox(nkf.b, z ? pkf.a : pkf.b), ay0.S(new k00[]{k00.d, k00.c})));
            }
        }
    }

    public final void m0() {
        tf30 tf30Var = this.d0;
        if (tf30Var != null) {
            ej5.c(o8i0.d(tf30Var), null, null, new qf30(tf30Var, null), 3);
        }
        dgy.b.a.a(new lsm() { // from class: jd30
            @Override // defpackage.lsm
            public final void a(Object obj) {
                QuickBetView.n0(this.a, (bcp) obj);
            }
        });
    }

    public final void o(boolean z) {
        getGiftsContainerV2().setVisibility(z ? 0 : 8);
    }

    public final void o0(SelectedGiftData selectedGiftData, SelectedGiftData selectedGiftData2) {
        KeyboardView numberKeyboardView = getNumberKeyboardView();
        numberKeyboardView.getClass();
        int iHashCode = hashCode();
        KeyboardView.b bVar = numberKeyboardView.M;
        if (iHashCode != (bVar != null ? bVar.hashCode() : 0)) {
            numberKeyboardView.M = this;
        }
        if (getSingleGiftState().e != 3) {
            return;
        }
        String str = TextUtils.isEmpty(o1) ? "0" : o1;
        String str2 = TextUtils.isEmpty(getSingleGiftState().c) ? "0" : getSingleGiftState().c;
        if (TextUtils.isEmpty(str) || TextUtils.equals(str2, GiftUtil.CLEARED_GIFT_VALUE)) {
            return;
        }
        try {
            itf0.a aVar = itf0.a;
            aVar.q(MyLog.TAG_QUICK_BET);
            aVar.a("[setStakeForFreeBetGift] before cal totalStake: %s, giftValue: %s, isNewGiftValue: %s", str, str2, Boolean.valueOf(getSingleGiftState().v));
            aVar.q(MyLog.TAG_QUICK_BET);
            aVar.a("[setStakeForFreeBetGift] before cal new: %s", selectedGiftData);
            aVar.q(MyLog.TAG_QUICK_BET);
            aVar.a("[setStakeForFreeBetGift] before cal old: %s", selectedGiftData2);
            zik giftCalculateStakeWithGiftUseCase = getGiftCalculateStakeWithGiftUseCase();
            BigDecimal bigDecimal = new BigDecimal(str);
            boolean z = getSingleGiftState().v;
            giftCalculateStakeWithGiftUseCase.getClass();
            ajk.a aVarA = zik.a(bigDecimal, selectedGiftData, selectedGiftData2, z);
            if (aVarA.c != getSingleGiftState().E) {
                s(aVarA, selectedGiftData, getSingleGiftState().E);
                return;
            }
            getSingleGiftState().D = null;
            aVar.q(MyLog.TAG_QUICK_BET);
            aVar.a("[setStakeForFreeBetGift] after cal calculationResult: %s", aVarA);
            H(aVarA);
            if (aVarA.e) {
                getSingleGiftState().G++;
            }
            if (this.d0 != null && getSingleGiftState().G > 0) {
                getSingleGiftState().G = 0;
                tf30 tf30Var = this.d0;
                if (tf30Var != null) {
                    ku90<com.sporty.android.common.uievent.a> ku90Var = tf30Var.Q;
                    StringUiText stringUiText = vch0.a;
                    com.sporty.android.common.uievent.b.i(ku90Var, new ResourceUiText(R.string.component_coupon__gift_value_can_not_be_higher_than_total_stake), null, null, null, WebSocketProtocol.PAYLOAD_SHORT);
                }
            }
            getSingleGiftState().v = false;
        } catch (Exception e2) {
            itf0.a aVar2 = itf0.a;
            aVar2.q(MyLog.TAG_QUICK_BET);
            aVar2.p(e2, "[QuickBetView] error in setStakeForFreeBetGift", new Object[0]);
        }
    }

    @Override // defpackage.i8
    public final void onAccountChange(Account account) {
        if (account == null) {
            x();
            getSingleGiftState().b = 0;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        w8i0 w8i0VarB = tl5.b(this);
        if (w8i0VarB != null) {
            v8i0 viewModelStore = w8i0VarB.getViewModelStore();
            boolean z = w8i0VarB instanceof iel;
            r8i0.c defaultViewModelProviderFactory = fjd.a;
            r8i0.c defaultViewModelProviderFactory2 = z ? ((iel) w8i0VarB).getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
            cyb defaultViewModelCreationExtras = z ? ((iel) w8i0VarB).getDefaultViewModelCreationExtras() : cyb.a.b;
            viewModelStore.getClass();
            defaultViewModelProviderFactory2.getClass();
            defaultViewModelCreationExtras.getClass();
            s8i0 s8i0Var = new s8i0(viewModelStore, defaultViewModelProviderFactory2, defaultViewModelCreationExtras);
            dq7 dq7VarA = jq40.a(bsy.class);
            String strI = dq7VarA.i();
            if (strI == null) {
                hb5.a("Local and anonymous classes can not be ViewModels");
                return;
            }
            this.e0 = (bsy) s8i0Var.a(dq7VarA, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strI));
            v8i0 viewModelStore2 = w8i0VarB.getViewModelStore();
            r8i0.c defaultViewModelProviderFactory3 = z ? ((iel) w8i0VarB).getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
            cyb defaultViewModelCreationExtras2 = z ? ((iel) w8i0VarB).getDefaultViewModelCreationExtras() : cyb.a.b;
            viewModelStore2.getClass();
            defaultViewModelProviderFactory3.getClass();
            defaultViewModelCreationExtras2.getClass();
            s8i0 s8i0Var2 = new s8i0(viewModelStore2, defaultViewModelProviderFactory3, defaultViewModelCreationExtras2);
            dq7 dq7VarA2 = jq40.a(ijf.class);
            String strI2 = dq7VarA2.i();
            if (strI2 == null) {
                hb5.a("Local and anonymous classes can not be ViewModels");
                return;
            }
            this.f0 = (ijf) s8i0Var2.a(dq7VarA2, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strI2));
            v8i0 viewModelStore3 = w8i0VarB.getViewModelStore();
            r8i0.c defaultViewModelProviderFactory4 = z ? ((iel) w8i0VarB).getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
            cyb defaultViewModelCreationExtras3 = z ? ((iel) w8i0VarB).getDefaultViewModelCreationExtras() : cyb.a.b;
            viewModelStore3.getClass();
            defaultViewModelProviderFactory4.getClass();
            defaultViewModelCreationExtras3.getClass();
            s8i0 s8i0Var3 = new s8i0(viewModelStore3, defaultViewModelProviderFactory4, defaultViewModelCreationExtras3);
            dq7 dq7VarA3 = jq40.a(xlc.class);
            String strI3 = dq7VarA3.i();
            if (strI3 == null) {
                hb5.a("Local and anonymous classes can not be ViewModels");
                return;
            }
            this.g0 = (xlc) s8i0Var3.a(dq7VarA3, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strI3));
            v8i0 viewModelStore4 = w8i0VarB.getViewModelStore();
            r8i0.c defaultViewModelProviderFactory5 = z ? ((iel) w8i0VarB).getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
            cyb defaultViewModelCreationExtras4 = z ? ((iel) w8i0VarB).getDefaultViewModelCreationExtras() : cyb.a.b;
            viewModelStore4.getClass();
            defaultViewModelProviderFactory5.getClass();
            defaultViewModelCreationExtras4.getClass();
            s8i0 s8i0Var4 = new s8i0(viewModelStore4, defaultViewModelProviderFactory5, defaultViewModelCreationExtras4);
            dq7 dq7VarA4 = jq40.a(bpx.class);
            String strI4 = dq7VarA4.i();
            if (strI4 == null) {
                hb5.a("Local and anonymous classes can not be ViewModels");
                return;
            }
            this.h0 = (bpx) s8i0Var4.a(dq7VarA4, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strI4));
            ibs ibsVarQ = Q();
            if (ibsVarQ != null) {
                v8i0 viewModelStore5 = w8i0VarB.getViewModelStore();
                r8i0.c defaultViewModelProviderFactory6 = z ? ((iel) w8i0VarB).getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
                cyb defaultViewModelCreationExtras5 = z ? ((iel) w8i0VarB).getDefaultViewModelCreationExtras() : cyb.a.b;
                viewModelStore5.getClass();
                defaultViewModelProviderFactory6.getClass();
                defaultViewModelCreationExtras5.getClass();
                s8i0 s8i0Var5 = new s8i0(viewModelStore5, defaultViewModelProviderFactory6, defaultViewModelCreationExtras5);
                dq7 dq7VarA5 = jq40.a(tf30.class);
                String strI5 = dq7VarA5.i();
                if (strI5 == null) {
                    hb5.a("Local and anonymous classes can not be ViewModels");
                    return;
                }
                final tf30 tf30Var = (tf30) s8i0Var5.a(dq7VarA5, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strI5));
                r5b r5bVar = tf30Var.R;
                this.d0 = tf30Var;
                tf30Var.G1();
                int i2 = 1;
                if (!getBetItem().n0()) {
                    tf30Var.E1(new v03.m(tf30Var.A1()));
                    getBetItem().g1(true);
                }
                r5bVar.l(ibsVarQ);
                r5bVar.f(ibsVarQ, new lfy() { // from class: fe30
                    @Override // defpackage.lfy
                    public final void u1(Object obj) {
                        a aVar = (a) obj;
                        QuickBetView quickBetView = this.a;
                        WeakReference<Activity> weakReference = quickBetView.f;
                        Activity activity = weakReference != null ? weakReference.get() : null;
                        if (activity == null || activity.isFinishing() || !(activity instanceof e)) {
                            return;
                        }
                        quickBetView.getCommonUiEventProcessor().c(aVar, (e) activity, quickBetView.findViewById(R.id.quick_bet_root), null);
                        a.f fVar = a.f.a;
                        if (aVar != fVar) {
                            tf30Var.Q.a(fVar);
                        }
                    }
                });
                tf30Var.T.f(ibsVarQ, new lfy() { // from class: le30
                    @Override // defpackage.lfy
                    public final void u1(Object obj) {
                        boolean z2 = QuickBetView.j1;
                        QuickBetView quickBetView = this.a;
                        quickBetView.K0();
                        vn20.g("user_accept_change", quickBetView.getAccountHelper().isLogin() ? quickBetView.getAccountHelper().getUserId() : "no_account", true, false);
                    }
                });
                tf30Var.V.f(ibsVarQ, new lfy() { // from class: te30
                    @Override // defpackage.lfy
                    public final void u1(Object obj) {
                        UIState uIState = (UIState) obj;
                        boolean z2 = QuickBetView.j1;
                        if (uIState instanceof UIState.Success) {
                            for (String str : (List) ((UIState.Success) uIState).getData()) {
                                QuickBetView quickBetView = this.a;
                                ArrayList arrayListU = quickBetView.getBetItem().U();
                                int size = arrayListU.size();
                                int i3 = 0;
                                while (i3 < size) {
                                    Object obj2 = arrayListU.get(i3);
                                    i3++;
                                    Selection selection = (Selection) obj2;
                                    Event event = selection.a;
                                    if (event != null && c.l(str, event.eventId, true)) {
                                        String str2 = selection.a.eventId;
                                        str2.getClass();
                                        quickBetView.post(new yd30(quickBetView, str2, true, selection));
                                        break;
                                    }
                                }
                            }
                        }
                    }
                });
                kzh.d(new yzh(new g1i(tf30Var.D.u(), new kf30(tf30Var, null)), new lf30(3, null)), o8i0.d(tf30Var));
                v8i0 viewModelStore6 = w8i0VarB.getViewModelStore();
                r8i0.c defaultViewModelProviderFactory7 = z ? ((iel) w8i0VarB).getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
                cyb defaultViewModelCreationExtras6 = z ? ((iel) w8i0VarB).getDefaultViewModelCreationExtras() : cyb.a.b;
                viewModelStore6.getClass();
                defaultViewModelProviderFactory7.getClass();
                defaultViewModelCreationExtras6.getClass();
                s8i0 s8i0Var6 = new s8i0(viewModelStore6, defaultViewModelProviderFactory7, defaultViewModelCreationExtras6);
                dq7 dq7VarA6 = jq40.a(hzz.class);
                String strI6 = dq7VarA6.i();
                if (strI6 == null) {
                    hb5.a("Local and anonymous classes can not be ViewModels");
                    return;
                }
                hzz hzzVar = (hzz) s8i0Var6.a(dq7VarA6, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strI6));
                this.j0 = hzzVar;
                hzzVar.x1(false);
                v8i0 viewModelStore7 = w8i0VarB.getViewModelStore();
                r8i0.c defaultViewModelProviderFactory8 = z ? ((iel) w8i0VarB).getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
                cyb defaultViewModelCreationExtras7 = z ? ((iel) w8i0VarB).getDefaultViewModelCreationExtras() : cyb.a.b;
                viewModelStore7.getClass();
                defaultViewModelProviderFactory8.getClass();
                defaultViewModelCreationExtras7.getClass();
                s8i0 s8i0Var7 = new s8i0(viewModelStore7, defaultViewModelProviderFactory8, defaultViewModelCreationExtras7);
                dq7 dq7VarA7 = jq40.a(yyk.class);
                String strI7 = dq7VarA7.i();
                if (strI7 == null) {
                    hb5.a("Local and anonymous classes can not be ViewModels");
                    return;
                }
                this.i0 = (yyk) s8i0Var7.a(dq7VarA7, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strI7));
                v8i0 viewModelStore8 = w8i0VarB.getViewModelStore();
                if (z) {
                    defaultViewModelProviderFactory = ((iel) w8i0VarB).getDefaultViewModelProviderFactory();
                }
                cyb defaultViewModelCreationExtras8 = z ? ((iel) w8i0VarB).getDefaultViewModelCreationExtras() : cyb.a.b;
                viewModelStore8.getClass();
                defaultViewModelProviderFactory.getClass();
                defaultViewModelCreationExtras8.getClass();
                s8i0 s8i0Var8 = new s8i0(viewModelStore8, defaultViewModelProviderFactory, defaultViewModelCreationExtras8);
                dq7 dq7VarA8 = jq40.a(aj90.class);
                String strI8 = dq7VarA8.i();
                if (strI8 == null) {
                    hb5.a("Local and anonymous classes can not be ViewModels");
                    return;
                }
                this.k0 = (aj90) s8i0Var8.a(dq7VarA8, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strI8));
                i2i.c(getAssetsInfoRepository().h(pu0.b.a), null, 3).f(ibsVarQ, new lfy() { // from class: we30
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // defpackage.lfy
                    public final void u1(Object obj) {
                        SelectedGiftData selectedGiftData;
                        lk50 lk50Var = (lk50) obj;
                        boolean z2 = QuickBetView.j1;
                        if (lk50Var instanceof lk50.c) {
                            QuickBetView quickBetView = this.a;
                            quickBetView.R0();
                            AssetsInfo assetsInfo = (AssetsInfo) ((lk50.c) lk50Var).a;
                            if ((assetsInfo != null ? assetsInfo.balance : 0L) >= 0) {
                                quickBetView.O = true;
                                return;
                            }
                            quickBetView.O = false;
                            if (quickBetView.getBetItem().m0()) {
                                if (quickBetView.getSingleGiftState().i || ((selectedGiftData = quickBetView.getSingleGiftState().C) != null && selectedGiftData.getChecked())) {
                                    quickBetView.V(false);
                                }
                            }
                        }
                    }
                });
                getTaxConfigsLiveData().f(ibsVarQ, new lfy() { // from class: xe30
                    @Override // defpackage.lfy
                    public final void u1(Object obj) {
                        TaxConfigs taxConfigs = (TaxConfigs) obj;
                        boolean z2 = QuickBetView.j1;
                        taxConfigs.getClass();
                        QuickBetView quickBetView = this.a;
                        quickBetView.F = taxConfigs;
                        quickBetView.M();
                    }
                });
                tf30Var.X.f(ibsVarQ, new lfy() { // from class: ye30
                    @Override // defpackage.lfy
                    public final void u1(Object obj) {
                        QuickBetView.S(this.a, (t7z) obj);
                    }
                });
                tf30Var.Y.f(ibsVarQ, new lfy() { // from class: ze30
                    @Override // defpackage.lfy
                    public final void u1(Object obj) {
                        QuickBetView.U(this.a, (uh30) obj);
                    }
                });
                tf30Var.G1();
                kzh.d(tf30Var.z.g(), o8i0.d(tf30Var));
                tf30 tf30Var2 = this.d0;
                if (tf30Var2 != null) {
                    ej5.c(o8i0.d(tf30Var2), null, null, new mf30(tf30Var2, null), 3);
                }
                ibsVarQ.getLifecycle().a(this.e1);
                H0();
                this.P = false;
                this.Q = false;
                ibs ibsVarQ2 = Q();
                final yyk yykVar = this.i0;
                hzz hzzVar2 = this.j0;
                if (ibsVarQ2 != null && yykVar != null && hzzVar2 != null) {
                    yykVar.y1(0, true);
                    yykVar.I.f(ibsVarQ2, new lfy() { // from class: td30
                        @Override // defpackage.lfy
                        public final void u1(Object obj) {
                            QuickBetView.F0(this.a, (vjk) obj);
                        }
                    });
                    yykVar.O.f(ibsVarQ2, new lfy() { // from class: ud30
                        @Override // defpackage.lfy
                        public final void u1(Object obj) {
                            QuickBetView quickBetView = this.a;
                            if (quickBetView.P) {
                                quickBetView.P = false;
                                quickBetView.O0();
                            }
                        }
                    });
                    fks.b(yykVar.K, hzzVar2.f, new qpb(i2)).f(ibsVarQ2, new lfy() { // from class: vd30
                        @Override // defpackage.lfy
                        public final void u1(Object obj) {
                            QuickBetView.G0(this.a, yykVar, (kotlin.Pair) obj);
                        }
                    });
                }
                I0();
                ibs ibsVarQ3 = Q();
                final aj90 aj90Var = this.k0;
                if (aj90Var == null) {
                    return;
                }
                mi90 mi90Var = aj90Var.c;
                final hzz hzzVar3 = this.j0;
                if (hzzVar3 == null) {
                    return;
                }
                ui90 ui90Var = aj90Var.d;
                ui90Var.b();
                ui90Var.c();
                if (ibsVarQ3 != null) {
                    t340 t340Var = mi90Var.x;
                    s9s.b bVar = s9s.b.d;
                    this.l0 = yyh.a(t340Var, ibsVarQ3, bVar, new Function1() { // from class: ld30
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            wik wikVar = (wik) obj;
                            boolean z2 = QuickBetView.j1;
                            wikVar.getClass();
                            if (aj90Var.w) {
                                return Unit.a;
                            }
                            QuickBetView quickBetView = this;
                            if (!quickBetView.getBetItem().m0()) {
                                return Unit.a;
                            }
                            if (wikVar instanceof wik.a) {
                                svk svkVar = ((wik.a) wikVar).a;
                                quickBetView.G(l780.a(svkVar.d, svkVar.b, svkVar.c), quickBetView.getSingleGiftState().C);
                            }
                            return Unit.a;
                        }
                    }, new tob(1));
                    this.m0 = yyh.a(mi90Var.A, ibsVarQ3, bVar, new Function1() { // from class: md30
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            xi90 xi90Var = (xi90) obj;
                            boolean z2 = QuickBetView.j1;
                            xi90Var.getClass();
                            if (aj90Var.w) {
                                return Unit.a;
                            }
                            QuickBetView quickBetView = this;
                            if (!quickBetView.getBetItem().m0()) {
                                return Unit.a;
                            }
                            if (xi90Var != xi90.a.a) {
                                return Unit.a;
                            }
                            quickBetView.V(false);
                            return Unit.a;
                        }
                    }, new nd30());
                    jlv jlvVarB = fks.b(aj90Var.v, hzzVar3.f, new gpb(i2));
                    this.n0 = jlvVarB;
                    jlvVarB.f(ibsVarQ3, new lfy() { // from class: od30
                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // defpackage.lfy
                        public final void u1(Object obj) {
                            kotlin.Pair pair = (kotlin.Pair) obj;
                            boolean z2 = QuickBetView.j1;
                            if (aj90Var.w) {
                                return;
                            }
                            QuickBetView quickBetView = this;
                            if (quickBetView.getBetItem().m0()) {
                                quickBetView.I((ej90) pair.a, Intrinsics.g(pair.b, Boolean.TRUE));
                            }
                        }
                    });
                    aj90Var.z.f(ibsVarQ3, new lfy() { // from class: pd30
                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // defpackage.lfy
                        public final void u1(Object obj) {
                            Integer num = (Integer) obj;
                            boolean z2 = QuickBetView.j1;
                            QuickBetView quickBetView = this.a;
                            if (quickBetView.getBetItem().m0() && num != null) {
                                int iIntValue = num.intValue();
                                if (iIntValue > 1) {
                                    quickBetView.D();
                                } else if (iIntValue == 1) {
                                    quickBetView.I((ej90) aj90Var.v.d(), Intrinsics.g((Boolean) hzzVar3.f.d(), Boolean.TRUE));
                                }
                            }
                        }
                    });
                }
            }
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Outcome outcome;
        tf30 tf30Var;
        Outcome outcome2;
        Event event;
        Outcome outcome3;
        Market market;
        tf30 tf30Var2;
        view.getClass();
        String str = null;
        str = null;
        getBetStore().r(null);
        int id = view.getId();
        if (id == R.id.close_quick_bet) {
            k1 = false;
            j1 = false;
            l1 = true;
            x();
            getAccountHelper().removeAccountChangeListener(this);
            getBetItem().z1(this, this.i1);
            ((br3) mmc.a(hp0.A, br3.class)).U().g();
            getBetStore().i(null);
            return;
        }
        if (id == R.id.delete) {
            w(this, 3);
            getAccountHelper().removeAccountChangeListener(this);
            ((br3) mmc.a(hp0.A, br3.class)).U().h();
            wq3 wq3VarU = ((br3) mmc.a(hp0.A, br3.class)).U();
            wq3VarU.getClass();
            Activity activityE = oti.c().e();
            if (wq3.s(activityE)) {
                wq3VarU.c(activityE);
                return;
            }
            return;
        }
        if (id == R.id.place_bet_btn_layout) {
            if (getBetItem().m0() && (tf30Var2 = this.d0) != null) {
                tf30Var2.O.c();
            }
            getAccountHelper().setRegisterStatus(false);
            WeakReference<Activity> weakReference = this.f;
            Activity activity = weakReference != null ? weakReference.get() : null;
            tf30 tf30Var3 = this.d0;
            if (tf30Var3 != null) {
                tf30Var3.E1(new v03.r(tf30Var3.A1()));
            }
            if (activity == null || activity.isFinishing()) {
                return;
            }
            getAccountHelper().demandAccount(activity, new tit() { // from class: wd30
                @Override // defpackage.tit
                public final void w(Account account, boolean z) {
                    QuickBetView.W(this.a, account);
                }
            });
            return;
        }
        if (id == R.id.accept_changes_btn) {
            k1 = false;
            j1 = false;
            boolean zIsEmpty = getLiabilityCheckUseCases().d().isEmpty();
            tf30 tf30Var4 = this.d0;
            if (tf30Var4 != null) {
                ej5.c(o8i0.d(tf30Var4), null, null, new wf30(tf30Var4, null), 3);
            }
            tf30 tf30Var5 = this.d0;
            if (tf30Var5 != null) {
                tf30Var5.E1(new v03.k(tf30Var5.A1()));
            }
            Selection selection = n1;
            if ((selection != null && (market = selection.b) != null && market.status == 3) || !zIsEmpty) {
                getBetItem().k0(null);
                w(this, 3);
                ((br3) mmc.a(hp0.A, br3.class)).U().h();
                wq3 wq3VarU2 = ((br3) mmc.a(hp0.A, br3.class)).U();
                wq3VarU2.getClass();
                Activity activityE2 = oti.c().e();
                if (wq3.s(activityE2)) {
                    wq3VarU2.c(activityE2);
                    return;
                }
                return;
            }
            if ((selection == null || (outcome3 = selection.c) == null || outcome3.oddsChangesFlag != 0) && (tf30Var = this.d0) != null) {
                ej5.c(o8i0.d(tf30Var), null, null, new zf30(tf30Var, null), 3);
            }
            Selection selection2 = n1;
            if (selection2 != null && (event = selection2.a) != null) {
                event.changeFlag = false;
            }
            if (selection2 != null && (outcome2 = selection2.c) != null) {
                outcome2.oddsChangesFlag = 0;
            }
            K0();
            N0();
            getBetItem().B();
            return;
        }
        if (id != R.id.boost_container) {
            if (id == R.id.cl_multiple_bet || id == R.id.list_item_container) {
                getBetItem().z1(this, this.i1);
                ((br3) mmc.a(hp0.A, br3.class)).U().w(true);
                x();
                return;
            }
            return;
        }
        getBetItem().d();
        if (!getBetItem().M()) {
            RotateAnimation rotateAnimation = new RotateAnimation(90.0f, 0.0f, 1, 1.0f, 1, 0.8f);
            rotateAnimation.setFillAfter(true);
            rotateAnimation.setDuration(1000L);
            rotateAnimation.setInterpolator(new LinearInterpolator());
            getRotateClockView().startAnimation(rotateAnimation);
            d0();
            if (TextUtils.isEmpty(getInputData()) || !qz3.b(n1)) {
                BigDecimal bigDecimal = BigDecimal.ZERO;
                bigDecimal.getClass();
                A0(bigDecimal, bigDecimal);
            } else {
                Selection selection3 = n1;
                if (selection3 != null && (outcome = selection3.c) != null) {
                    str = outcome.odds;
                }
                BigDecimal bigDecimalMin = new BigDecimal(str).multiply(new BigDecimal(getInputData())).min(getGetMaxWinUseCase().a());
                bigDecimalMin.getClass();
                A0(bigDecimalMin, new BigDecimal(getInputData()));
            }
            getBoostButton().setBackgroundResource(R.drawable.background_flash_odds);
            getBoostCheckBoxView().setImageResource(R.drawable.ic_boost_unchecked);
            zch0.k(getContext(), getRotateClockView(), Color.parseColor("#dcdee5"));
            getBoostTextView().setText(sn5.c(this, R.string.component_betslip__u_boost, new Object[0]));
            return;
        }
        RotateAnimation rotateAnimation2 = new RotateAnimation(0.0f, 90.0f, 1, 1.0f, 1, 0.8f);
        rotateAnimation2.setFillAfter(true);
        rotateAnimation2.setDuration(1000L);
        rotateAnimation2.setInterpolator(new LinearInterpolator());
        getRotateClockView().startAnimation(rotateAnimation2);
        Iterator it = getBetItem().l1().entrySet().iterator();
        while (it.hasNext()) {
            getBetItem().L0((Selection) ((Map.Entry) it.next()).getKey(), true);
        }
        Selection selection4 = n1;
        if (selection4 != null) {
            w0(selection4, false, true);
            if (TextUtils.isEmpty(getInputData()) || !qz3.b(selection4) || selection4.c == null) {
                BigDecimal bigDecimal2 = BigDecimal.ZERO;
                bigDecimal2.getClass();
                A0(bigDecimal2, bigDecimal2);
            } else {
                BigDecimal bigDecimalMin2 = new BigDecimal(selection4.c.odds).multiply(new BigDecimal(getInputData())).multiply(getOddsBoostConfigurationManager().c(selection4.c)).min(getGetMaxWinUseCase().a());
                bigDecimalMin2.getClass();
                A0(bigDecimalMin2, new BigDecimal(getInputData()));
            }
        }
        getBoostTextView().setText(sn5.c(this, R.string.component_betslip__u_boosted, new Object[0]));
        getBoostButton().setBackgroundResource(R.drawable.background_flash_odds);
        getBoostCheckBoxView().setImageResource(R.drawable.ic_boost_checked);
        zch0.k(getContext(), getRotateClockView(), Color.parseColor("#f2af00"));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        r5b r5bVar;
        vu90 vu90Var;
        vu90 vu90Var2;
        r5b r5bVar2;
        super.onDetachedFromWindow();
        wwd0 wwd0Var = getSelectionPendingToggleHolder().a;
        o2g o2gVar = o2g.a;
        o2gVar.getClass();
        wwd0Var.getClass();
        wwd0Var.k(null, o2gVar);
        H0();
        I0();
        ibs ibsVarQ = Q();
        if (ibsVarQ != null) {
            tf30 tf30Var = this.d0;
            if (tf30Var != null && (r5bVar2 = tf30Var.T) != null) {
                r5bVar2.l(ibsVarQ);
            }
            tf30 tf30Var2 = this.d0;
            if (tf30Var2 != null && (vu90Var2 = tf30Var2.V) != null) {
                vu90Var2.l(ibsVarQ);
            }
            tf30 tf30Var3 = this.d0;
            if (tf30Var3 != null && (vu90Var = tf30Var3.X) != null) {
                vu90Var.l(ibsVarQ);
            }
            tf30 tf30Var4 = this.d0;
            if (tf30Var4 != null && (r5bVar = tf30Var4.Y) != null) {
                r5bVar.l(ibsVarQ);
            }
            getTaxConfigsLiveData().l(ibsVarQ);
            ibsVarQ.getLifecycle().d(this.e1);
        }
        this.p0 = 0L;
        if (getBetItem().U().isEmpty()) {
            getBetItem().g1(false);
        }
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        double d2;
        double d3;
        Object obj;
        super.onFinishInflate();
        if (((br3) mmc.a(hp0.A, br3.class)).U().I) {
            this.M = true;
            this.isConfirmPageOnScreen = false;
            this.f = new WeakReference<>(null);
            this.T = new zc30(false, false, SimShareData.INSTANCE.isAutoBetEnabled() && getBetItem().m0());
            this.U = new k830<>();
            setOnClickListener(new hd30());
            Iterator it = q1.iterator();
            while (it.hasNext()) {
                Selection selection = (Selection) it.next();
                ArrayList arrayListU = getBetItem().U();
                int size = arrayListU.size();
                int i2 = 0;
                do {
                    if (i2 >= size) {
                        it.remove();
                        break;
                    } else {
                        obj = arrayListU.get(i2);
                        i2++;
                    }
                } while (!Intrinsics.g(selection, (Selection) obj));
            }
            if (getContext() != null) {
                Context context = getContext();
                context.getClass();
                Drawable drawableB = s0b.b(context, R.drawable.ic__gift, new a78.c(R.color.icon_brand_sub_primary_d_lighter), 20);
                if (drawableB != null) {
                    getGiftCheckbox().setCompoundDrawablesRelative(drawableB, null, null, null);
                }
            }
            int iD = bqe.d();
            DisplayMetrics displayMetrics = bqe.a;
            if ((displayMetrics != null ? displayMetrics.density : 1.0f) < 2.0d) {
                d2 = iD;
                d3 = 0.4d;
            } else {
                d2 = iD;
                d3 = 0.5d;
            }
            getTvMultipleDoubleValue().setMaxWidth((int) (d2 * d3));
            getFullStoryCommonManager().d(this, "fs-unmask");
        }
    }

    @Override // com.sportybet.ntespm.socket.Subscriber
    public final void onReceive(String str) {
        str.getClass();
        itf0.a aVar = itf0.a;
        aVar.q(MyLog.TAG_QUICK_BET);
        boolean z = this.v;
        boolean z2 = this.A;
        int size = getBetItem().U().size();
        StringBuilder sbA = cwz.a("QuickBetView - onReceive : isSubmittingBet = ", ", hasInit = ", ", selection Size = ", z, z2);
        sbA.append(size);
        aVar.a(sbA.toString(), new Object[0]);
        this.S.onNext(str);
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        view.getClass();
        motionEvent.getClass();
        if (view.getId() != R.id.cl_multiple_bet && view.getId() != R.id.list_item_container) {
            return false;
        }
        float y = motionEvent.getY();
        int action = motionEvent.getAction();
        if (action == 0) {
            this.G = y;
            return false;
        }
        if (action != 1) {
            return false;
        }
        float f2 = y - this.G;
        if (Math.abs(f2) <= 50.0f || f2 >= 0.0f) {
            return false;
        }
        if (!P() && !k1) {
            getBetItem().z1(this, this.i1);
            ((br3) mmc.a(hp0.A, br3.class)).U().w(true);
            x();
            return false;
        }
        if (!P()) {
            return false;
        }
        getBetItem().z1(this, this.i1);
        ((br3) mmc.a(hp0.A, br3.class)).U().w(true);
        x();
        return false;
    }

    public final void p(boolean z) {
        if (z) {
            k0();
        } else {
            getMarketDesc().setVisibility(8);
            getMarketDescAlt().setVisibility(8);
        }
    }

    public final void q() {
        Outcome outcome;
        String str;
        Selection selection = n1;
        if (selection == null) {
            return;
        }
        int i2 = selection.c.oddsChangesFlag;
        if (i2 > 0) {
            getMatchOddsLeftIcon().setVisibility(0);
            getMatchOddsLeftIcon().setImageDrawable(iwh0.a(getContext(), R.drawable.spr_ic_arrow_upward_black_24dp, getContext().getColor(R.color.brand_secondary)));
            getInitMatchOddsView().setVisibility(8);
            return;
        }
        if (i2 < 0) {
            getMatchOddsLeftIcon().setVisibility(0);
            getMatchOddsLeftIcon().setImageDrawable(iwh0.a(getContext(), R.drawable.spr_ic_arrow_downward_black_24dp, getContext().getColor(R.color.warning_primary)));
            getInitMatchOddsView().setVisibility(8);
            return;
        }
        tf30 tf30Var = this.d0;
        BigDecimal bigDecimalG = null;
        if (tf30Var != null) {
            apx apxVarA = tf30Var.P.a(selection, true, false, null);
            if ((apxVarA instanceof apx.a) && ((apx.a) apxVarA).a && i2 == 0) {
                getMatchOddsLeftIcon().setVisibility(0);
                getMatchOddsLeftIcon().setImageResource(R.drawable.ic_feature_1x2_boost);
                getMatchOddsLeftIcon().clearColorFilter();
                Selection selectionE = qvy.e(selection);
                if (selectionE != null) {
                    String strI = getBetStore().I(selectionE);
                    BigDecimal bigDecimalG2 = strI != null ? kotlin.text.b.g(strI) : null;
                    Selection selection2 = n1;
                    if (selection2 != null && (outcome = selection2.c) != null && (str = outcome.odds) != null) {
                        bigDecimalG = kotlin.text.b.g(str);
                    }
                    if (bigDecimalG2 == null || bigDecimalG == null || bigDecimalG2.compareTo(bigDecimalG) >= 0) {
                        getInitMatchOddsView().setVisibility(8);
                        return;
                    }
                    getInitMatchOddsView().setPaintFlags(16);
                    getInitMatchOddsView().setVisibility(0);
                    getInitMatchOddsView().setText(gky.a(strI));
                    return;
                }
                return;
            }
        }
        getMatchOddsLeftIcon().setVisibility(8);
        getMatchOddsLeftIcon().setImageDrawable(null);
        getInitMatchOddsView().setVisibility(8);
    }

    public final void q0() {
        boolean z;
        yuy yuyVarA = getUpSelectionRowUseCase().a(n1, true, true, true);
        if (yuyVarA instanceof yuy.c) {
            yuy.c cVar = (yuy.c) yuyVarA;
            boolean z2 = cVar.i;
            boolean z3 = cVar.g;
            boolean z4 = cVar.c;
            OneUpTwoUpSwitch.f fVar = cVar.b;
            OneUpTwoUpSwitch.c cVar2 = cVar.a;
            p(cVar.h);
            getOneTwoUpItemControl().getSwitchView().setMode(cVar2);
            getOneTwoUpItemControl().getSwitchView().setState(fVar, false, true);
            getOneTwoUpItemControl().setSupported(z4, cVar2, z3);
            z = cVar.d && z4;
            getOneTwoUpItemControl().setSwitchVisible(z);
            getOneTwoUpItemControl().setDashViewVisible(z2);
            getOneTwoUpItemControl().setCheckBoxVisible(false);
            getOneTwoUpItemControl().setVisibility((z || z2 || z3) ? 0 : 8);
            c0(hih0.g(fVar));
            return;
        }
        if (!(yuyVarA instanceof yuy.b)) {
            k0();
            getOneTwoUpItemControl().setSwitchVisible(false);
            getOneTwoUpItemControl().setCheckBoxVisible(false);
            getOneTwoUpItemControl().setVisibility(8);
            return;
        }
        yuy.b bVar = (yuy.b) yuyVarA;
        boolean z5 = bVar.i;
        boolean z6 = bVar.g;
        boolean z7 = bVar.c;
        boolean z8 = bVar.b;
        OneUpTwoUpCheckbox.a aVar = bVar.a;
        p(bVar.h);
        getOneTwoUpItemControl().setSwitchVisible(false);
        getOneTwoUpItemControl().getCheckBoxView().setMode(aVar);
        getOneTwoUpItemControl().getCheckBoxView().setChecked(z8);
        getOneTwoUpItemControl().setSupported(z7, aVar, z6);
        z = bVar.d && z7;
        getOneTwoUpItemControl().setCheckBoxVisible(z);
        getOneTwoUpItemControl().setDashViewVisible(z5);
        getOneTwoUpItemControl().setVisibility((z || z5 || z6) ? 0 : 8);
        c0(hih0.f(aVar, z8));
    }

    public final void s(ajk.a aVar, SelectedGiftData selectedGiftData, boolean z) {
        BigDecimal bigDecimal = aVar.a;
        BigDecimal bigDecimal2 = aVar.b;
        boolean z2 = aVar.d;
        SelectedGiftData selectedGiftData2 = new SelectedGiftData(bigDecimal2.toString(), selectedGiftData.getGiftKind(), selectedGiftData.getGiftId(), selectedGiftData.getGiftLimit(), selectedGiftData.getGiftCount(), selectedGiftData.getRawGift(), z2, selectedGiftData.getChecked(), selectedGiftData.getUserSelect(), bigDecimal.toString());
        SelectedGiftData selectedGiftData3 = new SelectedGiftData(bigDecimal2.toString(), selectedGiftData.getGiftKind(), selectedGiftData.getGiftId(), selectedGiftData.getGiftLimit(), selectedGiftData.getGiftCount(), selectedGiftData.getRawGift(), z2, z, selectedGiftData.getUserSelect(), bigDecimal.toString());
        getSingleGiftState().i = z;
        o0(selectedGiftData3, selectedGiftData2);
        setGiftChecked(z);
    }

    public final boolean s0() {
        zc30 zc30Var;
        if (!getBetItem().D()) {
            boolean z = getSingleGiftState().b > 0;
            if ((getBetItem().U().size() == 1 && !qz3.b((Selection) getBetItem().U().get(0))) || getBetItem().U().size() != 1) {
                z = false;
            }
            boolean z2 = z && this.O && (zc30Var = this.T) != null && !zc30Var.a;
            if (!getBetItem().m0() || SimShareData.INSTANCE.getAutoBetTimes() <= 1) {
                return z2;
            }
        }
        return false;
    }

    public final void setAccountHelper(uqm uqmVar) {
        uqmVar.getClass();
        this.accountHelper = uqmVar;
    }

    public final void setAssetsInfoRepository(uy0 uy0Var) {
        uy0Var.getClass();
        this.assetsInfoRepository = uy0Var;
    }

    public final void setBetHistoryRepository(at2 at2Var) {
        at2Var.getClass();
        this.betHistoryRepository = at2Var;
    }

    public final void setBetItem(jrm jrmVar) {
        jrmVar.getClass();
        this.betItem = jrmVar;
    }

    public final void setBetMutexDataInstance(krm krmVar) {
        krmVar.getClass();
        this.betMutexDataInstance = krmVar;
    }

    public final void setBetOddsUseCases(ww2 ww2Var) {
        ww2Var.getClass();
        this.betOddsUseCases = ww2Var;
    }

    public final void setBetSlipMarketingDomainService(h53 h53Var) {
        h53Var.getClass();
        this.betSlipMarketingDomainService = h53Var;
    }

    public final void setBetStore(lrm lrmVar) {
        lrmVar.getClass();
        this.betStore = lrmVar;
    }

    public final void setBookConfigRepository(ex4 ex4Var) {
        ex4Var.getClass();
        this.bookConfigRepository = ex4Var;
    }

    public final void setCheckUseGiftStakeEqualPayUseCase(kj7 kj7Var) {
        kj7Var.getClass();
        this.checkUseGiftStakeEqualPayUseCase = kj7Var;
    }

    public final void setCommonUiEventProcessor(com.sporty.android.common.uievent.e eVar) {
        eVar.getClass();
        this.commonUiEventProcessor = eVar;
    }

    public final void setConfirmPageOnScreen(boolean z) {
        this.isConfirmPageOnScreen = z;
    }

    public final void setCountryManager(psm psmVar) {
        psmVar.getClass();
        this.countryManager = psmVar;
    }

    public final void setDefaultNoUseGiftState(up3 up3Var) {
        up3Var.getClass();
        this.defaultNoUseGiftState = up3Var;
    }

    public final void setEarlyPayoutConfiguration(mjf mjfVar) {
        mjfVar.getClass();
        this.earlyPayoutConfiguration = mjfVar;
    }

    public final void setFullStoryCommonManager(y8j y8jVar) {
        y8jVar.getClass();
        this.fullStoryCommonManager = y8jVar;
    }

    public final void setGetMaxStakeUseCase(p8k p8kVar) {
        p8kVar.getClass();
        this.getMaxStakeUseCase = p8kVar;
    }

    public final void setGetMaxWinUseCase(q8k q8kVar) {
        q8kVar.getClass();
        this.getMaxWinUseCase = q8kVar;
    }

    public final void setGetMinStakeUseCase(y8k y8kVar) {
        y8kVar.getClass();
        this.getMinStakeUseCase = y8kVar;
    }

    public final void setGetOUEarlyGoalSelectionViewState(z9k z9kVar) {
        z9kVar.getClass();
        this.getOUEarlyGoalSelectionViewState = z9kVar;
    }

    public final void setGiftCalculateStakeWithGiftUseCase(zik zikVar) {
        zikVar.getClass();
        this.giftCalculateStakeWithGiftUseCase = zikVar;
    }

    public final void setGiftChecked(boolean isChecked) {
        this.N = true;
        getGiftCheckbox().setChecked(isChecked);
        this.N = false;
        Q0();
    }

    public final void setLfbBoostEligibleUseCase(s1p s1pVar) {
        s1pVar.getClass();
        this.isLfbBoostEligibleUseCase = s1pVar;
    }

    public final void setLiabilityCheckUseCases(o8s o8sVar) {
        o8sVar.getClass();
        this.liabilityCheckUseCases = o8sVar;
    }

    public final void setMessageValue(boolean value) {
        if (this.U == null) {
            return;
        }
        itf0.a aVar = itf0.a;
        aVar.q(MyLog.TAG_QUICK_BET);
        aVar.a("set flowable: %s", Boolean.valueOf(value));
        k830<Boolean> k830Var = this.U;
        if (k830Var != null) {
            k830Var.onNext(Boolean.valueOf(value));
        }
    }

    public final void setMultipleGiftState(up3 up3Var) {
        up3Var.getClass();
        this.multipleGiftState = up3Var;
    }

    public final void setMultipleModeUI() {
        Drawable drawableA;
        WeakReference<Activity> weakReference = this.f;
        ComponentCallbacks2 componentCallbacks2 = weakReference != null ? (Activity) weakReference.get() : null;
        boolean zY = componentCallbacks2 instanceof wym ? ((wym) componentCallbacks2).y() : false;
        boolean zM0 = getBetItem().m0();
        Resources resources = getResources();
        if (zY) {
            drawableA = gr0.a(getContext(), R.drawable.progress_bar_rounded_progress_dark);
        } else {
            drawableA = zM0 ? gr0.a(getContext(), R.drawable.progress_bar_rounded_progress_sim) : gr0.a(getContext(), R.drawable.progress_bar_rounded_custom_brand_secondary_opacity_type1);
        }
        getPbMultipleBetBonusHint().setProgressDrawable(drawableA);
        getTvMultipleBetBonusHint().setTextColor(zM0 ? resources.getColor(R.color.custom_text_type2_tertiary_type1) : resources.getColor(R.color.custom_brand_secondary_variable_type2_type1));
        getTvMultipleBetCount().setTextColor(zM0 ? resources.getColor(R.color.custom_absolute_type2_type3) : resources.getColor(R.color.text_type2_primary));
        getTvMultipleBetCount().setBackgroundResource(zM0 ? R.drawable.bg_filled_sim_theme_primary_circle_24dp : R.drawable.bg_filled_brand_secondary_circle_20dp);
    }

    public final void setOddsBoostConfigurationManager(sfy sfyVar) {
        sfyVar.getClass();
        this.oddsBoostConfigurationManager = sfyVar;
    }

    public final void setOddsBoostRatioForSelectionProvider(egy egyVar) {
        egyVar.getClass();
        this.oddsBoostRatioForSelectionProvider = egyVar;
    }

    public final void setOneUpSelectionAttributionDispatcher(sty styVar) {
        styVar.getClass();
        this.oneUpSelectionAttributionDispatcher = styVar;
    }

    public final void setPaymentNavigator(j800 j800Var) {
        j800Var.getClass();
        this.paymentNavigator = j800Var;
    }

    public final void setPlaceBetSuccess(boolean z) {
        this.isPlaceBetSuccess = z;
    }

    public final void setProcessOneUpPromoBetSuccessUseCase(lx20 lx20Var) {
        lx20Var.getClass();
        this.processOneUpPromoBetSuccessUseCase = lx20Var;
    }

    public final void setPromotionRepository(h530 h530Var) {
        h530Var.getClass();
        this.promotionRepository = h530Var;
    }

    public final void setQuickBetViewAnimFinish(boolean z) {
        this.quickBetViewAnimFinish = z;
    }

    public final void setQuickLiabilityCheckResultValidationUseCase(bi30 bi30Var) {
        bi30Var.getClass();
        this.quickLiabilityCheckResultValidationUseCase = bi30Var;
    }

    public final void setRebetRemixCombineAnTestHelper(hc40 hc40Var) {
        hc40Var.getClass();
        this.rebetRemixCombineAnTestHelper = hc40Var;
    }

    public final void setRemoteConfigRepository(k650 k650Var) {
        k650Var.getClass();
        this.remoteConfigRepository = k650Var;
    }

    public final void setSelectionPendingToggleHolder(c980 c980Var) {
        c980Var.getClass();
        this.selectionPendingToggleHolder = c980Var;
    }

    public final void setShouldShowUniqueCodeInfoSheetUseCase(j990 j990Var) {
        j990Var.getClass();
        this.shouldShowUniqueCodeInfoSheetUseCase = j990Var;
    }

    public final void setSingleBetUseCase(it90 it90Var) {
        it90Var.getClass();
        this.singleBetUseCase = it90Var;
    }

    public final void setSingleGiftState(up3 up3Var) {
        up3Var.getClass();
        this.singleGiftState = up3Var;
    }

    public final void setSportyTrackingUseCase(rdd0 rdd0Var) {
        rdd0Var.getClass();
        this.sportyTrackingUseCase = rdd0Var;
    }

    public final void setStakeConfigAgent(nzm nzmVar) {
        nzmVar.getClass();
        this.stakeConfigAgent = nzmVar;
    }

    public final void setTranslate(Animation animation) {
        this.translate = animation;
    }

    public final void setUpSelectionRowUseCase(cih0 cih0Var) {
        cih0Var.getClass();
        this.upSelectionRowUseCase = cih0Var;
    }

    public final void t() {
        if (getOneTwoUpItemControl().F.e.getVisibility() == 0) {
            getOneTwoUpItemControl().getSwitchView().setActivate(true);
        }
        if (getOneTwoUpItemControl().F.d.getVisibility() == 0) {
            getOneTwoUpItemControl().getCheckBoxView().E();
        }
        if (getEarlyPayoutItemControl().a.b.getVisibility() == 0) {
            EarlyPayoutCheckbox earlyPayoutItemControl = getEarlyPayoutItemControl();
            earlyPayoutItemControl.getClass();
            EarlyPayoutCheckbox.setLoading$default(earlyPayoutItemControl, false, false, 2, null);
        }
    }

    public final void t0(Order order, boolean z) {
        WeakReference<Activity> weakReference = this.f;
        Activity activity = weakReference != null ? weakReference.get() : null;
        if (activity == null || activity.isFinishing() || !(activity instanceof androidx.fragment.app.e)) {
            return;
        }
        androidx.fragment.app.e eVar = (androidx.fragment.app.e) activity;
        if (((BetSuccessfulPageFragment) eVar.getSupportFragmentManager().H("TAG_BET_SUCCESS")) == null) {
            BetSuccessfulPageFragment betSuccessfulPageFragmentP0 = BetSuccessfulPageFragment.p0(order, true, this.p0, z);
            FragmentManager supportFragmentManager = eVar.getSupportFragmentManager();
            supportFragmentManager.getClass();
            betSuccessfulPageFragmentP0.show(supportFragmentManager, "TAG_BET_SUCCESS");
        }
    }

    public final void u(Selection selection, Runnable runnable) {
        if (!getBetItem().V()) {
            runnable.run();
            return;
        }
        if (this.b0 == null) {
            runnable.run();
            return;
        }
        ArrayList arrayList = new ArrayList(getBetItem().U());
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            Selection selection2 = (Selection) obj;
            if (selection2.p() && selection2.d.contains(selection)) {
                fj2 fj2Var = this.b0;
                if (fj2Var != null) {
                    fj2Var.y1(g880.y(selection2, kotlin.collections.a.c(selection)), true);
                }
            } else if (selection2.equals(selection)) {
                runnable.run();
            }
        }
    }

    public final void v() {
        Sport sport;
        Category category;
        Tournament tournament;
        this.C = false;
        this.D = false;
        Selection selection = n1;
        if (selection == null) {
            return;
        }
        Outcome outcome = selection.c;
        Market market = selection.b;
        Event event = selection.a;
        ArrayList arrayList = this.i;
        int size = arrayList.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                break;
            }
            Object obj = arrayList.get(i2);
            i2++;
            Map map = (Map) obj;
            try {
                if (R((String) map.get("tournamentId"), (event == null || (sport = event.sport) == null || (category = sport.category) == null || (tournament = category.tournament) == null) ? null : tournament.id)) {
                    if (R((String) map.get("marketId"), market != null ? market.id : null)) {
                        if (R((String) map.get("productId"), market != null ? String.valueOf(market.product) : null)) {
                            this.C = true;
                        }
                    }
                }
            } catch (Exception e2) {
                if (event != null && !TextUtils.isEmpty(event.eventId)) {
                    String str = event.eventId;
                    if (str == null) {
                        str = "";
                    }
                    w950.a("QuickBetView", "checkOddsBoost", e2, kotlin.collections.b.l(new Pair("EventId", str)));
                }
            }
        }
        if (!qz3.b(selection) || (outcome != null && getOddsBoostConfigurationManager().h(getOddsBoostConfigurationManager().c(outcome)))) {
            this.D = true;
        }
        getBetItem().I0(selection, O().a(event != null ? event.eventId : null, market != null ? market.status : 0, outcome));
        tf30 tf30Var = this.d0;
        if (tf30Var != null) {
            tf30Var.G1();
        }
    }

    public final void v0() {
        String strZ;
        if (this.M) {
            getPlaceBetBtnLayout().setVisibility(8);
            getWholeView().setVisibility(8);
            getSimulateAutoBetPanel().setVisibility(8);
            getPotentialTaxWinLayout().setVisibility(8);
            getBoostView().setVisibility(8);
            getBoostOddsView().setVisibility(8);
            getPotWinLayout().setVisibility(8);
            getFullWinLayout().setVisibility(8);
            getGiftsContainerV2().setVisibility(8);
            getAcceptChangesBtn().setVisibility(8);
            getChangesWarningView().setVisibility(8);
            getRequireManualChangeSelectionView().setVisibility(8);
            getClMultipleBet().setVisibility(0);
            getClMultipleBet().setOnClickListener(this);
            getClMultipleBet().setOnTouchListener(this);
            i0(getTvMultipleDoubleValue(), 0, 0);
            if (q1.isEmpty()) {
                getCloseQuickBetView().setImageResource(R.drawable.spr_quickbet_close);
                getClMultipleBet().setBackgroundColor(getThemeBgColor());
            } else {
                getCloseQuickBetView().setImageResource(R.drawable.spr_quickbet_close_changed);
                getClMultipleBet().setBackgroundColor(getThemeHighlightedBgColor());
            }
            if (getNumberKeyboardView().F()) {
                getNumberKeyboardView().E();
            }
            getTvMultipleBetCount().setText(String.valueOf(getBetItem().U().size()));
            mr4 mr4VarB = getBetMutexDataInstance().b();
            ProgressBar pbMultipleBetBonusHint = getPbMultipleBetBonusHint();
            double d2 = mr4VarB.c;
            BigDecimal[] bigDecimalArr = nh4.c().f;
            pbMultipleBetBonusHint.setProgress(((getBetItem().m0() && getBetItem().u0()) || qz3.g()) ? 0 : (int) ((d2 / ((double) ((bigDecimalArr == null || bigDecimalArr.length <= 0) ? 27 : Math.min(bigDecimalArr.length, ird0.a().o())))) * 100.0d));
            k53 k53VarC = iu2.c();
            k53VarC.getClass();
            if (kotlin.collections.b.k(k53.REAL, k53.SIM).contains(k53VarC)) {
                strZ = z(mr4VarB, nh4.c().e());
            } else {
                SimShareData simShareData = SimShareData.INSTANCE;
                if (simShareData.getMultiBetBonusEnable()) {
                    strZ = z(mr4VarB, simShareData.getMultiBetBonusEnable());
                } else {
                    getGroupBonusHint().setVisibility(8);
                    strZ = "";
                }
            }
            if (TextUtils.isEmpty(strZ)) {
                getGroupBonusHint().setVisibility(8);
            } else {
                getTvMultipleBetBonusHint().setText(strZ);
            }
            int size = getBetMutexDataInstance().s().keySet().size();
            getTvMultipleDoubleText().setText(getBetItem().h1(size, qz3.g()));
            getTvMultipleDoubleValue().setText(B(size, getBetMutexDataInstance().P()));
            this.L = A(size);
            getAdditionalMsg().setVisibility(8);
            getGoToDepositBtn().setVisibility(8);
            setPlaceBetBtn(getBetItem().m0());
            int iOrdinal = getBetItem().K0().ordinal();
            if (iOrdinal == 0 || iOrdinal == 1) {
                setMultipleModeUI();
                return;
            }
            if (iOrdinal != 2) {
                uhc.a();
                return;
            }
            getGroupBonusHint().setVisibility(8);
            ViewGroup.LayoutParams layoutParams = getTvMultipleBetCount().getLayoutParams();
            layoutParams.getClass();
            ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) layoutParams;
            layoutParams2.l = 0;
            ((ViewGroup.MarginLayoutParams) layoutParams2).bottomMargin = 0;
            layoutParams2.i = 0;
            ((ViewGroup.MarginLayoutParams) layoutParams2).topMargin = 0;
            getTvMultipleBetCount().setLayoutParams(layoutParams2);
            getClMultipleBet().setBackgroundColor(getClMultipleBet().getContext().getColor(R.color.edit_bet_quick_view_bg));
            int iA = iw2.a();
            Resources resources = getResources();
            int color = resources.getColor(R.color.text_type2_primary);
            int color2 = resources.getColor(R.color.edit_bet_quick_view_fold);
            int color3 = resources.getColor(iA > 0 ? R.color.brand_secondary_variable_type3 : R.color.edit_bet_quick_view_num_no_selection);
            int i2 = iA > 0 ? R.drawable.bg_filled_brand_secondary_circle_20dp : R.drawable.bg_filled_editbet_theme_primary_circle_24dp;
            getBetSlipTitleText().setTextColor(color);
            getTvMultipleDoubleText().setTextColor(color2);
            getTvMultipleDoubleValue().setTextColor(color3);
            getTvMultipleBetCount().setBackgroundResource(i2);
            getTvMultipleBetCount().setText(String.valueOf(iA));
            if (iA == 0) {
                getTvMultipleDoubleText().setText("");
                getTvMultipleDoubleValue().setText("--");
                getTvMultipleBetCount().setText("0");
            }
        }
    }

    public final void w0(Selection selection, boolean z, boolean z2) {
        boolean zB = qz3.b(selection);
        Outcome outcome = selection.c;
        if (zB || !getBetItem().m0()) {
            if (!getBetItem().W()) {
                getMatchOddsViewContainer().setVisibility(0);
                getBoostOddsView().setVisibility(8);
                return;
            }
            getMatchOddsViewContainer().setVisibility(8);
            getBoostOddsView().setVisibility(0);
            TextView textView = (TextView) findViewById(R.id.init_boost_odds);
            BigDecimal bigDecimal = new BigDecimal(outcome.odds);
            String str = outcome.odds;
            str.getClass();
            textView.setText(gky.a.a(str, false));
            textView.getPaint().setFlags(16);
            DancingNumber dancingNumber = (DancingNumber) findViewById(R.id.flash_odds);
            if (z) {
                dancingNumber.setBackground(null);
                dancingNumber.setTextColor(dancingNumber.getContext().getColor(R.color.text_primary));
                Drawable drawable = textView.getContext().getDrawable(R.drawable.ic_flash_boost);
                if (drawable != null) {
                    int dimensionPixelSize = getContext().getResources().getDimensionPixelSize(R.dimen.flash_boost_badge_size);
                    drawable.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
                    textView.setCompoundDrawablesRelative(drawable, null, null, null);
                }
                textView.setCompoundDrawablePadding(getContext().getResources().getDimensionPixelSize(R.dimen.flash_boost_badge_padding));
            }
            float f2 = Float.parseFloat(bjb0.L(bigDecimal.multiply(getOddsBoostRatioForSelectionProvider().a(selection)), Locale.US));
            if (z2) {
                dancingNumber.g(f2);
            } else {
                dancingNumber.getClass();
                dancingNumber.setText(String.format("%1$01.2f", Float.valueOf(f2)));
            }
        }
    }

    public final void x() {
        getSingleGiftState().d = null;
        getSingleGiftState().c = null;
        getSingleGiftState().f = null;
        getSingleGiftState().e = 0;
        yyk yykVar = this.i0;
        if (yykVar != null) {
            oc30 oc30Var = yykVar.w;
            if (yykVar.B1().isEmpty()) {
                oc30Var.a.k(null, new n780.a(1));
            } else {
                List<GiftGroup> listB1 = yykVar.B1();
                oc30Var.getClass();
                listB1.getClass();
                oc30Var.a.k(null, new n780.d(listB1));
            }
            yykVar.M1((n780) oc30Var.a.getValue());
        }
    }

    public final void y() {
        getNumberKeyboardView().E();
        getEtInput().clearFocus();
        getEtInput().setCursorVisible(false);
    }

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
    public final void y0() {
        if (getBoostView().getParent() == null) {
            return;
        }
        this.d = new GuideView(getContext());
        ImageView imageView = new ImageView(getContext());
        imageView.setImageResource(R.drawable.spr_right_down_arrow);
        GuideView guideView = this.d;
        if (guideView != null) {
            guideView.addView(imageView, zch0.d(zch0.a(getContext(), -60), zch0.a(getContext(), -230)));
        }
        GuideView guideView2 = this.d;
        if (guideView2 != null) {
            String strC = sn5.c(this, R.string.component_betslip__tap_to_boost_your_odds_and_potential_winnings, new Object[0]);
            LinearLayout linearLayout = new LinearLayout(getContext());
            linearLayout.setOrientation(1);
            linearLayout.setGravity(1);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
            TextView textView = new TextView(getContext());
            textView.setText(strC);
            textView.setTextColor(-1);
            textView.setTextSize(15.0f);
            textView.setLineSpacing(zch0.a(getContext(), 5), 1.0f);
            textView.setGravity(17);
            linearLayout.addView(textView, layoutParams);
            layoutParams.topMargin = zch0.a(getContext(), 10);
            String strC2 = sn5.c(this, R.string.component_betslip__got_it, new Object[0]);
            TextView textView2 = new TextView(getContext());
            textView2.setTextColor(-1);
            textView2.setTextSize(15.0f);
            textView2.setPadding(zch0.a(getContext(), 15), zch0.a(getContext(), 5), zch0.a(getContext(), 15), zch0.a(getContext(), 5));
            textView2.setBackgroundResource(R.drawable.ic_boost_unchecked);
            textView2.setText(strC2);
            textView2.setOnClickListener(new kx2(this, 1));
            linearLayout.addView(textView2, layoutParams);
            guideView2.addView(linearLayout, zch0.d(0, zch0.a(getContext(), -320)));
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(getBoostView());
        GuideView guideView3 = this.d;
        if (guideView3 != null) {
            guideView3.setDate(arrayList);
        }
        WeakReference<Activity> weakReference = this.f;
        Activity activity = weakReference != null ? weakReference.get() : null;
        if (activity == null || activity.isFinishing()) {
            return;
        }
        View decorView = activity.getWindow().getDecorView();
        decorView.getClass();
        ((FrameLayout) decorView).addView(this.d, new FrameLayout.LayoutParams(-1, -1));
    }

    public final String z(mr4 mr4Var, boolean z) {
        if (z) {
            jrm betItem = getBetItem();
            Context context = getContext();
            context.getClass();
            return betItem.H(context);
        }
        jrm betItem2 = getBetItem();
        Context context2 = getContext();
        context2.getClass();
        return betItem2.F(mr4Var.b, context2, mr4Var.a);
    }

    public final void z0(Selection selection, String str) {
        if (TextUtils.isEmpty(str)) {
            BigDecimal bigDecimal = BigDecimal.ZERO;
            bigDecimal.getClass();
            A0(bigDecimal, bigDecimal);
        } else {
            BigDecimal bigDecimal2 = new BigDecimal(str);
            BigDecimal bigDecimalMin = new BigDecimal(selection.c.odds).multiply(bigDecimal2).multiply(getOddsBoostRatioForSelectionProvider().a(selection)).min(getGetMaxWinUseCase().a());
            bigDecimalMin.getClass();
            A0(bigDecimalMin, bigDecimal2);
        }
    }

    public final hc40 getRebetRemixCombineAnTestHelper() {
        hc40 hc40Var = this.rebetRemixCombineAnTestHelper;
        if (hc40Var != null) {
            return hc40Var;
        }
        Intrinsics.n(oAudzpbdOhCI.Fnh);
        throw null;
    }

    public final void u0(boolean z) {
        CharSequence string;
        boolean z2;
        int i2;
        int color;
        BigDecimal bigDecimal;
        String plainString;
        BigDecimal bigDecimalG;
        BigDecimal bigDecimal2;
        BigDecimal bigDecimal3;
        int i3;
        int i4;
        int i5;
        tf30 tf30Var;
        if (getBetItem().m0()) {
            Context context = getContext();
            context.getClass();
            string = cj90.a(SimShareData.INSTANCE.getAutoBetTimes(), context, "0");
        } else {
            string = getContext().getString(R.string.component_betslip__place_bet);
            string.getClass();
        }
        tf30 tf30Var2 = this.d0;
        if (tf30Var2 != null && (tf30Var2.v.getResult() instanceof uh30.c)) {
            z2 = true;
        } else {
            z2 = false;
        }
        if ((getBetItem().H0() || !k1) && !getLiabilityCheckUseCases().a() && !z2) {
            getAcceptChangesBtn().setVisibility(8);
            LinearLayout placeBetBtnLayout = getPlaceBetBtnLayout();
            if (!P()) {
                i2 = 0;
            } else {
                i2 = 8;
            }
            placeBetBtnLayout.setVisibility(i2);
            if (getBetItem().m0()) {
                if (z) {
                    color = getResources().getColor(R.color.custom_absolute_type2_type3);
                } else {
                    color = getResources().getColor(R.color.text_disable_type1_primary);
                }
            } else if (z) {
                color = getResources().getColor(R.color.brand_tertiary);
            } else {
                color = getResources().getColor(R.color.text_disable_type1_primary);
            }
            getPlaceBetBtn().setTextColor(color);
            getExciseTax().setTextColor(getContext().getColor(R.color.brand_tertiary));
        } else {
            Button acceptChangesBtn = getAcceptChangesBtn();
            if (!P()) {
                i5 = 0;
            } else {
                i5 = 8;
            }
            acceptChangesBtn.setVisibility(i5);
            setAcceptBtn(getBetItem().m0());
            getPlaceBetBtnLayout().setVisibility(8);
            getPlaceBetBtn().setTextColor(getContext().getColor(R.color.text_disable_type1_primary));
            getExciseTax().setTextColor(getContext().getColor(R.color.text_disable_type1_primary));
            if (getAcceptChangesBtn().getVisibility() == 0 && (tf30Var = this.d0) != null) {
                tf30Var.E1(new v03.l(tf30Var.A1()));
            }
        }
        tf30 tf30Var3 = this.d0;
        if (tf30Var3 != null && (tf30Var3.v.getResult() instanceof uh30.b)) {
            View changesWarningView = getChangesWarningView();
            if (!P()) {
                i3 = 0;
            } else {
                i3 = 8;
            }
            changesWarningView.setVisibility(i3);
            getAcceptChangesBtn().setVisibility(8);
            getPlaceBetBtnLayout().setVisibility(8);
            View requireManualChangeSelectionView = getRequireManualChangeSelectionView();
            if (!P()) {
                i4 = 0;
            } else {
                i4 = 8;
            }
            requireManualChangeSelectionView.setVisibility(i4);
        } else {
            getChangesWarningView().setVisibility(8);
            getRequireManualChangeSelectionView().setVisibility(8);
        }
        if (getBetMutexDataInstance().C() != 0) {
            getPlaceBetBtnLayout().setEnabled(z);
            String str = "";
            String strA = fu5.a(",", getInputData(), "");
            String str2 = getSingleGiftState().c;
            if (str2 != null && str2.length() != 0 && !StringsKt.M(str2, YAzniTbXHYQ.eRjimoYgdZ, false)) {
                try {
                    String str3 = o1;
                    if (str3 != null) {
                        bigDecimal2 = new BigDecimal(str3);
                    } else {
                        bigDecimal2 = BigDecimal.ZERO;
                    }
                    bigDecimal2.getClass();
                } catch (Exception e2) {
                    itf0.a aVar = itf0.a;
                    aVar.q(MyLog.TAG_QUICK_BET);
                    aVar.o(e2);
                    bigDecimal2 = BigDecimal.ZERO;
                    bigDecimal2.getClass();
                }
                try {
                    bigDecimal3 = new BigDecimal(str2);
                } catch (Exception e3) {
                    itf0.a aVar2 = itf0.a;
                    aVar2.q(MyLog.TAG_QUICK_BET);
                    aVar2.o(e3);
                    bigDecimal3 = BigDecimal.ZERO;
                    bigDecimal3.getClass();
                }
                BigDecimal bigDecimalSubtract = bigDecimal2.subtract(bigDecimal3);
                bigDecimalSubtract.getClass();
                plainString = bigDecimalSubtract.toPlainString();
                p1 = plainString;
            } else {
                try {
                    bigDecimal = new BigDecimal(strA);
                } catch (Exception e4) {
                    itf0.a aVar3 = itf0.a;
                    aVar3.q(MyLog.TAG_QUICK_BET);
                    aVar3.o(e4);
                    bigDecimal = BigDecimal.ZERO;
                    bigDecimal.getClass();
                }
                plainString = bigDecimal.toPlainString();
                p1 = plainString;
            }
            if (plainString != null && plainString.length() != 0) {
                String str4 = p1;
                if (str4 == null || (bigDecimalG = kotlin.text.b.g(str4)) == null) {
                    bigDecimalG = BigDecimal.ZERO;
                }
                if (bigDecimalG.compareTo(BigDecimal.ZERO) < 0) {
                    p1 = "0";
                }
            }
            String str5 = p1;
            if (str5 != null) {
                str = str5;
            }
            zd2<String> zd2Var = this.W;
            zd2Var.onNext(str);
            if (z) {
                if (TextUtils.isEmpty(strA)) {
                    getPlaceBetBtn().setText(string);
                    getPlaceBetBtnLayout().setEnabled(false);
                    getExciseTax().setVisibility(8);
                    if (getBetItem().m0()) {
                        TextView placeBetBtn = getPlaceBetBtn();
                        Context context2 = getContext();
                        context2.getClass();
                        placeBetBtn.setText(cj90.a(SimShareData.INSTANCE.getAutoBetTimes(), context2, "0"));
                    }
                    setPlaceBetBtn(getBetItem().m0());
                    zd2Var.onNext("0");
                    return;
                }
                return;
            }
            getPlaceBetBtn().setText(string);
            getExciseTax().setVisibility(8);
            if (getBetItem().m0()) {
                TextView placeBetBtn2 = getPlaceBetBtn();
                Context context3 = getContext();
                context3.getClass();
                placeBetBtn2.setText(cj90.a(SimShareData.INSTANCE.getAutoBetTimes(), context3, str));
            }
            getPlaceBetBtnLayout().setEnabled(false);
            return;
        }
        getPlaceBetBtnLayout().setEnabled(false);
        getPlaceBetBtn().setText(string);
        getExciseTax().setVisibility(8);
        if (getBetItem().m0()) {
            TextView placeBetBtn3 = getPlaceBetBtn();
            Context context4 = getContext();
            context4.getClass();
            placeBetBtn3.setText(cj90.a(SimShareData.INSTANCE.getAutoBetTimes(), context4, "0"));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public QuickBetView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        context.getClass();
        if (!isInEditMode()) {
            d();
        }
        this.c = hwr.b(new fd30(this, 0));
        this.i = new ArrayList();
        this.F = TaxConfigs.INSTANCE.getDefault();
        BigDecimal bigDecimal = BigDecimal.ZERO;
        bigDecimal.getClass();
        this.L = bigDecimal;
        this.R = new ema();
        this.S = new l830<>();
        this.V = new zd2<>();
        this.W = new zd2<>();
        this.a0 = new GroupTopic("banned^events");
        this.q0 = hwr.b(new gfg(this, 2));
        this.e1 = new b();
        this.h1 = sh8.b();
        this.i1 = new a();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public QuickBetView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
        this.c = hwr.b(new fd30(this, 0));
        this.i = new ArrayList();
        this.F = TaxConfigs.INSTANCE.getDefault();
        BigDecimal bigDecimal = BigDecimal.ZERO;
        bigDecimal.getClass();
        this.L = bigDecimal;
        this.R = new ema();
        this.S = new l830<>();
        this.V = new zd2<>();
        this.W = new zd2<>();
        this.a0 = new GroupTopic("banned^events");
        this.q0 = hwr.b(new gfg(this, 2));
        this.e1 = new b();
        this.h1 = sh8.b();
        this.i1 = new a();
    }
}
