package com.sportybet.plugin.realsports.betslip.widget;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.Point;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.Display;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.SeekBar;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.helper.widget.Flow;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.flexbox.FlexboxLayout;
import com.sporty.android.common_ui.uitext.UiText;
import com.sporty.android.core.model.MyLog;
import com.sporty.android.core.model.config.bo.enums.BOConfigParam;
import com.sporty.android.core.model.config.tax.TaxConfigs;
import com.sporty.android.core.model.tracking.AnalyticsParam;
import com.sportybet.android.gp.tz.R;
import com.sportybet.android.widget.ArrowButton;
import com.sportybet.android.widget.BetSlipHintView;
import com.sportybet.plugin.realsports.betslip.Selection;
import com.sportybet.plugin.realsports.betslip.simulate.SimulateAutoBetPanel;
import com.sportybet.plugin.realsports.betslip.virtualkeyboard.EditTextWithKeyBoard;
import com.sportybet.plugin.realsports.betslip.widget.BetSlipFooter;
import com.sportybet.plugin.realsports.data.FooterInfo;
import com.sportybet.plugin.realsports.data.sim.SimShareData;
import defpackage.a23;
import defpackage.a320;
import defpackage.a43;
import defpackage.a78;
import defpackage.avy;
import defpackage.ay0;
import defpackage.b33;
import defpackage.b43;
import defpackage.bjb0;
import defpackage.bmy;
import defpackage.bqy;
import defpackage.c0d;
import defpackage.c33;
import defpackage.c43;
import defpackage.c8i0;
import defpackage.c9p;
import defpackage.ckf;
import defpackage.cq40;
import defpackage.cvd0;
import defpackage.d40;
import defpackage.dey;
import defpackage.dkf;
import defpackage.e13;
import defpackage.e43;
import defpackage.ej5;
import defpackage.ema;
import defpackage.f23;
import defpackage.f5w;
import defpackage.f8i0;
import defpackage.fse;
import defpackage.fvd0;
import defpackage.g13;
import defpackage.g23;
import defpackage.g33;
import defpackage.g93;
import defpackage.gku;
import defpackage.gvh;
import defpackage.h13;
import defpackage.h33;
import defpackage.h5e;
import defpackage.hu2;
import defpackage.huy;
import defpackage.hvo;
import defpackage.hwr;
import defpackage.i13;
import defpackage.i23;
import defpackage.i33;
import defpackage.iez;
import defpackage.imn;
import defpackage.inm;
import defpackage.ird0;
import defpackage.it90;
import defpackage.itf0;
import defpackage.iu2;
import defpackage.iw2;
import defpackage.iw90;
import defpackage.iym;
import defpackage.j13;
import defpackage.j33;
import defpackage.j7g;
import defpackage.jrm;
import defpackage.jvd0;
import defpackage.jvo;
import defpackage.k23;
import defpackage.k33;
import defpackage.k53;
import defpackage.k54;
import defpackage.k650;
import defpackage.kni0;
import defpackage.l23;
import defpackage.l33;
import defpackage.las;
import defpackage.lq1;
import defpackage.lrm;
import defpackage.luo;
import defpackage.lw2;
import defpackage.m2l;
import defpackage.m33;
import defpackage.mgd0;
import defpackage.mhh0;
import defpackage.mpe0;
import defpackage.mr4;
import defpackage.n23;
import defpackage.nae0;
import defpackage.nh4;
import defpackage.nhh0;
import defpackage.onw;
import defpackage.p13;
import defpackage.p23;
import defpackage.p8k;
import defpackage.p980;
import defpackage.pfd;
import defpackage.pmw;
import defpackage.psm;
import defpackage.q13;
import defpackage.q23;
import defpackage.q33;
import defpackage.qq1;
import defpackage.qry;
import defpackage.qz3;
import defpackage.r0b;
import defpackage.r13;
import defpackage.r23;
import defpackage.r2i;
import defpackage.r33;
import defpackage.s0b;
import defpackage.s13;
import defpackage.s33;
import defpackage.shh0;
import defpackage.sn5;
import defpackage.t33;
import defpackage.taj;
import defpackage.th50;
import defpackage.thh0;
import defpackage.tje0;
import defpackage.to3;
import defpackage.tug;
import defpackage.u33;
import defpackage.ucy;
import defpackage.uhc;
import defpackage.uqe0;
import defpackage.uqm;
import defpackage.v1b;
import defpackage.v23;
import defpackage.v33;
import defpackage.v5b;
import defpackage.w23;
import defpackage.w33;
import defpackage.x33;
import defpackage.xry;
import defpackage.y33;
import defpackage.yby;
import defpackage.z33;
import defpackage.zch0;
import defpackage.zd2;
import defpackage.zi50;
import defpackage.zuy;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u008a\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J#\u0010\u0017\u001a\u00020\f2\u0014\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u00020\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u00150\u0013¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001b\u001a\u00020\f2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019¢\u0006\u0004\b\u001b\u0010\u001cJ\r\u0010\u001e\u001a\u00020\u001d¢\u0006\u0004\b\u001e\u0010\u001fJ\u0015\u0010\"\u001a\u00020\f2\u0006\u0010!\u001a\u00020 ¢\u0006\u0004\b\"\u0010#J\r\u0010%\u001a\u00020$¢\u0006\u0004\b%\u0010&J\u001d\u0010)\u001a\u00020\f2\u0006\u0010!\u001a\u00020'2\u0006\u0010(\u001a\u00020\u001d¢\u0006\u0004\b)\u0010*J\u0015\u0010,\u001a\u00020\f2\u0006\u0010+\u001a\u00020\u001d¢\u0006\u0004\b,\u0010-J\u0015\u0010.\u001a\u00020\f2\u0006\u0010+\u001a\u00020\u001d¢\u0006\u0004\b.\u0010-J\u0015\u00100\u001a\u00020\f2\u0006\u0010/\u001a\u00020\u001d¢\u0006\u0004\b0\u0010-J\u0015\u00102\u001a\u00020\f2\u0006\u00101\u001a\u00020\u001d¢\u0006\u0004\b2\u0010-J\u0015\u00103\u001a\u00020\f2\u0006\u00101\u001a\u00020\u001d¢\u0006\u0004\b3\u0010-J\r\u00104\u001a\u00020\f¢\u0006\u0004\b4\u00105J\u001f\u00108\u001a\u00020\f2\u0006\u00106\u001a\u00020\u001d2\b\b\u0002\u00107\u001a\u00020\u001d¢\u0006\u0004\b8\u00109J\u0015\u0010;\u001a\u00020\f2\u0006\u0010:\u001a\u00020\u0014¢\u0006\u0004\b;\u0010<J\u001d\u0010@\u001a\u00020\f2\u0006\u0010=\u001a\u00020\u001d2\u0006\u0010?\u001a\u00020>¢\u0006\u0004\b@\u0010AJ'\u0010E\u001a\u00020\f2\u0006\u0010B\u001a\u00020\u00062\b\u0010C\u001a\u0004\u0018\u00010\u00142\u0006\u0010D\u001a\u00020\u001d¢\u0006\u0004\bE\u0010FJ\u001d\u0010H\u001a\u00020\f2\u0006\u0010B\u001a\u00020\u00062\u0006\u0010G\u001a\u00020\u001d¢\u0006\u0004\bH\u0010IJ\u0015\u0010L\u001a\u00020\f2\u0006\u0010K\u001a\u00020J¢\u0006\u0004\bL\u0010MJ\u000f\u0010N\u001a\u0004\u0018\u00010J¢\u0006\u0004\bN\u0010OJ\u000f\u0010P\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\bP\u0010QJ\u000f\u0010R\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\bR\u0010QJ\u000f\u0010S\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\bS\u0010QJ\u001d\u0010V\u001a\u00020\f2\u0006\u0010T\u001a\u00020\u001d2\u0006\u0010U\u001a\u00020\u0014¢\u0006\u0004\bV\u0010WJ\r\u0010X\u001a\u00020\u0006¢\u0006\u0004\bX\u0010YJ\r\u0010Z\u001a\u00020\u0006¢\u0006\u0004\bZ\u0010YJ\r\u0010[\u001a\u00020\f¢\u0006\u0004\b[\u00105J\u0015\u0010]\u001a\u00020\f2\u0006\u0010\\\u001a\u00020\u001d¢\u0006\u0004\b]\u0010-J\u0015\u0010`\u001a\u00020\f2\u0006\u0010_\u001a\u00020^¢\u0006\u0004\b`\u0010aJ\u0015\u0010b\u001a\u00020\f2\u0006\u0010_\u001a\u00020^¢\u0006\u0004\bb\u0010aJ\u0015\u0010d\u001a\u00020\f2\u0006\u0010c\u001a\u00020\u0014¢\u0006\u0004\bd\u0010<J=\u0010j\u001a\u00020\f2\u0006\u0010e\u001a\u00020^2\u0006\u0010f\u001a\u00020^2\u0006\u0010g\u001a\u00020^2\u0006\u0010h\u001a\u00020^2\u0006\u0010i\u001a\u00020\u001d2\u0006\u0010(\u001a\u00020\u001d¢\u0006\u0004\bj\u0010kJ\u0015\u0010m\u001a\u00020\f2\u0006\u0010l\u001a\u00020\u001d¢\u0006\u0004\bm\u0010-J\u0015\u0010o\u001a\u00020\f2\u0006\u0010n\u001a\u00020\u001d¢\u0006\u0004\bo\u0010-J\u0015\u0010p\u001a\u00020\f2\u0006\u0010n\u001a\u00020\u001d¢\u0006\u0004\bp\u0010-J\u0017\u0010r\u001a\u00020\f2\b\u0010q\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\br\u0010<J\r\u0010s\u001a\u00020\u0006¢\u0006\u0004\bs\u0010YJ\u0015\u0010t\u001a\u00020\f2\u0006\u0010_\u001a\u00020^¢\u0006\u0004\bt\u0010aJ\u0017\u0010u\u001a\u00020\f2\u0006\u0010n\u001a\u00020\u001dH\u0002¢\u0006\u0004\bu\u0010-J\u0017\u0010v\u001a\u00020\f2\u0006\u0010n\u001a\u00020\u001dH\u0002¢\u0006\u0004\bv\u0010-J\u0017\u0010w\u001a\u00020\f2\u0006\u0010q\u001a\u00020\u0014H\u0002¢\u0006\u0004\bw\u0010<J\u0019\u0010x\u001a\u00020\f2\b\u0010q\u001a\u0004\u0018\u00010\u0014H\u0002¢\u0006\u0004\bx\u0010<J\u000f\u0010y\u001a\u00020\u0014H\u0002¢\u0006\u0004\by\u0010QJ\u0017\u0010|\u001a\u00020\f2\u0006\u0010{\u001a\u00020zH\u0002¢\u0006\u0004\b|\u0010}J\u0017\u0010~\u001a\u00020\f2\u0006\u0010G\u001a\u00020\u001dH\u0002¢\u0006\u0004\b~\u0010-J\u0017\u0010\u007f\u001a\u00020\f2\u0006\u0010n\u001a\u00020\u001dH\u0002¢\u0006\u0004\b\u007f\u0010-J\u0019\u0010\u0080\u0001\u001a\u00020\f2\u0006\u0010n\u001a\u00020\u001dH\u0002¢\u0006\u0005\b\u0080\u0001\u0010-R*\u0010\u0088\u0001\u001a\u00030\u0081\u00018\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0006\b\u0082\u0001\u0010\u0083\u0001\u001a\u0006\b\u0084\u0001\u0010\u0085\u0001\"\u0006\b\u0086\u0001\u0010\u0087\u0001R*\u0010\u0090\u0001\u001a\u00030\u0089\u00018\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0006\b\u008a\u0001\u0010\u008b\u0001\u001a\u0006\b\u008c\u0001\u0010\u008d\u0001\"\u0006\b\u008e\u0001\u0010\u008f\u0001R*\u0010\u0098\u0001\u001a\u00030\u0091\u00018\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0006\b\u0092\u0001\u0010\u0093\u0001\u001a\u0006\b\u0094\u0001\u0010\u0095\u0001\"\u0006\b\u0096\u0001\u0010\u0097\u0001R*\u0010 \u0001\u001a\u00030\u0099\u00018\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0006\b\u009a\u0001\u0010\u009b\u0001\u001a\u0006\b\u009c\u0001\u0010\u009d\u0001\"\u0006\b\u009e\u0001\u0010\u009f\u0001R*\u0010¨\u0001\u001a\u00030¡\u00018\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0006\b¢\u0001\u0010£\u0001\u001a\u0006\b¤\u0001\u0010¥\u0001\"\u0006\b¦\u0001\u0010§\u0001R*\u0010°\u0001\u001a\u00030©\u00018\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0006\bª\u0001\u0010«\u0001\u001a\u0006\b¬\u0001\u0010\u00ad\u0001\"\u0006\b®\u0001\u0010¯\u0001R*\u0010¸\u0001\u001a\u00030±\u00018\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0006\b²\u0001\u0010³\u0001\u001a\u0006\b´\u0001\u0010µ\u0001\"\u0006\b¶\u0001\u0010·\u0001R*\u0010À\u0001\u001a\u00030¹\u00018\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0006\bº\u0001\u0010»\u0001\u001a\u0006\b¼\u0001\u0010½\u0001\"\u0006\b¾\u0001\u0010¿\u0001R*\u0010È\u0001\u001a\u00030Á\u00018\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0006\bÂ\u0001\u0010Ã\u0001\u001a\u0006\bÄ\u0001\u0010Å\u0001\"\u0006\bÆ\u0001\u0010Ç\u0001R*\u0010Ð\u0001\u001a\u00030É\u00018\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0006\bÊ\u0001\u0010Ë\u0001\u001a\u0006\bÌ\u0001\u0010Í\u0001\"\u0006\bÎ\u0001\u0010Ï\u0001R*\u0010Ø\u0001\u001a\u00030Ñ\u00018\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0006\bÒ\u0001\u0010Ó\u0001\u001a\u0006\bÔ\u0001\u0010Õ\u0001\"\u0006\bÖ\u0001\u0010×\u0001R*\u0010à\u0001\u001a\u00030Ù\u00018\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0006\bÚ\u0001\u0010Û\u0001\u001a\u0006\bÜ\u0001\u0010Ý\u0001\"\u0006\bÞ\u0001\u0010ß\u0001R*\u0010è\u0001\u001a\u00030á\u00018\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0006\bâ\u0001\u0010ã\u0001\u001a\u0006\bä\u0001\u0010å\u0001\"\u0006\bæ\u0001\u0010ç\u0001R*\u0010ð\u0001\u001a\u00030é\u00018\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0006\bê\u0001\u0010ë\u0001\u001a\u0006\bì\u0001\u0010í\u0001\"\u0006\bî\u0001\u0010ï\u0001R*\u0010ø\u0001\u001a\u00030ñ\u00018\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0006\bò\u0001\u0010ó\u0001\u001a\u0006\bô\u0001\u0010õ\u0001\"\u0006\bö\u0001\u0010÷\u0001R!\u0010þ\u0001\u001a\u00030ù\u00018BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\bú\u0001\u0010û\u0001\u001a\u0006\bü\u0001\u0010ý\u0001R\u001f\u0010\u0081\u0002\u001a\u00020J8BX\u0082\u0084\u0002¢\u0006\u000f\n\u0006\bÿ\u0001\u0010û\u0001\u001a\u0005\b\u0080\u0002\u0010OR\u0016\u0010\u0083\u0002\u001a\u00020\u001d8BX\u0082\u0004¢\u0006\u0007\u001a\u0005\b\u0082\u0002\u0010\u001f¨\u0006\u0084\u0002"}, d2 = {"Lcom/sportybet/plugin/realsports/betslip/widget/BetSlipFooter;", "Landroid/widget/RelativeLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lto3;", "listener", "", "setListener", "(Lto3;)V", "Llas;", "lifecycleScope", "setActivityLifecycleScope", "(Llas;)V", "", "", "Lc9p;", "betSlipActivityTextUpdateJobs", "setTextUpdateJobs", "(Ljava/util/Map;)V", "Lbqy$a;", "config", "setOneCutConfig", "(Lbqy$a;)V", "", "getInsureEarlyPayoutActive", "()Z", "Ldkf;", "viewState", "setInsureEarlyPayoutViewState", "(Ldkf;)V", "Lhuy;", "getInsureOneTwoUpCase", "()Lhuy;", "Lxry;", "isSimpleBetSlipMode", "setInsureOneTwoUpViewState", "(Lxry;Z)V", AnalyticsParam.EVENT_STATUS_CHECKED, "setInsureOneTwoUpChecked", "(Z)V", "setInsureEarlyGoalsChecked", "isLoading", "setInsureEarlyGoalsLoading", "enable", "setInsureEarlyGoalsEnable", "setInsureOneTwoUpEnable", "setInVisibleLayout", "()V", "hasTax", "isEditMode", "setLoading", "(ZZ)V", "singleInput", "setInitSingle", "(Ljava/lang/String;)V", "initial", "Limn;", "obj", "setInitMultiple", "(ZLimn;)V", "betType", "msg", "isShowInvalidWarning", "setWarningAndInputUIStatus", "(ILjava/lang/String;Z)V", "isSim", "setBetTypeFooterVisibility", "(IZ)V", "Ljava/math/BigDecimal;", "bonus", "setBonus", "(Ljava/math/BigDecimal;)V", "getBonus", "()Ljava/math/BigDecimal;", "getDisplayedPotentialWinnings", "()Ljava/lang/String;", "getDisplayedTotalOdds", "getDisplayedBonus", "show", "tax", "setShowExciseTax", "(ZLjava/lang/String;)V", "getSingleInputViewHeight", "()I", "getMultiInputViewHeight", "setInputMinStakeHint", AnalyticsParam.EVENT_PARAM_IS_CHECKED, "setAnyWinChecked", "Lluo;", AnalyticsParam.EVENT_STATUS, "setEarlyPayoutEnable", "(Lluo;)V", "setOneCutEnable", "value", "setEditBetStake", "flexBetStatus", "oneCutStatus", "anyWinStatus", "earlyPayoutStatus", "isOneTwoUpConfigEnable", "setSportyInsure", "(Lluo;Lluo;Lluo;Lluo;ZZ)V", "isSelected", "setGiftsSelected", "isVisible", "setGiftsVisible", "setSimGiftsVisible", "text", "setGiftText", "getSimCurrentAutoTimes", "setAnyWinEnable", "setInsureOneTwoUpVisible", "setInsureEarlyPayoutVisible", "setInsureOneTwoUpText", "setSingleTotalStake", "getBonusTextWithCurrency", "Landroid/app/Activity;", "activity", "setMultipleTotalOddsMaxWidthTo70PercentScreen", "(Landroid/app/Activity;)V", "setBetBonusHintUI", "setOneCutUiVisible", "setAnyWinUiVisible", "Luqm;", "c", "Luqm;", "getAccountHelper", "()Luqm;", "setAccountHelper", "(Luqm;)V", "accountHelper", "Lm2l;", "d", "Lm2l;", "getDataStore", "()Lm2l;", "setDataStore", "(Lm2l;)V", "dataStore", "Lp8k;", "e", "Lp8k;", "getGetMaxStakeUseCase", "()Lp8k;", "setGetMaxStakeUseCase", "(Lp8k;)V", "getMaxStakeUseCase", "Lit90;", "f", "Lit90;", "getSingleBetUseCases", "()Lit90;", "setSingleBetUseCases", "(Lit90;)V", "singleBetUseCases", "Lpmw;", "i", "Lpmw;", "getMultipleBetUseCases", "()Lpmw;", "setMultipleBetUseCases", "(Lpmw;)V", "multipleBetUseCases", "Lp980;", "v", "Lp980;", "getSelectionUseCases", "()Lp980;", "setSelectionUseCases", "(Lp980;)V", "selectionUseCases", "Lshh0;", "w", "Lshh0;", "getUpFooterInsureUseCase", "()Lshh0;", "setUpFooterInsureUseCase", "(Lshh0;)V", "upFooterInsureUseCase", "Liez;", "y", "Liez;", "getOverUnderEarlyGoalInsureEnabledUseCase", "()Liez;", "setOverUnderEarlyGoalInsureEnabledUseCase", "(Liez;)V", "overUnderEarlyGoalInsureEnabledUseCase", "Ljrm;", "z", "Ljrm;", "getBetItem", "()Ljrm;", "setBetItem", "(Ljrm;)V", "betItem", "Llrm;", "A", "Llrm;", "getBetStore", "()Llrm;", "setBetStore", "(Llrm;)V", "betStore", "Lpsm;", "B", "Lpsm;", "getCountryManager", "()Lpsm;", "setCountryManager", "(Lpsm;)V", "countryManager", "Llq1;", "C", "Llq1;", "getBoConfigSource", "()Llq1;", "setBoConfigSource", "(Llq1;)V", "boConfigSource", "Lk650;", "D", "Lk650;", "getRemoteConfigRepository", "()Lk650;", "setRemoteConfigRepository", "(Lk650;)V", "remoteConfigRepository", "Liym;", "E", "Liym;", "getOpenTelemetryLogger", "()Liym;", "setOpenTelemetryLogger", "(Liym;)V", "openTelemetryLogger", "Lhvo;", "F", "Lhvo;", "getInsureMoreUiStateManager", "()Lhvo;", "setInsureMoreUiStateManager", "(Lhvo;)V", "insureMoreUiStateManager", "Lema;", "N", "Lttr;", "getCompositeDisposable", "()Lema;", "compositeDisposable", "O", "getNegativeOne", "negativeOne", "getFlexBetCashOutEnable", "flexBetCashOutEnable", "africa-bet-android"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class BetSlipFooter extends Hilt_BetSlipFooter {
    public static final /* synthetic */ int j0 = 0;

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    public lrm betStore;

    /* JADX INFO: renamed from: B, reason: from kotlin metadata */
    public psm countryManager;

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    public lq1 boConfigSource;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    public k650 remoteConfigRepository;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    public iym openTelemetryLogger;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    public hvo insureMoreUiStateManager;
    public final mgd0 G;
    public to3 H;
    public las I;
    public Map<String, c9p> J;
    public TaxConfigs K;
    public bqy.a L;
    public boolean M;
    public final mpe0 N;
    public final mpe0 O;
    public final zd2<onw> P;
    public final zd2<iw90> Q;
    public final zd2<Pair<TaxConfigs, String>> R;
    public final zd2<BigDecimal> S;
    public final zd2<String> T;
    public final jvo U;
    public boolean V;
    public huy W;
    public boolean a0;
    public avy b0;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public uqm accountHelper;
    public avy c0;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public m2l dataStore;
    public avy d0;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public p8k getMaxStakeUseCase;
    public dkf e0;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public it90 singleBetUseCases;
    public final w23 f0;
    public final b33 g0;
    public final StringBuilder h0;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    public pmw multipleBetUseCases;
    public final StringBuilder i0;

    /* JADX INFO: renamed from: v, reason: from kotlin metadata */
    public p980 selectionUseCases;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    public shh0 upFooterInsureUseCase;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    public iez overUnderEarlyGoalInsureEnabledUseCase;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    public jrm betItem;

    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] a;
        public static final /* synthetic */ int[] b;

        static {
            int[] iArr = new int[huy.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                huy huyVar = huy.a;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            int[] iArr2 = new int[luo.values().length];
            try {
                iArr2[0] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                luo luoVar = luo.a;
                iArr2[2] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                luo luoVar2 = luo.a;
                iArr2[1] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            a = iArr2;
            int[] iArr3 = new int[avy.values().length];
            try {
                iArr3[0] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                avy avyVar = avy.a;
                iArr3[1] = 2;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                avy avyVar2 = avy.a;
                iArr3[2] = 3;
            } catch (NoSuchFieldError unused8) {
            }
            b = iArr3;
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    @c0d(c = "com.sportybet.plugin.realsports.betslip.widget.BetSlipFooter$setSportyInsure$1$1", f = "BetSlipFooter.kt", l = {2345, 2359, 2375, 2389}, m = "invokeSuspend", v = 2)
    public static final class b extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;
        public int b;
        public final /* synthetic */ luo d;
        public final /* synthetic */ mgd0 e;
        public final /* synthetic */ luo f;
        public final /* synthetic */ luo i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(luo luoVar, mgd0 mgd0Var, luo luoVar2, luo luoVar3, v1b<? super b> v1bVar) {
            super(2, v1bVar);
            this.d = luoVar;
            this.e = mgd0Var;
            this.f = luoVar2;
            this.i = luoVar3;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return BetSlipFooter.this.new b(this.d, this.e, this.f, this.i, v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((b) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        /* JADX WARN: Code duplicated, block: B:36:0x00b0 A[PHI: r1
          0x00b0: PHI (r1v3 int) = (r1v2 int), (r1v2 int), (r1v2 int), (r1v2 int), (r1v2 int), (r1v5 int) binds: [B:22:0x0073, B:23:0x0075, B:25:0x007b, B:27:0x0083, B:29:0x008b, B:34:0x00a1] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:38:0x00b6  */
        /* JADX WARN: Code duplicated, block: B:41:0x00c6 A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:42:0x00c8  */
        /* JADX WARN: Code duplicated, block: B:44:0x00cf  */
        /* JADX WARN: Code duplicated, block: B:63:0x011b A[PHI: r1
          0x011b: PHI (r1v6 int) = (r1v4 int), (r1v4 int), (r1v4 int), (r1v4 int), (r1v4 int), (r1v4 int), (r1v8 int), (r1v8 int) binds: [B:43:0x00cd, B:45:0x00d1, B:47:0x00d9, B:49:0x00df, B:51:0x00e3, B:53:0x00e7, B:58:0x00fc, B:60:0x0104] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:65:0x0121  */
        /* JADX WARN: Code duplicated, block: B:67:0x0129  */
        /* JADX WARN: Code duplicated, block: B:68:0x0133 A[PHI: r1
          0x0133: PHI (r1v7 int) = (r1v4 int), (r1v6 int), (r1v6 int), (r1v8 int) binds: [B:40:0x00c4, B:67:0x0129, B:66:0x0127, B:62:0x0107] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:70:0x0139 A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:71:0x013b  */
        /* JADX WARN: Code duplicated, block: B:82:0x017f  */
        /* JADX WARN: Code duplicated, block: B:84:0x0185  */
        /* JADX WARN: Code duplicated, block: B:86:0x018d  */
        /* JADX WARN: Code restructure failed: missing block: B:31:0x0097, code lost:
        
            if (r12 == r0) goto L73;
         */
        /* JADX WARN: Code restructure failed: missing block: B:55:0x00f3, code lost:
        
            if (r12 == r0) goto L73;
         */
        /* JADX WARN: Code restructure failed: missing block: B:72:0x0147, code lost:
        
            if (r12 == r0) goto L73;
         */
        @Override // defpackage.pz1
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r12) {
            /*
                Method dump skipped, instruction units count: 410
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.sportybet.plugin.realsports.betslip.widget.BetSlipFooter.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public static final class c implements ViewTreeObserver.OnGlobalLayoutListener {
        public final /* synthetic */ CheckBox a;
        public final /* synthetic */ mgd0 b;

        public c(CheckBox checkBox, mgd0 mgd0Var) {
            this.a = checkBox;
            this.b = mgd0Var;
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public final void onGlobalLayout() {
            CheckBox checkBox = this.a;
            boolean zIsEnabled = checkBox.isEnabled();
            mgd0 mgd0Var = this.b;
            if (zIsEnabled && checkBox.isChecked()) {
                mgd0Var.T.setVisibility(0);
            } else {
                mgd0Var.T.setVisibility(8);
            }
            checkBox.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BetSlipFooter(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        context.getClass();
        boolean z = true;
        if (!isInEditMode() && !this.b) {
            this.b = true;
            ((e43) generatedComponent()).b(this);
        }
        int i2 = 0;
        View viewInflate = LayoutInflater.from(context).inflate(R.layout.spr_betslip_footer, (ViewGroup) this, false);
        addView(viewInflate);
        int i3 = R.id.any_win_arrow_up;
        ImageView imageView = (ImageView) h5e.a(R.id.any_win_arrow_up, viewInflate);
        if (imageView != null) {
            i3 = R.id.any_win_hint_content;
            TextView textView = (TextView) h5e.a(R.id.any_win_hint_content, viewInflate);
            if (textView != null) {
                i3 = R.id.any_win_hint_pop;
                BetSlipHintView betSlipHintView = (BetSlipHintView) h5e.a(R.id.any_win_hint_pop, viewInflate);
                if (betSlipHintView != null) {
                    i3 = R.id.any_win_hint_title;
                    TextView textView2 = (TextView) h5e.a(R.id.any_win_hint_title, viewInflate);
                    if (textView2 != null) {
                        i3 = R.id.arrow_down;
                        ArrowButton arrowButton = (ArrowButton) h5e.a(R.id.arrow_down, viewInflate);
                        if (arrowButton != null) {
                            i3 = R.id.arrow_up;
                            ArrowButton arrowButton2 = (ArrowButton) h5e.a(R.id.arrow_up, viewInflate);
                            if (arrowButton2 != null) {
                                i3 = R.id.betslip_flexible_container;
                                ConstraintLayout constraintLayout = (ConstraintLayout) h5e.a(R.id.betslip_flexible_container, viewInflate);
                                if (constraintLayout != null) {
                                    i3 = R.id.betslip_mission;
                                    ComposeView composeView = (ComposeView) h5e.a(R.id.betslip_mission, viewInflate);
                                    if (composeView != null) {
                                        i3 = R.id.betslip_total_stake;
                                        if (((TextView) h5e.a(R.id.betslip_total_stake, viewInflate)) != null) {
                                            i3 = R.id.bonus;
                                            TextView textView3 = (TextView) h5e.a(R.id.bonus, viewInflate);
                                            if (textView3 != null) {
                                                i3 = R.id.bonus_hint;
                                                ConstraintLayout constraintLayout2 = (ConstraintLayout) h5e.a(R.id.bonus_hint, viewInflate);
                                                if (constraintLayout2 != null) {
                                                    i3 = R.id.bonus_hint_progress;
                                                    ProgressBar progressBar = (ProgressBar) h5e.a(R.id.bonus_hint_progress, viewInflate);
                                                    if (progressBar != null) {
                                                        i3 = R.id.bonus_hint_text;
                                                        AppCompatTextView appCompatTextView = (AppCompatTextView) h5e.a(R.id.bonus_hint_text, viewInflate);
                                                        if (appCompatTextView != null) {
                                                            i3 = R.id.bonus_label;
                                                            TextView textView4 = (TextView) h5e.a(R.id.bonus_label, viewInflate);
                                                            if (textView4 != null) {
                                                                i3 = R.id.bonus_layout;
                                                                if (((FrameLayout) h5e.a(R.id.bonus_layout, viewInflate)) != null) {
                                                                    i3 = R.id.btn_swipe_bet;
                                                                    LinearLayout linearLayout = (LinearLayout) h5e.a(R.id.btn_swipe_bet, viewInflate);
                                                                    if (linearLayout != null) {
                                                                        i3 = R.id.checkbox_system_gift;
                                                                        CheckBox checkBox = (CheckBox) h5e.a(R.id.checkbox_system_gift, viewInflate);
                                                                        if (checkBox != null) {
                                                                            i3 = R.id.edit_bet_desc;
                                                                            AppCompatTextView appCompatTextView2 = (AppCompatTextView) h5e.a(R.id.edit_bet_desc, viewInflate);
                                                                            if (appCompatTextView2 != null) {
                                                                                i3 = R.id.excise_tax;
                                                                                TextView textView5 = (TextView) h5e.a(R.id.excise_tax, viewInflate);
                                                                                if (textView5 != null) {
                                                                                    i3 = R.id.excise_tax_label;
                                                                                    if (((TextView) h5e.a(R.id.excise_tax_label, viewInflate)) != null) {
                                                                                        i3 = R.id.excise_tax_layout;
                                                                                        RelativeLayout relativeLayout = (RelativeLayout) h5e.a(R.id.excise_tax_layout, viewInflate);
                                                                                        if (relativeLayout != null) {
                                                                                            i3 = R.id.flex_cashout_arrow_up;
                                                                                            ImageView imageView2 = (ImageView) h5e.a(R.id.flex_cashout_arrow_up, viewInflate);
                                                                                            if (imageView2 != null) {
                                                                                                i3 = R.id.flex_cashout_pop;
                                                                                                BetSlipHintView betSlipHintView2 = (BetSlipHintView) h5e.a(R.id.flex_cashout_pop, viewInflate);
                                                                                                if (betSlipHintView2 != null) {
                                                                                                    i3 = R.id.flexibet;
                                                                                                    RelativeLayout relativeLayout2 = (RelativeLayout) h5e.a(R.id.flexibet, viewInflate);
                                                                                                    if (relativeLayout2 != null) {
                                                                                                        i3 = R.id.flexibet_help;
                                                                                                        if (((ImageView) h5e.a(R.id.flexibet_help, viewInflate)) != null) {
                                                                                                            i3 = R.id.flexibet_hint;
                                                                                                            TextView textView6 = (TextView) h5e.a(R.id.flexibet_hint, viewInflate);
                                                                                                            if (textView6 != null) {
                                                                                                                i3 = R.id.flexibet_num;
                                                                                                                TextView textView7 = (TextView) h5e.a(R.id.flexibet_num, viewInflate);
                                                                                                                if (textView7 != null) {
                                                                                                                    i3 = R.id.flexibet_text;
                                                                                                                    if (((TextView) h5e.a(R.id.flexibet_text, viewInflate)) != null) {
                                                                                                                        i3 = R.id.flexible;
                                                                                                                        CheckBox checkBox2 = (CheckBox) h5e.a(R.id.flexible, viewInflate);
                                                                                                                        if (checkBox2 != null) {
                                                                                                                            i3 = R.id.flexicannot;
                                                                                                                            TextView textView8 = (TextView) h5e.a(R.id.flexicannot, viewInflate);
                                                                                                                            if (textView8 != null) {
                                                                                                                                i3 = R.id.flexipop;
                                                                                                                                BetSlipHintView betSlipHintView3 = (BetSlipHintView) h5e.a(R.id.flexipop, viewInflate);
                                                                                                                                if (betSlipHintView3 != null) {
                                                                                                                                    i3 = R.id.flexipop_container;
                                                                                                                                    ConstraintLayout constraintLayout3 = (ConstraintLayout) h5e.a(R.id.flexipop_container, viewInflate);
                                                                                                                                    if (constraintLayout3 != null) {
                                                                                                                                        i3 = R.id.full_win_title;
                                                                                                                                        TextView textView9 = (TextView) h5e.a(R.id.full_win_title, viewInflate);
                                                                                                                                        if (textView9 != null) {
                                                                                                                                            i3 = R.id.full_win_value;
                                                                                                                                            TextView textView10 = (TextView) h5e.a(R.id.full_win_value, viewInflate);
                                                                                                                                            if (textView10 != null) {
                                                                                                                                                i3 = R.id.indicator_layout;
                                                                                                                                                IndicatorLayout indicatorLayout = (IndicatorLayout) h5e.a(R.id.indicator_layout, viewInflate);
                                                                                                                                                if (indicatorLayout != null) {
                                                                                                                                                    i3 = R.id.insure_any_win_checkbox;
                                                                                                                                                    CheckBox checkBox3 = (CheckBox) h5e.a(R.id.insure_any_win_checkbox, viewInflate);
                                                                                                                                                    if (checkBox3 != null) {
                                                                                                                                                        i3 = R.id.insure_any_win_overlay;
                                                                                                                                                        View viewA = h5e.a(R.id.insure_any_win_overlay, viewInflate);
                                                                                                                                                        if (viewA != null) {
                                                                                                                                                            i3 = R.id.insure_container;
                                                                                                                                                            ConstraintLayout constraintLayout4 = (ConstraintLayout) h5e.a(R.id.insure_container, viewInflate);
                                                                                                                                                            if (constraintLayout4 != null) {
                                                                                                                                                                i3 = R.id.insure_early_goals;
                                                                                                                                                                CheckBox checkBox4 = (CheckBox) h5e.a(R.id.insure_early_goals, viewInflate);
                                                                                                                                                                if (checkBox4 != null) {
                                                                                                                                                                    i3 = R.id.insure_early_goals_overlay;
                                                                                                                                                                    View viewA2 = h5e.a(R.id.insure_early_goals_overlay, viewInflate);
                                                                                                                                                                    if (viewA2 != null) {
                                                                                                                                                                        i3 = R.id.insure_flexible_overlay;
                                                                                                                                                                        View viewA3 = h5e.a(R.id.insure_flexible_overlay, viewInflate);
                                                                                                                                                                        if (viewA3 != null) {
                                                                                                                                                                            i3 = R.id.insure_info;
                                                                                                                                                                            ConstraintLayout constraintLayout5 = (ConstraintLayout) h5e.a(R.id.insure_info, viewInflate);
                                                                                                                                                                            if (constraintLayout5 != null) {
                                                                                                                                                                                i3 = R.id.insure_more;
                                                                                                                                                                                TextView textView11 = (TextView) h5e.a(R.id.insure_more, viewInflate);
                                                                                                                                                                                if (textView11 != null) {
                                                                                                                                                                                    i3 = R.id.insure_one_cut_overlay;
                                                                                                                                                                                    View viewA4 = h5e.a(R.id.insure_one_cut_overlay, viewInflate);
                                                                                                                                                                                    if (viewA4 != null) {
                                                                                                                                                                                        i3 = R.id.insure_up_checkbox;
                                                                                                                                                                                        CheckBox checkBox5 = (CheckBox) h5e.a(R.id.insure_up_checkbox, viewInflate);
                                                                                                                                                                                        if (checkBox5 != null) {
                                                                                                                                                                                            i3 = R.id.insure_up_container;
                                                                                                                                                                                            LinearLayout linearLayout2 = (LinearLayout) h5e.a(R.id.insure_up_container, viewInflate);
                                                                                                                                                                                            if (linearLayout2 != null) {
                                                                                                                                                                                                i3 = R.id.insure_up_overlay;
                                                                                                                                                                                                View viewA5 = h5e.a(R.id.insure_up_overlay, viewInflate);
                                                                                                                                                                                                if (viewA5 != null) {
                                                                                                                                                                                                    i3 = R.id.insure_up_text;
                                                                                                                                                                                                    TextView textView12 = (TextView) h5e.a(R.id.insure_up_text, viewInflate);
                                                                                                                                                                                                    if (textView12 != null) {
                                                                                                                                                                                                        i3 = R.id.invalid_warning;
                                                                                                                                                                                                        TextView textView13 = (TextView) h5e.a(R.id.invalid_warning, viewInflate);
                                                                                                                                                                                                        if (textView13 != null) {
                                                                                                                                                                                                            i3 = R.id.line;
                                                                                                                                                                                                            View viewA6 = h5e.a(R.id.line, viewInflate);
                                                                                                                                                                                                            if (viewA6 != null) {
                                                                                                                                                                                                                i3 = R.id.multiple_keyboard_view;
                                                                                                                                                                                                                EditTextWithKeyBoard editTextWithKeyBoard = (EditTextWithKeyBoard) h5e.a(R.id.multiple_keyboard_view, viewInflate);
                                                                                                                                                                                                                if (editTextWithKeyBoard != null) {
                                                                                                                                                                                                                    i3 = R.id.multiple_parent;
                                                                                                                                                                                                                    RelativeLayout relativeLayout3 = (RelativeLayout) h5e.a(R.id.multiple_parent, viewInflate);
                                                                                                                                                                                                                    if (relativeLayout3 != null) {
                                                                                                                                                                                                                        i3 = R.id.multiple_simulate_times_panel;
                                                                                                                                                                                                                        SimulateAutoBetPanel simulateAutoBetPanel = (SimulateAutoBetPanel) h5e.a(R.id.multiple_simulate_times_panel, viewInflate);
                                                                                                                                                                                                                        if (simulateAutoBetPanel != null) {
                                                                                                                                                                                                                            i3 = R.id.multiple_total_odds;
                                                                                                                                                                                                                            TextView textView14 = (TextView) h5e.a(R.id.multiple_total_odds, viewInflate);
                                                                                                                                                                                                                            if (textView14 != null) {
                                                                                                                                                                                                                                i3 = R.id.multiple_total_odds_text;
                                                                                                                                                                                                                                if (((TextView) h5e.a(R.id.multiple_total_odds_text, viewInflate)) != null) {
                                                                                                                                                                                                                                    i3 = R.id.multiple_total_stake_label;
                                                                                                                                                                                                                                    TextView textView15 = (TextView) h5e.a(R.id.multiple_total_stake_label, viewInflate);
                                                                                                                                                                                                                                    if (textView15 != null) {
                                                                                                                                                                                                                                        i3 = R.id.multiple_total_stake_value;
                                                                                                                                                                                                                                        TextView textView16 = (TextView) h5e.a(R.id.multiple_total_stake_value, viewInflate);
                                                                                                                                                                                                                                        if (textView16 != null) {
                                                                                                                                                                                                                                            i3 = R.id.net_win;
                                                                                                                                                                                                                                            TextView textView17 = (TextView) h5e.a(R.id.net_win, viewInflate);
                                                                                                                                                                                                                                            if (textView17 != null) {
                                                                                                                                                                                                                                                i3 = R.id.net_win_bg;
                                                                                                                                                                                                                                                ConstraintLayout constraintLayout6 = (ConstraintLayout) h5e.a(R.id.net_win_bg, viewInflate);
                                                                                                                                                                                                                                                if (constraintLayout6 != null) {
                                                                                                                                                                                                                                                    i3 = R.id.net_win_label;
                                                                                                                                                                                                                                                    TextView textView18 = (TextView) h5e.a(R.id.net_win_label, viewInflate);
                                                                                                                                                                                                                                                    if (textView18 != null) {
                                                                                                                                                                                                                                                        i3 = R.id.one_cut;
                                                                                                                                                                                                                                                        CheckBox checkBox6 = (CheckBox) h5e.a(R.id.one_cut, viewInflate);
                                                                                                                                                                                                                                                        if (checkBox6 != null) {
                                                                                                                                                                                                                                                            i3 = R.id.one_cut_arrow_up;
                                                                                                                                                                                                                                                            ImageView imageView3 = (ImageView) h5e.a(R.id.one_cut_arrow_up, viewInflate);
                                                                                                                                                                                                                                                            if (imageView3 != null) {
                                                                                                                                                                                                                                                                i3 = R.id.one_cut_hint;
                                                                                                                                                                                                                                                                TextView textView19 = (TextView) h5e.a(R.id.one_cut_hint, viewInflate);
                                                                                                                                                                                                                                                                if (textView19 != null) {
                                                                                                                                                                                                                                                                    i3 = R.id.one_cut_hint_title;
                                                                                                                                                                                                                                                                    TextView textView20 = (TextView) h5e.a(R.id.one_cut_hint_title, viewInflate);
                                                                                                                                                                                                                                                                    if (textView20 != null) {
                                                                                                                                                                                                                                                                        i3 = R.id.one_cut_slider_bar;
                                                                                                                                                                                                                                                                        SeekBar seekBar = (SeekBar) h5e.a(R.id.one_cut_slider_bar, viewInflate);
                                                                                                                                                                                                                                                                        if (seekBar != null) {
                                                                                                                                                                                                                                                                            i3 = R.id.one_cut_slider_pop;
                                                                                                                                                                                                                                                                            BetSlipHintView betSlipHintView4 = (BetSlipHintView) h5e.a(R.id.one_cut_slider_pop, viewInflate);
                                                                                                                                                                                                                                                                            if (betSlipHintView4 != null) {
                                                                                                                                                                                                                                                                                i3 = R.id.one_cut_still_win;
                                                                                                                                                                                                                                                                                TextView textView21 = (TextView) h5e.a(R.id.one_cut_still_win, viewInflate);
                                                                                                                                                                                                                                                                                if (textView21 != null) {
                                                                                                                                                                                                                                                                                    i3 = R.id.one_cut_still_win_bg;
                                                                                                                                                                                                                                                                                    RelativeLayout relativeLayout4 = (RelativeLayout) h5e.a(R.id.one_cut_still_win_bg, viewInflate);
                                                                                                                                                                                                                                                                                    if (relativeLayout4 != null) {
                                                                                                                                                                                                                                                                                        i3 = R.id.one_cut_still_win_label;
                                                                                                                                                                                                                                                                                        AppCompatTextView appCompatTextView3 = (AppCompatTextView) h5e.a(R.id.one_cut_still_win_label, viewInflate);
                                                                                                                                                                                                                                                                                        if (appCompatTextView3 != null) {
                                                                                                                                                                                                                                                                                            i3 = R.id.options_flow;
                                                                                                                                                                                                                                                                                            if (((Flow) h5e.a(R.id.options_flow, viewInflate)) != null) {
                                                                                                                                                                                                                                                                                                i3 = R.id.single_betslip_mission;
                                                                                                                                                                                                                                                                                                ComposeView composeView2 = (ComposeView) h5e.a(R.id.single_betslip_mission, viewInflate);
                                                                                                                                                                                                                                                                                                if (composeView2 != null) {
                                                                                                                                                                                                                                                                                                    i3 = R.id.single_early_goals_container;
                                                                                                                                                                                                                                                                                                    CheckBox checkBox7 = (CheckBox) h5e.a(R.id.single_early_goals_container, viewInflate);
                                                                                                                                                                                                                                                                                                    if (checkBox7 != null) {
                                                                                                                                                                                                                                                                                                        i3 = R.id.single_early_goals_overlay;
                                                                                                                                                                                                                                                                                                        View viewA7 = h5e.a(R.id.single_early_goals_overlay, viewInflate);
                                                                                                                                                                                                                                                                                                        if (viewA7 != null) {
                                                                                                                                                                                                                                                                                                            i3 = R.id.single_insure;
                                                                                                                                                                                                                                                                                                            ConstraintLayout constraintLayout7 = (ConstraintLayout) h5e.a(R.id.single_insure, viewInflate);
                                                                                                                                                                                                                                                                                                            if (constraintLayout7 != null) {
                                                                                                                                                                                                                                                                                                                i3 = R.id.single_insure_container;
                                                                                                                                                                                                                                                                                                                ConstraintLayout constraintLayout8 = (ConstraintLayout) h5e.a(R.id.single_insure_container, viewInflate);
                                                                                                                                                                                                                                                                                                                if (constraintLayout8 != null) {
                                                                                                                                                                                                                                                                                                                    i3 = R.id.single_insure_info;
                                                                                                                                                                                                                                                                                                                    if (((ImageView) h5e.a(R.id.single_insure_info, viewInflate)) != null) {
                                                                                                                                                                                                                                                                                                                        i3 = R.id.single_insure_title;
                                                                                                                                                                                                                                                                                                                        if (((TextView) h5e.a(R.id.single_insure_title, viewInflate)) != null) {
                                                                                                                                                                                                                                                                                                                            i3 = R.id.single_parent;
                                                                                                                                                                                                                                                                                                                            ConstraintLayout constraintLayout9 = (ConstraintLayout) h5e.a(R.id.single_parent, viewInflate);
                                                                                                                                                                                                                                                                                                                            if (constraintLayout9 != null) {
                                                                                                                                                                                                                                                                                                                                i3 = R.id.single_simulate_times_panel;
                                                                                                                                                                                                                                                                                                                                SimulateAutoBetPanel simulateAutoBetPanel2 = (SimulateAutoBetPanel) h5e.a(R.id.single_simulate_times_panel, viewInflate);
                                                                                                                                                                                                                                                                                                                                if (simulateAutoBetPanel2 != null) {
                                                                                                                                                                                                                                                                                                                                    i3 = R.id.single_up_checkbox;
                                                                                                                                                                                                                                                                                                                                    CheckBox checkBox8 = (CheckBox) h5e.a(R.id.single_up_checkbox, viewInflate);
                                                                                                                                                                                                                                                                                                                                    if (checkBox8 != null) {
                                                                                                                                                                                                                                                                                                                                        i3 = R.id.single_up_container;
                                                                                                                                                                                                                                                                                                                                        LinearLayout linearLayout3 = (LinearLayout) h5e.a(R.id.single_up_container, viewInflate);
                                                                                                                                                                                                                                                                                                                                        if (linearLayout3 != null) {
                                                                                                                                                                                                                                                                                                                                            i3 = R.id.single_up_overlay;
                                                                                                                                                                                                                                                                                                                                            View viewA8 = h5e.a(R.id.single_up_overlay, viewInflate);
                                                                                                                                                                                                                                                                                                                                            if (viewA8 != null) {
                                                                                                                                                                                                                                                                                                                                                i3 = R.id.single_up_text;
                                                                                                                                                                                                                                                                                                                                                TextView textView22 = (TextView) h5e.a(R.id.single_up_text, viewInflate);
                                                                                                                                                                                                                                                                                                                                                if (textView22 != null) {
                                                                                                                                                                                                                                                                                                                                                    i3 = R.id.singles_keyboard_view;
                                                                                                                                                                                                                                                                                                                                                    EditTextWithKeyBoard editTextWithKeyBoard2 = (EditTextWithKeyBoard) h5e.a(R.id.singles_keyboard_view, viewInflate);
                                                                                                                                                                                                                                                                                                                                                    if (editTextWithKeyBoard2 != null) {
                                                                                                                                                                                                                                                                                                                                                        i3 = R.id.singles_total_stake;
                                                                                                                                                                                                                                                                                                                                                        TextView textView23 = (TextView) h5e.a(R.id.singles_total_stake, viewInflate);
                                                                                                                                                                                                                                                                                                                                                        if (textView23 != null) {
                                                                                                                                                                                                                                                                                                                                                            i3 = R.id.sporty_insure;
                                                                                                                                                                                                                                                                                                                                                            FlexboxLayout flexboxLayout = (FlexboxLayout) h5e.a(R.id.sporty_insure, viewInflate);
                                                                                                                                                                                                                                                                                                                                                            if (flexboxLayout != null) {
                                                                                                                                                                                                                                                                                                                                                                i3 = R.id.sporty_insure_title;
                                                                                                                                                                                                                                                                                                                                                                if (((TextView) h5e.a(R.id.sporty_insure_title, viewInflate)) != null) {
                                                                                                                                                                                                                                                                                                                                                                    i3 = R.id.system_betslip_mission;
                                                                                                                                                                                                                                                                                                                                                                    ComposeView composeView3 = (ComposeView) h5e.a(R.id.system_betslip_mission, viewInflate);
                                                                                                                                                                                                                                                                                                                                                                    if (composeView3 != null) {
                                                                                                                                                                                                                                                                                                                                                                        i3 = R.id.system_early_goals_container;
                                                                                                                                                                                                                                                                                                                                                                        CheckBox checkBox9 = (CheckBox) h5e.a(R.id.system_early_goals_container, viewInflate);
                                                                                                                                                                                                                                                                                                                                                                        if (checkBox9 != null) {
                                                                                                                                                                                                                                                                                                                                                                            i3 = R.id.system_early_goals_overlay;
                                                                                                                                                                                                                                                                                                                                                                            View viewA9 = h5e.a(R.id.system_early_goals_overlay, viewInflate);
                                                                                                                                                                                                                                                                                                                                                                            if (viewA9 != null) {
                                                                                                                                                                                                                                                                                                                                                                                i3 = R.id.system_flexbox_layout;
                                                                                                                                                                                                                                                                                                                                                                                if (((FlexboxLayout) h5e.a(R.id.system_flexbox_layout, viewInflate)) != null) {
                                                                                                                                                                                                                                                                                                                                                                                    i3 = R.id.system_gift;
                                                                                                                                                                                                                                                                                                                                                                                    LinearLayout linearLayout4 = (LinearLayout) h5e.a(R.id.system_gift, viewInflate);
                                                                                                                                                                                                                                                                                                                                                                                    if (linearLayout4 != null) {
                                                                                                                                                                                                                                                                                                                                                                                        i3 = R.id.system_insure;
                                                                                                                                                                                                                                                                                                                                                                                        ConstraintLayout constraintLayout10 = (ConstraintLayout) h5e.a(R.id.system_insure, viewInflate);
                                                                                                                                                                                                                                                                                                                                                                                        if (constraintLayout10 != null) {
                                                                                                                                                                                                                                                                                                                                                                                            i3 = R.id.system_insure_container;
                                                                                                                                                                                                                                                                                                                                                                                            ConstraintLayout constraintLayout11 = (ConstraintLayout) h5e.a(R.id.system_insure_container, viewInflate);
                                                                                                                                                                                                                                                                                                                                                                                            if (constraintLayout11 != null) {
                                                                                                                                                                                                                                                                                                                                                                                                i3 = R.id.system_insure_info;
                                                                                                                                                                                                                                                                                                                                                                                                if (((ImageView) h5e.a(R.id.system_insure_info, viewInflate)) != null) {
                                                                                                                                                                                                                                                                                                                                                                                                    i3 = R.id.system_insure_title;
                                                                                                                                                                                                                                                                                                                                                                                                    if (((TextView) h5e.a(R.id.system_insure_title, viewInflate)) != null) {
                                                                                                                                                                                                                                                                                                                                                                                                        i3 = R.id.system_parent;
                                                                                                                                                                                                                                                                                                                                                                                                        RelativeLayout relativeLayout5 = (RelativeLayout) h5e.a(R.id.system_parent, viewInflate);
                                                                                                                                                                                                                                                                                                                                                                                                        if (relativeLayout5 != null) {
                                                                                                                                                                                                                                                                                                                                                                                                            i3 = R.id.system_total_stake;
                                                                                                                                                                                                                                                                                                                                                                                                            TextView textView24 = (TextView) h5e.a(R.id.system_total_stake, viewInflate);
                                                                                                                                                                                                                                                                                                                                                                                                            if (textView24 != null) {
                                                                                                                                                                                                                                                                                                                                                                                                                i3 = R.id.system_up_checkbox;
                                                                                                                                                                                                                                                                                                                                                                                                                CheckBox checkBox10 = (CheckBox) h5e.a(R.id.system_up_checkbox, viewInflate);
                                                                                                                                                                                                                                                                                                                                                                                                                if (checkBox10 != null) {
                                                                                                                                                                                                                                                                                                                                                                                                                    i3 = R.id.system_up_container;
                                                                                                                                                                                                                                                                                                                                                                                                                    LinearLayout linearLayout5 = (LinearLayout) h5e.a(R.id.system_up_container, viewInflate);
                                                                                                                                                                                                                                                                                                                                                                                                                    if (linearLayout5 != null) {
                                                                                                                                                                                                                                                                                                                                                                                                                        i3 = R.id.system_up_overlay;
                                                                                                                                                                                                                                                                                                                                                                                                                        View viewA10 = h5e.a(R.id.system_up_overlay, viewInflate);
                                                                                                                                                                                                                                                                                                                                                                                                                        if (viewA10 != null) {
                                                                                                                                                                                                                                                                                                                                                                                                                            i3 = R.id.system_up_text;
                                                                                                                                                                                                                                                                                                                                                                                                                            TextView textView25 = (TextView) h5e.a(R.id.system_up_text, viewInflate);
                                                                                                                                                                                                                                                                                                                                                                                                                            if (textView25 != null) {
                                                                                                                                                                                                                                                                                                                                                                                                                                i3 = R.id.tv_system_gift;
                                                                                                                                                                                                                                                                                                                                                                                                                                TextView textView26 = (TextView) h5e.a(R.id.tv_system_gift, viewInflate);
                                                                                                                                                                                                                                                                                                                                                                                                                                if (textView26 != null) {
                                                                                                                                                                                                                                                                                                                                                                                                                                    i3 = R.id.wh_tax;
                                                                                                                                                                                                                                                                                                                                                                                                                                    TextView textView27 = (TextView) h5e.a(R.id.wh_tax, viewInflate);
                                                                                                                                                                                                                                                                                                                                                                                                                                    if (textView27 != null) {
                                                                                                                                                                                                                                                                                                                                                                                                                                        i3 = R.id.wh_tax_label;
                                                                                                                                                                                                                                                                                                                                                                                                                                        TextView textView28 = (TextView) h5e.a(R.id.wh_tax_label, viewInflate);
                                                                                                                                                                                                                                                                                                                                                                                                                                        if (textView28 != null) {
                                                                                                                                                                                                                                                                                                                                                                                                                                            final mgd0 mgd0Var = new mgd0((RelativeLayout) viewInflate, imageView, textView, betSlipHintView, textView2, arrowButton, arrowButton2, constraintLayout, composeView, textView3, constraintLayout2, progressBar, appCompatTextView, textView4, linearLayout, checkBox, appCompatTextView2, textView5, relativeLayout, imageView2, betSlipHintView2, relativeLayout2, textView6, textView7, checkBox2, textView8, betSlipHintView3, constraintLayout3, textView9, textView10, indicatorLayout, checkBox3, viewA, constraintLayout4, checkBox4, viewA2, viewA3, constraintLayout5, textView11, viewA4, checkBox5, linearLayout2, viewA5, textView12, textView13, viewA6, editTextWithKeyBoard, relativeLayout3, simulateAutoBetPanel, textView14, textView15, textView16, textView17, constraintLayout6, textView18, checkBox6, imageView3, textView19, textView20, seekBar, betSlipHintView4, textView21, relativeLayout4, appCompatTextView3, composeView2, checkBox7, viewA7, constraintLayout7, constraintLayout8, constraintLayout9, simulateAutoBetPanel2, checkBox8, linearLayout3, viewA8, textView22, editTextWithKeyBoard2, textView23, flexboxLayout, composeView3, checkBox9, viewA9, linearLayout4, constraintLayout10, constraintLayout11, relativeLayout5, textView24, checkBox10, linearLayout5, viewA10, textView25, textView26, textView27, textView28);
                                                                                                                                                                                                                                                                                                                                                                                                                                            this.G = mgd0Var;
                                                                                                                                                                                                                                                                                                                                                                                                                                            this.N = hwr.b(new a23(i2));
                                                                                                                                                                                                                                                                                                                                                                                                                                            this.O = hwr.b(new l23(0));
                                                                                                                                                                                                                                                                                                                                                                                                                                            this.P = new zd2<>();
                                                                                                                                                                                                                                                                                                                                                                                                                                            this.Q = new zd2<>();
                                                                                                                                                                                                                                                                                                                                                                                                                                            this.R = new zd2<>();
                                                                                                                                                                                                                                                                                                                                                                                                                                            this.S = new zd2<>();
                                                                                                                                                                                                                                                                                                                                                                                                                                            this.T = new zd2<>();
                                                                                                                                                                                                                                                                                                                                                                                                                                            this.U = new jvo(context);
                                                                                                                                                                                                                                                                                                                                                                                                                                            this.W = huy.a;
                                                                                                                                                                                                                                                                                                                                                                                                                                            avy avyVar = avy.c;
                                                                                                                                                                                                                                                                                                                                                                                                                                            this.c0 = avyVar;
                                                                                                                                                                                                                                                                                                                                                                                                                                            this.d0 = avyVar;
                                                                                                                                                                                                                                                                                                                                                                                                                                            this.e0 = dkf.c.a;
                                                                                                                                                                                                                                                                                                                                                                                                                                            this.f0 = new w23(this, i2);
                                                                                                                                                                                                                                                                                                                                                                                                                                            this.g0 = new b33(this, 0);
                                                                                                                                                                                                                                                                                                                                                                                                                                            this.W = getUpFooterInsureUseCase().c();
                                                                                                                                                                                                                                                                                                                                                                                                                                            CompoundButton.OnCheckedChangeListener onCheckedChangeListener = new CompoundButton.OnCheckedChangeListener() { // from class: d33
                                                                                                                                                                                                                                                                                                                                                                                                                                                @Override // android.widget.CompoundButton.OnCheckedChangeListener
                                                                                                                                                                                                                                                                                                                                                                                                                                                public final void onCheckedChanged(CompoundButton compoundButton, boolean z2) {
                                                                                                                                                                                                                                                                                                                                                                                                                                                    int i4 = BetSlipFooter.j0;
                                                                                                                                                                                                                                                                                                                                                                                                                                                    compoundButton.getClass();
                                                                                                                                                                                                                                                                                                                                                                                                                                                    to3 to3Var = this.a.H;
                                                                                                                                                                                                                                                                                                                                                                                                                                                    if (to3Var != null) {
                                                                                                                                                                                                                                                                                                                                                                                                                                                        to3Var.h0("onecut", z2);
                                                                                                                                                                                                                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                                                                                                                                                                                            };
                                                                                                                                                                                                                                                                                                                                                                                                                                            CheckBox checkBox11 = mgd0Var.s0;
                                                                                                                                                                                                                                                                                                                                                                                                                                            checkBox11.setOnCheckedChangeListener(onCheckedChangeListener);
                                                                                                                                                                                                                                                                                                                                                                                                                                            mgd0Var.c0.setOnClickListener(new View.OnClickListener() { // from class: n13
                                                                                                                                                                                                                                                                                                                                                                                                                                                @Override // android.view.View.OnClickListener
                                                                                                                                                                                                                                                                                                                                                                                                                                                public final void onClick(View view) {
                                                                                                                                                                                                                                                                                                                                                                                                                                                    to3 to3Var = this.a.H;
                                                                                                                                                                                                                                                                                                                                                                                                                                                    if (to3Var != null) {
                                                                                                                                                                                                                                                                                                                                                                                                                                                        to3Var.d1("onecut");
                                                                                                                                                                                                                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                                                                                                                                                                                            });
                                                                                                                                                                                                                                                                                                                                                                                                                                            CompoundButton.OnCheckedChangeListener onCheckedChangeListener2 = new CompoundButton.OnCheckedChangeListener() { // from class: w13
                                                                                                                                                                                                                                                                                                                                                                                                                                                @Override // android.widget.CompoundButton.OnCheckedChangeListener
                                                                                                                                                                                                                                                                                                                                                                                                                                                public final void onCheckedChanged(CompoundButton compoundButton, boolean z2) {
                                                                                                                                                                                                                                                                                                                                                                                                                                                    int i4 = BetSlipFooter.j0;
                                                                                                                                                                                                                                                                                                                                                                                                                                                    compoundButton.getClass();
                                                                                                                                                                                                                                                                                                                                                                                                                                                    to3 to3Var = this.a.H;
                                                                                                                                                                                                                                                                                                                                                                                                                                                    if (to3Var != null) {
                                                                                                                                                                                                                                                                                                                                                                                                                                                        to3Var.h0("flexibet", z2);
                                                                                                                                                                                                                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                                                                                                                                                                                            };
                                                                                                                                                                                                                                                                                                                                                                                                                                            CheckBox checkBox12 = mgd0Var.N;
                                                                                                                                                                                                                                                                                                                                                                                                                                            checkBox12.setOnCheckedChangeListener(onCheckedChangeListener2);
                                                                                                                                                                                                                                                                                                                                                                                                                                            mgd0Var.Z.setOnClickListener(new View.OnClickListener() { // from class: x13
                                                                                                                                                                                                                                                                                                                                                                                                                                                @Override // android.view.View.OnClickListener
                                                                                                                                                                                                                                                                                                                                                                                                                                                public final void onClick(View view) {
                                                                                                                                                                                                                                                                                                                                                                                                                                                    to3 to3Var = this.a.H;
                                                                                                                                                                                                                                                                                                                                                                                                                                                    if (to3Var != null) {
                                                                                                                                                                                                                                                                                                                                                                                                                                                        to3Var.d1("flexibet");
                                                                                                                                                                                                                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                                                                                                                                                                                            });
                                                                                                                                                                                                                                                                                                                                                                                                                                            CompoundButton.OnCheckedChangeListener onCheckedChangeListener3 = new CompoundButton.OnCheckedChangeListener() { // from class: y13
                                                                                                                                                                                                                                                                                                                                                                                                                                                @Override // android.widget.CompoundButton.OnCheckedChangeListener
                                                                                                                                                                                                                                                                                                                                                                                                                                                public final void onCheckedChanged(CompoundButton compoundButton, boolean z2) {
                                                                                                                                                                                                                                                                                                                                                                                                                                                    int i4 = BetSlipFooter.j0;
                                                                                                                                                                                                                                                                                                                                                                                                                                                    compoundButton.getClass();
                                                                                                                                                                                                                                                                                                                                                                                                                                                    to3 to3Var = this.a.H;
                                                                                                                                                                                                                                                                                                                                                                                                                                                    if (to3Var != null) {
                                                                                                                                                                                                                                                                                                                                                                                                                                                        to3Var.h0("anywin", z2);
                                                                                                                                                                                                                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                                                                                                                                                                                            };
                                                                                                                                                                                                                                                                                                                                                                                                                                            CheckBox checkBox13 = mgd0Var.U;
                                                                                                                                                                                                                                                                                                                                                                                                                                            checkBox13.setOnCheckedChangeListener(onCheckedChangeListener3);
                                                                                                                                                                                                                                                                                                                                                                                                                                            mgd0Var.V.setOnClickListener(new View.OnClickListener() { // from class: z13
                                                                                                                                                                                                                                                                                                                                                                                                                                                @Override // android.view.View.OnClickListener
                                                                                                                                                                                                                                                                                                                                                                                                                                                public final void onClick(View view) {
                                                                                                                                                                                                                                                                                                                                                                                                                                                    to3 to3Var = this.a.H;
                                                                                                                                                                                                                                                                                                                                                                                                                                                    if (to3Var != null) {
                                                                                                                                                                                                                                                                                                                                                                                                                                                        to3Var.d1("anywin");
                                                                                                                                                                                                                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                                                                                                                                                                                            });
                                                                                                                                                                                                                                                                                                                                                                                                                                            mgd0Var.Y.setOnClickListener(new View.OnClickListener() { // from class: b23
                                                                                                                                                                                                                                                                                                                                                                                                                                                @Override // android.view.View.OnClickListener
                                                                                                                                                                                                                                                                                                                                                                                                                                                public final void onClick(View view) {
                                                                                                                                                                                                                                                                                                                                                                                                                                                    to3 to3Var = this.a.H;
                                                                                                                                                                                                                                                                                                                                                                                                                                                    if (to3Var != null) {
                                                                                                                                                                                                                                                                                                                                                                                                                                                        to3Var.d1("early_goals");
                                                                                                                                                                                                                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                                                                                                                                                                                            });
                                                                                                                                                                                                                                                                                                                                                                                                                                            mgd0Var.D0.setOnClickListener(new View.OnClickListener() { // from class: c23
                                                                                                                                                                                                                                                                                                                                                                                                                                                @Override // android.view.View.OnClickListener
                                                                                                                                                                                                                                                                                                                                                                                                                                                public final void onClick(View view) {
                                                                                                                                                                                                                                                                                                                                                                                                                                                    to3 to3Var = this.a.H;
                                                                                                                                                                                                                                                                                                                                                                                                                                                    if (to3Var != null) {
                                                                                                                                                                                                                                                                                                                                                                                                                                                        to3Var.d1("early_goals");
                                                                                                                                                                                                                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                                                                                                                                                                                            });
                                                                                                                                                                                                                                                                                                                                                                                                                                            viewA9.setOnClickListener(new View.OnClickListener() { // from class: d23
                                                                                                                                                                                                                                                                                                                                                                                                                                                @Override // android.view.View.OnClickListener
                                                                                                                                                                                                                                                                                                                                                                                                                                                public final void onClick(View view) {
                                                                                                                                                                                                                                                                                                                                                                                                                                                    to3 to3Var = this.a.H;
                                                                                                                                                                                                                                                                                                                                                                                                                                                    if (to3Var != null) {
                                                                                                                                                                                                                                                                                                                                                                                                                                                        to3Var.d1("early_goals");
                                                                                                                                                                                                                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                                                                                                                                                                                            });
                                                                                                                                                                                                                                                                                                                                                                                                                                            CompoundButton.OnCheckedChangeListener onCheckedChangeListener4 = new CompoundButton.OnCheckedChangeListener() { // from class: e23
                                                                                                                                                                                                                                                                                                                                                                                                                                                @Override // android.widget.CompoundButton.OnCheckedChangeListener
                                                                                                                                                                                                                                                                                                                                                                                                                                                public final void onCheckedChanged(CompoundButton compoundButton, boolean z2) {
                                                                                                                                                                                                                                                                                                                                                                                                                                                    int i4 = BetSlipFooter.j0;
                                                                                                                                                                                                                                                                                                                                                                                                                                                    compoundButton.getClass();
                                                                                                                                                                                                                                                                                                                                                                                                                                                    BetSlipFooter betSlipFooter = this.a;
                                                                                                                                                                                                                                                                                                                                                                                                                                                    to3 to3Var = betSlipFooter.H;
                                                                                                                                                                                                                                                                                                                                                                                                                                                    if (to3Var != null) {
                                                                                                                                                                                                                                                                                                                                                                                                                                                        to3Var.h0(BetSlipFooter.i(betSlipFooter.W), z2);
                                                                                                                                                                                                                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                                                                                                                                                                                            };
                                                                                                                                                                                                                                                                                                                                                                                                                                            CheckBox checkBox14 = mgd0Var.d0;
                                                                                                                                                                                                                                                                                                                                                                                                                                            checkBox14.setOnCheckedChangeListener(onCheckedChangeListener4);
                                                                                                                                                                                                                                                                                                                                                                                                                                            mgd0Var.W.setVisibility(iw2.f() ? 0 : 8);
                                                                                                                                                                                                                                                                                                                                                                                                                                            checkBox12.setChecked(g93.a().o() && iw2.f());
                                                                                                                                                                                                                                                                                                                                                                                                                                            checkBox11.setChecked(g93.a().M() && iw2.f());
                                                                                                                                                                                                                                                                                                                                                                                                                                            checkBox13.setChecked(g93.a().A() && iw2.f());
                                                                                                                                                                                                                                                                                                                                                                                                                                            mhh0 mhh0VarA = nhh0.a(getUpFooterInsureUseCase().d);
                                                                                                                                                                                                                                                                                                                                                                                                                                            if (!mhh0VarA.c && !mhh0VarA.d) {
                                                                                                                                                                                                                                                                                                                                                                                                                                                z = false;
                                                                                                                                                                                                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                                                                                                                                                                                                            setInsureOneTwoUpChecked(z);
                                                                                                                                                                                                                                                                                                                                                                                                                                            mgd0Var.E0.setOnClickListener(new View.OnClickListener() { // from class: e33
                                                                                                                                                                                                                                                                                                                                                                                                                                                @Override // android.view.View.OnClickListener
                                                                                                                                                                                                                                                                                                                                                                                                                                                public final void onClick(View view) {
                                                                                                                                                                                                                                                                                                                                                                                                                                                    to3 to3Var = this.a.H;
                                                                                                                                                                                                                                                                                                                                                                                                                                                    if (to3Var != null) {
                                                                                                                                                                                                                                                                                                                                                                                                                                                        to3Var.H0();
                                                                                                                                                                                                                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                                                                                                                                                                                            });
                                                                                                                                                                                                                                                                                                                                                                                                                                            mgd0Var.a0.setOnClickListener(new View.OnClickListener() { // from class: f33
                                                                                                                                                                                                                                                                                                                                                                                                                                                @Override // android.view.View.OnClickListener
                                                                                                                                                                                                                                                                                                                                                                                                                                                public final void onClick(View view) {
                                                                                                                                                                                                                                                                                                                                                                                                                                                    to3 to3Var = this.a.H;
                                                                                                                                                                                                                                                                                                                                                                                                                                                    if (to3Var != null) {
                                                                                                                                                                                                                                                                                                                                                                                                                                                        to3Var.H0();
                                                                                                                                                                                                                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                                                                                                                                                                                            });
                                                                                                                                                                                                                                                                                                                                                                                                                                            constraintLayout10.setOnClickListener(new View.OnClickListener() { // from class: f13
                                                                                                                                                                                                                                                                                                                                                                                                                                                @Override // android.view.View.OnClickListener
                                                                                                                                                                                                                                                                                                                                                                                                                                                public final void onClick(View view) {
                                                                                                                                                                                                                                                                                                                                                                                                                                                    to3 to3Var = this.a.H;
                                                                                                                                                                                                                                                                                                                                                                                                                                                    if (to3Var != null) {
                                                                                                                                                                                                                                                                                                                                                                                                                                                        to3Var.H0();
                                                                                                                                                                                                                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                                                                                                                                                                                            });
                                                                                                                                                                                                                                                                                                                                                                                                                                            las lasVar = this.I;
                                                                                                                                                                                                                                                                                                                                                                                                                                            if (lasVar != null) {
                                                                                                                                                                                                                                                                                                                                                                                                                                                ej5.c(lasVar, null, null, new k33(null, mgd0Var, this), 3);
                                                                                                                                                                                                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                                                                                                                                                                                                            mgd0Var.P.setOnClickedClose(new g13(this, i2));
                                                                                                                                                                                                                                                                                                                                                                                                                                            mgd0Var.x0.setOnClickedClose(new h13(this, i2));
                                                                                                                                                                                                                                                                                                                                                                                                                                            mgd0Var.J.setOnClickedClose(new i13(this, i2));
                                                                                                                                                                                                                                                                                                                                                                                                                                            mgd0Var.d.setOnClickedClose(new j13(this, i2));
                                                                                                                                                                                                                                                                                                                                                                                                                                            checkBox11.setOnClickListener(new View.OnClickListener() { // from class: k13
                                                                                                                                                                                                                                                                                                                                                                                                                                                @Override // android.view.View.OnClickListener
                                                                                                                                                                                                                                                                                                                                                                                                                                                public final void onClick(View view) {
                                                                                                                                                                                                                                                                                                                                                                                                                                                    int i4 = BetSlipFooter.j0;
                                                                                                                                                                                                                                                                                                                                                                                                                                                    this.a.r(mgd0Var.s0.isChecked());
                                                                                                                                                                                                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                                                                                                                                                                                            });
                                                                                                                                                                                                                                                                                                                                                                                                                                            checkBox12.setOnClickListener(new View.OnClickListener() { // from class: l13
                                                                                                                                                                                                                                                                                                                                                                                                                                                @Override // android.view.View.OnClickListener
                                                                                                                                                                                                                                                                                                                                                                                                                                                public final void onClick(View view) {
                                                                                                                                                                                                                                                                                                                                                                                                                                                    int i4 = BetSlipFooter.j0;
                                                                                                                                                                                                                                                                                                                                                                                                                                                    this.a.q(mgd0Var.N.isChecked());
                                                                                                                                                                                                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                                                                                                                                                                                            });
                                                                                                                                                                                                                                                                                                                                                                                                                                            checkBox13.setOnClickListener(new View.OnClickListener() { // from class: m13
                                                                                                                                                                                                                                                                                                                                                                                                                                                @Override // android.view.View.OnClickListener
                                                                                                                                                                                                                                                                                                                                                                                                                                                public final void onClick(View view) {
                                                                                                                                                                                                                                                                                                                                                                                                                                                    int i4 = BetSlipFooter.j0;
                                                                                                                                                                                                                                                                                                                                                                                                                                                    this.a.p(mgd0Var.U.isChecked());
                                                                                                                                                                                                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                                                                                                                                                                                            });
                                                                                                                                                                                                                                                                                                                                                                                                                                            mgd0Var.E.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: o13
                                                                                                                                                                                                                                                                                                                                                                                                                                                @Override // android.widget.CompoundButton.OnCheckedChangeListener
                                                                                                                                                                                                                                                                                                                                                                                                                                                public final void onCheckedChanged(CompoundButton compoundButton, boolean z2) {
                                                                                                                                                                                                                                                                                                                                                                                                                                                    int i4 = BetSlipFooter.j0;
                                                                                                                                                                                                                                                                                                                                                                                                                                                    compoundButton.getClass();
                                                                                                                                                                                                                                                                                                                                                                                                                                                    to3 to3Var = this.a.H;
                                                                                                                                                                                                                                                                                                                                                                                                                                                    if (to3Var != null) {
                                                                                                                                                                                                                                                                                                                                                                                                                                                        to3Var.z("", z2);
                                                                                                                                                                                                                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                                                                                                                                                                                            });
                                                                                                                                                                                                                                                                                                                                                                                                                                            textView26.setOnClickListener(new q13(this, i2));
                                                                                                                                                                                                                                                                                                                                                                                                                                            if (getContext() != null) {
                                                                                                                                                                                                                                                                                                                                                                                                                                                Context context2 = getContext();
                                                                                                                                                                                                                                                                                                                                                                                                                                                context2.getClass();
                                                                                                                                                                                                                                                                                                                                                                                                                                                Drawable drawableB = s0b.b(context2, R.drawable.ic__arrow_chevron_down, new a78.c(R.color.icon_primary), 12);
                                                                                                                                                                                                                                                                                                                                                                                                                                                if (drawableB != null) {
                                                                                                                                                                                                                                                                                                                                                                                                                                                    int iA = zch0.a(getContext(), 2);
                                                                                                                                                                                                                                                                                                                                                                                                                                                    TextView textView29 = mgd0Var.b0;
                                                                                                                                                                                                                                                                                                                                                                                                                                                    textView29.setCompoundDrawablePadding(iA);
                                                                                                                                                                                                                                                                                                                                                                                                                                                    textView29.setCompoundDrawablesRelative(null, null, drawableB, null);
                                                                                                                                                                                                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                                                                                                                                                                                                            mgd0Var.i.setOnClickListener(new r13(this, i2));
                                                                                                                                                                                                                                                                                                                                                                                                                                            mgd0Var.f.setOnClickListener(new s13(this, 0));
                                                                                                                                                                                                                                                                                                                                                                                                                                            mgd0Var.M0.setListener(new l33(this, mgd0Var));
                                                                                                                                                                                                                                                                                                                                                                                                                                            mgd0Var.j0.setListener(new m33(this, mgd0Var));
                                                                                                                                                                                                                                                                                                                                                                                                                                            mgd0Var.F.setVisibility(iu2.k() ? 0 : 8);
                                                                                                                                                                                                                                                                                                                                                                                                                                            mgd0Var.I0.setOnClickListener(new q33(new cq40(), this));
                                                                                                                                                                                                                                                                                                                                                                                                                                            mgd0Var.L0.setOnClickListener(new r33(new cq40(), this, mgd0Var));
                                                                                                                                                                                                                                                                                                                                                                                                                                            mgd0Var.K0.setOnTouchListener(new View.OnTouchListener() { // from class: t13
                                                                                                                                                                                                                                                                                                                                                                                                                                                @Override // android.view.View.OnTouchListener
                                                                                                                                                                                                                                                                                                                                                                                                                                                public final boolean onTouch(View view, MotionEvent motionEvent) {
                                                                                                                                                                                                                                                                                                                                                                                                                                                    int i4 = BetSlipFooter.j0;
                                                                                                                                                                                                                                                                                                                                                                                                                                                    view.getClass();
                                                                                                                                                                                                                                                                                                                                                                                                                                                    motionEvent.getClass();
                                                                                                                                                                                                                                                                                                                                                                                                                                                    if (motionEvent.getAction() == 1) {
                                                                                                                                                                                                                                                                                                                                                                                                                                                        int width = view.getWidth();
                                                                                                                                                                                                                                                                                                                                                                                                                                                        float x = motionEvent.getX();
                                                                                                                                                                                                                                                                                                                                                                                                                                                        float f = width / 3;
                                                                                                                                                                                                                                                                                                                                                                                                                                                        final BetSlipFooter betSlipFooter = this.a;
                                                                                                                                                                                                                                                                                                                                                                                                                                                        if (x < f) {
                                                                                                                                                                                                                                                                                                                                                                                                                                                            to3 to3Var = betSlipFooter.H;
                                                                                                                                                                                                                                                                                                                                                                                                                                                            if (to3Var != null) {
                                                                                                                                                                                                                                                                                                                                                                                                                                                                to3Var.d1(BetSlipFooter.i(betSlipFooter.W));
                                                                                                                                                                                                                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                                                                                                                                                                                                                            Unit unit = Unit.a;
                                                                                                                                                                                                                                                                                                                                                                                                                                                        } else {
                                                                                                                                                                                                                                                                                                                                                                                                                                                            int i5 = BetSlipFooter.j0;
                                                                                                                                                                                                                                                                                                                                                                                                                                                            mgd0 mgd0Var2 = mgd0Var;
                                                                                                                                                                                                                                                                                                                                                                                                                                                            betSlipFooter.g(view, mgd0Var2.I0, mgd0Var2.L0, new Function1() { // from class: s23
                                                                                                                                                                                                                                                                                                                                                                                                                                                                @Override // kotlin.jvm.functions.Function1
                                                                                                                                                                                                                                                                                                                                                                                                                                                                public final Object invoke(Object obj) {
                                                                                                                                                                                                                                                                                                                                                                                                                                                                    huy huyVar = (huy) obj;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                    int i6 = BetSlipFooter.j0;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                    huyVar.getClass();
                                                                                                                                                                                                                                                                                                                                                                                                                                                                    to3 to3Var2 = betSlipFooter.H;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                    if (to3Var2 != null) {
                                                                                                                                                                                                                                                                                                                                                                                                                                                                        to3Var2.d1(BetSlipFooter.i(huyVar));
                                                                                                                                                                                                                                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                                                                                                                                                                                                                                    return Unit.a;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                                                                                                                                                                                                            });
                                                                                                                                                                                                                                                                                                                                                                                                                                                            Unit unit2 = Unit.a;
                                                                                                                                                                                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                                                                                                                                                                                                                    return true;
                                                                                                                                                                                                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                                                                                                                                                                                            });
                                                                                                                                                                                                                                                                                                                                                                                                                                            checkBox14.setOnClickListener(new s33(new cq40(), this));
                                                                                                                                                                                                                                                                                                                                                                                                                                            mgd0Var.g0.setOnClickListener(new t33(new cq40(), this, mgd0Var));
                                                                                                                                                                                                                                                                                                                                                                                                                                            mgd0Var.f0.setOnTouchListener(new View.OnTouchListener() { // from class: u13
                                                                                                                                                                                                                                                                                                                                                                                                                                                @Override // android.view.View.OnTouchListener
                                                                                                                                                                                                                                                                                                                                                                                                                                                public final boolean onTouch(View view, MotionEvent motionEvent) {
                                                                                                                                                                                                                                                                                                                                                                                                                                                    int i4 = BetSlipFooter.j0;
                                                                                                                                                                                                                                                                                                                                                                                                                                                    view.getClass();
                                                                                                                                                                                                                                                                                                                                                                                                                                                    motionEvent.getClass();
                                                                                                                                                                                                                                                                                                                                                                                                                                                    if (motionEvent.getAction() == 1) {
                                                                                                                                                                                                                                                                                                                                                                                                                                                        int width = view.getWidth();
                                                                                                                                                                                                                                                                                                                                                                                                                                                        float x = motionEvent.getX();
                                                                                                                                                                                                                                                                                                                                                                                                                                                        float f = width / 3;
                                                                                                                                                                                                                                                                                                                                                                                                                                                        BetSlipFooter betSlipFooter = this.a;
                                                                                                                                                                                                                                                                                                                                                                                                                                                        if (x < f) {
                                                                                                                                                                                                                                                                                                                                                                                                                                                            to3 to3Var = betSlipFooter.H;
                                                                                                                                                                                                                                                                                                                                                                                                                                                            if (to3Var != null) {
                                                                                                                                                                                                                                                                                                                                                                                                                                                                to3Var.d1(BetSlipFooter.i(betSlipFooter.W));
                                                                                                                                                                                                                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                                                                                                                                                                                                                            Unit unit = Unit.a;
                                                                                                                                                                                                                                                                                                                                                                                                                                                        } else {
                                                                                                                                                                                                                                                                                                                                                                                                                                                            int i5 = BetSlipFooter.j0;
                                                                                                                                                                                                                                                                                                                                                                                                                                                            mgd0 mgd0Var2 = mgd0Var;
                                                                                                                                                                                                                                                                                                                                                                                                                                                            betSlipFooter.g(view, mgd0Var2.d0, mgd0Var2.g0, new z23(betSlipFooter, 0));
                                                                                                                                                                                                                                                                                                                                                                                                                                                            Unit unit2 = Unit.a;
                                                                                                                                                                                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                                                                                                                                                                                                                    return true;
                                                                                                                                                                                                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                                                                                                                                                                                            });
                                                                                                                                                                                                                                                                                                                                                                                                                                            mgd0Var.W0.setOnClickListener(new u33(new cq40(), this));
                                                                                                                                                                                                                                                                                                                                                                                                                                            mgd0Var.Z0.setOnClickListener(new v33(new cq40(), this, mgd0Var));
                                                                                                                                                                                                                                                                                                                                                                                                                                            mgd0Var.Y0.setOnTouchListener(new View.OnTouchListener() { // from class: v13
                                                                                                                                                                                                                                                                                                                                                                                                                                                @Override // android.view.View.OnTouchListener
                                                                                                                                                                                                                                                                                                                                                                                                                                                public final boolean onTouch(View view, MotionEvent motionEvent) {
                                                                                                                                                                                                                                                                                                                                                                                                                                                    int i4 = BetSlipFooter.j0;
                                                                                                                                                                                                                                                                                                                                                                                                                                                    view.getClass();
                                                                                                                                                                                                                                                                                                                                                                                                                                                    motionEvent.getClass();
                                                                                                                                                                                                                                                                                                                                                                                                                                                    if (motionEvent.getAction() == 1) {
                                                                                                                                                                                                                                                                                                                                                                                                                                                        int width = view.getWidth();
                                                                                                                                                                                                                                                                                                                                                                                                                                                        float x = motionEvent.getX();
                                                                                                                                                                                                                                                                                                                                                                                                                                                        float f = width / 3;
                                                                                                                                                                                                                                                                                                                                                                                                                                                        BetSlipFooter betSlipFooter = this.a;
                                                                                                                                                                                                                                                                                                                                                                                                                                                        if (x < f) {
                                                                                                                                                                                                                                                                                                                                                                                                                                                            to3 to3Var = betSlipFooter.H;
                                                                                                                                                                                                                                                                                                                                                                                                                                                            if (to3Var != null) {
                                                                                                                                                                                                                                                                                                                                                                                                                                                                to3Var.d1(BetSlipFooter.i(betSlipFooter.W));
                                                                                                                                                                                                                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                                                                                                                                                                                                                            Unit unit = Unit.a;
                                                                                                                                                                                                                                                                                                                                                                                                                                                        } else {
                                                                                                                                                                                                                                                                                                                                                                                                                                                            int i5 = BetSlipFooter.j0;
                                                                                                                                                                                                                                                                                                                                                                                                                                                            mgd0 mgd0Var2 = mgd0Var;
                                                                                                                                                                                                                                                                                                                                                                                                                                                            betSlipFooter.g(view, mgd0Var2.W0, mgd0Var2.Z0, new a33(betSlipFooter, 0));
                                                                                                                                                                                                                                                                                                                                                                                                                                                            Unit unit2 = Unit.a;
                                                                                                                                                                                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                                                                                                                                                                                                                    return true;
                                                                                                                                                                                                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                                                                                                                                                                                            });
                                                                                                                                                                                                                                                                                                                                                                                                                                            mgd0Var.X.setOnClickListener(new w33(new cq40(), this));
                                                                                                                                                                                                                                                                                                                                                                                                                                            mgd0Var.C0.setOnClickListener(new x33(new cq40(), this));
                                                                                                                                                                                                                                                                                                                                                                                                                                            mgd0Var.Q0.setOnClickListener(new y33(new cq40(), this));
                                                                                                                                                                                                                                                                                                                                                                                                                                            this.h0 = new StringBuilder("");
                                                                                                                                                                                                                                                                                                                                                                                                                                            this.i0 = new StringBuilder("");
                                                                                                                                                                                                                                                                                                                                                                                                                                            return;
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
        bmy.a("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i3)));
        throw null;
    }

    private final String getBonusTextWithCurrency() {
        StringBuilder sb = new StringBuilder();
        String strF = getCountryManager().f();
        sb.append(this.G.C.getText());
        if (strF != null && !StringsKt.M(sb, strF, false)) {
            sb.append(" (" + strF + ")");
        }
        return sb.toString();
    }

    private final ema getCompositeDisposable() {
        return (ema) this.N.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean getFlexBetCashOutEnable() {
        return qq1.a(getBoConfigSource(), BOConfigParam.CashoutFlexibleBetAllow, true);
    }

    private final BigDecimal getNegativeOne() {
        return (BigDecimal) this.O.getValue();
    }

    public static String i(huy huyVar) {
        int iOrdinal = huyVar.ordinal();
        if (iOrdinal == 0) {
            return "one_up";
        }
        if (iOrdinal == 1) {
            return "two_up";
        }
        uhc.a();
        return null;
    }

    public static void o(TextView textView, boolean z) {
        Drawable drawableC;
        int i = R.color.text_disable_type1_primary;
        if (z) {
            Context context = textView.getContext();
            context.getClass();
            if (textView.isEnabled()) {
                i = R.color.text_type1_primary;
            }
            drawableC = s0b.c(context, R.drawable.ic_arrow_down_1, new a78.c(i), null, 4);
        } else {
            Context context2 = textView.getContext();
            context2.getClass();
            if (textView.isEnabled()) {
                i = R.color.text_type1_primary;
            }
            drawableC = s0b.c(context2, R.drawable.ic_arrow_up_1, new a78.c(i), null, 4);
        }
        if (drawableC != null) {
            drawableC.setBounds(0, 0, drawableC.getIntrinsicWidth(), drawableC.getIntrinsicHeight());
        } else {
            drawableC = null;
        }
        Resources resources = textView.getContext().getResources();
        ThreadLocal<TypedValue> threadLocal = th50.a;
        Drawable drawable = resources.getDrawable(R.drawable.ic_up_flag, null);
        if (drawable != null) {
            drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
        } else {
            drawable = null;
        }
        textView.setCompoundDrawables(drawable, null, drawableC, null);
    }

    private final void setAnyWinUiVisible(boolean isVisible) {
        mgd0 mgd0Var = this.G;
        if (!isVisible) {
            mgd0Var.e.setVisibility(8);
            mgd0Var.c.setVisibility(8);
            return;
        }
        if (!iu2.p()) {
            TextView textView = mgd0Var.b0;
            jvo jvoVar = this.U;
            jvoVar.b = true;
            jvoVar.a(new LinkedHashMap());
            textView.setVisibility(4);
            jvoVar.f = textView;
        }
        mgd0Var.e.setVisibility(0);
        mgd0Var.c.setVisibility(0);
        mgd0Var.y.setVisibility(8);
        mgd0Var.C.setVisibility(8);
        mgd0Var.z.setVisibility(8);
    }

    private final void setBetBonusHintUI(boolean isSim) {
        mgd0 mgd0Var = this.G;
        mgd0Var.A.setProgressDrawable(getContext().getDrawable(isSim ? R.drawable.progress_bar_rounded_progress_sim : R.drawable.progress_bar_rounded_custom_brand_secondary_opacity_type1));
        mgd0Var.B.setTextColor(getContext().getColor(isSim ? R.color.custom_text_type2_tertiary_type1 : R.color.custom_brand_secondary_variable_type2_type1));
    }

    private final void setInsureEarlyPayoutVisible(boolean isVisible) {
        mgd0 mgd0Var = this.G;
        if (isVisible) {
            mgd0Var.C0.setVisibility(0);
            mgd0Var.D0.setVisibility(8);
            mgd0Var.X.setVisibility(0);
            mgd0Var.Y.setVisibility(8);
            mgd0Var.Q0.setVisibility(0);
            mgd0Var.R0.setVisibility(8);
            return;
        }
        mgd0Var.C0.setVisibility(8);
        mgd0Var.D0.setVisibility(8);
        mgd0Var.X.setVisibility(8);
        mgd0Var.Y.setVisibility(8);
        mgd0Var.Q0.setVisibility(8);
        mgd0Var.R0.setVisibility(8);
    }

    private final void setInsureOneTwoUpText(String text) {
        mgd0 mgd0Var = this.G;
        mgd0Var.L0.setText(text);
        mgd0Var.Z0.setText(text);
        mgd0Var.g0.setText(text);
    }

    private final void setInsureOneTwoUpVisible(boolean isVisible) {
        mgd0 mgd0Var = this.G;
        if (isVisible) {
            mgd0Var.F0.setVisibility(0);
            mgd0Var.J0.setVisibility(0);
            mgd0Var.e0.setVisibility(0);
            mgd0Var.T0.setVisibility(0);
            mgd0Var.X0.setVisibility(0);
            return;
        }
        mgd0Var.F0.setVisibility(8);
        mgd0Var.J0.setVisibility(8);
        mgd0Var.K0.setVisibility(8);
        mgd0Var.e0.setVisibility(8);
        mgd0Var.f0.setVisibility(8);
        mgd0Var.T0.setVisibility(8);
        mgd0Var.X0.setVisibility(8);
        mgd0Var.Y0.setVisibility(8);
    }

    public static /* synthetic */ void setLoading$default(BetSlipFooter betSlipFooter, boolean z, boolean z2, int i, Object obj) {
        if ((i & 2) != 0) {
            z2 = false;
        }
        betSlipFooter.setLoading(z, z2);
    }

    private final void setMultipleTotalOddsMaxWidthTo70PercentScreen(Activity activity) {
        Display defaultDisplay = activity.getWindowManager().getDefaultDisplay();
        defaultDisplay.getClass();
        Point point = new Point();
        defaultDisplay.getSize(point);
        double d = ((double) point.x) * 0.7d;
        if (d > 0.0d) {
            this.G.m0.setMaxWidth((int) d);
        }
    }

    private final void setOneCutUiVisible(boolean isVisible) {
        mgd0 mgd0Var = this.G;
        if (!isVisible) {
            mgd0Var.u0.setVisibility(8);
            mgd0Var.z0.setVisibility(8);
            mgd0Var.v0.setVisibility(8);
            mgd0Var.w0.setVisibility(8);
            return;
        }
        if (!iu2.p()) {
            TextView textView = mgd0Var.b0;
            jvo jvoVar = this.U;
            jvoVar.b = true;
            jvoVar.a(new LinkedHashMap());
            textView.setVisibility(4);
            jvoVar.f = textView;
        }
        TextView textView2 = mgd0Var.u0;
        SeekBar seekBar = mgd0Var.w0;
        TextView textView3 = mgd0Var.v0;
        textView2.setVisibility(0);
        mgd0Var.z0.setVisibility(0);
        bqy.a aVar = this.L;
        if (aVar == null || !aVar.b || iu2.p()) {
            textView3.setVisibility(8);
            seekBar.setVisibility(8);
        } else {
            textView3.setVisibility(0);
            seekBar.setVisibility(0);
        }
    }

    private final void setSingleTotalStake(String text) {
        this.G.N0.setText(text);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setupAutoBetPanel$lambda$0$0(int i) {
        SimShareData.INSTANCE.setAutoBetTimes(i);
    }

    public final void A(String str) {
        boolean zP = getCountryManager().p();
        mgd0 mgd0Var = this.G;
        if (!zP || str == null) {
            mgd0Var.R.setVisibility(8);
            mgd0Var.S.setVisibility(8);
            return;
        }
        TextView textView = mgd0Var.R;
        TextView textView2 = mgd0Var.S;
        textView.setVisibility(0);
        textView2.setVisibility(0);
        c8i0.m(textView2, str, this.I, this.J);
    }

    public final void B(CheckBox checkBox) {
        checkBox.getViewTreeObserver().addOnGlobalLayoutListener(new c(checkBox, this.G));
    }

    public final void C(BigDecimal bigDecimal, BigDecimal bigDecimal2, BigDecimal bigDecimal3, BigDecimal bigDecimal4, long j, int i, boolean z, boolean z2) {
        String strA;
        String strA2;
        BigDecimal bigDecimal5 = new BigDecimal(i);
        BigDecimal bigDecimal6 = bigDecimal4;
        BigDecimal bigDecimalMultiply = bigDecimal6.multiply(new BigDecimal(j));
        TaxConfigs taxConfigs = this.K;
        if (taxConfigs == null) {
            Intrinsics.n("taxConfigData");
            throw null;
        }
        if (bigDecimal.compareTo(bigDecimal2) >= 0) {
            bigDecimal6 = bigDecimalMultiply;
        }
        bigDecimal6.getClass();
        BigDecimal tax = taxConfigs.getTax(z, bigDecimal, bigDecimal6);
        TaxConfigs taxConfigs2 = this.K;
        if (taxConfigs2 == null) {
            Intrinsics.n("taxConfigData");
            throw null;
        }
        bigDecimalMultiply.getClass();
        BigDecimal tax2 = taxConfigs2.getTax(z, bigDecimal3, bigDecimalMultiply);
        if (z) {
            tax2.setScale(2, RoundingMode.HALF_UP);
        }
        BigDecimal bigDecimalMultiply2 = tax2.multiply(bigDecimal5).multiply(getNegativeOne());
        Locale locale = Locale.US;
        String strL = bjb0.L(bigDecimalMultiply2, locale);
        BigDecimal bigDecimalSubtract = bigDecimal3.subtract(tax2);
        if (z) {
            bigDecimalSubtract.setScale(2, RoundingMode.HALF_UP);
        }
        String strL2 = bjb0.L(bigDecimalSubtract.multiply(bigDecimal5), locale);
        mgd0 mgd0Var = this.G;
        if (!z2) {
            c8i0.m(mgd0Var.p0, "--", this.I, this.J);
            c8i0.m(mgd0Var.a1, "--", this.I, this.J);
            A("--");
            return;
        }
        Context context = getContext();
        context.getClass();
        String strB = sn5.b(context, R.string.app_common__tilde, new Object[0]);
        if (bigDecimal.compareTo(bigDecimal2) >= 0) {
            if (z) {
                tax2.setScale(2, RoundingMode.HALF_UP);
            }
            strA = bjb0.L(tax2.multiply(bigDecimal5).multiply(getNegativeOne()), locale);
        } else {
            if (z) {
                tax.setScale(2, RoundingMode.HALF_UP);
            }
            strA = tug.a(bjb0.L(tax.multiply(bigDecimal5).multiply(getNegativeOne()), locale), strB, strL);
        }
        if (bigDecimal.compareTo(bigDecimal2) >= 0) {
            BigDecimal bigDecimalSubtract2 = bigDecimal3.subtract(tax2);
            if (z) {
                bigDecimalSubtract2.setScale(2, RoundingMode.HALF_UP);
            }
            strA2 = bjb0.L(bigDecimalSubtract2.multiply(bigDecimal5), locale);
        } else {
            BigDecimal bigDecimalSubtract3 = bigDecimal.subtract(tax);
            if (z) {
                bigDecimalSubtract3.setScale(2, RoundingMode.HALF_UP);
            }
            strA2 = tug.a(bjb0.L(bigDecimalSubtract3.multiply(bigDecimal5), locale), strB, strL2);
        }
        A(hu2.f(strA, strA2, strB));
        c8i0.m(mgd0Var.p0, strA2, this.I, this.J);
        c8i0.m(mgd0Var.a1, strA, this.I, this.J);
        if (j > 1) {
            String str = g93.a().d0().a;
            u(str != null ? bjb0.L(new BigDecimal(str).multiply(new BigDecimal((int) j)), locale) : null, true);
        } else {
            u(null, false);
        }
        c(bigDecimal);
    }

    public final void D(BigDecimal bigDecimal, BigDecimal bigDecimal2, BigDecimal bigDecimal3, BigDecimal bigDecimal4, BigDecimal bigDecimal5, int i, boolean z) {
        String strA;
        String strA2;
        to3 to3Var;
        Context context = getContext();
        context.getClass();
        String strB = sn5.b(context, R.string.app_common__tilde, new Object[0]);
        BigDecimal bigDecimal6 = new BigDecimal(i);
        TaxConfigs taxConfigs = this.K;
        if (taxConfigs == null) {
            Intrinsics.n("taxConfigData");
            throw null;
        }
        BigDecimal tax = taxConfigs.getTax(z, bigDecimal, bigDecimal.compareTo(bigDecimal2) == 0 ? bigDecimal5 : bigDecimal4);
        TaxConfigs taxConfigs2 = this.K;
        if (taxConfigs2 == null) {
            Intrinsics.n("taxConfigData");
            throw null;
        }
        BigDecimal tax2 = taxConfigs2.getTax(z, bigDecimal2, bigDecimal5);
        BigDecimal bigDecimalAdd = tax2.add(bigDecimal3);
        if (z) {
            bigDecimalAdd.setScale(2, RoundingMode.HALF_UP);
        }
        BigDecimal bigDecimalMultiply = bigDecimalAdd.multiply(bigDecimal6).multiply(getNegativeOne());
        Locale locale = Locale.US;
        String strL = bjb0.L(bigDecimalMultiply, locale);
        BigDecimal bigDecimalSubtract = bigDecimal2.add(bigDecimal3).subtract(tax2);
        if (z) {
            bigDecimalSubtract.setScale(2, RoundingMode.HALF_UP);
        }
        String strL2 = bjb0.L(bigDecimalSubtract.multiply(bigDecimal6), locale);
        if (bigDecimal.compareTo(bigDecimal2) >= 0) {
            BigDecimal bigDecimalAdd2 = tax.add(bigDecimal3);
            if (z) {
                bigDecimalAdd2.setScale(2, RoundingMode.HALF_UP);
            }
            strA = bjb0.L(bigDecimalAdd2.multiply(bigDecimal6).multiply(getNegativeOne()), locale);
        } else {
            if (z) {
                tax.setScale(2, RoundingMode.HALF_UP);
            }
            strA = tug.a(bjb0.L(tax.multiply(bigDecimal6).multiply(getNegativeOne()), locale), strB, strL);
        }
        if (bigDecimal.compareTo(bigDecimal2) >= 0) {
            BigDecimal bigDecimalSubtract2 = bigDecimal.add(bigDecimal3).subtract(tax);
            if (z) {
                bigDecimalSubtract2.setScale(2, RoundingMode.HALF_UP);
            }
            strA2 = bjb0.L(bigDecimalSubtract2.multiply(bigDecimal6), locale);
        } else {
            BigDecimal bigDecimalSubtract3 = bigDecimal.subtract(tax);
            if (z) {
                bigDecimalSubtract3.setScale(2, RoundingMode.HALF_UP);
            }
            strA2 = tug.a(bjb0.L(bigDecimalSubtract3.multiply(bigDecimal6), locale), strB, strL2);
        }
        itf0.a aVar = itf0.a;
        aVar.q(MyLog.TAG_TAX);
        TaxConfigs taxConfigs3 = this.K;
        if (taxConfigs3 == null) {
            Intrinsics.n("taxConfigData");
            throw null;
        }
        StringBuilder sbA = uqe0.a(taxConfigs3.getType(z), "[showSingleFooterWHTaxAndNetWin] type = ", ", wh tax = ", strA, ", net win = ");
        sbA.append(strA2);
        sbA.append(", min stake = ");
        sbA.append(bigDecimal4);
        sbA.append(", max stake = ");
        sbA.append(bigDecimal5);
        aVar.g(sbA.toString(), new Object[0]);
        A(hu2.f(strA, strA2, strB));
        mgd0 mgd0Var = this.G;
        c8i0.m(mgd0Var.p0, strA2, this.I, this.J);
        c8i0.m(mgd0Var.a1, strA, this.I, this.J);
        c(null);
        if (!lw2.d.P() || (to3Var = this.H) == null) {
            return;
        }
        to3Var.e1(strL, strL2);
    }

    public final void E(boolean z, luo luoVar, luo luoVar2, luo luoVar3, luo luoVar4, boolean z2, boolean z3) {
        w(true, z);
        setBetBonusHintUI(z);
        setInsureOneTwoUpVisible(getUpFooterInsureUseCase().d() && !z3);
        setSportyInsure(luoVar, luoVar2, luoVar3, luoVar4, getUpFooterInsureUseCase().d(), z3);
        mgd0 mgd0Var = this.G;
        mgd0Var.D.setVisibility((!iu2.a.j().G1() || z) ? 8 : 0);
        TaxConfigs taxConfigs = this.K;
        if (taxConfigs != null) {
            x(2, taxConfigs.hasRate(z));
        }
        TextView textView = mgd0Var.h0;
        TextView textView2 = mgd0Var.u0;
        Context context = getContext();
        context.getClass();
        textView.setText(sn5.b(context, R.string.component_betslip__total_stake_cannot_exceed_vmaxstake, NumberFormat.getNumberInstance(Locale.US).format(getGetMaxStakeUseCase().a().doubleValue())));
        s(z2, z);
        if (kni0.l()) {
            setSingleTotalStake("-");
        }
        if (z) {
            setOneCutUiVisible(false);
            setAnyWinEnable(luo.a);
        } else {
            setAnyWinEnable(luoVar3);
        }
        bqy.a aVar = this.L;
        if (aVar == null || !aVar.b || z) {
            Context context2 = getContext();
            context2.getClass();
            textView2.setText(nae0.a(sn5.b(context2, R.string.component_betslip__one_cut_pay_one_selection_v2, new Object[0])));
        } else {
            Context context3 = getContext();
            context3.getClass();
            textView2.setText(nae0.a(sn5.b(context3, R.string.component_betslip__one_cut_slider_content, new Object[0])));
        }
    }

    public final void F(boolean z, boolean z2, boolean z3) {
        SimShareData simShareData = SimShareData.INSTANCE;
        boolean z4 = z && simShareData.isAutoBetEnabled() && !z3;
        mgd0 mgd0Var = this.G;
        mgd0Var.H0.setVisibility(z4 ? 0 : 8);
        mgd0Var.l0.setVisibility(z4 ? 0 : 8);
        if (z2) {
            simShareData.resetAutoBetTimes();
            mgd0Var.H0.E(simShareData.getAutoBetTimes());
            mgd0Var.l0.E(simShareData.getAutoBetTimes());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v19 */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v8 */
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
    public final void G(luo luoVar, boolean z, int i, long j, String str, int i2) {
        ?? r4;
        int i3;
        mgd0 mgd0Var = this.G;
        CheckBox checkBox = mgd0Var.s0;
        EditTextWithKeyBoard editTextWithKeyBoard = mgd0Var.j0;
        TextView textView = mgd0Var.O;
        RelativeLayout relativeLayout = mgd0Var.K;
        IndicatorLayout indicatorLayout = mgd0Var.T;
        TextView textView2 = mgd0Var.L;
        TextView textView3 = mgd0Var.M;
        ArrowButton arrowButton = mgd0Var.i;
        ArrowButton arrowButton2 = mgd0Var.f;
        CheckBox checkBox2 = mgd0Var.N;
        if (!checkBox.isChecked()) {
            setOneCutUiVisible(false);
        }
        if (!mgd0Var.U.isChecked()) {
            setAnyWinUiVisible(false);
        }
        if (a.a[luoVar.ordinal()] == 1) {
            checkBox2.setVisibility(8);
            r4 = 0;
        } else {
            r4 = 0;
            checkBox2.setVisibility(0);
        }
        checkBox2.setEnabled(luoVar == luo.c ? 1 : r4);
        if (!checkBox2.isEnabled() && checkBox2.isChecked()) {
            checkBox2.setChecked(r4);
            g93.a().G(r4);
            indicatorLayout.setVisibility(8);
        }
        if (m()) {
            relativeLayout.setVisibility(r4);
            if (z) {
                arrowButton.setStateAvailable(r4);
                arrowButton2.setStateAvailable(r4);
                textView3.setText(String.valueOf(i));
                textView2.setVisibility(8);
            } else if (i2 < 2) {
                textView2.setVisibility(8);
                j7g j7gVar = new j7g("");
                j7gVar.e(getContext().getColor(R.color.text_type2_tertiary), "2");
                textView3.setText(j7gVar);
                arrowButton.setStateAvailable(false);
                arrowButton2.setStateAvailable(false);
                textView.setVisibility(0);
            } else {
                textView.setVisibility(8);
                if (i < i2) {
                    mgd0Var.C.setVisibility(8);
                    mgd0Var.y.setVisibility(8);
                    mgd0Var.z.setVisibility(8);
                    arrowButton.setStateAvailable(true);
                    arrowButton2.setStateAvailable(true);
                    if (i == gvh.a(i2)) {
                        i3 = 0;
                        arrowButton2.setStateAvailable(false);
                    } else {
                        i3 = 0;
                    }
                    textView2.setVisibility(i3);
                    if (i2 - i == 1) {
                        arrowButton.setStateAvailable(i3);
                        arrowButton2.setStateAvailable(i <= gvh.a(i2) ? i3 : 1);
                    }
                    Context context = getContext();
                    context.getClass();
                    textView2.setText(zch0.j(sn5.b(context, R.string.component_betslip__flexibet_short_desc, new Object[i3]), getContext().getColor(R.color.text_type2_tertiary), 12, null));
                    j7g j7gVar2 = new j7g();
                    j7gVar2.b(i + "+ ");
                    StringBuilder sb = new StringBuilder("of ");
                    sb.append(i2);
                    j7gVar2.j(sb.toString(), getContext().getColor(R.color.absolute_type2), zch0.a(getContext(), 14));
                    textView3.setText(j7gVar2);
                } else {
                    if (i == i2) {
                        arrowButton.setStateAvailable(false);
                        arrowButton2.setStateAvailable(i > gvh.a(i2));
                        textView2.setVisibility(8);
                        textView3.setText(String.valueOf(i));
                        textView3.setBackgroundColor(-1);
                    }
                }
            }
        } else {
            if (!checkBox2.isChecked() && !mgd0Var.s0.isChecked()) {
                indicatorLayout.setVisibility(8);
            }
            relativeLayout.setVisibility(8);
        }
        luo luoVar2 = luo.b;
        View view = mgd0Var.Z;
        if (luoVar == luoVar2) {
            view.setVisibility(0);
        } else {
            view.setVisibility(8);
        }
        if (!z || j <= 1) {
            editTextWithKeyBoard.setNumberText(0L);
            Context context2 = getContext();
            context2.getClass();
            editTextWithKeyBoard.setStakeText(sn5.b(context2, R.string.common_functions__total_stake, new Object[0]));
            return;
        }
        editTextWithKeyBoard.setNumberText(j);
        Context context3 = getContext();
        context3.getClass();
        editTextWithKeyBoard.setStakeText(sn5.b(context3, R.string.common_functions__stake, new Object[0]));
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0051  */
    /* JADX WARN: Code duplicated, block: B:24:0x0058  */
    public final void H(FooterInfo footerInfo, long j, boolean z, boolean z2) {
        EditTextWithKeyBoard editTextWithKeyBoard;
        EditText editInput;
        EditText editInput2;
        int betType = footerInfo.getBetType();
        mgd0 mgd0Var = this.G;
        if (betType != 1) {
            editTextWithKeyBoard = betType != 2 ? null : mgd0Var.j0;
        } else {
            editTextWithKeyBoard = mgd0Var.M0;
        }
        ArrayList arrayListU = getSelectionUseCases().a.U();
        if (arrayListU == null || !arrayListU.isEmpty()) {
            int size = arrayListU.size();
            int i = 0;
            while (true) {
                if (i < size) {
                    Object obj = arrayListU.get(i);
                    i++;
                    if (qz3.b((Selection) obj)) {
                        if (editTextWithKeyBoard != null && (editInput = editTextWithKeyBoard.getEditInput()) != null) {
                            editInput.setEnabled(true);
                        }
                    }
                } else {
                    if (editTextWithKeyBoard != null) {
                        editTextWithKeyBoard.setAdditionalMsg("", 0);
                    }
                    if (editTextWithKeyBoard != null) {
                        editTextWithKeyBoard.setGoToDepositBtnVisibleOrGone(false);
                    }
                    if (editTextWithKeyBoard != null && (editInput2 = editTextWithKeyBoard.getEditInput()) != null) {
                        editInput2.setEnabled(false);
                    }
                    mgd0Var.h0.setVisibility(8);
                }
            }
        } else {
            if (editTextWithKeyBoard != null) {
                editTextWithKeyBoard.setAdditionalMsg("", 0);
            }
            if (editTextWithKeyBoard != null) {
                editTextWithKeyBoard.setGoToDepositBtnVisibleOrGone(false);
            }
            if (editTextWithKeyBoard != null) {
                editInput2.setEnabled(false);
            }
            mgd0Var.h0.setVisibility(8);
        }
        int betType2 = footerInfo.getBetType();
        if (betType2 == 1) {
            mgd0Var.M0.setNumberSingleText(footerInfo.getCanBetStatusCount());
            long betTotalCount = footerInfo.getBetTotalCount();
            EditTextWithKeyBoard editTextWithKeyBoard2 = mgd0Var.M0;
            if (betTotalCount == 1) {
                Context context = getContext();
                context.getClass();
                editTextWithKeyBoard2.setStakeText(sn5.b(context, R.string.common_functions__stake, new Object[0]));
            } else {
                Context context2 = getContext();
                context2.getClass();
                editTextWithKeyBoard2.setStakeText(sn5.b(context2, R.string.component_betslip__stake_per_bet, new Object[0]));
            }
            setSingleTotalStake(footerInfo.getSingleTotalStake());
        } else if (betType2 == 2) {
            mgd0Var.m0.setText(footerInfo.getMultipleTotalOdds());
            c(footerInfo.getMultipleMinScaled());
            if (j > 1) {
                String str = g93.a().d0().a;
                u(str != null ? bjb0.L(new BigDecimal(str).multiply(new BigDecimal((int) j)), Locale.US) : null, true);
            } else {
                u(null, false);
            }
        } else if (betType2 == 3) {
            mgd0Var.V0.setText(footerInfo.getSystemTotalStake());
        }
        y(getBetItem().m0(), getBetItem().u0(), SimShareData.INSTANCE.getMultiBetBonusEnable(), footerInfo.isExistBonus() && footerInfo.getBonus() != null && footerInfo.getBonus().compareTo(BigDecimal.ZERO) > 0, footerInfo.isBonusEnable(), footerInfo.isBonusActivated(), z, z2);
        if (footerInfo.getBonus() != null) {
            BigDecimal bonus = footerInfo.getBonus();
            bonus.getClass();
            setBonus(bonus);
        }
        las lasVar = this.I;
        if (lasVar != null) {
            TextView textView = mgd0Var.p0;
            String potentialWin = footerInfo.getPotentialWin();
            potentialWin.getClass();
            c8i0.m(textView, potentialWin, lasVar, this.J);
        }
        x(footerInfo.getBetType(), footerInfo.getTaxConfig().hasRate(iu2.p()));
        boolean zHasExciseTaxRate = footerInfo.getTaxConfig().hasExciseTaxRate(iu2.p());
        String exciseTax = footerInfo.getExciseTax();
        exciseTax.getClass();
        setShowExciseTax(zHasExciseTaxRate, exciseTax);
        v(footerInfo.getFlexiBetCount(), footerInfo.getBetType(), footerInfo.getTaxConfig().hasRate(iu2.p()));
        TextView textView2 = mgd0Var.a1;
        String wHTax = footerInfo.getWHTax();
        wHTax.getClass();
        c8i0.m(textView2, wHTax, this.I, this.J);
        String wHTax2 = footerInfo.getWHTax();
        String potentialWin2 = footerInfo.getPotentialWin();
        Context context3 = getContext();
        context3.getClass();
        A(hu2.f(wHTax2, potentialWin2, sn5.b(context3, R.string.app_common__tilde, new Object[0])));
        setGiftsSelected(footerInfo.isGiftChecked());
        mgd0Var.h0.setVisibility(8);
        try {
            zd2<Pair<TaxConfigs, String>> zd2Var = this.R;
            TaxConfigs taxConfig = footerInfo.getTaxConfig();
            taxConfig.getClass();
            String exciseTax2 = footerInfo.getExciseTax();
            exciseTax2.getClass();
            zd2Var.onNext(new Pair<>(taxConfig, exciseTax2));
            int betType3 = footerInfo.getBetType();
            if (betType3 != 1) {
                if (betType3 != 2) {
                    return;
                }
                zd2<onw> zd2Var2 = this.P;
                BigDecimal minScaled = footerInfo.getMinScaled();
                minScaled.getClass();
                BigDecimal maxScaled = footerInfo.getMaxScaled();
                maxScaled.getClass();
                BigDecimal maxPW = footerInfo.getMaxPW();
                maxPW.getClass();
                BigDecimal stake = footerInfo.getStake();
                stake.getClass();
                zd2Var2.onNext(new onw(minScaled, maxScaled, maxPW, stake, j, true));
                return;
            }
            zd2<iw90> zd2Var3 = this.Q;
            BigDecimal ptMin = footerInfo.getPtMin();
            ptMin.getClass();
            BigDecimal ptMax = footerInfo.getPtMax();
            ptMax.getClass();
            BigDecimal bonus2 = footerInfo.getBonus();
            bonus2.getClass();
            BigDecimal minStake = footerInfo.getMinStake();
            minStake.getClass();
            BigDecimal maxStake = footerInfo.getMaxStake();
            maxStake.getClass();
            zd2Var3.onNext(new iw90(ptMin, ptMax, bonus2, minStake, maxStake));
        } catch (Throwable th) {
            itf0.a.a(a320.a("[updateFooterInfo] : ", th), new Object[0]);
        }
    }

    public final void I(luo luoVar, String str, boolean z) {
        mgd0 mgd0Var = this.G;
        CheckBox checkBox = mgd0Var.s0;
        checkBox.setEnabled(luoVar == luo.c);
        if (checkBox.isEnabled()) {
            TextView textView = mgd0Var.y0;
            if (!z) {
                str = "--";
            }
            textView.setText(str);
            if (checkBox.isChecked()) {
                setOneCutUiVisible(true);
                mgd0Var.y.setVisibility(8);
                mgd0Var.C.setVisibility(8);
                mgd0Var.z.setVisibility(8);
            } else {
                setOneCutUiVisible(false);
            }
        } else {
            f();
        }
        luo luoVar2 = luo.b;
        View view = mgd0Var.c0;
        if (luoVar == luoVar2) {
            view.setVisibility(0);
        } else {
            view.setVisibility(8);
        }
    }

    public final void J(boolean z) {
        mgd0 mgd0Var = this.G;
        if (z) {
            mgd0Var.p0.setBackgroundResource(R.drawable.background_flash_odds);
            mgd0Var.p0.setTextColor(-1);
        } else {
            mgd0Var.p0.setBackgroundColor(Color.parseColor("#00000000"));
            mgd0Var.p0.setTextColor(getContext().getColor(R.color.text_type1_primary));
        }
    }

    public final void K(View view) {
        view.setVisibility(this.G.W.getVisibility() != 8 ? 0 : 8);
    }

    public final void c(BigDecimal bigDecimal) {
        if (iu2.p()) {
            boolean zU0 = iu2.a.j().u0();
            mgd0 mgd0Var = this.G;
            if (zU0) {
                A("-");
                c8i0.m(mgd0Var.p0, "-", this.I, this.J);
                c8i0.m(mgd0Var.m0, "-", this.I, this.J);
                c8i0.m(mgd0Var.a1, "-", this.I, this.J);
                c8i0.m(mgd0Var.G, "-", this.I, this.J);
                t(false, true);
            }
            if (SimShareData.INSTANCE.getMultiBetBonusEnable() || bigDecimal == null) {
                return;
            }
            c8i0.m(mgd0Var.p0, bjb0.L(bigDecimal, Locale.US), this.I, this.J);
        }
    }

    public final boolean d(int i, imn imnVar) {
        imnVar.getClass();
        boolean zIsEmpty = TextUtils.isEmpty(imnVar.b);
        if (i == 1) {
            itf0.a aVar = itf0.a;
            aVar.q(MyLog.TAG_COMMON);
            aVar.g(inm.a("[Single Footer] obj.msg=", imnVar.b), new Object[0]);
            return getSingleBetUseCases().d();
        }
        if (i != 2) {
            return zIsEmpty;
        }
        if (!iu2.p() || TextUtils.isEmpty(imnVar.a) || new BigDecimal(imnVar.a).compareTo(getGetMaxStakeUseCase().a()) <= 0) {
            return Intrinsics.g(getMultipleBetUseCases().c(), cvd0.e.a);
        }
        return false;
    }

    public final void e() {
        getCompositeDisposable().d();
    }

    public final void f() {
        mgd0 mgd0Var = this.G;
        if (mgd0Var.s0.isChecked()) {
            mgd0Var.s0.setChecked(false);
            this.V = false;
            g93.a().K(false);
        }
        mgd0Var.u0.setVisibility(8);
    }

    public final void g(View view, CheckBox checkBox, TextView textView, final Function1<? super huy, Unit> function1) {
        String strB;
        String strB2;
        shh0 upFooterInsureUseCase = getUpFooterInsureUseCase();
        huy huyVar = shh0.g;
        if (upFooterInsureUseCase.b() == zuy.b) {
            int i = 0;
            o(textView, false);
            shh0 upFooterInsureUseCase2 = getUpFooterInsureUseCase();
            thh0 thh0Var = upFooterInsureUseCase2.f;
            boolean z = nhh0.a(upFooterInsureUseCase2.d).a;
            boolean z2 = this.W == huy.a && checkBox.isChecked();
            shh0 upFooterInsureUseCase3 = getUpFooterInsureUseCase();
            thh0 thh0Var2 = upFooterInsureUseCase3.f;
            boolean z3 = nhh0.a(upFooterInsureUseCase3.d).b;
            boolean z4 = this.W == huy.b && checkBox.isChecked();
            final f23 f23Var = new f23(this, textView, checkBox);
            View viewInflate = LayoutInflater.from(this.G.a.getContext()).inflate(R.layout.spr_insure_one_two_up_menu, (ViewGroup) null);
            final PopupWindow popupWindow = new PopupWindow(viewInflate, -2, -2, true);
            popupWindow.setOutsideTouchable(true);
            popupWindow.setFocusable(true);
            popupWindow.setElevation(4.0f);
            popupWindow.setBackgroundDrawable(new ColorDrawable(0));
            popupWindow.showAsDropDown(view, 0, 0);
            popupWindow.setOnDismissListener(new PopupWindow.OnDismissListener() { // from class: t23
                @Override // android.widget.PopupWindow.OnDismissListener
                public final void onDismiss() {
                    int i2 = BetSlipFooter.j0;
                    f23Var.invoke(null, null);
                }
            });
            final CheckBox checkBox2 = (CheckBox) viewInflate.findViewById(R.id.one_up_checkbox);
            checkBox2.setEnabled(z);
            checkBox2.setChecked(z2);
            checkBox2.setOnClickListener(new View.OnClickListener() { // from class: u23
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    int i2 = BetSlipFooter.j0;
                    f23Var.invoke(huy.a, checkBox2.isChecked() ? avy.a : avy.c);
                    popupWindow.dismiss();
                }
            });
            TextView textView2 = (TextView) viewInflate.findViewById(R.id.one_up_text);
            if (z) {
                Context context = textView2.getContext();
                context.getClass();
                strB = sn5.b(context, R.string.common_bet_ways__early_payout, new Object[0]);
            } else {
                Context context2 = textView2.getContext();
                context2.getClass();
                strB = sn5.b(context2, R.string.common_bet_ways__not_supported, new Object[0]);
            }
            textView2.setText(strB);
            View viewFindViewById = viewInflate.findViewById(R.id.one_up_overlay);
            viewFindViewById.setVisibility(z ? 8 : 0);
            viewFindViewById.setOnClickListener(new v23(function1, i));
            final CheckBox checkBox3 = (CheckBox) viewInflate.findViewById(R.id.two_up_checkbox);
            checkBox3.setEnabled(z3);
            checkBox3.setChecked(z4);
            checkBox3.setOnClickListener(new View.OnClickListener() { // from class: x23
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    int i2 = BetSlipFooter.j0;
                    f23Var.invoke(huy.b, checkBox3.isChecked() ? avy.b : avy.c);
                    popupWindow.dismiss();
                }
            });
            TextView textView3 = (TextView) viewInflate.findViewById(R.id.two_up_text);
            if (z3) {
                Context context3 = textView3.getContext();
                context3.getClass();
                strB2 = sn5.b(context3, R.string.common_bet_ways__early_payout, new Object[0]);
            } else {
                Context context4 = textView3.getContext();
                context4.getClass();
                strB2 = sn5.b(context4, R.string.common_bet_ways__not_supported, new Object[0]);
            }
            textView3.setText(strB2);
            View viewFindViewById2 = viewInflate.findViewById(R.id.two_up_overlay);
            viewFindViewById2.setVisibility(z3 ? 8 : 0);
            viewFindViewById2.setOnClickListener(new View.OnClickListener() { // from class: y23
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    int i2 = BetSlipFooter.j0;
                    function1.invoke(huy.b);
                }
            });
            to3 to3Var = this.H;
            if (to3Var != null) {
                to3Var.g1();
            }
        }
    }

    public final uqm getAccountHelper() {
        uqm uqmVar = this.accountHelper;
        if (uqmVar != null) {
            return uqmVar;
        }
        Intrinsics.n("accountHelper");
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

    public final lrm getBetStore() {
        lrm lrmVar = this.betStore;
        if (lrmVar != null) {
            return lrmVar;
        }
        Intrinsics.n("betStore");
        throw null;
    }

    public final lq1 getBoConfigSource() {
        lq1 lq1Var = this.boConfigSource;
        if (lq1Var != null) {
            return lq1Var;
        }
        Intrinsics.n("boConfigSource");
        throw null;
    }

    public final BigDecimal getBonus() {
        return this.S.k();
    }

    public final psm getCountryManager() {
        psm psmVar = this.countryManager;
        if (psmVar != null) {
            return psmVar;
        }
        Intrinsics.n("countryManager");
        throw null;
    }

    public final m2l getDataStore() {
        m2l m2lVar = this.dataStore;
        if (m2lVar != null) {
            return m2lVar;
        }
        Intrinsics.n("dataStore");
        throw null;
    }

    public final String getDisplayedBonus() {
        String string;
        mgd0 mgd0Var = this.G;
        CharSequence text = mgd0Var.y.getText();
        if (text == null || (string = text.toString()) == null || mgd0Var.y.getVisibility() != 0 || StringsKt.U(string)) {
            return null;
        }
        return string;
    }

    public final String getDisplayedPotentialWinnings() {
        String string;
        CharSequence text = this.G.p0.getText();
        if (text == null || (string = text.toString()) == null || StringsKt.U(string) || string.equals("--")) {
            return null;
        }
        return string;
    }

    public final String getDisplayedTotalOdds() {
        String string;
        mgd0 mgd0Var = this.G;
        CharSequence text = mgd0Var.m0.getText();
        if (text == null || (string = text.toString()) == null || mgd0Var.m0.getVisibility() != 0 || StringsKt.U(string)) {
            return null;
        }
        return string;
    }

    public final p8k getGetMaxStakeUseCase() {
        p8k p8kVar = this.getMaxStakeUseCase;
        if (p8kVar != null) {
            return p8kVar;
        }
        Intrinsics.n("getMaxStakeUseCase");
        throw null;
    }

    public final boolean getInsureEarlyPayoutActive() {
        return this.e0 instanceof dkf.a;
    }

    public final hvo getInsureMoreUiStateManager() {
        hvo hvoVar = this.insureMoreUiStateManager;
        if (hvoVar != null) {
            return hvoVar;
        }
        Intrinsics.n("insureMoreUiStateManager");
        throw null;
    }

    /* JADX INFO: renamed from: getInsureOneTwoUpCase, reason: from getter */
    public final huy getW() {
        return this.W;
    }

    public final int getMultiInputViewHeight() {
        return this.G.j0.getHeight();
    }

    public final pmw getMultipleBetUseCases() {
        pmw pmwVar = this.multipleBetUseCases;
        if (pmwVar != null) {
            return pmwVar;
        }
        Intrinsics.n("multipleBetUseCases");
        throw null;
    }

    public final iym getOpenTelemetryLogger() {
        iym iymVar = this.openTelemetryLogger;
        if (iymVar != null) {
            return iymVar;
        }
        Intrinsics.n("openTelemetryLogger");
        throw null;
    }

    public final iez getOverUnderEarlyGoalInsureEnabledUseCase() {
        iez iezVar = this.overUnderEarlyGoalInsureEnabledUseCase;
        if (iezVar != null) {
            return iezVar;
        }
        Intrinsics.n("overUnderEarlyGoalInsureEnabledUseCase");
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

    public final p980 getSelectionUseCases() {
        p980 p980Var = this.selectionUseCases;
        if (p980Var != null) {
            return p980Var;
        }
        Intrinsics.n("selectionUseCases");
        throw null;
    }

    public final int getSimCurrentAutoTimes() {
        return this.G.l0.getF();
    }

    public final it90 getSingleBetUseCases() {
        it90 it90Var = this.singleBetUseCases;
        if (it90Var != null) {
            return it90Var;
        }
        Intrinsics.n("singleBetUseCases");
        throw null;
    }

    public final int getSingleInputViewHeight() {
        return this.G.M0.getHeight();
    }

    public final shh0 getUpFooterInsureUseCase() {
        shh0 shh0Var = this.upFooterInsureUseCase;
        if (shh0Var != null) {
            return shh0Var;
        }
        Intrinsics.n("upFooterInsureUseCase");
        throw null;
    }

    public final Object h(String str, tje0 tje0Var) {
        return getDataStore().a.getBoolean(str, false, tje0Var);
    }

    public final void k() {
        las lasVar = this.I;
        if (lasVar != null) {
            ej5.c(lasVar, null, null, new h33(this, null), 3);
        }
    }

    public final void l(TaxConfigs taxConfigs, BetslipActivity betslipActivity) {
        taxConfigs.getClass();
        this.K = taxConfigs;
        mgd0 mgd0Var = this.G;
        int i = 0;
        mgd0Var.D.setOnClickListener(new r23(betslipActivity, i));
        mgd0Var.D.setVisibility((!iu2.a.j().G1() || iu2.p()) ? 8 : 0);
        setMultipleTotalOddsMaxWidthTo70PercentScreen(betslipActivity);
        mgd0Var.M0.setQuickStakeToolStatus(3);
        mgd0Var.j0.setQuickStakeToolStatus(3);
        TaxConfigs taxConfigs2 = this.K;
        if (taxConfigs2 == null) {
            Intrinsics.n("taxConfigData");
            throw null;
        }
        x(2, taxConfigs2.hasRate(iu2.p()));
        if (!mgd0Var.s0.isChecked()) {
            this.V = false;
        }
        SimulateAutoBetPanel simulateAutoBetPanel = mgd0Var.H0;
        simulateAutoBetPanel.setAutoBetTimesListener(new g23());
        SimShareData simShareData = SimShareData.INSTANCE;
        simulateAutoBetPanel.G = simShareData.getAutoBetMaxTimes();
        simulateAutoBetPanel.E(simShareData.getAutoBetTimes());
        SimulateAutoBetPanel simulateAutoBetPanel2 = mgd0Var.l0;
        simulateAutoBetPanel2.setAutoBetTimesListener(new SimulateAutoBetPanel.a() { // from class: h23
            @Override // com.sportybet.plugin.realsports.betslip.simulate.SimulateAutoBetPanel.a
            public final void a(int i2) {
                int i3 = BetSlipFooter.j0;
                SimShareData.INSTANCE.setAutoBetTimes(i2);
                to3 to3Var = this.a.H;
                if (to3Var != null) {
                    to3Var.c0();
                }
            }
        });
        simulateAutoBetPanel2.G = simShareData.getAutoBetMaxTimes();
        simulateAutoBetPanel2.E(simShareData.getAutoBetTimes());
        ema compositeDisposable = getCompositeDisposable();
        zd2<Integer> autoBetTimesSubject = simShareData.getAutoBetTimesSubject();
        final i23 i23Var = new i23();
        ucy ucyVarB = ucy.b(autoBetTimesSubject, this.Q, new k54() { // from class: j23
            @Override // defpackage.k54
            public final Object apply(Object obj, Object obj2) {
                int i2 = BetSlipFooter.j0;
                obj.getClass();
                obj2.getClass();
                return (Pair) i23Var.invoke(obj, obj2);
            }
        });
        a43 a43Var = new a43(this);
        ucyVarB.a(a43Var);
        compositeDisposable.b(a43Var);
        ema compositeDisposable2 = getCompositeDisposable();
        zd2<Integer> autoBetTimesSubject2 = simShareData.getAutoBetTimesSubject();
        final k23 k23Var = new k23();
        ucy ucyVarB2 = ucy.b(autoBetTimesSubject2, this.P, new k54() { // from class: m23
            @Override // defpackage.k54
            public final Object apply(Object obj, Object obj2) {
                int i2 = BetSlipFooter.j0;
                obj.getClass();
                obj2.getClass();
                return (Pair) k23Var.invoke(obj, obj2);
            }
        });
        b43 b43Var = new b43(this);
        ucyVarB2.a(b43Var);
        compositeDisposable2.b(b43Var);
        ema compositeDisposable3 = getCompositeDisposable();
        zd2<Integer> autoBetTimesSubject3 = simShareData.getAutoBetTimesSubject();
        final n23 n23Var = new n23();
        ucy ucyVarB3 = ucy.b(autoBetTimesSubject3, this.S, new k54() { // from class: o23
            @Override // defpackage.k54
            public final Object apply(Object obj, Object obj2) {
                int i2 = BetSlipFooter.j0;
                obj.getClass();
                obj2.getClass();
                return (Pair) n23Var.invoke(obj, obj2);
            }
        });
        c43 c43Var = new c43(this);
        ucyVarB3.a(c43Var);
        compositeDisposable3.b(c43Var);
        ema compositeDisposable4 = getCompositeDisposable();
        zd2<Integer> autoBetTimesSubject4 = simShareData.getAutoBetTimesSubject();
        q23 q23Var = new q23(new p23());
        yby.b(autoBetTimesSubject4, "source1 is null");
        zd2<Pair<TaxConfigs, String>> zd2Var = this.R;
        yby.b(zd2Var, "source2 is null");
        zd2<String> zd2Var2 = this.T;
        yby.b(zd2Var2, "source3 is null");
        ucy ucyVarC = ucy.c(new dey[]{autoBetTimesSubject4, zd2Var, zd2Var2}, new taj.b(q23Var), r2i.a);
        z33 z33Var = new z33(this);
        ucyVarC.a(z33Var);
        compositeDisposable4.b(z33Var);
        shh0 upFooterInsureUseCase = getUpFooterInsureUseCase();
        c33 c33Var = new c33(this, i);
        huy huyVar = shh0.g;
        this.W = upFooterInsureUseCase.a(false, c33Var);
    }

    public final boolean m() {
        return this.G.N.isChecked();
    }

    public final boolean n() {
        return this.G.s0.isChecked();
    }

    public final void p(boolean z) {
        g93.a().E(z);
        mgd0 mgd0Var = this.G;
        if (z) {
            k();
            g93.a().G(false);
            g93.a().K(false);
            mgd0Var.N.setChecked(false);
            mgd0Var.K.setVisibility(8);
            mgd0Var.s0.setChecked(false);
            this.V = false;
        }
        B(mgd0Var.U);
        setAnyWinUiVisible(z);
        to3 to3Var = this.H;
        if (to3Var != null) {
            to3Var.r();
            Unit unit = Unit.a;
        }
    }

    public final void q(boolean z) {
        g93.a().G(z);
        mgd0 mgd0Var = this.G;
        if (z) {
            k();
            g93.a().K(false);
            g93.a().E(false);
            mgd0Var.s0.setChecked(false);
            this.V = false;
            mgd0Var.U.setChecked(false);
        }
        B(mgd0Var.N);
        to3 to3Var = this.H;
        if (to3Var != null) {
            to3Var.A();
            Unit unit = Unit.a;
        }
    }

    public final void r(boolean z) {
        g93.a().K(z);
        mgd0 mgd0Var = this.G;
        if (z) {
            k();
            g93.a().G(false);
            g93.a().E(false);
            mgd0Var.z0.setVisibility(0);
            mgd0Var.N.setChecked(false);
            mgd0Var.K.setVisibility(8);
            mgd0Var.U.setChecked(false);
        }
        B(mgd0Var.s0);
        to3 to3Var = this.H;
        if (to3Var != null) {
            to3Var.i1();
            Unit unit = Unit.a;
        }
    }

    public final void s(boolean z, boolean z2) {
        this.G.z.setVisibility((!z2 || SimShareData.INSTANCE.getMultiBetBonusEnable()) && !z && !m() ? 0 : 8);
    }

    public final void setAccountHelper(uqm uqmVar) {
        uqmVar.getClass();
        this.accountHelper = uqmVar;
    }

    public final void setActivityLifecycleScope(las lifecycleScope) {
        lifecycleScope.getClass();
        this.I = lifecycleScope;
    }

    public final void setAnyWinChecked(boolean isChecked) {
        this.G.U.setChecked(isChecked);
    }

    public final void setAnyWinEnable(luo status) {
        status.getClass();
        int iOrdinal = status.ordinal();
        mgd0 mgd0Var = this.G;
        if (iOrdinal == 0) {
            CheckBox checkBox = mgd0Var.U;
            checkBox.setVisibility(8);
            mgd0Var.V.setVisibility(8);
            checkBox.setEnabled(false);
            checkBox.setChecked(false);
            g93.a().E(false);
            return;
        }
        if (iOrdinal == 1) {
            View view = mgd0Var.V;
            CheckBox checkBox2 = mgd0Var.U;
            view.setVisibility(0);
            checkBox2.setEnabled(false);
            checkBox2.setChecked(false);
            g93.a().E(false);
            return;
        }
        if (iOrdinal != 2) {
            uhc.a();
            return;
        }
        View view2 = mgd0Var.V;
        CheckBox checkBox3 = mgd0Var.U;
        view2.setVisibility(8);
        checkBox3.setEnabled(true);
        setAnyWinUiVisible(checkBox3.isChecked());
    }

    public final void setBetItem(jrm jrmVar) {
        jrmVar.getClass();
        this.betItem = jrmVar;
    }

    public final void setBetStore(lrm lrmVar) {
        lrmVar.getClass();
        this.betStore = lrmVar;
    }

    public final void setBetTypeFooterVisibility(int betType, boolean isSim) {
        boolean z = betType == 1;
        boolean z2 = betType == 2;
        boolean z3 = betType == 3;
        mgd0 mgd0Var = this.G;
        if (isSim) {
            mgd0Var.G0.setVisibility(8);
            mgd0Var.k0.setVisibility(8);
            mgd0Var.U0.setVisibility(8);
        } else {
            ConstraintLayout constraintLayout = mgd0Var.G0;
            if (z) {
                constraintLayout.setVisibility(0);
            } else {
                constraintLayout.setVisibility(8);
            }
            RelativeLayout relativeLayout = mgd0Var.k0;
            if (z2) {
                relativeLayout.setVisibility(0);
            } else {
                relativeLayout.setVisibility(8);
            }
            RelativeLayout relativeLayout2 = mgd0Var.U0;
            if (z3) {
                relativeLayout2.setVisibility(0);
            } else {
                relativeLayout2.setVisibility(8);
            }
        }
        if (z || z3) {
            mgd0Var.z0.setVisibility(8);
        }
    }

    public final void setBoConfigSource(lq1 lq1Var) {
        lq1Var.getClass();
        this.boConfigSource = lq1Var;
    }

    public final void setBonus(BigDecimal bonus) {
        bonus.getClass();
        try {
            zi50.a aVar = zi50.b;
            this.S.onNext(bonus);
            Unit unit = Unit.a;
        } catch (Throwable unused) {
            zi50.a aVar2 = zi50.b;
        }
    }

    public final void setCountryManager(psm psmVar) {
        psmVar.getClass();
        this.countryManager = psmVar;
    }

    public final void setDataStore(m2l m2lVar) {
        m2lVar.getClass();
        this.dataStore = m2lVar;
    }

    public final void setEarlyPayoutEnable(luo status) {
        status.getClass();
        this.G.X.setEnabled(status == luo.c);
    }

    public final void setEditBetStake(String value) {
        value.getClass();
        this.G.j0.setInputData(value);
        to3 to3Var = this.H;
        if (to3Var != null) {
            to3Var.g(value);
        }
    }

    public final void setGetMaxStakeUseCase(p8k p8kVar) {
        p8kVar.getClass();
        this.getMaxStakeUseCase = p8kVar;
    }

    public final void setGiftText(String text) {
        mgd0 mgd0Var = this.G;
        mgd0Var.M0.setGiftText(text);
        mgd0Var.j0.setGiftText(text);
    }

    public final void setGiftsSelected(boolean isSelected) {
        to3 to3Var = this.H;
        Integer numValueOf = to3Var != null ? Integer.valueOf(to3Var.x()) : null;
        mgd0 mgd0Var = this.G;
        mgd0Var.M0.setGiftChecked(isSelected && numValueOf != null && numValueOf.intValue() == 1);
        mgd0Var.j0.setGiftChecked(isSelected && numValueOf != null && numValueOf.intValue() == 2);
        F(iu2.p(), false, isSelected);
    }

    public final void setGiftsVisible(boolean isVisible) {
        if (iu2.p()) {
            return;
        }
        boolean z = false;
        boolean z2 = isVisible && iw2.d();
        to3 to3Var = this.H;
        Integer numValueOf = to3Var != null ? Integer.valueOf(to3Var.x()) : null;
        setGiftText(sn5.c(this, R.string.gift__l_gift, new Object[0]));
        mgd0 mgd0Var = this.G;
        mgd0Var.M0.setGiftShow(z2 && numValueOf != null && numValueOf.intValue() == 1);
        EditTextWithKeyBoard editTextWithKeyBoard = mgd0Var.j0;
        if (z2 && numValueOf != null && numValueOf.intValue() == 2) {
            z = true;
        }
        editTextWithKeyBoard.setGiftShow(z);
        mgd0Var.S0.setVisibility(8);
    }

    public final void setInVisibleLayout() {
        mgd0 mgd0Var = this.G;
        mgd0Var.G0.setVisibility(8);
        mgd0Var.k0.setVisibility(8);
        mgd0Var.U0.setVisibility(8);
        t(false, true);
        w(false, false);
        x(2, false);
        setGiftsVisible(false);
    }

    public final void setInitMultiple(boolean initial, imn obj) {
        String strC;
        int iMin;
        BigDecimal bigDecimal;
        c9p c9pVar;
        obj.getClass();
        mr4 mr4VarB = lw2.d.b();
        mr4VarB.getClass();
        if (!iu2.p()) {
            strC = qz3.c(mr4VarB, nh4.c().e());
        } else if (SimShareData.INSTANCE.getMultiBetBonusEnable()) {
            strC = qz3.c(mr4VarB, true);
        } else {
            s(false, iu2.p());
            strC = "";
        }
        if ((iu2.p() && iu2.a.j().u0()) || qz3.g()) {
            iMin = 0;
        } else {
            double d = mr4VarB.c;
            BigDecimal[] bigDecimalArr = nh4.c().f;
            iMin = (int) ((d / ((double) ((bigDecimalArr == null || bigDecimalArr.length <= 0) ? 27 : Math.min(bigDecimalArr.length, ird0.a().o())))) * 100.0d);
        }
        mgd0 mgd0Var = this.G;
        ProgressBar progressBar = mgd0Var.A;
        CheckBox checkBox = mgd0Var.U;
        CheckBox checkBox2 = mgd0Var.s0;
        CheckBox checkBox3 = mgd0Var.N;
        TextView textView = mgd0Var.o0;
        progressBar.setProgress(iMin);
        boolean zIsEmpty = TextUtils.isEmpty(strC);
        AppCompatTextView appCompatTextView = mgd0Var.B;
        if (zIsEmpty) {
            appCompatTextView.setVisibility(8);
        } else {
            appCompatTextView.setText(strC);
        }
        J(false);
        if (initial) {
            k53 k53VarC = iu2.c();
            k53VarC.getClass();
            if (kotlin.collections.b.k(k53.REAL, k53.SIM).contains(k53VarC)) {
                EditTextWithKeyBoard editTextWithKeyBoard = mgd0Var.j0;
                las lasVar = this.I;
                Map<String, c9p> map = this.J;
                e13 e13Var = new e13(mgd0Var, obj);
                String strA = d40.a(editTextWithKeyBoard.getId(), System.identityHashCode(editTextWithKeyBoard), "_");
                jvd0 jvd0VarC = null;
                if (map != null && (c9pVar = map.get(strA)) != null) {
                    c9pVar.cancel((CancellationException) null);
                }
                if (lasVar != null) {
                    pfd pfdVar = fse.a;
                    jvd0VarC = ej5.c(lasVar, gku.a, null, new f8i0(editTextWithKeyBoard, e13Var, map, strA, null), 2);
                }
                if (jvd0VarC != null && map != null) {
                    map.put(strA, jvd0VarC);
                }
            }
        }
        String str = obj.a;
        str.getClass();
        if (str.length() > 0) {
            try {
                bigDecimal = new BigDecimal(obj.a);
            } catch (Throwable th) {
                itf0.a aVar = itf0.a;
                aVar.q(MyLog.TAG_BET_SLIP);
                aVar.o(th);
                bigDecimal = BigDecimal.ZERO;
            }
            textView.setText(bjb0.L(bigDecimal.multiply(new BigDecimal(getSimCurrentAutoTimes())), Locale.US));
        } else {
            textView.setText(bjb0.L(BigDecimal.ZERO, Locale.US));
        }
        if (checkBox3.isChecked()) {
            B(checkBox3);
        }
        if (checkBox2.isChecked()) {
            B(checkBox2);
        }
        if (checkBox.isChecked()) {
            B(checkBox);
        }
    }

    public final void setInitSingle(String singleInput) {
        singleInput.getClass();
        if (singleInput.length() > 0) {
            this.G.M0.setInputData(singleInput);
        }
    }

    public final void setInputMinStakeHint() {
        mgd0 mgd0Var = this.G;
        mgd0Var.M0.setMinStakeHint();
        mgd0Var.j0.setMinStakeHint();
    }

    public final void setInsureEarlyGoalsChecked(boolean checked) {
        iez overUnderEarlyGoalInsureEnabledUseCase = getOverUnderEarlyGoalInsureEnabledUseCase();
        jrm jrmVar = overUnderEarlyGoalInsureEnabledUseCase.a;
        if (!overUnderEarlyGoalInsureEnabledUseCase.b.d(ckf.c) || jrmVar.D() || jrmVar.m0()) {
            setInsureEarlyGoalsEnable(false);
            return;
        }
        mgd0 mgd0Var = this.G;
        mgd0Var.C0.setChecked(checked);
        mgd0Var.Q0.setChecked(checked);
        mgd0Var.X.setChecked(checked);
    }

    public final void setInsureEarlyGoalsEnable(boolean enable) {
        mgd0 mgd0Var = this.G;
        CheckBox checkBox = mgd0Var.C0;
        View view = mgd0Var.Y;
        View view2 = mgd0Var.R0;
        checkBox.setEnabled(enable);
        mgd0Var.Q0.setEnabled(enable);
        mgd0Var.X.setEnabled(enable);
        View view3 = mgd0Var.D0;
        if (enable) {
            view3.setVisibility(8);
            view2.setVisibility(8);
            view.setVisibility(8);
        } else {
            view3.setVisibility(0);
            view2.setVisibility(0);
            view.setVisibility(0);
        }
    }

    public final void setInsureEarlyGoalsLoading(boolean isLoading) {
        mgd0 mgd0Var = this.G;
        boolean z = !isLoading;
        mgd0Var.C0.setEnabled(z);
        mgd0Var.Q0.setEnabled(z);
        mgd0Var.X.setEnabled(z);
    }

    public final void setInsureEarlyPayoutViewState(dkf viewState) {
        viewState.getClass();
        if (viewState instanceof dkf.a) {
            this.e0 = viewState;
            setInsureEarlyPayoutVisible(true);
            setInsureEarlyGoalsChecked(true);
            setInsureEarlyGoalsEnable(true);
            return;
        }
        if (viewState instanceof dkf.d) {
            this.e0 = viewState;
            setInsureEarlyPayoutVisible(true);
            setInsureEarlyGoalsChecked(false);
            setInsureEarlyGoalsEnable(true);
            return;
        }
        if (viewState instanceof dkf.b) {
            this.e0 = viewState;
            setInsureEarlyPayoutVisible(true);
            setInsureEarlyGoalsChecked(false);
            setInsureEarlyGoalsEnable(false);
            return;
        }
        if (!(viewState instanceof dkf.c)) {
            uhc.a();
        } else {
            this.e0 = viewState;
            setInsureEarlyPayoutVisible(false);
        }
    }

    public final void setInsureMoreUiStateManager(hvo hvoVar) {
        hvoVar.getClass();
        this.insureMoreUiStateManager = hvoVar;
    }

    public final void setInsureOneTwoUpChecked(boolean checked) {
        avy avyVar;
        if (!getUpFooterInsureUseCase().d()) {
            setInsureOneTwoUpEnable(false);
            return;
        }
        huy huyVar = this.W;
        if (checked) {
            avyVar = huyVar == huy.a ? avy.a : avy.b;
        } else {
            avyVar = avy.c;
        }
        this.c0 = avyVar;
        mgd0 mgd0Var = this.G;
        mgd0Var.I0.setChecked(checked);
        mgd0Var.W0.setChecked(checked);
        mgd0Var.d0.setChecked(checked);
    }

    public final void setInsureOneTwoUpEnable(boolean enable) {
        mgd0 mgd0Var = this.G;
        CheckBox checkBox = mgd0Var.I0;
        View view = mgd0Var.f0;
        View view2 = mgd0Var.Y0;
        checkBox.setEnabled(enable);
        mgd0Var.L0.setEnabled(enable);
        mgd0Var.W0.setEnabled(enable);
        mgd0Var.Z0.setEnabled(enable);
        mgd0Var.d0.setEnabled(enable);
        mgd0Var.g0.setEnabled(enable);
        View view3 = mgd0Var.K0;
        if (enable) {
            view3.setVisibility(8);
            view2.setVisibility(8);
            view.setVisibility(8);
        } else {
            view3.setVisibility(0);
            view2.setVisibility(0);
            view.setVisibility(0);
        }
    }

    public final void setInsureOneTwoUpViewState(xry viewState, boolean isSimpleBetSlipMode) {
        huy huyVar;
        huy huyVar2;
        boolean zIsChecked;
        avy avyVar;
        String strB;
        Drawable drawableC;
        avy avyVar2;
        viewState.getClass();
        boolean z = viewState instanceof xry.a;
        if (z) {
            huyVar = huy.a;
        } else {
            if (!(viewState instanceof xry.b)) {
                uhc.a();
                return;
            }
            huyVar = huy.b;
        }
        avy avyVar3 = this.b0;
        int i = avyVar3 == null ? -1 : a.b[avyVar3.ordinal()];
        if (i == -1) {
            huyVar2 = null;
        } else if (i == 1) {
            huyVar2 = huy.a;
        } else if (i != 2) {
            if (i != 3) {
                uhc.a();
                return;
            }
            huyVar2 = null;
        } else {
            huyVar2 = huy.b;
        }
        if (huyVar2 != null) {
            huyVar = huyVar2;
        }
        if (avyVar3 != null) {
            zIsChecked = avyVar3 != avy.c;
        } else {
            zIsChecked = viewState.isChecked();
        }
        if (avyVar3 != null) {
            if (viewState.isChecked()) {
                avyVar2 = z ? avy.a : avy.b;
            } else {
                avyVar2 = avy.c;
            }
            if (avyVar3 == avyVar2) {
                this.b0 = null;
            }
        }
        this.W = huyVar;
        if (zIsChecked) {
            avyVar = huyVar == huy.a ? avy.a : avy.b;
        } else {
            avyVar = avy.c;
        }
        this.c0 = avyVar;
        setInsureOneTwoUpVisible(viewState.isEnabled() && !isSimpleBetSlipMode);
        setInsureOneTwoUpEnable(viewState.isSupported());
        setInsureOneTwoUpChecked(zIsChecked);
        zuy state = viewState.getState();
        boolean zIsSupported = viewState.isSupported();
        int iOrdinal = huyVar.ordinal();
        if (iOrdinal == 0) {
            Context context = getContext();
            context.getClass();
            strB = sn5.b(context, R.string.common_bet_ways__1up, new Object[0]);
        } else if (iOrdinal != 1) {
            uhc.a();
            return;
        } else {
            Context context2 = getContext();
            context2.getClass();
            strB = sn5.b(context2, R.string.common_bet_ways__2up, new Object[0]);
        }
        setInsureOneTwoUpText(strB);
        shh0 upFooterInsureUseCase = getUpFooterInsureUseCase();
        huy huyVar3 = shh0.g;
        zuy zuyVarB = upFooterInsureUseCase.b();
        zuy zuyVar = zuy.b;
        mgd0 mgd0Var = this.G;
        if (zuyVarB == zuyVar) {
            Context context3 = getContext();
            context3.getClass();
            Drawable drawableC2 = s0b.c(context3, R.drawable.ic_up_flag, null, null, 6);
            Context context4 = getContext();
            context4.getClass();
            Drawable drawableC3 = s0b.c(context4, R.drawable.ic_arrow_down_1, new a78.c(zIsSupported ? R.color.text_type1_primary : R.color.text_disable_type1_primary), null, 4);
            mgd0Var.L0.setCompoundDrawablesWithIntrinsicBounds(drawableC2, (Drawable) null, drawableC3, (Drawable) null);
            mgd0Var.Z0.setCompoundDrawablesWithIntrinsicBounds(drawableC2, (Drawable) null, drawableC3, (Drawable) null);
            mgd0Var.g0.setCompoundDrawablesWithIntrinsicBounds(drawableC2, (Drawable) null, drawableC3, (Drawable) null);
            return;
        }
        if (state == zuy.d) {
            Context context5 = getContext();
            context5.getClass();
            drawableC = s0b.c(context5, R.drawable.ic_2up_flag, null, null, 6);
        } else {
            Context context6 = getContext();
            context6.getClass();
            drawableC = s0b.c(context6, R.drawable.ic_up_flag, null, null, 6);
        }
        mgd0Var.L0.setCompoundDrawablesWithIntrinsicBounds(drawableC, (Drawable) null, (Drawable) null, (Drawable) null);
        mgd0Var.Z0.setCompoundDrawablesWithIntrinsicBounds(drawableC, (Drawable) null, (Drawable) null, (Drawable) null);
        mgd0Var.g0.setCompoundDrawablesWithIntrinsicBounds(drawableC, (Drawable) null, (Drawable) null, (Drawable) null);
    }

    public final void setListener(to3 listener) {
        listener.getClass();
        this.H = listener;
    }

    public final void setLoading(boolean hasTax, boolean isEditMode) {
        x(2, hasTax);
        if (this.V || isEditMode) {
            return;
        }
        A("--");
        mgd0 mgd0Var = this.G;
        c8i0.m(mgd0Var.p0, "--", this.I, this.J);
        c8i0.m(mgd0Var.a1, "--", this.I, this.J);
        c8i0.m(mgd0Var.y, "--", this.I, this.J);
    }

    public final void setMultipleBetUseCases(pmw pmwVar) {
        pmwVar.getClass();
        this.multipleBetUseCases = pmwVar;
    }

    public final void setOneCutConfig(bqy.a config) {
        this.L = config;
        mgd0 mgd0Var = this.G;
        if (config != null) {
            int i = (int) (config.c * 100.0d);
            mgd0Var.w0.setMax(((int) (config.d * 100.0d)) - i);
            mgd0Var.w0.setOnSeekBarChangeListener(new i33(i, this));
            las lasVar = this.I;
            if (lasVar != null) {
                ej5.c(lasVar, null, null, new j33(null, mgd0Var, this), 3);
            }
        }
        bqy.a aVar = this.L;
        if (aVar == null || !aVar.b || iu2.p()) {
            TextView textView = mgd0Var.u0;
            Context context = getContext();
            context.getClass();
            textView.setText(nae0.a(sn5.b(context, R.string.component_betslip__one_cut_pay_one_selection_v2, new Object[0])));
            return;
        }
        TextView textView2 = mgd0Var.u0;
        Context context2 = getContext();
        context2.getClass();
        textView2.setText(nae0.a(sn5.b(context2, R.string.component_betslip__one_cut_slider_content, new Object[0])));
    }

    public final void setOneCutEnable(luo status) {
        status.getClass();
        mgd0 mgd0Var = this.G;
        mgd0Var.s0.setEnabled(status == luo.c);
        if (!mgd0Var.s0.isEnabled()) {
            f();
        }
        luo luoVar = luo.b;
        View view = mgd0Var.c0;
        if (status == luoVar) {
            view.setVisibility(0);
        } else {
            view.setVisibility(8);
        }
    }

    public final void setOpenTelemetryLogger(iym iymVar) {
        iymVar.getClass();
        this.openTelemetryLogger = iymVar;
    }

    public final void setOverUnderEarlyGoalInsureEnabledUseCase(iez iezVar) {
        iezVar.getClass();
        this.overUnderEarlyGoalInsureEnabledUseCase = iezVar;
    }

    public final void setRemoteConfigRepository(k650 k650Var) {
        k650Var.getClass();
        this.remoteConfigRepository = k650Var;
    }

    public final void setSelectionUseCases(p980 p980Var) {
        p980Var.getClass();
        this.selectionUseCases = p980Var;
    }

    public final void setShowExciseTax(boolean show, String tax) {
        tax.getClass();
        mgd0 mgd0Var = this.G;
        if (!show) {
            mgd0Var.H.setVisibility(8);
        } else {
            mgd0Var.H.setVisibility(0);
            mgd0Var.G.setText(tax);
        }
    }

    public final void setSimGiftsVisible(boolean isVisible) {
        mgd0 mgd0Var = this.G;
        mgd0Var.M0.setGiftShow(isVisible);
        mgd0Var.j0.setGiftShow(isVisible);
        mgd0Var.S0.setVisibility(8);
    }

    public final void setSingleBetUseCases(it90 it90Var) {
        it90Var.getClass();
        this.singleBetUseCases = it90Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r16v1 */
    /* JADX WARN: Type inference failed for: r16v2, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r16v3 */
    public final void setSportyInsure(luo flexBetStatus, luo oneCutStatus, luo anyWinStatus, luo earlyPayoutStatus, boolean isOneTwoUpConfigEnable, boolean isSimpleBetSlipMode) {
        luo luoVar;
        int i;
        LinearLayout linearLayout;
        luo luoVar2;
        int i2;
        int i3;
        luo luoVar3;
        LinearLayout linearLayout2;
        View view;
        ?? r16;
        boolean z;
        flexBetStatus.getClass();
        oneCutStatus.getClass();
        anyWinStatus.getClass();
        earlyPayoutStatus.getClass();
        mgd0 mgd0Var = this.G;
        if (isSimpleBetSlipMode || (flexBetStatus == (luoVar = luo.a) && oneCutStatus == luoVar && anyWinStatus == luoVar && earlyPayoutStatus == luoVar && !isOneTwoUpConfigEnable)) {
            mgd0Var.W.setVisibility(8);
            mgd0Var.K.setVisibility(8);
            mgd0Var.Q.setVisibility(8);
            mgd0Var.s0.setVisibility(8);
            mgd0Var.u0.setVisibility(8);
            mgd0Var.U.setVisibility(8);
            mgd0Var.b.setVisibility(8);
            mgd0Var.d.setVisibility(8);
            mgd0Var.X.setVisibility(8);
            mgd0Var.Y.setVisibility(8);
            mgd0Var.e0.setVisibility(8);
            mgd0Var.f0.setVisibility(8);
            return;
        }
        FlexboxLayout flexboxLayout = mgd0Var.O0;
        ConstraintLayout constraintLayout = mgd0Var.W;
        ImageView imageView = mgd0Var.b;
        BetSlipHintView betSlipHintView = mgd0Var.d;
        View view2 = mgd0Var.V;
        LinearLayout linearLayout3 = mgd0Var.e0;
        View view3 = mgd0Var.Y;
        View view4 = mgd0Var.X;
        CheckBox checkBox = mgd0Var.U;
        CheckBox checkBox2 = mgd0Var.s0;
        CheckBox checkBox3 = mgd0Var.N;
        flexboxLayout.setVisibility(0);
        int iOrdinal = flexBetStatus.ordinal();
        if (iOrdinal == 0) {
            checkBox3.setVisibility(8);
        } else if (iOrdinal != 2) {
            checkBox3.setVisibility(0);
        } else {
            checkBox3.setVisibility(0);
            if (checkBox3.isChecked()) {
                mgd0Var.K.setVisibility(0);
            }
        }
        int[] iArr = a.a;
        if (iArr[oneCutStatus.ordinal()] == 1) {
            checkBox2.setVisibility(8);
        } else {
            checkBox2.setVisibility(0);
            if (checkBox2.isChecked()) {
                checkBox2.setVisibility(0);
            }
            mgd0Var.z0.setBackgroundColor(getContext().getColor(iu2.p() ? R.color.custom_sim_theme_primary_opacity_type2 : R.color.custom_brand_secondary_variable_type1_opacity_type2));
        }
        if (iArr[anyWinStatus.ordinal()] == 1) {
            checkBox.setVisibility(8);
            view2.setVisibility(8);
            betSlipHintView.setVisibility(8);
            imageView.setVisibility(8);
        } else {
            checkBox.setVisibility(0);
            if (anyWinStatus == luo.c) {
                view2.setVisibility(8);
            } else {
                view2.setVisibility(0);
            }
        }
        las lasVar = this.I;
        if (lasVar != null) {
            i = 3;
            linearLayout = null;
            luoVar2 = flexBetStatus;
            ej5.c(lasVar, null, null, new b(luoVar2, mgd0Var, oneCutStatus, anyWinStatus, null), 3);
        } else {
            i = 3;
            linearLayout = null;
            luoVar2 = flexBetStatus;
        }
        int iOrdinal2 = earlyPayoutStatus.ordinal();
        if (iOrdinal2 == 0) {
            i2 = 0;
            i3 = 8;
            view4.setVisibility(8);
            view3.setVisibility(8);
        } else if (iOrdinal2 == 1) {
            i2 = 0;
            i3 = 8;
            view4.setVisibility(0);
            view3.setVisibility(0);
        } else {
            if (iOrdinal2 != 2) {
                uhc.a();
                return;
            }
            i2 = 0;
            view4.setVisibility(0);
            i3 = 8;
            view3.setVisibility(8);
        }
        if (isOneTwoUpConfigEnable) {
            constraintLayout.setVisibility(i2);
            linearLayout2.setVisibility(i2);
            luoVar3 = luoVar;
        } else {
            luoVar3 = luoVar;
            if (luoVar2 == luoVar3 && oneCutStatus == luoVar3 && anyWinStatus == luoVar3) {
                constraintLayout.setVisibility(i3);
            }
            linearLayout2 = linearLayout3;
            linearLayout2.setVisibility(i3);
            mgd0Var.f0.setVisibility(i3);
        }
        View view5 = luoVar2 != luoVar3 ? checkBox3 : linearLayout;
        if (!isOneTwoUpConfigEnable) {
            linearLayout2 = linearLayout3;
            linearLayout2 = linearLayout3;
            linearLayout2 = linearLayout;
        }
        linearLayout2 = linearLayout3;
        linearLayout2 = linearLayout3;
        if (earlyPayoutStatus == luoVar3) {
            view4 = linearLayout;
        }
        View view6 = oneCutStatus != luoVar3 ? checkBox2 : linearLayout;
        if (anyWinStatus != luoVar3) {
            r16 = linearLayout;
            view = checkBox;
        } else {
            view = linearLayout;
            r16 = view;
        }
        View[] viewArr = new View[5];
        viewArr[0] = view5;
        viewArr[1] = linearLayout2;
        viewArr[2] = view4;
        viewArr[i] = view6;
        viewArr[4] = view;
        ArrayList arrayListV = ay0.v(viewArr);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.clear();
        if (luoVar2 != luoVar3) {
            linkedHashMap.put(mgd0Var.I, checkBox3);
            linkedHashMap.put(mgd0Var.J, checkBox3);
        }
        if (oneCutStatus != luoVar3) {
            linkedHashMap.put(mgd0Var.t0, checkBox2);
            linkedHashMap.put(mgd0Var.x0, checkBox2);
        }
        if (anyWinStatus != luoVar3) {
            linkedHashMap.put(imageView, checkBox);
            linkedHashMap.put(betSlipHintView, checkBox);
        }
        to3 to3Var = this.H;
        if (to3Var == null || to3Var.x() != 2) {
            return;
        }
        int width = mgd0Var.v.getWidth();
        final TextView textView = mgd0Var.b0;
        final p13 p13Var = new p13(this, 0);
        f5w f5wVar = (f5w) getInsureMoreUiStateManager().a.getValue();
        final jvo jvoVar = this.U;
        jvoVar.getClass();
        f5wVar.getClass();
        if (arrayListV.isEmpty() || f5wVar.equals(f5w.a.a)) {
            textView.setVisibility(4);
            return;
        }
        jvoVar.f = textView;
        ArrayList arrayList = new ArrayList(arrayListV);
        jvoVar.e = arrayList;
        jvoVar.c = width;
        jvoVar.d = 0;
        int size = arrayList.size();
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        while (i6 < size) {
            Object obj = arrayList.get(i6);
            i6++;
            int i7 = i4 + 1;
            if (i4 < 0) {
                kotlin.collections.b.q();
                throw r16;
            }
            int measuredWidth = ((View) obj).getMeasuredWidth() + (i4 > 0 ? r0b.a(jvoVar.a, 4) : 0) + i5;
            if (measuredWidth <= jvoVar.c) {
                jvoVar.d++;
                i5 = measuredWidth;
            }
            i4 = i7;
        }
        int i8 = jvoVar.d;
        if (i8 >= i) {
            jvoVar.d = i;
            i8 = i;
        }
        if (i8 != 0 || jvoVar.e.isEmpty()) {
            z = true;
        } else {
            z = true;
            jvoVar.d = 1;
        }
        jvoVar.a(linkedHashMap);
        int visibility = textView.getVisibility();
        to3 to3Var2 = this.H;
        if (visibility == 0) {
            if (to3Var2 != null) {
                to3Var2.R(z);
            }
            Unit unit = Unit.a;
        } else {
            if (to3Var2 != null) {
                to3Var2.R(false);
            }
            Unit unit2 = Unit.a;
        }
        textView.setOnClickListener(new View.OnClickListener() { // from class: ivo
            @Override // android.view.View.OnClickListener
            public final void onClick(View view7) {
                jvoVar.b = true;
                textView.setVisibility(4);
                p13Var.invoke();
            }
        });
    }

    public final void setTextUpdateJobs(Map<String, c9p> betSlipActivityTextUpdateJobs) {
        betSlipActivityTextUpdateJobs.getClass();
        this.J = betSlipActivityTextUpdateJobs;
    }

    public final void setUpFooterInsureUseCase(shh0 shh0Var) {
        shh0Var.getClass();
        this.upFooterInsureUseCase = shh0Var;
    }

    public final void setWarningAndInputUIStatus(int betType, String msg, boolean isShowInvalidWarning) {
        mgd0 mgd0Var = this.G;
        if (betType == 1) {
            cvd0 cvd0VarF = getSingleBetUseCases().f();
            UiText uiTextA = fvd0.a(cvd0VarF, getBetStore().C() == null, getCountryManager().f());
            Context context = getContext();
            context.getClass();
            uiTextA.getClass();
            String string = uiTextA.e(context).toString();
            if (TextUtils.isEmpty(string)) {
                mgd0Var.M0.setAdditionalMsg(string, 0);
            } else {
                mgd0Var.M0.setAdditionalMsg(string, getContext().getColor(R.color.warning_primary));
                mgd0Var.M0.setRedBackground();
            }
            mgd0Var.M0.setGoToDepositBtnVisibleOrGone((cvd0VarF instanceof cvd0.c) && getBetStore().C() == null);
        } else if (betType == 2) {
            cvd0 cvd0VarC = getMultipleBetUseCases().c();
            UiText uiTextA2 = fvd0.a(cvd0VarC, true, getCountryManager().f());
            Context context2 = getContext();
            context2.getClass();
            uiTextA2.getClass();
            String string2 = uiTextA2.e(context2).toString();
            if (TextUtils.isEmpty(string2)) {
                mgd0Var.j0.setAdditionalMsg(string2, 0);
            } else {
                mgd0Var.j0.setAdditionalMsg(string2, getContext().getColor(R.color.warning_primary));
                mgd0Var.j0.setRedBackground();
            }
            mgd0Var.j0.setGoToDepositBtnVisibleOrGone(cvd0VarC instanceof cvd0.c);
        }
        if (isShowInvalidWarning) {
            mgd0Var.h0.setVisibility(0);
        } else {
            mgd0Var.h0.setVisibility(8);
        }
    }

    public final void t(boolean z, boolean z2) {
        boolean zContains;
        mgd0 mgd0Var = this.G;
        if (!z) {
            mgd0Var.C.setVisibility(8);
            mgd0Var.y.setVisibility(8);
            mgd0Var.z.setVisibility(8);
            return;
        }
        mgd0Var.C.setVisibility(0);
        mgd0Var.C.setText(getBonusTextWithCurrency());
        mgd0Var.y.setVisibility(0);
        ConstraintLayout constraintLayout = mgd0Var.z;
        if (z2) {
            zContains = false;
        } else {
            k53 k53VarC = iu2.c();
            k53VarC.getClass();
            zContains = kotlin.collections.b.k(k53.REAL, k53.SIM).contains(k53VarC);
        }
        constraintLayout.setVisibility(zContains ? 0 : 8);
    }

    public final void u(String str, boolean z) {
        mgd0 mgd0Var = this.G;
        if (!z) {
            mgd0Var.o0.setVisibility(8);
            mgd0Var.n0.setVisibility(8);
        } else {
            mgd0Var.o0.setVisibility(0);
            mgd0Var.n0.setVisibility(0);
            mgd0Var.o0.setText(str);
        }
    }

    public final void v(int i, int i2, boolean z) {
        String strB;
        StringBuilder sb = this.h0;
        sb.getClass();
        sb.setLength(0);
        StringBuilder sb2 = this.i0;
        sb2.getClass();
        sb2.setLength(0);
        if (n() && i2 == 2 && i > 1) {
            mgd0 mgd0Var = this.G;
            AppCompatTextView appCompatTextView = mgd0Var.A0;
            TextView textView = mgd0Var.r0;
            Context context = getContext();
            context.getClass();
            appCompatTextView.setText(sn5.b(context, R.string.common_functions__one_cut_win, new Object[0]));
            if (getCountryManager().p()) {
                Context context2 = getContext();
                context2.getClass();
                strB = sn5.b(context2, R.string.component_betslip__net_amount, new Object[0]);
            } else if (z) {
                Context context3 = getContext();
                context3.getClass();
                strB = sn5.b(context3, R.string.component_betslip__to_win, new Object[0]);
            } else {
                Context context4 = getContext();
                context4.getClass();
                strB = sn5.b(context4, R.string.component_betslip__potential_win, new Object[0]);
            }
            textView.setText(strB);
            int i3 = i + 1;
            Context context5 = getContext();
            context5.getClass();
            String strB2 = sn5.b(context5, R.string.component_betslip__vselection_of_vthreshold, String.valueOf(i), String.valueOf(i3));
            Context context6 = getContext();
            context6.getClass();
            String strB3 = sn5.b(context6, R.string.component_betslip__vselection_of_vthreshold, String.valueOf(i3), String.valueOf(i3));
            String strA = tug.a(" (", strB2, ")");
            String strA2 = tug.a(" (", strB3, ")");
            sb.append(appCompatTextView.getText());
            sb.append(strA);
            sb2.append(textView.getText());
            sb2.append(strA2);
            appCompatTextView.setText(sb);
            textView.setText(sb2);
        }
    }

    public final void w(boolean z, boolean z2) {
        mgd0 mgd0Var = this.G;
        if (!z) {
            mgd0Var.q0.setVisibility(8);
            return;
        }
        ConstraintLayout constraintLayout = mgd0Var.q0;
        TextView textView = mgd0Var.p0;
        constraintLayout.setVisibility(0);
        mgd0Var.q0.setBackgroundColor(getContext().getColor(z2 ? R.color.custom_sim_theme_primary_opacity_type2 : R.color.custom_brand_secondary_variable_type1_opacity_type2));
        if (z2) {
            textView.setBackgroundColor(Color.parseColor("#00000000"));
            textView.setTextColor(getContext().getColor(R.color.quick_bet_sim_count_color));
        }
    }

    public final void x(int i, boolean z) {
        String strB;
        String strC;
        mgd0 mgd0Var = this.G;
        if (z) {
            mgd0Var.b1.setVisibility(0);
            if (this.K != null) {
                TextView textView = mgd0Var.b1;
                if (getCountryManager().p()) {
                    TaxConfigs taxConfigs = this.K;
                    if (taxConfigs == null) {
                        Intrinsics.n("taxConfigData");
                        throw null;
                    }
                    strC = StringsKt.t0(sn5.c(this, R.string.component_betslip__winnings_tax, Integer.valueOf(taxConfigs.getRateAsPercentage(getBetItem().m0())))).toString();
                } else {
                    strC = sn5.c(this, R.string.bet_history__wh_tax, new Object[0]);
                }
                textView.setText(strC);
            }
            mgd0Var.a1.setVisibility(0);
        } else {
            mgd0Var.b1.setVisibility(8);
            mgd0Var.a1.setVisibility(8);
        }
        if (n() && i == 2) {
            v(0, 2, z);
            return;
        }
        TextView textView2 = mgd0Var.r0;
        if (getCountryManager().p()) {
            Context context = getContext();
            context.getClass();
            strB = sn5.b(context, R.string.component_betslip__net_amount, new Object[0]);
        } else if (z) {
            Context context2 = getContext();
            context2.getClass();
            strB = sn5.b(context2, R.string.component_betslip__to_win, new Object[0]);
        } else {
            Context context3 = getContext();
            context3.getClass();
            strB = sn5.b(context3, R.string.component_betslip__potential_win, new Object[0]);
        }
        textView2.setText(strB);
    }

    public final void y(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8) {
        t(!z ? !(z4 && z5 && z6) : !z3 || z2 || !z4 || !z5 || m() || n(), z7 || z8);
    }

    public final void z(View view, View view2) {
        K(view);
        ConstraintLayout constraintLayout = this.G.v;
        qry.a(constraintLayout, new g33(constraintLayout, view, view2));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BetSlipFooter(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BetSlipFooter(Context context) {
        this(context, null, 6, 0);
        context.getClass();
    }

    public /* synthetic */ BetSlipFooter(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }
}
