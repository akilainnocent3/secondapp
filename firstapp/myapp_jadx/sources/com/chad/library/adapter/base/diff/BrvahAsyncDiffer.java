package com.chad.library.adapter.base.diff;

import android.os.Handler;
import android.os.Looper;
import androidx.recyclerview.widget.n;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.diff.BrvahAsyncDiffer;
import com.sporty.android.core.model.tracking.AnalyticsParam;
import com.twilio.voice.EventKeys;
import defpackage.nis;
import defpackage.x01;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002:\u0001<B'\u0012\u0010\u0010\u0004\u001a\f\u0012\u0004\u0012\u00028\u0000\u0012\u0002\b\u00030\u0003\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005¢\u0006\u0004\b\u0007\u0010\bJ/\u0010\u0010\u001a\u00020\u000f2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\t2\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J'\u0010\u0014\u001a\u00020\u000f2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u00122\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u001d\u0010\u0019\u001a\u00020\u000f2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00028\u0000¢\u0006\u0004\b\u0019\u0010\u001aJ\u0015\u0010\u0019\u001a\u00020\u000f2\u0006\u0010\u0018\u001a\u00028\u0000¢\u0006\u0004\b\u0019\u0010\u001bJ\u001d\u0010\u001d\u001a\u00020\u000f2\u000e\u0010\u001c\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0012¢\u0006\u0004\b\u001d\u0010\u001eJ'\u0010!\u001a\u00020\u000f2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u001f\u001a\u00028\u00002\b\u0010 \u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b!\u0010\"J\u0015\u0010#\u001a\u00020\u000f2\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b#\u0010$J\u0015\u0010&\u001a\u00020\u000f2\u0006\u0010%\u001a\u00028\u0000¢\u0006\u0004\b&\u0010\u001bJ+\u0010'\u001a\u00020\u000f2\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\t2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0007¢\u0006\u0004\b'\u0010\u0015J\u001d\u0010*\u001a\u00020\u000f2\f\u0010)\u001a\b\u0012\u0004\u0012\u00028\u00000(H\u0016¢\u0006\u0004\b*\u0010+J\u001b\u0010,\u001a\u00020\u000f2\f\u0010)\u001a\b\u0012\u0004\u0012\u00028\u00000(¢\u0006\u0004\b,\u0010+J\r\u0010-\u001a\u00020\u000f¢\u0006\u0004\b-\u0010.R\u001e\u0010\u0004\u001a\f\u0012\u0004\u0012\u00028\u0000\u0012\u0002\b\u00030\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010/R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u00100R\u0014\u00102\u001a\u0002018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103R\u0016\u00105\u001a\u0002048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b5\u00106R\u0014\u00107\u001a\u0002048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00106R \u00108\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000(0\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00109R\u0016\u0010:\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b:\u0010;¨\u0006="}, d2 = {"Lcom/chad/library/adapter/base/diff/BrvahAsyncDiffer;", "T", "Lcom/chad/library/adapter/base/diff/DifferImp;", "Lcom/chad/library/adapter/base/BaseQuickAdapter;", "adapter", "Lcom/chad/library/adapter/base/diff/BrvahAsyncDifferConfig;", "config", "<init>", "(Lcom/chad/library/adapter/base/BaseQuickAdapter;Lcom/chad/library/adapter/base/diff/BrvahAsyncDifferConfig;)V", "", "newList", "Landroidx/recyclerview/widget/n$d;", "diffResult", "Ljava/lang/Runnable;", "commitCallback", "", "latchList", "(Ljava/util/List;Landroidx/recyclerview/widget/n$d;Ljava/lang/Runnable;)V", "", "previousList", "onCurrentListChanged", "(Ljava/util/List;Ljava/lang/Runnable;)V", "", "index", "data", "addData", "(ILjava/lang/Object;)V", "(Ljava/lang/Object;)V", AnalyticsParam.SOCIAL_NEWS_CARD_CLICK_SOURCE_NEWS, "addList", "(Ljava/util/List;)V", "newData", EventKeys.PAYLOAD, "changeData", "(ILjava/lang/Object;Ljava/lang/Object;)V", "removeAt", "(I)V", "t", "remove", "submitList", "Lcom/chad/library/adapter/base/diff/ListChangeListener;", "listener", "addListListener", "(Lcom/chad/library/adapter/base/diff/ListChangeListener;)V", "removeListListener", "clearAllListListener", "()V", "Lcom/chad/library/adapter/base/BaseQuickAdapter;", "Lcom/chad/library/adapter/base/diff/BrvahAsyncDifferConfig;", "Lnis;", "mUpdateCallback", "Lnis;", "Ljava/util/concurrent/Executor;", "mMainThreadExecutor", "Ljava/util/concurrent/Executor;", "sMainThreadExecutor", "mListeners", "Ljava/util/List;", "mMaxScheduledGeneration", "I", "MainThreadExecutor", "com.github.CymChad.brvah"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class BrvahAsyncDiffer<T> implements DifferImp<T> {
    private final BaseQuickAdapter<T, ?> adapter;
    private final BrvahAsyncDifferConfig<T> config;
    private final List<ListChangeListener<T>> mListeners;
    private Executor mMainThreadExecutor;
    private int mMaxScheduledGeneration;
    private final nis mUpdateCallback;
    private final Executor sMainThreadExecutor;

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0000¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000b"}, d2 = {"Lcom/chad/library/adapter/base/diff/BrvahAsyncDiffer$MainThreadExecutor;", "Ljava/util/concurrent/Executor;", "()V", "mHandler", "Landroid/os/Handler;", "getMHandler", "()Landroid/os/Handler;", "execute", "", "command", "Ljava/lang/Runnable;", "com.github.CymChad.brvah"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class MainThreadExecutor implements Executor {
        private final Handler mHandler = new Handler(Looper.getMainLooper());

        @Override // java.util.concurrent.Executor
        public void execute(Runnable command) {
            command.getClass();
            this.mHandler.post(command);
        }

        public final Handler getMHandler() {
            return this.mHandler;
        }
    }

    public BrvahAsyncDiffer(BaseQuickAdapter<T, ?> baseQuickAdapter, BrvahAsyncDifferConfig<T> brvahAsyncDifferConfig) {
        baseQuickAdapter.getClass();
        brvahAsyncDifferConfig.getClass();
        this.adapter = baseQuickAdapter;
        this.config = brvahAsyncDifferConfig;
        this.mUpdateCallback = new BrvahListUpdateCallback(baseQuickAdapter);
        Executor mainThreadExecutor = new MainThreadExecutor();
        this.sMainThreadExecutor = mainThreadExecutor;
        Executor mainThreadExecutor2 = brvahAsyncDifferConfig.getMainThreadExecutor();
        this.mMainThreadExecutor = mainThreadExecutor2 != null ? mainThreadExecutor2 : mainThreadExecutor;
        this.mListeners = new CopyOnWriteArrayList();
    }

    private final void latchList(List<T> newList, n.d diffResult, Runnable commitCallback) {
        List<? extends T> data = this.adapter.getData();
        this.adapter.setData$com_github_CymChad_brvah(newList);
        diffResult.b(this.mUpdateCallback);
        onCurrentListChanged(data, commitCallback);
    }

    private final void onCurrentListChanged(List<? extends T> previousList, Runnable commitCallback) {
        Iterator<ListChangeListener<T>> it = this.mListeners.iterator();
        while (it.hasNext()) {
            it.next().onCurrentListChanged(previousList, this.adapter.getData());
        }
        if (commitCallback != null) {
            commitCallback.run();
        }
    }

    public static /* synthetic */ void submitList$default(BrvahAsyncDiffer brvahAsyncDiffer, List list, Runnable runnable, int i, Object obj) {
        if ((i & 2) != 0) {
            runnable = null;
        }
        brvahAsyncDiffer.submitList(list, runnable);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void submitList$lambda$1(final BrvahAsyncDiffer brvahAsyncDiffer, final List list, final List list2, final int i, final Runnable runnable) {
        brvahAsyncDiffer.getClass();
        list.getClass();
        final n.d dVarA = n.a(new n.b() { // from class: com.chad.library.adapter.base.diff.BrvahAsyncDiffer$submitList$1$result$1
            @Override // androidx.recyclerview.widget.n.b
            public boolean areContentsTheSame(int oldItemPosition, int newItemPosition) {
                Object obj = list.get(oldItemPosition);
                Object obj2 = list2.get(newItemPosition);
                if (obj != null && obj2 != null) {
                    return ((BrvahAsyncDiffer) brvahAsyncDiffer).config.getDiffCallback().areContentsTheSame(obj, obj2);
                }
                if (obj == null && obj2 == null) {
                    return true;
                }
                x01.a();
                return false;
            }

            @Override // androidx.recyclerview.widget.n.b
            public boolean areItemsTheSame(int oldItemPosition, int newItemPosition) {
                Object obj = list.get(oldItemPosition);
                Object obj2 = list2.get(newItemPosition);
                if (obj == null || obj2 == null) {
                    return obj == null && obj2 == null;
                }
                return ((BrvahAsyncDiffer) brvahAsyncDiffer).config.getDiffCallback().areItemsTheSame(obj, obj2);
            }

            @Override // androidx.recyclerview.widget.n.b
            public Object getChangePayload(int oldItemPosition, int newItemPosition) {
                Object obj = list.get(oldItemPosition);
                Object obj2 = list2.get(newItemPosition);
                if (obj != null && obj2 != null) {
                    return ((BrvahAsyncDiffer) brvahAsyncDiffer).config.getDiffCallback().getChangePayload(obj, obj2);
                }
                x01.a();
                return null;
            }

            @Override // androidx.recyclerview.widget.n.b
            public int getNewListSize() {
                return list2.size();
            }

            @Override // androidx.recyclerview.widget.n.b
            public int getOldListSize() {
                return list.size();
            }
        }, true);
        brvahAsyncDiffer.mMainThreadExecutor.execute(new Runnable() { // from class: cb5
            @Override // java.lang.Runnable
            public final void run() {
                BrvahAsyncDiffer.submitList$lambda$1$lambda$0(this.a, i, list2, dVarA, runnable);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void submitList$lambda$1$lambda$0(BrvahAsyncDiffer brvahAsyncDiffer, int i, List list, n.d dVar, Runnable runnable) {
        brvahAsyncDiffer.getClass();
        dVar.getClass();
        if (brvahAsyncDiffer.mMaxScheduledGeneration == i) {
            brvahAsyncDiffer.latchList(list, dVar, runnable);
        }
    }

    public final void addData(T data) {
        List<? extends T> data2 = this.adapter.getData();
        this.adapter.getData().add(data);
        this.mUpdateCallback.onInserted(data2.size(), 1);
        onCurrentListChanged(data2, null);
    }

    public final void addList(List<? extends T> list) {
        if (list == null) {
            return;
        }
        List<? extends T> data = this.adapter.getData();
        this.adapter.getData().addAll(list);
        this.mUpdateCallback.onInserted(data.size(), list.size());
        onCurrentListChanged(data, null);
    }

    @Override // com.chad.library.adapter.base.diff.DifferImp
    public void addListListener(ListChangeListener<T> listener) {
        listener.getClass();
        this.mListeners.add(listener);
    }

    public final void changeData(int index, T newData, T payload) {
        List<? extends T> data = this.adapter.getData();
        this.adapter.getData().set(index, newData);
        this.mUpdateCallback.onChanged(index, 1, payload);
        onCurrentListChanged(data, null);
    }

    public final void clearAllListListener() {
        this.mListeners.clear();
    }

    public final void remove(T t) {
        List<? extends T> data = this.adapter.getData();
        int iIndexOf = this.adapter.getData().indexOf(t);
        if (iIndexOf == -1) {
            return;
        }
        this.adapter.getData().remove(iIndexOf);
        this.mUpdateCallback.onRemoved(iIndexOf, 1);
        onCurrentListChanged(data, null);
    }

    public final void removeAt(int index) {
        List<? extends T> data = this.adapter.getData();
        this.adapter.getData().remove(index);
        this.mUpdateCallback.onRemoved(index, 1);
        onCurrentListChanged(data, null);
    }

    public final void removeListListener(ListChangeListener<T> listener) {
        listener.getClass();
        this.mListeners.remove(listener);
    }

    public final void submitList(final List<T> newList, final Runnable commitCallback) {
        final int i = this.mMaxScheduledGeneration + 1;
        this.mMaxScheduledGeneration = i;
        if (newList == this.adapter.getData()) {
            if (commitCallback != null) {
                commitCallback.run();
                return;
            }
            return;
        }
        final List<? extends T> data = this.adapter.getData();
        BaseQuickAdapter<T, ?> baseQuickAdapter = this.adapter;
        if (newList == null) {
            int size = baseQuickAdapter.getData().size();
            this.adapter.setData$com_github_CymChad_brvah(new ArrayList());
            this.mUpdateCallback.onRemoved(0, size);
            onCurrentListChanged(data, commitCallback);
            return;
        }
        if (!baseQuickAdapter.getData().isEmpty()) {
            this.config.getBackgroundThreadExecutor().execute(new Runnable() { // from class: bb5
                @Override // java.lang.Runnable
                public final void run() {
                    BrvahAsyncDiffer.submitList$lambda$1(this.a, data, newList, i, commitCallback);
                }
            });
            return;
        }
        this.adapter.setData$com_github_CymChad_brvah(newList);
        this.mUpdateCallback.onInserted(0, newList.size());
        onCurrentListChanged(data, commitCallback);
    }

    public final void addData(int index, T data) {
        List<? extends T> data2 = this.adapter.getData();
        this.adapter.getData().add(index, data);
        this.mUpdateCallback.onInserted(index, 1);
        onCurrentListChanged(data2, null);
    }

    public final void submitList(List<T> list) {
        submitList$default(this, list, null, 2, null);
    }
}
