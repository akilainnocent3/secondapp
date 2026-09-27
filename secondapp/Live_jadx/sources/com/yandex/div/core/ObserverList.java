package com.yandex.div.core;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public class ObserverList<E> implements Iterable<E> {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private int mCount;
    private int mIterationDepth;
    private boolean mNeedsCompact;
    private final List<E> mObservers = new ArrayList();

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class ObserverListIterator implements RewindableIterator<E> {
        private int mIndex;
        private boolean mIsExhausted;
        private int mListEndMarker;

        private void compactListIfNeeded() {
            if (this.mIsExhausted) {
                return;
            }
            this.mIsExhausted = true;
            ObserverList.this.decrementIterationDepthAndCompactIfNeeded();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            int i10 = this.mIndex;
            while (i10 < this.mListEndMarker && ObserverList.this.getObserverAt(i10) == null) {
                i10++;
            }
            if (i10 < this.mListEndMarker) {
                return true;
            }
            compactListIfNeeded();
            return false;
        }

        @Override // java.util.Iterator
        public E next() {
            while (true) {
                int i10 = this.mIndex;
                if (i10 >= this.mListEndMarker || ObserverList.this.getObserverAt(i10) != null) {
                    break;
                }
                this.mIndex++;
            }
            int i11 = this.mIndex;
            if (i11 >= this.mListEndMarker) {
                compactListIfNeeded();
                throw new NoSuchElementException();
            }
            ObserverList observerList = ObserverList.this;
            this.mIndex = i11 + 1;
            return (E) observerList.getObserverAt(i11);
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }

        @Override // com.yandex.div.core.ObserverList.RewindableIterator
        public void rewind() {
            compactListIfNeeded();
            ObserverList.this.incrementIterationDepth();
            this.mListEndMarker = ObserverList.this.capacity();
            this.mIsExhausted = false;
            this.mIndex = 0;
        }

        private ObserverListIterator() {
            ObserverList.this.incrementIterationDepth();
            this.mListEndMarker = ObserverList.this.capacity();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class ObserverListReversedIterator implements RewindableIterator<E> {
        private int mIndex;
        private boolean mIsExhausted;

        private void compactListIfNeeded() {
            if (this.mIsExhausted) {
                return;
            }
            this.mIsExhausted = true;
            ObserverList.this.decrementIterationDepthAndCompactIfNeeded();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            int i10 = this.mIndex;
            while (i10 >= 0 && ObserverList.this.getObserverAt(i10) == null) {
                i10--;
            }
            if (i10 >= 0) {
                return true;
            }
            compactListIfNeeded();
            return false;
        }

        @Override // java.util.Iterator
        public E next() {
            while (true) {
                int i10 = this.mIndex;
                if (i10 < 0 || ObserverList.this.getObserverAt(i10) != null) {
                    break;
                }
                this.mIndex--;
            }
            int i11 = this.mIndex;
            if (i11 < 0) {
                compactListIfNeeded();
                throw new NoSuchElementException();
            }
            ObserverList observerList = ObserverList.this;
            this.mIndex = i11 - 1;
            return (E) observerList.getObserverAt(i11);
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }

        @Override // com.yandex.div.core.ObserverList.RewindableIterator
        public void rewind() {
            compactListIfNeeded();
            ObserverList.this.incrementIterationDepth();
            this.mIsExhausted = false;
            this.mIndex = ObserverList.this.capacity() - 1;
        }

        private ObserverListReversedIterator() {
            ObserverList.this.incrementIterationDepth();
            this.mIndex = ObserverList.this.capacity() - 1;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public interface RewindableIterator<E> extends Iterator<E> {
        void rewind();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int capacity() {
        return this.mObservers.size();
    }

    private void compact() {
        for (int size = this.mObservers.size() - 1; size >= 0; size--) {
            if (this.mObservers.get(size) == null) {
                this.mObservers.remove(size);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void decrementIterationDepthAndCompactIfNeeded() {
        int i10 = this.mIterationDepth - 1;
        this.mIterationDepth = i10;
        if (i10 <= 0 && this.mNeedsCompact) {
            this.mNeedsCompact = false;
            compact();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public E getObserverAt(int i10) {
        return this.mObservers.get(i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void incrementIterationDepth() {
        this.mIterationDepth++;
    }

    public boolean addObserver(E e10) {
        if (e10 == null || this.mObservers.contains(e10)) {
            return false;
        }
        this.mObservers.add(e10);
        this.mCount++;
        return true;
    }

    public void clear() {
        this.mCount = 0;
        if (this.mIterationDepth == 0) {
            this.mObservers.clear();
            return;
        }
        int size = this.mObservers.size();
        this.mNeedsCompact |= size != 0;
        for (int i10 = 0; i10 < size; i10++) {
            this.mObservers.set(i10, null);
        }
    }

    public boolean hasObserver(E e10) {
        return this.mObservers.contains(e10);
    }

    public boolean isEmpty() {
        return this.mCount == 0;
    }

    @Override // java.lang.Iterable
    public Iterator<E> iterator() {
        return new ObserverListIterator();
    }

    public boolean removeObserver(E e10) {
        int iIndexOf;
        if (e10 == null || (iIndexOf = this.mObservers.indexOf(e10)) == -1) {
            return false;
        }
        if (this.mIterationDepth == 0) {
            this.mObservers.remove(iIndexOf);
        } else {
            this.mNeedsCompact = true;
            this.mObservers.set(iIndexOf, null);
        }
        this.mCount--;
        return true;
    }

    public RewindableIterator<E> reverseIterator() {
        return new ObserverListReversedIterator();
    }

    public RewindableIterator<E> rewindableIterator() {
        return new ObserverListIterator();
    }

    public int size() {
        return this.mCount;
    }
}
