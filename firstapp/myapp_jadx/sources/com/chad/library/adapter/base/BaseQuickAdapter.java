package com.chad.library.adapter.base;

import android.animation.Animator;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import androidx.recyclerview.widget.n;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.animation.AlphaInAnimation;
import com.chad.library.adapter.base.animation.BaseAnimation;
import com.chad.library.adapter.base.animation.ScaleInAnimation;
import com.chad.library.adapter.base.animation.SlideInBottomAnimation;
import com.chad.library.adapter.base.animation.SlideInLeftAnimation;
import com.chad.library.adapter.base.animation.SlideInRightAnimation;
import com.chad.library.adapter.base.diff.BrvahAsyncDiffer;
import com.chad.library.adapter.base.diff.BrvahAsyncDifferConfig;
import com.chad.library.adapter.base.diff.BrvahListUpdateCallback;
import com.chad.library.adapter.base.listener.GridSpanSizeLookup;
import com.chad.library.adapter.base.listener.OnItemChildClickListener;
import com.chad.library.adapter.base.listener.OnItemChildLongClickListener;
import com.chad.library.adapter.base.listener.OnItemClickListener;
import com.chad.library.adapter.base.listener.OnItemLongClickListener;
import com.chad.library.adapter.base.module.BaseDraggableModule;
import com.chad.library.adapter.base.module.BaseLoadMoreModule;
import com.chad.library.adapter.base.module.BaseUpFetchModule;
import com.chad.library.adapter.base.module.DraggableModule;
import com.chad.library.adapter.base.module.LoadMoreModule;
import com.chad.library.adapter.base.module.UpFetchModule;
import com.chad.library.adapter.base.util.AdapterUtilsKt;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.sporty.android.core.model.tracking.AnalyticsParam;
import defpackage.fae;
import defpackage.ib5;
import defpackage.uhc;
import defpackage.zkh;
import java.lang.reflect.Constructor;
import java.lang.reflect.GenericSignatureFormatError;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.MalformedParameterizedTypeException;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u009a\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010!\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u001c\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u001e\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b!\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\u0016\b&\u0018\u0000 ¡\u0002*\u0004\b\u0000\u0010\u0001*\b\b\u0001\u0010\u0003*\u00020\u00022\b\u0012\u0004\u0012\u00028\u00010\u0004:\u0004¢\u0002¡\u0002B%\b\u0007\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0005\u0012\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00028\u00012\u0006\u0010\f\u001a\u00028\u0000H$¢\u0006\u0004\b\u000e\u0010\u000fJ-\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00028\u00012\u0006\u0010\f\u001a\u00028\u00002\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010H\u0014¢\u0006\u0004\b\u000e\u0010\u0013J\u001f\u0010\u0017\u001a\u00028\u00012\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001c\u001a\u00020\u00052\u0006\u0010\u001b\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u001f\u0010\u001e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00028\u00012\u0006\u0010\u001b\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ-\u0010\u001e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00028\u00012\u0006\u0010\u001b\u001a\u00020\u00052\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0007H\u0016¢\u0006\u0004\b\u001e\u0010 J\u0017\u0010\"\u001a\u00020!2\u0006\u0010\u001b\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\"\u0010#J\u0017\u0010$\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00028\u0001H\u0016¢\u0006\u0004\b$\u0010%J\u0017\u0010(\u001a\u00020\r2\u0006\u0010'\u001a\u00020&H\u0016¢\u0006\u0004\b(\u0010)J\u0017\u0010*\u001a\u00020\r2\u0006\u0010'\u001a\u00020&H\u0016¢\u0006\u0004\b*\u0010)J\u0017\u0010-\u001a\u00020,2\u0006\u0010+\u001a\u00020\u0005H\u0014¢\u0006\u0004\b-\u0010.J\u0019\u0010/\u001a\u00028\u00002\b\b\u0001\u0010\u001b\u001a\u00020\u0005H\u0016¢\u0006\u0004\b/\u00100J\u001b\u00101\u001a\u0004\u0018\u00018\u00002\b\b\u0001\u0010\u001b\u001a\u00020\u0005H\u0016¢\u0006\u0004\b1\u00100J\u0019\u00102\u001a\u00020\u00052\b\u0010\f\u001a\u0004\u0018\u00018\u0000H\u0016¢\u0006\u0004\b2\u00103J\u0013\u00105\u001a\b\u0012\u0004\u0012\u00020\u000504¢\u0006\u0004\b5\u00106J\u001b\u00109\u001a\u00020\r2\f\b\u0001\u00108\u001a\u000207\"\u00020\u0005¢\u0006\u0004\b9\u0010:J\u0013\u0010;\u001a\b\u0012\u0004\u0012\u00020\u000504¢\u0006\u0004\b;\u00106J\u001b\u0010<\u001a\u00020\r2\f\b\u0001\u00108\u001a\u000207\"\u00020\u0005¢\u0006\u0004\b<\u0010:J\u001f\u0010>\u001a\u00020\r2\u0006\u0010=\u001a\u00028\u00012\u0006\u0010\u0016\u001a\u00020\u0005H\u0014¢\u0006\u0004\b>\u0010\u001fJ\u001f\u0010A\u001a\u00020\r2\u0006\u0010@\u001a\u00020?2\u0006\u0010\u001b\u001a\u00020\u0005H\u0014¢\u0006\u0004\bA\u0010BJ\u001f\u0010C\u001a\u00020,2\u0006\u0010@\u001a\u00020?2\u0006\u0010\u001b\u001a\u00020\u0005H\u0014¢\u0006\u0004\bC\u0010DJ\u001f\u0010E\u001a\u00020\r2\u0006\u0010@\u001a\u00020?2\u0006\u0010\u001b\u001a\u00020\u0005H\u0014¢\u0006\u0004\bE\u0010BJ\u001f\u0010F\u001a\u00020,2\u0006\u0010@\u001a\u00020?2\u0006\u0010\u001b\u001a\u00020\u0005H\u0014¢\u0006\u0004\bF\u0010DJ\u001f\u0010G\u001a\u00020\r2\u0006\u0010=\u001a\u00028\u00012\u0006\u0010\u0016\u001a\u00020\u0005H\u0014¢\u0006\u0004\bG\u0010\u001fJ\u000f\u0010H\u001a\u00020\u0005H\u0014¢\u0006\u0004\bH\u0010\u001aJ\u0017\u0010I\u001a\u00020\u00052\u0006\u0010\u001b\u001a\u00020\u0005H\u0014¢\u0006\u0004\bI\u0010\u001dJ\u001f\u0010J\u001a\u00028\u00012\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u0005H\u0014¢\u0006\u0004\bJ\u0010\u0018J!\u0010K\u001a\u00028\u00012\u0006\u0010\u0015\u001a\u00020\u00142\b\b\u0001\u0010\u0006\u001a\u00020\u0005H\u0014¢\u0006\u0004\bK\u0010\u0018J\u0017\u0010K\u001a\u00028\u00012\u0006\u0010L\u001a\u00020?H\u0014¢\u0006\u0004\bK\u0010MJ\u0017\u0010O\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020NH\u0014¢\u0006\u0004\bO\u0010PJ!\u0010R\u001a\u0004\u0018\u00010?2\u0006\u0010\u001b\u001a\u00020\u00052\b\b\u0001\u0010Q\u001a\u00020\u0005¢\u0006\u0004\bR\u0010SJ+\u0010V\u001a\u00020\u00052\u0006\u0010L\u001a\u00020?2\b\b\u0002\u0010T\u001a\u00020\u00052\b\b\u0002\u0010U\u001a\u00020\u0005H\u0007¢\u0006\u0004\bV\u0010WJ+\u0010X\u001a\u00020\u00052\u0006\u0010L\u001a\u00020?2\b\b\u0002\u0010T\u001a\u00020\u00052\b\b\u0002\u0010U\u001a\u00020\u0005H\u0007¢\u0006\u0004\bX\u0010WJ\r\u0010Y\u001a\u00020,¢\u0006\u0004\bY\u0010ZJ\u0015\u0010\\\u001a\u00020\r2\u0006\u0010[\u001a\u00020?¢\u0006\u0004\b\\\u0010]J\r\u0010^\u001a\u00020\r¢\u0006\u0004\b^\u0010_J+\u0010`\u001a\u00020\u00052\u0006\u0010L\u001a\u00020?2\b\b\u0002\u0010T\u001a\u00020\u00052\b\b\u0002\u0010U\u001a\u00020\u0005H\u0007¢\u0006\u0004\b`\u0010WJ+\u0010a\u001a\u00020\u00052\u0006\u0010L\u001a\u00020?2\b\b\u0002\u0010T\u001a\u00020\u00052\b\b\u0002\u0010U\u001a\u00020\u0005H\u0007¢\u0006\u0004\ba\u0010WJ\u0015\u0010c\u001a\u00020\r2\u0006\u0010b\u001a\u00020?¢\u0006\u0004\bc\u0010]J\r\u0010d\u001a\u00020\r¢\u0006\u0004\bd\u0010_J\r\u0010e\u001a\u00020,¢\u0006\u0004\be\u0010ZJ\u0015\u0010g\u001a\u00020\r2\u0006\u0010f\u001a\u00020?¢\u0006\u0004\bg\u0010]J\u0015\u0010g\u001a\u00020\r2\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\bg\u0010hJ\r\u0010i\u001a\u00020\r¢\u0006\u0004\bi\u0010_J\r\u0010j\u001a\u00020,¢\u0006\u0004\bj\u0010ZJ\u001f\u0010m\u001a\u00020\r2\u0006\u0010l\u001a\u00020k2\u0006\u0010T\u001a\u00020\u0005H\u0014¢\u0006\u0004\bm\u0010nJ\u0015\u0010q\u001a\u00020\r2\u0006\u0010p\u001a\u00020o¢\u0006\u0004\bq\u0010rJ\u001f\u0010s\u001a\u00020\r2\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0007H\u0017¢\u0006\u0004\bs\u0010tJ\u001f\u0010v\u001a\u00020\r2\u000e\u0010u\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0007H\u0016¢\u0006\u0004\bv\u0010tJ\u001d\u0010y\u001a\u00020\r2\f\u0010x\u001a\b\u0012\u0004\u0012\u00028\u00000wH\u0017¢\u0006\u0004\by\u0010zJ\u001f\u0010{\u001a\u00020\r2\u000e\u0010u\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010wH\u0016¢\u0006\u0004\b{\u0010zJ!\u0010|\u001a\u00020\r2\b\b\u0001\u0010T\u001a\u00020\u00052\u0006\u0010\b\u001a\u00028\u0000H\u0016¢\u0006\u0004\b|\u0010}J!\u0010~\u001a\u00020\r2\b\b\u0001\u0010\u001b\u001a\u00020\u00052\u0006\u0010\b\u001a\u00028\u0000H\u0016¢\u0006\u0004\b~\u0010}J\u0019\u0010~\u001a\u00020\r2\b\b\u0001\u0010\b\u001a\u00028\u0000H\u0016¢\u0006\u0004\b~\u0010\u007fJ(\u0010~\u001a\u00020\r2\b\b\u0001\u0010\u001b\u001a\u00020\u00052\f\u0010x\u001a\b\u0012\u0004\u0012\u00028\u00000wH\u0016¢\u0006\u0005\b~\u0010\u0080\u0001J\u001f\u0010~\u001a\u00020\r2\u000e\b\u0001\u0010x\u001a\b\u0012\u0004\u0012\u00028\u00000wH\u0016¢\u0006\u0004\b~\u0010zJ\u001b\u0010\u0081\u0001\u001a\u00020\r2\b\b\u0001\u0010\u001b\u001a\u00020\u0005H\u0017¢\u0006\u0005\b\u0081\u0001\u0010hJ\u001b\u0010\u0082\u0001\u001a\u00020\r2\b\b\u0001\u0010\u001b\u001a\u00020\u0005H\u0016¢\u0006\u0005\b\u0082\u0001\u0010hJ\u0019\u0010\u0081\u0001\u001a\u00020\r2\u0006\u0010\b\u001a\u00028\u0000H\u0016¢\u0006\u0005\b\u0081\u0001\u0010\u007fJ\u001a\u0010\u0084\u0001\u001a\u00020\r2\u0007\u0010\u0083\u0001\u001a\u00020\u0005H\u0004¢\u0006\u0005\b\u0084\u0001\u0010hJ \u0010\u0087\u0001\u001a\u00020\r2\u000e\u0010\u0086\u0001\u001a\t\u0012\u0004\u0012\u00028\u00000\u0085\u0001¢\u0006\u0006\b\u0087\u0001\u0010\u0088\u0001J \u0010\u008b\u0001\u001a\u00020\r2\u000e\u0010\u008a\u0001\u001a\t\u0012\u0004\u0012\u00028\u00000\u0089\u0001¢\u0006\u0006\b\u008b\u0001\u0010\u008c\u0001J\u0019\u0010\u008e\u0001\u001a\t\u0012\u0004\u0012\u00028\u00000\u008d\u0001H\u0007¢\u0006\u0006\b\u008e\u0001\u0010\u008f\u0001J\u0017\u0010\u0090\u0001\u001a\t\u0012\u0004\u0012\u00028\u00000\u008d\u0001¢\u0006\u0006\b\u0090\u0001\u0010\u008f\u0001J0\u0010\u0093\u0001\u001a\u00020\r2\u000e\u0010u\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00072\f\b\u0002\u0010\u0092\u0001\u001a\u0005\u0018\u00010\u0091\u0001H\u0017¢\u0006\u0006\b\u0093\u0001\u0010\u0094\u0001J,\u0010\u0093\u0001\u001a\u00020\r2\n\b\u0001\u0010\u0096\u0001\u001a\u00030\u0095\u00012\f\u0010u\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007H\u0016¢\u0006\u0006\b\u0093\u0001\u0010\u0097\u0001J\u001c\u0010\u009a\u0001\u001a\u00020\r2\n\u0010\u0099\u0001\u001a\u0005\u0018\u00010\u0098\u0001¢\u0006\u0006\b\u009a\u0001\u0010\u009b\u0001J\u001c\u0010\u009e\u0001\u001a\u00020\r2\n\u0010\u009d\u0001\u001a\u0005\u0018\u00010\u009c\u0001¢\u0006\u0006\b\u009e\u0001\u0010\u009f\u0001J\u001c\u0010¡\u0001\u001a\u00020\r2\n\u0010\u009d\u0001\u001a\u0005\u0018\u00010 \u0001¢\u0006\u0006\b¡\u0001\u0010¢\u0001J\u001c\u0010¤\u0001\u001a\u00020\r2\n\u0010\u009d\u0001\u001a\u0005\u0018\u00010£\u0001¢\u0006\u0006\b¤\u0001\u0010¥\u0001J\u001c\u0010§\u0001\u001a\u00020\r2\n\u0010\u009d\u0001\u001a\u0005\u0018\u00010¦\u0001¢\u0006\u0006\b§\u0001\u0010¨\u0001J\u0013\u0010©\u0001\u001a\u0005\u0018\u00010\u009c\u0001¢\u0006\u0006\b©\u0001\u0010ª\u0001J\u0013\u0010«\u0001\u001a\u0005\u0018\u00010 \u0001¢\u0006\u0006\b«\u0001\u0010¬\u0001J\u0013\u0010\u00ad\u0001\u001a\u0005\u0018\u00010£\u0001¢\u0006\u0006\b\u00ad\u0001\u0010®\u0001J\u0013\u0010¯\u0001\u001a\u0005\u0018\u00010¦\u0001¢\u0006\u0006\b¯\u0001\u0010°\u0001J\u0011\u0010±\u0001\u001a\u00020\rH\u0002¢\u0006\u0005\b±\u0001\u0010_J'\u0010´\u0001\u001a\t\u0012\u0002\b\u0003\u0018\u00010²\u00012\f\u0010³\u0001\u001a\u0007\u0012\u0002\b\u00030²\u0001H\u0002¢\u0006\u0006\b´\u0001\u0010µ\u0001J*\u0010¶\u0001\u001a\u0004\u0018\u00018\u00012\f\u0010³\u0001\u001a\u0007\u0012\u0002\b\u00030²\u00012\u0006\u0010L\u001a\u00020?H\u0002¢\u0006\u0006\b¶\u0001\u0010·\u0001J\u0019\u0010¸\u0001\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020NH\u0002¢\u0006\u0005\b¸\u0001\u0010PR\u0015\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0006\u0010¹\u0001R;\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00072\r\u0010º\u0001\u001a\b\u0012\u0004\u0012\u00028\u00000\u00078\u0006@@X\u0086\u000e¢\u0006\u0016\n\u0005\b\b\u0010»\u0001\u001a\u0006\b¼\u0001\u0010½\u0001\"\u0005\b¾\u0001\u0010tR(\u0010¿\u0001\u001a\u00020,8\u0006@\u0006X\u0086\u000e¢\u0006\u0017\n\u0006\b¿\u0001\u0010À\u0001\u001a\u0005\bÁ\u0001\u0010Z\"\u0006\bÂ\u0001\u0010Ã\u0001R(\u0010Ä\u0001\u001a\u00020,8\u0006@\u0006X\u0086\u000e¢\u0006\u0017\n\u0006\bÄ\u0001\u0010À\u0001\u001a\u0005\bÅ\u0001\u0010Z\"\u0006\bÆ\u0001\u0010Ã\u0001R(\u0010Ç\u0001\u001a\u00020,8\u0006@\u0006X\u0086\u000e¢\u0006\u0017\n\u0006\bÇ\u0001\u0010À\u0001\u001a\u0005\bÇ\u0001\u0010Z\"\u0006\bÈ\u0001\u0010Ã\u0001R(\u0010É\u0001\u001a\u00020,8\u0006@\u0006X\u0086\u000e¢\u0006\u0017\n\u0006\bÉ\u0001\u0010À\u0001\u001a\u0005\bÊ\u0001\u0010Z\"\u0006\bË\u0001\u0010Ã\u0001R(\u0010Ì\u0001\u001a\u00020,8\u0006@\u0006X\u0086\u000e¢\u0006\u0017\n\u0006\bÌ\u0001\u0010À\u0001\u001a\u0005\bÍ\u0001\u0010Z\"\u0006\bÎ\u0001\u0010Ã\u0001R(\u0010Ï\u0001\u001a\u00020,8\u0006@\u0006X\u0086\u000e¢\u0006\u0017\n\u0006\bÏ\u0001\u0010À\u0001\u001a\u0005\bÐ\u0001\u0010Z\"\u0006\bÑ\u0001\u0010Ã\u0001R(\u0010Ò\u0001\u001a\u00020,8\u0006@\u0006X\u0086\u000e¢\u0006\u0017\n\u0006\bÒ\u0001\u0010À\u0001\u001a\u0005\bÒ\u0001\u0010Z\"\u0006\bÓ\u0001\u0010Ã\u0001R8\u0010Ö\u0001\u001a\u0005\u0018\u00010Ô\u00012\n\u0010Õ\u0001\u001a\u0005\u0018\u00010Ô\u00018\u0006@FX\u0086\u000e¢\u0006\u0018\n\u0006\bÖ\u0001\u0010×\u0001\u001a\u0006\bØ\u0001\u0010Ù\u0001\"\u0006\bÚ\u0001\u0010Û\u0001R\"\u0010Ü\u0001\u001a\u000b\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u008d\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÜ\u0001\u0010Ý\u0001R\u001a\u0010ß\u0001\u001a\u00030Þ\u00018\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\bß\u0001\u0010à\u0001R\u001a\u0010á\u0001\u001a\u00030Þ\u00018\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\bá\u0001\u0010à\u0001R\u001a\u0010ã\u0001\u001a\u00030â\u00018\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\bã\u0001\u0010ä\u0001R\u0019\u0010å\u0001\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bå\u0001\u0010¹\u0001R\u001c\u0010æ\u0001\u001a\u0005\u0018\u00010\u0098\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bæ\u0001\u0010ç\u0001R\u001c\u0010è\u0001\u001a\u0005\u0018\u00010\u009c\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bè\u0001\u0010é\u0001R\u001c\u0010ê\u0001\u001a\u0005\u0018\u00010 \u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bê\u0001\u0010ë\u0001R\u001c\u0010ì\u0001\u001a\u0005\u0018\u00010£\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bì\u0001\u0010í\u0001R\u001c\u0010î\u0001\u001a\u0005\u0018\u00010¦\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bî\u0001\u0010ï\u0001R\u001c\u0010ñ\u0001\u001a\u0005\u0018\u00010ð\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bñ\u0001\u0010ò\u0001R\u001c\u0010ô\u0001\u001a\u0005\u0018\u00010ó\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bô\u0001\u0010õ\u0001R,\u0010÷\u0001\u001a\u0005\u0018\u00010ö\u00018\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0006\b÷\u0001\u0010ø\u0001\u001a\u0006\bù\u0001\u0010ú\u0001\"\u0006\bû\u0001\u0010ü\u0001R.\u0010ý\u0001\u001a\u0004\u0018\u00010&2\t\u0010º\u0001\u001a\u0004\u0018\u00010&8\u0006@BX\u0086\u000e¢\u0006\u0010\n\u0006\bý\u0001\u0010þ\u0001\u001a\u0006\bÿ\u0001\u0010\u0080\u0002R\u001d\u0010\u0081\u0002\u001a\b\u0012\u0004\u0012\u00020\u0005048\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0081\u0002\u0010\u0082\u0002R\u001d\u0010\u0083\u0002\u001a\b\u0012\u0004\u0012\u00020\u0005048\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0083\u0002\u0010\u0082\u0002R\u0015\u0010\u0085\u0002\u001a\u00030ö\u00018F¢\u0006\b\u001a\u0006\b\u0084\u0002\u0010ú\u0001R\u0015\u0010\u0088\u0002\u001a\u00030ð\u00018F¢\u0006\b\u001a\u0006\b\u0086\u0002\u0010\u0087\u0002R\u0015\u0010\u008b\u0002\u001a\u00030ó\u00018F¢\u0006\b\u001a\u0006\b\u0089\u0002\u0010\u008a\u0002R\u0013\u0010'\u001a\u00020&8F¢\u0006\b\u001a\u0006\b\u008c\u0002\u0010\u0080\u0002R\u0015\u0010\u0090\u0002\u001a\u00030\u008d\u00028F¢\u0006\b\u001a\u0006\b\u008e\u0002\u0010\u008f\u0002R\u0013\u0010\u0092\u0002\u001a\u00020\u00058F¢\u0006\u0007\u001a\u0005\b\u0091\u0002\u0010\u001aR\u0013\u0010\u0094\u0002\u001a\u00020\u00058F¢\u0006\u0007\u001a\u0005\b\u0093\u0002\u0010\u001aR\u0017\u0010\u0097\u0002\u001a\u0005\u0018\u00010Þ\u00018F¢\u0006\b\u001a\u0006\b\u0095\u0002\u0010\u0096\u0002R\u0013\u0010\u0099\u0002\u001a\u00020\u00058F¢\u0006\u0007\u001a\u0005\b\u0098\u0002\u0010\u001aR\u0013\u0010\u009b\u0002\u001a\u00020\u00058F¢\u0006\u0007\u001a\u0005\b\u009a\u0002\u0010\u001aR\u0017\u0010\u009d\u0002\u001a\u0005\u0018\u00010Þ\u00018F¢\u0006\b\u001a\u0006\b\u009c\u0002\u0010\u0096\u0002R\u0017\u0010 \u0002\u001a\u0005\u0018\u00010â\u00018F¢\u0006\b\u001a\u0006\b\u009e\u0002\u0010\u009f\u0002¨\u0006£\u0002"}, d2 = {"Lcom/chad/library/adapter/base/BaseQuickAdapter;", "T", "Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;", "VH", "Landroidx/recyclerview/widget/RecyclerView$f;", "", "layoutResId", "", "data", "<init>", "(ILjava/util/List;)V", "holder", "item", "", "convert", "(Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;Ljava/lang/Object;)V", "", "", "payloads", "(Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;Ljava/lang/Object;Ljava/util/List;)V", "Landroid/view/ViewGroup;", "parent", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;", "getItemCount", "()I", "position", "getItemViewType", "(I)I", "onBindViewHolder", "(Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;I)V", "(Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;ILjava/util/List;)V", "", "getItemId", "(I)J", "onViewAttachedToWindow", "(Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;)V", "Landroidx/recyclerview/widget/RecyclerView;", "recyclerView", "onAttachedToRecyclerView", "(Landroidx/recyclerview/widget/RecyclerView;)V", "onDetachedFromRecyclerView", "type", "", "isFixedViewType", "(I)Z", "getItem", "(I)Ljava/lang/Object;", "getItemOrNull", "getItemPosition", "(Ljava/lang/Object;)I", "Ljava/util/LinkedHashSet;", "getChildClickViewIds", "()Ljava/util/LinkedHashSet;", "", "viewIds", "addChildClickViewIds", "([I)V", "getChildLongClickViewIds", "addChildLongClickViewIds", "viewHolder", "bindViewClickListener", "Landroid/view/View;", "v", "setOnItemClick", "(Landroid/view/View;I)V", "setOnItemLongClick", "(Landroid/view/View;I)Z", "setOnItemChildClick", "setOnItemChildLongClick", "onItemViewHolderCreated", "getDefItemCount", "getDefItemViewType", "onCreateDefViewHolder", "createBaseViewHolder", "view", "(Landroid/view/View;)Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$d0;", "setFullSpan", "(Landroidx/recyclerview/widget/RecyclerView$d0;)V", "viewId", "getViewByPosition", "(II)Landroid/view/View;", "index", "orientation", "addHeaderView", "(Landroid/view/View;II)I", "setHeaderView", "hasHeaderLayout", "()Z", "header", "removeHeaderView", "(Landroid/view/View;)V", "removeAllHeaderView", "()V", "addFooterView", "setFooterView", "footer", "removeFooterView", "removeAllFooterView", "hasFooterLayout", "emptyView", "setEmptyView", "(I)V", "removeEmptyView", "hasEmptyView", "Landroid/animation/Animator;", "anim", "startAnim", "(Landroid/animation/Animator;I)V", "Lcom/chad/library/adapter/base/BaseQuickAdapter$AnimationType;", "animationType", "setAnimationWithDefault", "(Lcom/chad/library/adapter/base/BaseQuickAdapter$AnimationType;)V", "setNewData", "(Ljava/util/List;)V", AnalyticsParam.SOCIAL_NEWS_CARD_CLICK_SOURCE_NEWS, "setNewInstance", "", "newData", "replaceData", "(Ljava/util/Collection;)V", "setList", "setData", "(ILjava/lang/Object;)V", "addData", "(Ljava/lang/Object;)V", "(ILjava/util/Collection;)V", "remove", "removeAt", "size", "compatibilityDataSizeChanged", "Landroidx/recyclerview/widget/n$e;", "diffCallback", "setDiffCallback", "(Landroidx/recyclerview/widget/n$e;)V", "Lcom/chad/library/adapter/base/diff/BrvahAsyncDifferConfig;", "config", "setDiffConfig", "(Lcom/chad/library/adapter/base/diff/BrvahAsyncDifferConfig;)V", "Lcom/chad/library/adapter/base/diff/BrvahAsyncDiffer;", "getDiffHelper", "()Lcom/chad/library/adapter/base/diff/BrvahAsyncDiffer;", "getDiffer", "Ljava/lang/Runnable;", "commitCallback", "setDiffNewData", "(Ljava/util/List;Ljava/lang/Runnable;)V", "Landroidx/recyclerview/widget/n$d;", "diffResult", "(Landroidx/recyclerview/widget/n$d;Ljava/util/List;)V", "Lcom/chad/library/adapter/base/listener/GridSpanSizeLookup;", "spanSizeLookup", "setGridSpanSizeLookup", "(Lcom/chad/library/adapter/base/listener/GridSpanSizeLookup;)V", "Lcom/chad/library/adapter/base/listener/OnItemClickListener;", "listener", "setOnItemClickListener", "(Lcom/chad/library/adapter/base/listener/OnItemClickListener;)V", "Lcom/chad/library/adapter/base/listener/OnItemLongClickListener;", "setOnItemLongClickListener", "(Lcom/chad/library/adapter/base/listener/OnItemLongClickListener;)V", "Lcom/chad/library/adapter/base/listener/OnItemChildClickListener;", "setOnItemChildClickListener", "(Lcom/chad/library/adapter/base/listener/OnItemChildClickListener;)V", "Lcom/chad/library/adapter/base/listener/OnItemChildLongClickListener;", "setOnItemChildLongClickListener", "(Lcom/chad/library/adapter/base/listener/OnItemChildLongClickListener;)V", "getOnItemClickListener", "()Lcom/chad/library/adapter/base/listener/OnItemClickListener;", "getOnItemLongClickListener", "()Lcom/chad/library/adapter/base/listener/OnItemLongClickListener;", "getOnItemChildClickListener", "()Lcom/chad/library/adapter/base/listener/OnItemChildClickListener;", "getOnItemChildLongClickListener", "()Lcom/chad/library/adapter/base/listener/OnItemChildLongClickListener;", "checkModule", "Ljava/lang/Class;", "z", "getInstancedGenericKClass", "(Ljava/lang/Class;)Ljava/lang/Class;", "createBaseGenericKInstance", "(Ljava/lang/Class;Landroid/view/View;)Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;", "addAnimation", "I", "<set-?>", "Ljava/util/List;", "getData", "()Ljava/util/List;", "setData$com_github_CymChad_brvah", "headerWithEmptyEnable", "Z", "getHeaderWithEmptyEnable", "setHeaderWithEmptyEnable", "(Z)V", "footerWithEmptyEnable", "getFooterWithEmptyEnable", "setFooterWithEmptyEnable", "isUseEmpty", "setUseEmpty", "headerViewAsFlow", "getHeaderViewAsFlow", "setHeaderViewAsFlow", "footerViewAsFlow", "getFooterViewAsFlow", "setFooterViewAsFlow", "animationEnable", "getAnimationEnable", "setAnimationEnable", "isAnimationFirstOnly", "setAnimationFirstOnly", "Lcom/chad/library/adapter/base/animation/BaseAnimation;", "value", "adapterAnimation", "Lcom/chad/library/adapter/base/animation/BaseAnimation;", "getAdapterAnimation", "()Lcom/chad/library/adapter/base/animation/BaseAnimation;", "setAdapterAnimation", "(Lcom/chad/library/adapter/base/animation/BaseAnimation;)V", "mDiffHelper", "Lcom/chad/library/adapter/base/diff/BrvahAsyncDiffer;", "Landroid/widget/LinearLayout;", "mHeaderLayout", "Landroid/widget/LinearLayout;", "mFooterLayout", "Landroid/widget/FrameLayout;", "mEmptyLayout", "Landroid/widget/FrameLayout;", "mLastPosition", "mSpanSizeLookup", "Lcom/chad/library/adapter/base/listener/GridSpanSizeLookup;", "mOnItemClickListener", "Lcom/chad/library/adapter/base/listener/OnItemClickListener;", "mOnItemLongClickListener", "Lcom/chad/library/adapter/base/listener/OnItemLongClickListener;", "mOnItemChildClickListener", "Lcom/chad/library/adapter/base/listener/OnItemChildClickListener;", "mOnItemChildLongClickListener", "Lcom/chad/library/adapter/base/listener/OnItemChildLongClickListener;", "Lcom/chad/library/adapter/base/module/BaseUpFetchModule;", "mUpFetchModule", "Lcom/chad/library/adapter/base/module/BaseUpFetchModule;", "Lcom/chad/library/adapter/base/module/BaseDraggableModule;", "mDraggableModule", "Lcom/chad/library/adapter/base/module/BaseDraggableModule;", "Lcom/chad/library/adapter/base/module/BaseLoadMoreModule;", "mLoadMoreModule", "Lcom/chad/library/adapter/base/module/BaseLoadMoreModule;", "getMLoadMoreModule$com_github_CymChad_brvah", "()Lcom/chad/library/adapter/base/module/BaseLoadMoreModule;", "setMLoadMoreModule$com_github_CymChad_brvah", "(Lcom/chad/library/adapter/base/module/BaseLoadMoreModule;)V", "recyclerViewOrNull", "Landroidx/recyclerview/widget/RecyclerView;", "getRecyclerViewOrNull", "()Landroidx/recyclerview/widget/RecyclerView;", "childClickViewIds", "Ljava/util/LinkedHashSet;", "childLongClickViewIds", "getLoadMoreModule", "loadMoreModule", "getUpFetchModule", "()Lcom/chad/library/adapter/base/module/BaseUpFetchModule;", "upFetchModule", "getDraggableModule", "()Lcom/chad/library/adapter/base/module/BaseDraggableModule;", "draggableModule", "getRecyclerView", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "context", "getHeaderViewPosition", "headerViewPosition", "getHeaderLayoutCount", "headerLayoutCount", "getHeaderLayout", "()Landroid/widget/LinearLayout;", "headerLayout", "getFooterViewPosition", "footerViewPosition", "getFooterLayoutCount", "footerLayoutCount", "getFooterLayout", "footerLayout", "getEmptyLayout", "()Landroid/widget/FrameLayout;", "emptyLayout", "Companion", "AnimationType", "com.github.CymChad.brvah"}, k = 1, mv = {1, 8, 0}, xi = 48)
public abstract class BaseQuickAdapter<T, VH extends BaseViewHolder> extends RecyclerView.f<VH> {
    public static final int EMPTY_VIEW = 268436821;
    public static final int FOOTER_VIEW = 268436275;
    public static final int HEADER_VIEW = 268435729;
    public static final int LOAD_MORE_VIEW = 268436002;
    private BaseAnimation adapterAnimation;
    private boolean animationEnable;
    private final LinkedHashSet<Integer> childClickViewIds;
    private final LinkedHashSet<Integer> childLongClickViewIds;
    private List<T> data;
    private boolean footerViewAsFlow;
    private boolean footerWithEmptyEnable;
    private boolean headerViewAsFlow;
    private boolean headerWithEmptyEnable;
    private boolean isAnimationFirstOnly;
    private boolean isUseEmpty;
    private final int layoutResId;
    private BrvahAsyncDiffer<T> mDiffHelper;
    private BaseDraggableModule mDraggableModule;
    private FrameLayout mEmptyLayout;
    private LinearLayout mFooterLayout;
    private LinearLayout mHeaderLayout;
    private int mLastPosition;
    private BaseLoadMoreModule mLoadMoreModule;
    private OnItemChildClickListener mOnItemChildClickListener;
    private OnItemChildLongClickListener mOnItemChildLongClickListener;
    private OnItemClickListener mOnItemClickListener;
    private OnItemLongClickListener mOnItemLongClickListener;
    private GridSpanSizeLookup mSpanSizeLookup;
    private BaseUpFetchModule mUpFetchModule;
    private RecyclerView recyclerViewOrNull;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/chad/library/adapter/base/BaseQuickAdapter$AnimationType;", "", "(Ljava/lang/String;I)V", "AlphaIn", "ScaleIn", "SlideInBottom", "SlideInLeft", "SlideInRight", "com.github.CymChad.brvah"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public enum AnimationType {
        AlphaIn,
        ScaleIn,
        SlideInBottom,
        SlideInLeft,
        SlideInRight
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[AnimationType.values().length];
            try {
                iArr[AnimationType.AlphaIn.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AnimationType.ScaleIn.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[AnimationType.SlideInBottom.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[AnimationType.SlideInLeft.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[AnimationType.SlideInRight.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public BaseQuickAdapter(int i, List<T> list) {
        this.layoutResId = i;
        this.data = list == null ? new ArrayList<>() : list;
        this.isUseEmpty = true;
        this.isAnimationFirstOnly = true;
        this.mLastPosition = -1;
        checkModule();
        this.childClickViewIds = new LinkedHashSet<>();
        this.childLongClickViewIds = new LinkedHashSet<>();
    }

    private final void addAnimation(RecyclerView.d0 holder) {
        if (this.animationEnable) {
            if (!this.isAnimationFirstOnly || holder.getLayoutPosition() > this.mLastPosition) {
                BaseAnimation alphaInAnimation = this.adapterAnimation;
                if (alphaInAnimation == null) {
                    alphaInAnimation = new AlphaInAnimation(0.0f, 1, null);
                }
                View view = holder.itemView;
                view.getClass();
                for (Animator animator : alphaInAnimation.animators(view)) {
                    startAnim(animator, holder.getLayoutPosition());
                }
                this.mLastPosition = holder.getLayoutPosition();
            }
        }
    }

    public static /* synthetic */ int addFooterView$default(BaseQuickAdapter baseQuickAdapter, View view, int i, int i2, int i3, Object obj) {
        if (obj != null) {
            zkh.a("Super calls with default arguments not supported in this target, function: addFooterView");
            return 0;
        }
        if ((i3 & 2) != 0) {
            i = -1;
        }
        if ((i3 & 4) != 0) {
            i2 = 1;
        }
        return baseQuickAdapter.addFooterView(view, i, i2);
    }

    public static /* synthetic */ int addHeaderView$default(BaseQuickAdapter baseQuickAdapter, View view, int i, int i2, int i3, Object obj) {
        if (obj != null) {
            zkh.a("Super calls with default arguments not supported in this target, function: addHeaderView");
            return 0;
        }
        if ((i3 & 2) != 0) {
            i = -1;
        }
        if ((i3 & 4) != 0) {
            i2 = 1;
        }
        return baseQuickAdapter.addHeaderView(view, i, i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bindViewClickListener$lambda$12$lambda$11$lambda$10(BaseViewHolder baseViewHolder, BaseQuickAdapter baseQuickAdapter, View view) {
        baseViewHolder.getClass();
        baseQuickAdapter.getClass();
        int bindingAdapterPosition = baseViewHolder.getBindingAdapterPosition();
        if (bindingAdapterPosition == -1) {
            return;
        }
        int headerLayoutCount = bindingAdapterPosition - baseQuickAdapter.getHeaderLayoutCount();
        view.getClass();
        baseQuickAdapter.setOnItemChildClick(view, headerLayoutCount);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean bindViewClickListener$lambda$15$lambda$14$lambda$13(BaseViewHolder baseViewHolder, BaseQuickAdapter baseQuickAdapter, View view) {
        baseViewHolder.getClass();
        baseQuickAdapter.getClass();
        int bindingAdapterPosition = baseViewHolder.getBindingAdapterPosition();
        if (bindingAdapterPosition == -1) {
            return false;
        }
        int headerLayoutCount = bindingAdapterPosition - baseQuickAdapter.getHeaderLayoutCount();
        view.getClass();
        return baseQuickAdapter.setOnItemChildLongClick(view, headerLayoutCount);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bindViewClickListener$lambda$7$lambda$6(BaseViewHolder baseViewHolder, BaseQuickAdapter baseQuickAdapter, View view) {
        baseViewHolder.getClass();
        baseQuickAdapter.getClass();
        int bindingAdapterPosition = baseViewHolder.getBindingAdapterPosition();
        if (bindingAdapterPosition == -1) {
            return;
        }
        int headerLayoutCount = bindingAdapterPosition - baseQuickAdapter.getHeaderLayoutCount();
        view.getClass();
        baseQuickAdapter.setOnItemClick(view, headerLayoutCount);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean bindViewClickListener$lambda$9$lambda$8(BaseViewHolder baseViewHolder, BaseQuickAdapter baseQuickAdapter, View view) {
        baseViewHolder.getClass();
        baseQuickAdapter.getClass();
        int bindingAdapterPosition = baseViewHolder.getBindingAdapterPosition();
        if (bindingAdapterPosition == -1) {
            return false;
        }
        int headerLayoutCount = bindingAdapterPosition - baseQuickAdapter.getHeaderLayoutCount();
        view.getClass();
        return baseQuickAdapter.setOnItemLongClick(view, headerLayoutCount);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void checkModule() {
        if (this instanceof LoadMoreModule) {
            this.mLoadMoreModule = ((LoadMoreModule) this).addLoadMoreModule(this);
        }
        if (this instanceof UpFetchModule) {
            this.mUpFetchModule = ((UpFetchModule) this).addUpFetchModule(this);
        }
        if (this instanceof DraggableModule) {
            this.mDraggableModule = ((DraggableModule) this).addDraggableModule(this);
        }
    }

    private final VH createBaseGenericKInstance(Class<?> z, View view) {
        try {
            if (!z.isMemberClass() || Modifier.isStatic(z.getModifiers())) {
                Constructor<?> declaredConstructor = z.getDeclaredConstructor(View.class);
                declaredConstructor.getClass();
                declaredConstructor.setAccessible(true);
                Object objNewInstance = declaredConstructor.newInstance(view);
                objNewInstance.getClass();
                return (VH) objNewInstance;
            }
            Constructor<?> declaredConstructor2 = z.getDeclaredConstructor(getClass(), View.class);
            declaredConstructor2.getClass();
            declaredConstructor2.setAccessible(true);
            Object objNewInstance2 = declaredConstructor2.newInstance(this, view);
            objNewInstance2.getClass();
            return (VH) objNewInstance2;
        } catch (IllegalAccessException e) {
            e.printStackTrace();
            return null;
        } catch (InstantiationException e2) {
            e2.printStackTrace();
            return null;
        } catch (NoSuchMethodException e3) {
            e3.printStackTrace();
            return null;
        } catch (InvocationTargetException e4) {
            e4.printStackTrace();
            return null;
        }
    }

    private final Class<?> getInstancedGenericKClass(Class<?> z) {
        try {
            Type genericSuperclass = z.getGenericSuperclass();
            if (!(genericSuperclass instanceof ParameterizedType)) {
                return null;
            }
            Type[] actualTypeArguments = ((ParameterizedType) genericSuperclass).getActualTypeArguments();
            actualTypeArguments.getClass();
            for (Type type : actualTypeArguments) {
                if (type instanceof Class) {
                    if (BaseViewHolder.class.isAssignableFrom((Class) type)) {
                        return (Class) type;
                    }
                } else if (type instanceof ParameterizedType) {
                    Type rawType = ((ParameterizedType) type).getRawType();
                    if ((rawType instanceof Class) && BaseViewHolder.class.isAssignableFrom((Class) rawType)) {
                        return (Class) rawType;
                    }
                } else {
                    continue;
                }
            }
            return null;
        } catch (TypeNotPresentException e) {
            e.printStackTrace();
            return null;
        } catch (GenericSignatureFormatError e2) {
            e2.printStackTrace();
            return null;
        } catch (MalformedParameterizedTypeException e3) {
            e3.printStackTrace();
            return null;
        }
    }

    public static /* synthetic */ void setDiffNewData$default(BaseQuickAdapter baseQuickAdapter, List list, Runnable runnable, int i, Object obj) {
        if (obj != null) {
            zkh.a("Super calls with default arguments not supported in this target, function: setDiffNewData");
            return;
        }
        if ((i & 2) != 0) {
            runnable = null;
        }
        baseQuickAdapter.setDiffNewData(list, runnable);
    }

    public static /* synthetic */ int setFooterView$default(BaseQuickAdapter baseQuickAdapter, View view, int i, int i2, int i3, Object obj) {
        if (obj != null) {
            zkh.a("Super calls with default arguments not supported in this target, function: setFooterView");
            return 0;
        }
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = 1;
        }
        return baseQuickAdapter.setFooterView(view, i, i2);
    }

    public static /* synthetic */ int setHeaderView$default(BaseQuickAdapter baseQuickAdapter, View view, int i, int i2, int i3, Object obj) {
        if (obj != null) {
            zkh.a("Super calls with default arguments not supported in this target, function: setHeaderView");
            return 0;
        }
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = 1;
        }
        return baseQuickAdapter.setHeaderView(view, i, i2);
    }

    public final void addChildClickViewIds(int... viewIds) {
        viewIds.getClass();
        for (int i : viewIds) {
            this.childClickViewIds.add(Integer.valueOf(i));
        }
    }

    public final void addChildLongClickViewIds(int... viewIds) {
        viewIds.getClass();
        for (int i : viewIds) {
            this.childLongClickViewIds.add(Integer.valueOf(i));
        }
    }

    public void addData(Collection<? extends T> newData) {
        newData.getClass();
        this.data.addAll(newData);
        notifyItemRangeInserted(getHeaderLayoutCount() + (this.data.size() - newData.size()), newData.size());
        compatibilityDataSizeChanged(newData.size());
    }

    public final int addFooterView(View view, int index, int orientation) {
        int footerViewPosition;
        view.getClass();
        if (this.mFooterLayout == null) {
            LinearLayout linearLayout = new LinearLayout(view.getContext());
            this.mFooterLayout = linearLayout;
            linearLayout.setOrientation(orientation);
            LinearLayout linearLayout2 = this.mFooterLayout;
            if (linearLayout2 == null) {
                Intrinsics.n("mFooterLayout");
                throw null;
            }
            linearLayout2.setLayoutParams(orientation == 1 ? new RecyclerView.LayoutParams(-1, -2) : new RecyclerView.LayoutParams(-2, -1));
        }
        LinearLayout linearLayout3 = this.mFooterLayout;
        if (linearLayout3 == null) {
            Intrinsics.n("mFooterLayout");
            throw null;
        }
        int childCount = linearLayout3.getChildCount();
        if (index < 0 || index > childCount) {
            index = childCount;
        }
        LinearLayout linearLayout4 = this.mFooterLayout;
        if (linearLayout4 == null) {
            Intrinsics.n("mFooterLayout");
            throw null;
        }
        linearLayout4.addView(view, index);
        LinearLayout linearLayout5 = this.mFooterLayout;
        if (linearLayout5 == null) {
            Intrinsics.n("mFooterLayout");
            throw null;
        }
        if (linearLayout5.getChildCount() == 1 && (footerViewPosition = getFooterViewPosition()) != -1) {
            notifyItemInserted(footerViewPosition);
        }
        return index;
    }

    public final int addHeaderView(View view, int index, int orientation) {
        int headerViewPosition;
        view.getClass();
        if (this.mHeaderLayout == null) {
            LinearLayout linearLayout = new LinearLayout(view.getContext());
            this.mHeaderLayout = linearLayout;
            linearLayout.setOrientation(orientation);
            LinearLayout linearLayout2 = this.mHeaderLayout;
            if (linearLayout2 == null) {
                Intrinsics.n("mHeaderLayout");
                throw null;
            }
            linearLayout2.setLayoutParams(orientation == 1 ? new RecyclerView.LayoutParams(-1, -2) : new RecyclerView.LayoutParams(-2, -1));
        }
        LinearLayout linearLayout3 = this.mHeaderLayout;
        if (linearLayout3 == null) {
            Intrinsics.n("mHeaderLayout");
            throw null;
        }
        int childCount = linearLayout3.getChildCount();
        if (index < 0 || index > childCount) {
            index = childCount;
        }
        LinearLayout linearLayout4 = this.mHeaderLayout;
        if (linearLayout4 == null) {
            Intrinsics.n("mHeaderLayout");
            throw null;
        }
        linearLayout4.addView(view, index);
        LinearLayout linearLayout5 = this.mHeaderLayout;
        if (linearLayout5 == null) {
            Intrinsics.n("mHeaderLayout");
            throw null;
        }
        if (linearLayout5.getChildCount() == 1 && (headerViewPosition = getHeaderViewPosition()) != -1) {
            notifyItemInserted(headerViewPosition);
        }
        return index;
    }

    public void bindViewClickListener(final VH viewHolder, int viewType) {
        viewHolder.getClass();
        if (this.mOnItemClickListener != null) {
            viewHolder.itemView.setOnClickListener(new View.OnClickListener() { // from class: o42
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    BaseQuickAdapter.bindViewClickListener$lambda$7$lambda$6(viewHolder, this, view);
                }
            });
        }
        if (this.mOnItemLongClickListener != null) {
            viewHolder.itemView.setOnLongClickListener(new View.OnLongClickListener() { // from class: p42
                @Override // android.view.View.OnLongClickListener
                public final boolean onLongClick(View view) {
                    return BaseQuickAdapter.bindViewClickListener$lambda$9$lambda$8(viewHolder, this, view);
                }
            });
        }
        if (this.mOnItemChildClickListener != null) {
            for (Integer num : getChildClickViewIds()) {
                View view = viewHolder.itemView;
                num.getClass();
                View viewFindViewById = view.findViewById(num.intValue());
                if (viewFindViewById != null) {
                    if (!viewFindViewById.isClickable()) {
                        viewFindViewById.setClickable(true);
                    }
                    viewFindViewById.setOnClickListener(new View.OnClickListener() { // from class: q42
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view2) {
                            BaseQuickAdapter.bindViewClickListener$lambda$12$lambda$11$lambda$10(viewHolder, this, view2);
                        }
                    });
                }
            }
        }
        if (this.mOnItemChildLongClickListener != null) {
            for (Integer num2 : getChildLongClickViewIds()) {
                View view2 = viewHolder.itemView;
                num2.getClass();
                View viewFindViewById2 = view2.findViewById(num2.intValue());
                if (viewFindViewById2 != null) {
                    if (!viewFindViewById2.isLongClickable()) {
                        viewFindViewById2.setLongClickable(true);
                    }
                    viewFindViewById2.setOnLongClickListener(new View.OnLongClickListener() { // from class: r42
                        @Override // android.view.View.OnLongClickListener
                        public final boolean onLongClick(View view3) {
                            return BaseQuickAdapter.bindViewClickListener$lambda$15$lambda$14$lambda$13(viewHolder, this, view3);
                        }
                    });
                }
            }
        }
    }

    public final void compatibilityDataSizeChanged(int size) {
        if (this.data.size() == size) {
            notifyDataSetChanged();
        }
    }

    public abstract void convert(VH holder, T item);

    public void convert(VH holder, T item, List<? extends Object> payloads) {
        holder.getClass();
        payloads.getClass();
    }

    public VH createBaseViewHolder(View view) {
        view.getClass();
        Class<?> instancedGenericKClass = null;
        for (Class<?> superclass = getClass(); instancedGenericKClass == null && superclass != null; superclass = superclass.getSuperclass()) {
            instancedGenericKClass = getInstancedGenericKClass(superclass);
        }
        VH vh = instancedGenericKClass == null ? (VH) new BaseViewHolder(view) : (VH) createBaseGenericKInstance(instancedGenericKClass, view);
        return vh == null ? (VH) new BaseViewHolder(view) : vh;
    }

    public final BaseAnimation getAdapterAnimation() {
        return this.adapterAnimation;
    }

    public final boolean getAnimationEnable() {
        return this.animationEnable;
    }

    public final LinkedHashSet<Integer> getChildClickViewIds() {
        return this.childClickViewIds;
    }

    public final LinkedHashSet<Integer> getChildLongClickViewIds() {
        return this.childLongClickViewIds;
    }

    public final Context getContext() {
        Context context = getRecyclerView().getContext();
        context.getClass();
        return context;
    }

    public final List<T> getData() {
        return this.data;
    }

    public int getDefItemCount() {
        return this.data.size();
    }

    public int getDefItemViewType(int position) {
        return super.getItemViewType(position);
    }

    @fae
    public final BrvahAsyncDiffer<T> getDiffHelper() {
        return getDiffer();
    }

    public final BrvahAsyncDiffer<T> getDiffer() {
        BrvahAsyncDiffer<T> brvahAsyncDiffer = this.mDiffHelper;
        if (brvahAsyncDiffer != null) {
            brvahAsyncDiffer.getClass();
            return brvahAsyncDiffer;
        }
        ib5.a("Please use setDiffCallback() or setDiffConfig() first!");
        return null;
    }

    public final BaseDraggableModule getDraggableModule() {
        BaseDraggableModule baseDraggableModule = this.mDraggableModule;
        if (baseDraggableModule != null) {
            baseDraggableModule.getClass();
            return baseDraggableModule;
        }
        ib5.a("Please first implements DraggableModule");
        return null;
    }

    public final FrameLayout getEmptyLayout() {
        FrameLayout frameLayout = this.mEmptyLayout;
        if (frameLayout == null) {
            return null;
        }
        if (frameLayout != null) {
            return frameLayout;
        }
        Intrinsics.n("mEmptyLayout");
        throw null;
    }

    public final LinearLayout getFooterLayout() {
        LinearLayout linearLayout = this.mFooterLayout;
        if (linearLayout == null) {
            return null;
        }
        if (linearLayout != null) {
            return linearLayout;
        }
        Intrinsics.n("mFooterLayout");
        throw null;
    }

    public final int getFooterLayoutCount() {
        return hasFooterLayout() ? 1 : 0;
    }

    public final boolean getFooterViewAsFlow() {
        return this.footerViewAsFlow;
    }

    public final int getFooterViewPosition() {
        if (!hasEmptyView()) {
            return this.data.size() + getHeaderLayoutCount();
        }
        int i = (this.headerWithEmptyEnable && hasHeaderLayout()) ? 2 : 1;
        if (this.footerWithEmptyEnable) {
            return i;
        }
        return -1;
    }

    public final boolean getFooterWithEmptyEnable() {
        return this.footerWithEmptyEnable;
    }

    public final LinearLayout getHeaderLayout() {
        LinearLayout linearLayout = this.mHeaderLayout;
        if (linearLayout == null) {
            return null;
        }
        if (linearLayout != null) {
            return linearLayout;
        }
        Intrinsics.n("mHeaderLayout");
        throw null;
    }

    public final int getHeaderLayoutCount() {
        return hasHeaderLayout() ? 1 : 0;
    }

    public final boolean getHeaderViewAsFlow() {
        return this.headerViewAsFlow;
    }

    public final int getHeaderViewPosition() {
        return (!hasEmptyView() || this.headerWithEmptyEnable) ? 0 : -1;
    }

    public final boolean getHeaderWithEmptyEnable() {
        return this.headerWithEmptyEnable;
    }

    public T getItem(int position) {
        return this.data.get(position);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.f
    public int getItemCount() {
        if (hasEmptyView()) {
            int i = (this.headerWithEmptyEnable && hasHeaderLayout()) ? 2 : 1;
            return (this.footerWithEmptyEnable && hasFooterLayout()) ? i + 1 : i;
        }
        BaseLoadMoreModule baseLoadMoreModule = this.mLoadMoreModule;
        return getFooterLayoutCount() + getDefItemCount() + getHeaderLayoutCount() + ((baseLoadMoreModule == null || !baseLoadMoreModule.hasLoadMoreView()) ? 0 : 1);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.f
    public long getItemId(int position) {
        return position;
    }

    public T getItemOrNull(int position) {
        return (T) CollectionsKt.V(position, this.data);
    }

    public int getItemPosition(T item) {
        if (item == null || this.data.isEmpty()) {
            return -1;
        }
        return this.data.indexOf(item);
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [boolean] */
    @Override // androidx.recyclerview.widget.RecyclerView.f
    public int getItemViewType(int position) {
        if (hasEmptyView()) {
            boolean z = this.headerWithEmptyEnable && hasHeaderLayout();
            if (position == 0) {
                return z ? HEADER_VIEW : EMPTY_VIEW;
            }
            if (position != 1) {
                return position != 2 ? EMPTY_VIEW : FOOTER_VIEW;
            }
            return z ? EMPTY_VIEW : FOOTER_VIEW;
        }
        boolean zHasHeaderLayout = hasHeaderLayout();
        if (zHasHeaderLayout && position == 0) {
            return HEADER_VIEW;
        }
        if (zHasHeaderLayout) {
            position--;
        }
        int size = this.data.size();
        if (position < size) {
            return getDefItemViewType(position);
        }
        return position - size < hasFooterLayout() ? FOOTER_VIEW : LOAD_MORE_VIEW;
    }

    public final BaseLoadMoreModule getLoadMoreModule() {
        BaseLoadMoreModule baseLoadMoreModule = this.mLoadMoreModule;
        if (baseLoadMoreModule != null) {
            baseLoadMoreModule.getClass();
            return baseLoadMoreModule;
        }
        ib5.a("Please first implements LoadMoreModule");
        return null;
    }

    /* JADX INFO: renamed from: getMLoadMoreModule$com_github_CymChad_brvah, reason: from getter */
    public final BaseLoadMoreModule getMLoadMoreModule() {
        return this.mLoadMoreModule;
    }

    /* JADX INFO: renamed from: getOnItemChildClickListener, reason: from getter */
    public final OnItemChildClickListener getMOnItemChildClickListener() {
        return this.mOnItemChildClickListener;
    }

    /* JADX INFO: renamed from: getOnItemChildLongClickListener, reason: from getter */
    public final OnItemChildLongClickListener getMOnItemChildLongClickListener() {
        return this.mOnItemChildLongClickListener;
    }

    /* JADX INFO: renamed from: getOnItemClickListener, reason: from getter */
    public final OnItemClickListener getMOnItemClickListener() {
        return this.mOnItemClickListener;
    }

    /* JADX INFO: renamed from: getOnItemLongClickListener, reason: from getter */
    public final OnItemLongClickListener getMOnItemLongClickListener() {
        return this.mOnItemLongClickListener;
    }

    public final RecyclerView getRecyclerView() {
        RecyclerView recyclerView = this.recyclerViewOrNull;
        if (recyclerView != null) {
            recyclerView.getClass();
            return recyclerView;
        }
        ib5.a("Please get it after onAttachedToRecyclerView()");
        return null;
    }

    public final RecyclerView getRecyclerViewOrNull() {
        return this.recyclerViewOrNull;
    }

    public final BaseUpFetchModule getUpFetchModule() {
        BaseUpFetchModule baseUpFetchModule = this.mUpFetchModule;
        if (baseUpFetchModule != null) {
            baseUpFetchModule.getClass();
            return baseUpFetchModule;
        }
        ib5.a("Please first implements UpFetchModule");
        return null;
    }

    public final View getViewByPosition(int position, int viewId) {
        BaseViewHolder baseViewHolder;
        RecyclerView recyclerView = this.recyclerViewOrNull;
        if (recyclerView == null || (baseViewHolder = (BaseViewHolder) recyclerView.L(position, false)) == null) {
            return null;
        }
        return baseViewHolder.getViewOrNull(viewId);
    }

    public final boolean hasEmptyView() {
        FrameLayout frameLayout = this.mEmptyLayout;
        if (frameLayout != null) {
            if (frameLayout == null) {
                Intrinsics.n("mEmptyLayout");
                throw null;
            }
            if (frameLayout.getChildCount() != 0 && this.isUseEmpty) {
                return this.data.isEmpty();
            }
            return false;
        }
        return false;
    }

    public final boolean hasFooterLayout() {
        LinearLayout linearLayout = this.mFooterLayout;
        if (linearLayout == null) {
            return false;
        }
        if (linearLayout != null) {
            return linearLayout.getChildCount() > 0;
        }
        Intrinsics.n("mFooterLayout");
        throw null;
    }

    public final boolean hasHeaderLayout() {
        LinearLayout linearLayout = this.mHeaderLayout;
        if (linearLayout == null) {
            return false;
        }
        if (linearLayout != null) {
            return linearLayout.getChildCount() > 0;
        }
        Intrinsics.n("mHeaderLayout");
        throw null;
    }

    /* JADX INFO: renamed from: isAnimationFirstOnly, reason: from getter */
    public final boolean getIsAnimationFirstOnly() {
        return this.isAnimationFirstOnly;
    }

    public boolean isFixedViewType(int type) {
        return type == 268436821 || type == 268435729 || type == 268436275 || type == 268436002;
    }

    /* JADX INFO: renamed from: isUseEmpty, reason: from getter */
    public final boolean getIsUseEmpty() {
        return this.isUseEmpty;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.f
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        recyclerView.getClass();
        super.onAttachedToRecyclerView(recyclerView);
        this.recyclerViewOrNull = recyclerView;
        BaseDraggableModule baseDraggableModule = this.mDraggableModule;
        if (baseDraggableModule != null) {
            baseDraggableModule.attachToRecyclerView(recyclerView);
        }
        final RecyclerView.o layoutManager = recyclerView.getLayoutManager();
        if (layoutManager instanceof GridLayoutManager) {
            GridLayoutManager gridLayoutManager = (GridLayoutManager) layoutManager;
            final GridLayoutManager.b bVar = gridLayoutManager.Z;
            gridLayoutManager.Z = new GridLayoutManager.b(this) { // from class: com.chad.library.adapter.base.BaseQuickAdapter.onAttachedToRecyclerView.1
                final /* synthetic */ BaseQuickAdapter<T, VH> this$0;

                {
                    this.this$0 = this;
                }

                @Override // androidx.recyclerview.widget.GridLayoutManager.b
                public int getSpanSize(int position) {
                    int itemViewType = this.this$0.getItemViewType(position);
                    if (itemViewType == 268435729 && this.this$0.getHeaderViewAsFlow()) {
                        return 1;
                    }
                    if (itemViewType == 268436275 && this.this$0.getFooterViewAsFlow()) {
                        return 1;
                    }
                    GridSpanSizeLookup gridSpanSizeLookup = ((BaseQuickAdapter) this.this$0).mSpanSizeLookup;
                    BaseQuickAdapter<T, VH> baseQuickAdapter = this.this$0;
                    if (gridSpanSizeLookup == null) {
                        return baseQuickAdapter.isFixedViewType(itemViewType) ? ((GridLayoutManager) layoutManager).U : bVar.getSpanSize(position);
                    }
                    if (baseQuickAdapter.isFixedViewType(itemViewType)) {
                        return ((GridLayoutManager) layoutManager).U;
                    }
                    GridSpanSizeLookup gridSpanSizeLookup2 = ((BaseQuickAdapter) this.this$0).mSpanSizeLookup;
                    gridSpanSizeLookup2.getClass();
                    return gridSpanSizeLookup2.getSpanSize((GridLayoutManager) layoutManager, itemViewType, position - this.this$0.getHeaderLayoutCount());
                }
            };
        }
    }

    public void onBindViewHolder(VH holder, int position, List<Object> payloads) {
        holder.getClass();
        payloads.getClass();
        if (payloads.isEmpty()) {
            onBindViewHolder((BaseViewHolder) holder, position);
        }
        BaseUpFetchModule baseUpFetchModule = this.mUpFetchModule;
        if (baseUpFetchModule != null) {
            baseUpFetchModule.autoUpFetch$com_github_CymChad_brvah(position);
        }
        BaseLoadMoreModule baseLoadMoreModule = this.mLoadMoreModule;
        if (baseLoadMoreModule != null) {
            baseLoadMoreModule.autoLoadMore$com_github_CymChad_brvah(position);
        }
        switch (holder.getItemViewType()) {
            case HEADER_VIEW /* 268435729 */:
            case FOOTER_VIEW /* 268436275 */:
            case EMPTY_VIEW /* 268436821 */:
                break;
            case LOAD_MORE_VIEW /* 268436002 */:
                BaseLoadMoreModule baseLoadMoreModule2 = this.mLoadMoreModule;
                if (baseLoadMoreModule2 != null) {
                    baseLoadMoreModule2.getLoadMoreView().convert(holder, position, baseLoadMoreModule2.getLoadMoreStatus());
                }
                break;
            default:
                convert(holder, getItem(position - getHeaderLayoutCount()), payloads);
                break;
        }
    }

    public VH onCreateDefViewHolder(ViewGroup parent, int viewType) {
        parent.getClass();
        return (VH) createBaseViewHolder(parent, this.layoutResId);
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
    @Override // androidx.recyclerview.widget.RecyclerView.f
    public VH onCreateViewHolder(ViewGroup parent, int viewType) {
        parent.getClass();
        switch (viewType) {
            case HEADER_VIEW /* 268435729 */:
                LinearLayout linearLayout = this.mHeaderLayout;
                if (linearLayout == null) {
                    Intrinsics.n("mHeaderLayout");
                    throw null;
                }
                ViewParent parent2 = linearLayout.getParent();
                if (parent2 instanceof ViewGroup) {
                    ViewGroup viewGroup = (ViewGroup) parent2;
                    LinearLayout linearLayout2 = this.mHeaderLayout;
                    if (linearLayout2 == null) {
                        Intrinsics.n("mHeaderLayout");
                        throw null;
                    }
                    viewGroup.removeView(linearLayout2);
                }
                LinearLayout linearLayout3 = this.mHeaderLayout;
                if (linearLayout3 != null) {
                    return (VH) createBaseViewHolder(linearLayout3);
                }
                Intrinsics.n("mHeaderLayout");
                throw null;
            case LOAD_MORE_VIEW /* 268436002 */:
                BaseLoadMoreModule baseLoadMoreModule = this.mLoadMoreModule;
                baseLoadMoreModule.getClass();
                VH vh = (VH) createBaseViewHolder(baseLoadMoreModule.getLoadMoreView().getRootView(parent));
                BaseLoadMoreModule baseLoadMoreModule2 = this.mLoadMoreModule;
                baseLoadMoreModule2.getClass();
                baseLoadMoreModule2.setupViewHolder$com_github_CymChad_brvah(vh);
                return vh;
            case FOOTER_VIEW /* 268436275 */:
                LinearLayout linearLayout4 = this.mFooterLayout;
                if (linearLayout4 == null) {
                    Intrinsics.n("mFooterLayout");
                    throw null;
                }
                ViewParent parent3 = linearLayout4.getParent();
                if (parent3 instanceof ViewGroup) {
                    ViewGroup viewGroup2 = (ViewGroup) parent3;
                    LinearLayout linearLayout5 = this.mFooterLayout;
                    if (linearLayout5 == null) {
                        Intrinsics.n("mFooterLayout");
                        throw null;
                    }
                    viewGroup2.removeView(linearLayout5);
                }
                LinearLayout linearLayout6 = this.mFooterLayout;
                if (linearLayout6 != null) {
                    return (VH) createBaseViewHolder(linearLayout6);
                }
                Intrinsics.n("mFooterLayout");
                throw null;
            case EMPTY_VIEW /* 268436821 */:
                FrameLayout frameLayout = this.mEmptyLayout;
                if (frameLayout == null) {
                    Intrinsics.n("mEmptyLayout");
                    throw null;
                }
                ViewParent parent4 = frameLayout.getParent();
                if (parent4 instanceof ViewGroup) {
                    ViewGroup viewGroup3 = (ViewGroup) parent4;
                    FrameLayout frameLayout2 = this.mEmptyLayout;
                    if (frameLayout2 == null) {
                        Intrinsics.n("mEmptyLayout");
                        throw null;
                    }
                    viewGroup3.removeView(frameLayout2);
                }
                FrameLayout frameLayout3 = this.mEmptyLayout;
                if (frameLayout3 != null) {
                    return (VH) createBaseViewHolder(frameLayout3);
                }
                Intrinsics.n("mEmptyLayout");
                throw null;
            default:
                VH vh2 = (VH) onCreateDefViewHolder(parent, viewType);
                bindViewClickListener(vh2, viewType);
                BaseDraggableModule baseDraggableModule = this.mDraggableModule;
                if (baseDraggableModule != null) {
                    baseDraggableModule.initView$com_github_CymChad_brvah(vh2);
                }
                onItemViewHolderCreated(vh2, viewType);
                return vh2;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.f
    public void onDetachedFromRecyclerView(RecyclerView recyclerView) {
        recyclerView.getClass();
        super.onDetachedFromRecyclerView(recyclerView);
        this.recyclerViewOrNull = null;
    }

    public void onItemViewHolderCreated(VH viewHolder, int viewType) {
        viewHolder.getClass();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.f
    public void onViewAttachedToWindow(VH holder) {
        holder.getClass();
        super.onViewAttachedToWindow(holder);
        if (isFixedViewType(holder.getItemViewType())) {
            setFullSpan(holder);
        } else {
            addAnimation(holder);
        }
    }

    public void remove(T data) {
        int iIndexOf = this.data.indexOf(data);
        if (iIndexOf == -1) {
            return;
        }
        removeAt(iIndexOf);
    }

    public final void removeAllFooterView() {
        if (hasFooterLayout()) {
            LinearLayout linearLayout = this.mFooterLayout;
            if (linearLayout == null) {
                Intrinsics.n("mFooterLayout");
                throw null;
            }
            linearLayout.removeAllViews();
            int footerViewPosition = getFooterViewPosition();
            if (footerViewPosition != -1) {
                notifyItemRemoved(footerViewPosition);
            }
        }
    }

    public final void removeAllHeaderView() {
        if (hasHeaderLayout()) {
            LinearLayout linearLayout = this.mHeaderLayout;
            if (linearLayout == null) {
                Intrinsics.n("mHeaderLayout");
                throw null;
            }
            linearLayout.removeAllViews();
            int headerViewPosition = getHeaderViewPosition();
            if (headerViewPosition != -1) {
                notifyItemRemoved(headerViewPosition);
            }
        }
    }

    public void removeAt(int position) {
        if (position >= this.data.size()) {
            return;
        }
        this.data.remove(position);
        int headerLayoutCount = getHeaderLayoutCount() + position;
        notifyItemRemoved(headerLayoutCount);
        compatibilityDataSizeChanged(0);
        notifyItemRangeChanged(headerLayoutCount, this.data.size() - headerLayoutCount);
    }

    public final void removeEmptyView() {
        FrameLayout frameLayout = this.mEmptyLayout;
        if (frameLayout != null) {
            if (frameLayout != null) {
                frameLayout.removeAllViews();
            } else {
                Intrinsics.n("mEmptyLayout");
                throw null;
            }
        }
    }

    public final void removeFooterView(View footer) {
        int footerViewPosition;
        footer.getClass();
        if (hasFooterLayout()) {
            LinearLayout linearLayout = this.mFooterLayout;
            if (linearLayout == null) {
                Intrinsics.n("mFooterLayout");
                throw null;
            }
            linearLayout.removeView(footer);
            LinearLayout linearLayout2 = this.mFooterLayout;
            if (linearLayout2 == null) {
                Intrinsics.n("mFooterLayout");
                throw null;
            }
            if (linearLayout2.getChildCount() != 0 || (footerViewPosition = getFooterViewPosition()) == -1) {
                return;
            }
            notifyItemRemoved(footerViewPosition);
        }
    }

    public final void removeHeaderView(View header) {
        int headerViewPosition;
        header.getClass();
        if (hasHeaderLayout()) {
            LinearLayout linearLayout = this.mHeaderLayout;
            if (linearLayout == null) {
                Intrinsics.n("mHeaderLayout");
                throw null;
            }
            linearLayout.removeView(header);
            LinearLayout linearLayout2 = this.mHeaderLayout;
            if (linearLayout2 == null) {
                Intrinsics.n("mHeaderLayout");
                throw null;
            }
            if (linearLayout2.getChildCount() != 0 || (headerViewPosition = getHeaderViewPosition()) == -1) {
                return;
            }
            notifyItemRemoved(headerViewPosition);
        }
    }

    @fae
    public void replaceData(Collection<? extends T> newData) {
        newData.getClass();
        setList(newData);
    }

    public final void setAdapterAnimation(BaseAnimation baseAnimation) {
        this.animationEnable = true;
        this.adapterAnimation = baseAnimation;
    }

    public final void setAnimationEnable(boolean z) {
        this.animationEnable = z;
    }

    public final void setAnimationFirstOnly(boolean z) {
        this.isAnimationFirstOnly = z;
    }

    public final void setAnimationWithDefault(AnimationType animationType) {
        BaseAnimation alphaInAnimation;
        animationType.getClass();
        int i = WhenMappings.$EnumSwitchMapping$0[animationType.ordinal()];
        if (i == 1) {
            alphaInAnimation = new AlphaInAnimation(0.0f, 1, null);
        } else if (i == 2) {
            alphaInAnimation = new ScaleInAnimation(0.0f, 1, null);
        } else if (i == 3) {
            alphaInAnimation = new SlideInBottomAnimation();
        } else if (i == 4) {
            alphaInAnimation = new SlideInLeftAnimation();
        } else {
            if (i != 5) {
                uhc.a();
                return;
            }
            alphaInAnimation = new SlideInRightAnimation();
        }
        setAdapterAnimation(alphaInAnimation);
    }

    public void setData(int index, T data) {
        if (index >= this.data.size()) {
            return;
        }
        this.data.set(index, data);
        notifyItemChanged(getHeaderLayoutCount() + index);
    }

    public final void setData$com_github_CymChad_brvah(List<T> list) {
        list.getClass();
        this.data = list;
    }

    public final void setDiffCallback(n.e<T> diffCallback) {
        diffCallback.getClass();
        setDiffConfig(new BrvahAsyncDifferConfig.Builder(diffCallback).build());
    }

    public final void setDiffConfig(BrvahAsyncDifferConfig<T> config) {
        config.getClass();
        this.mDiffHelper = new BrvahAsyncDiffer<>(this, config);
    }

    public void setDiffNewData(n.d diffResult, List<T> list) {
        diffResult.getClass();
        list.getClass();
        if (hasEmptyView()) {
            setNewInstance(list);
        } else {
            diffResult.b(new BrvahListUpdateCallback(this));
            this.data = list;
        }
    }

    public final void setEmptyView(View emptyView) {
        boolean z;
        emptyView.getClass();
        int itemCount = getItemCount();
        if (this.mEmptyLayout == null) {
            FrameLayout frameLayout = new FrameLayout(emptyView.getContext());
            this.mEmptyLayout = frameLayout;
            ViewGroup.LayoutParams layoutParams = emptyView.getLayoutParams();
            frameLayout.setLayoutParams(layoutParams != null ? new ViewGroup.LayoutParams(layoutParams.width, layoutParams.height) : new ViewGroup.LayoutParams(-1, -1));
            z = true;
        } else {
            ViewGroup.LayoutParams layoutParams2 = emptyView.getLayoutParams();
            if (layoutParams2 != null) {
                FrameLayout frameLayout2 = this.mEmptyLayout;
                if (frameLayout2 == null) {
                    Intrinsics.n("mEmptyLayout");
                    throw null;
                }
                ViewGroup.LayoutParams layoutParams3 = frameLayout2.getLayoutParams();
                layoutParams3.width = layoutParams2.width;
                layoutParams3.height = layoutParams2.height;
                FrameLayout frameLayout3 = this.mEmptyLayout;
                if (frameLayout3 == null) {
                    Intrinsics.n("mEmptyLayout");
                    throw null;
                }
                frameLayout3.setLayoutParams(layoutParams3);
            }
            z = false;
        }
        FrameLayout frameLayout4 = this.mEmptyLayout;
        if (frameLayout4 == null) {
            Intrinsics.n("mEmptyLayout");
            throw null;
        }
        frameLayout4.removeAllViews();
        FrameLayout frameLayout5 = this.mEmptyLayout;
        if (frameLayout5 == null) {
            Intrinsics.n("mEmptyLayout");
            throw null;
        }
        frameLayout5.addView(emptyView);
        this.isUseEmpty = true;
        if (z && hasEmptyView()) {
            int i = (this.headerWithEmptyEnable && hasHeaderLayout()) ? 1 : 0;
            if (getItemCount() > itemCount) {
                notifyItemInserted(i);
            } else {
                notifyDataSetChanged();
            }
        }
    }

    public final int setFooterView(View view, int index, int orientation) {
        view.getClass();
        LinearLayout linearLayout = this.mFooterLayout;
        if (linearLayout != null) {
            if (linearLayout == null) {
                Intrinsics.n("mFooterLayout");
                throw null;
            }
            if (linearLayout.getChildCount() > index) {
                LinearLayout linearLayout2 = this.mFooterLayout;
                if (linearLayout2 == null) {
                    Intrinsics.n("mFooterLayout");
                    throw null;
                }
                linearLayout2.removeViewAt(index);
                LinearLayout linearLayout3 = this.mFooterLayout;
                if (linearLayout3 != null) {
                    linearLayout3.addView(view, index);
                    return index;
                }
                Intrinsics.n("mFooterLayout");
                throw null;
            }
        }
        return addFooterView(view, index, orientation);
    }

    public final void setFooterViewAsFlow(boolean z) {
        this.footerViewAsFlow = z;
    }

    public final void setFooterWithEmptyEnable(boolean z) {
        this.footerWithEmptyEnable = z;
    }

    public void setFullSpan(RecyclerView.d0 holder) {
        holder.getClass();
        ViewGroup.LayoutParams layoutParams = holder.itemView.getLayoutParams();
        if (layoutParams instanceof StaggeredGridLayoutManager.LayoutParams) {
            ((StaggeredGridLayoutManager.LayoutParams) layoutParams).f = true;
        }
    }

    public final void setGridSpanSizeLookup(GridSpanSizeLookup spanSizeLookup) {
        this.mSpanSizeLookup = spanSizeLookup;
    }

    public final int setHeaderView(View view, int index, int orientation) {
        view.getClass();
        LinearLayout linearLayout = this.mHeaderLayout;
        if (linearLayout != null) {
            if (linearLayout == null) {
                Intrinsics.n("mHeaderLayout");
                throw null;
            }
            if (linearLayout.getChildCount() > index) {
                LinearLayout linearLayout2 = this.mHeaderLayout;
                if (linearLayout2 == null) {
                    Intrinsics.n("mHeaderLayout");
                    throw null;
                }
                linearLayout2.removeViewAt(index);
                LinearLayout linearLayout3 = this.mHeaderLayout;
                if (linearLayout3 != null) {
                    linearLayout3.addView(view, index);
                    return index;
                }
                Intrinsics.n("mHeaderLayout");
                throw null;
            }
        }
        return addHeaderView(view, index, orientation);
    }

    public final void setHeaderViewAsFlow(boolean z) {
        this.headerViewAsFlow = z;
    }

    public final void setHeaderWithEmptyEnable(boolean z) {
        this.headerWithEmptyEnable = z;
    }

    public void setList(Collection<? extends T> list) {
        List<T> list2 = this.data;
        if (list != list2) {
            list2.clear();
            if (list != null && !list.isEmpty()) {
                this.data.addAll(list);
            }
        } else if (list == null || list.isEmpty()) {
            this.data.clear();
        } else {
            ArrayList arrayList = new ArrayList(list);
            this.data.clear();
            this.data.addAll(arrayList);
        }
        BaseLoadMoreModule baseLoadMoreModule = this.mLoadMoreModule;
        if (baseLoadMoreModule != null) {
            baseLoadMoreModule.reset$com_github_CymChad_brvah();
        }
        this.mLastPosition = -1;
        notifyDataSetChanged();
        BaseLoadMoreModule baseLoadMoreModule2 = this.mLoadMoreModule;
        if (baseLoadMoreModule2 != null) {
            baseLoadMoreModule2.checkDisableLoadMoreIfNotFullPage();
        }
    }

    public final void setMLoadMoreModule$com_github_CymChad_brvah(BaseLoadMoreModule baseLoadMoreModule) {
        this.mLoadMoreModule = baseLoadMoreModule;
    }

    @fae
    public void setNewData(List<T> data) {
        setNewInstance(data);
    }

    public void setNewInstance(List<T> list) {
        if (list == this.data) {
            return;
        }
        if (list == null) {
            list = new ArrayList<>();
        }
        this.data = list;
        BaseLoadMoreModule baseLoadMoreModule = this.mLoadMoreModule;
        if (baseLoadMoreModule != null) {
            baseLoadMoreModule.reset$com_github_CymChad_brvah();
        }
        this.mLastPosition = -1;
        notifyDataSetChanged();
        BaseLoadMoreModule baseLoadMoreModule2 = this.mLoadMoreModule;
        if (baseLoadMoreModule2 != null) {
            baseLoadMoreModule2.checkDisableLoadMoreIfNotFullPage();
        }
    }

    public void setOnItemChildClick(View v, int position) {
        v.getClass();
        OnItemChildClickListener onItemChildClickListener = this.mOnItemChildClickListener;
        if (onItemChildClickListener != null) {
            onItemChildClickListener.onItemChildClick(this, v, position);
        }
    }

    public final void setOnItemChildClickListener(OnItemChildClickListener listener) {
        this.mOnItemChildClickListener = listener;
    }

    public boolean setOnItemChildLongClick(View v, int position) {
        v.getClass();
        OnItemChildLongClickListener onItemChildLongClickListener = this.mOnItemChildLongClickListener;
        if (onItemChildLongClickListener != null) {
            return onItemChildLongClickListener.onItemChildLongClick(this, v, position);
        }
        return false;
    }

    public final void setOnItemChildLongClickListener(OnItemChildLongClickListener listener) {
        this.mOnItemChildLongClickListener = listener;
    }

    public void setOnItemClick(View v, int position) {
        v.getClass();
        OnItemClickListener onItemClickListener = this.mOnItemClickListener;
        if (onItemClickListener != null) {
            onItemClickListener.onItemClick(this, v, position);
        }
    }

    public final void setOnItemClickListener(OnItemClickListener listener) {
        this.mOnItemClickListener = listener;
    }

    public boolean setOnItemLongClick(View v, int position) {
        v.getClass();
        OnItemLongClickListener onItemLongClickListener = this.mOnItemLongClickListener;
        if (onItemLongClickListener != null) {
            return onItemLongClickListener.onItemLongClick(this, v, position);
        }
        return false;
    }

    public final void setOnItemLongClickListener(OnItemLongClickListener listener) {
        this.mOnItemLongClickListener = listener;
    }

    public final void setUseEmpty(boolean z) {
        this.isUseEmpty = z;
    }

    public void startAnim(Animator anim, int index) {
        anim.getClass();
        anim.start();
    }

    @fae
    public void remove(int position) {
        removeAt(position);
    }

    public void setDiffNewData(List<T> list, Runnable commitCallback) {
        if (hasEmptyView()) {
            setNewInstance(list);
            if (commitCallback != null) {
                commitCallback.run();
                return;
            }
            return;
        }
        BrvahAsyncDiffer<T> brvahAsyncDiffer = this.mDiffHelper;
        if (brvahAsyncDiffer != null) {
            brvahAsyncDiffer.submitList(list, commitCallback);
        }
    }

    public final void setDiffNewData(List<T> list) {
        setDiffNewData$default(this, list, null, 2, null);
    }

    public void addData(T data) {
        this.data.add(data);
        notifyItemInserted(getHeaderLayoutCount() + this.data.size());
        compatibilityDataSizeChanged(1);
    }

    public /* synthetic */ BaseQuickAdapter(int i, List list, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, (i2 & 2) != 0 ? null : list);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public BaseQuickAdapter(int i) {
        this(i, null, 2, 0 == true ? 1 : 0);
    }

    public VH createBaseViewHolder(ViewGroup parent, int layoutResId) {
        parent.getClass();
        return (VH) createBaseViewHolder(AdapterUtilsKt.getItemView(parent, layoutResId));
    }

    public void addData(int position, Collection<? extends T> newData) {
        newData.getClass();
        this.data.addAll(position, newData);
        notifyItemRangeInserted(getHeaderLayoutCount() + position, newData.size());
        compatibilityDataSizeChanged(newData.size());
    }

    public void addData(int position, T data) {
        this.data.add(position, data);
        notifyItemInserted(getHeaderLayoutCount() + position);
        compatibilityDataSizeChanged(1);
    }

    public final int setFooterView(View view, int i) {
        view.getClass();
        return setFooterView$default(this, view, i, 0, 4, null);
    }

    public final int setHeaderView(View view, int i) {
        view.getClass();
        return setHeaderView$default(this, view, i, 0, 4, null);
    }

    public final int setFooterView(View view) {
        view.getClass();
        return setFooterView$default(this, view, 0, 0, 6, null);
    }

    public final int setHeaderView(View view) {
        view.getClass();
        return setHeaderView$default(this, view, 0, 0, 6, null);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.f
    public /* bridge */ /* synthetic */ void onBindViewHolder(RecyclerView.d0 d0Var, int i, List list) {
        onBindViewHolder((BaseViewHolder) d0Var, i, (List<Object>) list);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.f
    public void onBindViewHolder(VH holder, int position) {
        holder.getClass();
        BaseUpFetchModule baseUpFetchModule = this.mUpFetchModule;
        if (baseUpFetchModule != null) {
            baseUpFetchModule.autoUpFetch$com_github_CymChad_brvah(position);
        }
        BaseLoadMoreModule baseLoadMoreModule = this.mLoadMoreModule;
        if (baseLoadMoreModule != null) {
            baseLoadMoreModule.autoLoadMore$com_github_CymChad_brvah(position);
        }
        switch (holder.getItemViewType()) {
            case HEADER_VIEW /* 268435729 */:
            case FOOTER_VIEW /* 268436275 */:
            case EMPTY_VIEW /* 268436821 */:
                break;
            case LOAD_MORE_VIEW /* 268436002 */:
                BaseLoadMoreModule baseLoadMoreModule2 = this.mLoadMoreModule;
                if (baseLoadMoreModule2 != null) {
                    baseLoadMoreModule2.getLoadMoreView().convert(holder, position, baseLoadMoreModule2.getLoadMoreStatus());
                }
                break;
            default:
                convert(holder, getItem(position - getHeaderLayoutCount()));
                break;
        }
    }

    public final int addFooterView(View view, int i) {
        view.getClass();
        return addFooterView$default(this, view, i, 0, 4, null);
    }

    public final int addHeaderView(View view, int i) {
        view.getClass();
        return addHeaderView$default(this, view, i, 0, 4, null);
    }

    public final int addFooterView(View view) {
        view.getClass();
        return addFooterView$default(this, view, 0, 0, 6, null);
    }

    public final int addHeaderView(View view) {
        view.getClass();
        return addHeaderView$default(this, view, 0, 0, 6, null);
    }

    public final void setEmptyView(int layoutResId) {
        RecyclerView recyclerView = this.recyclerViewOrNull;
        if (recyclerView != null) {
            View viewInflate = LayoutInflater.from(recyclerView.getContext()).inflate(layoutResId, (ViewGroup) recyclerView, false);
            viewInflate.getClass();
            setEmptyView(viewInflate);
        }
    }
}
