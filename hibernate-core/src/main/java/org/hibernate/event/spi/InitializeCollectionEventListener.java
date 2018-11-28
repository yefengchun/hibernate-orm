/*
 * Hibernate, Relational Persistence for Idiomatic Java
 *
 * License: GNU Lesser General Public License (LGPL), version 2.1 or later.
 * See the lgpl.txt file in the root directory or <http://www.gnu.org/licenses/lgpl-2.1.html>.
 */
package org.hibernate.event.spi;

import java.io.Serializable;

import org.hibernate.HibernateException;

/**
 * Defines the contract for handling of collection initialization events 
 * generated by a session.
 *
 * @author Gavin King
 */
public interface InitializeCollectionEventListener extends Serializable {
	void onInitializeCollection(InitializeCollectionEvent event) throws HibernateException;
}
